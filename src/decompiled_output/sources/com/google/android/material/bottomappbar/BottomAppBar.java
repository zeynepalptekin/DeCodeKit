package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k0;
import androidx.annotation.p;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.p.f0;
import b.i.p.o0;
import c.a.b.c.a;
import c.a.b.c.u.o;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.s;
import com.google.android.material.internal.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private static final int p0 = a.n.Widget_MaterialComponents_BottomAppBar;
    private static final long q0 = 300;
    public static final int r0 = 0;
    public static final int s0 = 1;
    public static final int t0 = 0;
    public static final int u0 = 1;
    private final int T;
    private final c.a.b.c.u.j U;

    @i0
    private Animator V;

    @i0
    private Animator W;
    private int a0;
    private int b0;
    private boolean c0;
    private final boolean d0;
    private final boolean e0;
    private final boolean f0;
    private int g0;
    private ArrayList<i> h0;
    private boolean i0;
    private Behavior j0;
    private int k0;
    private int l0;
    private int m0;

    @h0
    AnimatorListenerAdapter n0;

    @h0
    c.a.b.c.b.k<FloatingActionButton> o0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        @h0
        private final Rect i;
        private WeakReference<BottomAppBar> j;
        private int k;
        private final View.OnLayoutChangeListener l;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.j.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.l(Behavior.this.i);
                int r42 = Behavior.this.i.height();
                bottomAppBar.Q0(r42);
                CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
                if (Behavior.this.k == 0) {
                    ((ViewGroup.MarginLayoutParams) gVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(a.f.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - r42) / 2));
                    ((ViewGroup.MarginLayoutParams) gVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) gVar).rightMargin = bottomAppBar.getRightInset();
                    if (z.i(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) gVar).leftMargin += bottomAppBar.T;
                    } else {
                        ((ViewGroup.MarginLayoutParams) gVar).rightMargin += bottomAppBar.T;
                    }
                }
            }
        }

        public Behavior() {
            this.l = new a();
            this.i = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.l = new a();
            this.i = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public boolean m(@h0 CoordinatorLayout coordinatorLayout, @h0 BottomAppBar bottomAppBar, int r6) {
            this.j = new WeakReference<>(bottomAppBar);
            View viewE0 = bottomAppBar.E0();
            if (viewE0 != null && !f0.P0(viewE0)) {
                CoordinatorLayout.g gVar = (CoordinatorLayout.g) viewE0.getLayoutParams();
                gVar.d = 49;
                this.k = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                if (viewE0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewE0;
                    floatingActionButton.addOnLayoutChangeListener(this.l);
                    bottomAppBar.w0(floatingActionButton);
                }
                bottomAppBar.P0();
            }
            coordinatorLayout.N(bottomAppBar, r6);
            return super.m(coordinatorLayout, bottomAppBar, r6);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public boolean B(@h0 CoordinatorLayout coordinatorLayout, @h0 BottomAppBar bottomAppBar, @h0 View view, @h0 View view2, int r6, int r7) {
            return bottomAppBar.getHideOnScroll() && super.B(coordinatorLayout, bottomAppBar, view, view2, r6, r7);
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.I0(bottomAppBar.a0, BottomAppBar.this.i0);
        }
    }

    class b implements c.a.b.c.b.k<FloatingActionButton> {
        b() {
        }

        @Override // c.a.b.c.b.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@h0 FloatingActionButton floatingActionButton) {
            BottomAppBar.this.U.o0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // c.a.b.c.b.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(@h0 FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().k() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().p(translationX);
                BottomAppBar.this.U.invalidateSelf();
            }
            float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().e() != fMax) {
                BottomAppBar.this.getTopEdgeTreatment().l(fMax);
                BottomAppBar.this.U.invalidateSelf();
            }
            BottomAppBar.this.U.o0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    class c implements z.e {
        c() {
        }

        @Override // com.google.android.material.internal.z.e
        @h0
        public o0 a(View view, @h0 o0 o0Var, @h0 z.f fVar) {
            boolean z;
            if (BottomAppBar.this.d0) {
                BottomAppBar.this.k0 = o0Var.l();
            }
            boolean z2 = false;
            if (BottomAppBar.this.e0) {
                z = BottomAppBar.this.m0 != o0Var.m();
                BottomAppBar.this.m0 = o0Var.m();
            } else {
                z = false;
            }
            if (BottomAppBar.this.f0) {
                boolean z3 = BottomAppBar.this.l0 != o0Var.n();
                BottomAppBar.this.l0 = o0Var.n();
                z2 = z3;
            }
            if (z || z2) {
                BottomAppBar.this.x0();
                BottomAppBar.this.P0();
                BottomAppBar.this.O0();
            }
            return o0Var;
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.B0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.C0();
        }
    }

    class e extends FloatingActionButton.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6628a;

        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.B0();
            }
        }

        e(int r2) {
            this.f6628a = r2;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(@h0 FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.G0(this.f6628a));
            floatingActionButton.A(new a());
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.B0();
            BottomAppBar.this.W = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.C0();
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f6632a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f6633b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6634c;
        final /* synthetic */ boolean d;

        g(ActionMenuView actionMenuView, int r3, boolean z) {
            this.f6633b = actionMenuView;
            this.f6634c = r3;
            this.d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6632a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6632a) {
                return;
            }
            BottomAppBar.this.R0(this.f6633b, this.f6634c, this.d);
        }
    }

    class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.n0.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonD0 = BottomAppBar.this.D0();
            if (floatingActionButtonD0 != null) {
                floatingActionButtonD0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    interface i {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    static class l extends b.k.b.a {
        public static final Parcelable.Creator<l> CREATOR = new a();
        int f;
        boolean g;

        static class a implements Parcelable.ClassLoaderCreator<l> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @i0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(@h0 Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @h0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(@h0 Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @h0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int r1) {
                return new l[r1];
            }
        }

        public l(@h0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = parcel.readInt();
            this.g = parcel.readInt() != 0;
        }

        public l(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // b.k.b.a, android.os.Parcelable
        public void writeToParcel(@h0 Parcel parcel, int r2) {
            super.writeToParcel(parcel, r2);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    public BottomAppBar(@h0 Context context) {
        this(context, null, 0);
    }

    public BottomAppBar(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.bottomAppBarStyle);
    }

    public BottomAppBar(@h0 Context context, @i0 AttributeSet attributeSet, int r11) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r11, p0), attributeSet, r11);
        this.U = new c.a.b.c.u.j();
        this.g0 = 0;
        this.i0 = true;
        this.n0 = new a();
        this.o0 = new b();
        Context context2 = getContext();
        TypedArray typedArrayJ = s.j(context2, attributeSet, a.o.BottomAppBar, r11, p0, new int[0]);
        ColorStateList colorStateListA = c.a.b.c.r.c.a(context2, typedArrayJ, a.o.BottomAppBar_backgroundTint);
        int dimensionPixelSize = typedArrayJ.getDimensionPixelSize(a.o.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = typedArrayJ.getDimensionPixelOffset(a.o.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = typedArrayJ.getDimensionPixelOffset(a.o.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = typedArrayJ.getDimensionPixelOffset(a.o.BottomAppBar_fabCradleVerticalOffset, 0);
        this.a0 = typedArrayJ.getInt(a.o.BottomAppBar_fabAlignmentMode, 0);
        this.b0 = typedArrayJ.getInt(a.o.BottomAppBar_fabAnimationMode, 0);
        this.c0 = typedArrayJ.getBoolean(a.o.BottomAppBar_hideOnScroll, false);
        this.d0 = typedArrayJ.getBoolean(a.o.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.e0 = typedArrayJ.getBoolean(a.o.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.f0 = typedArrayJ.getBoolean(a.o.BottomAppBar_paddingRightSystemWindowInsets, false);
        typedArrayJ.recycle();
        this.T = getResources().getDimensionPixelOffset(a.f.mtrl_bottomappbar_fabOffsetEndMode);
        this.U.setShapeAppearanceModel(o.a().G(new com.google.android.material.bottomappbar.a(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).m());
        this.U.w0(2);
        this.U.q0(Paint.Style.FILL);
        this.U.Y(context2);
        setElevation(dimensionPixelSize);
        androidx.core.graphics.drawable.a.o(this.U, colorStateListA);
        f0.B1(this, this.U);
        z.b(this, attributeSet, r11, p0, new c());
    }

    private void A0(int r9, boolean z, @h0 List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - F0(actionMenuView, r9, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat.addListener(new g(actionMenuView, r9, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0() {
        ArrayList<i> arrayList;
        int r02 = this.g0 - 1;
        this.g0 = r02;
        if (r02 != 0 || (arrayList = this.h0) == null) {
            return;
        }
        Iterator<i> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() {
        ArrayList<i> arrayList;
        int r02 = this.g0;
        this.g0 = r02 + 1;
        if (r02 != 0 || (arrayList = this.h0) == null) {
            return;
        }
        Iterator<i> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0
    public FloatingActionButton D0() {
        View viewE0 = E0();
        if (viewE0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewE0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0
    public View E0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).x(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float G0(int r4) {
        boolean zI = z.i(this);
        if (r4 == 1) {
            return ((getMeasuredWidth() / 2) - (this.T + (zI ? this.m0 : this.l0))) * (zI ? -1 : 1);
        }
        return 0.0f;
    }

    private boolean H0() {
        FloatingActionButton floatingActionButtonD0 = D0();
        return floatingActionButtonD0 != null && floatingActionButtonD0.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0(int r4, boolean z) {
        if (f0.P0(this)) {
            Animator animator = this.W;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!H0()) {
                r4 = 0;
                z = false;
            }
            A0(r4, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.W = animatorSet;
            animatorSet.addListener(new f());
            this.W.start();
        }
    }

    private void J0(int r4) {
        if (this.a0 == r4 || !f0.P0(this)) {
            return;
        }
        Animator animator = this.V;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.b0 == 1) {
            z0(r4, arrayList);
        } else {
            y0(r4, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.V = animatorSet;
        animatorSet.addListener(new d());
        this.V.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (H0()) {
                R0(actionMenuView, this.a0, this.i0);
            } else {
                R0(actionMenuView, 0, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        getTopEdgeTreatment().p(getFabTranslationX());
        View viewE0 = E0();
        this.U.o0((this.i0 && H0()) ? 1.0f : 0.0f);
        if (viewE0 != null) {
            viewE0.setTranslationY(getFabTranslationY());
            viewE0.setTranslationX(getFabTranslationX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0(@h0 ActionMenuView actionMenuView, int r2, boolean z) {
        actionMenuView.setTranslationX(F0(actionMenuView, r2, z));
    }

    @i0
    private ActionMenuView getActionMenuView() {
        for (int r02 = 0; r02 < getChildCount(); r02++) {
            View childAt = getChildAt(r02);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.k0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return G0(this.a0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.m0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.l0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @h0
    public com.google.android.material.bottomappbar.a getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.a) this.U.getShapeAppearanceModel().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(@h0 FloatingActionButton floatingActionButton) {
        floatingActionButton.f(this.n0);
        floatingActionButton.g(new h());
        floatingActionButton.h(this.o0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0() {
        Animator animator = this.W;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.V;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void z0(int r4, @h0 List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(D0(), "translationX", G0(r4));
        objectAnimatorOfFloat.setDuration(q0);
        list.add(objectAnimatorOfFloat);
    }

    protected int F0(@h0 ActionMenuView actionMenuView, int r8, boolean z) {
        if (r8 != 1 || !z) {
            return 0;
        }
        boolean zI = z.i(this);
        int measuredWidth = zI ? getMeasuredWidth() : 0;
        for (int r2 = 0; r2 < getChildCount(); r2++) {
            View childAt = getChildAt(r2);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f36a & b.i.p.h.d) == 8388611) {
                measuredWidth = zI ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((zI ? actionMenuView.getRight() : actionMenuView.getLeft()) + (zI ? this.l0 : -this.m0));
    }

    public void K0() {
        getBehavior().J(this);
    }

    public void L0() {
        getBehavior().K(this);
    }

    void M0(@h0 i iVar) {
        ArrayList<i> arrayList = this.h0;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(iVar);
    }

    public void N0(@androidx.annotation.f0 int r2) {
        getMenu().clear();
        x(r2);
    }

    boolean Q0(@k0 int r2) {
        float f2 = r2;
        if (f2 == getTopEdgeTreatment().h()) {
            return false;
        }
        getTopEdgeTreatment().o(f2);
        this.U.invalidateSelf();
        return true;
    }

    @i0
    public ColorStateList getBackgroundTint() {
        return this.U.Q();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @h0
    public Behavior getBehavior() {
        if (this.j0 == null) {
            this.j0 = new Behavior();
        }
        return this.j0;
    }

    @p
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().e();
    }

    public int getFabAlignmentMode() {
        return this.a0;
    }

    public int getFabAnimationMode() {
        return this.b0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f();
    }

    @p
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().g();
    }

    public boolean getHideOnScroll() {
        return this.c0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        c.a.b.c.u.k.f(this, this.U);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r2, int r3, int r4, int r5) throws NoSuchFieldException {
        super.onLayout(z, r2, r3, r4, r5);
        if (z) {
            x0();
            P0();
        }
        O0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.a());
        this.a0 = lVar.f;
        this.i0 = lVar.g;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @h0
    protected Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f = this.a0;
        lVar.g = this.i0;
        return lVar;
    }

    public void setBackgroundTint(@i0 ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.o(this.U, colorStateList);
    }

    public void setCradleVerticalOffset(@p float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().l(f2);
            this.U.invalidateSelf();
            P0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        this.U.m0(f2);
        getBehavior().I(this, this.U.J() - this.U.I());
    }

    public void setFabAlignmentMode(int r2) {
        J0(r2);
        I0(r2, this.i0);
        this.a0 = r2;
    }

    public void setFabAnimationMode(int r1) {
        this.b0 = r1;
    }

    public void setFabCradleMargin(@p float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().m(f2);
            this.U.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@p float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().n(f2);
            this.U.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.c0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    void v0(@h0 i iVar) {
        if (this.h0 == null) {
            this.h0 = new ArrayList<>();
        }
        this.h0.add(iVar);
    }

    protected void y0(int r2, List<Animator> list) {
        FloatingActionButton floatingActionButtonD0 = D0();
        if (floatingActionButtonD0 == null || floatingActionButtonD0.q()) {
            return;
        }
        C0();
        floatingActionButtonD0.o(new e(r2));
    }
}
