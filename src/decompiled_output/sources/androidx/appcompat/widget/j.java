package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import b.a.a;

/* loaded from: classes.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.h0
    private final CompoundButton f159a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f160b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f161c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    j(@androidx.annotation.h0 CompoundButton compoundButton) {
        this.f159a = compoundButton;
    }

    void a() throws NoSuchFieldException {
        Drawable drawableA = androidx.core.widget.c.a(this.f159a);
        if (drawableA != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawableA).mutate();
                if (this.d) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.f160b);
                }
                if (this.e) {
                    androidx.core.graphics.drawable.a.p(drawableMutate, this.f161c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f159a.getDrawableState());
                }
                this.f159a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int r3) {
        Drawable drawableA;
        return (Build.VERSION.SDK_INT >= 17 || (drawableA = androidx.core.widget.c.a(this.f159a)) == null) ? r3 : r3 + drawableA.getIntrinsicWidth();
    }

    ColorStateList c() {
        return this.f160b;
    }

    PorterDuff.Mode d() {
        return this.f161c;
    }

    void e(@androidx.annotation.i0 AttributeSet attributeSet, int r12) {
        boolean z;
        int r11;
        int r112;
        a1 a1VarG = a1.G(this.f159a.getContext(), attributeSet, a.m.CompoundButton, r12, 0);
        CompoundButton compoundButton = this.f159a;
        b.i.p.f0.s1(compoundButton, compoundButton.getContext(), a.m.CompoundButton, attributeSet, a1VarG.B(), r12, 0);
        try {
            if (!a1VarG.C(a.m.CompoundButton_buttonCompat) || (r112 = a1VarG.u(a.m.CompoundButton_buttonCompat, 0)) == 0) {
                z = false;
            } else {
                try {
                    this.f159a.setButtonDrawable(b.a.b.a.a.d(this.f159a.getContext(), r112));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (!z && a1VarG.C(a.m.CompoundButton_android_button) && (r11 = a1VarG.u(a.m.CompoundButton_android_button, 0)) != 0) {
                this.f159a.setButtonDrawable(b.a.b.a.a.d(this.f159a.getContext(), r11));
            }
            if (a1VarG.C(a.m.CompoundButton_buttonTint)) {
                androidx.core.widget.c.d(this.f159a, a1VarG.d(a.m.CompoundButton_buttonTint));
            }
            if (a1VarG.C(a.m.CompoundButton_buttonTintMode)) {
                androidx.core.widget.c.e(this.f159a, f0.e(a1VarG.o(a.m.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            a1VarG.I();
        }
    }

    void f() throws NoSuchFieldException {
        if (this.f) {
            this.f = false;
        } else {
            this.f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) throws NoSuchFieldException {
        this.f160b = colorStateList;
        this.d = true;
        a();
    }

    void h(@androidx.annotation.i0 PorterDuff.Mode mode) throws NoSuchFieldException {
        this.f161c = mode;
        this.e = true;
        a();
    }
}
