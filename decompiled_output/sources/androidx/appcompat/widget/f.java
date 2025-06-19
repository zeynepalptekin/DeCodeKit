package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import b.a.a;

/* loaded from: classes.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.h0
    private final View f148a;
    private y0 d;
    private y0 e;
    private y0 f;

    /* renamed from: c, reason: collision with root package name */
    private int f150c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final k f149b = k.b();

    f(@androidx.annotation.h0 View view) {
        this.f148a = view;
    }

    private boolean a(@androidx.annotation.h0 Drawable drawable) {
        if (this.f == null) {
            this.f = new y0();
        }
        y0 y0Var = this.f;
        y0Var.a();
        ColorStateList colorStateListL = b.i.p.f0.L(this.f148a);
        if (colorStateListL != null) {
            y0Var.d = true;
            y0Var.f209a = colorStateListL;
        }
        PorterDuff.Mode modeM = b.i.p.f0.M(this.f148a);
        if (modeM != null) {
            y0Var.f211c = true;
            y0Var.f210b = modeM;
        }
        if (!y0Var.d && !y0Var.f211c) {
            return false;
        }
        k.j(drawable, y0Var, this.f148a.getDrawableState());
        return true;
    }

    private boolean k() {
        int r0 = Build.VERSION.SDK_INT;
        return r0 > 21 ? this.d != null : r0 == 21;
    }

    void b() {
        Drawable background = this.f148a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            y0 y0Var = this.e;
            if (y0Var != null) {
                k.j(background, y0Var, this.f148a.getDrawableState());
                return;
            }
            y0 y0Var2 = this.d;
            if (y0Var2 != null) {
                k.j(background, y0Var2, this.f148a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        y0 y0Var = this.e;
        if (y0Var != null) {
            return y0Var.f209a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        y0 y0Var = this.e;
        if (y0Var != null) {
            return y0Var.f210b;
        }
        return null;
    }

    void e(@androidx.annotation.i0 AttributeSet attributeSet, int r10) {
        a1 a1VarG = a1.G(this.f148a.getContext(), attributeSet, a.m.ViewBackgroundHelper, r10, 0);
        View view = this.f148a;
        b.i.p.f0.s1(view, view.getContext(), a.m.ViewBackgroundHelper, attributeSet, a1VarG.B(), r10, 0);
        try {
            if (a1VarG.C(a.m.ViewBackgroundHelper_android_background)) {
                this.f150c = a1VarG.u(a.m.ViewBackgroundHelper_android_background, -1);
                ColorStateList colorStateListF = this.f149b.f(this.f148a.getContext(), this.f150c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (a1VarG.C(a.m.ViewBackgroundHelper_backgroundTint)) {
                b.i.p.f0.C1(this.f148a, a1VarG.d(a.m.ViewBackgroundHelper_backgroundTint));
            }
            if (a1VarG.C(a.m.ViewBackgroundHelper_backgroundTintMode)) {
                b.i.p.f0.D1(this.f148a, f0.e(a1VarG.o(a.m.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a1VarG.I();
        }
    }

    void f(Drawable drawable) {
        this.f150c = -1;
        h(null);
        b();
    }

    void g(int r3) {
        this.f150c = r3;
        k kVar = this.f149b;
        h(kVar != null ? kVar.f(this.f148a.getContext(), r3) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new y0();
            }
            y0 y0Var = this.d;
            y0Var.f209a = colorStateList;
            y0Var.d = true;
        } else {
            this.d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new y0();
        }
        y0 y0Var = this.e;
        y0Var.f209a = colorStateList;
        y0Var.d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new y0();
        }
        y0 y0Var = this.e;
        y0Var.f210b = mode;
        y0Var.f211c = true;
        b();
    }
}
