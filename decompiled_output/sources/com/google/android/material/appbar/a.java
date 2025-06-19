package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.t0;
import androidx.annotation.z;
import androidx.appcompat.widget.Toolbar;
import b.a.a;
import b.i.p.f0;
import b.i.p.o0;
import b.i.p.y;
import c.a.b.c.a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.s;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class a extends FrameLayout {
    private static final int A = a.n.Widget_Design_CollapsingToolbar;
    private static final int B = 600;
    private boolean d;
    private int e;

    @i0
    private Toolbar f;

    @i0
    private View g;
    private View h;
    private int i;
    private int j;
    private int k;
    private int l;
    private final Rect m;

    @h0
    final com.google.android.material.internal.a n;
    private boolean o;
    private boolean p;

    @i0
    private Drawable q;

    @i0
    Drawable r;
    private int s;
    private boolean t;
    private ValueAnimator u;
    private long v;
    private int w;
    private AppBarLayout.e x;
    int y;

    @i0
    o0 z;

    /* renamed from: com.google.android.material.appbar.a$a, reason: collision with other inner class name */
    class C0191a implements y {
        C0191a() {
        }

        @Override // b.i.p.y
        public o0 a(View view, @h0 o0 o0Var) {
            return a.this.k(o0Var);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
            a.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static class c extends FrameLayout.LayoutParams {

        /* renamed from: c, reason: collision with root package name */
        private static final float f6601c = 0.5f;
        public static final int d = 0;
        public static final int e = 1;
        public static final int f = 2;

        /* renamed from: a, reason: collision with root package name */
        int f6602a;

        /* renamed from: b, reason: collision with root package name */
        float f6603b;

        public c(int r1, int r2) {
            super(r1, r2);
            this.f6602a = 0;
            this.f6603b = f6601c;
        }

        public c(int r1, int r2, int r3) {
            super(r1, r2, r3);
            this.f6602a = 0;
            this.f6603b = f6601c;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6602a = 0;
            this.f6603b = f6601c;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.CollapsingToolbarLayout_Layout);
            this.f6602a = typedArrayObtainStyledAttributes.getInt(a.o.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            d(typedArrayObtainStyledAttributes.getFloat(a.o.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, f6601c));
            typedArrayObtainStyledAttributes.recycle();
        }

        public c(@h0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6602a = 0;
            this.f6603b = f6601c;
        }

        public c(@h0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6602a = 0;
            this.f6603b = f6601c;
        }

        @m0(19)
        public c(@h0 FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6602a = 0;
            this.f6603b = f6601c;
        }

        public int a() {
            return this.f6602a;
        }

        public float b() {
            return this.f6603b;
        }

        public void c(int r1) {
            this.f6602a = r1;
        }

        public void d(float f2) {
            this.f6603b = f2;
        }
    }

    private class d implements AppBarLayout.e {
        d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.e, com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, int r10) {
            int r3;
            a aVar = a.this;
            aVar.y = r10;
            o0 o0Var = aVar.z;
            int r9 = o0Var != null ? o0Var.o() : 0;
            int childCount = a.this.getChildCount();
            for (int r2 = 0; r2 < childCount; r2++) {
                View childAt = a.this.getChildAt(r2);
                c cVar = (c) childAt.getLayoutParams();
                e eVarH = a.h(childAt);
                int r6 = cVar.f6602a;
                if (r6 == 1) {
                    r3 = b.i.i.a.c(-r10, 0, a.this.g(childAt));
                } else if (r6 == 2) {
                    r3 = Math.round((-r10) * cVar.f6603b);
                }
                eVarH.k(r3);
            }
            a.this.p();
            a aVar2 = a.this;
            if (aVar2.r != null && r9 > 0) {
                f0.g1(aVar2);
            }
            a.this.n.h0(Math.abs(r10) / ((a.this.getHeight() - f0.b0(a.this)) - r9));
        }
    }

    public a(@h0 Context context) {
        this(context, null);
    }

    public a(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(@h0 Context context, @i0 AttributeSet attributeSet, int r11) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r11, A), attributeSet, r11);
        this.d = true;
        this.m = new Rect();
        this.w = -1;
        Context context2 = getContext();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.n = aVar;
        aVar.n0(c.a.b.c.b.a.e);
        TypedArray typedArrayJ = s.j(context2, attributeSet, a.o.CollapsingToolbarLayout, r11, A, new int[0]);
        this.n.d0(typedArrayJ.getInt(a.o.CollapsingToolbarLayout_expandedTitleGravity, c.a.b.c.c.a.w));
        this.n.U(typedArrayJ.getInt(a.o.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = typedArrayJ.getDimensionPixelSize(a.o.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.l = dimensionPixelSize;
        this.k = dimensionPixelSize;
        this.j = dimensionPixelSize;
        this.i = dimensionPixelSize;
        if (typedArrayJ.hasValue(a.o.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.i = typedArrayJ.getDimensionPixelSize(a.o.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayJ.hasValue(a.o.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.k = typedArrayJ.getDimensionPixelSize(a.o.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayJ.hasValue(a.o.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.j = typedArrayJ.getDimensionPixelSize(a.o.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayJ.hasValue(a.o.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.l = typedArrayJ.getDimensionPixelSize(a.o.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.o = typedArrayJ.getBoolean(a.o.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayJ.getText(a.o.CollapsingToolbarLayout_title));
        this.n.a0(a.n.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.n.R(a.l.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayJ.hasValue(a.o.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.n.a0(typedArrayJ.getResourceId(a.o.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayJ.hasValue(a.o.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.n.R(typedArrayJ.getResourceId(a.o.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.w = typedArrayJ.getDimensionPixelSize(a.o.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (typedArrayJ.hasValue(a.o.CollapsingToolbarLayout_maxLines)) {
            this.n.j0(typedArrayJ.getInt(a.o.CollapsingToolbarLayout_maxLines, 1));
        }
        this.v = typedArrayJ.getInt(a.o.CollapsingToolbarLayout_scrimAnimationDuration, B);
        setContentScrim(typedArrayJ.getDrawable(a.o.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayJ.getDrawable(a.o.CollapsingToolbarLayout_statusBarScrim));
        this.e = typedArrayJ.getResourceId(a.o.CollapsingToolbarLayout_toolbarId, -1);
        typedArrayJ.recycle();
        setWillNotDraw(false);
        f0.T1(this, new C0191a());
    }

    private void a(int r5) {
        b();
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.u = valueAnimator2;
            valueAnimator2.setDuration(this.v);
            this.u.setInterpolator(r5 > this.s ? c.a.b.c.b.a.f1937c : c.a.b.c.b.a.d);
            this.u.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.u.cancel();
        }
        this.u.setIntValues(this.s, r5);
        this.u.start();
    }

    private void b() {
        if (this.d) {
            Toolbar toolbar = null;
            this.f = null;
            this.g = null;
            int r1 = this.e;
            if (r1 != -1) {
                Toolbar toolbar2 = (Toolbar) findViewById(r1);
                this.f = toolbar2;
                if (toolbar2 != null) {
                    this.g = c(toolbar2);
                }
            }
            if (this.f == null) {
                int childCount = getChildCount();
                int r3 = 0;
                while (true) {
                    if (r3 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(r3);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    r3++;
                }
                this.f = toolbar;
            }
            o();
            this.d = false;
        }
    }

    @h0
    private View c(@h0 View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    private static int f(@h0 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @h0
    static e h(@h0 View view) {
        e eVar = (e) view.getTag(a.h.view_offset_helper);
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(view);
        view.setTag(a.h.view_offset_helper, eVar2);
        return eVar2;
    }

    private boolean j(View view) {
        View view2 = this.g;
        if (view2 == null || view2 == this) {
            if (view == this.f) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    private void n() {
        setContentDescription(getTitle());
    }

    private void o() {
        View view;
        if (!this.o && (view = this.h) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.h);
            }
        }
        if (!this.o || this.f == null) {
            return;
        }
        if (this.h == null) {
            this.h = new View(getContext());
        }
        if (this.h.getParent() == null) {
            this.f.addView(this.h, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    @Override // android.view.View
    public void draw(@h0 Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        b();
        if (this.f == null && (drawable = this.q) != null && this.s > 0) {
            drawable.mutate().setAlpha(this.s);
            this.q.draw(canvas);
        }
        if (this.o && this.p) {
            this.n.j(canvas);
        }
        if (this.r == null || this.s <= 0) {
            return;
        }
        o0 o0Var = this.z;
        int r0 = o0Var != null ? o0Var.o() : 0;
        if (r0 > 0) {
            this.r.setBounds(0, -this.y, getWidth(), r0 - this.y);
            this.r.mutate().setAlpha(this.s);
            this.r.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.q == null || this.s <= 0 || !j(view)) {
            z = false;
        } else {
            this.q.mutate().setAlpha(this.s);
            this.q.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.r;
        boolean zL0 = false;
        if (drawable != null && drawable.isStateful()) {
            zL0 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null && drawable2.isStateful()) {
            zL0 |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.a aVar = this.n;
        if (aVar != null) {
            zL0 |= aVar.l0(drawableState);
        }
        if (zL0) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    final int g(@h0 View view) {
        return ((getHeight() - h(view).c()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((c) view.getLayoutParams())).bottomMargin;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCollapsedTitleGravity() {
        return this.n.o();
    }

    @h0
    public Typeface getCollapsedTitleTypeface() {
        return this.n.t();
    }

    @i0
    public Drawable getContentScrim() {
        return this.q;
    }

    public int getExpandedTitleGravity() {
        return this.n.y();
    }

    public int getExpandedTitleMarginBottom() {
        return this.l;
    }

    public int getExpandedTitleMarginEnd() {
        return this.k;
    }

    public int getExpandedTitleMarginStart() {
        return this.i;
    }

    public int getExpandedTitleMarginTop() {
        return this.j;
    }

    @h0
    public Typeface getExpandedTitleTypeface() {
        return this.n.B();
    }

    @p0({p0.a.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.n.D();
    }

    int getScrimAlpha() {
        return this.s;
    }

    public long getScrimAnimationDuration() {
        return this.v;
    }

    public int getScrimVisibleHeightTrigger() throws NoSuchFieldException {
        int r0 = this.w;
        if (r0 >= 0) {
            return r0;
        }
        o0 o0Var = this.z;
        int r02 = o0Var != null ? o0Var.o() : 0;
        int r1 = f0.b0(this);
        return r1 > 0 ? Math.min((r1 * 2) + r02, getHeight()) : getHeight() / 3;
    }

    @i0
    public Drawable getStatusBarScrim() {
        return this.r;
    }

    @i0
    public CharSequence getTitle() {
        if (this.o) {
            return this.n.E();
        }
        return null;
    }

    public boolean i() {
        return this.o;
    }

    o0 k(@h0 o0 o0Var) {
        o0 o0Var2 = f0.R(this) ? o0Var : null;
        if (!b.i.o.e.a(this.z, o0Var2)) {
            this.z = o0Var2;
            requestLayout();
        }
        return o0Var.c();
    }

    public void l(int r1, int r2, int r3, int r4) {
        this.i = r1;
        this.j = r2;
        this.k = r3;
        this.l = r4;
        requestLayout();
    }

    public void m(boolean z, boolean z2) {
        if (this.t != z) {
            if (z2) {
                a(z ? 255 : 0);
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.t = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object parent = getParent();
        if (parent instanceof AppBarLayout) {
            f0.H1(this, f0.R((View) parent));
            if (this.x == null) {
                this.x = new d();
            }
            ((AppBarLayout) parent).b(this.x);
            f0.o1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.e eVar = this.x;
        if (eVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).p(eVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r9, int r10, int r11, int r12) {
        View view;
        super.onLayout(z, r9, r10, r11, r12);
        o0 o0Var = this.z;
        if (o0Var != null) {
            int r8 = o0Var.o();
            int childCount = getChildCount();
            for (int r2 = 0; r2 < childCount; r2++) {
                View childAt = getChildAt(r2);
                if (!f0.R(childAt) && childAt.getTop() < r8) {
                    f0.Z0(childAt, r8);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int r1 = 0; r1 < childCount2; r1++) {
            h(getChildAt(r1)).h();
        }
        if (this.o && (view = this.h) != null) {
            boolean z2 = f0.J0(view) && this.h.getVisibility() == 0;
            this.p = z2;
            if (z2) {
                boolean z3 = f0.W(this) == 1;
                View view2 = this.g;
                if (view2 == null) {
                    view2 = this.f;
                }
                int r82 = g(view2);
                com.google.android.material.internal.c.a(this, this.h, this.m);
                com.google.android.material.internal.a aVar = this.n;
                int r3 = this.m.left;
                Toolbar toolbar = this.f;
                int titleMarginEnd = r3 + (z3 ? toolbar.getTitleMarginEnd() : toolbar.getTitleMarginStart());
                int titleMarginTop = this.m.top + r82 + this.f.getTitleMarginTop();
                int r5 = this.m.right;
                Toolbar toolbar2 = this.f;
                aVar.P(titleMarginEnd, titleMarginTop, r5 - (z3 ? toolbar2.getTitleMarginStart() : toolbar2.getTitleMarginEnd()), (this.m.bottom + r82) - this.f.getTitleMarginBottom());
                this.n.Y(z3 ? this.k : this.i, this.m.top + this.j, (r11 - r9) - (z3 ? this.i : this.k), (r12 - r10) - this.l);
                this.n.N();
            }
        }
        if (this.f != null) {
            if (this.o && TextUtils.isEmpty(this.n.E())) {
                setTitle(this.f.getTitle());
            }
            View view3 = this.g;
            if (view3 == null || view3 == this) {
                view3 = this.f;
            }
            setMinimumHeight(f(view3));
        }
        p();
        int childCount3 = getChildCount();
        for (int r0 = 0; r0 < childCount3; r0++) {
            h(getChildAt(r0)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r2, int r3) {
        b();
        super.onMeasure(r2, r3);
        int mode = View.MeasureSpec.getMode(r3);
        o0 o0Var = this.z;
        int r0 = o0Var != null ? o0Var.o() : 0;
        if (mode != 0 || r0 <= 0) {
            return;
        }
        super.onMeasure(r2, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + r0, 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setBounds(0, 0, r1, r2);
        }
    }

    final void p() {
        if (this.q == null && this.r == null) {
            return;
        }
        setScrimsShown(getHeight() + this.y < getScrimVisibleHeightTrigger());
    }

    public void setCollapsedTitleGravity(int r2) {
        this.n.U(r2);
    }

    public void setCollapsedTitleTextAppearance(@t0 int r2) {
        this.n.R(r2);
    }

    public void setCollapsedTitleTextColor(@k int r1) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(r1));
    }

    public void setCollapsedTitleTextColor(@h0 ColorStateList colorStateList) {
        this.n.T(colorStateList);
    }

    public void setCollapsedTitleTypeface(@i0 Typeface typeface) {
        this.n.W(typeface);
    }

    public void setContentScrim(@i0 Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.q = drawableMutate;
            if (drawableMutate != null) {
                drawableMutate.setBounds(0, 0, getWidth(), getHeight());
                this.q.setCallback(this);
                this.q.setAlpha(this.s);
            }
            f0.g1(this);
        }
    }

    public void setContentScrimColor(@k int r2) {
        setContentScrim(new ColorDrawable(r2));
    }

    public void setContentScrimResource(@q int r2) {
        setContentScrim(b.i.c.c.h(getContext(), r2));
    }

    public void setExpandedTitleColor(@k int r1) {
        setExpandedTitleTextColor(ColorStateList.valueOf(r1));
    }

    public void setExpandedTitleGravity(int r2) {
        this.n.d0(r2);
    }

    public void setExpandedTitleMarginBottom(int r1) {
        this.l = r1;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int r1) {
        this.k = r1;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int r1) {
        this.i = r1;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int r1) {
        this.j = r1;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@t0 int r2) {
        this.n.a0(r2);
    }

    public void setExpandedTitleTextColor(@h0 ColorStateList colorStateList) {
        this.n.c0(colorStateList);
    }

    public void setExpandedTitleTypeface(@i0 Typeface typeface) {
        this.n.f0(typeface);
    }

    @p0({p0.a.LIBRARY_GROUP})
    public void setMaxLines(int r2) {
        this.n.j0(r2);
    }

    void setScrimAlpha(int r2) {
        Toolbar toolbar;
        if (r2 != this.s) {
            if (this.q != null && (toolbar = this.f) != null) {
                f0.g1(toolbar);
            }
            this.s = r2;
            f0.g1(this);
        }
    }

    public void setScrimAnimationDuration(@z(from = FabTransformationScrimBehavior.j) long j) {
        this.v = j;
    }

    public void setScrimVisibleHeightTrigger(@z(from = FabTransformationScrimBehavior.j) int r2) {
        if (this.w != r2) {
            this.w = r2;
            p();
        }
    }

    public void setScrimsShown(boolean z) {
        m(z, f0.P0(this) && !isInEditMode());
    }

    public void setStatusBarScrim(@i0 Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.r = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.r.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.r, f0.W(this));
                this.r.setVisible(getVisibility() == 0, false);
                this.r.setCallback(this);
                this.r.setAlpha(this.s);
            }
            f0.g1(this);
        }
    }

    public void setStatusBarScrimColor(@k int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarScrim(new ColorDrawable(r2));
    }

    public void setStatusBarScrimResource(@q int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarScrim(b.i.c.c.h(getContext(), r2));
    }

    public void setTitle(@i0 CharSequence charSequence) {
        this.n.m0(charSequence);
        n();
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.o) {
            this.o = z;
            n();
            o();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
        super.setVisibility(r3);
        boolean z = r3 == 0;
        Drawable drawable = this.r;
        if (drawable != null && drawable.isVisible() != z) {
            this.r.setVisible(z, false);
        }
        Drawable drawable2 = this.q;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.q.setVisible(z, false);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@h0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q || drawable == this.r;
    }
}
