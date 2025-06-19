package c.a.b.c.f;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.m0;
import androidx.annotation.p;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.t0;
import b.i.p.f0;
import c.a.b.c.a;
import c.a.b.c.r.c;
import c.a.b.c.u.e;
import c.a.b.c.u.f;
import c.a.b.c.u.j;
import c.a.b.c.u.n;
import c.a.b.c.u.o;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
class b {
    private static final int u = -1;
    private static final float w = 1.5f;
    private static final int x = 2;

    /* renamed from: a, reason: collision with root package name */
    @h0
    private final c.a.b.c.f.a f1958a;

    /* renamed from: c, reason: collision with root package name */
    @h0
    private final j f1960c;

    @h0
    private final j d;

    @p
    private final int e;

    @p
    private final int f;

    @p
    private int g;

    @i0
    private Drawable h;

    @i0
    private Drawable i;

    @i0
    private ColorStateList j;

    @i0
    private ColorStateList k;

    @i0
    private o l;

    @i0
    private ColorStateList m;

    @i0
    private Drawable n;

    @i0
    private LayerDrawable o;

    @i0
    private j p;

    @i0
    private j q;
    private boolean s;
    private static final int[] t = {R.attr.state_checked};
    private static final double v = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b, reason: collision with root package name */
    @h0
    private final Rect f1959b = new Rect();
    private boolean r = false;

    class a extends InsetDrawable {
        a(Drawable drawable, int r9, int r10, int r11, int r12) {
            super(drawable, r9, r10, r11, r12);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public b(@h0 c.a.b.c.f.a aVar, AttributeSet attributeSet, int r6, @t0 int r7) {
        this.f1958a = aVar;
        j jVar = new j(aVar.getContext(), attributeSet, r6, r7);
        this.f1960c = jVar;
        jVar.Y(aVar.getContext());
        this.f1960c.u0(-12303292);
        o.b bVarV = this.f1960c.getShapeAppearanceModel().v();
        TypedArray typedArrayObtainStyledAttributes = aVar.getContext().obtainStyledAttributes(attributeSet, a.o.CardView, r6, a.n.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(a.o.CardView_cardCornerRadius)) {
            bVarV.o(typedArrayObtainStyledAttributes.getDimension(a.o.CardView_cardCornerRadius, 0.0f));
        }
        this.d = new j();
        N(bVarV.m());
        Resources resources = aVar.getResources();
        this.e = resources.getDimensionPixelSize(a.f.mtrl_card_checked_icon_margin);
        this.f = resources.getDimensionPixelSize(a.f.mtrl_card_checked_icon_size);
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean R() {
        return this.f1958a.getPreventCornerOverlap() && !e();
    }

    private boolean S() {
        return this.f1958a.getPreventCornerOverlap() && e() && this.f1958a.getUseCompatPadding();
    }

    private void W(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 || !(this.f1958a.getForeground() instanceof InsetDrawable)) {
            this.f1958a.setForeground(z(drawable));
        } else {
            ((InsetDrawable) this.f1958a.getForeground()).setDrawable(drawable);
        }
    }

    private void Y() {
        Drawable drawable;
        if (c.a.b.c.s.b.f1999a && (drawable = this.n) != null) {
            ((RippleDrawable) drawable).setColor(this.j);
            return;
        }
        j jVar = this.p;
        if (jVar != null) {
            jVar.n0(this.j);
        }
    }

    private float a() {
        return Math.max(Math.max(b(this.l.q(), this.f1960c.R()), b(this.l.s(), this.f1960c.S())), Math.max(b(this.l.k(), this.f1960c.u()), b(this.l.i(), this.f1960c.t())));
    }

    private float b(e eVar, float f) {
        if (eVar instanceof n) {
            return (float) ((1.0d - v) * f);
        }
        if (eVar instanceof f) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    private float c() {
        return this.f1958a.getMaxCardElevation() + (S() ? a() : 0.0f);
    }

    private float d() {
        return (this.f1958a.getMaxCardElevation() * w) + (S() ? a() : 0.0f);
    }

    private boolean e() {
        return Build.VERSION.SDK_INT >= 21 && this.f1960c.d0();
    }

    @h0
    private Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.i;
        if (drawable != null) {
            stateListDrawable.addState(t, drawable);
        }
        return stateListDrawable;
    }

    @h0
    private Drawable g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        j jVarI = i();
        this.p = jVarI;
        jVarI.n0(this.j);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.p);
        return stateListDrawable;
    }

    @h0
    private Drawable h() {
        if (!c.a.b.c.s.b.f1999a) {
            return g();
        }
        this.q = i();
        return new RippleDrawable(this.j, null, this.q);
    }

    @h0
    private j i() {
        return new j(this.l);
    }

    @h0
    private Drawable p() {
        if (this.n == null) {
            this.n = h();
        }
        if (this.o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.n, this.d, f()});
            this.o = layerDrawable;
            layerDrawable.setId(2, a.h.mtrl_card_checked_layer_id);
        }
        return this.o;
    }

    private float r() {
        if (!this.f1958a.getPreventCornerOverlap()) {
            return 0.0f;
        }
        if (Build.VERSION.SDK_INT < 21 || this.f1958a.getUseCompatPadding()) {
            return (float) ((1.0d - v) * this.f1958a.getCardViewRadius());
        }
        return 0.0f;
    }

    @h0
    private Drawable z(Drawable drawable) {
        int r7;
        int r8;
        if ((Build.VERSION.SDK_INT < 21) || this.f1958a.getUseCompatPadding()) {
            int r1 = (int) Math.ceil(d());
            r7 = (int) Math.ceil(c());
            r8 = r1;
        } else {
            r7 = 0;
            r8 = 0;
        }
        return new a(drawable, r7, r8, r7, r8);
    }

    boolean A() {
        return this.r;
    }

    boolean B() {
        return this.s;
    }

    void C(@h0 TypedArray typedArray) {
        ColorStateList colorStateListA = c.a(this.f1958a.getContext(), typedArray, a.o.MaterialCardView_strokeColor);
        this.m = colorStateListA;
        if (colorStateListA == null) {
            this.m = ColorStateList.valueOf(-1);
        }
        this.g = typedArray.getDimensionPixelSize(a.o.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(a.o.MaterialCardView_android_checkable, false);
        this.s = z;
        this.f1958a.setLongClickable(z);
        this.k = c.a(this.f1958a.getContext(), typedArray, a.o.MaterialCardView_checkedIconTint);
        I(c.d(this.f1958a.getContext(), typedArray, a.o.MaterialCardView_checkedIcon));
        ColorStateList colorStateListA2 = c.a(this.f1958a.getContext(), typedArray, a.o.MaterialCardView_rippleColor);
        this.j = colorStateListA2;
        if (colorStateListA2 == null) {
            this.j = ColorStateList.valueOf(c.a.b.c.i.a.d(this.f1958a, a.c.colorControlHighlight));
        }
        G(c.a(this.f1958a.getContext(), typedArray, a.o.MaterialCardView_cardForegroundColor));
        Y();
        V();
        Z();
        this.f1958a.setBackgroundInternal(z(this.f1960c));
        Drawable drawableP = this.f1958a.isClickable() ? p() : this.d;
        this.h = drawableP;
        this.f1958a.setForeground(z(drawableP));
    }

    void D(int r10, int r11) {
        int r5;
        int r7;
        if (this.o != null) {
            int r0 = this.e;
            int r1 = this.f;
            int r102 = (r10 - r0) - r1;
            int r112 = (r11 - r0) - r1;
            if ((Build.VERSION.SDK_INT < 21) || this.f1958a.getUseCompatPadding()) {
                r112 -= (int) Math.ceil(d() * 2.0f);
                r102 -= (int) Math.ceil(c() * 2.0f);
            }
            int r8 = r112;
            int r113 = this.e;
            if (f0.W(this.f1958a) == 1) {
                r7 = r102;
                r5 = r113;
            } else {
                r5 = r102;
                r7 = r113;
            }
            this.o.setLayerInset(2, r5, this.e, r7, r8);
        }
    }

    void E(boolean z) {
        this.r = z;
    }

    void F(ColorStateList colorStateList) {
        this.f1960c.n0(colorStateList);
    }

    void G(@i0 ColorStateList colorStateList) {
        j jVar = this.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        jVar.n0(colorStateList);
    }

    void H(boolean z) {
        this.s = z;
    }

    void I(@i0 Drawable drawable) {
        this.i = drawable;
        if (drawable != null) {
            Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable.mutate());
            this.i = drawableR;
            androidx.core.graphics.drawable.a.o(drawableR, this.k);
        }
        if (this.o != null) {
            this.o.setDrawableByLayerId(a.h.mtrl_card_checked_layer_id, f());
        }
    }

    void J(@i0 ColorStateList colorStateList) {
        this.k = colorStateList;
        Drawable drawable = this.i;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
    }

    void K(float f) {
        N(this.l.w(f));
        this.h.invalidateSelf();
        if (S() || R()) {
            U();
        }
        if (S()) {
            X();
        }
    }

    void L(@r(from = 0.0d, to = 1.0d) float f) {
        this.f1960c.o0(f);
        j jVar = this.d;
        if (jVar != null) {
            jVar.o0(f);
        }
        j jVar2 = this.q;
        if (jVar2 != null) {
            jVar2.o0(f);
        }
    }

    void M(@i0 ColorStateList colorStateList) {
        this.j = colorStateList;
        Y();
    }

    void N(@h0 o oVar) {
        this.l = oVar;
        this.f1960c.setShapeAppearanceModel(oVar);
        this.f1960c.t0(!r0.d0());
        j jVar = this.d;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(oVar);
        }
        j jVar2 = this.q;
        if (jVar2 != null) {
            jVar2.setShapeAppearanceModel(oVar);
        }
        j jVar3 = this.p;
        if (jVar3 != null) {
            jVar3.setShapeAppearanceModel(oVar);
        }
    }

    void O(ColorStateList colorStateList) {
        if (this.m == colorStateList) {
            return;
        }
        this.m = colorStateList;
        Z();
    }

    void P(@p int r2) {
        if (r2 == this.g) {
            return;
        }
        this.g = r2;
        Z();
    }

    void Q(int r2, int r3, int r4, int r5) {
        this.f1959b.set(r2, r3, r4, r5);
        U();
    }

    void T() {
        Drawable drawable = this.h;
        Drawable drawableP = this.f1958a.isClickable() ? p() : this.d;
        this.h = drawableP;
        if (drawable != drawableP) {
            W(drawableP);
        }
    }

    void U() {
        int r0 = (int) ((R() || S() ? a() : 0.0f) - r());
        c.a.b.c.f.a aVar = this.f1958a;
        Rect rect = this.f1959b;
        aVar.m(rect.left + r0, rect.top + r0, rect.right + r0, rect.bottom + r0);
    }

    void V() {
        this.f1960c.m0(this.f1958a.getCardElevation());
    }

    void X() {
        if (!A()) {
            this.f1958a.setBackgroundInternal(z(this.f1960c));
        }
        this.f1958a.setForeground(z(this.h));
    }

    void Z() {
        this.d.D0(this.g, this.m);
    }

    @m0(api = 23)
    void j() {
        Drawable drawable = this.n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int r1 = bounds.bottom;
            this.n.setBounds(bounds.left, bounds.top, bounds.right, r1 - 1);
            this.n.setBounds(bounds.left, bounds.top, bounds.right, r1);
        }
    }

    @h0
    j k() {
        return this.f1960c;
    }

    ColorStateList l() {
        return this.f1960c.y();
    }

    ColorStateList m() {
        return this.d.y();
    }

    @i0
    Drawable n() {
        return this.i;
    }

    @i0
    ColorStateList o() {
        return this.k;
    }

    float q() {
        return this.f1960c.R();
    }

    @r(from = 0.0d, to = 1.0d)
    float s() {
        return this.f1960c.z();
    }

    @i0
    ColorStateList t() {
        return this.j;
    }

    o u() {
        return this.l;
    }

    @k
    int v() {
        ColorStateList colorStateList = this.m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @i0
    ColorStateList w() {
        return this.m;
    }

    @p
    int x() {
        return this.g;
    }

    @h0
    Rect y() {
        return this.f1959b;
    }
}
