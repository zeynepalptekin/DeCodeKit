package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.i0;
import androidx.annotation.x0;
import androidx.recyclerview.widget.RecyclerView;

@x0
/* loaded from: classes.dex */
class k extends RecyclerView.n implements RecyclerView.s {
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 2;
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 2;
    private static final int J = 0;
    private static final int K = 1;
    private static final int L = 2;
    private static final int M = 3;
    private static final int N = 500;
    private static final int O = 1500;
    private static final int P = 1200;
    private static final int Q = 500;
    private static final int R = 255;
    private static final int[] S = {R.attr.state_pressed};
    private static final int[] T = new int[0];

    /* renamed from: a, reason: collision with root package name */
    private final int f701a;

    /* renamed from: b, reason: collision with root package name */
    private final int f702b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f703c;
    final Drawable d;
    private final int e;
    private final int f;
    private final StateListDrawable g;
    private final Drawable h;
    private final int i;
    private final int j;

    @x0
    int k;

    @x0
    int l;

    @x0
    float m;

    @x0
    int n;

    @x0
    int o;

    @x0
    float p;
    private RecyclerView s;
    private int q = 0;
    private int r = 0;
    private boolean t = false;
    private boolean u = false;
    private int v = 0;
    private int w = 0;
    private final int[] x = new int[2];
    private final int[] y = new int[2];
    final ValueAnimator z = ValueAnimator.ofFloat(0.0f, 1.0f);
    int A = 0;
    private final Runnable B = new a();
    private final RecyclerView.t C = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.w(500);
        }
    }

    class b extends RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int r2, int r3) {
            k.this.J(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f705a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f705a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f705a) {
                this.f705a = false;
                return;
            }
            if (((Float) k.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                k kVar = k.this;
                kVar.A = 0;
                kVar.G(0);
            } else {
                k kVar2 = k.this;
                kVar2.A = 2;
                kVar2.D();
            }
        }
    }

    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int r2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            k.this.f703c.setAlpha(r2);
            k.this.d.setAlpha(r2);
            k.this.D();
        }
    }

    k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int r9, int r10, int r11) {
        this.f703c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(r9, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(r9, drawable.getIntrinsicWidth());
        this.i = Math.max(r9, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(r9, drawable2.getIntrinsicWidth());
        this.f701a = r10;
        this.f702b = r11;
        this.f703c.setAlpha(255);
        this.d.setAlpha(255);
        this.z.addListener(new c());
        this.z.addUpdateListener(new d());
        l(recyclerView);
    }

    private void E(int r5) {
        m();
        this.s.postDelayed(this.B, r5);
    }

    private int F(float f, float f2, int[] r5, int r6, int r7, int r8) {
        int r0 = r5[1] - r5[0];
        if (r0 == 0) {
            return 0;
        }
        int r62 = r6 - r8;
        int r3 = (int) (((f2 - f) / r0) * r62);
        int r72 = r7 + r3;
        if (r72 >= r62 || r72 < 0) {
            return 0;
        }
        return r3;
    }

    private void H() {
        this.s.n(this);
        this.s.q(this);
        this.s.r(this.C);
    }

    private void K(float f) {
        int[] r3 = t();
        float fMax = Math.max(r3[0], Math.min(r3[1], f));
        if (Math.abs(this.l - fMax) < 2.0f) {
            return;
        }
        int r0 = F(this.m, fMax, r3, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
        if (r0 != 0) {
            this.s.scrollBy(0, r0);
        }
        this.m = fMax;
    }

    private void m() {
        this.s.removeCallbacks(this.B);
    }

    private void n() {
        this.s.p1(this);
        this.s.s1(this);
        this.s.t1(this.C);
        m();
    }

    private void o(Canvas canvas) {
        int r0 = this.r;
        int r1 = this.i;
        int r2 = this.o;
        int r3 = this.n;
        this.g.setBounds(0, 0, r3, r1);
        this.h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, r0 - r1);
        this.h.draw(canvas);
        canvas.translate(r2 - (r3 / 2), 0.0f);
        this.g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void p(Canvas canvas) {
        int r0 = this.q;
        int r1 = this.e;
        int r02 = r0 - r1;
        int r2 = this.l;
        int r3 = this.k;
        int r22 = r2 - (r3 / 2);
        this.f703c.setBounds(0, 0, r1, r3);
        this.d.setBounds(0, 0, this.f, this.r);
        if (z()) {
            this.d.draw(canvas);
            canvas.translate(this.e, r22);
            canvas.scale(-1.0f, 1.0f);
            this.f703c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            r02 = this.e;
        } else {
            canvas.translate(r02, 0.0f);
            this.d.draw(canvas);
            canvas.translate(0.0f, r22);
            this.f703c.draw(canvas);
        }
        canvas.translate(-r02, -r22);
    }

    private int[] q() {
        int[] r0 = this.y;
        int r1 = this.f702b;
        r0[0] = r1;
        r0[1] = this.q - r1;
        return r0;
    }

    private int[] t() {
        int[] r0 = this.x;
        int r1 = this.f702b;
        r0[0] = r1;
        r0[1] = this.r - r1;
        return r0;
    }

    private void x(float f) {
        int[] r3 = q();
        float fMax = Math.max(r3[0], Math.min(r3[1], f));
        if (Math.abs(this.o - fMax) < 2.0f) {
            return;
        }
        int r0 = F(this.p, fMax, r3, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
        if (r0 != 0) {
            this.s.scrollBy(r0, 0);
        }
        this.p = fMax;
    }

    private boolean z() {
        return b.i.p.f0.W(this.s) == 1;
    }

    @x0
    boolean A(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int r4 = this.o;
            int r0 = this.n;
            if (f >= r4 - (r0 / 2) && f <= r4 + (r0 / 2)) {
                return true;
            }
        }
        return false;
    }

    @x0
    boolean B(float f, float f2) {
        if (!z() ? f >= this.q - this.e : f <= this.e / 2) {
            int r3 = this.l;
            int r0 = this.k;
            if (f2 >= r3 - (r0 / 2) && f2 <= r3 + (r0 / 2)) {
                return true;
            }
        }
        return false;
    }

    @x0
    boolean C() {
        return this.v == 1;
    }

    void D() {
        this.s.invalidate();
    }

    void G(int r4) {
        int r0;
        if (r4 == 2 && this.v != 2) {
            this.f703c.setState(S);
            m();
        }
        if (r4 == 0) {
            D();
        } else {
            I();
        }
        if (this.v != 2 || r4 == 2) {
            if (r4 == 1) {
                r0 = 1500;
            }
            this.v = r4;
        }
        this.f703c.setState(T);
        r0 = P;
        E(r0);
        this.v = r4;
    }

    public void I() {
        int r0 = this.A;
        if (r0 != 0) {
            if (r0 != 3) {
                return;
            } else {
                this.z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }

    void J(int r9, int r10) {
        int r0 = this.s.computeVerticalScrollRange();
        int r1 = this.r;
        this.t = r0 - r1 > 0 && r1 >= this.f701a;
        int r2 = this.s.computeHorizontalScrollRange();
        int r5 = this.q;
        boolean z = r2 - r5 > 0 && r5 >= this.f701a;
        this.u = z;
        if (!this.t && !z) {
            if (this.v != 0) {
                G(0);
                return;
            }
            return;
        }
        if (this.t) {
            float f = r1;
            this.l = (int) ((f * (r10 + (f / 2.0f))) / r0);
            this.k = Math.min(r1, (r1 * r1) / r0);
        }
        if (this.u) {
            float f2 = r5;
            this.o = (int) ((f2 * (r9 + (f2 / 2.0f))) / r2);
            this.n = Math.min(r5, (r5 * r5) / r2);
        }
        int r92 = this.v;
        if (r92 == 0 || r92 == 1) {
            G(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 MotionEvent motionEvent) {
        int r6 = this.v;
        if (r6 == 1) {
            boolean zB = B(motionEvent.getX(), motionEvent.getY());
            boolean zA = A(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zB && !zA) {
                return false;
            }
            if (zA) {
                this.w = 1;
                this.p = (int) motionEvent.getX();
            } else if (zB) {
                this.w = 2;
                this.m = (int) motionEvent.getY();
            }
            G(2);
        } else if (r6 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void c(@androidx.annotation.h0 RecyclerView recyclerView, @androidx.annotation.h0 MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zB = B(motionEvent.getX(), motionEvent.getY());
            boolean zA = A(motionEvent.getX(), motionEvent.getY());
            if (zB || zA) {
                if (zA) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (zB) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                G(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            G(1);
            this.w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.v == 2) {
            I();
            if (this.w == 1) {
                x(motionEvent.getX());
            }
            if (this.w == 2) {
                K(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void e(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            G(0);
        } else if (this.A != 0) {
            if (this.t) {
                p(canvas);
            }
            if (this.u) {
                o(canvas);
            }
        }
    }

    public void l(@i0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            n();
        }
        this.s = recyclerView;
        if (recyclerView != null) {
            H();
        }
    }

    @x0
    Drawable r() {
        return this.g;
    }

    @x0
    Drawable s() {
        return this.h;
    }

    @x0
    Drawable u() {
        return this.f703c;
    }

    @x0
    Drawable v() {
        return this.d;
    }

    @x0
    void w(int r6) {
        int r0 = this.A;
        if (r0 == 1) {
            this.z.cancel();
        } else if (r0 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.z.setDuration(r6);
        this.z.start();
    }

    public boolean y() {
        return this.v == 2;
    }
}
