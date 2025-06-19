package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.t0;
import androidx.annotation.z;
import b.i.n.d;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final String f410a = "TextViewCompat";

    /* renamed from: b, reason: collision with root package name */
    public static final int f411b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f412c = 1;
    private static Field d = null;
    private static boolean e = false;
    private static Field f = null;
    private static boolean g = false;
    private static Field h = null;
    private static boolean i = false;
    private static Field j = null;
    private static boolean k = false;
    private static final int l = 1;

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    @m0(26)
    private static class b implements ActionMode.Callback {
        private static final int g = 100;

        /* renamed from: a, reason: collision with root package name */
        private final ActionMode.Callback f413a;

        /* renamed from: b, reason: collision with root package name */
        private final TextView f414b;

        /* renamed from: c, reason: collision with root package name */
        private Class<?> f415c;
        private Method d;
        private boolean e;
        private boolean f = false;

        b(ActionMode.Callback callback, TextView textView) {
            this.f413a = callback;
            this.f414b = textView;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                if (e(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        private boolean d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean e(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        private void f(Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            Context context = this.f414b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f) {
                this.f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f415c = cls;
                    this.d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f415c = null;
                    this.d = null;
                    this.e = false;
                }
            }
            try {
                Method declaredMethod = (this.e && this.f415c.isInstance(menu)) ? this.d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> listC = c(context, packageManager);
                for (int r2 = 0; r2 < listC.size(); r2++) {
                    ResolveInfo resolveInfo = listC.get(r2);
                    menu.add(0, 0, r2 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f414b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f413a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f413a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f413a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            f(menu);
            return this.f413a.onPrepareActionMode(actionMode, menu);
        }
    }

    private m() {
    }

    public static void A(@h0 TextView textView, @k0 @z(from = FabTransformationScrimBehavior.j) int r4) {
        b.i.o.i.d(r4);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(r4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int r0 = (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (r4 > Math.abs(r0)) {
            textView.setPadding(textView.getPaddingLeft(), r4 + r0, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void B(@h0 TextView textView, @k0 @z(from = FabTransformationScrimBehavior.j) int r4) {
        b.i.o.i.d(r4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int r0 = (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (r4 > Math.abs(r0)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), r4 - r0);
        }
    }

    public static void C(@h0 TextView textView, @k0 @z(from = FabTransformationScrimBehavior.j) int r3) {
        b.i.o.i.d(r3);
        if (r3 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(r3 - r0, 1.0f);
        }
    }

    public static void D(@h0 TextView textView, @h0 b.i.n.d dVar) {
        PrecomputedText precomputedTextF;
        if (Build.VERSION.SDK_INT >= 29) {
            precomputedTextF = dVar.f();
        } else {
            boolean zA = o(textView).a(dVar.e());
            precomputedTextF = dVar;
            if (!zA) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
        }
        textView.setText(precomputedTextF);
    }

    public static void E(@h0 TextView textView, @t0 int r3) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(r3);
        } else {
            textView.setTextAppearance(textView.getContext(), r3);
        }
    }

    public static void F(@h0 TextView textView, @h0 d.a aVar) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setTextDirection(m(aVar.d()));
        }
        if (Build.VERSION.SDK_INT >= 23) {
            textView.getPaint().set(aVar.e());
            textView.setBreakStrategy(aVar.b());
            textView.setHyphenationFrequency(aVar.c());
        } else {
            float textScaleX = aVar.e().getTextScaleX();
            textView.getPaint().set(aVar.e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
        }
    }

    @h0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback G(@h0 TextView textView, @h0 ActionMode.Callback callback) {
        int r0 = Build.VERSION.SDK_INT;
        return (r0 < 26 || r0 > 27 || (callback instanceof b)) ? callback : new b(callback, textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(@h0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMaxTextSize();
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(@h0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMinTextSize();
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(@h0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeStepGranularity();
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @h0
    public static int[] d(@h0 TextView textView) {
        return Build.VERSION.SDK_INT >= 27 ? textView.getAutoSizeTextAvailableSizes() : textView instanceof androidx.core.widget.b ? ((androidx.core.widget.b) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int e(@h0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeTextType();
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeTextType();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i0
    public static ColorStateList f(@h0 TextView textView) {
        b.i.o.i.f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return textView.getCompoundDrawableTintList();
        }
        if (textView instanceof o) {
            return ((o) textView).getSupportCompoundDrawablesTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i0
    public static PorterDuff.Mode g(@h0 TextView textView) {
        b.i.o.i.f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return textView.getCompoundDrawableTintMode();
        }
        if (textView instanceof o) {
            return ((o) textView).getSupportCompoundDrawablesTintMode();
        }
        return null;
    }

    @h0
    public static Drawable[] h(@h0 TextView textView) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (r0 < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = textView.getLayoutDirection() == 1;
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    public static int i(@h0 TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int j(@h0 TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int k(@h0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!g) {
            f = p("mMaxMode");
            g = true;
        }
        Field field = f;
        if (field == null || q(field, textView) != 1) {
            return -1;
        }
        if (!e) {
            d = p("mMaximum");
            e = true;
        }
        Field field2 = d;
        if (field2 != null) {
            return q(field2, textView);
        }
        return -1;
    }

    public static int l(@h0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMinLines();
        }
        if (!k) {
            j = p("mMinMode");
            k = true;
        }
        Field field = j;
        if (field == null || q(field, textView) != 1) {
            return -1;
        }
        if (!i) {
            h = p("mMinimum");
            i = true;
        }
        Field field2 = h;
        if (field2 != null) {
            return q(field2, textView);
        }
        return -1;
    }

    @m0(18)
    private static int m(@h0 TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    @m0(18)
    private static TextDirectionHeuristic n(@h0 TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z) {
                    break;
                } else {
                    break;
                }
        }
        return TextDirectionHeuristics.LTR;
    }

    @h0
    public static d.a o(@h0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new d.a(textView.getTextMetricsParams());
        }
        d.a.C0066a c0066a = new d.a.C0066a(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            c0066a.b(textView.getBreakStrategy());
            c0066a.c(textView.getHyphenationFrequency());
        }
        if (Build.VERSION.SDK_INT >= 18) {
            c0066a.d(n(textView));
        }
        return c0066a.a();
    }

    private static Field p(String str) throws NoSuchFieldException {
        Field declaredField = null;
        try {
            declaredField = TextView.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            Log.e(f410a, "Could not retrieve " + str + " field.");
            return declaredField;
        }
    }

    private static int q(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            Log.d(f410a, "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(@h0 TextView textView, int r3, int r4, int r5, int r6) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(r3, r4, r5, r6);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithConfiguration(r3, r4, r5, r6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(@h0 TextView textView, @h0 int[] r3, int r4) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(r3, r4);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithPresetSizes(r3, r4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(@h0 TextView textView, int r3) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(r3);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeWithDefaults(r3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(@h0 TextView textView, @i0 ColorStateList colorStateList) {
        b.i.o.i.f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof o) {
            ((o) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(@h0 TextView textView, @i0 PorterDuff.Mode mode) {
        b.i.o.i.f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof o) {
            ((o) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void w(@h0 TextView textView, @i0 Drawable drawable, @i0 Drawable drawable2, @i0 Drawable drawable3, @i0 Drawable drawable4) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        if (r0 < 17) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        boolean z = textView.getLayoutDirection() == 1;
        Drawable drawable5 = z ? drawable3 : drawable;
        if (!z) {
            drawable = drawable3;
        }
        textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
    }

    public static void x(@h0 TextView textView, @q int r3, @q int r4, @q int r5, @q int r6) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 18) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r4, r5, r6);
            return;
        }
        if (r0 < 17) {
            textView.setCompoundDrawablesWithIntrinsicBounds(r3, r4, r5, r6);
            return;
        }
        boolean z = textView.getLayoutDirection() == 1;
        int r02 = z ? r5 : r3;
        if (!z) {
            r3 = r5;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(r02, r4, r3, r6);
    }

    public static void y(@h0 TextView textView, @i0 Drawable drawable, @i0 Drawable drawable2, @i0 Drawable drawable3, @i0 Drawable drawable4) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 18) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        if (r0 < 17) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        boolean z = textView.getLayoutDirection() == 1;
        Drawable drawable5 = z ? drawable3 : drawable;
        if (!z) {
            drawable = drawable3;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable5, drawable2, drawable, drawable4);
    }

    public static void z(@h0 TextView textView, @h0 ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(G(textView, callback));
    }
}
