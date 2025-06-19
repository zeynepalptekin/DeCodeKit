package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.c0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.z;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.p.f0;
import b.i.p.o0;
import c.a.b.c.a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    private static final int A = 75;
    private static final float B = 0.8f;

    @h0
    static final Handler C;
    static final int D = 0;
    static final int E = 1;
    private static final boolean F;
    private static final int[] G;
    private static final String H;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = -2;
    public static final int v = -1;
    public static final int w = 0;
    static final int x = 250;
    static final int y = 180;
    private static final int z = 150;

    /* renamed from: a, reason: collision with root package name */
    @h0
    private final ViewGroup f6768a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f6769b;

    /* renamed from: c, reason: collision with root package name */
    @h0
    protected final y f6770c;

    @h0
    private final com.google.android.material.snackbar.a d;
    private int e;
    private boolean f;

    @i0
    private View g;

    @i0
    private Rect i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private List<s<B>> o;
    private Behavior p;

    @i0
    private final AccessibilityManager q;

    @m0(29)
    private final Runnable h = new j();

    @h0
    b.InterfaceC0201b r = new m();

    public static class Behavior extends SwipeDismissBehavior<View> {

        @h0
        private final t t = new t(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void V(@h0 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.t.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean G(View view) {
            return this.t.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(@h0 CoordinatorLayout coordinatorLayout, @h0 View view, @h0 MotionEvent motionEvent) {
            this.t.b(coordinatorLayout, view, motionEvent);
            return super.l(coordinatorLayout, view, motionEvent);
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.P();
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6772a;

        b(int r2) {
            this.f6772a = r2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.O(this.f6772a);
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f6770c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f6770c.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f6770c.setScaleY(fFloatValue);
        }
    }

    class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.P();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.d.a(70, BaseTransientBottomBar.y);
        }
    }

    class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f6777a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6778b;

        f(int r2) {
            this.f6778b = r2;
            this.f6777a = this.f6778b;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
            int r3 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.F) {
                f0.Z0(BaseTransientBottomBar.this.f6770c, r3 - this.f6777a);
            } else {
                BaseTransientBottomBar.this.f6770c.setTranslationY(r3);
            }
            this.f6777a = r3;
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6780a;

        g(int r2) {
            this.f6780a = r2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.O(this.f6780a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.d.b(0, BaseTransientBottomBar.y);
        }
    }

    class h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f6782a = 0;

        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
            int r3 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.F) {
                f0.Z0(BaseTransientBottomBar.this.f6770c, r3 - this.f6782a);
            } else {
                BaseTransientBottomBar.this.f6770c.setTranslationY(r3);
            }
            this.f6782a = r3;
        }
    }

    static class i implements Handler.Callback {
        i() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@h0 Message message) {
            int r0 = message.what;
            if (r0 == 0) {
                ((BaseTransientBottomBar) message.obj).b0();
                return true;
            }
            if (r0 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).J(message.arg1);
            return true;
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int r0;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f6770c == null || baseTransientBottomBar.f6769b == null || (r0 = (BaseTransientBottomBar.this.D() - BaseTransientBottomBar.this.H()) + ((int) BaseTransientBottomBar.this.f6770c.getTranslationY())) >= BaseTransientBottomBar.this.m) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f6770c.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.H, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.m - r0;
            BaseTransientBottomBar.this.f6770c.requestLayout();
        }
    }

    class k implements b.i.p.y {
        k() {
        }

        @Override // b.i.p.y
        @h0
        public o0 a(View view, @h0 o0 o0Var) {
            BaseTransientBottomBar.this.j = o0Var.l();
            BaseTransientBottomBar.this.k = o0Var.m();
            BaseTransientBottomBar.this.l = o0Var.n();
            BaseTransientBottomBar.this.h0();
            return o0Var;
        }
    }

    class l extends b.i.p.a {
        l() {
        }

        @Override // b.i.p.a
        public void g(View view, @h0 b.i.p.p0.d dVar) {
            super.g(view, dVar);
            dVar.a(1048576);
            dVar.a1(true);
        }

        @Override // b.i.p.a
        public boolean j(View view, int r3, Bundle bundle) {
            if (r3 != 1048576) {
                return super.j(view, r3, bundle);
            }
            BaseTransientBottomBar.this.t();
            return true;
        }
    }

    class m implements b.InterfaceC0201b {
        m() {
        }

        @Override // com.google.android.material.snackbar.b.InterfaceC0201b
        public void a(int r5) {
            Handler handler = BaseTransientBottomBar.C;
            handler.sendMessage(handler.obtainMessage(1, r5, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.b.InterfaceC0201b
        public void y() {
            Handler handler = BaseTransientBottomBar.C;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    class n implements w {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BaseTransientBottomBar.this.O(3);
            }
        }

        n() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w
        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = BaseTransientBottomBar.this.f6770c.getRootWindowInsets()) == null) {
                return;
            }
            BaseTransientBottomBar.this.m = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            BaseTransientBottomBar.this.h0();
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w
        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.M()) {
                BaseTransientBottomBar.C.post(new a());
            }
        }
    }

    class o implements x {
        o() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.x
        public void a(View view, int r2, int r3, int r4, int r5) {
            BaseTransientBottomBar.this.f6770c.setOnLayoutChangeListener(null);
            BaseTransientBottomBar.this.c0();
        }
    }

    class p implements SwipeDismissBehavior.c {
        p() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(@h0 View view) {
            view.setVisibility(8);
            BaseTransientBottomBar.this.u(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int r2) {
            if (r2 == 0) {
                com.google.android.material.snackbar.b.c().l(BaseTransientBottomBar.this.r);
            } else if (r2 == 1 || r2 == 2) {
                com.google.android.material.snackbar.b.c().k(BaseTransientBottomBar.this.r);
            }
        }
    }

    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y yVar = BaseTransientBottomBar.this.f6770c;
            if (yVar == null) {
                return;
            }
            yVar.setVisibility(0);
            if (BaseTransientBottomBar.this.f6770c.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.d0();
            } else {
                BaseTransientBottomBar.this.f0();
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface r {
    }

    public static abstract class s<B> {

        /* renamed from: a, reason: collision with root package name */
        public static final int f6789a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f6790b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f6791c = 2;
        public static final int d = 3;
        public static final int e = 4;

        @Retention(RetentionPolicy.SOURCE)
        @p0({p0.a.LIBRARY_GROUP})
        public @interface a {
        }

        public void a(B b2, int r2) {
        }

        public void b(B b2) {
        }
    }

    @p0({p0.a.LIBRARY_GROUP})
    public static class t {

        /* renamed from: a, reason: collision with root package name */
        private b.InterfaceC0201b f6792a;

        public t(@h0 SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.R(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.S(0);
        }

        public boolean a(View view) {
            return view instanceof y;
        }

        public void b(@h0 CoordinatorLayout coordinatorLayout, @h0 View view, @h0 MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.G(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.b.c().k(this.f6792a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.b.c().l(this.f6792a);
            }
        }

        public void c(@h0 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f6792a = baseTransientBottomBar.r;
        }
    }

    @Deprecated
    public interface u extends com.google.android.material.snackbar.a {
    }

    @z(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface v {
    }

    @p0({p0.a.LIBRARY_GROUP})
    protected interface w {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    @p0({p0.a.LIBRARY_GROUP})
    protected interface x {
        void a(View view, int r2, int r3, int r4, int r5);
    }

    @p0({p0.a.LIBRARY_GROUP})
    protected static class y extends FrameLayout {
        private static final View.OnTouchListener k = new a();
        private x d;
        private w e;
        private int f;
        private final float g;
        private final float h;
        private ColorStateList i;
        private PorterDuff.Mode j;

        static class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected y(@h0 Context context) {
            this(context, null);
        }

        protected y(@h0 Context context, AttributeSet attributeSet) {
            super(com.google.android.material.theme.a.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a.o.SnackbarLayout);
            if (typedArrayObtainStyledAttributes.hasValue(a.o.SnackbarLayout_elevation)) {
                f0.G1(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(a.o.SnackbarLayout_elevation, 0));
            }
            this.f = typedArrayObtainStyledAttributes.getInt(a.o.SnackbarLayout_animationMode, 0);
            this.g = typedArrayObtainStyledAttributes.getFloat(a.o.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(c.a.b.c.r.c.a(context2, typedArrayObtainStyledAttributes, a.o.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(com.google.android.material.internal.z.j(typedArrayObtainStyledAttributes.getInt(a.o.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.h = typedArrayObtainStyledAttributes.getFloat(a.o.SnackbarLayout_actionTextColorAlpha, 1.0f);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(k);
            setFocusable(true);
            if (getBackground() == null) {
                f0.B1(this, a());
            }
        }

        @h0
        private Drawable a() throws Resources.NotFoundException {
            float dimension = getResources().getDimension(a.f.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(c.a.b.c.i.a.i(this, a.c.colorSurface, a.c.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.i == null) {
                return androidx.core.graphics.drawable.a.r(gradientDrawable);
            }
            Drawable drawableR = androidx.core.graphics.drawable.a.r(gradientDrawable);
            androidx.core.graphics.drawable.a.o(drawableR, this.i);
            return drawableR;
        }

        float getActionTextColorAlpha() {
            return this.h;
        }

        int getAnimationMode() {
            return this.f;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.g;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            w wVar = this.e;
            if (wVar != null) {
                wVar.onViewAttachedToWindow(this);
            }
            f0.o1(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            w wVar = this.e;
            if (wVar != null) {
                wVar.onViewDetachedFromWindow(this);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int r8, int r9, int r10, int r11) {
            super.onLayout(z, r8, r9, r10, r11);
            x xVar = this.d;
            if (xVar != null) {
                xVar.a(this, r8, r9, r10, r11);
            }
        }

        void setAnimationMode(int r1) {
            this.f = r1;
        }

        @Override // android.view.View
        public void setBackground(@i0 Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@i0 Drawable drawable) {
            if (drawable != null && this.i != null) {
                drawable = androidx.core.graphics.drawable.a.r(drawable.mutate());
                androidx.core.graphics.drawable.a.o(drawable, this.i);
                androidx.core.graphics.drawable.a.p(drawable, this.j);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@i0 ColorStateList colorStateList) {
            this.i = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.o(drawableR, colorStateList);
                androidx.core.graphics.drawable.a.p(drawableR, this.j);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@i0 PorterDuff.Mode mode) {
            this.j = mode;
            if (getBackground() != null) {
                Drawable drawableR = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        void setOnAttachStateChangeListener(w wVar) {
            this.e = wVar;
        }

        @Override // android.view.View
        public void setOnClickListener(@i0 View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : k);
            super.setOnClickListener(onClickListener);
        }

        void setOnLayoutChangeListener(x xVar) {
            this.d = xVar;
        }
    }

    static {
        int r0 = Build.VERSION.SDK_INT;
        F = r0 >= 16 && r0 <= 19;
        G = new int[]{a.c.snackbarStyle};
        H = BaseTransientBottomBar.class.getSimpleName();
        C = new Handler(Looper.getMainLooper(), new i());
    }

    protected BaseTransientBottomBar(@h0 ViewGroup viewGroup, @h0 View view, @h0 com.google.android.material.snackbar.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f6768a = viewGroup;
        this.d = aVar;
        Context context = viewGroup.getContext();
        this.f6769b = context;
        com.google.android.material.internal.s.a(context);
        y yVar = (y) LayoutInflater.from(this.f6769b).inflate(E(), this.f6768a, false);
        this.f6770c = yVar;
        if (view instanceof SnackbarContentLayout) {
            ((SnackbarContentLayout) view).c(yVar.getActionTextColorAlpha());
        }
        this.f6770c.addView(view);
        ViewGroup.LayoutParams layoutParams = this.f6770c.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        f0.w1(this.f6770c, 1);
        f0.K1(this.f6770c, 1);
        f0.H1(this.f6770c, true);
        f0.T1(this.f6770c, new k());
        f0.u1(this.f6770c, new l());
        this.q = (AccessibilityManager) this.f6769b.getSystemService("accessibility");
    }

    private ValueAnimator C(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(c.a.b.c.b.a.d);
        valueAnimatorOfFloat.addUpdateListener(new d());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m0(17)
    public int D() {
        WindowManager windowManager = (WindowManager) this.f6769b.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private int F() {
        int height = this.f6770c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f6770c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H() {
        int[] r0 = new int[2];
        this.f6770c.getLocationOnScreen(r0);
        return r0[1] + this.f6770c.getHeight();
    }

    private boolean N() {
        ViewGroup.LayoutParams layoutParams = this.f6770c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.g) && (((CoordinatorLayout.g) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void X(CoordinatorLayout.g gVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorB = this.p;
        if (swipeDismissBehaviorB == null) {
            swipeDismissBehaviorB = B();
        }
        if (swipeDismissBehaviorB instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorB).V(this);
        }
        swipeDismissBehaviorB.P(new p());
        gVar.q(swipeDismissBehaviorB);
        if (this.g == null) {
            gVar.g = 80;
        }
    }

    private boolean Z() {
        return this.m > 0 && !this.f && N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        if (Y()) {
            q();
        } else {
            this.f6770c.setVisibility(0);
            P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        ValueAnimator valueAnimatorV = v(0.0f, 1.0f);
        ValueAnimator valueAnimatorC = C(B, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorV, valueAnimatorC);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new a());
        animatorSet.start();
    }

    private void e0(int r4) {
        ValueAnimator valueAnimatorV = v(1.0f, 0.0f);
        valueAnimatorV.setDuration(75L);
        valueAnimatorV.addListener(new b(r4));
        valueAnimatorV.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        int r0 = F();
        if (F) {
            f0.Z0(this.f6770c, r0);
        } else {
            this.f6770c.setTranslationY(r0);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(r0, 0);
        valueAnimator.setInterpolator(c.a.b.c.b.a.f1936b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new e());
        valueAnimator.addUpdateListener(new f(r0));
        valueAnimator.start();
    }

    private void g0(int r5) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, F());
        valueAnimator.setInterpolator(c.a.b.c.b.a.f1936b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new g(r5));
        valueAnimator.addUpdateListener(new h());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        ViewGroup.LayoutParams layoutParams = this.f6770c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.i == null) {
            Log.w(H, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        int r1 = this.g != null ? this.n : this.j;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = this.i;
        marginLayoutParams.bottomMargin = rect.bottom + r1;
        marginLayoutParams.leftMargin = rect.left + this.k;
        marginLayoutParams.rightMargin = rect.right + this.l;
        this.f6770c.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || !Z()) {
            return;
        }
        this.f6770c.removeCallbacks(this.h);
        this.f6770c.post(this.h);
    }

    private void r(int r3) {
        if (this.f6770c.getAnimationMode() == 1) {
            e0(r3);
        } else {
            g0(r3);
        }
    }

    private int s() {
        View view = this.g;
        if (view == null) {
            return 0;
        }
        int[] r2 = new int[2];
        view.getLocationOnScreen(r2);
        int r22 = r2[1];
        int[] r1 = new int[2];
        this.f6768a.getLocationOnScreen(r1);
        return (r1[1] + this.f6768a.getHeight()) - r22;
    }

    private ValueAnimator v(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(c.a.b.c.b.a.f1935a);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    public int A() {
        return this.e;
    }

    @h0
    protected SwipeDismissBehavior<? extends View> B() {
        return new Behavior();
    }

    @c0
    protected int E() {
        return I() ? a.k.mtrl_layout_snackbar : a.k.design_layout_snackbar;
    }

    @h0
    public View G() {
        return this.f6770c;
    }

    protected boolean I() {
        TypedArray typedArrayObtainStyledAttributes = this.f6769b.obtainStyledAttributes(G);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void J(int r2) {
        if (Y() && this.f6770c.getVisibility() == 0) {
            r(r2);
        } else {
            O(r2);
        }
    }

    public boolean K() {
        return this.f;
    }

    public boolean L() {
        return com.google.android.material.snackbar.b.c().e(this.r);
    }

    public boolean M() {
        return com.google.android.material.snackbar.b.c().f(this.r);
    }

    void O(int r3) {
        com.google.android.material.snackbar.b.c().i(this.r);
        List<s<B>> list = this.o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.o.get(size).a(this, r3);
            }
        }
        ViewParent parent = this.f6770c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f6770c);
        }
    }

    void P() {
        com.google.android.material.snackbar.b.c().j(this.r);
        List<s<B>> list = this.o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.o.get(size).b(this);
            }
        }
    }

    @h0
    public B Q(@i0 s<B> sVar) {
        List<s<B>> list;
        if (sVar == null || (list = this.o) == null) {
            return this;
        }
        list.remove(sVar);
        return this;
    }

    @h0
    public B R(@androidx.annotation.w int r4) {
        View viewFindViewById = this.f6768a.findViewById(r4);
        this.g = viewFindViewById;
        if (viewFindViewById != null) {
            return this;
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + r4);
    }

    @h0
    public B S(@i0 View view) {
        this.g = view;
        return this;
    }

    @h0
    public B T(int r2) {
        this.f6770c.setAnimationMode(r2);
        return this;
    }

    @h0
    public B U(Behavior behavior) {
        this.p = behavior;
        return this;
    }

    @h0
    public B V(int r1) {
        this.e = r1;
        return this;
    }

    @h0
    public B W(boolean z2) {
        this.f = z2;
        return this;
    }

    boolean Y() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.q.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void a0() {
        com.google.android.material.snackbar.b.c().n(A(), this.r);
    }

    final void b0() {
        this.f6770c.setOnAttachStateChangeListener(new n());
        if (this.f6770c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f6770c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                X((CoordinatorLayout.g) layoutParams);
            }
            this.n = s();
            h0();
            this.f6770c.setVisibility(4);
            this.f6768a.addView(this.f6770c);
        }
        if (f0.P0(this.f6770c)) {
            c0();
        } else {
            this.f6770c.setOnLayoutChangeListener(new o());
        }
    }

    @h0
    public B p(@i0 s<B> sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.o == null) {
            this.o = new ArrayList();
        }
        this.o.add(sVar);
        return this;
    }

    void q() {
        this.f6770c.post(new q());
    }

    public void t() {
        u(3);
    }

    protected void u(int r3) {
        com.google.android.material.snackbar.b.c().b(this.r, r3);
    }

    @i0
    public View w() {
        return this.g;
    }

    public int x() {
        return this.f6770c.getAnimationMode();
    }

    public Behavior y() {
        return this.p;
    }

    @h0
    public Context z() {
        return this.f6769b;
    }
}
