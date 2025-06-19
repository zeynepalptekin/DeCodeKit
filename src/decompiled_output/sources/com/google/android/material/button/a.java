package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import b.i.p.f0;
import c.a.b.c.a;
import c.a.b.c.r.c;
import c.a.b.c.u.j;
import c.a.b.c.u.o;
import c.a.b.c.u.s;
import com.google.android.material.internal.z;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
class a {
    private static final boolean s;

    /* renamed from: a, reason: collision with root package name */
    private final MaterialButton f6646a;

    /* renamed from: b, reason: collision with root package name */
    @h0
    private o f6647b;

    /* renamed from: c, reason: collision with root package name */
    private int f6648c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    @i0
    private PorterDuff.Mode i;

    @i0
    private ColorStateList j;

    @i0
    private ColorStateList k;

    @i0
    private ColorStateList l;

    @i0
    private Drawable m;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q;
    private LayerDrawable r;

    static {
        s = Build.VERSION.SDK_INT >= 21;
    }

    a(MaterialButton materialButton, @h0 o oVar) {
        this.f6646a = materialButton;
        this.f6647b = oVar;
    }

    private void A(@h0 o oVar) {
        if (d() != null) {
            d().setShapeAppearanceModel(oVar);
        }
        if (l() != null) {
            l().setShapeAppearanceModel(oVar);
        }
        if (c() != null) {
            c().setShapeAppearanceModel(oVar);
        }
    }

    private void C() {
        j jVarD = d();
        j jVarL = l();
        if (jVarD != null) {
            jVarD.D0(this.h, this.k);
            if (jVarL != null) {
                jVarL.C0(this.h, this.n ? c.a.b.c.i.a.d(this.f6646a, a.c.colorSurface) : 0);
            }
        }
    }

    @h0
    private InsetDrawable D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f6648c, this.e, this.d, this.f);
    }

    private Drawable a() {
        j jVar = new j(this.f6647b);
        jVar.Y(this.f6646a.getContext());
        androidx.core.graphics.drawable.a.o(jVar, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(jVar, mode);
        }
        jVar.D0(this.h, this.k);
        j jVar2 = new j(this.f6647b);
        jVar2.setTint(0);
        jVar2.C0(this.h, this.n ? c.a.b.c.i.a.d(this.f6646a, a.c.colorSurface) : 0);
        if (s) {
            j jVar3 = new j(this.f6647b);
            this.m = jVar3;
            androidx.core.graphics.drawable.a.n(jVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(c.a.b.c.s.b.d(this.l), D(new LayerDrawable(new Drawable[]{jVar2, jVar})), this.m);
            this.r = rippleDrawable;
            return rippleDrawable;
        }
        c.a.b.c.s.a aVar = new c.a.b.c.s.a(this.f6647b);
        this.m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, c.a.b.c.s.b.d(this.l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{jVar2, jVar, this.m});
        this.r = layerDrawable;
        return D(layerDrawable);
    }

    @i0
    private j e(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (j) (s ? (LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable() : this.r).getDrawable(!z ? 1 : 0);
    }

    @i0
    private j l() {
        return e(true);
    }

    void B(int r5, int r6) {
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setBounds(this.f6648c, this.e, r6 - this.d, r5 - this.f);
        }
    }

    int b() {
        return this.g;
    }

    @i0
    public s c() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (s) (this.r.getNumberOfLayers() > 2 ? this.r.getDrawable(2) : this.r.getDrawable(1));
    }

    @i0
    j d() {
        return e(false);
    }

    @i0
    ColorStateList f() {
        return this.l;
    }

    @h0
    o g() {
        return this.f6647b;
    }

    @i0
    ColorStateList h() {
        return this.k;
    }

    int i() {
        return this.h;
    }

    ColorStateList j() {
        return this.j;
    }

    PorterDuff.Mode k() {
        return this.i;
    }

    boolean m() {
        return this.o;
    }

    boolean n() {
        return this.q;
    }

    void o(@h0 TypedArray typedArray) {
        this.f6648c = typedArray.getDimensionPixelOffset(a.o.MaterialButton_android_insetLeft, 0);
        this.d = typedArray.getDimensionPixelOffset(a.o.MaterialButton_android_insetRight, 0);
        this.e = typedArray.getDimensionPixelOffset(a.o.MaterialButton_android_insetTop, 0);
        this.f = typedArray.getDimensionPixelOffset(a.o.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(a.o.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(a.o.MaterialButton_cornerRadius, -1);
            this.g = dimensionPixelSize;
            u(this.f6647b.w(dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(a.o.MaterialButton_strokeWidth, 0);
        this.i = z.j(typedArray.getInt(a.o.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.j = c.a(this.f6646a.getContext(), typedArray, a.o.MaterialButton_backgroundTint);
        this.k = c.a(this.f6646a.getContext(), typedArray, a.o.MaterialButton_strokeColor);
        this.l = c.a(this.f6646a.getContext(), typedArray, a.o.MaterialButton_rippleColor);
        this.q = typedArray.getBoolean(a.o.MaterialButton_android_checkable, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(a.o.MaterialButton_elevation, 0);
        int r1 = f0.h0(this.f6646a);
        int paddingTop = this.f6646a.getPaddingTop();
        int r3 = f0.g0(this.f6646a);
        int paddingBottom = this.f6646a.getPaddingBottom();
        if (typedArray.hasValue(a.o.MaterialButton_android_background)) {
            q();
        } else {
            this.f6646a.setInternalBackground(a());
            j jVarD = d();
            if (jVarD != null) {
                jVarD.m0(dimensionPixelSize2);
            }
        }
        f0.V1(this.f6646a, r1 + this.f6648c, paddingTop + this.e, r3 + this.d, paddingBottom + this.f);
    }

    void p(int r2) {
        if (d() != null) {
            d().setTint(r2);
        }
    }

    void q() {
        this.o = true;
        this.f6646a.setSupportBackgroundTintList(this.j);
        this.f6646a.setSupportBackgroundTintMode(this.i);
    }

    void r(boolean z) {
        this.q = z;
    }

    void s(int r2) {
        if (this.p && this.g == r2) {
            return;
        }
        this.g = r2;
        this.p = true;
        u(this.f6647b.w(r2));
    }

    void t(@i0 ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            if (s && (this.f6646a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f6646a.getBackground()).setColor(c.a.b.c.s.b.d(colorStateList));
            } else {
                if (s || !(this.f6646a.getBackground() instanceof c.a.b.c.s.a)) {
                    return;
                }
                ((c.a.b.c.s.a) this.f6646a.getBackground()).setTintList(c.a.b.c.s.b.d(colorStateList));
            }
        }
    }

    void u(@h0 o oVar) {
        this.f6647b = oVar;
        A(oVar);
    }

    void v(boolean z) {
        this.n = z;
        C();
    }

    void w(@i0 ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            C();
        }
    }

    void x(int r2) {
        if (this.h != r2) {
            this.h = r2;
            C();
        }
    }

    void y(@i0 ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (d() != null) {
                androidx.core.graphics.drawable.a.o(d(), this.j);
            }
        }
    }

    void z(@i0 PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (d() == null || this.i == null) {
                return;
            }
            androidx.core.graphics.drawable.a.p(d(), this.i);
        }
    }
}
