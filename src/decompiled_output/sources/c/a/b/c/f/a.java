package c.a.b.c.f;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.m;
import androidx.annotation.p;
import androidx.annotation.q;
import androidx.annotation.r;
import c.a.b.c.a;
import c.a.b.c.u.o;
import c.a.b.c.u.s;

/* loaded from: classes.dex */
public class a extends b.e.b.a implements Checkable, s {
    private static final int[] r = {R.attr.state_checkable};
    private static final int[] s = {R.attr.state_checked};
    private static final int[] t = {a.c.state_dragged};
    private static final int u = a.n.Widget_MaterialComponents_CardView;
    private static final String v = "MaterialCardView";
    private static final String w = "androidx.cardview.widget.CardView";

    @h0
    private final b m;
    private boolean n;
    private boolean o;
    private boolean p;
    private InterfaceC0138a q;

    /* renamed from: c.a.b.c.f.a$a, reason: collision with other inner class name */
    public interface InterfaceC0138a {
        void a(a aVar, boolean z);
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.materialCardViewStyle);
    }

    public a(Context context, AttributeSet attributeSet, int r10) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r10, u), attributeSet, r10);
        this.o = false;
        this.p = false;
        this.n = true;
        TypedArray typedArrayJ = com.google.android.material.internal.s.j(getContext(), attributeSet, a.o.MaterialCardView, r10, u, new int[0]);
        b bVar = new b(this, attributeSet, r10, u);
        this.m = bVar;
        bVar.F(super.getCardBackgroundColor());
        this.m.Q(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        this.m.C(typedArrayJ);
        typedArrayJ.recycle();
    }

    @h0
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.m.k().getBounds());
        return rectF;
    }

    private void j() {
        if (Build.VERSION.SDK_INT > 26) {
            this.m.j();
        }
    }

    @Override // b.e.b.a
    @h0
    public ColorStateList getCardBackgroundColor() {
        return this.m.l();
    }

    @h0
    public ColorStateList getCardForegroundColor() {
        return this.m.m();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    @i0
    public Drawable getCheckedIcon() {
        return this.m.n();
    }

    @i0
    public ColorStateList getCheckedIconTint() {
        return this.m.o();
    }

    @Override // b.e.b.a
    public int getContentPaddingBottom() {
        return this.m.y().bottom;
    }

    @Override // b.e.b.a
    public int getContentPaddingLeft() {
        return this.m.y().left;
    }

    @Override // b.e.b.a
    public int getContentPaddingRight() {
        return this.m.y().right;
    }

    @Override // b.e.b.a
    public int getContentPaddingTop() {
        return this.m.y().top;
    }

    @r(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.m.s();
    }

    @Override // b.e.b.a
    public float getRadius() {
        return this.m.q();
    }

    public ColorStateList getRippleColor() {
        return this.m.t();
    }

    @Override // c.a.b.c.u.s
    @h0
    public o getShapeAppearanceModel() {
        return this.m.u();
    }

    @k
    @Deprecated
    public int getStrokeColor() {
        return this.m.v();
    }

    @i0
    public ColorStateList getStrokeColorStateList() {
        return this.m.w();
    }

    @p
    public int getStrokeWidth() {
        return this.m.x();
    }

    @Override // b.e.b.a
    public void h(int r2, int r3, int r4, int r5) {
        this.m.Q(r2, r3, r4, r5);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.o;
    }

    public boolean k() {
        b bVar = this.m;
        return bVar != null && bVar.B();
    }

    public boolean l() {
        return this.p;
    }

    void m(int r1, int r2, int r3, int r4) {
        super.h(r1, r2, r3, r4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        c.a.b.c.u.k.f(this, this.m.k());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 3);
        if (k()) {
            FrameLayout.mergeDrawableStates(r22, r);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(r22, s);
        }
        if (l()) {
            FrameLayout.mergeDrawableStates(r22, t);
        }
        return r22;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@h0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(w);
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@h0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(w);
        accessibilityNodeInfo.setCheckable(k());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // b.e.b.a, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        this.m.D(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.n) {
            if (!this.m.A()) {
                Log.i(v, "Setting a custom background is not supported.");
                this.m.E(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // b.e.b.a
    public void setCardBackgroundColor(@k int r2) {
        this.m.F(ColorStateList.valueOf(r2));
    }

    @Override // b.e.b.a
    public void setCardBackgroundColor(@i0 ColorStateList colorStateList) {
        this.m.F(colorStateList);
    }

    @Override // b.e.b.a
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.m.V();
    }

    public void setCardForegroundColor(@i0 ColorStateList colorStateList) {
        this.m.G(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.m.H(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.o != z) {
            toggle();
        }
    }

    public void setCheckedIcon(@i0 Drawable drawable) {
        this.m.I(drawable);
    }

    public void setCheckedIconResource(@q int r3) {
        this.m.I(b.a.b.a.a.d(getContext(), r3));
    }

    public void setCheckedIconTint(@i0 ColorStateList colorStateList) {
        this.m.J(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        b bVar = this.m;
        if (bVar != null) {
            bVar.T();
        }
    }

    public void setDragged(boolean z) {
        if (this.p != z) {
            this.p = z;
            refreshDrawableState();
            j();
            invalidate();
        }
    }

    @Override // b.e.b.a
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.m.X();
    }

    public void setOnCheckedChangeListener(@i0 InterfaceC0138a interfaceC0138a) {
        this.q = interfaceC0138a;
    }

    @Override // b.e.b.a
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.m.X();
        this.m.U();
    }

    public void setProgress(@r(from = 0.0d, to = 1.0d) float f) {
        this.m.L(f);
    }

    @Override // b.e.b.a
    public void setRadius(float f) {
        super.setRadius(f);
        this.m.K(f);
    }

    public void setRippleColor(@i0 ColorStateList colorStateList) {
        this.m.M(colorStateList);
    }

    public void setRippleColorResource(@m int r3) {
        this.m.M(b.a.b.a.a.c(getContext(), r3));
    }

    @Override // c.a.b.c.u.s
    public void setShapeAppearanceModel(@h0 o oVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(oVar.u(getBoundsAsRectF()));
        }
        this.m.N(oVar);
    }

    public void setStrokeColor(@k int r2) {
        this.m.O(ColorStateList.valueOf(r2));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.m.O(colorStateList);
    }

    public void setStrokeWidth(@p int r2) {
        this.m.P(r2);
    }

    @Override // b.e.b.a
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.m.X();
        this.m.U();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (k() && isEnabled()) {
            this.o = !this.o;
            refreshDrawableState();
            j();
            InterfaceC0138a interfaceC0138a = this.q;
            if (interfaceC0138a != null) {
                interfaceC0138a.a(this, this.o);
            }
        }
    }
}
