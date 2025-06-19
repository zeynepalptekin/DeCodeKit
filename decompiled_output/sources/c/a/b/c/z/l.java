package c.a.b.c.z;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.w;
import b.i.p.f0;
import b.w.g0;
import b.w.n0;
import c.a.b.c.a;
import c.a.b.c.z.u;
import com.google.android.material.internal.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class l extends g0 {
    public static final int A0 = 1;
    public static final int B0 = 2;
    public static final int C0 = 3;
    public static final int D0 = 0;
    public static final int E0 = 1;
    public static final int F0 = 2;
    private static final f L0;
    private static final f N0;
    private static final float O0 = -1.0f;
    public static final int w0 = 0;
    public static final int x0 = 1;
    public static final int y0 = 2;
    public static final int z0 = 0;
    private boolean Z = false;
    private boolean a0 = false;

    @w
    private int b0 = R.id.content;

    @w
    private int c0 = -1;

    @w
    private int d0 = -1;

    @androidx.annotation.k
    private int e0 = 0;

    @androidx.annotation.k
    private int f0 = 0;

    @androidx.annotation.k
    private int g0 = 0;

    @androidx.annotation.k
    private int h0 = 1375731712;
    private int i0 = 0;
    private int j0 = 0;
    private int k0 = 0;

    @i0
    private View l0;

    @i0
    private View m0;

    @i0
    private c.a.b.c.u.o n0;

    @i0
    private c.a.b.c.u.o o0;

    @i0
    private e p0;

    @i0
    private e q0;

    @i0
    private e r0;

    @i0
    private e s0;
    private boolean t0;
    private float u0;
    private float v0;
    private static final String G0 = l.class.getSimpleName();
    private static final String H0 = "materialContainerTransition:bounds";
    private static final String I0 = "materialContainerTransition:shapeAppearance";
    private static final String[] J0 = {H0, I0};
    private static final f K0 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);
    private static final f M0 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f2084a;

        a(h hVar) {
            this.f2084a = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f2084a.o(valueAnimator.getAnimatedFraction());
        }
    }

    class b extends t {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f2086a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f2087b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2088c;
        final /* synthetic */ View d;

        b(View view, h hVar, View view2, View view3) {
            this.f2086a = view;
            this.f2087b = hVar;
            this.f2088c = view2;
            this.d = view3;
        }

        @Override // c.a.b.c.z.t, b.w.g0.h
        public void a(@h0 g0 g0Var) {
            z.g(this.f2086a).b(this.f2087b);
            this.f2088c.setAlpha(0.0f);
            this.d.setAlpha(0.0f);
        }

        @Override // c.a.b.c.z.t, b.w.g0.h
        public void e(@h0 g0 g0Var) {
            l.this.s0(this);
            if (l.this.a0) {
                return;
            }
            this.f2088c.setAlpha(1.0f);
            this.d.setAlpha(1.0f);
            z.g(this.f2086a).d(this.f2087b);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface d {
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.r(from = 0.0d, to = 1.0d)
        private final float f2089a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.r(from = 0.0d, to = 1.0d)
        private final float f2090b;

        public e(@androidx.annotation.r(from = 0.0d, to = 1.0d) float f, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f2) {
            this.f2089a = f;
            this.f2090b = f2;
        }

        @androidx.annotation.r(from = 0.0d, to = 1.0d)
        public float c() {
            return this.f2090b;
        }

        @androidx.annotation.r(from = 0.0d, to = 1.0d)
        public float d() {
            return this.f2089a;
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        @h0
        private final e f2091a;

        /* renamed from: b, reason: collision with root package name */
        @h0
        private final e f2092b;

        /* renamed from: c, reason: collision with root package name */
        @h0
        private final e f2093c;

        @h0
        private final e d;

        private f(@h0 e eVar, @h0 e eVar2, @h0 e eVar3, @h0 e eVar4) {
            this.f2091a = eVar;
            this.f2092b = eVar2;
            this.f2093c = eVar3;
            this.d = eVar4;
        }

        /* synthetic */ f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface g {
    }

    private static final class h extends Drawable {
        private static final int M = 754974720;
        private static final int N = -7829368;
        private static final float O = 0.3f;
        private static final float P = 1.5f;
        private final f A;
        private final c.a.b.c.z.a B;
        private final c.a.b.c.z.f C;
        private final boolean D;
        private final Paint E;
        private final Path F;
        private c.a.b.c.z.c G;
        private c.a.b.c.z.h H;
        private RectF I;
        private float J;
        private float K;
        private float L;

        /* renamed from: a, reason: collision with root package name */
        private final View f2094a;

        /* renamed from: b, reason: collision with root package name */
        private final RectF f2095b;

        /* renamed from: c, reason: collision with root package name */
        private final c.a.b.c.u.o f2096c;
        private final float d;
        private final View e;
        private final RectF f;
        private final c.a.b.c.u.o g;
        private final float h;
        private final Paint i;
        private final Paint j;
        private final Paint k;
        private final Paint l;
        private final Paint m;
        private final j n;
        private final PathMeasure o;
        private final float p;
        private final float[] q;
        private final boolean r;
        private final float s;
        private final float t;
        private final boolean u;
        private final c.a.b.c.u.j v;
        private final RectF w;
        private final RectF x;
        private final RectF y;
        private final RectF z;

        class a implements u.c {
            a() {
            }

            @Override // c.a.b.c.z.u.c
            public void a(Canvas canvas) {
                h.this.f2094a.draw(canvas);
            }
        }

        class b implements u.c {
            b() {
            }

            @Override // c.a.b.c.z.u.c
            public void a(Canvas canvas) {
                h.this.e.draw(canvas);
            }
        }

        private h(b.w.w wVar, View view, RectF rectF, c.a.b.c.u.o oVar, float f, View view2, RectF rectF2, c.a.b.c.u.o oVar2, float f2, @androidx.annotation.k int r18, @androidx.annotation.k int r19, @androidx.annotation.k int r20, int r21, boolean z, boolean z2, c.a.b.c.z.a aVar, c.a.b.c.z.f fVar, f fVar2, boolean z3) {
            this.i = new Paint();
            this.j = new Paint();
            this.k = new Paint();
            this.l = new Paint();
            this.m = new Paint();
            this.n = new j();
            this.q = new float[2];
            this.v = new c.a.b.c.u.j();
            this.E = new Paint();
            this.F = new Path();
            this.f2094a = view;
            this.f2095b = rectF;
            this.f2096c = oVar;
            this.d = f;
            this.e = view2;
            this.f = rectF2;
            this.g = oVar2;
            this.h = f2;
            this.r = z;
            this.u = z2;
            this.B = aVar;
            this.C = fVar;
            this.A = fVar2;
            this.D = z3;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.s = r5.widthPixels;
            this.t = r5.heightPixels;
            this.i.setColor(r18);
            this.j.setColor(r19);
            this.k.setColor(r20);
            this.v.n0(ColorStateList.valueOf(0));
            this.v.w0(2);
            this.v.t0(false);
            this.v.u0(N);
            this.w = new RectF(rectF);
            this.x = new RectF(this.w);
            this.y = new RectF(this.w);
            this.z = new RectF(this.y);
            PointF pointFM = m(rectF);
            PointF pointFM2 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(wVar.a(pointFM.x, pointFM.y, pointFM2.x, pointFM2.y), false);
            this.o = pathMeasure;
            this.p = pathMeasure.getLength();
            this.q[0] = rectF.centerX();
            this.q[1] = rectF.top;
            this.m.setStyle(Paint.Style.FILL);
            this.m.setShader(u.c(r21));
            this.E.setStyle(Paint.Style.STROKE);
            this.E.setStrokeWidth(10.0f);
            p(0.0f);
        }

        /* synthetic */ h(b.w.w wVar, View view, RectF rectF, c.a.b.c.u.o oVar, float f, View view2, RectF rectF2, c.a.b.c.u.o oVar2, float f2, int r10, int r11, int r12, int r13, boolean z, boolean z2, c.a.b.c.z.a aVar, c.a.b.c.z.f fVar, f fVar2, boolean z3, a aVar2) {
            this(wVar, view, rectF, oVar, f, view2, rectF2, oVar2, f2, r10, r11, r12, r13, z, z2, aVar, fVar, fVar2, z3);
        }

        private static float d(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * O;
        }

        private static float e(RectF rectF, float f) {
            return (rectF.centerY() / f) * P;
        }

        private void f(Canvas canvas, RectF rectF, Path path, @androidx.annotation.k int r6) {
            PointF pointFM = m(rectF);
            if (this.L == 0.0f) {
                path.reset();
                path.moveTo(pointFM.x, pointFM.y);
            } else {
                path.lineTo(pointFM.x, pointFM.y);
                this.E.setColor(r6);
                canvas.drawPath(path, this.E);
            }
        }

        private void g(Canvas canvas, RectF rectF, @androidx.annotation.k int r4) {
            this.E.setColor(r4);
            canvas.drawRect(rectF, this.E);
        }

        private void h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        private void i(Canvas canvas) {
            c.a.b.c.u.j jVar = this.v;
            RectF rectF = this.I;
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.v.m0(this.J);
            this.v.A0((int) this.K);
            this.v.setShapeAppearanceModel(this.n.c());
            this.v.draw(canvas);
        }

        private void j(Canvas canvas) {
            c.a.b.c.u.o oVarC = this.n.c();
            if (!oVarC.u(this.I)) {
                canvas.drawPath(this.n.d(), this.l);
            } else {
                float fA = oVarC.r().a(this.I);
                canvas.drawRoundRect(this.I, fA, fA, this.l);
            }
        }

        private void k(Canvas canvas) {
            n(canvas, this.k);
            Rect bounds = getBounds();
            RectF rectF = this.y;
            u.r(canvas, bounds, rectF.left, rectF.top, this.H.f2079b, this.G.f2066b, new b());
        }

        private void l(Canvas canvas) {
            n(canvas, this.j);
            Rect bounds = getBounds();
            RectF rectF = this.w;
            u.r(canvas, bounds, rectF.left, rectF.top, this.H.f2078a, this.G.f2065a, new a());
        }

        private static PointF m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        private void n(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(float f) {
            if (this.L != f) {
                p(f);
            }
        }

        private void p(float f) {
            this.L = f;
            this.m.setAlpha((int) (this.r ? u.k(0.0f, 255.0f, f) : u.k(255.0f, 0.0f, f)));
            this.o.getPosTan(this.p * f, this.q, null);
            float[] fArr = this.q;
            float f2 = fArr[0];
            float f3 = fArr[1];
            c.a.b.c.z.h hVarA = this.C.a(f, ((Float) b.i.o.i.f(Float.valueOf(this.A.f2092b.f2089a))).floatValue(), ((Float) b.i.o.i.f(Float.valueOf(this.A.f2092b.f2090b))).floatValue(), this.f2095b.width(), this.f2095b.height(), this.f.width(), this.f.height());
            this.H = hVarA;
            RectF rectF = this.w;
            float f4 = hVarA.f2080c;
            rectF.set(f2 - (f4 / 2.0f), f3, (f4 / 2.0f) + f2, hVarA.d + f3);
            RectF rectF2 = this.y;
            c.a.b.c.z.h hVar = this.H;
            float f5 = hVar.e;
            rectF2.set(f2 - (f5 / 2.0f), f3, f2 + (f5 / 2.0f), hVar.f + f3);
            this.x.set(this.w);
            this.z.set(this.y);
            float fFloatValue = ((Float) b.i.o.i.f(Float.valueOf(this.A.f2093c.f2089a))).floatValue();
            float fFloatValue2 = ((Float) b.i.o.i.f(Float.valueOf(this.A.f2093c.f2090b))).floatValue();
            boolean zC = this.C.c(this.H);
            RectF rectF3 = zC ? this.x : this.z;
            float fL = u.l(0.0f, 1.0f, fFloatValue, fFloatValue2, f);
            if (!zC) {
                fL = 1.0f - fL;
            }
            this.C.b(rectF3, fL, this.H);
            this.I = new RectF(Math.min(this.x.left, this.z.left), Math.min(this.x.top, this.z.top), Math.max(this.x.right, this.z.right), Math.max(this.x.bottom, this.z.bottom));
            this.n.b(f, this.f2096c, this.g, this.w, this.x, this.z, this.A.d);
            this.J = u.k(this.d, this.h, f);
            float fD = d(this.I, this.s);
            float fE = e(this.I, this.t);
            float f6 = this.J;
            float f7 = (int) (fE * f6);
            this.K = f7;
            this.l.setShadowLayer(f6, (int) (fD * f6), f7, M);
            this.G = this.B.a(f, ((Float) b.i.o.i.f(Float.valueOf(this.A.f2091a.f2089a))).floatValue(), ((Float) b.i.o.i.f(Float.valueOf(this.A.f2091a.f2090b))).floatValue());
            if (this.j.getColor() != 0) {
                this.j.setAlpha(this.G.f2065a);
            }
            if (this.k.getColor() != 0) {
                this.k.setAlpha(this.G.f2066b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@h0 Canvas canvas) {
            if (this.m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.m);
            }
            int r0 = this.D ? canvas.save() : -1;
            if (this.u && this.J > 0.0f) {
                h(canvas);
            }
            this.n.a(canvas);
            n(canvas, this.i);
            if (this.G.f2067c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(r0);
                f(canvas, this.w, this.F, -65281);
                g(canvas, this.x, b.i.p.i.u);
                g(canvas, this.w, -16711936);
                g(canvas, this.z, -16711681);
                g(canvas, this.y, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int r2) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@i0 ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }

    static {
        a aVar = null;
        L0 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), aVar);
        N0 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), aVar);
    }

    public l() {
        this.t0 = Build.VERSION.SDK_INT >= 28;
        this.u0 = O0;
        this.v0 = O0;
        D0(c.a.b.c.b.a.f1936b);
    }

    private f M0(boolean z) {
        f fVar;
        f fVar2;
        b.w.w wVarW = W();
        if ((wVarW instanceof b.w.b) || (wVarW instanceof k)) {
            fVar = M0;
            fVar2 = N0;
        } else {
            fVar = K0;
            fVar2 = L0;
        }
        return l1(z, fVar, fVar2);
    }

    private static RectF N0(View view, @i0 View view2, float f2, float f3) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF rectFG = u.g(view2);
        rectFG.offset(f2, f3);
        return rectFG;
    }

    private static c.a.b.c.u.o O0(@h0 View view, @h0 RectF rectF, @i0 c.a.b.c.u.o oVar) {
        return u.b(e1(view, oVar), rectF);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void P0(@androidx.annotation.h0 b.w.n0 r2, @androidx.annotation.i0 android.view.View r3, @androidx.annotation.w int r4, @androidx.annotation.i0 c.a.b.c.u.o r5) {
        /*
            r0 = -1
            if (r4 == r0) goto Lc
            android.view.View r3 = r2.f1494b
            android.view.View r3 = c.a.b.c.z.u.f(r3, r4)
        L9:
            r2.f1494b = r3
            goto L2e
        Lc:
            if (r3 == 0) goto Lf
            goto L9
        Lf:
            android.view.View r3 = r2.f1494b
            int r4 = c.a.b.c.a.h.mtrl_motion_snapshot_view
            java.lang.Object r3 = r3.getTag(r4)
            boolean r3 = r3 instanceof android.view.View
            if (r3 == 0) goto L2e
            android.view.View r3 = r2.f1494b
            int r4 = c.a.b.c.a.h.mtrl_motion_snapshot_view
            java.lang.Object r3 = r3.getTag(r4)
            android.view.View r3 = (android.view.View) r3
            android.view.View r4 = r2.f1494b
            int r0 = c.a.b.c.a.h.mtrl_motion_snapshot_view
            r1 = 0
            r4.setTag(r0, r1)
            goto L9
        L2e:
            android.view.View r3 = r2.f1494b
            boolean r4 = b.i.p.f0.P0(r3)
            if (r4 != 0) goto L42
            int r4 = r3.getWidth()
            if (r4 != 0) goto L42
            int r4 = r3.getHeight()
            if (r4 == 0) goto L63
        L42:
            android.view.ViewParent r4 = r3.getParent()
            if (r4 != 0) goto L4d
            android.graphics.RectF r4 = c.a.b.c.z.u.h(r3)
            goto L51
        L4d:
            android.graphics.RectF r4 = c.a.b.c.z.u.g(r3)
        L51:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f1493a
            java.lang.String r1 = "materialContainerTransition:bounds"
            r0.put(r1, r4)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f1493a
            c.a.b.c.u.o r3 = O0(r3, r4, r5)
            java.lang.String r4 = "materialContainerTransition:shapeAppearance"
            r2.put(r4, r3)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.c.z.l.P0(b.w.n0, android.view.View, int, c.a.b.c.u.o):void");
    }

    private static float S0(float f2, View view) {
        return f2 != O0 ? f2 : f0.P(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static c.a.b.c.u.o e1(@h0 View view, @i0 c.a.b.c.u.o oVar) {
        if (oVar != null) {
            return oVar;
        }
        if (view.getTag(a.h.mtrl_motion_snapshot_view) instanceof c.a.b.c.u.o) {
            return (c.a.b.c.u.o) view.getTag(a.h.mtrl_motion_snapshot_view);
        }
        Context context = view.getContext();
        int r0 = n1(context);
        return r0 != -1 ? c.a.b.c.u.o.b(context, r0, 0).m() : view instanceof c.a.b.c.u.s ? ((c.a.b.c.u.s) view).getShapeAppearanceModel() : c.a.b.c.u.o.a().m();
    }

    private f l1(boolean z, f fVar, f fVar2) {
        if (!z) {
            fVar = fVar2;
        }
        return new f((e) u.d(this.p0, fVar.f2091a), (e) u.d(this.q0, fVar.f2092b), (e) u.d(this.r0, fVar.f2093c), (e) u.d(this.s0, fVar.d), null);
    }

    @t0
    private static int n1(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{a.c.transitionShapeAppearance});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean q1(@h0 RectF rectF, @h0 RectF rectF2) {
        int r0 = this.i0;
        if (r0 == 0) {
            return u.a(rectF2) > u.a(rectF);
        }
        if (r0 == 1) {
            return true;
        }
        if (r0 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.i0);
    }

    public void A1(@i0 View view) {
        this.m0 = view;
    }

    public void B1(@w int r1) {
        this.d0 = r1;
    }

    public void C1(int r1) {
        this.j0 = r1;
    }

    public void D1(@i0 e eVar) {
        this.p0 = eVar;
    }

    public void E1(int r1) {
        this.k0 = r1;
    }

    public void F1(boolean z) {
        this.a0 = z;
    }

    public void G1(@i0 e eVar) {
        this.r0 = eVar;
    }

    public void H1(@i0 e eVar) {
        this.q0 = eVar;
    }

    public void I1(@androidx.annotation.k int r1) {
        this.h0 = r1;
    }

    public void J1(@i0 e eVar) {
        this.s0 = eVar;
    }

    public void K1(@androidx.annotation.k int r1) {
        this.f0 = r1;
    }

    public void L1(float f2) {
        this.u0 = f2;
    }

    public void M1(@i0 c.a.b.c.u.o oVar) {
        this.n0 = oVar;
    }

    public void N1(@i0 View view) {
        this.l0 = view;
    }

    public void O1(@w int r1) {
        this.c0 = r1;
    }

    public void P1(int r1) {
        this.i0 = r1;
    }

    @androidx.annotation.k
    public int Q0() {
        return this.e0;
    }

    @w
    public int R0() {
        return this.b0;
    }

    @androidx.annotation.k
    public int T0() {
        return this.g0;
    }

    public float U0() {
        return this.v0;
    }

    @i0
    public c.a.b.c.u.o V0() {
        return this.o0;
    }

    @i0
    public View W0() {
        return this.m0;
    }

    @w
    public int X0() {
        return this.d0;
    }

    public int Y0() {
        return this.j0;
    }

    @i0
    public e Z0() {
        return this.p0;
    }

    public int a1() {
        return this.k0;
    }

    @i0
    public e b1() {
        return this.r0;
    }

    @i0
    public e c1() {
        return this.q0;
    }

    @androidx.annotation.k
    public int d1() {
        return this.h0;
    }

    @Override // b.w.g0
    @i0
    public String[] e0() {
        return J0;
    }

    @i0
    public e f1() {
        return this.s0;
    }

    @androidx.annotation.k
    public int g1() {
        return this.f0;
    }

    public float h1() {
        return this.u0;
    }

    @i0
    public c.a.b.c.u.o i1() {
        return this.n0;
    }

    @i0
    public View j1() {
        return this.l0;
    }

    @w
    public int k1() {
        return this.c0;
    }

    public int m1() {
        return this.i0;
    }

    @Override // b.w.g0
    public void n(@h0 n0 n0Var) {
        P0(n0Var, this.m0, this.d0, this.o0);
    }

    public boolean o1() {
        return this.Z;
    }

    public boolean p1() {
        return this.t0;
    }

    @Override // b.w.g0
    public void q(@h0 n0 n0Var) {
        P0(n0Var, this.l0, this.c0, this.n0);
    }

    public boolean r1() {
        return this.a0;
    }

    public void s1(@androidx.annotation.k int r1) {
        this.e0 = r1;
        this.f0 = r1;
        this.g0 = r1;
    }

    public void t1(@androidx.annotation.k int r1) {
        this.e0 = r1;
    }

    @Override // b.w.g0
    @i0
    public Animator u(@h0 ViewGroup viewGroup, @i0 n0 n0Var, @i0 n0 n0Var2) throws Resources.NotFoundException {
        String str;
        String str2;
        View viewE;
        if (n0Var == null || n0Var2 == null) {
            return null;
        }
        RectF rectF = (RectF) n0Var.f1493a.get(H0);
        c.a.b.c.u.o oVar = (c.a.b.c.u.o) n0Var.f1493a.get(I0);
        if (rectF == null || oVar == null) {
            str = G0;
            str2 = "Skipping due to null start bounds. Ensure start view is laid out and measured.";
        } else {
            RectF rectF2 = (RectF) n0Var2.f1493a.get(H0);
            c.a.b.c.u.o oVar2 = (c.a.b.c.u.o) n0Var2.f1493a.get(I0);
            if (rectF2 != null && oVar2 != null) {
                View view = n0Var.f1494b;
                View view2 = n0Var2.f1494b;
                View view3 = view2.getParent() != null ? view2 : view;
                if (this.b0 == view3.getId()) {
                    viewE = (View) view3.getParent();
                } else {
                    viewE = u.e(view3, this.b0);
                    view3 = null;
                }
                RectF rectFG = u.g(viewE);
                float f2 = -rectFG.left;
                float f3 = -rectFG.top;
                RectF rectFN0 = N0(viewE, view3, f2, f3);
                rectF.offset(f2, f3);
                rectF2.offset(f2, f3);
                boolean zQ1 = q1(rectF, rectF2);
                h hVar = new h(W(), view, rectF, oVar, S0(this.u0, view), view2, rectF2, oVar2, S0(this.v0, view2), this.e0, this.f0, this.g0, this.h0, zQ1, this.t0, c.a.b.c.z.b.a(this.j0, zQ1), c.a.b.c.z.g.a(this.k0, zQ1, rectF, rectF2), M0(zQ1), this.Z, null);
                hVar.setBounds(Math.round(rectFN0.left), Math.round(rectFN0.top), Math.round(rectFN0.right), Math.round(rectFN0.bottom));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new a(hVar));
                b(new b(viewE, hVar, view, view2));
                return valueAnimatorOfFloat;
            }
            str = G0;
            str2 = "Skipping due to null end bounds. Ensure end view is laid out and measured.";
        }
        Log.w(str, str2);
        return null;
    }

    public void u1(boolean z) {
        this.Z = z;
    }

    public void v1(@w int r1) {
        this.b0 = r1;
    }

    public void w1(boolean z) {
        this.t0 = z;
    }

    public void x1(@androidx.annotation.k int r1) {
        this.g0 = r1;
    }

    public void y1(float f2) {
        this.v0 = f2;
    }

    public void z1(@i0 c.a.b.c.u.o oVar) {
        this.o0 = oVar;
    }
}
