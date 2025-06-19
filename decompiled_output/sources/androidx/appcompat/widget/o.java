package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.p0;
import b.a.a;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.h0
    private final ImageView f175a;

    /* renamed from: b, reason: collision with root package name */
    private y0 f176b;

    /* renamed from: c, reason: collision with root package name */
    private y0 f177c;
    private y0 d;

    public o(@androidx.annotation.h0 ImageView imageView) {
        this.f175a = imageView;
    }

    private boolean a(@androidx.annotation.h0 Drawable drawable) {
        if (this.d == null) {
            this.d = new y0();
        }
        y0 y0Var = this.d;
        y0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.f.a(this.f175a);
        if (colorStateListA != null) {
            y0Var.d = true;
            y0Var.f209a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.f.b(this.f175a);
        if (modeB != null) {
            y0Var.f211c = true;
            y0Var.f210b = modeB;
        }
        if (!y0Var.d && !y0Var.f211c) {
            return false;
        }
        k.j(drawable, y0Var, this.f175a.getDrawableState());
        return true;
    }

    private boolean k() {
        int r0 = Build.VERSION.SDK_INT;
        return r0 > 21 ? this.f176b != null : r0 == 21;
    }

    void b() {
        Drawable drawable = this.f175a.getDrawable();
        if (drawable != null) {
            f0.b(drawable);
        }
        if (drawable != null) {
            if (k() && a(drawable)) {
                return;
            }
            y0 y0Var = this.f177c;
            if (y0Var != null) {
                k.j(drawable, y0Var, this.f175a.getDrawableState());
                return;
            }
            y0 y0Var2 = this.f176b;
            if (y0Var2 != null) {
                k.j(drawable, y0Var2, this.f175a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        y0 y0Var = this.f177c;
        if (y0Var != null) {
            return y0Var.f209a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        y0 y0Var = this.f177c;
        if (y0Var != null) {
            return y0Var.f210b;
        }
        return null;
    }

    boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f175a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int r10) {
        int r1;
        a1 a1VarG = a1.G(this.f175a.getContext(), attributeSet, a.m.AppCompatImageView, r10, 0);
        ImageView imageView = this.f175a;
        b.i.p.f0.s1(imageView, imageView.getContext(), a.m.AppCompatImageView, attributeSet, a1VarG.B(), r10, 0);
        try {
            Drawable drawable = this.f175a.getDrawable();
            if (drawable == null && (r1 = a1VarG.u(a.m.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = b.a.b.a.a.d(this.f175a.getContext(), r1)) != null) {
                this.f175a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                f0.b(drawable);
            }
            if (a1VarG.C(a.m.AppCompatImageView_tint)) {
                androidx.core.widget.f.c(this.f175a, a1VarG.d(a.m.AppCompatImageView_tint));
            }
            if (a1VarG.C(a.m.AppCompatImageView_tintMode)) {
                androidx.core.widget.f.d(this.f175a, f0.e(a1VarG.o(a.m.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a1VarG.I();
        }
    }

    public void g(int r2) {
        if (r2 != 0) {
            Drawable drawableD = b.a.b.a.a.d(this.f175a.getContext(), r2);
            if (drawableD != null) {
                f0.b(drawableD);
            }
            this.f175a.setImageDrawable(drawableD);
        } else {
            this.f175a.setImageDrawable(null);
        }
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f176b == null) {
                this.f176b = new y0();
            }
            y0 y0Var = this.f176b;
            y0Var.f209a = colorStateList;
            y0Var.d = true;
        } else {
            this.f176b = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f177c == null) {
            this.f177c = new y0();
        }
        y0 y0Var = this.f177c;
        y0Var.f209a = colorStateList;
        y0Var.d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f177c == null) {
            this.f177c = new y0();
        }
        y0 y0Var = this.f177c;
        y0Var.f210b = mode;
        y0Var.f211c = true;
        b();
    }
}
