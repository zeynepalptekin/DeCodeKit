package b.v.b;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.k0;
import androidx.annotation.m;
import androidx.annotation.x0;
import b.i.p.f0;
import b.i.p.s;
import b.i.p.t;
import b.i.p.w;
import b.i.p.x;

/* loaded from: classes.dex */
public class c extends ViewGroup implements w, s {
    public static final int R = 0;
    public static final int S = 1;
    public static final int T = -1;

    @x0
    static final int U = 40;

    @x0
    static final int V = 56;
    private static final int a0 = 255;
    private static final int b0 = 76;
    private static final float c0 = 2.0f;
    private static final int d0 = -1;
    private static final float e0 = 0.5f;
    private static final float f0 = 0.8f;
    private static final int g0 = 150;
    private static final int h0 = 300;
    private static final int i0 = 200;
    private static final int j0 = 200;
    private static final int k0 = -328966;
    private static final int l0 = 64;
    float A;
    protected int B;
    int C;
    int D;
    b.v.b.b E;
    private Animation F;
    private Animation G;
    private Animation H;
    private Animation I;
    private Animation J;
    boolean K;
    private int L;
    boolean M;
    private i N;
    private Animation.AnimationListener O;
    private final Animation P;
    private final Animation Q;
    private View d;
    j e;
    boolean f;
    private int g;
    private float h;
    private float i;
    private final x j;
    private final t k;
    private final int[] l;
    private final int[] m;
    private boolean n;
    private int o;
    int p;
    private float q;
    private float r;
    private boolean s;
    private int t;
    boolean u;
    private boolean v;
    private final DecelerateInterpolator w;
    b.v.b.a x;
    private int y;
    protected int z;
    private static final String W = c.class.getSimpleName();
    private static final int[] m0 = {R.attr.enabled};

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            c cVar = c.this;
            if (!cVar.f) {
                cVar.x();
                return;
            }
            cVar.E.setAlpha(255);
            c.this.E.start();
            c cVar2 = c.this;
            if (cVar2.K && (jVar = cVar2.e) != null) {
                jVar.a();
            }
            c cVar3 = c.this;
            cVar3.p = cVar3.x.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            c.this.setAnimationProgress(f);
        }
    }

    /* renamed from: b.v.b.c$c, reason: collision with other inner class name */
    class C0105c extends Animation {
        C0105c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            c.this.setAnimationProgress(1.0f - f);
        }
    }

    class d extends Animation {
        final /* synthetic */ int d;
        final /* synthetic */ int e;

        d(int r2, int r3) {
            this.d = r2;
            this.e = r3;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            c.this.E.setAlpha((int) (this.d + ((this.e - r0) * f)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c cVar = c.this;
            if (cVar.u) {
                return;
            }
            cVar.F(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            c cVar = c.this;
            int r0 = !cVar.M ? cVar.C - Math.abs(cVar.B) : cVar.C;
            c cVar2 = c.this;
            c.this.setTargetOffsetTopAndBottom((cVar2.z + ((int) ((r0 - r1) * f))) - cVar2.x.getTop());
            c.this.E.u(1.0f - f);
        }
    }

    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            c.this.v(f);
        }
    }

    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            c cVar = c.this;
            float f2 = cVar.A;
            cVar.setAnimationProgress(f2 + ((-f2) * f));
            c.this.v(f);
        }
    }

    public interface i {
        boolean a(@h0 c cVar, @i0 View view);
    }

    public interface j {
        void a();
    }

    public c(@h0 Context context) {
        this(context, null);
    }

    public c(@h0 Context context, @i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        this.h = -1.0f;
        this.l = new int[2];
        this.m = new int[2];
        this.t = -1;
        this.y = -1;
        this.O = new a();
        this.P = new f();
        this.Q = new g();
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        this.o = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.w = new DecelerateInterpolator(c0);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.L = (int) (displayMetrics.density * 40.0f);
        j();
        setChildrenDrawingOrderEnabled(true);
        int r1 = (int) (displayMetrics.density * 64.0f);
        this.C = r1;
        this.h = r1;
        this.j = new x(this);
        this.k = new t(this);
        setNestedScrollingEnabled(true);
        int r12 = -this.L;
        this.p = r12;
        this.B = r12;
        v(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void A(boolean z, boolean z2) {
        if (this.f != z) {
            this.K = z2;
            n();
            this.f = z;
            if (z) {
                c(this.p, this.O);
            } else {
                F(this.O);
            }
        }
    }

    private Animation B(int r2, int r3) {
        d dVar = new d(r2, r3);
        dVar.setDuration(300L);
        this.x.b(null);
        this.x.clearAnimation();
        this.x.startAnimation(dVar);
        return dVar;
    }

    private void C(float f2) {
        float f3 = this.r;
        float f4 = f2 - f3;
        int r1 = this.g;
        if (f4 <= r1 || this.s) {
            return;
        }
        this.q = f3 + r1;
        this.s = true;
        this.E.setAlpha(76);
    }

    private void D() {
        this.I = B(this.E.getAlpha(), 255);
    }

    private void E() {
        this.H = B(this.E.getAlpha(), 76);
    }

    private void G(int r3, Animation.AnimationListener animationListener) {
        this.z = r3;
        this.A = this.x.getScaleX();
        h hVar = new h();
        this.J = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.x.b(animationListener);
        }
        this.x.clearAnimation();
        this.x.startAnimation(this.J);
    }

    private void H(Animation.AnimationListener animationListener) {
        this.x.setVisibility(0);
        this.E.setAlpha(255);
        b bVar = new b();
        this.F = bVar;
        bVar.setDuration(this.o);
        if (animationListener != null) {
            this.x.b(animationListener);
        }
        this.x.clearAnimation();
        this.x.startAnimation(this.F);
    }

    private void c(int r3, Animation.AnimationListener animationListener) {
        this.z = r3;
        this.P.reset();
        this.P.setDuration(200L);
        this.P.setInterpolator(this.w);
        if (animationListener != null) {
            this.x.b(animationListener);
        }
        this.x.clearAnimation();
        this.x.startAnimation(this.P);
    }

    private void h(int r3, Animation.AnimationListener animationListener) {
        if (this.u) {
            G(r3, animationListener);
            return;
        }
        this.z = r3;
        this.Q.reset();
        this.Q.setDuration(200L);
        this.Q.setInterpolator(this.w);
        if (animationListener != null) {
            this.x.b(animationListener);
        }
        this.x.clearAnimation();
        this.x.startAnimation(this.Q);
    }

    private void j() {
        this.x = new b.v.b.a(getContext(), k0);
        b.v.b.b bVar = new b.v.b.b(getContext());
        this.E = bVar;
        bVar.E(1);
        this.x.setImageDrawable(this.E);
        this.x.setVisibility(8);
        addView(this.x);
    }

    private void n() {
        if (this.d == null) {
            for (int r0 = 0; r0 < getChildCount(); r0++) {
                View childAt = getChildAt(r0);
                if (!childAt.equals(this.x)) {
                    this.d = childAt;
                    return;
                }
            }
        }
    }

    private void o(float f2) {
        if (f2 > this.h) {
            A(true, true);
            return;
        }
        this.f = false;
        this.E.B(0.0f, 0.0f);
        h(this.p, this.u ? null : new e());
        this.E.t(false);
    }

    private boolean p(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void setColorViewAlpha(int r2) {
        this.x.getBackground().setAlpha(r2);
        this.E.setAlpha(r2);
    }

    private void u(float f2) {
        this.E.t(true);
        float fMin = Math.min(1.0f, Math.abs(f2 / this.h));
        float fMax = (((float) Math.max(fMin - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f2) - this.h;
        int r4 = this.D;
        if (r4 <= 0) {
            r4 = this.M ? this.C - this.B : this.C;
        }
        float f3 = r4;
        double dMax = Math.max(0.0f, Math.min(fAbs, f3 * c0) / f3) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * c0;
        int r8 = this.B + ((int) ((f3 * fMin) + (f3 * fPow * c0)));
        if (this.x.getVisibility() != 0) {
            this.x.setVisibility(0);
        }
        if (!this.u) {
            this.x.setScaleX(1.0f);
            this.x.setScaleY(1.0f);
        }
        if (this.u) {
            setAnimationProgress(Math.min(1.0f, f2 / this.h));
        }
        if (f2 < this.h) {
            if (this.E.getAlpha() > 76 && !p(this.H)) {
                E();
            }
        } else if (this.E.getAlpha() < 255 && !p(this.I)) {
            D();
        }
        this.E.B(0.0f, Math.min(f0, fMax * f0));
        this.E.u(Math.min(1.0f, fMax));
        this.E.y((((fMax * 0.4f) - 0.25f) + (fPow * c0)) * e0);
        setTargetOffsetTopAndBottom(r8 - this.p);
    }

    private void w(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.t) {
            this.t = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    void F(Animation.AnimationListener animationListener) {
        C0105c c0105c = new C0105c();
        this.G = c0105c;
        c0105c.setDuration(150L);
        this.x.b(animationListener);
        this.x.clearAnimation();
        this.x.startAnimation(this.G);
    }

    @Override // android.view.View, b.i.p.s
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.k.a(f2, f3, z);
    }

    @Override // android.view.View, b.i.p.s
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.k.b(f2, f3);
    }

    @Override // android.view.View, b.i.p.s
    public boolean dispatchNestedPreScroll(int r2, int r3, int[] r4, int[] r5) {
        return this.k.c(r2, r3, r4, r5);
    }

    @Override // android.view.View, b.i.p.s
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
        return this.k.f(r7, r8, r9, r10, r11);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int r2, int r3) {
        int r0 = this.y;
        return r0 < 0 ? r3 : r3 == r2 + (-1) ? r0 : r3 >= r0 ? r3 + 1 : r3;
    }

    @Override // android.view.ViewGroup, b.i.p.w
    public int getNestedScrollAxes() {
        return this.j.a();
    }

    public int getProgressCircleDiameter() {
        return this.L;
    }

    public int getProgressViewEndOffset() {
        return this.C;
    }

    public int getProgressViewStartOffset() {
        return this.B;
    }

    @Override // android.view.View, b.i.p.s
    public boolean hasNestedScrollingParent() {
        return this.k.k();
    }

    public boolean i() {
        i iVar = this.N;
        if (iVar != null) {
            return iVar.a(this, this.d);
        }
        View view = this.d;
        return view instanceof ListView ? androidx.core.widget.i.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View, b.i.p.s
    public boolean isNestedScrollingEnabled() {
        return this.k.m();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.n()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.v
            r2 = 0
            if (r1 == 0) goto L10
            if (r0 != 0) goto L10
            r4.v = r2
        L10:
            boolean r1 = r4.isEnabled()
            if (r1 == 0) goto L81
            boolean r1 = r4.v
            if (r1 != 0) goto L81
            boolean r1 = r4.i()
            if (r1 != 0) goto L81
            boolean r1 = r4.f
            if (r1 != 0) goto L81
            boolean r1 = r4.n
            if (r1 == 0) goto L29
            goto L81
        L29:
            if (r0 == 0) goto L5d
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L3d
            r1 = 3
            if (r0 == r1) goto L58
            r1 = 6
            if (r0 == r1) goto L39
            goto L7e
        L39:
            r4.w(r5)
            goto L7e
        L3d:
            int r0 = r4.t
            if (r0 != r3) goto L49
            java.lang.String r5 = b.v.b.c.W
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r5, r0)
            return r2
        L49:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L50
            return r2
        L50:
            float r5 = r5.getY(r0)
            r4.C(r5)
            goto L7e
        L58:
            r4.s = r2
            r4.t = r3
            goto L7e
        L5d:
            int r0 = r4.B
            b.v.b.a r1 = r4.x
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.setTargetOffsetTopAndBottom(r0)
            int r0 = r5.getPointerId(r2)
            r4.t = r0
            r4.s = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L78
            return r2
        L78:
            float r5 = r5.getY(r0)
            r4.r = r5
        L7e:
            boolean r5 = r4.s
            return r5
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.v.b.c.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r4, int r5, int r6, int r7) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.d == null) {
            n();
        }
        View view = this.d;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.x.getMeasuredWidth();
        int measuredHeight2 = this.x.getMeasuredHeight();
        int r3 = measuredWidth / 2;
        int r42 = measuredWidth2 / 2;
        int r0 = this.p;
        this.x.layout(r3 - r42, r0, r3 + r42, measuredHeight2 + r0);
    }

    @Override // android.view.View
    public void onMeasure(int r4, int r5) {
        super.onMeasure(r4, r5);
        if (this.d == null) {
            n();
        }
        View view = this.d;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.x.measure(View.MeasureSpec.makeMeasureSpec(this.L, 1073741824), View.MeasureSpec.makeMeasureSpec(this.L, 1073741824));
        this.y = -1;
        for (int r42 = 0; r42 < getChildCount(); r42++) {
            if (getChildAt(r42) == this.x) {
                this.y = r42;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return dispatchNestedFling(f2, f3, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onNestedPreScroll(View view, int r6, int r7, int[] r8) {
        if (r7 > 0) {
            float f2 = this.i;
            if (f2 > 0.0f) {
                float f3 = r7;
                if (f3 > f2) {
                    r8[1] = r7 - ((int) f2);
                    this.i = 0.0f;
                } else {
                    this.i = f2 - f3;
                    r8[1] = r7;
                }
                u(this.i);
            }
        }
        if (this.M && r7 > 0 && this.i == 0.0f && Math.abs(r7 - r8[1]) > 0) {
            this.x.setVisibility(8);
        }
        int[] r5 = this.l;
        if (dispatchNestedPreScroll(r6 - r8[0], r7 - r8[1], r5, null)) {
            r8[0] = r8[0] + r5[0];
            r8[1] = r8[1] + r5[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onNestedScroll(View view, int r8, int r9, int r10, int r11) {
        dispatchNestedScroll(r8, r9, r10, r11, this.m);
        if (r11 + this.m[1] >= 0 || i()) {
            return;
        }
        float fAbs = this.i + Math.abs(r11);
        this.i = fAbs;
        u(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onNestedScrollAccepted(View view, View view2, int r4) {
        this.j.b(view, view2, r4);
        startNestedScroll(r4 & 2);
        this.i = 0.0f;
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public boolean onStartNestedScroll(View view, View view2, int r3) {
        return (!isEnabled() || this.v || this.f || (r3 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onStopNestedScroll(View view) {
        this.j.d(view);
        this.n = false;
        float f2 = this.i;
        if (f2 > 0.0f) {
            o(f2);
            this.i = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.v && actionMasked == 0) {
            this.v = false;
        }
        if (!isEnabled() || this.v || i() || this.f || this.n) {
            return false;
        }
        if (actionMasked == 0) {
            this.t = motionEvent.getPointerId(0);
            this.s = false;
        } else {
            if (actionMasked == 1) {
                int r0 = motionEvent.findPointerIndex(this.t);
                if (r0 < 0) {
                    Log.e(W, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.s) {
                    float y = (motionEvent.getY(r0) - this.q) * e0;
                    this.s = false;
                    o(y);
                }
                this.t = -1;
                return false;
            }
            if (actionMasked == 2) {
                int r02 = motionEvent.findPointerIndex(this.t);
                if (r02 < 0) {
                    Log.e(W, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(r02);
                C(y2);
                if (this.s) {
                    float f2 = (y2 - this.q) * e0;
                    if (f2 <= 0.0f) {
                        return false;
                    }
                    u(f2);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(W, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.t = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    w(motionEvent);
                }
            }
        }
        return true;
    }

    public boolean q() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.d instanceof AbsListView)) {
            View view = this.d;
            if (view == null || f0.R0(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    void setAnimationProgress(float f2) {
        this.x.setScaleX(f2);
        this.x.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(@m int... r1) {
        setColorSchemeResources(r1);
    }

    public void setColorSchemeColors(@k int... r2) {
        n();
        this.E.x(r2);
    }

    public void setColorSchemeResources(@m int... r5) {
        Context context = getContext();
        int[] r1 = new int[r5.length];
        for (int r2 = 0; r2 < r5.length; r2++) {
            r1[r2] = b.i.c.c.e(context, r5[r2]);
        }
        setColorSchemeColors(r1);
    }

    public void setDistanceToTriggerSync(int r1) {
        this.h = r1;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        x();
    }

    @Override // android.view.View, b.i.p.s
    public void setNestedScrollingEnabled(boolean z) {
        this.k.p(z);
    }

    public void setOnChildScrollUpCallback(@i0 i iVar) {
        this.N = iVar;
    }

    public void setOnRefreshListener(@i0 j jVar) {
        this.e = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int r1) {
        setProgressBackgroundColorSchemeResource(r1);
    }

    public void setProgressBackgroundColorSchemeColor(@k int r2) {
        this.x.setBackgroundColor(r2);
    }

    public void setProgressBackgroundColorSchemeResource(@m int r2) {
        setProgressBackgroundColorSchemeColor(b.i.c.c.e(getContext(), r2));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f == z) {
            A(z, false);
            return;
        }
        this.f = z;
        setTargetOffsetTopAndBottom((!this.M ? this.C + this.B : this.C) - this.p);
        this.K = false;
        H(this.O);
    }

    public void setSize(int r3) {
        if (r3 == 0 || r3 == 1) {
            this.L = (int) (getResources().getDisplayMetrics().density * (r3 == 0 ? 56.0f : 40.0f));
            this.x.setImageDrawable(null);
            this.E.E(r3);
            this.x.setImageDrawable(this.E);
        }
    }

    public void setSlingshotDistance(@k0 int r1) {
        this.D = r1;
    }

    void setTargetOffsetTopAndBottom(int r2) {
        this.x.bringToFront();
        f0.Z0(this.x, r2);
        this.p = this.x.getTop();
    }

    @Override // android.view.View, b.i.p.s
    public boolean startNestedScroll(int r2) {
        return this.k.r(r2);
    }

    @Override // android.view.View, b.i.p.s
    public void stopNestedScroll() {
        this.k.t();
    }

    void v(float f2) {
        setTargetOffsetTopAndBottom((this.z + ((int) ((this.B - r0) * f2))) - this.x.getTop());
    }

    void x() {
        this.x.clearAnimation();
        this.E.stop();
        this.x.setVisibility(8);
        setColorViewAlpha(255);
        if (this.u) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.B - this.p);
        }
        this.p = this.x.getTop();
    }

    public void y(boolean z, int r2) {
        this.C = r2;
        this.u = z;
        this.x.invalidate();
    }

    public void z(boolean z, int r2, int r3) {
        this.u = z;
        this.B = r2;
        this.C = r3;
        this.M = true;
        x();
        this.f = false;
    }
}
