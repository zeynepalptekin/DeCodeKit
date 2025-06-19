package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.w;
import androidx.annotation.x0;
import androidx.appcompat.widget.o;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.p;
import b.i.o.i;
import b.i.p.d0;
import b.i.p.f0;
import c.a.b.c.a;
import c.a.b.c.b.h;
import c.a.b.c.b.k;
import c.a.b.c.u.s;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes.dex */
public class FloatingActionButton extends a0 implements d0, p, c.a.b.c.m.a, s, CoordinatorLayout.b {
    public static final int A = 0;
    private static final int B = 470;
    private static final String u = "FloatingActionButton";
    private static final String v = "expandableWidgetHelper";
    private static final int w = a.n.Widget_Design_FloatingActionButton;
    public static final int x = 1;
    public static final int y = 0;
    public static final int z = -1;

    @i0
    private ColorStateList e;

    @i0
    private PorterDuff.Mode f;

    @i0
    private ColorStateList g;

    @i0
    private PorterDuff.Mode h;

    @i0
    private ColorStateList i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    boolean o;
    final Rect p;
    private final Rect q;

    @h0
    private final o r;

    @h0
    private final c.a.b.c.m.c s;
    private com.google.android.material.floatingactionbutton.d t;

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        private static final boolean d = true;

        /* renamed from: a, reason: collision with root package name */
        private Rect f6693a;

        /* renamed from: b, reason: collision with root package name */
        private b f6694b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6695c;

        public BaseBehavior() {
            this.f6695c = d;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.FloatingActionButton_Behavior_Layout);
            this.f6695c = typedArrayObtainStyledAttributes.getBoolean(a.o.FloatingActionButton_Behavior_Layout_behavior_autoHide, d);
            typedArrayObtainStyledAttributes.recycle();
        }

        private static boolean I(@h0 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                return ((CoordinatorLayout.g) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void J(@h0 CoordinatorLayout coordinatorLayout, @h0 FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.p;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) floatingActionButton.getLayoutParams();
            int r4 = 0;
            int r2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) gVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) gVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) {
                r4 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) gVar).topMargin) {
                r4 = -rect.top;
            }
            if (r4 != 0) {
                f0.Z0(floatingActionButton, r4);
            }
            if (r2 != 0) {
                f0.Y0(floatingActionButton, r2);
            }
        }

        private boolean O(@h0 View view, @h0 FloatingActionButton floatingActionButton) {
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) floatingActionButton.getLayoutParams();
            if (this.f6695c && gVar.e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return d;
            }
            return false;
        }

        private boolean P(CoordinatorLayout coordinatorLayout, @h0 AppBarLayout appBarLayout, @h0 FloatingActionButton floatingActionButton) {
            if (!O(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f6693a == null) {
                this.f6693a = new Rect();
            }
            Rect rect = this.f6693a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.p(this.f6694b, false);
                return d;
            }
            floatingActionButton.B(this.f6694b, false);
            return d;
        }

        private boolean Q(@h0 View view, @h0 FloatingActionButton floatingActionButton) {
            if (!O(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.p(this.f6694b, false);
                return d;
            }
            floatingActionButton.B(this.f6694b, false);
            return d;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public boolean b(@h0 CoordinatorLayout coordinatorLayout, @h0 FloatingActionButton floatingActionButton, @h0 Rect rect) {
            Rect rect2 = floatingActionButton.p;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return d;
        }

        public boolean H() {
            return this.f6695c;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public boolean i(CoordinatorLayout coordinatorLayout, @h0 FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                P(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!I(view)) {
                return false;
            }
            Q(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean m(@h0 CoordinatorLayout coordinatorLayout, @h0 FloatingActionButton floatingActionButton, int r8) {
            List<View> listW = coordinatorLayout.w(floatingActionButton);
            int size = listW.size();
            for (int r2 = 0; r2 < size; r2++) {
                View view = listW.get(r2);
                if (!(view instanceof AppBarLayout)) {
                    if (I(view) && Q(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (P(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.N(floatingActionButton, r8);
            J(coordinatorLayout, floatingActionButton);
            return d;
        }

        public void M(boolean z) {
            this.f6695c = z;
        }

        @x0
        public void N(b bVar) {
            this.f6694b = bVar;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void h(@h0 CoordinatorLayout.g gVar) {
            if (gVar.h == 0) {
                gVar.h = 80;
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean b(@h0 CoordinatorLayout coordinatorLayout, @h0 FloatingActionButton floatingActionButton, @h0 Rect rect) {
            return super.b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean H() {
            return super.H();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: K */
        public /* bridge */ /* synthetic */ boolean i(CoordinatorLayout coordinatorLayout, @h0 FloatingActionButton floatingActionButton, View view) {
            return super.i(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: L */
        public /* bridge */ /* synthetic */ boolean m(@h0 CoordinatorLayout coordinatorLayout, @h0 FloatingActionButton floatingActionButton, int r3) {
            return super.m(coordinatorLayout, floatingActionButton, r3);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void M(boolean z) {
            super.M(z);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        @x0
        public /* bridge */ /* synthetic */ void N(b bVar) {
            super.N(bVar);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void h(@h0 CoordinatorLayout.g gVar) {
            super.h(gVar);
        }
    }

    class a implements d.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f6696a;

        a(b bVar) {
            this.f6696a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void a() {
            this.f6696a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void b() {
            this.f6696a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    private class c implements c.a.b.c.t.c {
        c() {
        }

        @Override // c.a.b.c.t.c
        public void a(@i0 Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // c.a.b.c.t.c
        public void b(int r3, int r4, int r5, int r6) {
            FloatingActionButton.this.p.set(r3, r4, r5, r6);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(r3 + floatingActionButton.m, r4 + FloatingActionButton.this.m, r5 + FloatingActionButton.this.m, r6 + FloatingActionButton.this.m);
        }

        @Override // c.a.b.c.t.c
        public boolean c() {
            return FloatingActionButton.this.o;
        }

        @Override // c.a.b.c.t.c
        public float d() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface d {
    }

    class e<T extends FloatingActionButton> implements d.i {

        /* renamed from: a, reason: collision with root package name */
        @h0
        private final k<T> f6699a;

        e(@h0 k<T> kVar) {
            this.f6699a = kVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public void a() {
            this.f6699a.a(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public void b() {
            this.f6699a.b(FloatingActionButton.this);
        }

        public boolean equals(@i0 Object obj) {
            return (obj instanceof e) && ((e) obj).f6699a.equals(this.f6699a);
        }

        public int hashCode() {
            return this.f6699a.hashCode();
        }
    }

    public FloatingActionButton(@h0 Context context) {
        this(context, null);
    }

    public FloatingActionButton(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.floatingActionButtonStyle);
    }

    public FloatingActionButton(@h0 Context context, @i0 AttributeSet attributeSet, int r13) throws Resources.NotFoundException {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r13, w), attributeSet, r13);
        this.p = new Rect();
        this.q = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayJ = com.google.android.material.internal.s.j(context2, attributeSet, a.o.FloatingActionButton, r13, w, new int[0]);
        this.e = c.a.b.c.r.c.a(context2, typedArrayJ, a.o.FloatingActionButton_backgroundTint);
        this.f = z.j(typedArrayJ.getInt(a.o.FloatingActionButton_backgroundTintMode, -1), null);
        this.i = c.a.b.c.r.c.a(context2, typedArrayJ, a.o.FloatingActionButton_rippleColor);
        this.k = typedArrayJ.getInt(a.o.FloatingActionButton_fabSize, -1);
        this.l = typedArrayJ.getDimensionPixelSize(a.o.FloatingActionButton_fabCustomSize, 0);
        this.j = typedArrayJ.getDimensionPixelSize(a.o.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayJ.getDimension(a.o.FloatingActionButton_elevation, 0.0f);
        float dimension2 = typedArrayJ.getDimension(a.o.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = typedArrayJ.getDimension(a.o.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.o = typedArrayJ.getBoolean(a.o.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(a.f.mtrl_fab_min_touch_target);
        this.n = typedArrayJ.getDimensionPixelSize(a.o.FloatingActionButton_maxImageSize, 0);
        h hVarC = h.c(context2, typedArrayJ, a.o.FloatingActionButton_showMotionSpec);
        h hVarC2 = h.c(context2, typedArrayJ, a.o.FloatingActionButton_hideMotionSpec);
        c.a.b.c.u.o oVarM = c.a.b.c.u.o.g(context2, attributeSet, r13, w, c.a.b.c.u.o.m).m();
        boolean z2 = typedArrayJ.getBoolean(a.o.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayJ.getBoolean(a.o.FloatingActionButton_android_enabled, true));
        typedArrayJ.recycle();
        o oVar = new o(this);
        this.r = oVar;
        oVar.f(attributeSet, r13);
        this.s = new c.a.b.c.m.c(this);
        getImpl().a0(oVarM);
        getImpl().x(this.e, this.f, this.i, this.j);
        getImpl().W(dimensionPixelSize);
        getImpl().Q(dimension);
        getImpl().T(dimension2);
        getImpl().X(dimension3);
        getImpl().V(this.n);
        getImpl().b0(hVarC);
        getImpl().S(hVarC2);
        getImpl().R(z2);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @i0
    private d.j C(@i0 b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    private com.google.android.material.floatingactionbutton.d getImpl() {
        if (this.t == null) {
            this.t = j();
        }
        return this.t;
    }

    @h0
    private com.google.android.material.floatingactionbutton.d j() {
        return Build.VERSION.SDK_INT >= 21 ? new com.google.android.material.floatingactionbutton.e(this, new c()) : new com.google.android.material.floatingactionbutton.d(this, new c());
    }

    private int m(int r4) {
        int r0 = this.l;
        if (r0 != 0) {
            return r0;
        }
        Resources resources = getResources();
        if (r4 != -1) {
            return resources.getDimensionPixelSize(r4 != 1 ? a.f.design_fab_size_normal : a.f.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < B ? m(1) : m(0);
    }

    private void s(@h0 Rect rect) {
        int r0 = rect.left;
        Rect rect2 = this.p;
        rect.left = r0 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void t() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.g;
        if (colorStateList == null) {
            androidx.core.graphics.drawable.a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.h;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(androidx.appcompat.widget.k.e(colorForState, mode));
    }

    private static int x(int r2, int r3) {
        int mode = View.MeasureSpec.getMode(r3);
        int size = View.MeasureSpec.getSize(r3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(r2, size);
        }
        if (mode == 0) {
            return r2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    public void A(@i0 b bVar) {
        B(bVar, true);
    }

    void B(@i0 b bVar, boolean z2) {
        getImpl().f0(C(bVar), z2);
    }

    @Override // c.a.b.c.m.b
    public boolean a(boolean z2) {
        return this.s.f(z2);
    }

    @Override // c.a.b.c.m.b
    public boolean b() {
        return this.s.c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().E(getDrawableState());
    }

    public void f(@h0 Animator.AnimatorListener animatorListener) {
        getImpl().d(animatorListener);
    }

    public void g(@h0 Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    @Override // android.view.View
    @i0
    public ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    @i0
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @h0
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().t();
    }

    @i0
    public Drawable getContentBackground() {
        return getImpl().k();
    }

    @k0
    public int getCustomSize() {
        return this.l;
    }

    @Override // c.a.b.c.m.a
    public int getExpandedComponentIdHint() {
        return this.s.b();
    }

    @i0
    public h getHideMotionSpec() {
        return getImpl().p();
    }

    @androidx.annotation.k
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.i;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @i0
    public ColorStateList getRippleColorStateList() {
        return this.i;
    }

    @Override // c.a.b.c.u.s
    @h0
    public c.a.b.c.u.o getShapeAppearanceModel() {
        return (c.a.b.c.u.o) i.f(getImpl().u());
    }

    @i0
    public h getShowMotionSpec() {
        return getImpl().v();
    }

    public int getSize() {
        return this.k;
    }

    int getSizeDimension() {
        return m(this.k);
    }

    @Override // b.i.p.d0
    @i0
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // b.i.p.d0
    @i0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.p
    @i0
    public ColorStateList getSupportImageTintList() {
        return this.g;
    }

    @Override // androidx.core.widget.p
    @i0
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.h;
    }

    public boolean getUseCompatPadding() {
        return this.o;
    }

    public void h(@h0 k<? extends FloatingActionButton> kVar) {
        getImpl().f(new e(kVar));
    }

    public void i() {
        setCustomSize(0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A();
    }

    @Deprecated
    public boolean k(@h0 Rect rect) {
        if (!f0.P0(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        s(rect);
        return true;
    }

    public void l(@h0 Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        s(rect);
    }

    public void n() {
        o(null);
    }

    public void o(@i0 b bVar) {
        p(bVar, true);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().D();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int r3, int r4) {
        int sizeDimension = getSizeDimension();
        this.m = (sizeDimension - this.n) / 2;
        getImpl().i0();
        int r32 = Math.min(x(sizeDimension, r3), x(sizeDimension, r4));
        Rect rect = this.p;
        setMeasuredDimension(rect.left + r32 + rect.right, r32 + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c.a.b.c.w.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c.a.b.c.w.a aVar = (c.a.b.c.w.a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        this.s.d((Bundle) i.f(aVar.f.get(v)));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        c.a.b.c.w.a aVar = new c.a.b.c.w.a(parcelableOnSaveInstanceState);
        aVar.f.put(v, this.s.e());
        return aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@h0 MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && k(this.q) && !this.q.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    void p(@i0 b bVar, boolean z2) {
        getImpl().w(C(bVar), z2);
    }

    public boolean q() {
        return getImpl().y();
    }

    public boolean r() {
        return getImpl().z();
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
        Log.i(u, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i(u, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        Log.i(u, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@i0 ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            getImpl().O(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@i0 PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            getImpl().P(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().Q(f);
    }

    public void setCompatElevationResource(@androidx.annotation.o int r2) {
        setCompatElevation(getResources().getDimension(r2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().T(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(@androidx.annotation.o int r2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(r2));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().X(f);
    }

    public void setCompatPressedTranslationZResource(@androidx.annotation.o int r2) {
        setCompatPressedTranslationZ(getResources().getDimension(r2));
    }

    public void setCustomSize(@k0 int r2) {
        if (r2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (r2 != this.l) {
            this.l = r2;
            requestLayout();
        }
    }

    @Override // android.view.View
    @m0(21)
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().j0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        if (z2 != getImpl().o()) {
            getImpl().R(z2);
            requestLayout();
        }
    }

    @Override // c.a.b.c.m.a
    public void setExpandedComponentIdHint(@w int r2) {
        this.s.g(r2);
    }

    public void setHideMotionSpec(@i0 h hVar) {
        getImpl().S(hVar);
    }

    public void setHideMotionSpecResource(@androidx.annotation.b int r2) {
        setHideMotionSpec(h.d(getContext(), r2));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@i0 Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().h0();
            if (this.g != null) {
                t();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@q int r2) {
        this.r.g(r2);
        t();
    }

    public void setRippleColor(@androidx.annotation.k int r1) {
        setRippleColor(ColorStateList.valueOf(r1));
    }

    public void setRippleColor(@i0 ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            getImpl().Y(this.i);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().I();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().I();
    }

    @p0({p0.a.LIBRARY_GROUP})
    @x0
    public void setShadowPaddingEnabled(boolean z2) {
        getImpl().Z(z2);
    }

    @Override // c.a.b.c.u.s
    public void setShapeAppearanceModel(@h0 c.a.b.c.u.o oVar) {
        getImpl().a0(oVar);
    }

    public void setShowMotionSpec(@i0 h hVar) {
        getImpl().b0(hVar);
    }

    public void setShowMotionSpecResource(@androidx.annotation.b int r2) {
        setShowMotionSpec(h.d(getContext(), r2));
    }

    public void setSize(int r2) {
        this.l = 0;
        if (r2 != this.k) {
            this.k = r2;
            requestLayout();
        }
    }

    @Override // b.i.p.d0
    public void setSupportBackgroundTintList(@i0 ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // b.i.p.d0
    public void setSupportBackgroundTintMode(@i0 PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.p
    public void setSupportImageTintList(@i0 ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            t();
        }
    }

    @Override // androidx.core.widget.p
    public void setSupportImageTintMode(@i0 PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            t();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.o != z2) {
            this.o = z2;
            getImpl().C();
        }
    }

    @Override // com.google.android.material.internal.a0, android.widget.ImageView, android.view.View
    public void setVisibility(int r1) {
        super.setVisibility(r1);
    }

    public void u(@h0 Animator.AnimatorListener animatorListener) {
        getImpl().K(animatorListener);
    }

    public void v(@h0 Animator.AnimatorListener animatorListener) {
        getImpl().L(animatorListener);
    }

    public void w(@h0 k<? extends FloatingActionButton> kVar) {
        getImpl().M(new e(kVar));
    }

    public boolean y() {
        return getImpl().o();
    }

    public void z() {
        A(null);
    }
}
