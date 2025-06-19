package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.appcompat.widget.g;
import androidx.core.widget.m;
import b.i.p.f0;
import c.a.b.c.a;
import c.a.b.c.u.k;
import c.a.b.c.u.o;
import c.a.b.c.u.s;
import com.google.android.material.internal.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class MaterialButton extends g implements Checkable, s {
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 3;
    public static final int w = 4;
    private static final String x = "MaterialButton";

    @h0
    private final com.google.android.material.button.a f;

    @h0
    private final LinkedHashSet<b> g;

    @i0
    private c h;

    @i0
    private PorterDuff.Mode i;

    @i0
    private ColorStateList j;

    @i0
    private Drawable k;

    @k0
    private int l;

    @k0
    private int m;

    @k0
    private int n;
    private boolean o;
    private boolean p;
    private int q;
    private static final int[] r = {R.attr.state_checkable};
    private static final int[] s = {R.attr.state_checked};
    private static final int y = a.n.Widget_MaterialComponents_Button;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    interface c {
        void a(MaterialButton materialButton, boolean z);
    }

    static class d extends b.k.b.a {
        public static final Parcelable.Creator<d> CREATOR = new a();
        boolean f;

        static class a implements Parcelable.ClassLoaderCreator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @h0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(@h0 Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @h0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(@h0 Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @h0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int r1) {
                return new d[r1];
            }
        }

        public d(@h0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                d.class.getClassLoader();
            }
            b(parcel);
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@h0 Parcel parcel) {
            this.f = parcel.readInt() == 1;
        }

        @Override // b.k.b.a, android.os.Parcelable
        public void writeToParcel(@h0 Parcel parcel, int r2) {
            super.writeToParcel(parcel, r2);
            parcel.writeInt(this.f ? 1 : 0);
        }
    }

    public MaterialButton(@h0 Context context) {
        this(context, null);
    }

    public MaterialButton(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.materialButtonStyle);
    }

    public MaterialButton(@h0 Context context, @i0 AttributeSet attributeSet, int r10) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r10, y), attributeSet, r10);
        this.g = new LinkedHashSet<>();
        this.o = false;
        this.p = false;
        Context context2 = getContext();
        TypedArray typedArrayJ = com.google.android.material.internal.s.j(context2, attributeSet, a.o.MaterialButton, r10, y, new int[0]);
        this.n = typedArrayJ.getDimensionPixelSize(a.o.MaterialButton_iconPadding, 0);
        this.i = z.j(typedArrayJ.getInt(a.o.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.j = c.a.b.c.r.c.a(getContext(), typedArrayJ, a.o.MaterialButton_iconTint);
        this.k = c.a.b.c.r.c.d(getContext(), typedArrayJ, a.o.MaterialButton_icon);
        this.q = typedArrayJ.getInteger(a.o.MaterialButton_iconGravity, 1);
        this.l = typedArrayJ.getDimensionPixelSize(a.o.MaterialButton_iconSize, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, o.e(context2, attributeSet, r10, y).m());
        this.f = aVar;
        aVar.o(typedArrayJ);
        typedArrayJ.recycle();
        setCompoundDrawablePadding(this.n);
        h(this.k != null);
    }

    private boolean d() {
        return f0.W(this) == 1;
    }

    private boolean e() {
        com.google.android.material.button.a aVar = this.f;
        return (aVar == null || aVar.m()) ? false : true;
    }

    private void g(boolean z) {
        if (z) {
            m.w(this, this.k, null, null, null);
        } else {
            m.w(this, null, null, this.k, null);
        }
    }

    @h0
    private String getA11yClassName() {
        return (c() ? CompoundButton.class : Button.class).getName();
    }

    private void h(boolean z) {
        Drawable drawable = this.k;
        boolean z2 = false;
        if (drawable != null) {
            Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.k = drawableMutate;
            androidx.core.graphics.drawable.a.o(drawableMutate, this.j);
            PorterDuff.Mode mode = this.i;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.k, mode);
            }
            int intrinsicWidth = this.l;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.k.getIntrinsicWidth();
            }
            int intrinsicHeight = this.l;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.k.getIntrinsicHeight();
            }
            Drawable drawable2 = this.k;
            int r4 = this.m;
            drawable2.setBounds(r4, 0, intrinsicWidth + r4, intrinsicHeight);
        }
        int r0 = this.q;
        boolean z3 = r0 == 1 || r0 == 2;
        if (z) {
            g(z3);
            return;
        }
        Drawable[] drawableArrH = m.h(this);
        Drawable drawable3 = drawableArrH[0];
        Drawable drawable4 = drawableArrH[2];
        if ((z3 && drawable3 != this.k) || (!z3 && drawable4 != this.k)) {
            z2 = true;
        }
        if (z2) {
            g(z3);
        }
    }

    private void i() {
        if (this.k == null || getLayout() == null) {
            return;
        }
        int r0 = this.q;
        if (r0 == 1 || r0 == 3) {
            this.m = 0;
            h(false);
            return;
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        int r02 = Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
        int intrinsicWidth = this.l;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.k.getIntrinsicWidth();
        }
        int measuredWidth = (((((getMeasuredWidth() - r02) - f0.g0(this)) - intrinsicWidth) - this.n) - f0.h0(this)) / 2;
        if (d() != (this.q == 4)) {
            measuredWidth = -measuredWidth;
        }
        if (this.m != measuredWidth) {
            this.m = measuredWidth;
            h(false);
        }
    }

    public void a(@h0 b bVar) {
        this.g.add(bVar);
    }

    public void b() {
        this.g.clear();
    }

    public boolean c() {
        com.google.android.material.button.a aVar = this.f;
        return aVar != null && aVar.n();
    }

    public void f(@h0 b bVar) {
        this.g.remove(bVar);
    }

    @Override // android.view.View
    @i0
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @i0
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @k0
    public int getCornerRadius() {
        if (e()) {
            return this.f.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.k;
    }

    public int getIconGravity() {
        return this.q;
    }

    @k0
    public int getIconPadding() {
        return this.n;
    }

    @k0
    public int getIconSize() {
        return this.l;
    }

    public ColorStateList getIconTint() {
        return this.j;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.i;
    }

    @i0
    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f.f();
        }
        return null;
    }

    @Override // c.a.b.c.u.s
    @h0
    public o getShapeAppearanceModel() {
        if (e()) {
            return this.f.g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f.h();
        }
        return null;
    }

    @k0
    public int getStrokeWidth() {
        if (e()) {
            return this.f.i();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.g, b.i.p.d0
    @i0
    @p0({p0.a.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.f.j() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.g, b.i.p.d0
    @i0
    @p0({p0.a.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.f.k() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.o;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            k.f(this, this.f.d());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 2);
        if (c()) {
            Button.mergeDrawableStates(r22, r);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(r22, s);
        }
        return r22;
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void onInitializeAccessibilityEvent(@h0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void onInitializeAccessibilityNodeInfo(@h0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.g, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int r3, int r4, int r5, int r6) {
        com.google.android.material.button.a aVar;
        super.onLayout(z, r3, r4, r5, r6);
        if (Build.VERSION.SDK_INT != 21 || (aVar = this.f) == null) {
            return;
        }
        aVar.B(r6 - r4, r5 - r3);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        i();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@i0 Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        setChecked(dVar.f);
    }

    @Override // android.widget.TextView, android.view.View
    @h0
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f = this.o;
        return dVar;
    }

    @Override // androidx.appcompat.widget.g, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        super.onTextChanged(charSequence, r2, r3, r4);
        i();
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(@h0 Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@androidx.annotation.k int r2) {
        if (e()) {
            this.f.p(r2);
        } else {
            super.setBackgroundColor(r2);
        }
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundDrawable(@h0 Drawable drawable) {
        if (e()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            } else {
                Log.w(x, "Do not set the background; MaterialButton manages its own background drawable.");
                this.f.q();
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundResource(@q int r2) {
        setBackgroundDrawable(r2 != 0 ? b.a.b.a.a.d(getContext(), r2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@i0 ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@i0 PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (e()) {
            this.f.r(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (c() && isEnabled() && this.o != z) {
            this.o = z;
            refreshDrawableState();
            if (this.p) {
                return;
            }
            this.p = true;
            Iterator<b> it = this.g.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.o);
            }
            this.p = false;
        }
    }

    public void setCornerRadius(@k0 int r2) {
        if (e()) {
            this.f.s(r2);
        }
    }

    public void setCornerRadiusResource(@androidx.annotation.o int r2) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(r2));
        }
    }

    @Override // android.view.View
    @m0(21)
    public void setElevation(float f) {
        super.setElevation(f);
        if (e()) {
            this.f.d().m0(f);
        }
    }

    public void setIcon(@i0 Drawable drawable) {
        if (this.k != drawable) {
            this.k = drawable;
            h(true);
        }
    }

    public void setIconGravity(int r2) {
        if (this.q != r2) {
            this.q = r2;
            i();
        }
    }

    public void setIconPadding(@k0 int r2) {
        if (this.n != r2) {
            this.n = r2;
            setCompoundDrawablePadding(r2);
        }
    }

    public void setIconResource(@q int r2) {
        setIcon(r2 != 0 ? b.a.b.a.a.d(getContext(), r2) : null);
    }

    public void setIconSize(@k0 int r2) {
        if (r2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.l != r2) {
            this.l = r2;
            h(true);
        }
    }

    public void setIconTint(@i0 ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            h(false);
        }
    }

    public void setIconTintResource(@androidx.annotation.m int r2) {
        setIconTint(b.a.b.a.a.c(getContext(), r2));
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(@i0 c cVar) {
        this.h = cVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        c cVar = this.h;
        if (cVar != null) {
            cVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(@i0 ColorStateList colorStateList) {
        if (e()) {
            this.f.t(colorStateList);
        }
    }

    public void setRippleColorResource(@androidx.annotation.m int r2) {
        if (e()) {
            setRippleColor(b.a.b.a.a.c(getContext(), r2));
        }
    }

    @Override // c.a.b.c.u.s
    public void setShapeAppearanceModel(@h0 o oVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f.u(oVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        if (e()) {
            this.f.v(z);
        }
    }

    public void setStrokeColor(@i0 ColorStateList colorStateList) {
        if (e()) {
            this.f.w(colorStateList);
        }
    }

    public void setStrokeColorResource(@androidx.annotation.m int r2) {
        if (e()) {
            setStrokeColor(b.a.b.a.a.c(getContext(), r2));
        }
    }

    public void setStrokeWidth(@k0 int r2) {
        if (e()) {
            this.f.x(r2);
        }
    }

    public void setStrokeWidthResource(@androidx.annotation.o int r2) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(r2));
        }
    }

    @Override // androidx.appcompat.widget.g, b.i.p.d0
    @p0({p0.a.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@i0 ColorStateList colorStateList) {
        if (e()) {
            this.f.y(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.g, b.i.p.d0
    @p0({p0.a.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@i0 PorterDuff.Mode mode) {
        if (e()) {
            this.f.z(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.o);
    }
}
