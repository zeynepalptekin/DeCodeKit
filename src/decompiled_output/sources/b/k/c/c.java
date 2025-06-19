package b.k.c;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k0;
import b.i.p.f0;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c {
    public static final int A = 2;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 4;
    public static final int E = 8;
    public static final int F = 15;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 3;
    private static final int J = 20;
    private static final int K = 256;
    private static final int L = 600;
    private static final Interpolator M = new a();
    private static final String w = "ViewDragHelper";
    public static final int x = -1;
    public static final int y = 0;
    public static final int z = 1;

    /* renamed from: a, reason: collision with root package name */
    private int f1297a;

    /* renamed from: b, reason: collision with root package name */
    private int f1298b;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private int p;
    private OverScroller q;
    private final AbstractC0082c r;
    private View s;
    private boolean t;
    private final ViewGroup u;

    /* renamed from: c, reason: collision with root package name */
    private int f1299c = -1;
    private final Runnable v = new b();

    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.Q(0);
        }
    }

    /* renamed from: b.k.c.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0082c {
        public int a(@h0 View view, int r2, int r3) {
            return 0;
        }

        public int b(@h0 View view, int r2, int r3) {
            return 0;
        }

        public int c(int r1) {
            return r1;
        }

        public int d(@h0 View view) {
            return 0;
        }

        public int e(@h0 View view) {
            return 0;
        }

        public void f(int r1, int r2) {
        }

        public boolean g(int r1) {
            return false;
        }

        public void h(int r1, int r2) {
        }

        public void i(@h0 View view, int r2) {
        }

        public void j(int r1) {
        }

        public void k(@h0 View view, int r2, int r3, @k0 int r4, @k0 int r5) {
        }

        public void l(@h0 View view, float f, float f2) {
        }

        public abstract boolean m(@h0 View view, int r2);
    }

    private c(@h0 Context context, @h0 ViewGroup viewGroup, @h0 AbstractC0082c abstractC0082c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0082c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.u = viewGroup;
        this.r = abstractC0082c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1298b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = new OverScroller(context, M);
    }

    private int B(int r4, int r5) {
        int r0 = r4 < this.u.getLeft() + this.o ? 1 : 0;
        if (r5 < this.u.getTop() + this.o) {
            r0 |= 4;
        }
        if (r4 > this.u.getRight() - this.o) {
            r0 |= 2;
        }
        return r5 > this.u.getBottom() - this.o ? r0 | 8 : r0;
    }

    private boolean J(int r3) {
        if (I(r3)) {
            return true;
        }
        Log.e(w, "Ignoring pointerId=" + r3 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void M() {
        this.l.computeCurrentVelocity(1000, this.m);
        r(i(this.l.getXVelocity(this.f1299c), this.n, this.m), i(this.l.getYVelocity(this.f1299c), this.n, this.m));
    }

    private void N(float f, float f2, int r5) {
        int r0 = e(f, f2, r5, 1) ? 1 : 0;
        if (e(f2, f, r5, 4)) {
            r0 |= 4;
        }
        if (e(f, f2, r5, 2)) {
            r0 |= 2;
        }
        if (e(f2, f, r5, 8)) {
            r0 |= 8;
        }
        if (r0 != 0) {
            int[] r3 = this.i;
            r3[r5] = r3[r5] | r0;
            this.r.f(r0, r5);
        }
    }

    private void O(float f, float f2, int r5) {
        u(r5);
        float[] fArr = this.d;
        this.f[r5] = f;
        fArr[r5] = f;
        float[] fArr2 = this.e;
        this.g[r5] = f2;
        fArr2[r5] = f2;
        this.h[r5] = B((int) f, (int) f2);
        this.k |= 1 << r5;
    }

    private void P(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int r1 = 0; r1 < pointerCount; r1++) {
            int pointerId = motionEvent.getPointerId(r1);
            if (J(pointerId)) {
                float x2 = motionEvent.getX(r1);
                float y2 = motionEvent.getY(r1);
                this.f[pointerId] = x2;
                this.g[pointerId] = y2;
            }
        }
    }

    private boolean e(float f, float f2, int r6, int r7) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.h[r6] & r7) != r7 || (this.p & r7) == 0 || (this.j[r6] & r7) == r7 || (this.i[r6] & r7) == r7) {
            return false;
        }
        int r0 = this.f1298b;
        if (fAbs <= r0 && fAbs2 <= r0) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.r.g(r7)) {
            return (this.i[r6] & r7) == 0 && fAbs > ((float) this.f1298b);
        }
        int[] r4 = this.j;
        r4[r6] = r4[r6] | r7;
        return false;
    }

    private boolean h(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z2 = this.r.d(view) > 0;
        boolean z3 = this.r.e(view) > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f) > ((float) this.f1298b) : z3 && Math.abs(f2) > ((float) this.f1298b);
        }
        float f3 = (f * f) + (f2 * f2);
        int r5 = this.f1298b;
        return f3 > ((float) (r5 * r5));
    }

    private float i(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        return fAbs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    private int j(int r2, int r3, int r4) {
        int r0 = Math.abs(r2);
        if (r0 < r3) {
            return 0;
        }
        return r0 > r4 ? r2 > 0 ? r4 : -r4 : r2;
    }

    private void k() {
        float[] fArr = this.d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.e, 0.0f);
        Arrays.fill(this.f, 0.0f);
        Arrays.fill(this.g, 0.0f);
        Arrays.fill(this.h, 0);
        Arrays.fill(this.i, 0);
        Arrays.fill(this.j, 0);
        this.k = 0;
    }

    private void l(int r3) {
        if (this.d == null || !I(r3)) {
            return;
        }
        this.d[r3] = 0.0f;
        this.e[r3] = 0.0f;
        this.f[r3] = 0.0f;
        this.g[r3] = 0.0f;
        this.h[r3] = 0;
        this.i[r3] = 0;
        this.j[r3] = 0;
        this.k = (~(1 << r3)) & this.k;
    }

    private int m(int r4, int r5, int r6) {
        if (r4 == 0) {
            return 0;
        }
        int width = this.u.getWidth();
        float f = width / 2;
        float fS = f + (s(Math.min(1.0f, Math.abs(r4) / width)) * f);
        int r52 = Math.abs(r5);
        return Math.min(r52 > 0 ? Math.round(Math.abs(fS / r52) * 1000.0f) * 4 : (int) (((Math.abs(r4) / r6) + 1.0f) * 256.0f), L);
    }

    private int n(View view, int r8, int r9, int r10, int r11) {
        float f;
        float f2;
        float f3;
        float f4;
        int r102 = j(r10, (int) this.n, (int) this.m);
        int r112 = j(r11, (int) this.n, (int) this.m);
        int r0 = Math.abs(r8);
        int r1 = Math.abs(r9);
        int r2 = Math.abs(r102);
        int r3 = Math.abs(r112);
        int r4 = r2 + r3;
        int r5 = r0 + r1;
        if (r102 != 0) {
            f = r2;
            f2 = r4;
        } else {
            f = r0;
            f2 = r5;
        }
        float f5 = f / f2;
        if (r112 != 0) {
            f3 = r3;
            f4 = r4;
        } else {
            f3 = r1;
            f4 = r5;
        }
        return (int) ((m(r8, r102, this.r.d(view)) * f5) + (m(r9, r112, this.r.e(view)) * (f3 / f4)));
    }

    public static c p(@h0 ViewGroup viewGroup, float f, @h0 AbstractC0082c abstractC0082c) {
        c cVarQ = q(viewGroup, abstractC0082c);
        cVarQ.f1298b = (int) (cVarQ.f1298b * (1.0f / f));
        return cVarQ;
    }

    public static c q(@h0 ViewGroup viewGroup, @h0 AbstractC0082c abstractC0082c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0082c);
    }

    private void r(float f, float f2) {
        this.t = true;
        this.r.l(this.s, f, f2);
        this.t = false;
        if (this.f1297a == 1) {
            Q(0);
        }
    }

    private float s(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private void t(int r11, int r12, int r13, int r14) {
        int left = this.s.getLeft();
        int top = this.s.getTop();
        if (r13 != 0) {
            r11 = this.r.a(this.s, r11, r13);
            f0.Y0(this.s, r11 - left);
        }
        int r6 = r11;
        if (r14 != 0) {
            r12 = this.r.b(this.s, r12, r14);
            f0.Z0(this.s, r12 - top);
        }
        int r7 = r12;
        if (r13 == 0 && r14 == 0) {
            return;
        }
        this.r.k(this.s, r6, r7, r6 - left, r7 - top);
    }

    private void u(int r10) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= r10) {
            int r102 = r10 + 1;
            float[] fArr2 = new float[r102];
            float[] fArr3 = new float[r102];
            float[] fArr4 = new float[r102];
            float[] fArr5 = new float[r102];
            int[] r4 = new int[r102];
            int[] r5 = new int[r102];
            int[] r103 = new int[r102];
            float[] fArr6 = this.d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] r6 = this.h;
                System.arraycopy(r6, 0, r4, 0, r6.length);
                int[] r62 = this.i;
                System.arraycopy(r62, 0, r5, 0, r62.length);
                int[] r63 = this.j;
                System.arraycopy(r63, 0, r103, 0, r63.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = r4;
            this.i = r5;
            this.j = r103;
        }
    }

    private boolean x(int r11, int r12, int r13, int r14) {
        int left = this.s.getLeft();
        int top = this.s.getTop();
        int r112 = r11 - left;
        int r122 = r12 - top;
        if (r112 == 0 && r122 == 0) {
            this.q.abortAnimation();
            Q(0);
            return false;
        }
        this.q.startScroll(left, top, r112, r122, n(this.s, r112, r122, r13, r14));
        Q(2);
        return true;
    }

    @k0
    public int A() {
        return this.o;
    }

    public float C() {
        return this.n;
    }

    @k0
    public int D() {
        return this.f1298b;
    }

    public int E() {
        return this.f1297a;
    }

    public boolean F(int r2, int r3) {
        return K(this.s, r2, r3);
    }

    public boolean G(int r5) {
        int length = this.h.length;
        for (int r2 = 0; r2 < length; r2++) {
            if (H(r5, r2)) {
                return true;
            }
        }
        return false;
    }

    public boolean H(int r2, int r3) {
        return I(r3) && (r2 & this.h[r3]) != 0;
    }

    public boolean I(int r3) {
        return ((1 << r3) & this.k) != 0;
    }

    public boolean K(@i0 View view, int r4, int r5) {
        return view != null && r4 >= view.getLeft() && r4 < view.getRight() && r5 >= view.getTop() && r5 < view.getBottom();
    }

    public void L(@h0 MotionEvent motionEvent) {
        int r10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int r2 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewV = v((int) x2, (int) y2);
            O(x2, y2, pointerId);
            W(viewV, pointerId);
            int r0 = this.h[pointerId];
            int r1 = this.p;
            if ((r0 & r1) != 0) {
                this.r.h(r0 & r1, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f1297a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (r2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(r2);
                        if (J(pointerId2)) {
                            float x3 = motionEvent.getX(r2);
                            float y3 = motionEvent.getY(r2);
                            float f = x3 - this.d[pointerId2];
                            float f2 = y3 - this.e[pointerId2];
                            N(f, f2, pointerId2);
                            if (this.f1297a != 1) {
                                View viewV2 = v((int) x3, (int) y3);
                                if (h(viewV2, f, f2) && W(viewV2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        r2++;
                    }
                } else {
                    if (!J(this.f1299c)) {
                        return;
                    }
                    int r02 = motionEvent.findPointerIndex(this.f1299c);
                    float x4 = motionEvent.getX(r02);
                    float y4 = motionEvent.getY(r02);
                    float[] fArr = this.f;
                    int r3 = this.f1299c;
                    int r12 = (int) (x4 - fArr[r3]);
                    int r03 = (int) (y4 - this.g[r3]);
                    t(this.s.getLeft() + r12, this.s.getTop() + r03, r12, r03);
                }
                P(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x5 = motionEvent.getX(actionIndex);
                    float y5 = motionEvent.getY(actionIndex);
                    O(x5, y5, pointerId3);
                    if (this.f1297a != 0) {
                        if (F((int) x5, (int) y5)) {
                            W(this.s, pointerId3);
                            return;
                        }
                        return;
                    } else {
                        W(v((int) x5, (int) y5), pointerId3);
                        int r102 = this.h[pointerId3];
                        int r13 = this.p;
                        if ((r102 & r13) != 0) {
                            this.r.h(r102 & r13, pointerId3);
                            return;
                        }
                        return;
                    }
                }
                if (actionMasked != 6) {
                    return;
                }
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f1297a == 1 && pointerId4 == this.f1299c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (r2 >= pointerCount2) {
                            r10 = -1;
                            break;
                        }
                        int pointerId5 = motionEvent.getPointerId(r2);
                        if (pointerId5 != this.f1299c) {
                            View viewV3 = v((int) motionEvent.getX(r2), (int) motionEvent.getY(r2));
                            View view = this.s;
                            if (viewV3 == view && W(view, pointerId5)) {
                                r10 = this.f1299c;
                                break;
                            }
                        }
                        r2++;
                    }
                    if (r10 == -1) {
                        M();
                    }
                }
                l(pointerId4);
                return;
            }
            if (this.f1297a == 1) {
                r(0.0f, 0.0f);
            }
        } else if (this.f1297a == 1) {
            M();
        }
        c();
    }

    void Q(int r3) {
        this.u.removeCallbacks(this.v);
        if (this.f1297a != r3) {
            this.f1297a = r3;
            this.r.j(r3);
            if (this.f1297a == 0) {
                this.s = null;
            }
        }
    }

    public void R(int r1) {
        this.p = r1;
    }

    public void S(float f) {
        this.n = f;
    }

    public boolean T(int r4, int r5) {
        if (this.t) {
            return x(r4, r5, (int) this.l.getXVelocity(this.f1299c), (int) this.l.getYVelocity(this.f1299c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U(@androidx.annotation.h0 android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.k.c.c.U(android.view.MotionEvent):boolean");
    }

    public boolean V(@h0 View view, int r2, int r3) {
        this.s = view;
        this.f1299c = -1;
        boolean zX = x(r2, r3, 0, 0);
        if (!zX && this.f1297a == 0 && this.s != null) {
            this.s = null;
        }
        return zX;
    }

    boolean W(View view, int r4) {
        if (view == this.s && this.f1299c == r4) {
            return true;
        }
        if (view == null || !this.r.m(view, r4)) {
            return false;
        }
        this.f1299c = r4;
        d(view, r4);
        return true;
    }

    public void a() {
        c();
        if (this.f1297a == 2) {
            int currX = this.q.getCurrX();
            int currY = this.q.getCurrY();
            this.q.abortAnimation();
            int currX2 = this.q.getCurrX();
            int currY2 = this.q.getCurrY();
            this.r.k(this.s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        Q(0);
    }

    protected boolean b(@h0 View view, boolean z2, int r16, int r17, int r18, int r19) {
        int r8;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int r6 = r18 + scrollX;
                if (r6 >= childAt.getLeft() && r6 < childAt.getRight() && (r8 = r19 + scrollY) >= childAt.getTop() && r8 < childAt.getBottom() && b(childAt, true, r16, r17, r6 - childAt.getLeft(), r8 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z2 && (view.canScrollHorizontally(-r16) || view.canScrollVertically(-r17));
    }

    public void c() {
        this.f1299c = -1;
        k();
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void d(@h0 View view, int r4) {
        if (view.getParent() == this.u) {
            this.s = view;
            this.f1299c = r4;
            this.r.i(view, r4);
            Q(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + ")");
    }

    public boolean f(int r5) {
        int length = this.d.length;
        for (int r2 = 0; r2 < length; r2++) {
            if (g(r5, r2)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int r7, int r8) {
        if (!I(r8)) {
            return false;
        }
        boolean z2 = (r7 & 1) == 1;
        boolean z3 = (r7 & 2) == 2;
        float f = this.f[r8] - this.d[r8];
        float f2 = this.g[r8] - this.e[r8];
        if (!z2 || !z3) {
            return z2 ? Math.abs(f) > ((float) this.f1298b) : z3 && Math.abs(f2) > ((float) this.f1298b);
        }
        float f3 = (f * f) + (f2 * f2);
        int r72 = this.f1298b;
        return f3 > ((float) (r72 * r72));
    }

    public boolean o(boolean z2) {
        if (this.f1297a == 2) {
            boolean zComputeScrollOffset = this.q.computeScrollOffset();
            int currX = this.q.getCurrX();
            int currY = this.q.getCurrY();
            int left = currX - this.s.getLeft();
            int top = currY - this.s.getTop();
            if (left != 0) {
                f0.Y0(this.s, left);
            }
            if (top != 0) {
                f0.Z0(this.s, top);
            }
            if (left != 0 || top != 0) {
                this.r.k(this.s, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.q.getFinalX() && currY == this.q.getFinalY()) {
                this.q.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z2) {
                    this.u.post(this.v);
                } else {
                    Q(0);
                }
            }
        }
        return this.f1297a == 2;
    }

    @i0
    public View v(int r4, int r5) {
        for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.u.getChildAt(this.r.c(childCount));
            if (r4 >= childAt.getLeft() && r4 < childAt.getRight() && r5 >= childAt.getTop() && r5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void w(int r11, int r12, int r13, int r14) {
        if (!this.t) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.q.fling(this.s.getLeft(), this.s.getTop(), (int) this.l.getXVelocity(this.f1299c), (int) this.l.getYVelocity(this.f1299c), r11, r13, r12, r14);
        Q(2);
    }

    public int y() {
        return this.f1299c;
    }

    @i0
    public View z() {
        return this.s;
    }
}
