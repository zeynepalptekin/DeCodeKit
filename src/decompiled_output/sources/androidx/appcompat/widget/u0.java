package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import b.a.a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class u0 extends CompoundButton {
    private static final int Q = 250;
    private static final int R = 0;
    private static final int S = 1;
    private static final int T = 2;
    private static final String U = "android.widget.Switch";
    private static final int V = 1;
    private static final int W = 2;
    private static final int a0 = 3;
    private static final Property<u0, Float> b0 = new a(Float.class, "thumbPos");
    private static final int[] c0 = {R.attr.state_checked};
    float A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private final TextPaint I;
    private ColorStateList J;
    private Layout K;
    private Layout L;
    private TransformationMethod M;
    ObjectAnimator N;
    private final z O;
    private final Rect P;
    private Drawable d;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private boolean g;
    private boolean h;
    private Drawable i;
    private ColorStateList j;
    private PorterDuff.Mode k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private CharSequence r;
    private CharSequence s;
    private boolean t;
    private int u;
    private int v;
    private float w;
    private float x;
    private VelocityTracker y;
    private int z;

    class a extends Property<u0, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(u0 u0Var) {
            return Float.valueOf(u0Var.A);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(u0 u0Var, Float f) {
            u0Var.setThumbPosition(f.floatValue());
        }
    }

    public u0(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public u0(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.switchStyle);
    }

    public u0(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r14) throws Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet, r14);
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = false;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = false;
        this.y = VelocityTracker.obtain();
        this.P = new Rect();
        v0.a(this, getContext());
        this.I = new TextPaint(1);
        Resources resources = getResources();
        this.I.density = resources.getDisplayMetrics().density;
        a1 a1VarG = a1.G(context, attributeSet, a.m.SwitchCompat, r14, 0);
        b.i.p.f0.s1(this, context, a.m.SwitchCompat, attributeSet, a1VarG.B(), r14, 0);
        Drawable drawableH = a1VarG.h(a.m.SwitchCompat_android_thumb);
        this.d = drawableH;
        if (drawableH != null) {
            drawableH.setCallback(this);
        }
        Drawable drawableH2 = a1VarG.h(a.m.SwitchCompat_track);
        this.i = drawableH2;
        if (drawableH2 != null) {
            drawableH2.setCallback(this);
        }
        this.r = a1VarG.x(a.m.SwitchCompat_android_textOn);
        this.s = a1VarG.x(a.m.SwitchCompat_android_textOff);
        this.t = a1VarG.a(a.m.SwitchCompat_showText, true);
        this.n = a1VarG.g(a.m.SwitchCompat_thumbTextPadding, 0);
        this.o = a1VarG.g(a.m.SwitchCompat_switchMinWidth, 0);
        this.p = a1VarG.g(a.m.SwitchCompat_switchPadding, 0);
        this.q = a1VarG.a(a.m.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListD = a1VarG.d(a.m.SwitchCompat_thumbTint);
        if (colorStateListD != null) {
            this.e = colorStateListD;
            this.g = true;
        }
        PorterDuff.Mode modeE = f0.e(a1VarG.o(a.m.SwitchCompat_thumbTintMode, -1), null);
        if (this.f != modeE) {
            this.f = modeE;
            this.h = true;
        }
        if (this.g || this.h) {
            b();
        }
        ColorStateList colorStateListD2 = a1VarG.d(a.m.SwitchCompat_trackTint);
        if (colorStateListD2 != null) {
            this.j = colorStateListD2;
            this.l = true;
        }
        PorterDuff.Mode modeE2 = f0.e(a1VarG.o(a.m.SwitchCompat_trackTintMode, -1), null);
        if (this.k != modeE2) {
            this.k = modeE2;
            this.m = true;
        }
        if (this.l || this.m) {
            c();
        }
        int r0 = a1VarG.u(a.m.SwitchCompat_switchTextAppearance, 0);
        if (r0 != 0) {
            i(context, r0);
        }
        z zVar = new z(this);
        this.O = zVar;
        zVar.m(attributeSet, r14);
        a1VarG.I();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.v = viewConfiguration.getScaledTouchSlop();
        this.z = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private void a(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, b0, z ? 1.0f : 0.0f);
        this.N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.N.setAutoCancel(true);
        }
        this.N.start();
    }

    private void b() {
        if (this.d != null) {
            if (this.g || this.h) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.r(this.d).mutate();
                this.d = drawableMutate;
                if (this.g) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.e);
                }
                if (this.h) {
                    androidx.core.graphics.drawable.a.p(this.d, this.f);
                }
                if (this.d.isStateful()) {
                    this.d.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        if (this.i != null) {
            if (this.l || this.m) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.r(this.i).mutate();
                this.i = drawableMutate;
                if (this.l) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.j);
                }
                if (this.m) {
                    androidx.core.graphics.drawable.a.p(this.i, this.k);
                }
                if (this.i.isStateful()) {
                    this.i.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private static float f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private boolean g(float f, float f2) {
        if (this.d == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.d.getPadding(this.P);
        int r2 = this.F;
        int r3 = this.v;
        int r22 = r2 - r3;
        int r4 = (this.E + thumbOffset) - r3;
        int r0 = this.D + r4;
        Rect rect = this.P;
        return f > ((float) r4) && f < ((float) (((r0 + rect.left) + rect.right) + r3)) && f2 > ((float) r22) && f2 < ((float) (this.H + r3));
    }

    private boolean getTargetCheckedState() {
        return this.A > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((g1.b(this) ? 1.0f - this.A : this.A) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.i;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.P;
        drawable.getPadding(rect);
        Drawable drawable2 = this.d;
        Rect rectD = drawable2 != null ? f0.d(drawable2) : f0.d;
        return ((((this.B - this.D) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private Layout h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.M;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.I, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k(int r2, int r3) {
        j(r2 != 1 ? r2 != 2 ? r2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, r3);
    }

    private void l(MotionEvent motionEvent) {
        this.u = 0;
        boolean targetCheckedState = true;
        boolean z = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z) {
            this.y.computeCurrentVelocity(1000);
            float xVelocity = this.y.getXVelocity();
            if (Math.abs(xVelocity) <= this.z) {
                targetCheckedState = getTargetCheckedState();
            } else if (!g1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int r7;
        int r6;
        Rect rect = this.P;
        int r1 = this.E;
        int r2 = this.F;
        int r3 = this.G;
        int r4 = this.H;
        int thumbOffset = getThumbOffset() + r1;
        Drawable drawable = this.d;
        Rect rectD = drawable != null ? f0.d(drawable) : f0.d;
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int r72 = rect.left;
            thumbOffset += r72;
            if (rectD != null) {
                int r8 = rectD.left;
                if (r8 > r72) {
                    r1 += r8 - r72;
                }
                int r73 = rectD.top;
                int r82 = rect.top;
                r7 = r73 > r82 ? (r73 - r82) + r2 : r2;
                int r83 = rectD.right;
                int r9 = rect.right;
                if (r83 > r9) {
                    r3 -= r83 - r9;
                }
                int r62 = rectD.bottom;
                int r84 = rect.bottom;
                if (r62 > r84) {
                    r6 = r4 - (r62 - r84);
                }
                this.i.setBounds(r1, r7, r3, r6);
            } else {
                r7 = r2;
            }
            r6 = r4;
            this.i.setBounds(r1, r7, r3, r6);
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int r12 = thumbOffset - rect.left;
            int r5 = thumbOffset + this.D + rect.right;
            this.d.setBounds(r12, r2, r5, r4);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.l(background, r12, r2, r5, r4);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f, f2);
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.k(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.d;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!g1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.p : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (g1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.p : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.t;
    }

    public boolean getSplitTrack() {
        return this.q;
    }

    public int getSwitchMinWidth() {
        return this.o;
    }

    public int getSwitchPadding() {
        return this.p;
    }

    public CharSequence getTextOff() {
        return this.s;
    }

    public CharSequence getTextOn() {
        return this.r;
    }

    public Drawable getThumbDrawable() {
        return this.d;
    }

    public int getThumbTextPadding() {
        return this.n;
    }

    @androidx.annotation.i0
    public ColorStateList getThumbTintList() {
        return this.e;
    }

    @androidx.annotation.i0
    public PorterDuff.Mode getThumbTintMode() {
        return this.f;
    }

    public Drawable getTrackDrawable() {
        return this.i;
    }

    @androidx.annotation.i0
    public ColorStateList getTrackTintList() {
        return this.j;
    }

    @androidx.annotation.i0
    public PorterDuff.Mode getTrackTintMode() {
        return this.k;
    }

    public void i(Context context, int r5) {
        a1 a1VarE = a1.E(context, r5, a.m.TextAppearance);
        ColorStateList colorStateListD = a1VarE.d(a.m.TextAppearance_android_textColor);
        if (colorStateListD == null) {
            colorStateListD = getTextColors();
        }
        this.J = colorStateListD;
        int r52 = a1VarE.g(a.m.TextAppearance_android_textSize, 0);
        if (r52 != 0) {
            float f = r52;
            if (f != this.I.getTextSize()) {
                this.I.setTextSize(f);
                requestLayout();
            }
        }
        k(a1VarE.o(a.m.TextAppearance_android_typeface, -1), a1VarE.o(a.m.TextAppearance_android_textStyle, -1));
        this.M = a1VarE.a(a.m.TextAppearance_textAllCaps, false) ? new b.a.e.a(getContext()) : null;
        a1VarE.I();
    }

    public void j(Typeface typeface, int r5) {
        if (r5 <= 0) {
            this.I.setFakeBoldText(false);
            this.I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(r5) : Typeface.create(typeface, r5);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int r4 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & r5;
            this.I.setFakeBoldText((r4 & 1) != 0);
            this.I.setTextSkewX((r4 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.N.end();
        this.N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(r22, c0);
        }
        return r22;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Rect rect = this.P;
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int r2 = this.F;
        int r3 = this.H;
        int r22 = r2 + rect.top;
        int r32 = r3 - rect.bottom;
        Drawable drawable2 = this.d;
        if (drawable != null) {
            if (!this.q || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = f0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int r5 = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(r5);
            }
        }
        int r0 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.K : this.L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.J;
            if (colorStateList != null) {
                this.I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((r22 + r32) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(r0);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(U);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(U);
        CharSequence charSequence = isChecked() ? this.r : this.s;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int r2, int r3, int r4, int r5) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int r42;
        int width;
        int paddingLeft;
        int r43;
        int paddingTop;
        int height;
        super.onLayout(z, r2, r3, r4, r5);
        int r22 = 0;
        if (this.d != null) {
            Rect rect = this.P;
            Drawable drawable = this.i;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = f0.d(this.d);
            r42 = Math.max(0, rectD.left - rect.left);
            r22 = Math.max(0, rectD.right - rect.right);
        } else {
            r42 = 0;
        }
        if (g1.b(this)) {
            paddingLeft = getPaddingLeft() + r42;
            width = ((this.B + paddingLeft) - r42) - r22;
        } else {
            width = (getWidth() - getPaddingRight()) - r22;
            paddingLeft = (width - this.B) + r42 + r22;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            r43 = this.C;
            paddingTop = paddingTop2 - (r43 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.C;
                this.E = paddingLeft;
                this.F = paddingTop;
                this.H = height;
                this.G = width;
            }
            paddingTop = getPaddingTop();
            r43 = this.C;
        }
        height = r43 + paddingTop;
        this.E = paddingLeft;
        this.F = paddingTop;
        this.H = height;
        this.G = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r7, int r8) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.t) {
            if (this.K == null) {
                this.K = h(this.r);
            }
            if (this.L == null) {
                this.L = h(this.s);
            }
        }
        Rect rect = this.P;
        Drawable drawable = this.d;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.d.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.d.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.D = Math.max(this.t ? Math.max(this.K.getWidth(), this.L.getWidth()) + (this.n * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int r1 = rect.left;
        int r0 = rect.right;
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            Rect rectD = f0.d(drawable3);
            r1 = Math.max(r1, rectD.left);
            r0 = Math.max(r0, rectD.right);
        }
        int r02 = Math.max(this.o, (this.D * 2) + r1 + r0);
        int r12 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.B = r02;
        this.C = r12;
        super.onMeasure(r7, r8);
        if (getMeasuredHeight() < r12) {
            setMeasuredDimension(getMeasuredWidthAndState(), r12);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.r : this.s;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.y
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.u
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.w
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3d
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L39:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            boolean r0 = androidx.appcompat.widget.g1.b(r6)
            if (r0 == 0) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.A
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.A
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.w = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.w
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.v
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.x
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.v
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.u = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.w = r0
            r6.x = r3
            return r1
        L8b:
            int r0 = r6.u
            if (r0 != r2) goto L96
            r6.l(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.u = r0
            android.view.VelocityTracker r0 = r6.y
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.g(r0, r2)
            if (r3 == 0) goto Lb9
            r6.u = r1
            r6.w = r0
            r6.x = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.u0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (getWindowToken() != null && b.i.p.f0.P0(this)) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.m.G(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.t != z) {
            this.t = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.q = z;
        invalidate();
    }

    public void setSwitchMinWidth(int r1) {
        this.o = r1;
        requestLayout();
    }

    public void setSwitchPadding(int r1) {
        this.p = r1;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.I.getTypeface() == null || this.I.getTypeface().equals(typeface)) && (this.I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.s = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.r = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f) {
        this.A = f;
        invalidate();
    }

    public void setThumbResource(int r2) {
        setThumbDrawable(b.a.b.a.a.d(getContext(), r2));
    }

    public void setThumbTextPadding(int r1) {
        this.n = r1;
        requestLayout();
    }

    public void setThumbTintList(@androidx.annotation.i0 ColorStateList colorStateList) {
        this.e = colorStateList;
        this.g = true;
        b();
    }

    public void setThumbTintMode(@androidx.annotation.i0 PorterDuff.Mode mode) {
        this.f = mode;
        this.h = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int r2) {
        setTrackDrawable(b.a.b.a.a.d(getContext(), r2));
    }

    public void setTrackTintList(@androidx.annotation.i0 ColorStateList colorStateList) {
        this.j = colorStateList;
        this.l = true;
        c();
    }

    public void setTrackTintMode(@androidx.annotation.i0 PorterDuff.Mode mode) {
        this.k = mode;
        this.m = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.d || drawable == this.i;
    }
}
