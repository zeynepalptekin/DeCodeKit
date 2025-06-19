package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.annotation.i0;
import androidx.recyclerview.widget.RecyclerView;
import b.t.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class m extends RecyclerView.n implements RecyclerView.q {
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 4;
    public static final int H = 8;
    public static final int I = 16;
    public static final int J = 32;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = 2;
    public static final int O = 4;
    public static final int P = 8;
    private static final String Q = "ItemTouchHelper";
    private static final boolean R = false;
    private static final int S = -1;
    static final int T = 8;
    private static final int U = 255;
    static final int V = 65280;
    static final int W = 16711680;
    private static final int X = 1000;
    private g A;
    private Rect C;
    private long D;
    float d;
    float e;
    private float f;
    private float g;
    float h;
    float i;
    private float j;
    private float k;

    @androidx.annotation.h0
    f m;
    int o;
    private int q;
    RecyclerView r;
    VelocityTracker t;
    private List<RecyclerView.f0> u;
    private List<Integer> v;
    b.i.p.g z;

    /* renamed from: a, reason: collision with root package name */
    final List<View> f714a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final float[] f715b = new float[2];

    /* renamed from: c, reason: collision with root package name */
    RecyclerView.f0 f716c = null;
    int l = -1;
    private int n = 0;
    List<h> p = new ArrayList();
    final Runnable s = new a();
    private RecyclerView.j w = null;
    View x = null;
    int y = -1;
    private final RecyclerView.s B = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = m.this;
            if (mVar.f716c == null || !mVar.E()) {
                return;
            }
            m mVar2 = m.this;
            RecyclerView.f0 f0Var = mVar2.f716c;
            if (f0Var != null) {
                mVar2.z(f0Var);
            }
            m mVar3 = m.this;
            mVar3.r.removeCallbacks(mVar3.s);
            b.i.p.f0.i1(m.this.r, this);
        }
    }

    class b implements RecyclerView.s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean a(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 MotionEvent motionEvent) {
            int r2;
            h hVarS;
            m.this.z.b(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m.this.l = motionEvent.getPointerId(0);
                m.this.d = motionEvent.getX();
                m.this.e = motionEvent.getY();
                m.this.A();
                m mVar = m.this;
                if (mVar.f716c == null && (hVarS = mVar.s(motionEvent)) != null) {
                    m mVar2 = m.this;
                    mVar2.d -= hVarS.j;
                    mVar2.e -= hVarS.k;
                    mVar2.r(hVarS.e, true);
                    if (m.this.f714a.remove(hVarS.e.f561a)) {
                        m mVar3 = m.this;
                        mVar3.m.c(mVar3.r, hVarS.e);
                    }
                    m.this.F(hVarS.e, hVarS.f);
                    m mVar4 = m.this;
                    mVar4.M(motionEvent, mVar4.o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                m mVar5 = m.this;
                mVar5.l = -1;
                mVar5.F(null, 0);
            } else {
                int r22 = m.this.l;
                if (r22 != -1 && (r2 = motionEvent.findPointerIndex(r22)) >= 0) {
                    m.this.o(actionMasked, motionEvent, r2);
                }
            }
            VelocityTracker velocityTracker = m.this.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return m.this.f716c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void c(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 MotionEvent motionEvent) {
            m.this.z.b(motionEvent);
            VelocityTracker velocityTracker = m.this.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (m.this.l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int r1 = motionEvent.findPointerIndex(m.this.l);
            if (r1 >= 0) {
                m.this.o(actionMasked, motionEvent, r1);
            }
            m mVar = m.this;
            RecyclerView.f0 f0Var = mVar.f716c;
            if (f0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (r1 >= 0) {
                        mVar.M(motionEvent, mVar.o, r1);
                        m.this.z(f0Var);
                        m mVar2 = m.this;
                        mVar2.r.removeCallbacks(mVar2.s);
                        m.this.s.run();
                        m.this.r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == m.this.l) {
                        m.this.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        m mVar3 = m.this;
                        mVar3.M(motionEvent, mVar3.o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = mVar.t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            m.this.F(null, 0);
            m.this.l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void e(boolean z) {
            if (z) {
                m.this.F(null, 0);
            }
        }
    }

    class c extends h {
        final /* synthetic */ int o;
        final /* synthetic */ RecyclerView.f0 p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RecyclerView.f0 f0Var, int r12, int r13, float f, float f2, float f3, float f4, int r18, RecyclerView.f0 f0Var2) {
            super(f0Var, r12, r13, f, f2, f3, f4);
            this.o = r18;
            this.p = f0Var2;
        }

        @Override // androidx.recyclerview.widget.m.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.l) {
                return;
            }
            if (this.o <= 0) {
                m mVar = m.this;
                mVar.m.c(mVar.r, this.p);
            } else {
                m.this.f714a.add(this.p.f561a);
                this.i = true;
                int r3 = this.o;
                if (r3 > 0) {
                    m.this.B(this, r3);
                }
            }
            m mVar2 = m.this;
            View view = mVar2.x;
            View view2 = this.p.f561a;
            if (view == view2) {
                mVar2.D(view2);
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ h d;
        final /* synthetic */ int e;

        d(h hVar, int r3) {
            this.d = hVar;
            this.e = r3;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = m.this.r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            h hVar = this.d;
            if (hVar.l || hVar.e.j() == -1) {
                return;
            }
            RecyclerView.l itemAnimator = m.this.r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.r(null)) && !m.this.x()) {
                m.this.m.D(this.d.e, this.e);
            } else {
                m.this.r.post(this);
            }
        }
    }

    class e implements RecyclerView.j {
        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public int a(int r5, int r6) {
            m mVar = m.this;
            View view = mVar.x;
            if (view == null) {
                return r6;
            }
            int r2 = mVar.y;
            if (r2 == -1) {
                r2 = mVar.r.indexOfChild(view);
                m.this.y = r2;
            }
            return r6 == r5 + (-1) ? r2 : r6 < r2 ? r6 : r6 + 1;
        }
    }

    public static abstract class f {

        /* renamed from: b, reason: collision with root package name */
        public static final int f719b = 200;

        /* renamed from: c, reason: collision with root package name */
        public static final int f720c = 250;
        static final int d = 3158064;
        private static final int e = 789516;
        private static final Interpolator f = new a();
        private static final Interpolator g = new b();
        private static final long h = 2000;

        /* renamed from: a, reason: collision with root package name */
        private int f721a = -1;

        static class a implements Interpolator {
            a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        static class b implements Interpolator {
            b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int e(int r3, int r4) {
            int r42;
            int r1 = r3 & e;
            if (r1 == 0) {
                return r3;
            }
            int r32 = r3 & (~r1);
            if (r4 == 0) {
                r42 = r1 << 2;
            } else {
                int r43 = r1 << 1;
                r32 |= (-789517) & r43;
                r42 = (r43 & e) << 2;
            }
            return r32 | r42;
        }

        @androidx.annotation.h0
        public static n i() {
            return o.f726a;
        }

        private int j(RecyclerView recyclerView) {
            if (this.f721a == -1) {
                this.f721a = recyclerView.getResources().getDimensionPixelSize(a.c.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f721a;
        }

        public static int u(int r0, int r1) {
            return r1 << (r0 * 8);
        }

        public static int v(int r2, int r3) {
            return u(2, r2) | u(1, r3) | u(0, r3 | r2);
        }

        public abstract boolean A(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 RecyclerView.f0 f0Var, @androidx.annotation.h0 RecyclerView.f0 f0Var2);

        /* JADX WARN: Multi-variable type inference failed */
        public void B(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 RecyclerView.f0 f0Var, int r4, @androidx.annotation.h0 RecyclerView.f0 f0Var2, int r6, int r7, int r8) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof j) {
                ((j) layoutManager).b(f0Var.f561a, f0Var2.f561a, r7, r8);
                return;
            }
            if (layoutManager.n()) {
                if (layoutManager.Y(f0Var2.f561a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.C1(r6);
                }
                if (layoutManager.b0(f0Var2.f561a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.C1(r6);
                }
            }
            if (layoutManager.o()) {
                if (layoutManager.c0(f0Var2.f561a) <= recyclerView.getPaddingTop()) {
                    recyclerView.C1(r6);
                }
                if (layoutManager.W(f0Var2.f561a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.C1(r6);
                }
            }
        }

        public void C(@i0 RecyclerView.f0 f0Var, int r2) {
            if (f0Var != null) {
                o.f726a.b(f0Var.f561a);
            }
        }

        public abstract void D(@androidx.annotation.h0 RecyclerView.f0 f0Var, int r2);

        public boolean a(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 RecyclerView.f0 f0Var, @androidx.annotation.h0 RecyclerView.f0 f0Var2) {
            return true;
        }

        public RecyclerView.f0 b(@androidx.annotation.h0 RecyclerView.f0 f0Var, @androidx.annotation.h0 List<RecyclerView.f0> list, int r17, int r18) {
            int bottom;
            int r11;
            int top;
            int r112;
            int left;
            int r113;
            int right;
            int r114;
            int width = r17 + f0Var.f561a.getWidth();
            int height = r18 + f0Var.f561a.getHeight();
            int left2 = r17 - f0Var.f561a.getLeft();
            int top2 = r18 - f0Var.f561a.getTop();
            int size = list.size();
            RecyclerView.f0 f0Var2 = null;
            int r7 = -1;
            for (int r8 = 0; r8 < size; r8++) {
                RecyclerView.f0 f0Var3 = list.get(r8);
                if (left2 > 0 && (right = f0Var3.f561a.getRight() - width) < 0 && f0Var3.f561a.getRight() > f0Var.f561a.getRight() && (r114 = Math.abs(right)) > r7) {
                    f0Var2 = f0Var3;
                    r7 = r114;
                }
                if (left2 < 0 && (left = f0Var3.f561a.getLeft() - r17) > 0 && f0Var3.f561a.getLeft() < f0Var.f561a.getLeft() && (r113 = Math.abs(left)) > r7) {
                    f0Var2 = f0Var3;
                    r7 = r113;
                }
                if (top2 < 0 && (top = f0Var3.f561a.getTop() - r18) > 0 && f0Var3.f561a.getTop() < f0Var.f561a.getTop() && (r112 = Math.abs(top)) > r7) {
                    f0Var2 = f0Var3;
                    r7 = r112;
                }
                if (top2 > 0 && (bottom = f0Var3.f561a.getBottom() - height) < 0 && f0Var3.f561a.getBottom() > f0Var.f561a.getBottom() && (r11 = Math.abs(bottom)) > r7) {
                    f0Var2 = f0Var3;
                    r7 = r11;
                }
            }
            return f0Var2;
        }

        public void c(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 RecyclerView.f0 f0Var) {
            o.f726a.a(f0Var.f561a);
        }

        public int d(int r4, int r5) {
            int r52;
            int r1 = r4 & d;
            if (r1 == 0) {
                return r4;
            }
            int r42 = r4 & (~r1);
            if (r5 == 0) {
                r52 = r1 >> 2;
            } else {
                int r53 = r1 >> 1;
                r42 |= (-3158065) & r53;
                r52 = (r53 & d) >> 2;
            }
            return r42 | r52;
        }

        final int f(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            return d(l(recyclerView, f0Var), b.i.p.f0.W(recyclerView));
        }

        public long g(@androidx.annotation.h0 RecyclerView recyclerView, int r2, float f2, float f3) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? r2 == 8 ? 200L : 250L : r2 == 8 ? itemAnimator.o() : itemAnimator.p();
        }

        public int h() {
            return 0;
        }

        public float k(@androidx.annotation.h0 RecyclerView.f0 f0Var) {
            return 0.5f;
        }

        public abstract int l(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 RecyclerView.f0 f0Var);

        public float m(float f2) {
            return f2;
        }

        public float n(@androidx.annotation.h0 RecyclerView.f0 f0Var) {
            return 0.5f;
        }

        public float o(float f2) {
            return f2;
        }

        boolean p(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            return (f(recyclerView, f0Var) & m.W) != 0;
        }

        boolean q(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            return (f(recyclerView, f0Var) & 65280) != 0;
        }

        public int r(@androidx.annotation.h0 RecyclerView recyclerView, int r6, int r7, int r8, long j) {
            int r5 = (int) (((int) (((int) Math.signum(r7)) * j(recyclerView) * g.getInterpolation(Math.min(1.0f, (Math.abs(r7) * 1.0f) / r6)))) * f.getInterpolation(j <= h ? j / 2000.0f : 1.0f));
            return r5 == 0 ? r7 > 0 ? 1 : -1 : r5;
        }

        public boolean s() {
            return true;
        }

        public boolean t() {
            return true;
        }

        public void w(@androidx.annotation.h0 Canvas canvas, @androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 RecyclerView.f0 f0Var, float f2, float f3, int r14, boolean z) {
            o.f726a.d(canvas, recyclerView, f0Var.f561a, f2, f3, r14, z);
        }

        public void x(@androidx.annotation.h0 Canvas canvas, @androidx.annotation.h0 RecyclerView recyclerView, RecyclerView.f0 f0Var, float f2, float f3, int r14, boolean z) {
            o.f726a.c(canvas, recyclerView, f0Var.f561a, f2, f3, r14, z);
        }

        void y(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, List<h> list, int r18, float f2, float f3) {
            int size = list.size();
            for (int r10 = 0; r10 < size; r10++) {
                h hVar = list.get(r10);
                hVar.e();
                int r12 = canvas.save();
                w(canvas, recyclerView, hVar.e, hVar.j, hVar.k, hVar.f, false);
                canvas.restoreToCount(r12);
            }
            if (f0Var != null) {
                int r9 = canvas.save();
                w(canvas, recyclerView, f0Var, f2, f3, r18, true);
                canvas.restoreToCount(r9);
            }
        }

        void z(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, List<h> list, int r19, float f2, float f3) {
            int size = list.size();
            boolean z = false;
            for (int r12 = 0; r12 < size; r12++) {
                h hVar = list.get(r12);
                int r13 = canvas.save();
                x(canvas, recyclerView, hVar.e, hVar.j, hVar.k, hVar.f, false);
                canvas.restoreToCount(r13);
            }
            if (f0Var != null) {
                int r122 = canvas.save();
                x(canvas, recyclerView, f0Var, f2, f3, r19, true);
                canvas.restoreToCount(r122);
            }
            for (int r10 = size - 1; r10 >= 0; r10--) {
                h hVar2 = list.get(r10);
                if (hVar2.m && !hVar2.i) {
                    list.remove(r10);
                } else if (!hVar2.m) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }
    }

    private class g extends GestureDetector.SimpleOnGestureListener {
        private boolean d = true;

        g() {
        }

        void a() {
            this.d = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewT;
            RecyclerView.f0 f0VarS0;
            if (!this.d || (viewT = m.this.t(motionEvent)) == null || (f0VarS0 = m.this.r.s0(viewT)) == null) {
                return;
            }
            m mVar = m.this;
            if (mVar.m.p(mVar.r, f0VarS0)) {
                int pointerId = motionEvent.getPointerId(0);
                int r2 = m.this.l;
                if (pointerId == r2) {
                    int r1 = motionEvent.findPointerIndex(r2);
                    float x = motionEvent.getX(r1);
                    float y = motionEvent.getY(r1);
                    m mVar2 = m.this;
                    mVar2.d = x;
                    mVar2.e = y;
                    mVar2.i = 0.0f;
                    mVar2.h = 0.0f;
                    if (mVar2.m.t()) {
                        m.this.F(f0VarS0, 2);
                    }
                }
            }
        }
    }

    private static class h implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final float f722a;

        /* renamed from: b, reason: collision with root package name */
        final float f723b;

        /* renamed from: c, reason: collision with root package name */
        final float f724c;
        final float d;
        final RecyclerView.f0 e;
        final int f;
        private final ValueAnimator g;
        final int h;
        boolean i;
        float j;
        float k;
        boolean l = false;
        boolean m = false;
        private float n;

        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        h(RecyclerView.f0 f0Var, int r3, int r4, float f, float f2, float f3, float f4) {
            this.f = r4;
            this.h = r3;
            this.e = f0Var;
            this.f722a = f;
            this.f723b = f2;
            this.f724c = f3;
            this.d = f4;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new a());
            this.g.setTarget(f0Var.f561a);
            this.g.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.g.cancel();
        }

        public void b(long j) {
            this.g.setDuration(j);
        }

        public void c(float f) {
            this.n = f;
        }

        public void d() {
            this.e.H(false);
            this.g.start();
        }

        public void e() {
            float f = this.f722a;
            float f2 = this.f724c;
            this.j = f == f2 ? this.e.f561a.getTranslationX() : f + (this.n * (f2 - f));
            float f3 = this.f723b;
            float f4 = this.d;
            this.k = f3 == f4 ? this.e.f561a.getTranslationY() : f3 + (this.n * (f4 - f3));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.m) {
                this.e.H(true);
            }
            this.m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static abstract class i extends f {
        private int i;
        private int j;

        public i(int r1, int r2) {
            this.i = r2;
            this.j = r1;
        }

        public int E(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 RecyclerView.f0 f0Var) {
            return this.j;
        }

        public int F(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 RecyclerView.f0 f0Var) {
            return this.i;
        }

        public void G(int r1) {
            this.j = r1;
        }

        public void H(int r1) {
            this.i = r1;
        }

        @Override // androidx.recyclerview.widget.m.f
        public int l(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 RecyclerView.f0 f0Var) {
            return f.v(E(recyclerView, f0Var), F(recyclerView, f0Var));
        }
    }

    public interface j {
        void b(@androidx.annotation.h0 View view, @androidx.annotation.h0 View view2, int r3, int r4);
    }

    public m(@androidx.annotation.h0 f fVar) {
        this.m = fVar;
    }

    private void C() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    private void G() {
        this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
        this.r.n(this);
        this.r.q(this.B);
        this.r.p(this);
        I();
    }

    private void I() {
        this.A = new g();
        this.z = new b.i.p.g(this.r.getContext(), this.A);
    }

    private void K() {
        g gVar = this.A;
        if (gVar != null) {
            gVar.a();
            this.A = null;
        }
        if (this.z != null) {
            this.z = null;
        }
    }

    private int L(RecyclerView.f0 f0Var) {
        if (this.n == 2) {
            return 0;
        }
        int r0 = this.m.l(this.r, f0Var);
        int r2 = (this.m.d(r0, b.i.p.f0.W(this.r)) & 65280) >> 8;
        if (r2 == 0) {
            return 0;
        }
        int r02 = (r0 & 65280) >> 8;
        if (Math.abs(this.h) > Math.abs(this.i)) {
            int r3 = n(f0Var, r2);
            if (r3 > 0) {
                return (r02 & r3) == 0 ? f.e(r3, b.i.p.f0.W(this.r)) : r3;
            }
            int r6 = p(f0Var, r2);
            if (r6 > 0) {
                return r6;
            }
        } else {
            int r32 = p(f0Var, r2);
            if (r32 > 0) {
                return r32;
            }
            int r62 = n(f0Var, r2);
            if (r62 > 0) {
                return (r02 & r62) == 0 ? f.e(r62, b.i.p.f0.W(this.r)) : r62;
            }
        }
        return 0;
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 21) {
            return;
        }
        if (this.w == null) {
            this.w = new e();
        }
        this.r.setChildDrawingOrderCallback(this.w);
    }

    private int n(RecyclerView.f0 f0Var, int r10) {
        if ((r10 & 12) == 0) {
            return 0;
        }
        int r0 = this.h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null && this.l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.m.o(this.g));
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int r1 = xVelocity <= 0.0f ? 4 : 8;
            float fAbs = Math.abs(xVelocity);
            if ((r1 & r10) != 0 && r0 == r1 && fAbs >= this.m.m(this.f) && fAbs > Math.abs(yVelocity)) {
                return r1;
            }
        }
        float width = this.r.getWidth() * this.m.n(f0Var);
        if ((r10 & r0) == 0 || Math.abs(this.h) <= width) {
            return 0;
        }
        return r0;
    }

    private int p(RecyclerView.f0 f0Var, int r10) {
        if ((r10 & 3) == 0) {
            return 0;
        }
        int r0 = this.i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null && this.l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.m.o(this.g));
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int r1 = yVelocity <= 0.0f ? 1 : 2;
            float fAbs = Math.abs(yVelocity);
            if ((r1 & r10) != 0 && r1 == r0 && fAbs >= this.m.m(this.f) && fAbs > Math.abs(xVelocity)) {
                return r1;
            }
        }
        float height = this.r.getHeight() * this.m.n(f0Var);
        if ((r10 & r0) == 0 || Math.abs(this.i) <= height) {
            return 0;
        }
        return r0;
    }

    private void q() {
        this.r.p1(this);
        this.r.s1(this.B);
        this.r.r1(this);
        for (int size = this.p.size() - 1; size >= 0; size--) {
            this.m.c(this.r, this.p.get(0).e);
        }
        this.p.clear();
        this.x = null;
        this.y = -1;
        C();
        K();
    }

    private List<RecyclerView.f0> u(RecyclerView.f0 f0Var) {
        RecyclerView.f0 f0Var2 = f0Var;
        List<RecyclerView.f0> list = this.u;
        if (list == null) {
            this.u = new ArrayList();
            this.v = new ArrayList();
        } else {
            list.clear();
            this.v.clear();
        }
        int r2 = this.m.h();
        int r3 = Math.round(this.j + this.h) - r2;
        int r4 = Math.round(this.k + this.i) - r2;
        int r22 = r2 * 2;
        int width = f0Var2.f561a.getWidth() + r3 + r22;
        int height = f0Var2.f561a.getHeight() + r4 + r22;
        int r23 = (r3 + width) / 2;
        int r7 = (r4 + height) / 2;
        RecyclerView.o layoutManager = this.r.getLayoutManager();
        int r9 = layoutManager.Q();
        int r11 = 0;
        while (r11 < r9) {
            View viewP = layoutManager.P(r11);
            if (viewP != f0Var2.f561a && viewP.getBottom() >= r4 && viewP.getTop() <= height && viewP.getRight() >= r3 && viewP.getLeft() <= width) {
                RecyclerView.f0 f0VarS0 = this.r.s0(viewP);
                if (this.m.a(this.r, this.f716c, f0VarS0)) {
                    int r10 = Math.abs(r23 - ((viewP.getLeft() + viewP.getRight()) / 2));
                    int r12 = Math.abs(r7 - ((viewP.getTop() + viewP.getBottom()) / 2));
                    int r102 = (r10 * r10) + (r12 * r12);
                    int size = this.u.size();
                    int r15 = 0;
                    for (int r14 = 0; r14 < size && r102 > this.v.get(r14).intValue(); r14++) {
                        r15++;
                    }
                    this.u.add(r15, f0VarS0);
                    this.v.add(r15, Integer.valueOf(r102));
                }
            }
            r11++;
            f0Var2 = f0Var;
        }
        return this.u;
    }

    private RecyclerView.f0 v(MotionEvent motionEvent) {
        View viewT;
        RecyclerView.o layoutManager = this.r.getLayoutManager();
        int r1 = this.l;
        if (r1 == -1) {
            return null;
        }
        int r12 = motionEvent.findPointerIndex(r1);
        float x = motionEvent.getX(r12) - this.d;
        float y = motionEvent.getY(r12) - this.e;
        float fAbs = Math.abs(x);
        float fAbs2 = Math.abs(y);
        int r4 = this.q;
        if (fAbs < r4 && fAbs2 < r4) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.n()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.o()) && (viewT = t(motionEvent)) != null) {
            return this.r.s0(viewT);
        }
        return null;
    }

    private void w(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.f716c.f561a.getLeft();
        } else {
            fArr[0] = this.f716c.f561a.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.f716c.f561a.getTop();
        } else {
            fArr[1] = this.f716c.f561a.getTranslationY();
        }
    }

    private static boolean y(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    void A() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.t = VelocityTracker.obtain();
    }

    void B(h hVar, int r4) {
        this.r.post(new d(hVar, r4));
    }

    void D(View view) {
        if (view == this.x) {
            this.x = null;
            if (this.w != null) {
                this.r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean E() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.E():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void F(@androidx.annotation.i0 androidx.recyclerview.widget.RecyclerView.f0 r24, int r25) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.F(androidx.recyclerview.widget.RecyclerView$f0, int):void");
    }

    public void H(@androidx.annotation.h0 RecyclerView.f0 f0Var) {
        if (!this.m.p(this.r, f0Var)) {
            Log.e(Q, "Start drag has been called but dragging is not enabled");
            return;
        }
        if (f0Var.f561a.getParent() != this.r) {
            Log.e(Q, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        A();
        this.i = 0.0f;
        this.h = 0.0f;
        F(f0Var, 2);
    }

    public void J(@androidx.annotation.h0 RecyclerView.f0 f0Var) {
        if (!this.m.q(this.r, f0Var)) {
            Log.e(Q, "Start swipe has been called but swiping is not enabled");
            return;
        }
        if (f0Var.f561a.getParent() != this.r) {
            Log.e(Q, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
            return;
        }
        A();
        this.i = 0.0f;
        this.h = 0.0f;
        F(f0Var, 1);
    }

    void M(MotionEvent motionEvent, int r3, int r4) {
        float x = motionEvent.getX(r4);
        float y = motionEvent.getY(r4);
        float f2 = x - this.d;
        this.h = f2;
        this.i = y - this.e;
        if ((r3 & 4) == 0) {
            this.h = Math.max(0.0f, f2);
        }
        if ((r3 & 8) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
        if ((r3 & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((r3 & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b(@androidx.annotation.h0 View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d(@androidx.annotation.h0 View view) {
        D(view);
        RecyclerView.f0 f0VarS0 = this.r.s0(view);
        if (f0VarS0 == null) {
            return;
        }
        RecyclerView.f0 f0Var = this.f716c;
        if (f0Var != null && f0VarS0 == f0Var) {
            F(null, 0);
            return;
        }
        r(f0VarS0, false);
        if (this.f714a.remove(f0VarS0.f561a)) {
            this.m.c(this.r, f0VarS0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        float f2;
        float f3;
        this.y = -1;
        if (this.f716c != null) {
            w(this.f715b);
            float[] fArr = this.f715b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.m.y(canvas, recyclerView, this.f716c, this.p, this.n, f2, f3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        float f2;
        float f3;
        if (this.f716c != null) {
            w(this.f715b);
            float[] fArr = this.f715b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.m.z(canvas, recyclerView, this.f716c, this.p, this.n, f2, f3);
    }

    public void m(@i0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            q();
        }
        this.r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f = resources.getDimension(a.c.item_touch_helper_swipe_escape_velocity);
            this.g = resources.getDimension(a.c.item_touch_helper_swipe_escape_max_velocity);
            G();
        }
    }

    void o(int r9, MotionEvent motionEvent, int r11) {
        RecyclerView.f0 f0VarV;
        int r2;
        if (this.f716c != null || r9 != 2 || this.n == 2 || !this.m.s() || this.r.getScrollState() == 1 || (f0VarV = v(motionEvent)) == null || (r2 = (this.m.f(this.r, f0VarV) & 65280) >> 8) == 0) {
            return;
        }
        float x = motionEvent.getX(r11);
        float y = motionEvent.getY(r11);
        float f2 = x - this.d;
        float f3 = y - this.e;
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f3);
        int r6 = this.q;
        if (fAbs >= r6 || fAbs2 >= r6) {
            if (fAbs > fAbs2) {
                if (f2 < 0.0f && (r2 & 4) == 0) {
                    return;
                }
                if (f2 > 0.0f && (r2 & 8) == 0) {
                    return;
                }
            } else {
                if (f3 < 0.0f && (r2 & 1) == 0) {
                    return;
                }
                if (f3 > 0.0f && (r2 & 2) == 0) {
                    return;
                }
            }
            this.i = 0.0f;
            this.h = 0.0f;
            this.l = motionEvent.getPointerId(0);
            F(f0VarV, 1);
        }
    }

    void r(RecyclerView.f0 f0Var, boolean z) {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(size);
            if (hVar.e == f0Var) {
                hVar.l |= z;
                if (!hVar.m) {
                    hVar.a();
                }
                this.p.remove(size);
                return;
            }
        }
    }

    h s(MotionEvent motionEvent) {
        if (this.p.isEmpty()) {
            return null;
        }
        View viewT = t(motionEvent);
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(size);
            if (hVar.e.f561a == viewT) {
                return hVar;
            }
        }
        return null;
    }

    View t(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.f0 f0Var = this.f716c;
        if (f0Var != null) {
            View view = f0Var.f561a;
            if (y(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(size);
            View view2 = hVar.e.f561a;
            if (y(view2, x, y, hVar.j, hVar.k)) {
                return view2;
            }
        }
        return this.r.Z(x, y);
    }

    boolean x() {
        int size = this.p.size();
        for (int r2 = 0; r2 < size; r2++) {
            if (!this.p.get(r2).m) {
                return true;
            }
        }
        return false;
    }

    void z(RecyclerView.f0 f0Var) {
        if (!this.r.isLayoutRequested() && this.n == 2) {
            float fK = this.m.k(f0Var);
            int r8 = (int) (this.j + this.h);
            int r9 = (int) (this.k + this.i);
            if (Math.abs(r9 - f0Var.f561a.getTop()) >= f0Var.f561a.getHeight() * fK || Math.abs(r8 - f0Var.f561a.getLeft()) >= f0Var.f561a.getWidth() * fK) {
                List<RecyclerView.f0> listU = u(f0Var);
                if (listU.size() == 0) {
                    return;
                }
                RecyclerView.f0 f0VarB = this.m.b(f0Var, listU, r8, r9);
                if (f0VarB == null) {
                    this.u.clear();
                    this.v.clear();
                    return;
                }
                int r7 = f0VarB.j();
                int r5 = f0Var.j();
                if (this.m.A(this.r, f0Var, f0VarB)) {
                    this.m.B(this.r, f0Var, r5, f0VarB, r7, r8, r9);
                }
            }
        }
    }
}
