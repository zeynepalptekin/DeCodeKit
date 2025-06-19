package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.annotation.i;
import androidx.annotation.i0;
import androidx.annotation.k0;
import androidx.annotation.m;
import androidx.annotation.m0;
import androidx.annotation.p;
import androidx.annotation.q;
import androidx.annotation.s0;
import androidx.annotation.t0;
import androidx.appcompat.widget.h;
import b.i.p.a0;
import b.i.p.f0;
import b.i.p.p0.d;
import c.a.b.c.a;
import c.a.b.c.r.f;
import c.a.b.c.u.k;
import c.a.b.c.u.o;
import c.a.b.c.u.s;
import com.google.android.material.chip.a;
import com.google.android.material.internal.z;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public class Chip extends h implements a.InterfaceC0195a, s {
    private static final String D = "http://schemas.android.com/apk/res/android";
    private static final int E = 48;
    private static final String F = "android.widget.Button";
    private static final String G = "android.widget.CompoundButton";
    private static final String H = "android.view.View";
    private static final String w = "Chip";
    private static final int y = 0;
    private static final int z = 1;

    @i0
    private com.google.android.material.chip.a g;

    @i0
    private InsetDrawable h;

    @i0
    private RippleDrawable i;

    @i0
    private View.OnClickListener j;

    @i0
    private CompoundButton.OnCheckedChangeListener k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;

    @p(unit = 1)
    private int r;

    @h0
    private final c s;
    private final Rect t;
    private final RectF u;
    private final f v;
    private static final int x = a.n.Widget_MaterialComponents_Chip_Action;
    private static final Rect A = new Rect();
    private static final int[] B = {R.attr.state_selected};
    private static final int[] C = {R.attr.state_checkable};

    class a extends f {
        a() {
        }

        @Override // c.a.b.c.r.f
        public void a(int r1) {
        }

        @Override // c.a.b.c.r.f
        public void b(@h0 Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.g.E3() ? Chip.this.g.M1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, @h0 Outline outline) {
            if (Chip.this.g != null) {
                Chip.this.g.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends b.k.c.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // b.k.c.a
        protected int C(float f, float f2) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // b.k.c.a
        protected void D(@h0 List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.x() && Chip.this.j != null) {
                list.add(1);
            }
        }

        @Override // b.k.c.a
        protected boolean N(int r1, int r2, Bundle bundle) {
            if (r2 != 16) {
                return false;
            }
            if (r1 == 0) {
                return Chip.this.performClick();
            }
            if (r1 == 1) {
                return Chip.this.y();
            }
            return false;
        }

        @Override // b.k.c.a
        protected void Q(@h0 d dVar) {
            dVar.R0(Chip.this.r());
            dVar.U0(Chip.this.isClickable());
            dVar.T0((Chip.this.r() || Chip.this.isClickable()) ? Chip.this.r() ? Chip.G : Chip.F : Chip.H);
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                dVar.H1(text);
            } else {
                dVar.X0(text);
            }
        }

        @Override // b.k.c.a
        protected void R(int r7, @h0 d dVar) {
            if (r7 != 1) {
                dVar.X0("");
                dVar.O0(Chip.A);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int r3 = a.m.mtrl_chip_close_icon_content_description;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                closeIconContentDescription = context.getString(r3, objArr).trim();
            }
            dVar.X0(closeIconContentDescription);
            dVar.O0(Chip.this.getCloseIconTouchBoundsInt());
            dVar.b(d.a.j);
            dVar.d1(Chip.this.isEnabled());
        }

        @Override // b.k.c.a
        protected void S(int r2, boolean z) {
            if (r2 == 1) {
                Chip.this.o = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.chipStyle);
    }

    public Chip(Context context, AttributeSet attributeSet, int r10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r10, x), attributeSet, r10);
        this.t = new Rect();
        this.u = new RectF();
        this.v = new a();
        Context context2 = getContext();
        H(attributeSet);
        com.google.android.material.chip.a aVarZ0 = com.google.android.material.chip.a.Z0(context2, attributeSet, r10, x);
        o(context2, attributeSet, r10);
        setChipDrawable(aVarZ0);
        aVarZ0.m0(f0.P(this));
        TypedArray typedArrayJ = com.google.android.material.internal.s.j(context2, attributeSet, a.o.Chip, r10, x, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(c.a.b.c.r.c.a(context2, typedArrayJ, a.o.Chip_android_textColor));
        }
        boolean zHasValue = typedArrayJ.hasValue(a.o.Chip_shapeAppearance);
        typedArrayJ.recycle();
        this.s = new c(this);
        C();
        if (!zHasValue) {
            p();
        }
        setChecked(this.l);
        setText(aVarZ0.M1());
        setEllipsize(aVarZ0.F1());
        G();
        if (!this.g.E3()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        F();
        if (A()) {
            setMinHeight(this.r);
        }
        this.q = f0.W(this);
    }

    private void B(@i0 com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.h3(null);
        }
    }

    private void C() {
        f0.u1(this, (n() && x() && this.j != null) ? this.s : null);
    }

    private void D() {
        if (c.a.b.c.s.b.f1999a) {
            E();
            return;
        }
        this.g.D3(true);
        f0.B1(this, getBackgroundDrawable());
        F();
        l();
    }

    private void E() {
        this.i = new RippleDrawable(c.a.b.c.s.b.d(this.g.K1()), getBackgroundDrawable(), null);
        this.g.D3(false);
        f0.B1(this, this.i);
        F();
    }

    private void F() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.g) == null) {
            return;
        }
        int r0 = (int) (aVar.o1() + this.g.O1() + this.g.U0());
        int r1 = (int) (this.g.t1() + this.g.P1() + this.g.Q0());
        if (this.h != null) {
            Rect rect = new Rect();
            this.h.getPadding(rect);
            r1 += rect.left;
            r0 += rect.right;
        }
        f0.V1(this, r1, getPaddingTop(), r0, getPaddingBottom());
    }

    private void G() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        c.a.b.c.r.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.i(getContext(), paint, this.v);
        }
    }

    private void H(@i0 AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue(D, "background") != null) {
            Log.w(w, "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue(D, "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue(D, "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue(D, "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue(D, "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue(D, "singleLine", true) || attributeSet.getAttributeIntValue(D, "lines", 1) != 1 || attributeSet.getAttributeIntValue(D, "minLines", 1) != 1 || attributeSet.getAttributeIntValue(D, "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue(D, "gravity", 8388627) != 8388627) {
            Log.w(w, "Chip text must be vertically center and start aligned");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @h0
    public RectF getCloseIconTouchBounds() {
        this.u.setEmpty();
        if (n()) {
            this.g.E1(this.u);
        }
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @h0
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.t;
    }

    @i0
    private c.a.b.c.r.d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.N1();
        }
        return null;
    }

    private void i(@h0 com.google.android.material.chip.a aVar) {
        aVar.h3(this);
    }

    @h0
    private int[] j() {
        int r1 = 0;
        int r0 = isEnabled() ? 1 : 0;
        if (this.o) {
            r0++;
        }
        if (this.n) {
            r0++;
        }
        if (this.m) {
            r0++;
        }
        if (isChecked()) {
            r0++;
        }
        int[] r02 = new int[r0];
        if (isEnabled()) {
            r02[0] = 16842910;
            r1 = 1;
        }
        if (this.o) {
            r02[r1] = 16842908;
            r1++;
        }
        if (this.n) {
            r02[r1] = 16843623;
            r1++;
        }
        if (this.m) {
            r02[r1] = 16842919;
            r1++;
        }
        if (isChecked()) {
            r02[r1] = 16842913;
        }
        return r02;
    }

    private void l() {
        if (getBackgroundDrawable() == this.h && this.g.getCallback() == null) {
            this.g.setCallback(this.h);
        }
    }

    @SuppressLint({"PrivateApi"})
    private boolean m(@h0 MotionEvent motionEvent) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = b.k.c.a.class.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.s)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = b.k.c.a.class.getDeclaredMethod("Z", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.s, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                Log.e(w, "Unable to send Accessibility Exit event", e);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.a aVar = this.g;
        return (aVar == null || aVar.x1() == null) ? false : true;
    }

    private void o(Context context, @i0 AttributeSet attributeSet, int r10) {
        TypedArray typedArrayJ = com.google.android.material.internal.s.j(context, attributeSet, a.o.Chip, r10, x, new int[0]);
        this.p = typedArrayJ.getBoolean(a.o.Chip_ensureMinTouchTargetSize, false);
        this.r = (int) Math.ceil(typedArrayJ.getDimension(a.o.Chip_chipMinTouchTargetSize, (float) Math.ceil(z.d(getContext(), 48))));
        typedArrayJ.recycle();
    }

    private void p() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    private void q(int r8, int r9, int r10, int r11) {
        this.h = new InsetDrawable((Drawable) this.g, r8, r9, r10, r11);
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.n != z2) {
            this.n = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.m != z2) {
            this.m = z2;
            refreshDrawableState();
        }
    }

    private void z() {
        if (this.h != null) {
            this.h = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            D();
        }
    }

    public boolean A() {
        return this.p;
    }

    @Override // com.google.android.material.chip.a.InterfaceC0195a
    public void a() {
        k(this.r);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(@h0 MotionEvent motionEvent) {
        return m(motionEvent) || this.s.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.s.w(keyEvent) || this.s.B() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.h, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.g;
        if ((aVar == null || !aVar.Z1()) ? false : this.g.c3(j())) {
            invalidate();
        }
    }

    @i0
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.h;
        return insetDrawable == null ? this.g : insetDrawable;
    }

    @i0
    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.k1();
        }
        return null;
    }

    @i0
    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.l1();
        }
        return null;
    }

    @i0
    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.m1();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return Math.max(0.0f, aVar.n1());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.g;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.o1();
        }
        return 0.0f;
    }

    @i0
    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.p1();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.q1();
        }
        return 0.0f;
    }

    @i0
    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.r1();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.s1();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.t1();
        }
        return 0.0f;
    }

    @i0
    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.u1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.v1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @i0
    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.x1();
        }
        return null;
    }

    @i0
    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.y1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.z1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.A1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.B1();
        }
        return 0.0f;
    }

    @i0
    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.D1();
        }
        return null;
    }

    @Override // android.widget.TextView
    @i0
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.F1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@h0 Rect rect) {
        if (this.s.B() == 1 || this.s.x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @i0
    public c.a.b.c.b.h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.G1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.H1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.I1();
        }
        return 0.0f;
    }

    @i0
    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.K1();
        }
        return null;
    }

    @Override // c.a.b.c.u.s
    @h0
    public o getShapeAppearanceModel() {
        return this.g.getShapeAppearanceModel();
    }

    @i0
    public c.a.b.c.b.h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.L1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.O1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            return aVar.P1();
        }
        return 0.0f;
    }

    public boolean k(@p int r6) {
        this.r = r6;
        if (!A()) {
            if (this.h != null) {
                z();
            } else {
                D();
            }
            return false;
        }
        int r0 = Math.max(0, r6 - this.g.getIntrinsicHeight());
        int r2 = Math.max(0, r6 - this.g.getIntrinsicWidth());
        if (r2 <= 0 && r0 <= 0) {
            if (this.h != null) {
                z();
            } else {
                D();
            }
            return false;
        }
        int r22 = r2 > 0 ? r2 / 2 : 0;
        int r1 = r0 > 0 ? r0 / 2 : 0;
        if (this.h != null) {
            Rect rect = new Rect();
            this.h.getPadding(rect);
            if (rect.top == r1 && rect.bottom == r1 && rect.left == r22 && rect.right == r22) {
                D();
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (getMinHeight() != r6) {
                setMinHeight(r6);
            }
            if (getMinWidth() != r6) {
            }
            q(r22, r1, r22, r1);
            D();
            return true;
        }
        setMinHeight(r6);
        setMinWidth(r6);
        q(r22, r1, r22, r1);
        D();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.f(this, this.g);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(r22, B);
        }
        if (r()) {
            CheckBox.mergeDrawableStates(r22, C);
        }
        return r22;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z2, int r3, Rect rect) {
        super.onFocusChanged(z2, r3, rect);
        this.s.M(z2, r3, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(@h0 MotionEvent motionEvent) {
        boolean zContains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                zContains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(zContains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@h0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((r() || isClickable()) ? r() ? G : F : H);
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            d.T1(accessibilityNodeInfo).W0(d.c.h(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.o(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @i0
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@h0 MotionEvent motionEvent, int r3) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), a0.e);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int r2) {
        super.onRtlPropertiesChanged(r2);
        if (this.q != r2) {
            this.q = r2;
            F();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@androidx.annotation.h0 android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.m
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.m
            if (r0 == 0) goto L34
            r5.y()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = 1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.g;
        return aVar != null && aVar.T1();
    }

    @Deprecated
    public boolean s() {
        return t();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.i) {
            super.setBackground(drawable);
        } else {
            Log.w(w, "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
        Log.w(w, "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.h, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.i) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w(w, "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.h, android.view.View
    public void setBackgroundResource(int r2) {
        Log.w(w, "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@i0 ColorStateList colorStateList) {
        Log.w(w, "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@i0 PorterDuff.Mode mode) {
        Log.w(w, "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.i2(z2);
        }
    }

    public void setCheckableResource(@androidx.annotation.h int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.j2(r2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        com.google.android.material.chip.a aVar = this.g;
        if (aVar == null) {
            this.l = z2;
            return;
        }
        if (aVar.T1()) {
            boolean zIsChecked = isChecked();
            super.setChecked(z2);
            if (zIsChecked == z2 || (onCheckedChangeListener = this.k) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z2);
        }
    }

    public void setCheckedIcon(@i0 Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.k2(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@androidx.annotation.h int r1) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setCheckedIconVisible(r1);
    }

    public void setCheckedIconResource(@q int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.n2(r2);
        }
    }

    public void setCheckedIconTint(@i0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.o2(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@m int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.p2(r2);
        }
    }

    public void setCheckedIconVisible(@androidx.annotation.h int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.q2(r2);
        }
    }

    public void setCheckedIconVisible(boolean z2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.r2(z2);
        }
    }

    public void setChipBackgroundColor(@i0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.s2(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@m int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.t2(r2);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.u2(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@androidx.annotation.o int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.v2(r2);
        }
    }

    public void setChipDrawable(@h0 com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.g;
        if (aVar2 != aVar) {
            B(aVar2);
            this.g = aVar;
            aVar.s3(false);
            i(this.g);
            k(this.r);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.w2(f);
        }
    }

    public void setChipEndPaddingResource(@androidx.annotation.o int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.x2(r2);
        }
    }

    public void setChipIcon(@i0 Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.y2(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(@androidx.annotation.h int r1) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setChipIconVisible(r1);
    }

    public void setChipIconResource(@q int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.B2(r2);
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.C2(f);
        }
    }

    public void setChipIconSizeResource(@androidx.annotation.o int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.D2(r2);
        }
    }

    public void setChipIconTint(@i0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.E2(colorStateList);
        }
    }

    public void setChipIconTintResource(@m int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.F2(r2);
        }
    }

    public void setChipIconVisible(@androidx.annotation.h int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.G2(r2);
        }
    }

    public void setChipIconVisible(boolean z2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.H2(z2);
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.I2(f);
        }
    }

    public void setChipMinHeightResource(@androidx.annotation.o int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.J2(r2);
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.K2(f);
        }
    }

    public void setChipStartPaddingResource(@androidx.annotation.o int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.L2(r2);
        }
    }

    public void setChipStrokeColor(@i0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.M2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@m int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.N2(r2);
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.O2(f);
        }
    }

    public void setChipStrokeWidthResource(@androidx.annotation.o int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.P2(r2);
        }
    }

    @Deprecated
    public void setChipText(@i0 CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@s0 int r2) {
        setText(getResources().getString(r2));
    }

    public void setCloseIcon(@i0 Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.R2(drawable);
        }
        C();
    }

    public void setCloseIconContentDescription(@i0 CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.S2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@androidx.annotation.h int r1) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setCloseIconVisible(r1);
    }

    public void setCloseIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.V2(f);
        }
    }

    public void setCloseIconEndPaddingResource(@androidx.annotation.o int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.W2(r2);
        }
    }

    public void setCloseIconResource(@q int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.X2(r2);
        }
        C();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.Y2(f);
        }
    }

    public void setCloseIconSizeResource(@androidx.annotation.o int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.Z2(r2);
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.a3(f);
        }
    }

    public void setCloseIconStartPaddingResource(@androidx.annotation.o int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.b3(r2);
        }
    }

    public void setCloseIconTint(@i0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.d3(colorStateList);
        }
    }

    public void setCloseIconTintResource(@m int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.e3(r2);
        }
    }

    public void setCloseIconVisible(@androidx.annotation.h int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setCloseIconVisible(getResources().getBoolean(r2));
    }

    public void setCloseIconVisible(boolean z2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.g3(z2);
        }
        C();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@i0 Drawable drawable, @i0 Drawable drawable2, @i0 Drawable drawable3, @i0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@i0 Drawable drawable, @i0 Drawable drawable2, @i0 Drawable drawable3, @i0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
        if (r1 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (r3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@i0 Drawable drawable, @i0 Drawable drawable2, @i0 Drawable drawable3, @i0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
        if (r1 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (r3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@i0 Drawable drawable, @i0 Drawable drawable2, @i0 Drawable drawable3, @i0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    @m0(21)
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.m0(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.g == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.i3(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.p = z2;
        k(this.r);
    }

    @Override // android.widget.TextView
    public void setGravity(int r2) {
        if (r2 != 8388627) {
            Log.w(w, "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(r2);
        }
    }

    public void setHideMotionSpec(@i0 c.a.b.c.b.h hVar) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.j3(hVar);
        }
    }

    public void setHideMotionSpecResource(@androidx.annotation.b int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.k3(r2);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.l3(f);
        }
    }

    public void setIconEndPaddingResource(@androidx.annotation.o int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.m3(r2);
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.n3(f);
        }
    }

    public void setIconStartPaddingResource(@androidx.annotation.o int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.o3(r2);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int r3) {
        if (this.g != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(r3);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int r2) {
        if (r2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(r2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int r2) {
        if (r2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(r2);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@k0 int r2) {
        super.setMaxWidth(r2);
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.p3(r2);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int r2) {
        if (r2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(r2);
    }

    void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.k = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.j = onClickListener;
        C();
    }

    public void setRippleColor(@i0 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.q3(colorStateList);
        }
        if (this.g.R1()) {
            return;
        }
        E();
    }

    public void setRippleColorResource(@m int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.r3(r2);
            if (this.g.R1()) {
                return;
            }
            E();
        }
    }

    @Override // c.a.b.c.u.s
    public void setShapeAppearanceModel(@h0 o oVar) {
        this.g.setShapeAppearanceModel(oVar);
    }

    public void setShowMotionSpec(@i0 c.a.b.c.b.h hVar) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.t3(hVar);
        }
    }

    public void setShowMotionSpecResource(@androidx.annotation.b int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.u3(r2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.g == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(this.g.E3() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.v3(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int r2) {
        super.setTextAppearance(r2);
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.x3(r2);
        }
        G();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int r2) {
        super.setTextAppearance(context, r2);
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.x3(r2);
        }
        G();
    }

    public void setTextAppearance(@i0 c.a.b.c.r.d dVar) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.w3(dVar);
        }
        G();
    }

    public void setTextAppearanceResource(@t0 int r2) {
        setTextAppearance(getContext(), r2);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.y3(f);
        }
    }

    public void setTextEndPaddingResource(@androidx.annotation.o int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.z3(r2);
        }
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.B3(f);
        }
    }

    public void setTextStartPaddingResource(@androidx.annotation.o int r2) {
        com.google.android.material.chip.a aVar = this.g;
        if (aVar != null) {
            aVar.C3(r2);
        }
    }

    public boolean t() {
        com.google.android.material.chip.a aVar = this.g;
        return aVar != null && aVar.V1();
    }

    @Deprecated
    public boolean u() {
        return v();
    }

    public boolean v() {
        com.google.android.material.chip.a aVar = this.g;
        return aVar != null && aVar.X1();
    }

    @Deprecated
    public boolean w() {
        return x();
    }

    public boolean x() {
        com.google.android.material.chip.a aVar = this.g;
        return aVar != null && aVar.a2();
    }

    @i
    public boolean y() {
        boolean z2 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.j;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z2 = true;
        }
        this.s.Y(1, 1);
        return z2;
    }
}
