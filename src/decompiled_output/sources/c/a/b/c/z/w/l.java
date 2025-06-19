package c.a.b.c.z.w;

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
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import b.i.p.f0;
import c.a.b.c.a;
import c.a.b.c.z.w.v;
import com.google.android.material.internal.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@m0(21)
/* loaded from: classes.dex */
public final class l extends Transition {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 2;
    private static final f P;
    private static final f R;
    private static final float S = -1.0f;
    private boolean d = false;
    private boolean e = false;

    @androidx.annotation.w
    private int f = R.id.content;

    @androidx.annotation.w
    private int g = -1;

    @androidx.annotation.w
    private int h = -1;

    @androidx.annotation.k
    private int i = 0;

    @androidx.annotation.k
    private int j = 0;

    @androidx.annotation.k
    private int k = 0;

    @androidx.annotation.k
    private int l = 1375731712;
    private int m = 0;
    private int n = 0;
    private int o = 0;

    @i0
    private View p;

    @i0
    private View q;

    @i0
    private c.a.b.c.u.o r;

    @i0
    private c.a.b.c.u.o s;

    @i0
    private e t;

    @i0
    private e u;

    @i0
    private e v;

    @i0
    private e w;
    private boolean x;
    private float y;
    private float z;
    private static final String K = l.class.getSimpleName();
    private static final String L = "materialContainerTransition:bounds";
    private static final String M = "materialContainerTransition:shapeAppearance";
    private static final String[] N = {L, M};
    private static final f O = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);
    private static final f Q = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f2132a;

        a(h hVar) {
            this.f2132a = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f2132a.o(valueAnimator.getAnimatedFraction());
        }
    }

    class b extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f2134a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f2135b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2136c;
        final /* synthetic */ View d;

        b(View view, h hVar, View view2, View view3) {
            this.f2134a = view;
            this.f2135b = hVar;
            this.f2136c = view2;
            this.d = view3;
        }

        @Override // c.a.b.c.z.w.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(@h0 Transition transition) {
            l.this.removeListener(this);
            if (l.this.e) {
                return;
            }
            this.f2136c.setAlpha(1.0f);
            this.d.setAlpha(1.0f);
            z.g(this.f2134a).d(this.f2135b);
        }

        @Override // c.a.b.c.z.w.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(@h0 Transition transition) {
            z.g(this.f2134a).b(this.f2135b);
            this.f2136c.setAlpha(0.0f);
            this.d.setAlpha(0.0f);
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
        private final float f2137a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.r(from = 0.0d, to = 1.0d)
        private final float f2138b;

        public e(@androidx.annotation.r(from = 0.0d, to = 1.0d) float f, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f2) {
            this.f2137a = f;
            this.f2138b = f2;
        }

        @androidx.annotation.r(from = 0.0d, to = 1.0d)
        public float c() {
            return this.f2138b;
        }

        @androidx.annotation.r(from = 0.0d, to = 1.0d)
        public float d() {
            return this.f2137a;
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        @h0
        private final e f2139a;

        /* renamed from: b, reason: collision with root package name */
        @h0
        private final e f2140b;

        /* renamed from: c, reason: collision with root package name */
        @h0
        private final e f2141c;

        @h0
        private final e d;

        private f(@h0 e eVar, @h0 e eVar2, @h0 e eVar3, @h0 e eVar4) {
            this.f2139a = eVar;
            this.f2140b = eVar2;
            this.f2141c = eVar3;
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
        private final c.a.b.c.z.w.a B;
        private final c.a.b.c.z.w.f C;
        private final boolean D;
        private final Paint E;
        private final Path F;
        private c.a.b.c.z.w.c G;
        private c.a.b.c.z.w.h H;
        private RectF I;
        private float J;
        private float K;
        private float L;

        /* renamed from: a, reason: collision with root package name */
        private final View f2142a;

        /* renamed from: b, reason: collision with root package name */
        private final RectF f2143b;

        /* renamed from: c, reason: collision with root package name */
        private final c.a.b.c.u.o f2144c;
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

        class a implements v.c {
            a() {
            }

            @Override // c.a.b.c.z.w.v.c
            public void a(Canvas canvas) {
                h.this.f2142a.draw(canvas);
            }
        }

        class b implements v.c {
            b() {
            }

            @Override // c.a.b.c.z.w.v.c
            public void a(Canvas canvas) {
                h.this.e.draw(canvas);
            }
        }

        private h(PathMotion pathMotion, View view, RectF rectF, c.a.b.c.u.o oVar, float f, View view2, RectF rectF2, c.a.b.c.u.o oVar2, float f2, @androidx.annotation.k int r18, @androidx.annotation.k int r19, @androidx.annotation.k int r20, int r21, boolean z, boolean z2, c.a.b.c.z.w.a aVar, c.a.b.c.z.w.f fVar, f fVar2, boolean z3) {
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
            this.f2142a = view;
            this.f2143b = rectF;
            this.f2144c = oVar;
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
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointFM.x, pointFM.y, pointFM2.x, pointFM2.y), false);
            this.o = pathMeasure;
            this.p = pathMeasure.getLength();
            this.q[0] = rectF.centerX();
            this.q[1] = rectF.top;
            this.m.setStyle(Paint.Style.FILL);
            this.m.setShader(v.c(r21));
            this.E.setStyle(Paint.Style.STROKE);
            this.E.setStrokeWidth(10.0f);
            p(0.0f);
        }

        /* synthetic */ h(PathMotion pathMotion, View view, RectF rectF, c.a.b.c.u.o oVar, float f, View view2, RectF rectF2, c.a.b.c.u.o oVar2, float f2, int r10, int r11, int r12, int r13, boolean z, boolean z2, c.a.b.c.z.w.a aVar, c.a.b.c.z.w.f fVar, f fVar2, boolean z3, a aVar2) {
            this(pathMotion, view, rectF, oVar, f, view2, rectF2, oVar2, f2, r10, r11, r12, r13, z, z2, aVar, fVar, fVar2, z3);
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
            v.r(canvas, bounds, rectF.left, rectF.top, this.H.f2127b, this.G.f2114b, new b());
        }

        private void l(Canvas canvas) {
            n(canvas, this.j);
            Rect bounds = getBounds();
            RectF rectF = this.w;
            v.r(canvas, bounds, rectF.left, rectF.top, this.H.f2126a, this.G.f2113a, new a());
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
            this.m.setAlpha((int) (this.r ? v.k(0.0f, 255.0f, f) : v.k(255.0f, 0.0f, f)));
            this.o.getPosTan(this.p * f, this.q, null);
            float[] fArr = this.q;
            float f2 = fArr[0];
            float f3 = fArr[1];
            c.a.b.c.z.w.h hVarA = this.C.a(f, ((Float) b.i.o.i.f(Float.valueOf(this.A.f2140b.f2137a))).floatValue(), ((Float) b.i.o.i.f(Float.valueOf(this.A.f2140b.f2138b))).floatValue(), this.f2143b.width(), this.f2143b.height(), this.f.width(), this.f.height());
            this.H = hVarA;
            RectF rectF = this.w;
            float f4 = hVarA.f2128c;
            rectF.set(f2 - (f4 / 2.0f), f3, (f4 / 2.0f) + f2, hVarA.d + f3);
            RectF rectF2 = this.y;
            c.a.b.c.z.w.h hVar = this.H;
            float f5 = hVar.e;
            rectF2.set(f2 - (f5 / 2.0f), f3, f2 + (f5 / 2.0f), hVar.f + f3);
            this.x.set(this.w);
            this.z.set(this.y);
            float fFloatValue = ((Float) b.i.o.i.f(Float.valueOf(this.A.f2141c.f2137a))).floatValue();
            float fFloatValue2 = ((Float) b.i.o.i.f(Float.valueOf(this.A.f2141c.f2138b))).floatValue();
            boolean zB = this.C.b(this.H);
            RectF rectF3 = zB ? this.x : this.z;
            float fL = v.l(0.0f, 1.0f, fFloatValue, fFloatValue2, f);
            if (!zB) {
                fL = 1.0f - fL;
            }
            this.C.c(rectF3, fL, this.H);
            this.I = new RectF(Math.min(this.x.left, this.z.left), Math.min(this.x.top, this.z.top), Math.max(this.x.right, this.z.right), Math.max(this.x.bottom, this.z.bottom));
            this.n.b(f, this.f2144c, this.g, this.w, this.x, this.z, this.A.d);
            this.J = v.k(this.d, this.h, f);
            float fD = d(this.I, this.s);
            float fE = e(this.I, this.t);
            float f6 = this.J;
            float f7 = (int) (fE * f6);
            this.K = f7;
            this.l.setShadowLayer(f6, (int) (fD * f6), f7, M);
            this.G = this.B.a(f, ((Float) b.i.o.i.f(Float.valueOf(this.A.f2139a.f2137a))).floatValue(), ((Float) b.i.o.i.f(Float.valueOf(this.A.f2139a.f2138b))).floatValue());
            if (this.j.getColor() != 0) {
                this.j.setAlpha(this.G.f2113a);
            }
            if (this.k.getColor() != 0) {
                this.k.setAlpha(this.G.f2114b);
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
            if (this.G.f2115c) {
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
        P = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), aVar);
        R = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), aVar);
    }

    public l() {
        this.x = Build.VERSION.SDK_INT >= 28;
        this.y = S;
        this.z = S;
        setInterpolator(c.a.b.c.b.a.f1936b);
    }

    private f G(boolean z, f fVar, f fVar2) {
        if (!z) {
            fVar = fVar2;
        }
        return new f((e) v.d(this.t, fVar.f2139a), (e) v.d(this.u, fVar.f2140b), (e) v.d(this.v, fVar.f2141c), (e) v.d(this.w, fVar.d), null);
    }

    @t0
    private static int K(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{a.c.transitionShapeAppearance});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean N(@h0 RectF rectF, @h0 RectF rectF2) {
        int r0 = this.m;
        if (r0 == 0) {
            return v.a(rectF2) > v.a(rectF);
        }
        if (r0 == 1) {
            return true;
        }
        if (r0 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.m);
    }

    private f c(boolean z) {
        f fVar;
        f fVar2;
        PathMotion pathMotion = getPathMotion();
        if ((pathMotion instanceof ArcMotion) || (pathMotion instanceof k)) {
            fVar = Q;
            fVar2 = R;
        } else {
            fVar = O;
            fVar2 = P;
        }
        return G(z, fVar, fVar2);
    }

    private static RectF d(View view, @i0 View view2, float f2, float f3) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF rectFG = v.g(view2);
        rectFG.offset(f2, f3);
        return rectFG;
    }

    private static c.a.b.c.u.o e(@h0 View view, @h0 RectF rectF, @i0 c.a.b.c.u.o oVar) {
        return v.b(w(view, oVar), rectF);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(@androidx.annotation.h0 android.transition.TransitionValues r2, @androidx.annotation.i0 android.view.View r3, @androidx.annotation.w int r4, @androidx.annotation.i0 c.a.b.c.u.o r5) {
        /*
            r0 = -1
            if (r4 == r0) goto Lc
            android.view.View r3 = r2.view
            android.view.View r3 = c.a.b.c.z.w.v.f(r3, r4)
        L9:
            r2.view = r3
            goto L2e
        Lc:
            if (r3 == 0) goto Lf
            goto L9
        Lf:
            android.view.View r3 = r2.view
            int r4 = c.a.b.c.a.h.mtrl_motion_snapshot_view
            java.lang.Object r3 = r3.getTag(r4)
            boolean r3 = r3 instanceof android.view.View
            if (r3 == 0) goto L2e
            android.view.View r3 = r2.view
            int r4 = c.a.b.c.a.h.mtrl_motion_snapshot_view
            java.lang.Object r3 = r3.getTag(r4)
            android.view.View r3 = (android.view.View) r3
            android.view.View r4 = r2.view
            int r0 = c.a.b.c.a.h.mtrl_motion_snapshot_view
            r1 = 0
            r4.setTag(r0, r1)
            goto L9
        L2e:
            android.view.View r3 = r2.view
            boolean r4 = b.i.p.f0.P0(r3)
            if (r4 != 0) goto L42
            int r4 = r3.getWidth()
            if (r4 != 0) goto L42
            int r4 = r3.getHeight()
            if (r4 == 0) goto L63
        L42:
            android.view.ViewParent r4 = r3.getParent()
            if (r4 != 0) goto L4d
            android.graphics.RectF r4 = c.a.b.c.z.w.v.h(r3)
            goto L51
        L4d:
            android.graphics.RectF r4 = c.a.b.c.z.w.v.g(r3)
        L51:
            java.util.Map r0 = r2.values
            java.lang.String r1 = "materialContainerTransition:bounds"
            r0.put(r1, r4)
            java.util.Map r2 = r2.values
            c.a.b.c.u.o r3 = e(r3, r4, r5)
            java.lang.String r4 = "materialContainerTransition:shapeAppearance"
            r2.put(r4, r3)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.c.z.w.l.f(android.transition.TransitionValues, android.view.View, int, c.a.b.c.u.o):void");
    }

    private static float k(float f2, View view) {
        return f2 != S ? f2 : f0.P(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static c.a.b.c.u.o w(@h0 View view, @i0 c.a.b.c.u.o oVar) {
        if (oVar != null) {
            return oVar;
        }
        if (view.getTag(a.h.mtrl_motion_snapshot_view) instanceof c.a.b.c.u.o) {
            return (c.a.b.c.u.o) view.getTag(a.h.mtrl_motion_snapshot_view);
        }
        Context context = view.getContext();
        int r0 = K(context);
        return r0 != -1 ? c.a.b.c.u.o.b(context, r0, 0).m() : view instanceof c.a.b.c.u.s ? ((c.a.b.c.u.s) view).getShapeAppearanceModel() : c.a.b.c.u.o.a().m();
    }

    public float A() {
        return this.y;
    }

    @i0
    public c.a.b.c.u.o C() {
        return this.r;
    }

    @i0
    public View D() {
        return this.p;
    }

    @androidx.annotation.w
    public int F() {
        return this.g;
    }

    public int J() {
        return this.m;
    }

    public boolean L() {
        return this.d;
    }

    public boolean M() {
        return this.x;
    }

    public boolean O() {
        return this.e;
    }

    public void Q(@androidx.annotation.k int r1) {
        this.i = r1;
        this.j = r1;
        this.k = r1;
    }

    public void R(@androidx.annotation.k int r1) {
        this.i = r1;
    }

    public void S(boolean z) {
        this.d = z;
    }

    public void T(@androidx.annotation.w int r1) {
        this.f = r1;
    }

    public void U(boolean z) {
        this.x = z;
    }

    public void W(@androidx.annotation.k int r1) {
        this.k = r1;
    }

    public void X(float f2) {
        this.z = f2;
    }

    public void Y(@i0 c.a.b.c.u.o oVar) {
        this.s = oVar;
    }

    public void Z(@i0 View view) {
        this.q = view;
    }

    public void a0(@androidx.annotation.w int r1) {
        this.h = r1;
    }

    public void b0(int r1) {
        this.n = r1;
    }

    public void c0(@i0 e eVar) {
        this.t = eVar;
    }

    @Override // android.transition.Transition
    public void captureEndValues(@h0 TransitionValues transitionValues) {
        f(transitionValues, this.q, this.h, this.s);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@h0 TransitionValues transitionValues) {
        f(transitionValues, this.p, this.g, this.r);
    }

    @Override // android.transition.Transition
    @i0
    public Animator createAnimator(@h0 ViewGroup viewGroup, @i0 TransitionValues transitionValues, @i0 TransitionValues transitionValues2) throws Resources.NotFoundException {
        String str;
        String str2;
        View viewE;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        RectF rectF = (RectF) transitionValues.values.get(L);
        c.a.b.c.u.o oVar = (c.a.b.c.u.o) transitionValues.values.get(M);
        if (rectF == null || oVar == null) {
            str = K;
            str2 = "Skipping due to null start bounds. Ensure start view is laid out and measured.";
        } else {
            RectF rectF2 = (RectF) transitionValues2.values.get(L);
            c.a.b.c.u.o oVar2 = (c.a.b.c.u.o) transitionValues2.values.get(M);
            if (rectF2 != null && oVar2 != null) {
                View view = transitionValues.view;
                View view2 = transitionValues2.view;
                View view3 = view2.getParent() != null ? view2 : view;
                if (this.f == view3.getId()) {
                    viewE = (View) view3.getParent();
                } else {
                    viewE = v.e(view3, this.f);
                    view3 = null;
                }
                RectF rectFG = v.g(viewE);
                float f2 = -rectFG.left;
                float f3 = -rectFG.top;
                RectF rectFD = d(viewE, view3, f2, f3);
                rectF.offset(f2, f3);
                rectF2.offset(f2, f3);
                boolean zN = N(rectF, rectF2);
                h hVar = new h(getPathMotion(), view, rectF, oVar, k(this.y, view), view2, rectF2, oVar2, k(this.z, view2), this.i, this.j, this.k, this.l, zN, this.x, c.a.b.c.z.w.b.a(this.n, zN), c.a.b.c.z.w.g.a(this.o, zN, rectF, rectF2), c(zN), this.d, null);
                hVar.setBounds(Math.round(rectFD.left), Math.round(rectFD.top), Math.round(rectFD.right), Math.round(rectFD.bottom));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new a(hVar));
                addListener(new b(viewE, hVar, view, view2));
                return valueAnimatorOfFloat;
            }
            str = K;
            str2 = "Skipping due to null end bounds. Ensure end view is laid out and measured.";
        }
        Log.w(str, str2);
        return null;
    }

    public void d0(int r1) {
        this.o = r1;
    }

    public void e0(boolean z) {
        this.e = z;
    }

    public void f0(@i0 e eVar) {
        this.v = eVar;
    }

    @androidx.annotation.k
    public int g() {
        return this.i;
    }

    public void g0(@i0 e eVar) {
        this.u = eVar;
    }

    @Override // android.transition.Transition
    @i0
    public String[] getTransitionProperties() {
        return N;
    }

    @androidx.annotation.w
    public int h() {
        return this.f;
    }

    public void h0(@androidx.annotation.k int r1) {
        this.l = r1;
    }

    public void i0(@i0 e eVar) {
        this.w = eVar;
    }

    public void j0(@androidx.annotation.k int r1) {
        this.j = r1;
    }

    public void k0(float f2) {
        this.y = f2;
    }

    @androidx.annotation.k
    public int l() {
        return this.k;
    }

    public void l0(@i0 c.a.b.c.u.o oVar) {
        this.r = oVar;
    }

    public float m() {
        return this.z;
    }

    public void m0(@i0 View view) {
        this.p = view;
    }

    @i0
    public c.a.b.c.u.o n() {
        return this.s;
    }

    public void n0(@androidx.annotation.w int r1) {
        this.g = r1;
    }

    @i0
    public View o() {
        return this.q;
    }

    public void o0(int r1) {
        this.m = r1;
    }

    @androidx.annotation.w
    public int p() {
        return this.h;
    }

    public int q() {
        return this.n;
    }

    @i0
    public e r() {
        return this.t;
    }

    public int s() {
        return this.o;
    }

    @i0
    public e t() {
        return this.v;
    }

    @i0
    public e u() {
        return this.u;
    }

    @androidx.annotation.k
    public int v() {
        return this.l;
    }

    @i0
    public e x() {
        return this.w;
    }

    @androidx.annotation.k
    public int z() {
        return this.j;
    }
}
