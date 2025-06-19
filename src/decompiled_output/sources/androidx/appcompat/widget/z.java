package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.p0;
import b.a.a;
import b.i.c.j.g;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* loaded from: classes.dex */
class z {
    private static final int n = -1;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 3;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.h0
    private final TextView f212a;

    /* renamed from: b, reason: collision with root package name */
    private y0 f213b;

    /* renamed from: c, reason: collision with root package name */
    private y0 f214c;
    private y0 d;
    private y0 e;
    private y0 f;
    private y0 g;
    private y0 h;

    @androidx.annotation.h0
    private final b0 i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    class a extends g.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f215a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f216b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f217c;

        a(int r2, int r3, WeakReference weakReference) {
            this.f215a = r2;
            this.f216b = r3;
            this.f217c = weakReference;
        }

        @Override // b.i.c.j.g.a
        public void c(int r1) {
        }

        @Override // b.i.c.j.g.a
        public void d(@androidx.annotation.h0 Typeface typeface) {
            int r0;
            if (Build.VERSION.SDK_INT >= 28 && (r0 = this.f215a) != -1) {
                typeface = Typeface.create(typeface, r0, (this.f216b & 2) != 0);
            }
            z.this.n(this.f217c, typeface);
        }
    }

    z(@androidx.annotation.h0 TextView textView) {
        this.f212a = textView;
        this.i = new b0(this.f212a);
    }

    private void A(int r2, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.i.y(r2, f);
    }

    private void B(Context context, a1 a1Var) {
        String strW;
        Typeface typefaceCreate;
        Typeface typeface;
        this.j = a1Var.o(a.m.TextAppearance_android_textStyle, this.j);
        if (Build.VERSION.SDK_INT >= 28) {
            int r0 = a1Var.o(a.m.TextAppearance_android_textFontWeight, -1);
            this.k = r0;
            if (r0 != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (!a1Var.C(a.m.TextAppearance_android_fontFamily) && !a1Var.C(a.m.TextAppearance_fontFamily)) {
            if (a1Var.C(a.m.TextAppearance_android_typeface)) {
                this.m = false;
                int r10 = a1Var.o(a.m.TextAppearance_android_typeface, 1);
                if (r10 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (r10 == 2) {
                    typeface = Typeface.SERIF;
                } else if (r10 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.l = typeface;
                return;
            }
            return;
        }
        this.l = null;
        int r02 = a1Var.C(a.m.TextAppearance_fontFamily) ? a.m.TextAppearance_fontFamily : a.m.TextAppearance_android_fontFamily;
        int r6 = this.k;
        int r7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceK = a1Var.k(r02, this.j, new a(r6, r7, new WeakReference(this.f212a)));
                if (typefaceK != null) {
                    if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                        typefaceK = Typeface.create(Typeface.create(typefaceK, 0), this.k, (this.j & 2) != 0);
                    }
                    this.l = typefaceK;
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (strW = a1Var.w(r02)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            typefaceCreate = Typeface.create(strW, this.j);
        } else {
            typefaceCreate = Typeface.create(Typeface.create(strW, 0), this.k, (this.j & 2) != 0);
        }
        this.l = typefaceCreate;
    }

    private void a(Drawable drawable, y0 y0Var) {
        if (drawable == null || y0Var == null) {
            return;
        }
        k.j(drawable, y0Var, this.f212a.getDrawableState());
    }

    private static y0 d(Context context, k kVar, int r2) {
        ColorStateList colorStateListF = kVar.f(context, r2);
        if (colorStateListF == null) {
            return null;
        }
        y0 y0Var = new y0();
        y0Var.d = true;
        y0Var.f209a = colorStateListF;
        return y0Var;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f212a.getCompoundDrawablesRelative();
            TextView textView = this.f212a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Drawable[] compoundDrawablesRelative2 = this.f212a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                TextView textView2 = this.f212a;
                Drawable drawable7 = compoundDrawablesRelative2[0];
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable8 = compoundDrawablesRelative2[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                return;
            }
        }
        Drawable[] compoundDrawables = this.f212a.getCompoundDrawables();
        TextView textView3 = this.f212a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void y() {
        y0 y0Var = this.h;
        this.f213b = y0Var;
        this.f214c = y0Var;
        this.d = y0Var;
        this.e = y0Var;
        this.f = y0Var;
        this.g = y0Var;
    }

    void b() {
        if (this.f213b != null || this.f214c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.f212a.getCompoundDrawables();
            a(compoundDrawables[0], this.f213b);
            a(compoundDrawables[1], this.f214c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f == null && this.g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f212a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    void c() {
        this.i.b();
    }

    int e() {
        return this.i.j();
    }

    int f() {
        return this.i.k();
    }

    int g() {
        return this.i.l();
    }

    int[] h() {
        return this.i.m();
    }

    int i() {
        return this.i.n();
    }

    @androidx.annotation.i0
    ColorStateList j() {
        y0 y0Var = this.h;
        if (y0Var != null) {
            return y0Var.f209a;
        }
        return null;
    }

    @androidx.annotation.i0
    PorterDuff.Mode k() {
        y0 y0Var = this.h;
        if (y0Var != null) {
            return y0Var.f210b;
        }
        return null;
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    boolean l() {
        return this.i.s();
    }

    @SuppressLint({"NewApi"})
    void m(@androidx.annotation.i0 AttributeSet attributeSet, int r19) throws Resources.NotFoundException, IllegalArgumentException {
        ColorStateList colorStateListD;
        String strW;
        boolean zA;
        boolean z;
        ColorStateList colorStateListD2;
        String strW2;
        ColorStateList colorStateListD3;
        boolean z2;
        int r1;
        Context context = this.f212a.getContext();
        k kVarB = k.b();
        a1 a1VarG = a1.G(context, attributeSet, a.m.AppCompatTextHelper, r19, 0);
        TextView textView = this.f212a;
        b.i.p.f0.s1(textView, textView.getContext(), a.m.AppCompatTextHelper, attributeSet, a1VarG.B(), r19, 0);
        int r0 = a1VarG.u(a.m.AppCompatTextHelper_android_textAppearance, -1);
        if (a1VarG.C(a.m.AppCompatTextHelper_android_drawableLeft)) {
            this.f213b = d(context, kVarB, a1VarG.u(a.m.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a1VarG.C(a.m.AppCompatTextHelper_android_drawableTop)) {
            this.f214c = d(context, kVarB, a1VarG.u(a.m.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a1VarG.C(a.m.AppCompatTextHelper_android_drawableRight)) {
            this.d = d(context, kVarB, a1VarG.u(a.m.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a1VarG.C(a.m.AppCompatTextHelper_android_drawableBottom)) {
            this.e = d(context, kVarB, a1VarG.u(a.m.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (a1VarG.C(a.m.AppCompatTextHelper_android_drawableStart)) {
                this.f = d(context, kVarB, a1VarG.u(a.m.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a1VarG.C(a.m.AppCompatTextHelper_android_drawableEnd)) {
                this.g = d(context, kVarB, a1VarG.u(a.m.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a1VarG.I();
        boolean z3 = this.f212a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (r0 != -1) {
            a1 a1VarE = a1.E(context, r0, a.m.TextAppearance);
            if (z3 || !a1VarE.C(a.m.TextAppearance_textAllCaps)) {
                zA = false;
                z = false;
            } else {
                zA = a1VarE.a(a.m.TextAppearance_textAllCaps, false);
                z = true;
            }
            B(context, a1VarE);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateListD3 = a1VarE.C(a.m.TextAppearance_android_textColor) ? a1VarE.d(a.m.TextAppearance_android_textColor) : null;
                colorStateListD = a1VarE.C(a.m.TextAppearance_android_textColorHint) ? a1VarE.d(a.m.TextAppearance_android_textColorHint) : null;
                colorStateListD2 = a1VarE.C(a.m.TextAppearance_android_textColorLink) ? a1VarE.d(a.m.TextAppearance_android_textColorLink) : null;
            } else {
                colorStateListD = null;
                colorStateListD2 = null;
                colorStateListD3 = null;
            }
            strW2 = a1VarE.C(a.m.TextAppearance_textLocale) ? a1VarE.w(a.m.TextAppearance_textLocale) : null;
            strW = (Build.VERSION.SDK_INT < 26 || !a1VarE.C(a.m.TextAppearance_fontVariationSettings)) ? null : a1VarE.w(a.m.TextAppearance_fontVariationSettings);
            a1VarE.I();
        } else {
            colorStateListD = null;
            strW = null;
            zA = false;
            z = false;
            colorStateListD2 = null;
            strW2 = null;
            colorStateListD3 = null;
        }
        a1 a1VarG2 = a1.G(context, attributeSet, a.m.TextAppearance, r19, 0);
        if (z3 || !a1VarG2.C(a.m.TextAppearance_textAllCaps)) {
            z2 = z;
        } else {
            zA = a1VarG2.a(a.m.TextAppearance_textAllCaps, false);
            z2 = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a1VarG2.C(a.m.TextAppearance_android_textColor)) {
                colorStateListD3 = a1VarG2.d(a.m.TextAppearance_android_textColor);
            }
            if (a1VarG2.C(a.m.TextAppearance_android_textColorHint)) {
                colorStateListD = a1VarG2.d(a.m.TextAppearance_android_textColorHint);
            }
            if (a1VarG2.C(a.m.TextAppearance_android_textColorLink)) {
                colorStateListD2 = a1VarG2.d(a.m.TextAppearance_android_textColorLink);
            }
        }
        if (a1VarG2.C(a.m.TextAppearance_textLocale)) {
            strW2 = a1VarG2.w(a.m.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 26 && a1VarG2.C(a.m.TextAppearance_fontVariationSettings)) {
            strW = a1VarG2.w(a.m.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT >= 28 && a1VarG2.C(a.m.TextAppearance_android_textSize) && a1VarG2.g(a.m.TextAppearance_android_textSize, -1) == 0) {
            this.f212a.setTextSize(0, 0.0f);
        }
        B(context, a1VarG2);
        a1VarG2.I();
        if (colorStateListD3 != null) {
            this.f212a.setTextColor(colorStateListD3);
        }
        if (colorStateListD != null) {
            this.f212a.setHintTextColor(colorStateListD);
        }
        if (colorStateListD2 != null) {
            this.f212a.setLinkTextColor(colorStateListD2);
        }
        if (!z3 && z2) {
            r(zA);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                this.f212a.setTypeface(typeface, this.j);
            } else {
                this.f212a.setTypeface(typeface);
            }
        }
        if (strW != null) {
            this.f212a.setFontVariationSettings(strW);
        }
        if (strW2 != null) {
            int r02 = Build.VERSION.SDK_INT;
            if (r02 >= 24) {
                this.f212a.setTextLocales(LocaleList.forLanguageTags(strW2));
            } else if (r02 >= 21) {
                this.f212a.setTextLocale(Locale.forLanguageTag(strW2.substring(0, strW2.indexOf(44))));
            }
        }
        this.i.t(attributeSet, r19);
        if (androidx.core.widget.b.f401a && this.i.n() != 0) {
            int[] r03 = this.i.m();
            if (r03.length > 0) {
                if (this.f212a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f212a.setAutoSizeTextTypeUniformWithConfiguration(this.i.k(), this.i.j(), this.i.l(), 0);
                } else {
                    this.f212a.setAutoSizeTextTypeUniformWithPresetSizes(r03, 0);
                }
            }
        }
        a1 a1VarF = a1.F(context, attributeSet, a.m.AppCompatTextView);
        int r04 = a1VarF.u(a.m.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawableC = r04 != -1 ? kVarB.c(context, r04) : null;
        int r05 = a1VarF.u(a.m.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawableC2 = r05 != -1 ? kVarB.c(context, r05) : null;
        int r06 = a1VarF.u(a.m.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawableC3 = r06 != -1 ? kVarB.c(context, r06) : null;
        int r07 = a1VarF.u(a.m.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawableC4 = r07 != -1 ? kVarB.c(context, r07) : null;
        int r08 = a1VarF.u(a.m.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawableC5 = r08 != -1 ? kVarB.c(context, r08) : null;
        int r09 = a1VarF.u(a.m.AppCompatTextView_drawableEndCompat, -1);
        x(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, r09 != -1 ? kVarB.c(context, r09) : null);
        if (a1VarF.C(a.m.AppCompatTextView_drawableTint)) {
            androidx.core.widget.m.u(this.f212a, a1VarF.d(a.m.AppCompatTextView_drawableTint));
        }
        if (a1VarF.C(a.m.AppCompatTextView_drawableTintMode)) {
            r1 = -1;
            androidx.core.widget.m.v(this.f212a, f0.e(a1VarF.o(a.m.AppCompatTextView_drawableTintMode, -1), null));
        } else {
            r1 = -1;
        }
        int r010 = a1VarF.g(a.m.AppCompatTextView_firstBaselineToTopHeight, r1);
        int r2 = a1VarF.g(a.m.AppCompatTextView_lastBaselineToBottomHeight, r1);
        int r3 = a1VarF.g(a.m.AppCompatTextView_lineHeight, r1);
        a1VarF.I();
        if (r010 != r1) {
            androidx.core.widget.m.A(this.f212a, r010);
        }
        if (r2 != r1) {
            androidx.core.widget.m.B(this.f212a, r2);
        }
        if (r3 != r1) {
            androidx.core.widget.m.C(this.f212a, r3);
        }
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.j);
            }
        }
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    void o(boolean z, int r2, int r3, int r4, int r5) {
        if (androidx.core.widget.b.f401a) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int r5) {
        String strW;
        ColorStateList colorStateListD;
        a1 a1VarE = a1.E(context, r5, a.m.TextAppearance);
        if (a1VarE.C(a.m.TextAppearance_textAllCaps)) {
            r(a1VarE.a(a.m.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a1VarE.C(a.m.TextAppearance_android_textColor) && (colorStateListD = a1VarE.d(a.m.TextAppearance_android_textColor)) != null) {
            this.f212a.setTextColor(colorStateListD);
        }
        if (a1VarE.C(a.m.TextAppearance_android_textSize) && a1VarE.g(a.m.TextAppearance_android_textSize, -1) == 0) {
            this.f212a.setTextSize(0, 0.0f);
        }
        B(context, a1VarE);
        if (Build.VERSION.SDK_INT >= 26 && a1VarE.C(a.m.TextAppearance_fontVariationSettings) && (strW = a1VarE.w(a.m.TextAppearance_fontVariationSettings)) != null) {
            this.f212a.setFontVariationSettings(strW);
        }
        a1VarE.I();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.f212a.setTypeface(typeface, this.j);
        }
    }

    void r(boolean z) {
        this.f212a.setAllCaps(z);
    }

    void s(int r2, int r3, int r4, int r5) throws IllegalArgumentException {
        this.i.u(r2, r3, r4, r5);
    }

    void t(@androidx.annotation.h0 int[] r2, int r3) throws IllegalArgumentException {
        this.i.v(r2, r3);
    }

    void u(int r2) throws IllegalArgumentException {
        this.i.w(r2);
    }

    void v(@androidx.annotation.i0 ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new y0();
        }
        y0 y0Var = this.h;
        y0Var.f209a = colorStateList;
        y0Var.d = colorStateList != null;
        y();
    }

    void w(@androidx.annotation.i0 PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new y0();
        }
        y0 y0Var = this.h;
        y0Var.f210b = mode;
        y0Var.f211c = mode != null;
        y();
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    void z(int r2, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (androidx.core.widget.b.f401a || l()) {
            return;
        }
        A(r2, f);
    }
}
