package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.i0;
import androidx.annotation.k0;
import androidx.annotation.p0;
import androidx.annotation.x0;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.g0;
import androidx.recyclerview.widget.h0;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.y;
import b.i.p.p0.d;
import b.t.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements b.i.p.c0, b.i.p.q, b.i.p.r {
    static final String B0 = "RecyclerView";
    static final boolean C0 = false;
    static final boolean D0 = false;
    private static final int[] E0 = {R.attr.nestedScrollingEnabled};
    static final boolean F0;
    static final boolean G0;
    static final boolean H0;
    static final boolean I0;
    private static final boolean J0;
    private static final boolean K0;
    static final boolean L0 = false;
    public static final int M0 = 0;
    public static final int N0 = 1;
    static final int O0 = 1;
    public static final int P0 = -1;
    public static final long Q0 = -1;
    public static final int R0 = -1;
    public static final int S0 = 0;
    public static final int T0 = 1;
    public static final int U0 = Integer.MIN_VALUE;
    static final int V0 = 2000;
    static final String W0 = "RV Scroll";
    private static final String X0 = "RV OnLayout";
    private static final String Y0 = "RV FullInvalidate";
    private static final String Z0 = "RV PartialInvalidate";
    static final String a1 = "RV OnBindView";
    static final String b1 = "RV Prefetch";
    static final String c1 = "RV Nested Prefetch";
    static final String d1 = "RV CreateView";
    private static final Class<?>[] e1;
    private static final int f1 = -1;
    public static final int g1 = 0;
    public static final int h1 = 1;
    public static final int i1 = 2;
    static final long j1 = Long.MAX_VALUE;
    static final Interpolator k1;
    boolean A;
    private final h0.b A0;
    private boolean B;
    private int C;
    boolean D;
    private final AccessibilityManager E;
    private List<q> F;
    boolean G;
    boolean H;
    private int I;
    private int J;

    @androidx.annotation.h0
    private k K;
    private EdgeEffect L;
    private EdgeEffect M;
    private EdgeEffect N;
    private EdgeEffect O;
    l P;
    private int Q;
    private int R;
    private VelocityTracker S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int a0;
    private r b0;
    private final int c0;
    private final y d;
    private final int d0;
    final w e;
    private float e0;
    private z f;
    private float f0;
    androidx.recyclerview.widget.a g;
    private boolean g0;
    androidx.recyclerview.widget.g h;
    final e0 h0;
    final h0 i;
    androidx.recyclerview.widget.l i0;
    boolean j;
    l.b j0;
    final Runnable k;
    final c0 k0;
    final Rect l;
    private t l0;
    private final Rect m;
    private List<t> m0;
    final RectF n;
    boolean n0;
    g o;
    boolean o0;

    @x0
    o p;
    private l.c p0;
    x q;
    boolean q0;
    final ArrayList<n> r;
    androidx.recyclerview.widget.y r0;
    private final ArrayList<s> s;
    private j s0;
    private s t;
    private final int[] t0;
    boolean u;
    private b.i.p.t u0;
    boolean v;
    private final int[] v0;
    boolean w;
    private final int[] w0;

    @x0
    boolean x;
    final int[] x0;
    private int y;

    @x0
    final List<f0> y0;
    boolean z;
    private Runnable z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.x || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.u) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.A) {
                recyclerView2.z = true;
            } else {
                recyclerView2.E();
            }
        }
    }

    public static class a0 implements s {
        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean a(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void c(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void e(boolean z) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.P;
            if (lVar != null) {
                lVar.x();
            }
            RecyclerView.this.q0 = false;
        }
    }

    public static abstract class b0 {

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView f550b;

        /* renamed from: c, reason: collision with root package name */
        private o f551c;
        private boolean d;
        private boolean e;
        private View f;
        private boolean h;

        /* renamed from: a, reason: collision with root package name */
        private int f549a = -1;
        private final a g = new a(0, 0);

        public static class a {
            public static final int h = Integer.MIN_VALUE;

            /* renamed from: a, reason: collision with root package name */
            private int f552a;

            /* renamed from: b, reason: collision with root package name */
            private int f553b;

            /* renamed from: c, reason: collision with root package name */
            private int f554c;
            private int d;
            private Interpolator e;
            private boolean f;
            private int g;

            public a(@k0 int r3, @k0 int r4) {
                this(r3, r4, Integer.MIN_VALUE, null);
            }

            public a(@k0 int r2, @k0 int r3, int r4) {
                this(r2, r3, r4, null);
            }

            public a(@k0 int r2, @k0 int r3, int r4, @i0 Interpolator interpolator) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.f552a = r2;
                this.f553b = r3;
                this.f554c = r4;
                this.e = interpolator;
            }

            private void m() {
                if (this.e != null && this.f554c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f554c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public int a() {
                return this.f554c;
            }

            @k0
            public int b() {
                return this.f552a;
            }

            @k0
            public int c() {
                return this.f553b;
            }

            @i0
            public Interpolator d() {
                return this.e;
            }

            boolean e() {
                return this.d >= 0;
            }

            public void f(int r1) {
                this.d = r1;
            }

            void g(RecyclerView recyclerView) {
                int r0 = this.d;
                if (r0 >= 0) {
                    this.d = -1;
                    recyclerView.P0(r0);
                    this.f = false;
                } else {
                    if (!this.f) {
                        this.g = 0;
                        return;
                    }
                    m();
                    recyclerView.h0.f(this.f552a, this.f553b, this.f554c, this.e);
                    int r6 = this.g + 1;
                    this.g = r6;
                    if (r6 > 10) {
                        Log.e(RecyclerView.B0, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                }
            }

            public void h(int r2) {
                this.f = true;
                this.f554c = r2;
            }

            public void i(@k0 int r2) {
                this.f = true;
                this.f552a = r2;
            }

            public void j(@k0 int r2) {
                this.f = true;
                this.f553b = r2;
            }

            public void k(@i0 Interpolator interpolator) {
                this.f = true;
                this.e = interpolator;
            }

            public void l(@k0 int r1, @k0 int r2, int r3, @i0 Interpolator interpolator) {
                this.f552a = r1;
                this.f553b = r2;
                this.f554c = r3;
                this.e = interpolator;
                this.f = true;
            }
        }

        public interface b {
            @i0
            PointF a(int r1);
        }

        @i0
        public PointF a(int r3) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).a(r3);
            }
            Log.w(RecyclerView.B0, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int r2) {
            return this.f550b.p.J(r2);
        }

        public int c() {
            return this.f550b.p.Q();
        }

        public int d(View view) {
            return this.f550b.q0(view);
        }

        @i0
        public o e() {
            return this.f551c;
        }

        public int f() {
            return this.f549a;
        }

        @Deprecated
        public void g(int r2) {
            this.f550b.C1(r2);
        }

        public boolean h() {
            return this.d;
        }

        public boolean i() {
            return this.e;
        }

        protected void j(@androidx.annotation.h0 PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void k(int r6, int r7) {
            PointF pointFA;
            RecyclerView recyclerView = this.f550b;
            if (this.f549a == -1 || recyclerView == null) {
                s();
            }
            if (this.d && this.f == null && this.f551c != null && (pointFA = a(this.f549a)) != null && (pointFA.x != 0.0f || pointFA.y != 0.0f)) {
                recyclerView.B1((int) Math.signum(pointFA.x), (int) Math.signum(pointFA.y), null);
            }
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (d(view) == this.f549a) {
                    p(this.f, recyclerView.k0, this.g);
                    this.g.g(recyclerView);
                    s();
                } else {
                    Log.e(RecyclerView.B0, "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                m(r6, r7, recyclerView.k0, this.g);
                boolean zE = this.g.e();
                this.g.g(recyclerView);
                if (zE && this.e) {
                    this.d = true;
                    recyclerView.h0.e();
                }
            }
        }

        protected void l(View view) {
            if (d(view) == f()) {
                this.f = view;
            }
        }

        protected abstract void m(@k0 int r1, @k0 int r2, @androidx.annotation.h0 c0 c0Var, @androidx.annotation.h0 a aVar);

        protected abstract void n();

        protected abstract void o();

        protected abstract void p(@androidx.annotation.h0 View view, @androidx.annotation.h0 c0 c0Var, @androidx.annotation.h0 a aVar);

        public void q(int r1) {
            this.f549a = r1;
        }

        void r(RecyclerView recyclerView, o oVar) {
            recyclerView.h0.g();
            if (this.h) {
                Log.w(RecyclerView.B0, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f550b = recyclerView;
            this.f551c = oVar;
            int r4 = this.f549a;
            if (r4 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.k0.f555a = r4;
            this.e = true;
            this.d = true;
            this.f = b(f());
            n();
            this.f550b.h0.e();
            this.h = true;
        }

        protected final void s() {
            if (this.e) {
                this.e = false;
                o();
                this.f550b.k0.f555a = -1;
                this.f = null;
                this.f549a = -1;
                this.d = false;
                this.f551c.w1(this);
                this.f551c = null;
                this.f550b = null;
            }
        }
    }

    static class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public static class c0 {
        static final int r = 1;
        static final int s = 2;
        static final int t = 4;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<Object> f556b;
        int m;
        long n;
        int o;
        int p;
        int q;

        /* renamed from: a, reason: collision with root package name */
        int f555a = -1;

        /* renamed from: c, reason: collision with root package name */
        int f557c = 0;
        int d = 0;
        int e = 1;
        int f = 0;
        boolean g = false;
        boolean h = false;
        boolean i = false;
        boolean j = false;
        boolean k = false;
        boolean l = false;

        void a(int r4) {
            if ((this.e & r4) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(r4) + " but it is " + Integer.toBinaryString(this.e));
        }

        public boolean b() {
            return this.g;
        }

        public <T> T c(int r2) {
            SparseArray<Object> sparseArray = this.f556b;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(r2);
        }

        public int d() {
            return this.h ? this.f557c - this.d : this.f;
        }

        public int e() {
            return this.p;
        }

        public int f() {
            return this.q;
        }

        public int g() {
            return this.f555a;
        }

        public boolean h() {
            return this.f555a != -1;
        }

        public boolean i() {
            return this.j;
        }

        public boolean j() {
            return this.h;
        }

        void k(g gVar) {
            this.e = 1;
            this.f = gVar.e();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void l(int r2, Object obj) {
            if (this.f556b == null) {
                this.f556b = new SparseArray<>();
            }
            this.f556b.put(r2, obj);
        }

        public void m(int r2) {
            SparseArray<Object> sparseArray = this.f556b;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(r2);
        }

        public boolean n() {
            return this.l;
        }

        public boolean o() {
            return this.k;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f555a + ", mData=" + this.f556b + ", mItemCount=" + this.f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.f557c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    class d implements h0.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.h0.b
        public void a(f0 f0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.p.F1(f0Var.f561a, recyclerView.e);
        }

        @Override // androidx.recyclerview.widget.h0.b
        public void b(f0 f0Var, l.d dVar, l.d dVar2) {
            RecyclerView.this.s(f0Var, dVar, dVar2);
        }

        @Override // androidx.recyclerview.widget.h0.b
        public void c(f0 f0Var, @androidx.annotation.h0 l.d dVar, @i0 l.d dVar2) {
            RecyclerView.this.e.K(f0Var);
            RecyclerView.this.u(f0Var, dVar, dVar2);
        }

        @Override // androidx.recyclerview.widget.h0.b
        public void d(f0 f0Var, @androidx.annotation.h0 l.d dVar, @androidx.annotation.h0 l.d dVar2) {
            f0Var.H(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.G;
            l lVar = recyclerView.P;
            if (z) {
                if (!lVar.b(f0Var, f0Var, dVar, dVar2)) {
                    return;
                }
            } else if (!lVar.d(f0Var, dVar, dVar2)) {
                return;
            }
            RecyclerView.this.f1();
        }
    }

    public static abstract class d0 {
        @i0
        public abstract View a(@androidx.annotation.h0 w wVar, int r2, int r3);
    }

    class e implements g.b {
        e() {
        }

        @Override // androidx.recyclerview.widget.g.b
        public View a(int r2) {
            return RecyclerView.this.getChildAt(r2);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void b(View view) {
            f0 f0VarT0 = RecyclerView.t0(view);
            if (f0VarT0 != null) {
                f0VarT0.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.g.b
        public f0 c(View view) {
            return RecyclerView.t0(view);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void d(int r4) {
            f0 f0VarT0;
            View viewA = a(r4);
            if (viewA != null && (f0VarT0 = RecyclerView.t0(viewA)) != null) {
                if (f0VarT0.y() && !f0VarT0.K()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + f0VarT0 + RecyclerView.this.X());
                }
                f0VarT0.b(256);
            }
            RecyclerView.this.detachViewFromParent(r4);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void e(View view) {
            f0 f0VarT0 = RecyclerView.t0(view);
            if (f0VarT0 != null) {
                f0VarT0.D(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.g.b
        public void f(View view, int r3) {
            RecyclerView.this.addView(view, r3);
            RecyclerView.this.I(view);
        }

        @Override // androidx.recyclerview.widget.g.b
        public int g() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.g.b
        public void h(int r3) {
            View childAt = RecyclerView.this.getChildAt(r3);
            if (childAt != null) {
                RecyclerView.this.J(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(r3);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void i() {
            int r0 = g();
            for (int r1 = 0; r1 < r0; r1++) {
                View viewA = a(r1);
                RecyclerView.this.J(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.g.b
        public void j(View view, int r4, ViewGroup.LayoutParams layoutParams) {
            f0 f0VarT0 = RecyclerView.t0(view);
            if (f0VarT0 != null) {
                if (!f0VarT0.y() && !f0VarT0.K()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + f0VarT0 + RecyclerView.this.X());
                }
                f0VarT0.f();
            }
            RecyclerView.this.attachViewToParent(view, r4, layoutParams);
        }

        @Override // androidx.recyclerview.widget.g.b
        public int k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    class e0 implements Runnable {
        private int d;
        private int e;
        OverScroller f;
        Interpolator g = RecyclerView.k1;
        private boolean h = false;
        private boolean i = false;

        e0() {
            this.f = new OverScroller(RecyclerView.this.getContext(), RecyclerView.k1);
        }

        private int a(int r5, int r6, int r7, int r8) {
            int r52;
            int r0 = Math.abs(r5);
            int r1 = Math.abs(r6);
            boolean z = r0 > r1;
            int r72 = (int) Math.sqrt((r7 * r7) + (r8 * r8));
            int r53 = (int) Math.sqrt((r5 * r5) + (r6 * r6));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int r82 = width / 2;
            float f = width;
            float f2 = r82;
            float fB = f2 + (b(Math.min(1.0f, (r53 * 1.0f) / f)) * f2);
            if (r72 > 0) {
                r52 = Math.round(Math.abs(fB / r72) * 1000.0f) * 4;
            } else {
                if (!z) {
                    r0 = r1;
                }
                r52 = (int) (((r0 / f) + 1.0f) * 300.0f);
            }
            return Math.min(r52, RecyclerView.V0);
        }

        private float b(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            b.i.p.f0.i1(RecyclerView.this, this);
        }

        public void c(int r13, int r14) {
            RecyclerView.this.setScrollState(2);
            this.e = 0;
            this.d = 0;
            Interpolator interpolator = this.g;
            Interpolator interpolator2 = RecyclerView.k1;
            if (interpolator != interpolator2) {
                this.g = interpolator2;
                this.f = new OverScroller(RecyclerView.this.getContext(), RecyclerView.k1);
            }
            this.f.fling(0, 0, r13, r14, Integer.MIN_VALUE, ActivityChooserView.f.j, Integer.MIN_VALUE, ActivityChooserView.f.j);
            e();
        }

        void e() {
            if (this.h) {
                this.i = true;
            } else {
                d();
            }
        }

        public void f(int r8, int r9, int r10, @i0 Interpolator interpolator) {
            if (r10 == Integer.MIN_VALUE) {
                r10 = a(r8, r9, 0, 0);
            }
            int r6 = r10;
            if (interpolator == null) {
                interpolator = RecyclerView.k1;
            }
            if (this.g != interpolator) {
                this.g = interpolator;
                this.f = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.e = 0;
            this.d = 0;
            RecyclerView.this.setScrollState(2);
            this.f.startScroll(0, 0, r8, r9, r6);
            if (Build.VERSION.SDK_INT < 23) {
                this.f.computeScrollOffset();
            }
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int r7;
            int r8;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.p == null) {
                g();
                return;
            }
            this.i = false;
            this.h = true;
            recyclerView.E();
            OverScroller overScroller = this.f;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int r6 = currX - this.d;
                int r13 = currY - this.e;
                this.d = currX;
                this.e = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] r10 = recyclerView2.x0;
                r10[0] = 0;
                r10[1] = 0;
                if (recyclerView2.d(r6, r13, r10, null, 1)) {
                    int[] r4 = RecyclerView.this.x0;
                    r6 -= r4[0];
                    r13 -= r4[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.D(r6, r13);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.o != null) {
                    int[] r72 = recyclerView3.x0;
                    r72[0] = 0;
                    r72[1] = 0;
                    recyclerView3.B1(r6, r13, r72);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] r73 = recyclerView4.x0;
                    r8 = r73[0];
                    r7 = r73[1];
                    r6 -= r8;
                    r13 -= r7;
                    b0 b0Var = recyclerView4.p.g;
                    if (b0Var != null && !b0Var.h() && b0Var.i()) {
                        int r9 = RecyclerView.this.k0.d();
                        if (r9 == 0) {
                            b0Var.s();
                        } else {
                            if (b0Var.f() >= r9) {
                                b0Var.q(r9 - 1);
                            }
                            b0Var.k(r8, r7);
                        }
                    }
                } else {
                    r7 = 0;
                    r8 = 0;
                }
                if (!RecyclerView.this.r.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] r42 = recyclerView5.x0;
                r42[0] = 0;
                r42[1] = 0;
                recyclerView5.f(r8, r7, r6, r13, null, 1, r42);
                int[] r43 = RecyclerView.this.x0;
                int r62 = r6 - r43[0];
                int r132 = r13 - r43[1];
                if (r8 != 0 || r7 != 0) {
                    RecyclerView.this.Q(r8, r7);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || r62 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || r132 != 0));
                b0 b0Var2 = RecyclerView.this.p.g;
                if ((b0Var2 != null && b0Var2.h()) || !z) {
                    e();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    androidx.recyclerview.widget.l lVar = recyclerView6.i0;
                    if (lVar != null) {
                        lVar.f(recyclerView6, r8, r7);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int r44 = r62 < 0 ? -currVelocity : r62 > 0 ? currVelocity : 0;
                        if (r132 < 0) {
                            currVelocity = -currVelocity;
                        } else if (r132 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.h(r44, currVelocity);
                    }
                    if (RecyclerView.I0) {
                        RecyclerView.this.j0.b();
                    }
                }
            }
            b0 b0Var3 = RecyclerView.this.p.g;
            if (b0Var3 != null && b0Var3.h()) {
                b0Var3.k(0, 0);
            }
            this.h = false;
            if (this.i) {
                d();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.g(1);
            }
        }
    }

    class f implements a.InterfaceC0032a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0032a
        public void a(int r2, int r3) {
            RecyclerView.this.V0(r2, r3);
            RecyclerView.this.n0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0032a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0032a
        public f0 c(int r4) {
            f0 f0VarK0 = RecyclerView.this.k0(r4, true);
            if (f0VarK0 == null || RecyclerView.this.h.n(f0VarK0.f561a)) {
                return null;
            }
            return f0VarK0;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0032a
        public void d(int r3, int r4) {
            RecyclerView.this.W0(r3, r4, false);
            RecyclerView.this.n0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0032a
        public void e(int r2, int r3) {
            RecyclerView.this.U0(r2, r3);
            RecyclerView.this.n0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0032a
        public void f(int r3, int r4) {
            RecyclerView.this.W0(r3, r4, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.n0 = true;
            recyclerView.k0.d += r4;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0032a
        public void g(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0032a
        public void h(int r2, int r3, Object obj) {
            RecyclerView.this.Q1(r2, r3, obj);
            RecyclerView.this.o0 = true;
        }

        void i(a.b bVar) {
            int r0 = bVar.f609a;
            if (r0 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.p.i1(recyclerView, bVar.f610b, bVar.d);
                return;
            }
            if (r0 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.p.l1(recyclerView2, bVar.f610b, bVar.d);
            } else if (r0 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.p.n1(recyclerView3, bVar.f610b, bVar.d, bVar.f611c);
            } else {
                if (r0 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.p.k1(recyclerView4, bVar.f610b, bVar.d, 1);
            }
        }
    }

    public static abstract class f0 {
        static final int A = 512;
        static final int B = 1024;
        static final int C = 2048;
        static final int D = 4096;
        static final int E = -1;
        static final int F = 8192;
        private static final List<Object> G = Collections.emptyList();
        static final int s = 1;
        static final int t = 2;
        static final int u = 4;
        static final int v = 8;
        static final int w = 16;
        static final int x = 32;
        static final int y = 128;
        static final int z = 256;

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.h0
        public final View f561a;

        /* renamed from: b, reason: collision with root package name */
        WeakReference<RecyclerView> f562b;
        int j;
        RecyclerView r;

        /* renamed from: c, reason: collision with root package name */
        int f563c = -1;
        int d = -1;
        long e = -1;
        int f = -1;
        int g = -1;
        f0 h = null;
        f0 i = null;
        List<Object> k = null;
        List<Object> l = null;
        private int m = 0;
        w n = null;
        boolean o = false;
        private int p = 0;

        @x0
        int q = -1;

        public f0(@androidx.annotation.h0 View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f561a = view;
        }

        private void g() {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = Collections.unmodifiableList(arrayList);
            }
        }

        boolean A() {
            return (this.j & 2) != 0;
        }

        void B(int r3, boolean z2) {
            if (this.d == -1) {
                this.d = this.f563c;
            }
            if (this.g == -1) {
                this.g = this.f563c;
            }
            if (z2) {
                this.g += r3;
            }
            this.f563c += r3;
            if (this.f561a.getLayoutParams() != null) {
                ((p) this.f561a.getLayoutParams()).f586c = true;
            }
        }

        void C(RecyclerView recyclerView) {
            int r0 = this.q;
            if (r0 == -1) {
                r0 = b.i.p.f0.S(this.f561a);
            }
            this.p = r0;
            recyclerView.E1(this, 4);
        }

        void D(RecyclerView recyclerView) {
            recyclerView.E1(this, this.p);
            this.p = 0;
        }

        void E() {
            this.j = 0;
            this.f563c = -1;
            this.d = -1;
            this.e = -1L;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            d();
            this.p = 0;
            this.q = -1;
            RecyclerView.z(this);
        }

        void F() {
            if (this.d == -1) {
                this.d = this.f563c;
            }
        }

        void G(int r3, int r4) {
            this.j = (r3 & r4) | (this.j & (~r4));
        }

        public final void H(boolean z2) {
            int r3;
            int r1 = this.m;
            int r12 = z2 ? r1 - 1 : r1 + 1;
            this.m = r12;
            if (r12 < 0) {
                this.m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z2 && r12 == 1) {
                r3 = this.j | 16;
            } else if (!z2 || this.m != 0) {
                return;
            } else {
                r3 = this.j & (-17);
            }
            this.j = r3;
        }

        void I(w wVar, boolean z2) {
            this.n = wVar;
            this.o = z2;
        }

        boolean J() {
            return (this.j & 16) != 0;
        }

        boolean K() {
            return (this.j & 128) != 0;
        }

        void L() {
            this.j &= -129;
        }

        void M() {
            this.n.K(this);
        }

        boolean N() {
            return (this.j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.j) == 0) {
                g();
                this.k.add(obj);
            }
        }

        void b(int r2) {
            this.j = r2 | this.j;
        }

        void c() {
            this.d = -1;
            this.g = -1;
        }

        void d() {
            List<Object> list = this.k;
            if (list != null) {
                list.clear();
            }
            this.j &= -1025;
        }

        void e() {
            this.j &= -33;
        }

        void f() {
            this.j &= -257;
        }

        boolean h() {
            return (this.j & 16) == 0 && b.i.p.f0.H0(this.f561a);
        }

        void i(int r2, int r3, boolean z2) {
            b(8);
            B(r3, z2);
            this.f563c = r2;
        }

        public final int j() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m0(this);
        }

        public final long k() {
            return this.e;
        }

        public final int l() {
            return this.f;
        }

        public final int m() {
            int r0 = this.g;
            return r0 == -1 ? this.f563c : r0;
        }

        public final int n() {
            return this.d;
        }

        @Deprecated
        public final int o() {
            int r0 = this.g;
            return r0 == -1 ? this.f563c : r0;
        }

        List<Object> p() {
            if ((this.j & 1024) != 0) {
                return G;
            }
            List<Object> list = this.k;
            return (list == null || list.size() == 0) ? G : this.l;
        }

        boolean q(int r2) {
            return (r2 & this.j) != 0;
        }

        boolean r() {
            return (this.j & 512) != 0 || u();
        }

        boolean s() {
            return (this.f561a.getParent() == null || this.f561a.getParent() == this.r) ? false : true;
        }

        boolean t() {
            return (this.j & 1) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f563c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
            if (x()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (u()) {
                sb.append(" invalid");
            }
            if (!t()) {
                sb.append(" unbound");
            }
            if (A()) {
                sb.append(" update");
            }
            if (w()) {
                sb.append(" removed");
            }
            if (K()) {
                sb.append(" ignored");
            }
            if (y()) {
                sb.append(" tmpDetached");
            }
            if (!v()) {
                sb.append(" not recyclable(" + this.m + ")");
            }
            if (r()) {
                sb.append(" undefined adapter position");
            }
            if (this.f561a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        boolean u() {
            return (this.j & 4) != 0;
        }

        public final boolean v() {
            return (this.j & 16) == 0 && !b.i.p.f0.H0(this.f561a);
        }

        boolean w() {
            return (this.j & 8) != 0;
        }

        boolean x() {
            return this.n != null;
        }

        boolean y() {
            return (this.j & 256) != 0;
        }

        boolean z() {
            return (this.j & 2) != 0;
        }
    }

    public static abstract class g<VH extends f0> {

        /* renamed from: a, reason: collision with root package name */
        private final h f564a = new h();

        /* renamed from: b, reason: collision with root package name */
        private boolean f565b = false;

        public void A(@androidx.annotation.h0 VH vh) {
        }

        public void B(@androidx.annotation.h0 VH vh) {
        }

        public void C(@androidx.annotation.h0 i iVar) {
            this.f564a.registerObserver(iVar);
        }

        public void D(boolean z) {
            if (h()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f565b = z;
        }

        public void E(@androidx.annotation.h0 i iVar) {
            this.f564a.unregisterObserver(iVar);
        }

        public final void c(@androidx.annotation.h0 VH vh, int r4) {
            vh.f563c = r4;
            if (i()) {
                vh.e = f(r4);
            }
            vh.G(1, 519);
            b.i.k.o.b(RecyclerView.a1);
            v(vh, r4, vh.p());
            vh.d();
            ViewGroup.LayoutParams layoutParams = vh.f561a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f586c = true;
            }
            b.i.k.o.d();
        }

        @androidx.annotation.h0
        public final VH d(@androidx.annotation.h0 ViewGroup viewGroup, int r3) {
            try {
                b.i.k.o.b(RecyclerView.d1);
                VH vh = (VH) w(viewGroup, r3);
                if (vh.f561a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.f = r3;
                return vh;
            } finally {
                b.i.k.o.d();
            }
        }

        public abstract int e();

        public long f(int r3) {
            return -1L;
        }

        public int g(int r1) {
            return 0;
        }

        public final boolean h() {
            return this.f564a.a();
        }

        public final boolean i() {
            return this.f565b;
        }

        public final void j() {
            this.f564a.b();
        }

        public final void k(int r3) {
            this.f564a.d(r3, 1);
        }

        public final void l(int r3, @i0 Object obj) {
            this.f564a.e(r3, 1, obj);
        }

        public final void m(int r3) {
            this.f564a.f(r3, 1);
        }

        public final void n(int r2, int r3) {
            this.f564a.c(r2, r3);
        }

        public final void o(int r2, int r3) {
            this.f564a.d(r2, r3);
        }

        public final void p(int r2, int r3, @i0 Object obj) {
            this.f564a.e(r2, r3, obj);
        }

        public final void q(int r2, int r3) {
            this.f564a.f(r2, r3);
        }

        public final void r(int r2, int r3) {
            this.f564a.g(r2, r3);
        }

        public final void s(int r3) {
            this.f564a.g(r3, 1);
        }

        public void t(@androidx.annotation.h0 RecyclerView recyclerView) {
        }

        public abstract void u(@androidx.annotation.h0 VH vh, int r2);

        public void v(@androidx.annotation.h0 VH vh, int r2, @androidx.annotation.h0 List<Object> list) {
            u(vh, r2);
        }

        @androidx.annotation.h0
        public abstract VH w(@androidx.annotation.h0 ViewGroup viewGroup, int r2);

        public void x(@androidx.annotation.h0 RecyclerView recyclerView) {
        }

        public boolean y(@androidx.annotation.h0 VH vh) {
            return false;
        }

        public void z(@androidx.annotation.h0 VH vh) {
        }
    }

    static class h extends Observable<i> {
        h() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int r4, int r5) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).e(r4, r5, 1);
            }
        }

        public void d(int r2, int r3) {
            e(r2, r3, null);
        }

        public void e(int r3, int r4, @i0 Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).c(r3, r4, obj);
            }
        }

        public void f(int r3, int r4) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).d(r3, r4);
            }
        }

        public void g(int r3, int r4) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).f(r3, r4);
            }
        }
    }

    public static abstract class i {
        public void a() {
        }

        public void b(int r1, int r2) {
        }

        public void c(int r1, int r2, @i0 Object obj) {
            b(r1, r2);
        }

        public void d(int r1, int r2) {
        }

        public void e(int r1, int r2, int r3) {
        }

        public void f(int r1, int r2) {
        }
    }

    public interface j {
        int a(int r1, int r2);
    }

    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public static final int f566a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f567b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f568c = 2;
        public static final int d = 3;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        @androidx.annotation.h0
        protected EdgeEffect a(@androidx.annotation.h0 RecyclerView recyclerView, int r2) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {
        public static final int g = 2;
        public static final int h = 8;
        public static final int i = 4;
        public static final int j = 2048;
        public static final int k = 4096;

        /* renamed from: a, reason: collision with root package name */
        private c f569a = null;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<b> f570b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        private long f571c = 120;
        private long d = 120;
        private long e = 250;
        private long f = 250;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public interface b {
            void a();
        }

        interface c {
            void a(@androidx.annotation.h0 f0 f0Var);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f572a;

            /* renamed from: b, reason: collision with root package name */
            public int f573b;

            /* renamed from: c, reason: collision with root package name */
            public int f574c;
            public int d;
            public int e;

            @androidx.annotation.h0
            public d a(@androidx.annotation.h0 f0 f0Var) {
                return b(f0Var, 0);
            }

            @androidx.annotation.h0
            public d b(@androidx.annotation.h0 f0 f0Var, int r2) {
                View view = f0Var.f561a;
                this.f572a = view.getLeft();
                this.f573b = view.getTop();
                this.f574c = view.getRight();
                this.d = view.getBottom();
                return this;
            }
        }

        static int e(f0 f0Var) {
            int r0 = f0Var.j & 14;
            if (f0Var.u()) {
                return 4;
            }
            if ((r0 & 4) != 0) {
                return r0;
            }
            int r1 = f0Var.n();
            int r3 = f0Var.j();
            return (r1 == -1 || r3 == -1 || r1 == r3) ? r0 : r0 | 2048;
        }

        void A(c cVar) {
            this.f569a = cVar;
        }

        public void B(long j2) {
            this.e = j2;
        }

        public void C(long j2) {
            this.d = j2;
        }

        public abstract boolean a(@androidx.annotation.h0 f0 f0Var, @i0 d dVar, @androidx.annotation.h0 d dVar2);

        public abstract boolean b(@androidx.annotation.h0 f0 f0Var, @androidx.annotation.h0 f0 f0Var2, @androidx.annotation.h0 d dVar, @androidx.annotation.h0 d dVar2);

        public abstract boolean c(@androidx.annotation.h0 f0 f0Var, @androidx.annotation.h0 d dVar, @i0 d dVar2);

        public abstract boolean d(@androidx.annotation.h0 f0 f0Var, @androidx.annotation.h0 d dVar, @androidx.annotation.h0 d dVar2);

        public boolean f(@androidx.annotation.h0 f0 f0Var) {
            return true;
        }

        public boolean g(@androidx.annotation.h0 f0 f0Var, @androidx.annotation.h0 List<Object> list) {
            return f(f0Var);
        }

        public final void h(@androidx.annotation.h0 f0 f0Var) {
            t(f0Var);
            c cVar = this.f569a;
            if (cVar != null) {
                cVar.a(f0Var);
            }
        }

        public final void i(@androidx.annotation.h0 f0 f0Var) {
            u(f0Var);
        }

        public final void j() {
            int size = this.f570b.size();
            for (int r1 = 0; r1 < size; r1++) {
                this.f570b.get(r1).a();
            }
            this.f570b.clear();
        }

        public abstract void k(@androidx.annotation.h0 f0 f0Var);

        public abstract void l();

        public long m() {
            return this.f571c;
        }

        public long n() {
            return this.f;
        }

        public long o() {
            return this.e;
        }

        public long p() {
            return this.d;
        }

        public abstract boolean q();

        public final boolean r(@i0 b bVar) {
            boolean zQ = q();
            if (bVar != null) {
                if (zQ) {
                    this.f570b.add(bVar);
                } else {
                    bVar.a();
                }
            }
            return zQ;
        }

        @androidx.annotation.h0
        public d s() {
            return new d();
        }

        public void t(@androidx.annotation.h0 f0 f0Var) {
        }

        public void u(@androidx.annotation.h0 f0 f0Var) {
        }

        @androidx.annotation.h0
        public d v(@androidx.annotation.h0 c0 c0Var, @androidx.annotation.h0 f0 f0Var) {
            return s().a(f0Var);
        }

        @androidx.annotation.h0
        public d w(@androidx.annotation.h0 c0 c0Var, @androidx.annotation.h0 f0 f0Var, int r3, @androidx.annotation.h0 List<Object> list) {
            return s().a(f0Var);
        }

        public abstract void x();

        public void y(long j2) {
            this.f571c = j2;
        }

        public void z(long j2) {
            this.f = j2;
        }
    }

    private class m implements l.c {
        m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.c
        public void a(f0 f0Var) {
            f0Var.H(true);
            if (f0Var.h != null && f0Var.i == null) {
                f0Var.h = null;
            }
            f0Var.i = null;
            if (f0Var.J() || RecyclerView.this.o1(f0Var.f561a) || !f0Var.y()) {
                return;
            }
            RecyclerView.this.removeDetachedView(f0Var.f561a, false);
        }
    }

    public static abstract class n {
        @Deprecated
        public void f(@androidx.annotation.h0 Rect rect, int r2, @androidx.annotation.h0 RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void g(@androidx.annotation.h0 Rect rect, @androidx.annotation.h0 View view, @androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 c0 c0Var) {
            f(rect, ((p) view.getLayoutParams()).b(), recyclerView);
        }

        @Deprecated
        public void h(@androidx.annotation.h0 Canvas canvas, @androidx.annotation.h0 RecyclerView recyclerView) {
        }

        public void i(@androidx.annotation.h0 Canvas canvas, @androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 c0 c0Var) {
            h(canvas, recyclerView);
        }

        @Deprecated
        public void j(@androidx.annotation.h0 Canvas canvas, @androidx.annotation.h0 RecyclerView recyclerView) {
        }

        public void k(@androidx.annotation.h0 Canvas canvas, @androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 c0 c0Var) {
            j(canvas, recyclerView);
        }
    }

    public static abstract class o {

        /* renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.g f576a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView f577b;

        @i0
        b0 g;
        int m;
        boolean n;
        private int o;
        private int p;
        private int q;
        private int r;

        /* renamed from: c, reason: collision with root package name */
        private final g0.b f578c = new a();
        private final g0.b d = new b();
        g0 e = new g0(this.f578c);
        g0 f = new g0(this.d);
        boolean h = false;
        boolean i = false;
        boolean j = false;
        private boolean k = true;
        private boolean l = true;

        class a implements g0.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.g0.b
            public View a(int r2) {
                return o.this.P(r2);
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int b() {
                return o.this.z0() - o.this.p0();
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int c(View view) {
                return o.this.Y(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int d() {
                return o.this.o0();
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int e(View view) {
                return o.this.b0(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements g0.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.g0.b
            public View a(int r2) {
                return o.this.P(r2);
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int b() {
                return o.this.e0() - o.this.m0();
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int c(View view) {
                return o.this.c0(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int d() {
                return o.this.r0();
            }

            @Override // androidx.recyclerview.widget.g0.b
            public int e(View view) {
                return o.this.W(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int r1, int r2);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f581a;

            /* renamed from: b, reason: collision with root package name */
            public int f582b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f583c;
            public boolean d;
        }

        private void E(int r1, @androidx.annotation.h0 View view) {
            this.f576a.d(r1);
        }

        private boolean H0(RecyclerView recyclerView, int r8, int r9) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int r1 = o0();
            int r2 = r0();
            int r3 = z0() - p0();
            int r4 = e0() - m0();
            Rect rect = this.f577b.l;
            X(focusedChild, rect);
            return rect.left - r8 < r3 && rect.right - r8 > r1 && rect.top - r9 < r4 && rect.bottom - r9 > r2;
        }

        private static boolean L0(int r3, int r4, int r5) {
            int mode = View.MeasureSpec.getMode(r4);
            int size = View.MeasureSpec.getSize(r4);
            if (r5 > 0 && r3 != r5) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= r3;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == r3;
            }
            return true;
        }

        private void P1(w wVar, int r4, View view) {
            f0 f0VarT0 = RecyclerView.t0(view);
            if (f0VarT0.K()) {
                return;
            }
            if (f0VarT0.u() && !f0VarT0.w() && !this.f577b.o.i()) {
                K1(r4);
                wVar.D(f0VarT0);
            } else {
                D(r4);
                wVar.E(view);
                this.f577b.i.k(f0VarT0);
            }
        }

        public static int R(int r4, int r5, int r6, int r7, boolean z) {
            int r42 = Math.max(0, r4 - r6);
            if (z) {
                if (r7 < 0) {
                    if (r7 != -1 || (r5 != Integer.MIN_VALUE && (r5 == 0 || r5 != 1073741824))) {
                        r5 = 0;
                        r7 = 0;
                    } else {
                        r7 = r42;
                    }
                }
                r5 = 1073741824;
            } else {
                if (r7 < 0) {
                    if (r7 != -1) {
                        if (r7 == -2) {
                            r5 = (r5 == Integer.MIN_VALUE || r5 == 1073741824) ? Integer.MIN_VALUE : 0;
                        }
                        r5 = 0;
                        r7 = 0;
                    }
                    r7 = r42;
                }
                r5 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(r7, r5);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int S(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto Lf
                if (r3 < 0) goto Ld
                goto L11
            Ld:
                r3 = 0
                goto L21
            Lf:
                if (r3 < 0) goto L14
            L11:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L21
            L14:
                r4 = -1
                if (r3 != r4) goto L1b
                r2 = 1073741824(0x40000000, float:2.0)
            L19:
                r3 = r1
                goto L21
            L1b:
                r4 = -2
                if (r3 != r4) goto Ld
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L19
            L21:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.S(int, int, int, boolean):int");
        }

        private int[] T(View view, Rect rect) {
            int[] r0 = new int[2];
            int r1 = o0();
            int r2 = r0();
            int r3 = z0() - p0();
            int r4 = e0() - m0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int r10 = rect.width() + left;
            int r11 = rect.height() + top;
            int r5 = left - r1;
            int r7 = Math.min(0, r5);
            int r6 = top - r2;
            int r22 = Math.min(0, r6);
            int r102 = r10 - r3;
            int r32 = Math.max(0, r102);
            int r112 = Math.max(0, r11 - r4);
            if (i0() != 1) {
                if (r7 == 0) {
                    r7 = Math.min(r5, r32);
                }
                r32 = r7;
            } else if (r32 == 0) {
                r32 = Math.max(r7, r102);
            }
            if (r22 == 0) {
                r22 = Math.min(r6, r112);
            }
            r0[0] = r32;
            r0[1] = r22;
            return r0;
        }

        private void g(View view, int r6, boolean z) {
            f0 f0VarT0 = RecyclerView.t0(view);
            if (z || f0VarT0.w()) {
                this.f577b.i.b(f0VarT0);
            } else {
                this.f577b.i.p(f0VarT0);
            }
            p pVar = (p) view.getLayoutParams();
            if (f0VarT0.N() || f0VarT0.x()) {
                if (f0VarT0.x()) {
                    f0VarT0.M();
                } else {
                    f0VarT0.e();
                }
                this.f576a.c(view, r6, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f577b) {
                int r1 = this.f576a.m(view);
                if (r6 == -1) {
                    r6 = this.f576a.g();
                }
                if (r1 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f577b.indexOfChild(view) + this.f577b.X());
                }
                if (r1 != r6) {
                    this.f577b.p.S0(r1, r6);
                }
            } else {
                this.f576a.a(view, r6, false);
                pVar.f586c = true;
                b0 b0Var = this.g;
                if (b0Var != null && b0Var.i()) {
                    this.g.l(view);
                }
            }
            if (pVar.d) {
                f0VarT0.f561a.invalidate();
                pVar.d = false;
            }
        }

        public static int q(int r2, int r3, int r4) {
            int mode = View.MeasureSpec.getMode(r2);
            int size = View.MeasureSpec.getSize(r2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(r3, r4) : size : Math.min(size, Math.max(r3, r4));
        }

        public static d t0(@androidx.annotation.h0 Context context, @i0 AttributeSet attributeSet, int r4, int r5) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.RecyclerView, r4, r5);
            dVar.f581a = typedArrayObtainStyledAttributes.getInt(a.j.RecyclerView_android_orientation, 1);
            dVar.f582b = typedArrayObtainStyledAttributes.getInt(a.j.RecyclerView_spanCount, 1);
            dVar.f583c = typedArrayObtainStyledAttributes.getBoolean(a.j.RecyclerView_reverseLayout, false);
            dVar.d = typedArrayObtainStyledAttributes.getBoolean(a.j.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public void A(@androidx.annotation.h0 View view, @androidx.annotation.h0 w wVar) {
            P1(wVar, this.f576a.m(view), view);
        }

        public int A0() {
            return this.o;
        }

        public boolean A1(@androidx.annotation.h0 w wVar, @androidx.annotation.h0 c0 c0Var, @androidx.annotation.h0 View view, int r4, @i0 Bundle bundle) {
            return false;
        }

        public void B(int r2, @androidx.annotation.h0 w wVar) {
            P1(wVar, r2, P(r2));
        }

        boolean B0() {
            int r0 = Q();
            for (int r2 = 0; r2 < r0; r2++) {
                ViewGroup.LayoutParams layoutParams = P(r2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void B1(Runnable runnable) {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView != null) {
                b.i.p.f0.i1(recyclerView, runnable);
            }
        }

        public void C(@androidx.annotation.h0 View view) {
            int r0 = this.f576a.m(view);
            if (r0 >= 0) {
                E(r0, view);
            }
        }

        public boolean C0() {
            RecyclerView recyclerView = this.f577b;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void C1() {
            for (int r0 = Q() - 1; r0 >= 0; r0--) {
                this.f576a.q(r0);
            }
        }

        public void D(int r2) {
            E(r2, P(r2));
        }

        public void D0(@androidx.annotation.h0 View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f577b;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f577b.X());
            }
            f0 f0VarT0 = RecyclerView.t0(view);
            f0VarT0.b(128);
            this.f577b.i.q(f0VarT0);
        }

        public void D1(@androidx.annotation.h0 w wVar) {
            for (int r0 = Q() - 1; r0 >= 0; r0--) {
                if (!RecyclerView.t0(P(r0)).K()) {
                    G1(r0, wVar);
                }
            }
        }

        public boolean E0() {
            return this.i;
        }

        void E1(w wVar) {
            int r0 = wVar.k();
            for (int r1 = r0 - 1; r1 >= 0; r1--) {
                View viewO = wVar.o(r1);
                f0 f0VarT0 = RecyclerView.t0(viewO);
                if (!f0VarT0.K()) {
                    f0VarT0.H(false);
                    if (f0VarT0.y()) {
                        this.f577b.removeDetachedView(viewO, false);
                    }
                    l lVar = this.f577b.P;
                    if (lVar != null) {
                        lVar.k(f0VarT0);
                    }
                    f0VarT0.H(true);
                    wVar.z(viewO);
                }
            }
            wVar.f();
            if (r0 > 0) {
                this.f577b.invalidate();
            }
        }

        void F(RecyclerView recyclerView) {
            this.i = true;
            X0(recyclerView);
        }

        public boolean F0() {
            return this.j;
        }

        public void F1(@androidx.annotation.h0 View view, @androidx.annotation.h0 w wVar) {
            J1(view);
            wVar.C(view);
        }

        void G(RecyclerView recyclerView, w wVar) {
            this.i = false;
            Z0(recyclerView, wVar);
        }

        public boolean G0() {
            RecyclerView recyclerView = this.f577b;
            return recyclerView != null && recyclerView.isFocused();
        }

        public void G1(int r2, @androidx.annotation.h0 w wVar) {
            View viewP = P(r2);
            K1(r2);
            wVar.C(viewP);
        }

        public void H(View view) {
            l lVar = this.f577b.P;
            if (lVar != null) {
                lVar.k(RecyclerView.t0(view));
            }
        }

        public boolean H1(Runnable runnable) {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @i0
        public View I(@androidx.annotation.h0 View view) {
            View viewA0;
            RecyclerView recyclerView = this.f577b;
            if (recyclerView == null || (viewA0 = recyclerView.a0(view)) == null || this.f576a.n(viewA0)) {
                return null;
            }
            return viewA0;
        }

        public final boolean I0() {
            return this.l;
        }

        public void I1(@androidx.annotation.h0 View view) {
            this.f577b.removeDetachedView(view, false);
        }

        @i0
        public View J(int r6) {
            int r0 = Q();
            for (int r1 = 0; r1 < r0; r1++) {
                View viewP = P(r1);
                f0 f0VarT0 = RecyclerView.t0(viewP);
                if (f0VarT0 != null && f0VarT0.m() == r6 && !f0VarT0.K() && (this.f577b.k0.j() || !f0VarT0.w())) {
                    return viewP;
                }
            }
            return null;
        }

        public boolean J0(@androidx.annotation.h0 w wVar, @androidx.annotation.h0 c0 c0Var) {
            return false;
        }

        public void J1(View view) {
            this.f576a.p(view);
        }

        public abstract p K();

        public boolean K0() {
            return this.k;
        }

        public void K1(int r2) {
            if (P(r2) != null) {
                this.f576a.q(r2);
            }
        }

        public p L(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public boolean L1(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 View view, @androidx.annotation.h0 Rect rect, boolean z) {
            return M1(recyclerView, view, rect, z, false);
        }

        public p M(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public boolean M0() {
            b0 b0Var = this.g;
            return b0Var != null && b0Var.i();
        }

        public boolean M1(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 View view, @androidx.annotation.h0 Rect rect, boolean z, boolean z2) {
            int[] r4 = T(view, rect);
            int r0 = r4[0];
            int r42 = r4[1];
            if ((z2 && !H0(recyclerView, r0, r42)) || (r0 == 0 && r42 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(r0, r42);
            } else {
                recyclerView.G1(r0, r42);
            }
            return true;
        }

        public int N() {
            return -1;
        }

        public boolean N0(@androidx.annotation.h0 View view, boolean z, boolean z2) {
            boolean z3 = this.e.b(view, 24579) && this.f.b(view, 24579);
            return z ? z3 : !z3;
        }

        public void N1() {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int O(@androidx.annotation.h0 View view) {
            return ((p) view.getLayoutParams()).f585b.bottom;
        }

        public void O0(@androidx.annotation.h0 View view, int r4, int r5, int r6, int r7) {
            Rect rect = ((p) view.getLayoutParams()).f585b;
            view.layout(r4 + rect.left, r5 + rect.top, r6 - rect.right, r7 - rect.bottom);
        }

        public void O1() {
            this.h = true;
        }

        @i0
        public View P(int r2) {
            androidx.recyclerview.widget.g gVar = this.f576a;
            if (gVar != null) {
                return gVar.f(r2);
            }
            return null;
        }

        public void P0(@androidx.annotation.h0 View view, int r5, int r6, int r7, int r8) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f585b;
            view.layout(r5 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, r6 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (r7 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (r8 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public int Q() {
            androidx.recyclerview.widget.g gVar = this.f576a;
            if (gVar != null) {
                return gVar.g();
            }
            return 0;
        }

        public void Q0(@androidx.annotation.h0 View view, int r7, int r8) {
            p pVar = (p) view.getLayoutParams();
            Rect rectY0 = this.f577b.y0(view);
            int r72 = r7 + rectY0.left + rectY0.right;
            int r82 = r8 + rectY0.top + rectY0.bottom;
            int r73 = R(z0(), A0(), o0() + p0() + r72, ((ViewGroup.MarginLayoutParams) pVar).width, n());
            int r83 = R(e0(), f0(), r0() + m0() + r82, ((ViewGroup.MarginLayoutParams) pVar).height, o());
            if (c2(view, r73, r83, pVar)) {
                view.measure(r73, r83);
            }
        }

        public int Q1(int r1, w wVar, c0 c0Var) {
            return 0;
        }

        public void R0(@androidx.annotation.h0 View view, int r7, int r8) {
            p pVar = (p) view.getLayoutParams();
            Rect rectY0 = this.f577b.y0(view);
            int r72 = r7 + rectY0.left + rectY0.right;
            int r82 = r8 + rectY0.top + rectY0.bottom;
            int r73 = R(z0(), A0(), o0() + p0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + r72, ((ViewGroup.MarginLayoutParams) pVar).width, n());
            int r83 = R(e0(), f0(), r0() + m0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + r82, ((ViewGroup.MarginLayoutParams) pVar).height, o());
            if (c2(view, r73, r83, pVar)) {
                view.measure(r73, r83);
            }
        }

        public void R1(int r1) {
        }

        public void S0(int r3, int r4) {
            View viewP = P(r3);
            if (viewP != null) {
                D(r3);
                k(viewP, r4);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + r3 + this.f577b.toString());
            }
        }

        public int S1(int r1, w wVar, c0 c0Var) {
            return 0;
        }

        public void T0(@k0 int r2) {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView != null) {
                recyclerView.S0(r2);
            }
        }

        @Deprecated
        public void T1(boolean z) {
            this.j = z;
        }

        public boolean U() {
            RecyclerView recyclerView = this.f577b;
            return recyclerView != null && recyclerView.j;
        }

        public void U0(@k0 int r2) {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView != null) {
                recyclerView.T0(r2);
            }
        }

        void U1(RecyclerView recyclerView) {
            W1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int V(@androidx.annotation.h0 w wVar, @androidx.annotation.h0 c0 c0Var) {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView == null || recyclerView.o == null || !n()) {
                return 1;
            }
            return this.f577b.o.e();
        }

        public void V0(@i0 g gVar, @i0 g gVar2) {
        }

        public final void V1(boolean z) {
            if (z != this.l) {
                this.l = z;
                this.m = 0;
                RecyclerView recyclerView = this.f577b;
                if (recyclerView != null) {
                    recyclerView.e.L();
                }
            }
        }

        public int W(@androidx.annotation.h0 View view) {
            return view.getBottom() + O(view);
        }

        public boolean W0(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 ArrayList<View> arrayList, int r3, int r4) {
            return false;
        }

        void W1(int r2, int r3) {
            this.q = View.MeasureSpec.getSize(r2);
            int mode = View.MeasureSpec.getMode(r2);
            this.o = mode;
            if (mode == 0 && !RecyclerView.G0) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(r3);
            int mode2 = View.MeasureSpec.getMode(r3);
            this.p = mode2;
            if (mode2 != 0 || RecyclerView.G0) {
                return;
            }
            this.r = 0;
        }

        public void X(@androidx.annotation.h0 View view, @androidx.annotation.h0 Rect rect) {
            RecyclerView.v0(view, rect);
        }

        @androidx.annotation.i
        public void X0(RecyclerView recyclerView) {
        }

        public void X1(int r2, int r3) {
            this.f577b.setMeasuredDimension(r2, r3);
        }

        public int Y(@androidx.annotation.h0 View view) {
            return view.getLeft() - j0(view);
        }

        @Deprecated
        public void Y0(RecyclerView recyclerView) {
        }

        public void Y1(Rect rect, int r4, int r5) {
            X1(q(r4, rect.width() + o0() + p0(), l0()), q(r5, rect.height() + r0() + m0(), k0()));
        }

        public int Z(@androidx.annotation.h0 View view) {
            Rect rect = ((p) view.getLayoutParams()).f585b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        @androidx.annotation.i
        public void Z0(RecyclerView recyclerView, w wVar) {
            Y0(recyclerView);
        }

        void Z1(int r9, int r10) {
            int r0 = Q();
            if (r0 == 0) {
                this.f577b.G(r9, r10);
                return;
            }
            int r2 = Integer.MIN_VALUE;
            int r3 = Integer.MIN_VALUE;
            int r4 = ActivityChooserView.f.j;
            int r5 = ActivityChooserView.f.j;
            for (int r1 = 0; r1 < r0; r1++) {
                View viewP = P(r1);
                Rect rect = this.f577b.l;
                X(viewP, rect);
                int r6 = rect.left;
                if (r6 < r4) {
                    r4 = r6;
                }
                int r62 = rect.right;
                if (r62 > r2) {
                    r2 = r62;
                }
                int r63 = rect.top;
                if (r63 < r5) {
                    r5 = r63;
                }
                int r64 = rect.bottom;
                if (r64 > r3) {
                    r3 = r64;
                }
            }
            this.f577b.l.set(r4, r5, r2, r3);
            Y1(this.f577b.l, r9, r10);
        }

        public int a0(@androidx.annotation.h0 View view) {
            Rect rect = ((p) view.getLayoutParams()).f585b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        @i0
        public View a1(@androidx.annotation.h0 View view, int r2, @androidx.annotation.h0 w wVar, @androidx.annotation.h0 c0 c0Var) {
            return null;
        }

        public void a2(boolean z) {
            this.k = z;
        }

        public int b0(@androidx.annotation.h0 View view) {
            return view.getRight() + u0(view);
        }

        public void b1(@androidx.annotation.h0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f577b;
            c1(recyclerView.e, recyclerView.k0, accessibilityEvent);
        }

        void b2(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f577b = null;
                this.f576a = null;
                height = 0;
                this.q = 0;
            } else {
                this.f577b = recyclerView;
                this.f576a = recyclerView.h;
                this.q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.r = height;
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public void c(View view) {
            d(view, -1);
        }

        public int c0(@androidx.annotation.h0 View view) {
            return view.getTop() - x0(view);
        }

        public void c1(@androidx.annotation.h0 w wVar, @androidx.annotation.h0 c0 c0Var, @androidx.annotation.h0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f577b.canScrollVertically(-1) && !this.f577b.canScrollHorizontally(-1) && !this.f577b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            g gVar = this.f577b.o;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.e());
            }
        }

        boolean c2(View view, int r4, int r5, p pVar) {
            return (!view.isLayoutRequested() && this.k && L0(view.getWidth(), r4, ((ViewGroup.MarginLayoutParams) pVar).width) && L0(view.getHeight(), r5, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public void d(View view, int r3) {
            g(view, r3, true);
        }

        @i0
        public View d0() {
            View focusedChild;
            RecyclerView recyclerView = this.f577b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f576a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        void d1(b.i.p.p0.d dVar) {
            RecyclerView recyclerView = this.f577b;
            e1(recyclerView.e, recyclerView.k0, dVar);
        }

        boolean d2() {
            return false;
        }

        public void e(View view) {
            f(view, -1);
        }

        @k0
        public int e0() {
            return this.r;
        }

        public void e1(@androidx.annotation.h0 w wVar, @androidx.annotation.h0 c0 c0Var, @androidx.annotation.h0 b.i.p.p0.d dVar) {
            if (this.f577b.canScrollVertically(-1) || this.f577b.canScrollHorizontally(-1)) {
                dVar.a(8192);
                dVar.C1(true);
            }
            if (this.f577b.canScrollVertically(1) || this.f577b.canScrollHorizontally(1)) {
                dVar.a(4096);
                dVar.C1(true);
            }
            dVar.V0(d.b.f(v0(wVar, c0Var), V(wVar, c0Var), J0(wVar, c0Var), w0(wVar, c0Var)));
        }

        boolean e2(View view, int r4, int r5, p pVar) {
            return (this.k && L0(view.getMeasuredWidth(), r4, ((ViewGroup.MarginLayoutParams) pVar).width) && L0(view.getMeasuredHeight(), r5, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public void f(View view, int r3) {
            g(view, r3, false);
        }

        public int f0() {
            return this.p;
        }

        void f1(View view, b.i.p.p0.d dVar) {
            f0 f0VarT0 = RecyclerView.t0(view);
            if (f0VarT0 == null || f0VarT0.w() || this.f576a.n(f0VarT0.f561a)) {
                return;
            }
            RecyclerView recyclerView = this.f577b;
            g1(recyclerView.e, recyclerView.k0, view, dVar);
        }

        public void f2(RecyclerView recyclerView, c0 c0Var, int r3) {
            Log.e(RecyclerView.B0, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int g0() {
            RecyclerView recyclerView = this.f577b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.e();
            }
            return 0;
        }

        public void g1(@androidx.annotation.h0 w wVar, @androidx.annotation.h0 c0 c0Var, @androidx.annotation.h0 View view, @androidx.annotation.h0 b.i.p.p0.d dVar) {
            dVar.W0(d.c.h(o() ? s0(view) : 0, 1, n() ? s0(view) : 0, 1, false, false));
        }

        public void g2(b0 b0Var) {
            b0 b0Var2 = this.g;
            if (b0Var2 != null && b0Var != b0Var2 && b0Var2.i()) {
                this.g.s();
            }
            this.g = b0Var;
            b0Var.r(this.f577b, this);
        }

        public void h(String str) {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView != null) {
                recyclerView.v(str);
            }
        }

        public int h0(@androidx.annotation.h0 View view) {
            return RecyclerView.t0(view).l();
        }

        @i0
        public View h1(@androidx.annotation.h0 View view, int r2) {
            return null;
        }

        public void h2(@androidx.annotation.h0 View view) {
            f0 f0VarT0 = RecyclerView.t0(view);
            f0VarT0.L();
            f0VarT0.E();
            f0VarT0.b(4);
        }

        public void i(String str) {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView != null) {
                recyclerView.w(str);
            }
        }

        public int i0() {
            return b.i.p.f0.W(this.f577b);
        }

        public void i1(@androidx.annotation.h0 RecyclerView recyclerView, int r2, int r3) {
        }

        void i2() {
            b0 b0Var = this.g;
            if (b0Var != null) {
                b0Var.s();
            }
        }

        public void j(@androidx.annotation.h0 View view) {
            k(view, -1);
        }

        public int j0(@androidx.annotation.h0 View view) {
            return ((p) view.getLayoutParams()).f585b.left;
        }

        public void j1(@androidx.annotation.h0 RecyclerView recyclerView) {
        }

        public boolean j2() {
            return false;
        }

        public void k(@androidx.annotation.h0 View view, int r3) {
            l(view, r3, (p) view.getLayoutParams());
        }

        @k0
        public int k0() {
            return b.i.p.f0.b0(this.f577b);
        }

        public void k1(@androidx.annotation.h0 RecyclerView recyclerView, int r2, int r3, int r4) {
        }

        public void l(@androidx.annotation.h0 View view, int r4, p pVar) {
            f0 f0VarT0 = RecyclerView.t0(view);
            if (f0VarT0.w()) {
                this.f577b.i.b(f0VarT0);
            } else {
                this.f577b.i.p(f0VarT0);
            }
            this.f576a.c(view, r4, pVar, f0VarT0.w());
        }

        @k0
        public int l0() {
            return b.i.p.f0.c0(this.f577b);
        }

        public void l1(@androidx.annotation.h0 RecyclerView recyclerView, int r2, int r3) {
        }

        public void m(@androidx.annotation.h0 View view, @androidx.annotation.h0 Rect rect) {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.y0(view));
            }
        }

        @k0
        public int m0() {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void m1(@androidx.annotation.h0 RecyclerView recyclerView, int r2, int r3) {
        }

        public boolean n() {
            return false;
        }

        @k0
        public int n0() {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView != null) {
                return b.i.p.f0.g0(recyclerView);
            }
            return 0;
        }

        public void n1(@androidx.annotation.h0 RecyclerView recyclerView, int r2, int r3, @i0 Object obj) {
            m1(recyclerView, r2, r3);
        }

        public boolean o() {
            return false;
        }

        @k0
        public int o0() {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void o1(w wVar, c0 c0Var) {
            Log.e(RecyclerView.B0, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public boolean p(p pVar) {
            return pVar != null;
        }

        @k0
        public int p0() {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void p1(c0 c0Var) {
        }

        @k0
        public int q0() {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView != null) {
                return b.i.p.f0.h0(recyclerView);
            }
            return 0;
        }

        public void q1(@androidx.annotation.h0 w wVar, @androidx.annotation.h0 c0 c0Var, int r3, int r4) {
            this.f577b.G(r3, r4);
        }

        public void r(int r1, int r2, c0 c0Var, c cVar) {
        }

        @k0
        public int r0() {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        @Deprecated
        public boolean r1(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 View view, @i0 View view2) {
            return M0() || recyclerView.M0();
        }

        public void s(int r1, c cVar) {
        }

        public int s0(@androidx.annotation.h0 View view) {
            return ((p) view.getLayoutParams()).b();
        }

        public boolean s1(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 c0 c0Var, @androidx.annotation.h0 View view, @i0 View view2) {
            return r1(recyclerView, view, view2);
        }

        public int t(@androidx.annotation.h0 c0 c0Var) {
            return 0;
        }

        public void t1(Parcelable parcelable) {
        }

        public int u(@androidx.annotation.h0 c0 c0Var) {
            return 0;
        }

        public int u0(@androidx.annotation.h0 View view) {
            return ((p) view.getLayoutParams()).f585b.right;
        }

        @i0
        public Parcelable u1() {
            return null;
        }

        public int v(@androidx.annotation.h0 c0 c0Var) {
            return 0;
        }

        public int v0(@androidx.annotation.h0 w wVar, @androidx.annotation.h0 c0 c0Var) {
            RecyclerView recyclerView = this.f577b;
            if (recyclerView == null || recyclerView.o == null || !o()) {
                return 1;
            }
            return this.f577b.o.e();
        }

        public void v1(int r1) {
        }

        public int w(@androidx.annotation.h0 c0 c0Var) {
            return 0;
        }

        public int w0(@androidx.annotation.h0 w wVar, @androidx.annotation.h0 c0 c0Var) {
            return 0;
        }

        void w1(b0 b0Var) {
            if (this.g == b0Var) {
                this.g = null;
            }
        }

        public int x(@androidx.annotation.h0 c0 c0Var) {
            return 0;
        }

        public int x0(@androidx.annotation.h0 View view) {
            return ((p) view.getLayoutParams()).f585b.top;
        }

        boolean x1(int r3, @i0 Bundle bundle) {
            RecyclerView recyclerView = this.f577b;
            return y1(recyclerView.e, recyclerView.k0, r3, bundle);
        }

        public int y(@androidx.annotation.h0 c0 c0Var) {
            return 0;
        }

        public void y0(@androidx.annotation.h0 View view, boolean z, @androidx.annotation.h0 Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((p) view.getLayoutParams()).f585b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f577b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f577b.n;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean y1(@androidx.annotation.h0 w wVar, @androidx.annotation.h0 c0 c0Var, int r10, @i0 Bundle bundle) {
            int r8;
            int r102;
            int r3;
            int r2;
            RecyclerView recyclerView = this.f577b;
            if (recyclerView == null) {
                return false;
            }
            if (r10 == 4096) {
                r8 = recyclerView.canScrollVertically(1) ? (e0() - r0()) - m0() : 0;
                if (this.f577b.canScrollHorizontally(1)) {
                    r102 = (z0() - o0()) - p0();
                    r3 = r8;
                    r2 = r102;
                }
                r3 = r8;
                r2 = 0;
            } else if (r10 != 8192) {
                r2 = 0;
                r3 = 0;
            } else {
                r8 = recyclerView.canScrollVertically(-1) ? -((e0() - r0()) - m0()) : 0;
                if (this.f577b.canScrollHorizontally(-1)) {
                    r102 = -((z0() - o0()) - p0());
                    r3 = r8;
                    r2 = r102;
                }
                r3 = r8;
                r2 = 0;
            }
            if (r3 == 0 && r2 == 0) {
                return false;
            }
            this.f577b.J1(r2, r3, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void z(@androidx.annotation.h0 w wVar) {
            for (int r0 = Q() - 1; r0 >= 0; r0--) {
                P1(wVar, r0, P(r0));
            }
        }

        @k0
        public int z0() {
            return this.q;
        }

        boolean z1(@androidx.annotation.h0 View view, int r9, @i0 Bundle bundle) {
            RecyclerView recyclerView = this.f577b;
            return A1(recyclerView.e, recyclerView.k0, view, r9, bundle);
        }
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        f0 f584a;

        /* renamed from: b, reason: collision with root package name */
        final Rect f585b;

        /* renamed from: c, reason: collision with root package name */
        boolean f586c;
        boolean d;

        public p(int r1, int r2) {
            super(r1, r2);
            this.f585b = new Rect();
            this.f586c = true;
            this.d = false;
        }

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f585b = new Rect();
            this.f586c = true;
            this.d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f585b = new Rect();
            this.f586c = true;
            this.d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f585b = new Rect();
            this.f586c = true;
            this.d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f585b = new Rect();
            this.f586c = true;
            this.d = false;
        }

        public int a() {
            return this.f584a.j();
        }

        public int b() {
            return this.f584a.m();
        }

        @Deprecated
        public int c() {
            return this.f584a.o();
        }

        public boolean d() {
            return this.f584a.z();
        }

        public boolean e() {
            return this.f584a.w();
        }

        public boolean f() {
            return this.f584a.u();
        }

        public boolean g() {
            return this.f584a.A();
        }
    }

    public interface q {
        void b(@androidx.annotation.h0 View view);

        void d(@androidx.annotation.h0 View view);
    }

    public static abstract class r {
        public abstract boolean a(int r1, int r2);
    }

    public interface s {
        boolean a(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 MotionEvent motionEvent);

        void c(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 MotionEvent motionEvent);

        void e(boolean z);
    }

    public static abstract class t {
        public void a(@androidx.annotation.h0 RecyclerView recyclerView, int r2) {
        }

        public void b(@androidx.annotation.h0 RecyclerView recyclerView, int r2, int r3) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface u {
    }

    public static class v {

        /* renamed from: c, reason: collision with root package name */
        private static final int f587c = 5;

        /* renamed from: a, reason: collision with root package name */
        SparseArray<a> f588a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        private int f589b = 0;

        static class a {

            /* renamed from: a, reason: collision with root package name */
            final ArrayList<f0> f590a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            int f591b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f592c = 0;
            long d = 0;

            a() {
            }
        }

        private a h(int r3) {
            a aVar = this.f588a.get(r3);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f588a.put(r3, aVar2);
            return aVar2;
        }

        void a() {
            this.f589b++;
        }

        public void b() {
            for (int r0 = 0; r0 < this.f588a.size(); r0++) {
                this.f588a.valueAt(r0).f590a.clear();
            }
        }

        void c() {
            this.f589b--;
        }

        void d(int r3, long j) {
            a aVarH = h(r3);
            aVarH.d = k(aVarH.d, j);
        }

        void e(int r3, long j) {
            a aVarH = h(r3);
            aVarH.f592c = k(aVarH.f592c, j);
        }

        @i0
        public f0 f(int r3) {
            a aVar = this.f588a.get(r3);
            if (aVar == null || aVar.f590a.isEmpty()) {
                return null;
            }
            ArrayList<f0> arrayList = aVar.f590a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).s()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public int g(int r1) {
            return h(r1).f590a.size();
        }

        void i(g gVar, g gVar2, boolean z) {
            if (gVar != null) {
                c();
            }
            if (!z && this.f589b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void j(f0 f0Var) {
            int r0 = f0Var.l();
            ArrayList<f0> arrayList = h(r0).f590a;
            if (this.f588a.get(r0).f591b <= arrayList.size()) {
                return;
            }
            f0Var.E();
            arrayList.add(f0Var);
        }

        long k(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        public void l(int r2, int r3) {
            a aVarH = h(r2);
            aVarH.f591b = r3;
            ArrayList<f0> arrayList = aVarH.f590a;
            while (arrayList.size() > r3) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        int m() {
            int size = 0;
            for (int r0 = 0; r0 < this.f588a.size(); r0++) {
                ArrayList<f0> arrayList = this.f588a.valueAt(r0).f590a;
                if (arrayList != null) {
                    size += arrayList.size();
                }
            }
            return size;
        }

        boolean n(int r5, long j, long j2) {
            long j3 = h(r5).d;
            return j3 == 0 || j + j3 < j2;
        }

        boolean o(int r5, long j, long j2) {
            long j3 = h(r5).f592c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    public final class w {
        static final int j = 2;

        /* renamed from: a, reason: collision with root package name */
        final ArrayList<f0> f593a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        ArrayList<f0> f594b = null;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<f0> f595c = new ArrayList<>();
        private final List<f0> d = Collections.unmodifiableList(this.f593a);
        private int e = 2;
        int f = 2;
        v g;
        private d0 h;

        public w() {
        }

        private boolean I(@androidx.annotation.h0 f0 f0Var, int r11, int r12, long j2) {
            f0Var.r = RecyclerView.this;
            int r2 = f0Var.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j2 != RecyclerView.j1 && !this.g.n(r2, nanoTime, j2)) {
                return false;
            }
            RecyclerView.this.o.c(f0Var, r11);
            this.g.d(f0Var.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(f0Var);
            if (!RecyclerView.this.k0.j()) {
                return true;
            }
            f0Var.g = r12;
            return true;
        }

        private void b(f0 f0Var) {
            if (RecyclerView.this.K0()) {
                View view = f0Var.f561a;
                if (b.i.p.f0.S(view) == 0) {
                    b.i.p.f0.K1(view, 1);
                }
                androidx.recyclerview.widget.y yVar = RecyclerView.this.r0;
                if (yVar == null) {
                    return;
                }
                b.i.p.a aVarN = yVar.n();
                if (aVarN instanceof y.a) {
                    ((y.a) aVarN).o(view);
                }
                b.i.p.f0.u1(view, aVarN);
            }
        }

        private void r(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    r((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void s(f0 f0Var) {
            View view = f0Var.f561a;
            if (view instanceof ViewGroup) {
                r((ViewGroup) view, false);
            }
        }

        void A() {
            for (int size = this.f595c.size() - 1; size >= 0; size--) {
                B(size);
            }
            this.f595c.clear();
            if (RecyclerView.I0) {
                RecyclerView.this.j0.b();
            }
        }

        void B(int r3) {
            a(this.f595c.get(r3), true);
            this.f595c.remove(r3);
        }

        public void C(@androidx.annotation.h0 View view) {
            f0 f0VarT0 = RecyclerView.t0(view);
            if (f0VarT0.y()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (f0VarT0.x()) {
                f0VarT0.M();
            } else if (f0VarT0.N()) {
                f0VarT0.e();
            }
            D(f0VarT0);
            if (RecyclerView.this.P == null || f0VarT0.v()) {
                return;
            }
            RecyclerView.this.P.k(f0VarT0);
        }

        void D(f0 f0Var) {
            boolean z;
            boolean z2 = true;
            if (f0Var.x() || f0Var.f561a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(f0Var.x());
                sb.append(" isAttached:");
                sb.append(f0Var.f561a.getParent() != null);
                sb.append(RecyclerView.this.X());
                throw new IllegalArgumentException(sb.toString());
            }
            if (f0Var.y()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f0Var + RecyclerView.this.X());
            }
            if (f0Var.K()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.X());
            }
            boolean zH = f0Var.h();
            g gVar = RecyclerView.this.o;
            if ((gVar != null && zH && gVar.y(f0Var)) || f0Var.v()) {
                if (this.f <= 0 || f0Var.q(526)) {
                    z = false;
                } else {
                    int size = this.f595c.size();
                    if (size >= this.f && size > 0) {
                        B(0);
                        size--;
                    }
                    if (RecyclerView.I0 && size > 0 && !RecyclerView.this.j0.d(f0Var.f563c)) {
                        int r3 = size - 1;
                        while (r3 >= 0) {
                            if (!RecyclerView.this.j0.d(this.f595c.get(r3).f563c)) {
                                break;
                            } else {
                                r3--;
                            }
                        }
                        size = r3 + 1;
                    }
                    this.f595c.add(size, f0Var);
                    z = true;
                }
                if (z) {
                    z = z;
                    z2 = false;
                } else {
                    a(f0Var, true);
                    z = z;
                }
            } else {
                z2 = false;
            }
            RecyclerView.this.i.q(f0Var);
            if (z || z2 || !zH) {
                return;
            }
            f0Var.r = null;
        }

        void E(View view) {
            ArrayList<f0> arrayList;
            f0 f0VarT0 = RecyclerView.t0(view);
            if (!f0VarT0.q(12) && f0VarT0.z() && !RecyclerView.this.x(f0VarT0)) {
                if (this.f594b == null) {
                    this.f594b = new ArrayList<>();
                }
                f0VarT0.I(this, true);
                arrayList = this.f594b;
            } else {
                if (f0VarT0.u() && !f0VarT0.w() && !RecyclerView.this.o.i()) {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.X());
                }
                f0VarT0.I(this, false);
                arrayList = this.f593a;
            }
            arrayList.add(f0VarT0);
        }

        void F(v vVar) {
            v vVar2 = this.g;
            if (vVar2 != null) {
                vVar2.c();
            }
            this.g = vVar;
            if (vVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.g.a();
        }

        void G(d0 d0Var) {
            this.h = d0Var;
        }

        public void H(int r1) {
            this.e = r1;
            L();
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x020c  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0221 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0181 A[PHI: r1 r4
  0x0181: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$f0) = (r1v11 androidx.recyclerview.widget.RecyclerView$f0), (r1v31 androidx.recyclerview.widget.RecyclerView$f0) binds: [B:28:0x005d, B:59:0x0102] A[DONT_GENERATE, DONT_INLINE]
  0x0181: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:59:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01fe  */
        @androidx.annotation.i0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        androidx.recyclerview.widget.RecyclerView.f0 J(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 608
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.J(int, boolean, long):androidx.recyclerview.widget.RecyclerView$f0");
        }

        void K(f0 f0Var) {
            (f0Var.o ? this.f594b : this.f593a).remove(f0Var);
            f0Var.n = null;
            f0Var.o = false;
            f0Var.e();
        }

        void L() {
            o oVar = RecyclerView.this.p;
            this.f = this.e + (oVar != null ? oVar.m : 0);
            for (int size = this.f595c.size() - 1; size >= 0 && this.f595c.size() > this.f; size--) {
                B(size);
            }
        }

        boolean M(f0 f0Var) {
            if (f0Var.w()) {
                return RecyclerView.this.k0.j();
            }
            int r0 = f0Var.f563c;
            if (r0 >= 0 && r0 < RecyclerView.this.o.e()) {
                if (RecyclerView.this.k0.j() || RecyclerView.this.o.g(f0Var.f563c) == f0Var.l()) {
                    return !RecyclerView.this.o.i() || f0Var.k() == RecyclerView.this.o.f(f0Var.f563c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f0Var + RecyclerView.this.X());
        }

        void N(int r4, int r5) {
            int r2;
            int r52 = r5 + r4;
            for (int size = this.f595c.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f595c.get(size);
                if (f0Var != null && (r2 = f0Var.f563c) >= r4 && r2 < r52) {
                    f0Var.b(2);
                    B(size);
                }
            }
        }

        void a(@androidx.annotation.h0 f0 f0Var, boolean z) {
            RecyclerView.z(f0Var);
            View view = f0Var.f561a;
            androidx.recyclerview.widget.y yVar = RecyclerView.this.r0;
            if (yVar != null) {
                b.i.p.a aVarN = yVar.n();
                b.i.p.f0.u1(view, aVarN instanceof y.a ? ((y.a) aVarN).n(view) : null);
            }
            if (z) {
                h(f0Var);
            }
            f0Var.r = null;
            j().j(f0Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void c(@androidx.annotation.h0 android.view.View r7, int r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.RecyclerView$f0 r7 = androidx.recyclerview.widget.RecyclerView.t0(r7)
                if (r7 == 0) goto L96
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.g
                int r2 = r0.n(r8)
                if (r2 < 0) goto L5e
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r0 = r0.o
                int r0 = r0.e()
                if (r2 >= r0) goto L5e
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0 = r6
                r1 = r7
                r3 = r8
                r0.I(r1, r2, r3, r4)
                android.view.View r8 = r7.f561a
                android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
                if (r8 != 0) goto L3b
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r8 = r8.generateDefaultLayoutParams()
            L33:
                androidx.recyclerview.widget.RecyclerView$p r8 = (androidx.recyclerview.widget.RecyclerView.p) r8
                android.view.View r0 = r7.f561a
                r0.setLayoutParams(r8)
                goto L4c
            L3b:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                boolean r0 = r0.checkLayoutParams(r8)
                if (r0 != 0) goto L4a
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r8 = r0.generateLayoutParams(r8)
                goto L33
            L4a:
                androidx.recyclerview.widget.RecyclerView$p r8 = (androidx.recyclerview.widget.RecyclerView.p) r8
            L4c:
                r0 = 1
                r8.f586c = r0
                r8.f584a = r7
                android.view.View r7 = r7.f561a
                android.view.ViewParent r7 = r7.getParent()
                if (r7 != 0) goto L5a
                goto L5b
            L5a:
                r0 = 0
            L5b:
                r8.d = r0
                return
            L5e:
                java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Inconsistency detected. Invalid item position "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = "(offset:"
                r0.append(r8)
                r0.append(r2)
                java.lang.String r8 = ").state:"
                r0.append(r8)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$c0 r8 = r8.k0
                int r8 = r8.d()
                r0.append(r8)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r8 = r8.X()
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                r7.<init>(r8)
                throw r7
            L96:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter"
                r8.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = r0.X()
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.c(android.view.View, int):void");
        }

        public void d() {
            this.f593a.clear();
            A();
        }

        void e() {
            int size = this.f595c.size();
            for (int r2 = 0; r2 < size; r2++) {
                this.f595c.get(r2).c();
            }
            int size2 = this.f593a.size();
            for (int r22 = 0; r22 < size2; r22++) {
                this.f593a.get(r22).c();
            }
            ArrayList<f0> arrayList = this.f594b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int r1 = 0; r1 < size3; r1++) {
                    this.f594b.get(r1).c();
                }
            }
        }

        void f() {
            this.f593a.clear();
            ArrayList<f0> arrayList = this.f594b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int g(int r4) {
            if (r4 >= 0 && r4 < RecyclerView.this.k0.d()) {
                return !RecyclerView.this.k0.j() ? r4 : RecyclerView.this.g.n(r4);
            }
            throw new IndexOutOfBoundsException("invalid position " + r4 + ". State item count is " + RecyclerView.this.k0.d() + RecyclerView.this.X());
        }

        void h(@androidx.annotation.h0 f0 f0Var) {
            x xVar = RecyclerView.this.q;
            if (xVar != null) {
                xVar.a(f0Var);
            }
            g gVar = RecyclerView.this.o;
            if (gVar != null) {
                gVar.B(f0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.k0 != null) {
                recyclerView.i.q(f0Var);
            }
        }

        f0 i(int r10) {
            int size;
            int r102;
            ArrayList<f0> arrayList = this.f594b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int r3 = 0; r3 < size; r3++) {
                    f0 f0Var = this.f594b.get(r3);
                    if (!f0Var.N() && f0Var.m() == r10) {
                        f0Var.b(32);
                        return f0Var;
                    }
                }
                if (RecyclerView.this.o.i() && (r102 = RecyclerView.this.g.n(r10)) > 0 && r102 < RecyclerView.this.o.e()) {
                    long jF = RecyclerView.this.o.f(r102);
                    for (int r2 = 0; r2 < size; r2++) {
                        f0 f0Var2 = this.f594b.get(r2);
                        if (!f0Var2.N() && f0Var2.k() == jF) {
                            f0Var2.b(32);
                            return f0Var2;
                        }
                    }
                }
            }
            return null;
        }

        v j() {
            if (this.g == null) {
                this.g = new v();
            }
            return this.g;
        }

        int k() {
            return this.f593a.size();
        }

        @androidx.annotation.h0
        public List<f0> l() {
            return this.d;
        }

        f0 m(long j2, int r9, boolean z) {
            for (int size = this.f593a.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f593a.get(size);
                if (f0Var.k() == j2 && !f0Var.N()) {
                    if (r9 == f0Var.l()) {
                        f0Var.b(32);
                        if (f0Var.w() && !RecyclerView.this.k0.j()) {
                            f0Var.G(2, 14);
                        }
                        return f0Var;
                    }
                    if (!z) {
                        this.f593a.remove(size);
                        RecyclerView.this.removeDetachedView(f0Var.f561a, false);
                        z(f0Var.f561a);
                    }
                }
            }
            int size2 = this.f595c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                f0 f0Var2 = this.f595c.get(size2);
                if (f0Var2.k() == j2 && !f0Var2.s()) {
                    if (r9 == f0Var2.l()) {
                        if (!z) {
                            this.f595c.remove(size2);
                        }
                        return f0Var2;
                    }
                    if (!z) {
                        B(size2);
                        return null;
                    }
                }
            }
        }

        f0 n(int r6, boolean z) {
            View viewE;
            int size = this.f593a.size();
            for (int r2 = 0; r2 < size; r2++) {
                f0 f0Var = this.f593a.get(r2);
                if (!f0Var.N() && f0Var.m() == r6 && !f0Var.u() && (RecyclerView.this.k0.h || !f0Var.w())) {
                    f0Var.b(32);
                    return f0Var;
                }
            }
            if (z || (viewE = RecyclerView.this.h.e(r6)) == null) {
                int size2 = this.f595c.size();
                for (int r1 = 0; r1 < size2; r1++) {
                    f0 f0Var2 = this.f595c.get(r1);
                    if (!f0Var2.u() && f0Var2.m() == r6 && !f0Var2.s()) {
                        if (!z) {
                            this.f595c.remove(r1);
                        }
                        return f0Var2;
                    }
                }
                return null;
            }
            f0 f0VarT0 = RecyclerView.t0(viewE);
            RecyclerView.this.h.s(viewE);
            int r7 = RecyclerView.this.h.m(viewE);
            if (r7 != -1) {
                RecyclerView.this.h.d(r7);
                E(viewE);
                f0VarT0.b(8224);
                return f0VarT0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + f0VarT0 + RecyclerView.this.X());
        }

        View o(int r2) {
            return this.f593a.get(r2).f561a;
        }

        @androidx.annotation.h0
        public View p(int r2) {
            return q(r2, false);
        }

        View q(int r3, boolean z) {
            return J(r3, z, RecyclerView.j1).f561a;
        }

        void t() {
            int size = this.f595c.size();
            for (int r1 = 0; r1 < size; r1++) {
                p pVar = (p) this.f595c.get(r1).f561a.getLayoutParams();
                if (pVar != null) {
                    pVar.f586c = true;
                }
            }
        }

        void u() {
            int size = this.f595c.size();
            for (int r1 = 0; r1 < size; r1++) {
                f0 f0Var = this.f595c.get(r1);
                if (f0Var != null) {
                    f0Var.b(6);
                    f0Var.a(null);
                }
            }
            g gVar = RecyclerView.this.o;
            if (gVar == null || !gVar.i()) {
                A();
            }
        }

        void v(int r5, int r6) {
            int size = this.f595c.size();
            for (int r1 = 0; r1 < size; r1++) {
                f0 f0Var = this.f595c.get(r1);
                if (f0Var != null && f0Var.f563c >= r5) {
                    f0Var.B(r6, true);
                }
            }
        }

        void w(int r9, int r10) {
            int r0;
            int r2;
            int r1;
            int r7;
            if (r9 < r10) {
                r0 = -1;
                r1 = r9;
                r2 = r10;
            } else {
                r0 = 1;
                r2 = r9;
                r1 = r10;
            }
            int size = this.f595c.size();
            for (int r5 = 0; r5 < size; r5++) {
                f0 f0Var = this.f595c.get(r5);
                if (f0Var != null && (r7 = f0Var.f563c) >= r1 && r7 <= r2) {
                    if (r7 == r9) {
                        f0Var.B(r10 - r9, false);
                    } else {
                        f0Var.B(r0, false);
                    }
                }
            }
        }

        void x(int r5, int r6, boolean z) {
            int r0 = r5 + r6;
            for (int size = this.f595c.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f595c.get(size);
                if (f0Var != null) {
                    int r3 = f0Var.f563c;
                    if (r3 >= r0) {
                        f0Var.B(-r6, z);
                    } else if (r3 >= r5) {
                        f0Var.b(8);
                        B(size);
                    }
                }
            }
        }

        void y(g gVar, g gVar2, boolean z) {
            d();
            j().i(gVar, gVar2, z);
        }

        void z(View view) {
            f0 f0VarT0 = RecyclerView.t0(view);
            f0VarT0.n = null;
            f0VarT0.o = false;
            f0VarT0.e();
            D(f0VarT0);
        }
    }

    public interface x {
        void a(@androidx.annotation.h0 f0 f0Var);
    }

    private class y extends i {
        y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            RecyclerView.this.w(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.k0.g = true;
            recyclerView.i1(true);
            if (RecyclerView.this.g.q()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void c(int r3, int r4, Object obj) {
            RecyclerView.this.w(null);
            if (RecyclerView.this.g.s(r3, r4, obj)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void d(int r3, int r4) {
            RecyclerView.this.w(null);
            if (RecyclerView.this.g.t(r3, r4)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void e(int r3, int r4, int r5) {
            RecyclerView.this.w(null);
            if (RecyclerView.this.g.u(r3, r4, r5)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void f(int r3, int r4) {
            RecyclerView.this.w(null);
            if (RecyclerView.this.g.v(r3, r4)) {
                g();
            }
        }

        void g() {
            if (RecyclerView.H0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.v && recyclerView.u) {
                    b.i.p.f0.i1(recyclerView, recyclerView.k);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.D = true;
            recyclerView2.requestLayout();
        }
    }

    @p0({p0.a.LIBRARY})
    public static class z extends b.k.b.a {
        public static final Parcelable.Creator<z> CREATOR = new a();
        Parcelable f;

        static class a implements Parcelable.ClassLoaderCreator<z> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int r1) {
                return new z[r1];
            }
        }

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }

        void b(z zVar) {
            this.f = zVar.f;
        }

        @Override // b.k.b.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int r3) {
            super.writeToParcel(parcel, r3);
            parcel.writeParcelable(this.f, 0);
        }
    }

    static {
        int r1 = Build.VERSION.SDK_INT;
        F0 = r1 == 18 || r1 == 19 || r1 == 20;
        G0 = Build.VERSION.SDK_INT >= 23;
        H0 = Build.VERSION.SDK_INT >= 16;
        I0 = Build.VERSION.SDK_INT >= 21;
        J0 = Build.VERSION.SDK_INT <= 15;
        K0 = Build.VERSION.SDK_INT <= 15;
        Class<?> cls = Integer.TYPE;
        e1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        k1 = new c();
    }

    public RecyclerView(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public RecyclerView(@androidx.annotation.h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0098a.recyclerViewStyle);
    }

    public RecyclerView(@androidx.annotation.h0 Context context, @i0 AttributeSet attributeSet, int r15) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, r15);
        this.d = new y();
        this.e = new w();
        this.i = new h0();
        this.k = new a();
        this.l = new Rect();
        this.m = new Rect();
        this.n = new RectF();
        this.r = new ArrayList<>();
        this.s = new ArrayList<>();
        this.y = 0;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        this.K = new k();
        this.P = new androidx.recyclerview.widget.h();
        this.Q = 0;
        this.R = -1;
        this.e0 = Float.MIN_VALUE;
        this.f0 = Float.MIN_VALUE;
        boolean z2 = true;
        this.g0 = true;
        this.h0 = new e0();
        this.j0 = I0 ? new l.b() : null;
        this.k0 = new c0();
        this.n0 = false;
        this.o0 = false;
        this.p0 = new m();
        this.q0 = false;
        this.t0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = new ArrayList();
        this.z0 = new b();
        this.A0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.a0 = viewConfiguration.getScaledTouchSlop();
        this.e0 = b.i.p.g0.b(viewConfiguration, context);
        this.f0 = b.i.p.g0.e(viewConfiguration, context);
        this.c0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.P.A(this.p0);
        E0();
        G0();
        F0();
        if (b.i.p.f0.S(this) == 0) {
            b.i.p.f0.K1(this, 1);
        }
        this.E = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.y(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.RecyclerView, r15, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, a.j.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, r15, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(a.j.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(a.j.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.j = typedArrayObtainStyledAttributes.getBoolean(a.j.RecyclerView_android_clipToPadding, true);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(a.j.RecyclerView_fastScrollEnabled, false);
        this.w = z3;
        if (z3) {
            H0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(a.j.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(a.j.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(a.j.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(a.j.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArrayObtainStyledAttributes.recycle();
        F(context, string, attributeSet, r15, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, E0, r15, 0);
            if (Build.VERSION.SDK_INT >= 29) {
                saveAttributeDataForStyleable(context, E0, attributeSet, typedArrayObtainStyledAttributes2, r15, 0);
            }
            z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
            typedArrayObtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    private void A0(long j2, f0 f0Var, f0 f0Var2) {
        int r0 = this.h.g();
        for (int r1 = 0; r1 < r0; r1++) {
            f0 f0VarT0 = t0(this.h.f(r1));
            if (f0VarT0 != f0Var && n0(f0VarT0) == j2) {
                g gVar = this.o;
                if (gVar == null || !gVar.i()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + f0VarT0 + " \n View Holder 2:" + f0Var + X());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + f0VarT0 + " \n View Holder 2:" + f0Var + X());
            }
        }
        Log.e(B0, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f0Var2 + " cannot be found but it is necessary for " + f0Var + X());
    }

    private boolean D0() {
        int r0 = this.h.g();
        for (int r2 = 0; r2 < r0; r2++) {
            f0 f0VarT0 = t0(this.h.f(r2));
            if (f0VarT0 != null && !f0VarT0.K() && f0VarT0.z()) {
                return true;
            }
        }
        return false;
    }

    private void D1(@i0 g gVar, boolean z2, boolean z3) {
        g gVar2 = this.o;
        if (gVar2 != null) {
            gVar2.E(this.d);
            this.o.x(this);
        }
        if (!z2 || z3) {
            n1();
        }
        this.g.z();
        g gVar3 = this.o;
        this.o = gVar;
        if (gVar != null) {
            gVar.C(this.d);
            gVar.t(this);
        }
        o oVar = this.p;
        if (oVar != null) {
            oVar.V0(gVar3, this.o);
        }
        this.e.y(gVar3, this.o, z2);
        this.k0.g = true;
    }

    private void F(Context context, String str, AttributeSet attributeSet, int r11, int r12) throws NoSuchMethodException, SecurityException {
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strX0 = x0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strX0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                Object[] objArr = null;
                try {
                    constructor = clsAsSubclass.getConstructor(e1);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(r11), Integer.valueOf(r12)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strX0, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strX0, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strX0, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strX0, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strX0, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strX0, e8);
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    private void F0() {
        if (b.i.p.f0.T(this) == 0) {
            b.i.p.f0.L1(this, 8);
        }
    }

    private void G0() {
        this.h = new androidx.recyclerview.widget.g(new e());
    }

    private boolean H(int r5, int r6) {
        d0(this.t0);
        int[] r0 = this.t0;
        return (r0[0] == r5 && r0[1] == r6) ? false : true;
    }

    private void K() {
        int r0 = this.C;
        this.C = 0;
        if (r0 == 0 || !K0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        b.i.p.p0.b.i(accessibilityEventObtain, r0);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void M() {
        this.k0.a(1);
        Y(this.k0);
        this.k0.j = false;
        L1();
        this.i.f();
        Z0();
        h1();
        y1();
        c0 c0Var = this.k0;
        c0Var.i = c0Var.k && this.o0;
        this.o0 = false;
        this.n0 = false;
        c0 c0Var2 = this.k0;
        c0Var2.h = c0Var2.l;
        c0Var2.f = this.o.e();
        d0(this.t0);
        if (this.k0.k) {
            int r0 = this.h.g();
            for (int r1 = 0; r1 < r0; r1++) {
                f0 f0VarT0 = t0(this.h.f(r1));
                if (!f0VarT0.K() && (!f0VarT0.u() || this.o.i())) {
                    this.i.e(f0VarT0, this.P.w(this.k0, f0VarT0, l.e(f0VarT0), f0VarT0.p()));
                    if (this.k0.i && f0VarT0.z() && !f0VarT0.w() && !f0VarT0.K() && !f0VarT0.u()) {
                        this.i.c(n0(f0VarT0), f0VarT0);
                    }
                }
            }
        }
        if (this.k0.l) {
            z1();
            c0 c0Var3 = this.k0;
            boolean z2 = c0Var3.g;
            c0Var3.g = false;
            this.p.o1(this.e, c0Var3);
            this.k0.g = z2;
            for (int r02 = 0; r02 < this.h.g(); r02++) {
                f0 f0VarT02 = t0(this.h.f(r02));
                if (!f0VarT02.K() && !this.i.i(f0VarT02)) {
                    int r3 = l.e(f0VarT02);
                    boolean zQ = f0VarT02.q(8192);
                    if (!zQ) {
                        r3 |= 4096;
                    }
                    l.d dVarW = this.P.w(this.k0, f0VarT02, r3, f0VarT02.p());
                    if (zQ) {
                        k1(f0VarT02, dVarW);
                    } else {
                        this.i.a(f0VarT02, dVarW);
                    }
                }
            }
        }
        A();
        a1();
        M1(false);
        this.k0.e = 2;
    }

    private void N() {
        L1();
        Z0();
        this.k0.a(6);
        this.g.k();
        this.k0.f = this.o.e();
        c0 c0Var = this.k0;
        c0Var.d = 0;
        c0Var.h = false;
        this.p.o1(this.e, c0Var);
        c0 c0Var2 = this.k0;
        c0Var2.g = false;
        this.f = null;
        c0Var2.k = c0Var2.k && this.P != null;
        this.k0.e = 4;
        a1();
        M1(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void O() {
        /*
            r11 = this;
            androidx.recyclerview.widget.RecyclerView$c0 r0 = r11.k0
            r1 = 4
            r0.a(r1)
            r11.L1()
            r11.Z0()
            androidx.recyclerview.widget.RecyclerView$c0 r0 = r11.k0
            r1 = 1
            r0.e = r1
            boolean r0 = r0.k
            if (r0 == 0) goto L88
            androidx.recyclerview.widget.g r0 = r11.h
            int r0 = r0.g()
            int r0 = r0 - r1
        L1c:
            if (r0 < 0) goto L81
            androidx.recyclerview.widget.g r2 = r11.h
            android.view.View r2 = r2.f(r0)
            androidx.recyclerview.widget.RecyclerView$f0 r5 = t0(r2)
            boolean r2 = r5.K()
            if (r2 == 0) goto L2f
            goto L7e
        L2f:
            long r2 = r11.n0(r5)
            androidx.recyclerview.widget.RecyclerView$l r4 = r11.P
            androidx.recyclerview.widget.RecyclerView$c0 r6 = r11.k0
            androidx.recyclerview.widget.RecyclerView$l$d r4 = r4.v(r6, r5)
            androidx.recyclerview.widget.h0 r6 = r11.i
            androidx.recyclerview.widget.RecyclerView$f0 r6 = r6.g(r2)
            if (r6 == 0) goto L79
            boolean r7 = r6.K()
            if (r7 != 0) goto L79
            androidx.recyclerview.widget.h0 r7 = r11.i
            boolean r8 = r7.h(r6)
            androidx.recyclerview.widget.h0 r7 = r11.i
            boolean r9 = r7.h(r5)
            if (r8 == 0) goto L5a
            if (r6 != r5) goto L5a
            goto L79
        L5a:
            androidx.recyclerview.widget.h0 r7 = r11.i
            androidx.recyclerview.widget.RecyclerView$l$d r7 = r7.n(r6)
            androidx.recyclerview.widget.h0 r10 = r11.i
            r10.d(r5, r4)
            androidx.recyclerview.widget.h0 r4 = r11.i
            androidx.recyclerview.widget.RecyclerView$l$d r10 = r4.m(r5)
            if (r7 != 0) goto L71
            r11.A0(r2, r5, r6)
            goto L7e
        L71:
            r3 = r11
            r4 = r6
            r6 = r7
            r7 = r10
            r3.t(r4, r5, r6, r7, r8, r9)
            goto L7e
        L79:
            androidx.recyclerview.widget.h0 r2 = r11.i
            r2.d(r5, r4)
        L7e:
            int r0 = r0 + (-1)
            goto L1c
        L81:
            androidx.recyclerview.widget.h0 r0 = r11.i
            androidx.recyclerview.widget.h0$b r2 = r11.A0
            r0.o(r2)
        L88:
            androidx.recyclerview.widget.RecyclerView$o r0 = r11.p
            androidx.recyclerview.widget.RecyclerView$w r2 = r11.e
            r0.E1(r2)
            androidx.recyclerview.widget.RecyclerView$c0 r0 = r11.k0
            int r2 = r0.f
            r0.f557c = r2
            r2 = 0
            r11.G = r2
            r11.H = r2
            r0.k = r2
            r0.l = r2
            androidx.recyclerview.widget.RecyclerView$o r0 = r11.p
            r0.h = r2
            androidx.recyclerview.widget.RecyclerView$w r0 = r11.e
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$f0> r0 = r0.f594b
            if (r0 == 0) goto Lab
            r0.clear()
        Lab:
            androidx.recyclerview.widget.RecyclerView$o r0 = r11.p
            boolean r3 = r0.n
            if (r3 == 0) goto Lba
            r0.m = r2
            r0.n = r2
            androidx.recyclerview.widget.RecyclerView$w r0 = r11.e
            r0.L()
        Lba:
            androidx.recyclerview.widget.RecyclerView$o r0 = r11.p
            androidx.recyclerview.widget.RecyclerView$c0 r3 = r11.k0
            r0.p1(r3)
            r11.a1()
            r11.M1(r2)
            androidx.recyclerview.widget.h0 r0 = r11.i
            r0.f()
            int[] r0 = r11.t0
            r3 = r0[r2]
            r0 = r0[r1]
            boolean r0 = r11.H(r3, r0)
            if (r0 == 0) goto Ldb
            r11.Q(r2, r2)
        Ldb:
            r11.l1()
            r11.w1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.O():void");
    }

    private boolean O0(View view, View view2, int r9) {
        int r2;
        if (view2 == null || view2 == this || a0(view2) == null) {
            return false;
        }
        if (view == null || a0(view) == null) {
            return true;
        }
        this.l.set(0, 0, view.getWidth(), view.getHeight());
        this.m.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.l);
        offsetDescendantRectToMyCoords(view2, this.m);
        char c2 = 65535;
        int r7 = this.p.i0() == 1 ? -1 : 1;
        Rect rect = this.l;
        int r3 = rect.left;
        int r4 = this.m.left;
        if ((r3 < r4 || rect.right <= r4) && this.l.right < this.m.right) {
            r2 = 1;
        } else {
            Rect rect2 = this.l;
            int r32 = rect2.right;
            int r42 = this.m.right;
            r2 = ((r32 > r42 || rect2.left >= r42) && this.l.left > this.m.left) ? -1 : 0;
        }
        Rect rect3 = this.l;
        int r43 = rect3.top;
        int r5 = this.m.top;
        if ((r43 < r5 || rect3.bottom <= r5) && this.l.bottom < this.m.bottom) {
            c2 = 1;
        } else {
            Rect rect4 = this.l;
            int r44 = rect4.bottom;
            int r52 = this.m.bottom;
            if ((r44 <= r52 && rect4.top < r52) || this.l.top <= this.m.top) {
                c2 = 0;
            }
        }
        if (r9 == 1) {
            return c2 < 0 || (c2 == 0 && r2 * r7 <= 0);
        }
        if (r9 == 2) {
            return c2 > 0 || (c2 == 0 && r2 * r7 >= 0);
        }
        if (r9 == 17) {
            return r2 < 0;
        }
        if (r9 == 33) {
            return c2 < 0;
        }
        if (r9 == 66) {
            return r2 > 0;
        }
        if (r9 == 130) {
            return c2 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + r9 + X());
    }

    private void O1() {
        this.h0.g();
        o oVar = this.p;
        if (oVar != null) {
            oVar.i2();
        }
    }

    private boolean S(MotionEvent motionEvent) {
        s sVar = this.t;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return c0(motionEvent);
        }
        sVar.c(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.t = null;
        }
        return true;
    }

    private boolean c0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.s.size();
        for (int r3 = 0; r3 < size; r3++) {
            s sVar = this.s.get(r3);
            if (sVar.a(this, motionEvent) && action != 3) {
                this.t = sVar;
                return true;
            }
        }
        return false;
    }

    private void c1(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.R) {
            int r0 = actionIndex == 0 ? 1 : 0;
            this.R = motionEvent.getPointerId(r0);
            int x2 = (int) (motionEvent.getX(r0) + 0.5f);
            this.V = x2;
            this.T = x2;
            int y2 = (int) (motionEvent.getY(r0) + 0.5f);
            this.W = y2;
            this.U = y2;
        }
    }

    private void d0(int[] r9) {
        int r0 = this.h.g();
        if (r0 == 0) {
            r9[0] = -1;
            r9[1] = -1;
            return;
        }
        int r3 = ActivityChooserView.f.j;
        int r4 = Integer.MIN_VALUE;
        for (int r5 = 0; r5 < r0; r5++) {
            f0 f0VarT0 = t0(this.h.f(r5));
            if (!f0VarT0.K()) {
                int r6 = f0VarT0.m();
                if (r6 < r3) {
                    r3 = r6;
                }
                if (r6 > r4) {
                    r4 = r6;
                }
            }
        }
        r9[0] = r3;
        r9[1] = r4;
    }

    @i0
    static RecyclerView e0(@androidx.annotation.h0 View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int r2 = 0; r2 < childCount; r2++) {
            RecyclerView recyclerViewE0 = e0(viewGroup.getChildAt(r2));
            if (recyclerViewE0 != null) {
                return recyclerViewE0;
            }
        }
        return null;
    }

    @i0
    private View f0() {
        f0 f0VarG0;
        int r0 = this.k0.m;
        if (r0 == -1) {
            r0 = 0;
        }
        int r1 = this.k0.d();
        for (int r2 = r0; r2 < r1; r2++) {
            f0 f0VarG02 = g0(r2);
            if (f0VarG02 == null) {
                break;
            }
            if (f0VarG02.f561a.hasFocusable()) {
                return f0VarG02.f561a;
            }
        }
        int r02 = Math.min(r1, r0);
        do {
            r02--;
            if (r02 < 0 || (f0VarG0 = g0(r02)) == null) {
                return null;
            }
        } while (!f0VarG0.f561a.hasFocusable());
        return f0VarG0.f561a;
    }

    private boolean g1() {
        return this.P != null && this.p.j2();
    }

    private b.i.p.t getScrollingChildHelper() {
        if (this.u0 == null) {
            this.u0 = new b.i.p.t(this);
        }
        return this.u0;
    }

    private void h1() {
        if (this.G) {
            this.g.z();
            if (this.H) {
                this.p.j1(this);
            }
        }
        if (g1()) {
            this.g.x();
        } else {
            this.g.k();
        }
        boolean z2 = false;
        boolean z3 = this.n0 || this.o0;
        this.k0.k = this.x && this.P != null && (this.G || z3 || this.p.h) && (!this.G || this.o.i());
        c0 c0Var = this.k0;
        if (c0Var.k && z3 && !this.G && g1()) {
            z2 = true;
        }
        c0Var.l = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j1(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.U()
            android.widget.EdgeEffect r3 = r6.L
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L1c:
            androidx.core.widget.e.e(r3, r4, r9)
            r9 = 1
            goto L39
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L38
            r6.V()
            android.widget.EdgeEffect r3 = r6.N
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L1c
        L38:
            r9 = 0
        L39:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L53
            r6.W()
            android.widget.EdgeEffect r9 = r6.M
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.e.e(r9, r0, r7)
            goto L6f
        L53:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L6e
            r6.T()
            android.widget.EdgeEffect r9 = r6.O
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.e.e(r9, r3, r0)
            goto L6f
        L6e:
            r1 = r9
        L6f:
            if (r1 != 0) goto L79
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            b.i.p.f0.g1(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.j1(float, float, float, float):void");
    }

    private void l1() {
        View viewFindViewById;
        if (!this.g0 || this.o == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!K0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.h.n(focusedChild)) {
                    return;
                }
            } else if (this.h.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewF0 = null;
        f0 f0VarH0 = (this.k0.n == -1 || !this.o.i()) ? null : h0(this.k0.n);
        if (f0VarH0 != null && !this.h.n(f0VarH0.f561a) && f0VarH0.f561a.hasFocusable()) {
            viewF0 = f0VarH0.f561a;
        } else if (this.h.g() > 0) {
            viewF0 = f0();
        }
        if (viewF0 != null) {
            int r0 = this.k0.o;
            if (r0 != -1 && (viewFindViewById = viewF0.findViewById(r0)) != null && viewFindViewById.isFocusable()) {
                viewF0 = viewFindViewById;
            }
            viewF0.requestFocus();
        }
    }

    private void m(f0 f0Var) {
        View view = f0Var.f561a;
        boolean z2 = view.getParent() == this;
        this.e.K(s0(view));
        if (f0Var.y()) {
            this.h.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.g gVar = this.h;
        if (z2) {
            gVar.k(view);
        } else {
            gVar.b(view, true);
        }
    }

    private void m1() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.L.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.O;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.O.isFinished();
        }
        if (zIsFinished) {
            b.i.p.f0.g1(this);
        }
    }

    private void t(@androidx.annotation.h0 f0 f0Var, @androidx.annotation.h0 f0 f0Var2, @androidx.annotation.h0 l.d dVar, @androidx.annotation.h0 l.d dVar2, boolean z2, boolean z3) {
        f0Var.H(false);
        if (z2) {
            m(f0Var);
        }
        if (f0Var != f0Var2) {
            if (z3) {
                m(f0Var2);
            }
            f0Var.h = f0Var2;
            m(f0Var);
            this.e.K(f0Var);
            f0Var2.H(false);
            f0Var2.i = f0Var;
        }
        if (this.P.b(f0Var, f0Var2, dVar, dVar2)) {
            f1();
        }
    }

    static f0 t0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f584a;
    }

    static void v0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f585b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private void v1(@androidx.annotation.h0 View view, @i0 View view2) {
        View view3 = view2 != null ? view2 : view;
        this.l.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f586c) {
                Rect rect = pVar.f585b;
                Rect rect2 = this.l;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.l);
            offsetRectIntoDescendantCoords(view, this.l);
        }
        this.p.M1(this, view, this.l, !this.x, view2 == null);
    }

    private int w0(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    private void w1() {
        c0 c0Var = this.k0;
        c0Var.n = -1L;
        c0Var.m = -1;
        c0Var.o = -1;
    }

    private String x0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void x1() {
        VelocityTracker velocityTracker = this.S;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        g(0);
        m1();
    }

    private void y() {
        x1();
        setScrollState(0);
    }

    private void y1() {
        View focusedChild = (this.g0 && hasFocus() && this.o != null) ? getFocusedChild() : null;
        f0 f0VarB0 = focusedChild != null ? b0(focusedChild) : null;
        if (f0VarB0 == null) {
            w1();
            return;
        }
        this.k0.n = this.o.i() ? f0VarB0.k() : -1L;
        this.k0.m = this.G ? -1 : f0VarB0.w() ? f0VarB0.d : f0VarB0.j();
        this.k0.o = w0(f0VarB0.f561a);
    }

    static void z(@androidx.annotation.h0 f0 f0Var) {
        WeakReference<RecyclerView> weakReference = f0Var.f562b;
        if (weakReference != null) {
            Object parent = weakReference.get();
            while (true) {
                for (View view = (View) parent; view != null; view = null) {
                    if (view == f0Var.f561a) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof View) {
                        break;
                    }
                }
                f0Var.f562b = null;
                return;
            }
        }
    }

    void A() {
        int r0 = this.h.j();
        for (int r1 = 0; r1 < r0; r1++) {
            f0 f0VarT0 = t0(this.h.i(r1));
            if (!f0VarT0.K()) {
                f0VarT0.c();
            }
        }
        this.e.e();
    }

    boolean A1(int r19, int r20, MotionEvent motionEvent) {
        int r14;
        int r15;
        int r16;
        int r17;
        E();
        if (this.o != null) {
            int[] r0 = this.x0;
            r0[0] = 0;
            r0[1] = 0;
            B1(r19, r20, r0);
            int[] r02 = this.x0;
            int r1 = r02[0];
            int r03 = r02[1];
            r14 = r03;
            r15 = r1;
            r16 = r19 - r1;
            r17 = r20 - r03;
        } else {
            r14 = 0;
            r15 = 0;
            r16 = 0;
            r17 = 0;
        }
        if (!this.r.isEmpty()) {
            invalidate();
        }
        int[] r7 = this.x0;
        r7[0] = 0;
        r7[1] = 0;
        f(r15, r14, r16, r17, this.v0, 0, r7);
        int[] r04 = this.x0;
        int r12 = r16 - r04[0];
        int r2 = r17 - r04[1];
        boolean z2 = (r04[0] == 0 && r04[1] == 0) ? false : true;
        int r3 = this.V;
        int[] r4 = this.v0;
        this.V = r3 - r4[0];
        this.W -= r4[1];
        int[] r32 = this.w0;
        r32[0] = r32[0] + r4[0];
        r32[1] = r32[1] + r4[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !b.i.p.p.l(motionEvent, 8194)) {
                j1(motionEvent.getX(), r12, motionEvent.getY(), r2);
            }
            D(r19, r20);
        }
        if (r15 != 0 || r14 != 0) {
            Q(r15, r14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && r15 == 0 && r14 == 0) ? false : true;
    }

    public void B() {
        List<q> list = this.F;
        if (list != null) {
            list.clear();
        }
    }

    public boolean B0() {
        return this.v;
    }

    void B1(int r5, int r6, @i0 int[] r7) {
        L1();
        Z0();
        b.i.k.o.b(W0);
        Y(this.k0);
        int r52 = r5 != 0 ? this.p.Q1(r5, this.e, this.k0) : 0;
        int r62 = r6 != 0 ? this.p.S1(r6, this.e, this.k0) : 0;
        b.i.k.o.d();
        u1();
        a1();
        M1(false);
        if (r7 != null) {
            r7[0] = r52;
            r7[1] = r62;
        }
    }

    public void C() {
        List<t> list = this.m0;
        if (list != null) {
            list.clear();
        }
    }

    public boolean C0() {
        return !this.x || this.G || this.g.q();
    }

    public void C1(int r2) {
        if (this.A) {
            return;
        }
        N1();
        o oVar = this.p;
        if (oVar == null) {
            Log.e(B0, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.R1(r2);
            awakenScrollBars();
        }
    }

    void D(int r3, int r4) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect == null || edgeEffect.isFinished() || r3 <= 0) {
            zIsFinished = false;
        } else {
            this.L.onRelease();
            zIsFinished = this.L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.N;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && r3 < 0) {
            this.N.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && r4 > 0) {
            this.M.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.O;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && r4 < 0) {
            this.O.onRelease();
            zIsFinished |= this.O.isFinished();
        }
        if (zIsFinished) {
            b.i.p.f0.g1(this);
        }
    }

    void E() {
        if (!this.x || this.G) {
            b.i.k.o.b(Y0);
            L();
            b.i.k.o.d();
            return;
        }
        if (this.g.q()) {
            if (this.g.p(4) && !this.g.p(11)) {
                b.i.k.o.b(Z0);
                L1();
                Z0();
                this.g.x();
                if (!this.z) {
                    if (D0()) {
                        L();
                    } else {
                        this.g.j();
                    }
                }
                M1(true);
                a1();
            } else {
                if (!this.g.q()) {
                    return;
                }
                b.i.k.o.b(Y0);
                L();
            }
            b.i.k.o.d();
        }
    }

    void E0() {
        this.g = new androidx.recyclerview.widget.a(new f());
    }

    @x0
    boolean E1(f0 f0Var, int r3) {
        if (!M0()) {
            b.i.p.f0.K1(f0Var.f561a, r3);
            return true;
        }
        f0Var.q = r3;
        this.y0.add(f0Var);
        return false;
    }

    boolean F1(AccessibilityEvent accessibilityEvent) {
        if (!M0()) {
            return false;
        }
        int r3 = accessibilityEvent != null ? b.i.p.p0.b.d(accessibilityEvent) : 0;
        this.C |= r3 != 0 ? r3 : 0;
        return true;
    }

    void G(int r3, int r4) {
        setMeasuredDimension(o.q(r3, getPaddingLeft() + getPaddingRight(), b.i.p.f0.c0(this)), o.q(r4, getPaddingTop() + getPaddingBottom(), b.i.p.f0.b0(this)));
    }

    public void G1(@k0 int r2, @k0 int r3) {
        H1(r2, r3, null);
    }

    @x0
    void H0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(a.c.fastscroll_default_thickness), resources.getDimensionPixelSize(a.c.fastscroll_minimum_range), resources.getDimensionPixelOffset(a.c.fastscroll_margin));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + X());
        }
    }

    public void H1(@k0 int r2, @k0 int r3, @i0 Interpolator interpolator) {
        I1(r2, r3, interpolator, Integer.MIN_VALUE);
    }

    void I(View view) {
        f0 f0VarT0 = t0(view);
        X0(view);
        g gVar = this.o;
        if (gVar != null && f0VarT0 != null) {
            gVar.z(f0VarT0);
        }
        List<q> list = this.F;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.F.get(size).b(view);
            }
        }
    }

    void I0() {
        this.O = null;
        this.M = null;
        this.N = null;
        this.L = null;
    }

    public void I1(@k0 int r7, @k0 int r8, @i0 Interpolator interpolator, int r10) {
        J1(r7, r8, interpolator, r10, false);
    }

    void J(View view) {
        f0 f0VarT0 = t0(view);
        Y0(view);
        g gVar = this.o;
        if (gVar != null && f0VarT0 != null) {
            gVar.A(f0VarT0);
        }
        List<q> list = this.F;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.F.get(size).d(view);
            }
        }
    }

    public void J0() {
        if (this.r.size() == 0) {
            return;
        }
        o oVar = this.p;
        if (oVar != null) {
            oVar.i("Cannot invalidate item decorations during a scroll or layout");
        }
        Q0();
        requestLayout();
    }

    void J1(@k0 int r4, @k0 int r5, @i0 Interpolator interpolator, int r7, boolean z2) {
        o oVar = this.p;
        if (oVar == null) {
            Log.e(B0, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.A) {
            return;
        }
        if (!oVar.n()) {
            r4 = 0;
        }
        if (!this.p.o()) {
            r5 = 0;
        }
        if (r4 == 0 && r5 == 0) {
            return;
        }
        if (!(r7 == Integer.MIN_VALUE || r7 > 0)) {
            scrollBy(r4, r5);
            return;
        }
        if (z2) {
            int r1 = r4 != 0 ? 1 : 0;
            if (r5 != 0) {
                r1 |= 2;
            }
            e(r1, 1);
        }
        this.h0.f(r4, r5, r7, interpolator);
    }

    boolean K0() {
        AccessibilityManager accessibilityManager = this.E;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void K1(int r3) {
        if (this.A) {
            return;
        }
        o oVar = this.p;
        if (oVar == null) {
            Log.e(B0, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.f2(this, this.k0, r3);
        }
    }

    void L() {
        String str;
        if (this.o == null) {
            str = "No adapter attached; skipping layout";
        } else {
            if (this.p != null) {
                c0 c0Var = this.k0;
                c0Var.j = false;
                if (c0Var.e != 1) {
                    if (!this.g.r() && this.p.z0() == getWidth() && this.p.e0() == getHeight()) {
                        this.p.U1(this);
                    }
                    O();
                    return;
                }
                M();
                this.p.U1(this);
                N();
                O();
                return;
            }
            str = "No layout manager attached; skipping layout";
        }
        Log.e(B0, str);
    }

    public boolean L0() {
        l lVar = this.P;
        return lVar != null && lVar.q();
    }

    void L1() {
        int r0 = this.y + 1;
        this.y = r0;
        if (r0 != 1 || this.A) {
            return;
        }
        this.z = false;
    }

    public boolean M0() {
        return this.I > 0;
    }

    void M1(boolean z2) {
        if (this.y < 1) {
            this.y = 1;
        }
        if (!z2 && !this.A) {
            this.z = false;
        }
        if (this.y == 1) {
            if (z2 && this.z && !this.A && this.p != null && this.o != null) {
                L();
            }
            if (!this.A) {
                this.z = false;
            }
        }
        this.y--;
    }

    @Deprecated
    public boolean N0() {
        return isLayoutSuppressed();
    }

    public void N1() {
        setScrollState(0);
        O1();
    }

    void P(int r3) {
        o oVar = this.p;
        if (oVar != null) {
            oVar.v1(r3);
        }
        d1(r3);
        t tVar = this.l0;
        if (tVar != null) {
            tVar.a(this, r3);
        }
        List<t> list = this.m0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.m0.get(size).a(this, r3);
            }
        }
    }

    void P0(int r2) {
        if (this.p == null) {
            return;
        }
        setScrollState(2);
        this.p.R1(r2);
        awakenScrollBars();
    }

    public void P1(@i0 g gVar, boolean z2) {
        setLayoutFrozen(false);
        D1(gVar, true, z2);
        i1(true);
        requestLayout();
    }

    void Q(int r5, int r6) {
        this.J++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - r5, scrollY - r6);
        e1(r5, r6);
        t tVar = this.l0;
        if (tVar != null) {
            tVar.b(this, r5, r6);
        }
        List<t> list = this.m0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.m0.get(size).b(this, r5, r6);
            }
        }
        this.J--;
    }

    void Q0() {
        int r0 = this.h.j();
        for (int r1 = 0; r1 < r0; r1++) {
            ((p) this.h.i(r1).getLayoutParams()).f586c = true;
        }
        this.e.t();
    }

    void Q1(int r7, int r8, Object obj) {
        int r5;
        int r0 = this.h.j();
        int r1 = r7 + r8;
        for (int r2 = 0; r2 < r0; r2++) {
            View viewI = this.h.i(r2);
            f0 f0VarT0 = t0(viewI);
            if (f0VarT0 != null && !f0VarT0.K() && (r5 = f0VarT0.f563c) >= r7 && r5 < r1) {
                f0VarT0.b(2);
                f0VarT0.a(obj);
                ((p) viewI.getLayoutParams()).f586c = true;
            }
        }
        this.e.N(r7, r8);
    }

    void R() {
        int r2;
        for (int size = this.y0.size() - 1; size >= 0; size--) {
            f0 f0Var = this.y0.get(size);
            if (f0Var.f561a.getParent() == this && !f0Var.K() && (r2 = f0Var.q) != -1) {
                b.i.p.f0.K1(f0Var.f561a, r2);
                f0Var.q = -1;
            }
        }
        this.y0.clear();
    }

    void R0() {
        int r0 = this.h.j();
        for (int r1 = 0; r1 < r0; r1++) {
            f0 f0VarT0 = t0(this.h.i(r1));
            if (f0VarT0 != null && !f0VarT0.K()) {
                f0VarT0.b(6);
            }
        }
        Q0();
        this.e.u();
    }

    public void S0(@k0 int r4) {
        int r0 = this.h.g();
        for (int r1 = 0; r1 < r0; r1++) {
            this.h.f(r1).offsetLeftAndRight(r4);
        }
    }

    void T() {
        int measuredWidth;
        int measuredHeight;
        if (this.O != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.K.a(this, 3);
        this.O = edgeEffectA;
        if (this.j) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    public void T0(@k0 int r4) {
        int r0 = this.h.g();
        for (int r1 = 0; r1 < r0; r1++) {
            this.h.f(r1).offsetTopAndBottom(r4);
        }
    }

    void U() {
        int measuredHeight;
        int measuredWidth;
        if (this.L != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.K.a(this, 0);
        this.L = edgeEffectA;
        if (this.j) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    void U0(int r6, int r7) {
        int r0 = this.h.j();
        for (int r2 = 0; r2 < r0; r2++) {
            f0 f0VarT0 = t0(this.h.i(r2));
            if (f0VarT0 != null && !f0VarT0.K() && f0VarT0.f563c >= r6) {
                f0VarT0.B(r7, false);
                this.k0.g = true;
            }
        }
        this.e.v(r6, r7);
        requestLayout();
    }

    void V() {
        int measuredHeight;
        int measuredWidth;
        if (this.N != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.K.a(this, 2);
        this.N = edgeEffectA;
        if (this.j) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    void V0(int r10, int r11) {
        int r4;
        int r3;
        int r2;
        int r8;
        int r0 = this.h.j();
        if (r10 < r11) {
            r2 = -1;
            r3 = r10;
            r4 = r11;
        } else {
            r4 = r10;
            r3 = r11;
            r2 = 1;
        }
        for (int r6 = 0; r6 < r0; r6++) {
            f0 f0VarT0 = t0(this.h.i(r6));
            if (f0VarT0 != null && (r8 = f0VarT0.f563c) >= r3 && r8 <= r4) {
                if (r8 == r10) {
                    f0VarT0.B(r11 - r10, false);
                } else {
                    f0VarT0.B(r2, false);
                }
                this.k0.g = true;
            }
        }
        this.e.w(r10, r11);
        requestLayout();
    }

    void W() {
        int measuredWidth;
        int measuredHeight;
        if (this.M != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.K.a(this, 1);
        this.M = edgeEffectA;
        if (this.j) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    void W0(int r8, int r9, boolean z2) {
        int r0 = r8 + r9;
        int r1 = this.h.j();
        for (int r2 = 0; r2 < r1; r2++) {
            f0 f0VarT0 = t0(this.h.i(r2));
            if (f0VarT0 != null && !f0VarT0.K()) {
                int r4 = f0VarT0.f563c;
                if (r4 >= r0) {
                    f0VarT0.B(-r9, z2);
                } else if (r4 >= r8) {
                    f0VarT0.i(r8 - 1, -r9, z2);
                }
                this.k0.g = true;
            }
        }
        this.e.x(r8, r9, z2);
        requestLayout();
    }

    String X() {
        return " " + super.toString() + ", adapter:" + this.o + ", layout:" + this.p + ", context:" + getContext();
    }

    public void X0(@androidx.annotation.h0 View view) {
    }

    final void Y(c0 c0Var) {
        if (getScrollState() != 2) {
            c0Var.p = 0;
            c0Var.q = 0;
        } else {
            OverScroller overScroller = this.h0.f;
            c0Var.p = overScroller.getFinalX() - overScroller.getCurrX();
            c0Var.q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public void Y0(@androidx.annotation.h0 View view) {
    }

    @i0
    public View Z(float f2, float f3) {
        for (int r0 = this.h.g() - 1; r0 >= 0; r0--) {
            View viewF = this.h.f(r0);
            float translationX = viewF.getTranslationX();
            float translationY = viewF.getTranslationY();
            if (f2 >= viewF.getLeft() + translationX && f2 <= viewF.getRight() + translationX && f3 >= viewF.getTop() + translationY && f3 <= viewF.getBottom() + translationY) {
                return viewF;
            }
        }
        return null;
    }

    void Z0() {
        this.I++;
    }

    @Override // b.i.p.q
    public boolean a(int r8, int r9, int r10, int r11, int[] r12, int r13) {
        return getScrollingChildHelper().g(r8, r9, r10, r11, r12, r13);
    }

    @i0
    public View a0(@androidx.annotation.h0 View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    void a1() {
        b1(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int r3, int r4) {
        o oVar = this.p;
        if (oVar == null || !oVar.W0(this, arrayList, r3, r4)) {
            super.addFocusables(arrayList, r3, r4);
        }
    }

    @Override // b.i.p.q
    public boolean b(int r2) {
        return getScrollingChildHelper().l(r2);
    }

    @i0
    public f0 b0(@androidx.annotation.h0 View view) {
        View viewA0 = a0(view);
        if (viewA0 == null) {
            return null;
        }
        return s0(viewA0);
    }

    void b1(boolean z2) {
        int r0 = this.I - 1;
        this.I = r0;
        if (r0 < 1) {
            this.I = 0;
            if (z2) {
                K();
                R();
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.p.p((p) layoutParams);
    }

    @Override // android.view.View, b.i.p.c0
    public int computeHorizontalScrollExtent() {
        o oVar = this.p;
        if (oVar != null && oVar.n()) {
            return this.p.t(this.k0);
        }
        return 0;
    }

    @Override // android.view.View, b.i.p.c0
    public int computeHorizontalScrollOffset() {
        o oVar = this.p;
        if (oVar != null && oVar.n()) {
            return this.p.u(this.k0);
        }
        return 0;
    }

    @Override // android.view.View, b.i.p.c0
    public int computeHorizontalScrollRange() {
        o oVar = this.p;
        if (oVar != null && oVar.n()) {
            return this.p.v(this.k0);
        }
        return 0;
    }

    @Override // android.view.View, b.i.p.c0
    public int computeVerticalScrollExtent() {
        o oVar = this.p;
        if (oVar != null && oVar.o()) {
            return this.p.w(this.k0);
        }
        return 0;
    }

    @Override // android.view.View, b.i.p.c0
    public int computeVerticalScrollOffset() {
        o oVar = this.p;
        if (oVar != null && oVar.o()) {
            return this.p.x(this.k0);
        }
        return 0;
    }

    @Override // android.view.View, b.i.p.c0
    public int computeVerticalScrollRange() {
        o oVar = this.p;
        if (oVar != null && oVar.o()) {
            return this.p.y(this.k0);
        }
        return 0;
    }

    @Override // b.i.p.q
    public boolean d(int r7, int r8, int[] r9, int[] r10, int r11) {
        return getScrollingChildHelper().d(r7, r8, r9, r10, r11);
    }

    public void d1(int r1) {
    }

    @Override // android.view.View, b.i.p.s
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View, b.i.p.s
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View, b.i.p.s
    public boolean dispatchNestedPreScroll(int r2, int r3, int[] r4, int[] r5) {
        return getScrollingChildHelper().c(r2, r3, r4, r5);
    }

    @Override // android.view.View, b.i.p.s
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
        return getScrollingChildHelper().f(r7, r8, r9, r10, r11);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        float paddingRight;
        int paddingBottom;
        super.draw(canvas);
        int size = this.r.size();
        boolean z3 = false;
        for (int r2 = 0; r2 < size; r2++) {
            this.r.get(r2).k(canvas, this, this.k0);
        }
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int r0 = canvas.save();
            int paddingBottom2 = this.j ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, 0.0f);
            EdgeEffect edgeEffect2 = this.L;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(r0);
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int r02 = canvas.save();
            if (this.j) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.M;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(r02);
        }
        EdgeEffect edgeEffect5 = this.N;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int r03 = canvas.save();
            int width = getWidth();
            int paddingTop = this.j ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.N;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(r03);
        }
        EdgeEffect edgeEffect7 = this.O;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int r04 = canvas.save();
            canvas.rotate(180.0f);
            if (this.j) {
                paddingRight = (-getWidth()) + getPaddingRight();
                paddingBottom = (-getHeight()) + getPaddingBottom();
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            EdgeEffect edgeEffect8 = this.O;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(r04);
        }
        if ((z2 || this.P == null || this.r.size() <= 0 || !this.P.q()) ? z2 : true) {
            b.i.p.f0.g1(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    @Override // b.i.p.q
    public boolean e(int r2, int r3) {
        return getScrollingChildHelper().s(r2, r3);
    }

    public void e1(@k0 int r1, @k0 int r2) {
    }

    @Override // b.i.p.r
    public final void f(int r9, int r10, int r11, int r12, int[] r13, int r14, @androidx.annotation.h0 int[] r15) {
        getScrollingChildHelper().e(r9, r10, r11, r12, r13, r14, r15);
    }

    void f1() {
        if (this.q0 || !this.u) {
            return;
        }
        b.i.p.f0.i1(this, this.z0);
        this.q0 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int r10) {
        View viewA1;
        boolean z2;
        View viewH1 = this.p.h1(view, r10);
        if (viewH1 != null) {
            return viewH1;
        }
        boolean z3 = (this.o == null || this.p == null || M0() || this.A) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (r10 == 2 || r10 == 1)) {
            if (this.p.o()) {
                int r0 = r10 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, r0) == null;
                if (J0) {
                    r10 = r0;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.p.n()) {
                int r02 = (this.p.i0() == 1) ^ (r10 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, r02) == null;
                if (J0) {
                    r10 = r02;
                }
                z2 = z4;
            }
            if (z2) {
                E();
                if (a0(view) == null) {
                    return null;
                }
                L1();
                this.p.a1(view, r10, this.e, this.k0);
                M1(false);
            }
            viewA1 = focusFinder.findNextFocus(this, view, r10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, r10);
            if (viewFindNextFocus == null && z3) {
                E();
                if (a0(view) == null) {
                    return null;
                }
                L1();
                viewA1 = this.p.a1(view, r10, this.e, this.k0);
                M1(false);
            } else {
                viewA1 = viewFindNextFocus;
            }
        }
        if (viewA1 == null || viewA1.hasFocusable()) {
            return O0(view, viewA1, r10) ? viewA1 : super.focusSearch(view, r10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, r10);
        }
        v1(viewA1, null);
        return view;
    }

    @Override // b.i.p.q
    public void g(int r2) {
        getScrollingChildHelper().u(r2);
    }

    @i0
    public f0 g0(int r6) {
        f0 f0Var = null;
        if (this.G) {
            return null;
        }
        int r0 = this.h.j();
        for (int r2 = 0; r2 < r0; r2++) {
            f0 f0VarT0 = t0(this.h.i(r2));
            if (f0VarT0 != null && !f0VarT0.w() && m0(f0VarT0) == r6) {
                if (!this.h.n(f0VarT0.f561a)) {
                    return f0VarT0;
                }
                f0Var = f0VarT0;
            }
        }
        return f0Var;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.p;
        if (oVar != null) {
            return oVar.K();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + X());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.p;
        if (oVar != null) {
            return oVar.L(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + X());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.p;
        if (oVar != null) {
            return oVar.M(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + X());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @i0
    public g getAdapter() {
        return this.o;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.p;
        return oVar != null ? oVar.N() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int r2, int r3) {
        j jVar = this.s0;
        return jVar == null ? super.getChildDrawingOrder(r2, r3) : jVar.a(r2, r3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.j;
    }

    @i0
    public androidx.recyclerview.widget.y getCompatAccessibilityDelegate() {
        return this.r0;
    }

    @androidx.annotation.h0
    public k getEdgeEffectFactory() {
        return this.K;
    }

    @i0
    public l getItemAnimator() {
        return this.P;
    }

    public int getItemDecorationCount() {
        return this.r.size();
    }

    @i0
    public o getLayoutManager() {
        return this.p;
    }

    public int getMaxFlingVelocity() {
        return this.d0;
    }

    public int getMinFlingVelocity() {
        return this.c0;
    }

    long getNanoTime() {
        if (I0) {
            return System.nanoTime();
        }
        return 0L;
    }

    @i0
    public r getOnFlingListener() {
        return this.b0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.g0;
    }

    @androidx.annotation.h0
    public v getRecycledViewPool() {
        return this.e.j();
    }

    public int getScrollState() {
        return this.Q;
    }

    void h(int r3, int r4) {
        if (r3 < 0) {
            U();
            if (this.L.isFinished()) {
                this.L.onAbsorb(-r3);
            }
        } else if (r3 > 0) {
            V();
            if (this.N.isFinished()) {
                this.N.onAbsorb(r3);
            }
        }
        if (r4 < 0) {
            W();
            if (this.M.isFinished()) {
                this.M.onAbsorb(-r4);
            }
        } else if (r4 > 0) {
            T();
            if (this.O.isFinished()) {
                this.O.onAbsorb(r4);
            }
        }
        if (r3 == 0 && r4 == 0) {
            return;
        }
        b.i.p.f0.g1(this);
    }

    public f0 h0(long j2) {
        g gVar = this.o;
        f0 f0Var = null;
        if (gVar != null && gVar.i()) {
            int r0 = this.h.j();
            for (int r2 = 0; r2 < r0; r2++) {
                f0 f0VarT0 = t0(this.h.i(r2));
                if (f0VarT0 != null && !f0VarT0.w() && f0VarT0.k() == j2) {
                    if (!this.h.n(f0VarT0.f561a)) {
                        return f0VarT0;
                    }
                    f0Var = f0VarT0;
                }
            }
        }
        return f0Var;
    }

    @Override // android.view.View, b.i.p.s
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    @i0
    public f0 i0(int r2) {
        return k0(r2, false);
    }

    void i1(boolean z2) {
        this.H = z2 | this.H;
        this.G = true;
        R0();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.u;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.A;
    }

    @Override // android.view.View, b.i.p.s
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    @i0
    @Deprecated
    public f0 j0(int r2) {
        return k0(r2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    @androidx.annotation.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.f0 k0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.g r0 = r5.h
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.g r3 = r5.h
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$f0 r3 = t0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.w()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f563c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.m()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.g r1 = r5.h
            android.view.View r4 = r3.f561a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.k0(int, boolean):androidx.recyclerview.widget.RecyclerView$f0");
    }

    void k1(f0 f0Var, l.d dVar) {
        f0Var.G(0, 8192);
        if (this.k0.i && f0Var.z() && !f0Var.w() && !f0Var.K()) {
            this.i.c(n0(f0Var), f0Var);
        }
        this.i.e(f0Var, dVar);
    }

    public boolean l0(int r8, int r9) {
        o oVar = this.p;
        if (oVar == null) {
            Log.e(B0, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.A) {
            return false;
        }
        boolean zN = oVar.n();
        boolean zO = this.p.o();
        if (!zN || Math.abs(r8) < this.c0) {
            r8 = 0;
        }
        if (!zO || Math.abs(r9) < this.c0) {
            r9 = 0;
        }
        if (r8 == 0 && r9 == 0) {
            return false;
        }
        float f2 = r8;
        float f3 = r9;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z2 = zN || zO;
            dispatchNestedFling(f2, f3, z2);
            r rVar = this.b0;
            if (rVar != null && rVar.a(r8, r9)) {
                return true;
            }
            if (z2) {
                int r1 = zN ? 1 : 0;
                if (zO) {
                    r1 |= 2;
                }
                e(r1, 1);
                int r0 = this.d0;
                int r82 = Math.max(-r0, Math.min(r8, r0));
                int r02 = this.d0;
                this.h0.c(r82, Math.max(-r02, Math.min(r9, r02)));
                return true;
            }
        }
        return false;
    }

    int m0(f0 f0Var) {
        if (f0Var.q(524) || !f0Var.t()) {
            return -1;
        }
        return this.g.f(f0Var.f563c);
    }

    public void n(@androidx.annotation.h0 n nVar) {
        o(nVar, -1);
    }

    long n0(f0 f0Var) {
        return this.o.i() ? f0Var.k() : f0Var.f563c;
    }

    void n1() {
        l lVar = this.P;
        if (lVar != null) {
            lVar.l();
        }
        o oVar = this.p;
        if (oVar != null) {
            oVar.D1(this.e);
            this.p.E1(this.e);
        }
        this.e.d();
    }

    public void o(@androidx.annotation.h0 n nVar, int r4) {
        o oVar = this.p;
        if (oVar != null) {
            oVar.i("Cannot add item decoration during a scroll  or layout");
        }
        if (this.r.isEmpty()) {
            setWillNotDraw(false);
        }
        if (r4 < 0) {
            this.r.add(nVar);
        } else {
            this.r.add(r4, nVar);
        }
        Q0();
        requestLayout();
    }

    public int o0(@androidx.annotation.h0 View view) {
        f0 f0VarT0 = t0(view);
        if (f0VarT0 != null) {
            return f0VarT0.j();
        }
        return -1;
    }

    boolean o1(View view) {
        L1();
        boolean zR = this.h.r(view);
        if (zR) {
            f0 f0VarT0 = t0(view);
            this.e.K(f0VarT0);
            this.e.D(f0VarT0);
        }
        M1(!zR);
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = 0;
        this.u = true;
        this.x = this.x && !isLayoutRequested();
        o oVar = this.p;
        if (oVar != null) {
            oVar.F(this);
        }
        this.q0 = false;
        if (I0) {
            androidx.recyclerview.widget.l lVar = androidx.recyclerview.widget.l.h.get();
            this.i0 = lVar;
            if (lVar == null) {
                this.i0 = new androidx.recyclerview.widget.l();
                Display displayO = b.i.p.f0.O(this);
                float f2 = 60.0f;
                if (!isInEditMode() && displayO != null) {
                    float refreshRate = displayO.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.l lVar2 = this.i0;
                lVar2.f = (long) (1.0E9f / f2);
                androidx.recyclerview.widget.l.h.set(lVar2);
            }
            this.i0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.l lVar;
        super.onDetachedFromWindow();
        l lVar2 = this.P;
        if (lVar2 != null) {
            lVar2.l();
        }
        N1();
        this.u = false;
        o oVar = this.p;
        if (oVar != null) {
            oVar.G(this, this.e);
        }
        this.y0.clear();
        removeCallbacks(this.z0);
        this.i.j();
        if (!I0 || (lVar = this.i0) == null) {
            return;
        }
        lVar.j(this);
        this.i0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.r.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.r.get(r1).i(canvas, this, this.k0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.A
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.p
            boolean r0 = r0.o()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.p
            boolean r3 = r3.n()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.p
            boolean r3 = r3.o()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.p
            boolean r3 = r3.n()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.e0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.A1(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.A) {
            return false;
        }
        this.t = null;
        if (c0(motionEvent)) {
            y();
            return true;
        }
        o oVar = this.p;
        if (oVar == null) {
            return false;
        }
        boolean zN = oVar.n();
        boolean zO = this.p.o();
        if (this.S == null) {
            this.S = VelocityTracker.obtain();
        }
        this.S.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.B) {
                this.B = false;
            }
            this.R = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.V = x2;
            this.T = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.W = y2;
            this.U = y2;
            if (this.Q == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                g(1);
            }
            int[] r9 = this.w0;
            r9[1] = 0;
            r9[0] = 0;
            int r92 = zN ? 1 : 0;
            if (zO) {
                r92 |= 2;
            }
            e(r92, 0);
        } else if (actionMasked == 1) {
            this.S.clear();
            g(0);
        } else if (actionMasked == 2) {
            int r4 = motionEvent.findPointerIndex(this.R);
            if (r4 < 0) {
                Log.e(B0, "Error processing scroll; pointer index for id " + this.R + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(r4) + 0.5f);
            int y3 = (int) (motionEvent.getY(r4) + 0.5f);
            if (this.Q != 1) {
                int r42 = x3 - this.T;
                int r6 = y3 - this.U;
                if (!zN || Math.abs(r42) <= this.a0) {
                    z2 = false;
                } else {
                    this.V = x3;
                    z2 = true;
                }
                if (zO && Math.abs(r6) > this.a0) {
                    this.W = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            y();
        } else if (actionMasked == 5) {
            this.R = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.V = x4;
            this.T = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.W = y4;
            this.U = y4;
        } else if (actionMasked == 6) {
            c1(motionEvent);
        }
        return this.Q == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int r2, int r3, int r4, int r5) {
        b.i.k.o.b(X0);
        L();
        b.i.k.o.d();
        this.x = true;
    }

    @Override // android.view.View
    protected void onMeasure(int r8, int r9) {
        o oVar = this.p;
        if (oVar == null) {
            G(r8, r9);
            return;
        }
        boolean z2 = false;
        if (oVar.F0()) {
            int mode = View.MeasureSpec.getMode(r8);
            int mode2 = View.MeasureSpec.getMode(r9);
            this.p.q1(this.e, this.k0, r8, r9);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (z2 || this.o == null) {
                return;
            }
            if (this.k0.e == 1) {
                M();
            }
            this.p.W1(r8, r9);
            this.k0.j = true;
            N();
            this.p.Z1(r8, r9);
            if (this.p.d2()) {
                this.p.W1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.k0.j = true;
                N();
                this.p.Z1(r8, r9);
                return;
            }
            return;
        }
        if (this.v) {
            this.p.q1(this.e, this.k0, r8, r9);
            return;
        }
        if (this.D) {
            L1();
            Z0();
            h1();
            a1();
            c0 c0Var = this.k0;
            if (c0Var.l) {
                c0Var.h = true;
            } else {
                this.g.k();
                this.k0.h = false;
            }
            this.D = false;
            M1(false);
        } else if (this.k0.l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.o;
        if (gVar != null) {
            this.k0.f = gVar.e();
        } else {
            this.k0.f = 0;
        }
        L1();
        this.p.q1(this.e, this.k0, r8, r9);
        M1(false);
        this.k0.h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int r2, Rect rect) {
        if (M0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(r2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.f = zVar;
        super.onRestoreInstanceState(zVar.a());
        o oVar = this.p;
        if (oVar == null || (parcelable2 = this.f.f) == null) {
            return;
        }
        oVar.t1(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.f;
        if (zVar2 != null) {
            zVar.b(zVar2);
        } else {
            o oVar = this.p;
            zVar.f = oVar != null ? oVar.u1() : null;
        }
        return zVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        if (r1 == r3 && r2 == r4) {
            return;
        }
        I0();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[PHI: r0
  0x00dd: PHI (r0v42 int) = (r0v31 int), (r0v46 int) binds: [B:41:0x00c8, B:46:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(@androidx.annotation.h0 q qVar) {
        if (this.F == null) {
            this.F = new ArrayList();
        }
        this.F.add(qVar);
    }

    public long p0(@androidx.annotation.h0 View view) {
        f0 f0VarT0;
        g gVar = this.o;
        if (gVar == null || !gVar.i() || (f0VarT0 = t0(view)) == null) {
            return -1L;
        }
        return f0VarT0.k();
    }

    public void p1(@androidx.annotation.h0 n nVar) {
        o oVar = this.p;
        if (oVar != null) {
            oVar.i("Cannot remove item decoration during a scroll  or layout");
        }
        this.r.remove(nVar);
        if (this.r.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        Q0();
        requestLayout();
    }

    public void q(@androidx.annotation.h0 s sVar) {
        this.s.add(sVar);
    }

    public int q0(@androidx.annotation.h0 View view) {
        f0 f0VarT0 = t0(view);
        if (f0VarT0 != null) {
            return f0VarT0.m();
        }
        return -1;
    }

    public void q1(int r4) {
        int itemDecorationCount = getItemDecorationCount();
        if (r4 >= 0 && r4 < itemDecorationCount) {
            p1(z0(r4));
            return;
        }
        throw new IndexOutOfBoundsException(r4 + " is an invalid index for size " + itemDecorationCount);
    }

    public void r(@androidx.annotation.h0 t tVar) {
        if (this.m0 == null) {
            this.m0 = new ArrayList();
        }
        this.m0.add(tVar);
    }

    @Deprecated
    public int r0(@androidx.annotation.h0 View view) {
        return o0(view);
    }

    public void r1(@androidx.annotation.h0 q qVar) {
        List<q> list = this.F;
        if (list == null) {
            return;
        }
        list.remove(qVar);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z2) {
        f0 f0VarT0 = t0(view);
        if (f0VarT0 != null) {
            if (f0VarT0.y()) {
                f0VarT0.f();
            } else if (!f0VarT0.K()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + f0VarT0 + X());
            }
        }
        view.clearAnimation();
        J(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.p.s1(this, this.k0, view, view2) && view2 != null) {
            v1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.p.L1(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.s.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.s.get(r1).e(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.y != 0 || this.A) {
            this.z = true;
        } else {
            super.requestLayout();
        }
    }

    void s(@androidx.annotation.h0 f0 f0Var, @i0 l.d dVar, @androidx.annotation.h0 l.d dVar2) {
        f0Var.H(false);
        if (this.P.a(f0Var, dVar, dVar2)) {
            f1();
        }
    }

    public f0 s0(@androidx.annotation.h0 View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return t0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void s1(@androidx.annotation.h0 s sVar) {
        this.s.remove(sVar);
        if (this.t == sVar) {
            this.t = null;
        }
    }

    @Override // android.view.View
    public void scrollBy(int r4, int r5) {
        o oVar = this.p;
        if (oVar == null) {
            Log.e(B0, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.A) {
            return;
        }
        boolean zN = oVar.n();
        boolean zO = this.p.o();
        if (zN || zO) {
            if (!zN) {
                r4 = 0;
            }
            if (!zO) {
                r5 = 0;
            }
            A1(r4, r5, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int r1, int r2) {
        Log.w(B0, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (F1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@i0 androidx.recyclerview.widget.y yVar) {
        this.r0 = yVar;
        b.i.p.f0.u1(this, yVar);
    }

    public void setAdapter(@i0 g gVar) {
        setLayoutFrozen(false);
        D1(gVar, false, true);
        i1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@i0 j jVar) {
        if (jVar == this.s0) {
            return;
        }
        this.s0 = jVar;
        setChildrenDrawingOrderEnabled(jVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.j) {
            I0();
        }
        this.j = z2;
        super.setClipToPadding(z2);
        if (this.x) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@androidx.annotation.h0 k kVar) {
        b.i.o.i.f(kVar);
        this.K = kVar;
        I0();
    }

    public void setHasFixedSize(boolean z2) {
        this.v = z2;
    }

    public void setItemAnimator(@i0 l lVar) {
        l lVar2 = this.P;
        if (lVar2 != null) {
            lVar2.l();
            this.P.A(null);
        }
        this.P = lVar;
        if (lVar != null) {
            lVar.A(this.p0);
        }
    }

    public void setItemViewCacheSize(int r2) {
        this.e.H(r2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(@i0 o oVar) {
        if (oVar == this.p) {
            return;
        }
        N1();
        if (this.p != null) {
            l lVar = this.P;
            if (lVar != null) {
                lVar.l();
            }
            this.p.D1(this.e);
            this.p.E1(this.e);
            this.e.d();
            if (this.u) {
                this.p.G(this, this.e);
            }
            this.p.b2(null);
            this.p = null;
        } else {
            this.e.d();
        }
        this.h.o();
        this.p = oVar;
        if (oVar != null) {
            if (oVar.f577b != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f577b.X());
            }
            oVar.b2(this);
            if (this.u) {
                this.p.F(this);
            }
        }
        this.e.L();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View, b.i.p.s
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().p(z2);
    }

    public void setOnFlingListener(@i0 r rVar) {
        this.b0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(@i0 t tVar) {
        this.l0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.g0 = z2;
    }

    public void setRecycledViewPool(@i0 v vVar) {
        this.e.F(vVar);
    }

    public void setRecyclerListener(@i0 x xVar) {
        this.q = xVar;
    }

    void setScrollState(int r2) {
        if (r2 == this.Q) {
            return;
        }
        this.Q = r2;
        if (r2 != 2) {
            O1();
        }
        P(r2);
    }

    public void setScrollingTouchSlop(int r4) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (r4 == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (r4 != 1) {
            Log.w(B0, "setScrollingTouchSlop(): bad argument constant " + r4 + "; using default value");
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.a0 = scaledTouchSlop;
    }

    public void setViewCacheExtension(@i0 d0 d0Var) {
        this.e.G(d0Var);
    }

    @Override // android.view.View, b.i.p.s
    public boolean startNestedScroll(int r2) {
        return getScrollingChildHelper().r(r2);
    }

    @Override // android.view.View, b.i.p.s
    public void stopNestedScroll() {
        getScrollingChildHelper().t();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.A) {
            w("Do not suppressLayout in layout or scroll");
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.A = true;
                this.B = true;
                N1();
                return;
            }
            this.A = false;
            if (this.z && this.p != null && this.o != null) {
                requestLayout();
            }
            this.z = false;
        }
    }

    public void t1(@androidx.annotation.h0 t tVar) {
        List<t> list = this.m0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    void u(@androidx.annotation.h0 f0 f0Var, @androidx.annotation.h0 l.d dVar, @i0 l.d dVar2) {
        m(f0Var);
        f0Var.H(false);
        if (this.P.c(f0Var, dVar, dVar2)) {
            f1();
        }
    }

    public void u0(@androidx.annotation.h0 View view, @androidx.annotation.h0 Rect rect) {
        v0(view, rect);
    }

    void u1() {
        f0 f0Var;
        int r0 = this.h.g();
        for (int r1 = 0; r1 < r0; r1++) {
            View viewF = this.h.f(r1);
            f0 f0VarS0 = s0(viewF);
            if (f0VarS0 != null && (f0Var = f0VarS0.i) != null) {
                View view = f0Var.f561a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    void v(String str) {
        if (M0()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + X());
        }
        throw new IllegalStateException(str + X());
    }

    void w(String str) {
        if (M0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + X());
        }
        if (this.J > 0) {
            Log.w(B0, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + X()));
        }
    }

    boolean x(f0 f0Var) {
        l lVar = this.P;
        return lVar == null || lVar.g(f0Var, f0Var.p());
    }

    Rect y0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f586c) {
            return pVar.f585b;
        }
        if (this.k0.j() && (pVar.d() || pVar.f())) {
            return pVar.f585b;
        }
        Rect rect = pVar.f585b;
        rect.set(0, 0, 0, 0);
        int size = this.r.size();
        for (int r4 = 0; r4 < size; r4++) {
            this.l.set(0, 0, 0, 0);
            this.r.get(r4).g(this.l, view, this, this.k0);
            int r5 = rect.left;
            Rect rect2 = this.l;
            rect.left = r5 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f586c = false;
        return rect;
    }

    @androidx.annotation.h0
    public n z0(int r4) {
        int itemDecorationCount = getItemDecorationCount();
        if (r4 >= 0 && r4 < itemDecorationCount) {
            return this.r.get(r4);
        }
        throw new IndexOutOfBoundsException(r4 + " is an invalid index for size " + itemDecorationCount);
    }

    void z1() {
        int r0 = this.h.j();
        for (int r1 = 0; r1 < r0; r1++) {
            f0 f0VarT0 = t0(this.h.i(r1));
            if (!f0VarT0.K()) {
                f0VarT0.F();
            }
        }
    }
}
