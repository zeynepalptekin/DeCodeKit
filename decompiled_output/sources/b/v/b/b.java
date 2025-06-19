package b.v.b;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.h0;
import androidx.annotation.p0;
import b.i.o.i;
import b.i.p.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class b extends Drawable implements Animatable {
    private static final float A = 0.8f;
    private static final float B = 0.01f;
    private static final float C = 0.20999998f;
    public static final int l = 0;
    private static final float m = 11.0f;
    private static final float n = 3.0f;
    private static final int o = 12;
    private static final int p = 6;
    public static final int q = 1;
    private static final float r = 7.5f;
    private static final float s = 2.5f;
    private static final int t = 10;
    private static final int u = 5;
    private static final float w = 0.75f;
    private static final float x = 0.5f;
    private static final int y = 1332;
    private static final float z = 216.0f;
    private final d d;
    private float e;
    private Resources f;
    private Animator g;
    float h;
    boolean i;
    private static final Interpolator j = new LinearInterpolator();
    private static final Interpolator k = new b.o.b.a.b();
    private static final int[] v = {f0.t};

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f1367a;

        a(d dVar) {
            this.f1367a = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.G(fFloatValue, this.f1367a);
            b.this.d(fFloatValue, this.f1367a, false);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: b.v.b.b$b, reason: collision with other inner class name */
    class C0104b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f1369a;

        C0104b(d dVar) {
            this.f1369a = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.d(1.0f, this.f1369a, true);
            this.f1369a.M();
            this.f1369a.v();
            b bVar = b.this;
            if (!bVar.i) {
                bVar.h += 1.0f;
                return;
            }
            bVar.i = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f1369a.I(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.h = 0.0f;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface c {
    }

    private static class d {
        int[] i;
        int j;
        float k;
        float l;
        float m;
        boolean n;
        Path o;
        float q;
        int r;
        int s;
        int u;

        /* renamed from: a, reason: collision with root package name */
        final RectF f1371a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        final Paint f1372b = new Paint();

        /* renamed from: c, reason: collision with root package name */
        final Paint f1373c = new Paint();
        final Paint d = new Paint();
        float e = 0.0f;
        float f = 0.0f;
        float g = 0.0f;
        float h = 5.0f;
        float p = 1.0f;
        int t = 255;

        d() {
            this.f1372b.setStrokeCap(Paint.Cap.SQUARE);
            this.f1372b.setAntiAlias(true);
            this.f1372b.setStyle(Paint.Style.STROKE);
            this.f1373c.setStyle(Paint.Style.FILL);
            this.f1373c.setAntiAlias(true);
            this.d.setColor(0);
        }

        void A(int r2) {
            this.d.setColor(r2);
        }

        void B(float f) {
            this.q = f;
        }

        void C(int r1) {
            this.u = r1;
        }

        void D(ColorFilter colorFilter) {
            this.f1372b.setColorFilter(colorFilter);
        }

        void E(int r2) {
            this.j = r2;
            this.u = this.i[r2];
        }

        void F(@h0 int[] r1) {
            this.i = r1;
            E(0);
        }

        void G(float f) {
            this.f = f;
        }

        void H(float f) {
            this.g = f;
        }

        void I(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }

        void J(float f) {
            this.e = f;
        }

        void K(Paint.Cap cap) {
            this.f1372b.setStrokeCap(cap);
        }

        void L(float f) {
            this.h = f;
            this.f1372b.setStrokeWidth(f);
        }

        void M() {
            this.k = this.e;
            this.l = this.f;
            this.m = this.g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f1371a;
            float f = this.q;
            float fMin = (this.h / 2.0f) + f;
            if (f <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.r * this.p) / 2.0f, this.h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f2 = this.e;
            float f3 = this.g;
            float f4 = (f2 + f3) * 360.0f;
            float f5 = ((this.f + f3) * 360.0f) - f4;
            this.f1372b.setColor(this.u);
            this.f1372b.setAlpha(this.t);
            float f6 = this.h / 2.0f;
            rectF.inset(f6, f6);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.d);
            float f7 = -f6;
            rectF.inset(f7, f7);
            canvas.drawArc(rectF, f4, f5, false, this.f1372b);
            b(canvas, f4, f5, rectF);
        }

        void b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.n) {
                Path path = this.o;
                if (path == null) {
                    Path path2 = new Path();
                    this.o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (this.r * this.p) / 2.0f;
                this.o.moveTo(0.0f, 0.0f);
                this.o.lineTo(this.r * this.p, 0.0f);
                Path path3 = this.o;
                float f4 = this.r;
                float f5 = this.p;
                path3.lineTo((f4 * f5) / 2.0f, this.s * f5);
                this.o.offset((fMin + rectF.centerX()) - f3, rectF.centerY() + (this.h / 2.0f));
                this.o.close();
                this.f1373c.setColor(this.u);
                this.f1373c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.o, this.f1373c);
                canvas.restore();
            }
        }

        int c() {
            return this.t;
        }

        float d() {
            return this.s;
        }

        float e() {
            return this.p;
        }

        float f() {
            return this.r;
        }

        int g() {
            return this.d.getColor();
        }

        float h() {
            return this.q;
        }

        int[] i() {
            return this.i;
        }

        float j() {
            return this.f;
        }

        int k() {
            return this.i[l()];
        }

        int l() {
            return (this.j + 1) % this.i.length;
        }

        float m() {
            return this.g;
        }

        boolean n() {
            return this.n;
        }

        float o() {
            return this.e;
        }

        int p() {
            return this.i[this.j];
        }

        float q() {
            return this.l;
        }

        float r() {
            return this.m;
        }

        float s() {
            return this.k;
        }

        Paint.Cap t() {
            return this.f1372b.getStrokeCap();
        }

        float u() {
            return this.h;
        }

        void v() {
            E(l());
        }

        void w() {
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            J(0.0f);
            G(0.0f);
            H(0.0f);
        }

        void x(int r1) {
            this.t = r1;
        }

        void y(float f, float f2) {
            this.r = (int) f;
            this.s = (int) f2;
        }

        void z(float f) {
            if (f != this.p) {
                this.p = f;
            }
        }
    }

    public b(@h0 Context context) {
        this.f = ((Context) i.f(context)).getResources();
        d dVar = new d();
        this.d = dVar;
        dVar.F(v);
        D(s);
        F();
    }

    private void A(float f, float f2, float f3, float f4) {
        d dVar = this.d;
        float f5 = this.f.getDisplayMetrics().density;
        dVar.L(f2 * f5);
        dVar.B(f * f5);
        dVar.E(0);
        dVar.y(f3 * f5, f4 * f5);
    }

    private void F() {
        d dVar = this.d;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(dVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(j);
        valueAnimatorOfFloat.addListener(new C0104b(dVar));
        this.g = valueAnimatorOfFloat;
    }

    private void c(float f, d dVar) {
        G(f, dVar);
        float fFloor = (float) (Math.floor(dVar.r() / A) + 1.0d);
        dVar.J(dVar.s() + (((dVar.q() - B) - dVar.s()) * f));
        dVar.G(dVar.q());
        dVar.H(dVar.r() + ((fFloor - dVar.r()) * f));
    }

    private int e(float f, int r8, int r9) {
        return ((((r8 >> 24) & 255) + ((int) ((((r9 >> 24) & 255) - r0) * f))) << 24) | ((((r8 >> 16) & 255) + ((int) ((((r9 >> 16) & 255) - r1) * f))) << 16) | ((((r8 >> 8) & 255) + ((int) ((((r9 >> 8) & 255) - r2) * f))) << 8) | ((r8 & 255) + ((int) (f * ((r9 & 255) - r8))));
    }

    private float o() {
        return this.e;
    }

    private void z(float f) {
        this.e = f;
    }

    public void B(float f, float f2) {
        this.d.J(f);
        this.d.G(f2);
        invalidateSelf();
    }

    public void C(@h0 Paint.Cap cap) {
        this.d.K(cap);
        invalidateSelf();
    }

    public void D(float f) {
        this.d.L(f);
        invalidateSelf();
    }

    public void E(int r4) {
        float f;
        float f2;
        float f3;
        float f4;
        if (r4 == 0) {
            f = m;
            f2 = n;
            f3 = 12.0f;
            f4 = 6.0f;
        } else {
            f = r;
            f2 = s;
            f3 = 10.0f;
            f4 = 5.0f;
        }
        A(f, f2, f3, f4);
        invalidateSelf();
    }

    void G(float f, d dVar) {
        dVar.C(f > w ? e((f - w) / 0.25f, dVar.p(), dVar.k()) : dVar.p());
    }

    void d(float f, d dVar, boolean z2) {
        float interpolation;
        float interpolation2;
        if (this.i) {
            c(f, dVar);
            return;
        }
        if (f != 1.0f || z2) {
            float fR = dVar.r();
            if (f < x) {
                float f2 = f / x;
                interpolation = dVar.s();
                interpolation2 = (k.getInterpolation(f2) * 0.79f) + B + interpolation;
            } else {
                float f3 = (f - x) / x;
                float fS = dVar.s() + 0.79f;
                interpolation = fS - (((1.0f - k.getInterpolation(f3)) * 0.79f) + B);
                interpolation2 = fS;
            }
            float f4 = fR + (C * f);
            float f5 = (f + this.h) * z;
            dVar.J(interpolation);
            dVar.G(interpolation2);
            dVar.H(f4);
            z(f5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.e, bounds.exactCenterX(), bounds.exactCenterY());
        this.d.a(canvas, bounds);
        canvas.restore();
    }

    public boolean f() {
        return this.d.n();
    }

    public float g() {
        return this.d.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.d.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.d.e();
    }

    public float i() {
        return this.d.f();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.g.isRunning();
    }

    public int j() {
        return this.d.g();
    }

    public float k() {
        return this.d.h();
    }

    @h0
    public int[] l() {
        return this.d.i();
    }

    public float m() {
        return this.d.j();
    }

    public float n() {
        return this.d.m();
    }

    public float p() {
        return this.d.o();
    }

    @h0
    public Paint.Cap q() {
        return this.d.t();
    }

    public float r() {
        return this.d.u();
    }

    public void s(float f, float f2) {
        this.d.y(f, f2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        this.d.x(r2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.D(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j2;
        this.g.cancel();
        this.d.M();
        if (this.d.j() != this.d.o()) {
            this.i = true;
            animator = this.g;
            j2 = 666;
        } else {
            this.d.E(0);
            this.d.w();
            animator = this.g;
            j2 = 1332;
        }
        animator.setDuration(j2);
        this.g.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.g.cancel();
        z(0.0f);
        this.d.I(false);
        this.d.E(0);
        this.d.w();
        invalidateSelf();
    }

    public void t(boolean z2) {
        this.d.I(z2);
        invalidateSelf();
    }

    public void u(float f) {
        this.d.z(f);
        invalidateSelf();
    }

    public void v(int r2) {
        this.d.A(r2);
        invalidateSelf();
    }

    public void w(float f) {
        this.d.B(f);
        invalidateSelf();
    }

    public void x(@h0 int... r2) {
        this.d.F(r2);
        this.d.E(0);
        invalidateSelf();
    }

    public void y(float f) {
        this.d.H(f);
        invalidateSelf();
    }
}
