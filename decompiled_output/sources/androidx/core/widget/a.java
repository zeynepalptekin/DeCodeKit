package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.h0;
import b.i.p.f0;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int A = 0;
    private static final int B = 1;
    private static final int C = 1;
    private static final int D = 315;
    private static final int E = 1575;
    private static final float F = Float.MAX_VALUE;
    private static final float G = 0.2f;
    private static final float H = 1.0f;
    private static final int I = ViewConfiguration.getTapTimeout();
    private static final int J = 500;
    private static final int K = 500;
    public static final float u = 0.0f;
    public static final float v = Float.MAX_VALUE;
    public static final float w = 0.0f;
    public static final int x = 0;
    public static final int y = 1;
    public static final int z = 2;
    final View f;
    private Runnable g;
    private int j;
    private int k;
    private boolean o;
    boolean p;
    boolean q;
    boolean r;
    private boolean s;
    private boolean t;
    final C0027a d = new C0027a();
    private final Interpolator e = new AccelerateInterpolator();
    private float[] h = {0.0f, 0.0f};
    private float[] i = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] l = {0.0f, 0.0f};
    private float[] m = {0.0f, 0.0f};
    private float[] n = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0027a {

        /* renamed from: a, reason: collision with root package name */
        private int f398a;

        /* renamed from: b, reason: collision with root package name */
        private int f399b;

        /* renamed from: c, reason: collision with root package name */
        private float f400c;
        private float d;
        private float j;
        private int k;
        private long e = Long.MIN_VALUE;
        private long i = -1;
        private long f = 0;
        private int g = 0;
        private int h = 0;

        C0027a() {
        }

        private float e(long j) {
            if (j < this.e) {
                return 0.0f;
            }
            long j2 = this.i;
            if (j2 < 0 || j < j2) {
                return a.e((j - this.e) / this.f398a, 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.j;
            return (1.0f - f) + (f * a.e(j3 / this.k, 0.0f, 1.0f));
        }

        private float g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        public void a() {
            if (this.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f;
            this.f = jCurrentAnimationTimeMillis;
            float f = j * fG;
            this.g = (int) (this.f400c * f);
            this.h = (int) (f * this.d);
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            float f = this.f400c;
            return (int) (f / Math.abs(f));
        }

        public int f() {
            float f = this.d;
            return (int) (f / Math.abs(f));
        }

        public boolean h() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.f((int) (jCurrentAnimationTimeMillis - this.e), 0, this.f399b);
            this.j = e(jCurrentAnimationTimeMillis);
            this.i = jCurrentAnimationTimeMillis;
        }

        public void j(int r1) {
            this.f399b = r1;
        }

        public void k(int r1) {
            this.f398a = r1;
        }

        public void l(float f, float f2) {
            this.f400c = f;
            this.d = f2;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = jCurrentAnimationTimeMillis;
            this.i = -1L;
            this.f = jCurrentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.r) {
                if (aVar.p) {
                    aVar.p = false;
                    aVar.d.m();
                }
                C0027a c0027a = a.this.d;
                if (c0027a.h() || !a.this.x()) {
                    a.this.r = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.q) {
                    aVar2.q = false;
                    aVar2.c();
                }
                c0027a.a();
                a.this.l(c0027a.b(), c0027a.c());
                f0.i1(a.this.f, this);
            }
        }
    }

    public a(@h0 View view) {
        this.f = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        r(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        s(f3, f3);
        n(1);
        q(Float.MAX_VALUE, Float.MAX_VALUE);
        v(G, G);
        w(1.0f, 1.0f);
        m(I);
        u(500);
        t(500);
    }

    private float d(int r4, float f, float f2, float f3) {
        float fH = h(this.h[r4], f2, this.i[r4], f);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f4 = this.l[r4];
        float f5 = this.m[r4];
        float f6 = this.n[r4];
        float f7 = f4 * f3;
        return fH > 0.0f ? e(fH * f7, f5, f6) : -e((-fH) * f7, f5, f6);
    }

    static float e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    static int f(int r0, int r1, int r2) {
        return r0 > r2 ? r2 : r0 < r1 ? r1 : r0;
    }

    private float g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int r1 = this.j;
        if (r1 == 0 || r1 == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.r && this.j == 1) {
                    return 1.0f;
                }
            }
        } else if (r1 == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    private float h(float f, float f2, float f3, float f4) {
        float interpolation;
        float fE = e(f * f2, 0.0f, f3);
        float fG = g(f2 - f4, fE) - g(f4, fE);
        if (fG < 0.0f) {
            interpolation = -this.e.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.e.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void k() {
        if (this.p) {
            this.r = false;
        } else {
            this.d.i();
        }
    }

    private void y() {
        int r1;
        if (this.g == null) {
            this.g = new b();
        }
        this.r = true;
        this.p = true;
        if (this.o || (r1 = this.k) <= 0) {
            this.g.run();
        } else {
            f0.j1(this.f, this.g, r1);
        }
        this.o = true;
    }

    public abstract boolean a(int r1);

    public abstract boolean b(int r1);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public boolean i() {
        return this.s;
    }

    public boolean j() {
        return this.t;
    }

    public abstract void l(int r1, int r2);

    @h0
    public a m(int r1) {
        this.k = r1;
        return this;
    }

    @h0
    public a n(int r1) {
        this.j = r1;
        return this;
    }

    public a o(boolean z2) {
        if (this.s && !z2) {
            k();
        }
        this.s = z2;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.s
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.k()
            goto L58
        L1a:
            r5.q = r2
            r5.o = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.d
            r7.l(r0, r6)
            boolean r6 = r5.r
            if (r6 != 0) goto L58
            boolean r6 = r5.x()
            if (r6 == 0) goto L58
            r5.y()
        L58:
            boolean r6 = r5.t
            if (r6 == 0) goto L61
            boolean r6 = r5.r
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(boolean z2) {
        this.t = z2;
        return this;
    }

    @h0
    public a q(float f, float f2) {
        float[] fArr = this.i;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @h0
    public a r(float f, float f2) {
        float[] fArr = this.n;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @h0
    public a s(float f, float f2) {
        float[] fArr = this.m;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @h0
    public a t(int r2) {
        this.d.j(r2);
        return this;
    }

    @h0
    public a u(int r2) {
        this.d.k(r2);
        return this;
    }

    @h0
    public a v(float f, float f2) {
        float[] fArr = this.h;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @h0
    public a w(float f, float f2) {
        float[] fArr = this.l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    boolean x() {
        C0027a c0027a = this.d;
        int r1 = c0027a.f();
        int r0 = c0027a.d();
        return (r1 != 0 && b(r1)) || (r0 != 0 && a(r0));
    }
}
