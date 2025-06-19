package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActivityChooserView;
import b.a.a;
import b.i.p.o0;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"UnknownNullness"})
@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements d0, b.i.p.w, b.i.p.u, b.i.p.v {
    private static final String I = "ActionBarOverlayLayout";
    private static final int J = 600;
    static final int[] K = {a.b.actionBarSize, R.attr.windowContentOverlay};

    @androidx.annotation.h0
    private b.i.p.o0 A;
    private d B;
    private OverScroller C;
    ViewPropertyAnimator D;
    final AnimatorListenerAdapter E;
    private final Runnable F;
    private final Runnable G;
    private final b.i.p.x H;
    private int d;
    private int e;
    private ContentFrameLayout f;
    ActionBarContainer g;
    private e0 h;
    private Drawable i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    boolean n;
    private int o;
    private int p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;

    @androidx.annotation.h0
    private b.i.p.o0 x;

    @androidx.annotation.h0
    private b.i.p.o0 y;

    @androidx.annotation.h0
    private b.i.p.o0 z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.D = null;
            actionBarOverlayLayout.n = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.D = null;
            actionBarOverlayLayout.n = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.y();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.D = actionBarOverlayLayout.g.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.E);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.y();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.D = actionBarOverlayLayout.g.animate().translationY(-ActionBarOverlayLayout.this.g.getHeight()).setListener(ActionBarOverlayLayout.this.E);
        }
    }

    public interface d {
        void a();

        void b();

        void c();

        void d(boolean z);

        void e();

        void onWindowVisibilityChanged(int r1);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int r1, int r2) {
            super(r1, r2);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ActionBarOverlayLayout(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0;
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        b.i.p.o0 o0Var = b.i.p.o0.f1232c;
        this.x = o0Var;
        this.y = o0Var;
        this.z = o0Var;
        this.A = o0Var;
        this.E = new a();
        this.F = new b();
        this.G = new c();
        z(context);
        this.H = new b.i.p.x(this);
    }

    private void C() {
        y();
        postDelayed(this.G, 600L);
    }

    private void D() {
        y();
        postDelayed(this.F, 600L);
    }

    private void F() {
        y();
        this.F.run();
    }

    private boolean G(float f) {
        this.C.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, ActivityChooserView.f.j);
        return this.C.getFinalY() > this.g.getHeight();
    }

    private void a() {
        y();
        this.G.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean u(@androidx.annotation.h0 android.view.View r3, @androidx.annotation.h0 android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.u(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e0 x(View view) {
        if (view instanceof e0) {
            return (e0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void z(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(K);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.i = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.j = context.getApplicationInfo().targetSdkVersion < 19;
        this.C = new OverScroller(context);
    }

    public boolean A() {
        return this.m;
    }

    public boolean B() {
        return this.k;
    }

    void E() {
        if (this.f == null) {
            this.f = (ContentFrameLayout) findViewById(a.g.action_bar_activity_content);
            this.g = (ActionBarContainer) findViewById(a.g.action_bar_container);
            this.h = x(findViewById(a.g.action_bar));
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void b(Menu menu, n.a aVar) {
        E();
        this.h.b(menu, aVar);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean c() {
        E();
        return this.h.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.d0
    public void d() {
        E();
        this.h.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.i == null || this.j) {
            return;
        }
        int bottom = this.g.getVisibility() == 0 ? (int) (this.g.getBottom() + this.g.getTranslationY() + 0.5f) : 0;
        this.i.setBounds(0, bottom, getWidth(), this.i.getIntrinsicHeight() + bottom);
        this.i.draw(canvas);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean e() {
        E();
        return this.h.e();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean f() {
        E();
        return this.h.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        E();
        boolean zU = u(this.g, rect, true, true, false, true);
        this.t.set(rect);
        g1.a(this, this.t, this.q);
        if (!this.u.equals(this.t)) {
            this.u.set(this.t);
            zU = true;
        }
        if (!this.r.equals(this.q)) {
            this.r.set(this.q);
            zU = true;
        }
        if (zU) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.d0
    public boolean g() {
        E();
        return this.h.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, b.i.p.w
    public int getNestedScrollAxes() {
        return this.H.a();
    }

    @Override // androidx.appcompat.widget.d0
    public CharSequence getTitle() {
        E();
        return this.h.getTitle();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean h() {
        E();
        return this.h.h();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean i() {
        E();
        return this.h.i();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean j() {
        E();
        return this.h.j();
    }

    @Override // b.i.p.u
    public void k(View view, View view2, int r3, int r4) {
        if (r4 == 0) {
            onNestedScrollAccepted(view, view2, r3);
        }
    }

    @Override // b.i.p.u
    public void l(View view, int r2) {
        if (r2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // b.i.p.u
    public void m(View view, int r2, int r3, int[] r4, int r5) {
        if (r5 == 0) {
            onNestedPreScroll(view, r2, r3, r4);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void n(SparseArray<Parcelable> sparseArray) {
        E();
        this.h.E(sparseArray);
    }

    @Override // androidx.appcompat.widget.d0
    public void o(int r2) {
        E();
        if (r2 == 2) {
            this.h.O();
        } else if (r2 == 5) {
            this.h.Q();
        } else {
            if (r2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    @androidx.annotation.m0(21)
    public WindowInsets onApplyWindowInsets(@androidx.annotation.h0 WindowInsets windowInsets) {
        E();
        b.i.p.o0 o0VarC = b.i.p.o0.C(windowInsets);
        boolean zU = u(this.g, new Rect(o0VarC.m(), o0VarC.o(), o0VarC.n(), o0VarC.l()), true, true, false, true);
        b.i.p.f0.n(this, o0VarC, this.q);
        Rect rect = this.q;
        b.i.p.o0 o0VarU = o0VarC.u(rect.left, rect.top, rect.right, rect.bottom);
        this.x = o0VarU;
        boolean z = true;
        if (!this.y.equals(o0VarU)) {
            this.y = this.x;
            zU = true;
        }
        if (this.r.equals(this.q)) {
            z = zU;
        } else {
            this.r.set(this.q);
        }
        if (z) {
            requestLayout();
        }
        return o0VarC.a().c().b().B();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        z(getContext());
        b.i.p.f0.o1(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r6, int r7, int r8, int r9) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int r82 = 0; r82 < childCount; r82++) {
            View childAt = getChildAt(r82);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int r3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int r0 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(r3, r0, measuredWidth + r3, measuredHeight + r0);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int r12, int r13) {
        int measuredHeight;
        b.i.p.o0 o0VarA;
        E();
        measureChildWithMargins(this.g, r12, 0, r13, 0);
        e eVar = (e) this.g.getLayoutParams();
        int r7 = Math.max(0, this.g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int r8 = Math.max(0, this.g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int r9 = View.combineMeasuredStates(0, this.g.getMeasuredState());
        boolean z = (b.i.p.f0.x0(this) & 256) != 0;
        if (z) {
            measuredHeight = this.d;
            if (this.l && this.g.getTabContainer() != null) {
                measuredHeight += this.d;
            }
        } else {
            measuredHeight = this.g.getVisibility() != 8 ? this.g.getMeasuredHeight() : 0;
        }
        this.s.set(this.q);
        if (Build.VERSION.SDK_INT >= 21) {
            this.z = this.x;
        } else {
            this.v.set(this.t);
        }
        if (!this.k && !z) {
            Rect rect = this.s;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (Build.VERSION.SDK_INT >= 21) {
                o0VarA = this.z.u(0, measuredHeight, 0, 0);
                this.z = o0VarA;
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            o0VarA = new o0.a(this.z).f(b.i.e.f.a(this.z.m(), this.z.o() + measuredHeight, this.z.n(), this.z.l() + 0)).a();
            this.z = o0VarA;
        } else {
            Rect rect2 = this.v;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        u(this.f, this.s, true, true, true, true);
        if (Build.VERSION.SDK_INT >= 21 && !this.A.equals(this.z)) {
            b.i.p.o0 o0Var = this.z;
            this.A = o0Var;
            b.i.p.f0.o(this.f, o0Var);
        } else if (Build.VERSION.SDK_INT < 21 && !this.w.equals(this.v)) {
            this.w.set(this.v);
            this.f.a(this.v);
        }
        measureChildWithMargins(this.f, r12, 0, r13, 0);
        e eVar2 = (e) this.f.getLayoutParams();
        int r1 = Math.max(r7, this.f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int r0 = Math.max(r8, this.f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int r2 = View.combineMeasuredStates(r9, this.f.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(r1 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), r12, r2), View.resolveSizeAndState(Math.max(r0 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), r13, r2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.m || !z) {
            return false;
        }
        if (G(f2)) {
            a();
        } else {
            F();
        }
        this.n = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onNestedPreScroll(View view, int r2, int r3, int[] r4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onNestedScroll(View view, int r2, int r3, int r4, int r5) {
        int r1 = this.o + r3;
        this.o = r1;
        setActionBarHideOffset(r1);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onNestedScrollAccepted(View view, View view2, int r4) {
        this.H.b(view, view2, r4);
        this.o = getActionBarHideOffset();
        y();
        d dVar = this.B;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public boolean onStartNestedScroll(View view, View view2, int r3) {
        if ((r3 & 2) == 0 || this.g.getVisibility() != 0) {
            return false;
        }
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onStopNestedScroll(View view) {
        if (this.m && !this.n) {
            if (this.o <= this.g.getHeight()) {
                D();
            } else {
                C();
            }
        }
        d dVar = this.B;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int r5) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(r5);
        }
        E();
        int r0 = this.p ^ r5;
        this.p = r5;
        boolean z = (r5 & 4) == 0;
        boolean z2 = (r5 & 256) != 0;
        d dVar = this.B;
        if (dVar != null) {
            dVar.d(!z2);
            if (z || !z2) {
                this.B.a();
            } else {
                this.B.e();
            }
        }
        if ((r0 & 256) == 0 || this.B == null) {
            return;
        }
        b.i.p.f0.o1(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int r2) {
        super.onWindowVisibilityChanged(r2);
        this.e = r2;
        d dVar = this.B;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(r2);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void p() {
        E();
        this.h.l();
    }

    @Override // androidx.appcompat.widget.d0
    public void q(SparseArray<Parcelable> sparseArray) {
        E();
        this.h.u(sparseArray);
    }

    @Override // b.i.p.v
    public void r(View view, int r2, int r3, int r4, int r5, int r6, int[] r7) {
        s(view, r2, r3, r4, r5, r6);
    }

    @Override // b.i.p.u
    public void s(View view, int r2, int r3, int r4, int r5, int r6) {
        if (r6 == 0) {
            onNestedScroll(view, r2, r3, r4, r5);
        }
    }

    public void setActionBarHideOffset(int r2) {
        y();
        this.g.setTranslationY(-Math.max(0, Math.min(r2, this.g.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.B = dVar;
        if (getWindowToken() != null) {
            this.B.onWindowVisibilityChanged(this.e);
            int r2 = this.p;
            if (r2 != 0) {
                onWindowSystemUiVisibilityChanged(r2);
                b.i.p.f0.o1(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.l = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.m) {
            this.m = z;
            if (z) {
                return;
            }
            y();
            setActionBarHideOffset(0);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(int r2) {
        E();
        this.h.setIcon(r2);
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(Drawable drawable) {
        E();
        this.h.setIcon(drawable);
    }

    @Override // androidx.appcompat.widget.d0
    public void setLogo(int r2) {
        E();
        this.h.setLogo(r2);
    }

    public void setOverlayMode(boolean z) {
        this.k = z;
        this.j = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    @Override // androidx.appcompat.widget.d0
    public void setUiOptions(int r1) {
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowCallback(Window.Callback callback) {
        E();
        this.h.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowTitle(CharSequence charSequence) {
        E();
        this.h.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // b.i.p.u
    public boolean t(View view, View view2, int r3, int r4) {
        return r4 == 0 && onStartNestedScroll(view, view2, r3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void y() {
        removeCallbacks(this.F);
        removeCallbacks(this.G);
        ViewPropertyAnimator viewPropertyAnimator = this.D;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }
}
