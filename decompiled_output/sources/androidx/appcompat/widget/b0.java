package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.appcompat.widget.ActivityChooserView;
import b.a.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class b0 {
    private static final String l = "ACTVAutoSizeHelper";
    private static final int n = 12;
    private static final int o = 112;
    private static final int p = 1;
    static final float s = -1.0f;
    private static final int t = 1048576;

    /* renamed from: a, reason: collision with root package name */
    private int f126a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f127b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f128c = s;
    private float d = s;
    private float e = s;
    private int[] f = new int[0];
    private boolean g = false;
    private TextPaint h;

    @androidx.annotation.h0
    private final TextView i;
    private final Context j;
    private final c k;
    private static final RectF m = new RectF();
    private static ConcurrentHashMap<String, Method> q = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Field> r = new ConcurrentHashMap<>();

    @androidx.annotation.m0(23)
    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.b0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) b0.r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @androidx.annotation.m0(29)
    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.b0.a, androidx.appcompat.widget.b0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.b0.c
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class c {
        c() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean b(TextView textView) {
            return ((Boolean) b0.r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    b0(@androidx.annotation.h0 TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
        int r3 = Build.VERSION.SDK_INT;
        this.k = r3 >= 29 ? new b() : r3 >= 23 ? new a() : new c();
    }

    private void A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] r1 = new int[length];
        if (length > 0) {
            for (int r2 = 0; r2 < length; r2++) {
                r1[r2] = typedArray.getDimensionPixelSize(r2, -1);
            }
            this.f = c(r1);
            B();
        }
    }

    private boolean B() {
        boolean z = this.f.length > 0;
        this.g = z;
        if (z) {
            this.f126a = 1;
            int[] r3 = this.f;
            this.d = r3[0];
            this.e = r3[r0 - 1];
            this.f128c = s;
        }
        return this.g;
    }

    private boolean C(int r6, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.i.getText();
        TransformationMethod transformationMethod = this.i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.i)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.i.getMaxLines() : -1;
        q(r6);
        StaticLayout staticLayoutE = e(text, (Layout.Alignment) r(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutE.getLineCount() <= maxLines && staticLayoutE.getLineEnd(staticLayoutE.getLineCount() - 1) == text.length())) && ((float) staticLayoutE.getHeight()) <= rectF.bottom;
    }

    private boolean D() {
        return !(this.i instanceof l);
    }

    private void E(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f126a = 1;
        this.d = f;
        this.e = f2;
        this.f128c = f3;
        this.g = false;
    }

    private static <T> T a(@androidx.annotation.h0 Object obj, @androidx.annotation.h0 String str, @androidx.annotation.h0 T t2) {
        try {
            Field fieldO = o(str);
            return fieldO == null ? t2 : (T) fieldO.get(obj);
        } catch (IllegalAccessException e) {
            Log.w(l, "Failed to access TextView#" + str + " member", e);
            return t2;
        }
    }

    private int[] c(int[] r7) {
        int length = r7.length;
        if (length == 0) {
            return r7;
        }
        Arrays.sort(r7);
        ArrayList arrayList = new ArrayList();
        for (int r4 : r7) {
            if (r4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(r4)) < 0) {
                arrayList.add(Integer.valueOf(r4));
            }
        }
        if (length == arrayList.size()) {
            return r7;
        }
        int size = arrayList.size();
        int[] r0 = new int[size];
        for (int r2 = 0; r2 < size; r2++) {
            r0[r2] = ((Integer) arrayList.get(r2)).intValue();
        }
        return r0;
    }

    private void d() {
        this.f126a = 0;
        this.d = s;
        this.e = s;
        this.f128c = s;
        this.f = new int[0];
        this.f127b = false;
    }

    @androidx.annotation.m0(23)
    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int r6, int r7) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.h, r6);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
        if (r7 == -1) {
            r7 = ActivityChooserView.f.j;
        }
        hyphenationFrequency.setMaxLines(r7);
        try {
            this.k.a(builderObtain, this.i);
        } catch (ClassCastException unused) {
            Log.w(l, "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }

    private StaticLayout g(CharSequence charSequence, Layout.Alignment alignment, int r12) {
        return new StaticLayout(charSequence, this.h, r12, alignment, ((Float) a(this.i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    @androidx.annotation.m0(16)
    private StaticLayout h(CharSequence charSequence, Layout.Alignment alignment, int r12) {
        return new StaticLayout(charSequence, this.h, r12, alignment, this.i.getLineSpacingMultiplier(), this.i.getLineSpacingExtra(), this.i.getIncludeFontPadding());
    }

    private int i(RectF rectF) {
        int length = this.f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int r0 = length - 1;
        int r1 = 1;
        int r2 = 0;
        while (r1 <= r0) {
            int r22 = (r1 + r0) / 2;
            if (C(this.f[r22], rectF)) {
                int r23 = r22 + 1;
                r2 = r1;
                r1 = r23;
            } else {
                r2 = r22 - 1;
                r0 = r2;
            }
        }
        return this.f[r2];
    }

    @androidx.annotation.i0
    private static Field o(@androidx.annotation.h0 String str) {
        try {
            Field declaredField = r.get(str);
            if (declaredField == null && (declaredField = TextView.class.getDeclaredField(str)) != null) {
                declaredField.setAccessible(true);
                r.put(str, declaredField);
            }
            return declaredField;
        } catch (NoSuchFieldException e) {
            Log.w(l, "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    @androidx.annotation.i0
    private static Method p(@androidx.annotation.h0 String str) {
        try {
            Method declaredMethod = q.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                q.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            Log.w(l, "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    static <T> T r(@androidx.annotation.h0 Object obj, @androidx.annotation.h0 String str, @androidx.annotation.h0 T t2) {
        try {
            return (T) p(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w(l, "Failed to invoke TextView#" + str + "() method", e);
            return t2;
        }
    }

    private void x(float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(f);
            boolean zIsInLayout = Build.VERSION.SDK_INT >= 18 ? this.i.isInLayout() : false;
            if (this.i.getLayout() != null) {
                this.f127b = false;
                try {
                    Method methodP = p("nullLayouts");
                    if (methodP != null) {
                        methodP.invoke(this.i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w(l, "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    this.i.forceLayout();
                } else {
                    this.i.requestLayout();
                }
                this.i.invalidate();
            }
        }
    }

    private boolean z() {
        if (D() && this.f126a == 1) {
            if (!this.g || this.f.length == 0) {
                int r0 = ((int) Math.floor((this.e - this.d) / this.f128c)) + 1;
                int[] r3 = new int[r0];
                for (int r1 = 0; r1 < r0; r1++) {
                    r3[r1] = Math.round(this.d + (r1 * this.f128c));
                }
                this.f = c(r3);
            }
            this.f127b = true;
        } else {
            this.f127b = false;
        }
        return this.f127b;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    void b() {
        if (s()) {
            if (this.f127b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.k.b(this.i) ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                synchronized (m) {
                    m.setEmpty();
                    m.right = measuredWidth;
                    m.bottom = height;
                    float fI = i(m);
                    if (fI != this.i.getTextSize()) {
                        y(0, fI);
                    }
                }
            }
            this.f127b = true;
        }
    }

    @androidx.annotation.x0
    StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int r5, int r6) {
        int r0 = Build.VERSION.SDK_INT;
        return r0 >= 23 ? f(charSequence, alignment, r5, r6) : r0 >= 16 ? h(charSequence, alignment, r5) : g(charSequence, alignment, r5);
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    int j() {
        return Math.round(this.e);
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    int k() {
        return Math.round(this.d);
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    int l() {
        return Math.round(this.f128c);
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    int[] m() {
        return this.f;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    int n() {
        return this.f126a;
    }

    @androidx.annotation.x0
    void q(int r3) {
        TextPaint textPaint = this.h;
        if (textPaint == null) {
            this.h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.h.set(this.i.getPaint());
        this.h.setTextSize(r3);
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    boolean s() {
        return D() && this.f126a != 0;
    }

    void t(@androidx.annotation.i0 AttributeSet attributeSet, int r12) throws Resources.NotFoundException, IllegalArgumentException {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.j.obtainStyledAttributes(attributeSet, a.m.AppCompatTextView, r12, 0);
        TextView textView = this.i;
        b.i.p.f0.s1(textView, textView.getContext(), a.m.AppCompatTextView, attributeSet, typedArrayObtainStyledAttributes, r12, 0);
        if (typedArrayObtainStyledAttributes.hasValue(a.m.AppCompatTextView_autoSizeTextType)) {
            this.f126a = typedArrayObtainStyledAttributes.getInt(a.m.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(a.m.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes.getDimension(a.m.AppCompatTextView_autoSizeStepGranularity, s) : s;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(a.m.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes.getDimension(a.m.AppCompatTextView_autoSizeMinTextSize, s) : s;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(a.m.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes.getDimension(a.m.AppCompatTextView_autoSizeMaxTextSize, s) : s;
        if (typedArrayObtainStyledAttributes.hasValue(a.m.AppCompatTextView_autoSizePresetSizes) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(a.m.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            A(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!D()) {
            this.f126a = 0;
            return;
        }
        if (this.f126a == 1) {
            if (!this.g) {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                if (dimension2 == s) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == s) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == s) {
                    dimension = 1.0f;
                }
                E(dimension2, dimension3, dimension);
            }
            z();
        }
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    void u(int r2, int r3, int r4, int r5) throws IllegalArgumentException {
        if (D()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(r5, r2, displayMetrics), TypedValue.applyDimension(r5, r3, displayMetrics), TypedValue.applyDimension(r5, r4, displayMetrics));
            if (z()) {
                b();
            }
        }
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    void v(@androidx.annotation.h0 int[] r6, int r7) throws IllegalArgumentException {
        if (D()) {
            int length = r6.length;
            if (length > 0) {
                int[] r2 = new int[length];
                if (r7 == 0) {
                    r2 = Arrays.copyOf(r6, length);
                } else {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    for (int r1 = 0; r1 < length; r1++) {
                        r2[r1] = Math.round(TypedValue.applyDimension(r7, r6[r1], displayMetrics));
                    }
                }
                this.f = c(r2);
                if (!B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(r6));
                }
            } else {
                this.g = false;
            }
            if (z()) {
                b();
            }
        }
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    void w(int r4) throws IllegalArgumentException {
        if (D()) {
            if (r4 == 0) {
                d();
                return;
            }
            if (r4 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + r4);
            }
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (z()) {
                b();
            }
        }
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    void y(int r2, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.j;
        x(TypedValue.applyDimension(r2, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
