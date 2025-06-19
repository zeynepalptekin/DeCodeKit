package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.x0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.p.f0;
import c.a.b.c.a;
import c.a.b.c.u.o;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.s;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private static final int I = 0;
    private static final int J = 1;
    private static final int K = 2;
    private final com.google.android.material.floatingactionbutton.a A;

    @h0
    private final com.google.android.material.floatingactionbutton.f B;

    @h0
    private final com.google.android.material.floatingactionbutton.f C;
    private final com.google.android.material.floatingactionbutton.f D;
    private final com.google.android.material.floatingactionbutton.f E;

    @h0
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> F;
    private boolean G;
    private int z;
    private static final int H = a.n.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    static final Property<View, Float> L = new d(Float.class, "width");
    static final Property<View, Float> M = new e(Float.class, "height");

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        private static final boolean f = false;
        private static final boolean g = true;

        /* renamed from: a, reason: collision with root package name */
        private Rect f6685a;

        /* renamed from: b, reason: collision with root package name */
        @i0
        private h f6686b;

        /* renamed from: c, reason: collision with root package name */
        @i0
        private h f6687c;
        private boolean d;
        private boolean e;

        public ExtendedFloatingActionButtonBehavior() {
            this.d = false;
            this.e = g;
        }

        public ExtendedFloatingActionButtonBehavior(@h0 Context context, @i0 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.ExtendedFloatingActionButton_Behavior_Layout);
            this.d = typedArrayObtainStyledAttributes.getBoolean(a.o.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.e = typedArrayObtainStyledAttributes.getBoolean(a.o.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, g);
            typedArrayObtainStyledAttributes.recycle();
        }

        private static boolean K(@h0 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                return ((CoordinatorLayout.g) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean R(@h0 View view, @h0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) extendedFloatingActionButton.getLayoutParams();
            if ((this.d || this.e) && gVar.e() == view.getId()) {
                return g;
            }
            return false;
        }

        private boolean T(CoordinatorLayout coordinatorLayout, @h0 AppBarLayout appBarLayout, @h0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!R(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f6685a == null) {
                this.f6685a = new Rect();
            }
            Rect rect = this.f6685a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                S(extendedFloatingActionButton);
                return g;
            }
            G(extendedFloatingActionButton);
            return g;
        }

        private boolean U(@h0 View view, @h0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!R(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                S(extendedFloatingActionButton);
                return g;
            }
            G(extendedFloatingActionButton);
            return g;
        }

        protected void G(@h0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.E(this.e ? extendedFloatingActionButton.C : extendedFloatingActionButton.D, this.e ? this.f6687c : this.f6686b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean b(@h0 CoordinatorLayout coordinatorLayout, @h0 ExtendedFloatingActionButton extendedFloatingActionButton, @h0 Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean I() {
            return this.d;
        }

        public boolean J() {
            return this.e;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean i(CoordinatorLayout coordinatorLayout, @h0 ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                T(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!K(view)) {
                return false;
            }
            U(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean m(@h0 CoordinatorLayout coordinatorLayout, @h0 ExtendedFloatingActionButton extendedFloatingActionButton, int r8) {
            List<View> listW = coordinatorLayout.w(extendedFloatingActionButton);
            int size = listW.size();
            for (int r2 = 0; r2 < size; r2++) {
                View view = listW.get(r2);
                if (!(view instanceof AppBarLayout)) {
                    if (K(view) && U(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (T(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.N(extendedFloatingActionButton, r8);
            return g;
        }

        public void N(boolean z) {
            this.d = z;
        }

        public void O(boolean z) {
            this.e = z;
        }

        @x0
        void P(@i0 h hVar) {
            this.f6686b = hVar;
        }

        @x0
        void Q(@i0 h hVar) {
            this.f6687c = hVar;
        }

        protected void S(@h0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.E(this.e ? extendedFloatingActionButton.B : extendedFloatingActionButton.E, this.e ? this.f6687c : this.f6686b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void h(@h0 CoordinatorLayout.g gVar) {
            if (gVar.h == 0) {
                gVar.h = 80;
            }
        }
    }

    class a implements j {
        a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getMeasuredWidth();
        }
    }

    class b implements j {
        b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6690a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.floatingactionbutton.f f6691b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f6692c;

        c(com.google.android.material.floatingactionbutton.f fVar, h hVar) {
            this.f6691b = fVar;
            this.f6692c = hVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6690a = true;
            this.f6691b.c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6691b.b();
            if (this.f6690a) {
                return;
            }
            this.f6691b.k(this.f6692c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f6691b.onAnimationStart(animator);
            this.f6690a = false;
        }
    }

    static class d extends Property<View, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @h0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@h0 View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@h0 View view, @h0 Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    static class e extends Property<View, Float> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @h0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@h0 View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@h0 View view, @h0 Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    class f extends com.google.android.material.floatingactionbutton.b {
        private final j g;
        private final boolean h;

        f(com.google.android.material.floatingactionbutton.a aVar, j jVar, boolean z) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.g = jVar;
            this.h = z;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void b() {
            super.b();
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.g.getLayoutParams().width;
            layoutParams.height = this.g.getLayoutParams().height;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int f() {
            return a.b.mtrl_extended_fab_change_size_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void g() {
            ExtendedFloatingActionButton.this.G = this.h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.g.getLayoutParams().width;
            layoutParams.height = this.g.getLayoutParams().height;
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        @h0
        public AnimatorSet i() {
            c.a.b.c.b.h hVarD = d();
            if (hVarD.j("width")) {
                PropertyValuesHolder[] propertyValuesHolderArrG = hVarD.g("width");
                propertyValuesHolderArrG[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.g.getWidth());
                hVarD.l("width", propertyValuesHolderArrG);
            }
            if (hVarD.j("height")) {
                PropertyValuesHolder[] propertyValuesHolderArrG2 = hVarD.g("height");
                propertyValuesHolderArrG2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.g.getHeight());
                hVarD.l("height", propertyValuesHolderArrG2);
            }
            return super.n(hVarD);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void k(@i0 h hVar) {
            if (hVar == null) {
                return;
            }
            if (this.h) {
                hVar.a(ExtendedFloatingActionButton.this);
            } else {
                hVar.d(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean l() {
            return this.h == ExtendedFloatingActionButton.this.G || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.G = this.h;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    class g extends com.google.android.material.floatingactionbutton.b {
        private boolean g;

        public g(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void b() {
            super.b();
            ExtendedFloatingActionButton.this.z = 0;
            if (this.g) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void c() {
            super.c();
            this.g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int f() {
            return a.b.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void g() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void k(@i0 h hVar) {
            if (hVar != null) {
                hVar.b(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean l() {
            return ExtendedFloatingActionButton.this.C();
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.z = 1;
        }
    }

    public static abstract class h {
        public void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void b(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    class i extends com.google.android.material.floatingactionbutton.b {
        public i(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void b() {
            super.b();
            ExtendedFloatingActionButton.this.z = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int f() {
            return a.b.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void g() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void k(@i0 h hVar) {
            if (hVar != null) {
                hVar.c(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean l() {
            return ExtendedFloatingActionButton.this.D();
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.z = 2;
        }
    }

    interface j {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@h0 Context context) {
        this(context, null);
    }

    public ExtendedFloatingActionButton(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(@h0 Context context, @i0 AttributeSet attributeSet, int r13) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r13, H), attributeSet, r13);
        this.z = 0;
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a();
        this.A = aVar;
        this.D = new i(aVar);
        this.E = new g(this.A);
        this.G = true;
        Context context2 = getContext();
        this.F = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayJ = s.j(context2, attributeSet, a.o.ExtendedFloatingActionButton, r13, H, new int[0]);
        c.a.b.c.b.h hVarC = c.a.b.c.b.h.c(context2, typedArrayJ, a.o.ExtendedFloatingActionButton_showMotionSpec);
        c.a.b.c.b.h hVarC2 = c.a.b.c.b.h.c(context2, typedArrayJ, a.o.ExtendedFloatingActionButton_hideMotionSpec);
        c.a.b.c.b.h hVarC3 = c.a.b.c.b.h.c(context2, typedArrayJ, a.o.ExtendedFloatingActionButton_extendMotionSpec);
        c.a.b.c.b.h hVarC4 = c.a.b.c.b.h.c(context2, typedArrayJ, a.o.ExtendedFloatingActionButton_shrinkMotionSpec);
        com.google.android.material.floatingactionbutton.a aVar2 = new com.google.android.material.floatingactionbutton.a();
        this.C = new f(aVar2, new a(), true);
        this.B = new f(aVar2, new b(), false);
        this.D.e(hVarC);
        this.E.e(hVarC2);
        this.C.e(hVarC3);
        this.B.e(hVarC4);
        typedArrayJ.recycle();
        setShapeAppearanceModel(o.g(context2, attributeSet, r13, H, o.m).m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        return getVisibility() == 0 ? this.z == 1 : this.z != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D() {
        return getVisibility() != 0 ? this.z == 2 : this.z != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(@h0 com.google.android.material.floatingactionbutton.f fVar, @i0 h hVar) {
        if (fVar.l()) {
            return;
        }
        if (!J()) {
            fVar.g();
            fVar.k(hVar);
            return;
        }
        measure(0, 0);
        AnimatorSet animatorSetI = fVar.i();
        animatorSetI.addListener(new c(fVar, hVar));
        Iterator<Animator.AnimatorListener> it = fVar.j().iterator();
        while (it.hasNext()) {
            animatorSetI.addListener(it.next());
        }
        animatorSetI.start();
    }

    private boolean J() {
        return f0.P0(this) && !isInEditMode();
    }

    public void A(@h0 h hVar) {
        E(this.E, hVar);
    }

    public final boolean B() {
        return this.G;
    }

    public void F(@h0 Animator.AnimatorListener animatorListener) {
        this.C.m(animatorListener);
    }

    public void G(@h0 Animator.AnimatorListener animatorListener) {
        this.E.m(animatorListener);
    }

    public void H(@h0 Animator.AnimatorListener animatorListener) {
        this.D.m(animatorListener);
    }

    public void I(@h0 Animator.AnimatorListener animatorListener) {
        this.B.m(animatorListener);
    }

    public void K() {
        E(this.D, null);
    }

    public void L(@h0 h hVar) {
        E(this.D, hVar);
    }

    public void M() {
        E(this.B, null);
    }

    public void N(@h0 h hVar) {
        E(this.B, hVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @h0
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.F;
    }

    @x0
    int getCollapsedSize() {
        return (Math.min(f0.h0(this), f0.g0(this)) * 2) + getIconSize();
    }

    @i0
    public c.a.b.c.b.h getExtendMotionSpec() {
        return this.C.h();
    }

    @i0
    public c.a.b.c.b.h getHideMotionSpec() {
        return this.E.h();
    }

    @i0
    public c.a.b.c.b.h getShowMotionSpec() {
        return this.D.h();
    }

    @i0
    public c.a.b.c.b.h getShrinkMotionSpec() {
        return this.B.h();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.G && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.G = false;
            this.B.g();
        }
    }

    public void setExtendMotionSpec(@i0 c.a.b.c.b.h hVar) {
        this.C.e(hVar);
    }

    public void setExtendMotionSpecResource(@androidx.annotation.b int r2) {
        setExtendMotionSpec(c.a.b.c.b.h.d(getContext(), r2));
    }

    public void setExtended(boolean z) {
        if (this.G == z) {
            return;
        }
        com.google.android.material.floatingactionbutton.f fVar = z ? this.C : this.B;
        if (fVar.l()) {
            return;
        }
        fVar.g();
    }

    public void setHideMotionSpec(@i0 c.a.b.c.b.h hVar) {
        this.E.e(hVar);
    }

    public void setHideMotionSpecResource(@androidx.annotation.b int r2) {
        setHideMotionSpec(c.a.b.c.b.h.d(getContext(), r2));
    }

    public void setShowMotionSpec(@i0 c.a.b.c.b.h hVar) {
        this.D.e(hVar);
    }

    public void setShowMotionSpecResource(@androidx.annotation.b int r2) {
        setShowMotionSpec(c.a.b.c.b.h.d(getContext(), r2));
    }

    public void setShrinkMotionSpec(@i0 c.a.b.c.b.h hVar) {
        this.B.e(hVar);
    }

    public void setShrinkMotionSpecResource(@androidx.annotation.b int r2) {
        setShrinkMotionSpec(c.a.b.c.b.h.d(getContext(), r2));
    }

    public void t(@h0 Animator.AnimatorListener animatorListener) {
        this.C.a(animatorListener);
    }

    public void u(@h0 Animator.AnimatorListener animatorListener) {
        this.E.a(animatorListener);
    }

    public void v(@h0 Animator.AnimatorListener animatorListener) {
        this.D.a(animatorListener);
    }

    public void w(@h0 Animator.AnimatorListener animatorListener) {
        this.B.a(animatorListener);
    }

    public void x() {
        E(this.C, null);
    }

    public void y(@h0 h hVar) {
        E(this.C, hVar);
    }

    public void z() {
        E(this.E, null);
    }
}
