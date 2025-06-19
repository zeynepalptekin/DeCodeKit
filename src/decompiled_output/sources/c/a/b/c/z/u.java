package c.a.b.c.z;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.w;
import b.w.g0;
import b.w.l0;
import c.a.b.c.u.o;

/* loaded from: classes.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    private static final RectF f2105a = new RectF();

    static class a implements o.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RectF f2106a;

        a(RectF rectF) {
            this.f2106a = rectF;
        }

        @Override // c.a.b.c.u.o.c
        @h0
        public c.a.b.c.u.d a(@h0 c.a.b.c.u.d dVar) {
            return dVar instanceof c.a.b.c.u.m ? dVar : new c.a.b.c.u.m(dVar.a(this.f2106a) / this.f2106a.height());
        }
    }

    static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RectF f2107a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RectF f2108b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f2109c;
        final /* synthetic */ float d;
        final /* synthetic */ float e;

        b(RectF rectF, RectF rectF2, float f, float f2, float f3) {
            this.f2107a = rectF;
            this.f2108b = rectF2;
            this.f2109c = f;
            this.d = f2;
            this.e = f3;
        }

        @Override // c.a.b.c.z.u.d
        @h0
        public c.a.b.c.u.d a(@h0 c.a.b.c.u.d dVar, @h0 c.a.b.c.u.d dVar2) {
            return new c.a.b.c.u.a(u.l(dVar.a(this.f2107a), dVar2.a(this.f2108b), this.f2109c, this.d, this.e));
        }
    }

    interface c {
        void a(Canvas canvas);
    }

    interface d {
        @h0
        c.a.b.c.u.d a(@h0 c.a.b.c.u.d dVar, @h0 c.a.b.c.u.d dVar2);
    }

    private u() {
    }

    static float a(@h0 RectF rectF) {
        return rectF.width() * rectF.height();
    }

    static c.a.b.c.u.o b(c.a.b.c.u.o oVar, RectF rectF) {
        return oVar.y(new a(rectF));
    }

    static Shader c(@androidx.annotation.k int r9) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, r9, r9, Shader.TileMode.CLAMP);
    }

    @h0
    static <T> T d(@i0 T t, @h0 T t2) {
        return t != null ? t : t2;
    }

    static View e(View view, @w int r3) throws Resources.NotFoundException {
        String resourceName = view.getResources().getResourceName(r3);
        while (view != null) {
            if (view.getId() != r3) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    static View f(View view, @w int r2) {
        View viewFindViewById = view.findViewById(r2);
        return viewFindViewById != null ? viewFindViewById : e(view, r2);
    }

    static RectF g(View view) {
        int[] r0 = new int[2];
        view.getLocationOnScreen(r0);
        return new RectF(r0[0], r0[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    static RectF h(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    static Rect i(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static boolean j(c.a.b.c.u.o oVar, RectF rectF) {
        return (oVar.r().a(rectF) == 0.0f && oVar.t().a(rectF) == 0.0f && oVar.l().a(rectF) == 0.0f && oVar.j().a(rectF) == 0.0f) ? false : true;
    }

    static float k(float f, float f2, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f3) {
        return f + (f3 * (f2 - f));
    }

    static float l(float f, float f2, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f3, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f4, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : k(f, f2, (f5 - f3) / (f4 - f3));
    }

    static int m(int r1, int r2, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f2, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f3) {
        return f3 < f ? r1 : f3 > f2 ? r2 : (int) k(r1, r2, (f3 - f) / (f2 - f));
    }

    static c.a.b.c.u.o n(c.a.b.c.u.o oVar, c.a.b.c.u.o oVar2, RectF rectF, RectF rectF2, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f2, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f3) {
        return f3 < f ? oVar : f3 > f2 ? oVar2 : s(oVar, oVar2, rectF, new b(rectF, rectF2, f, f2, f3));
    }

    static void o(l0 l0Var, @i0 g0 g0Var) {
        if (g0Var != null) {
            l0Var.Q0(g0Var);
        }
    }

    static void p(l0 l0Var, @i0 g0 g0Var) {
        if (g0Var != null) {
            l0Var.a1(g0Var);
        }
    }

    private static int q(Canvas canvas, Rect rect, int r9) {
        f2105a.set(rect);
        if (Build.VERSION.SDK_INT >= 21) {
            return canvas.saveLayerAlpha(f2105a, r9);
        }
        RectF rectF = f2105a;
        return canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, r9, 31);
    }

    static void r(Canvas canvas, Rect rect, float f, float f2, float f3, int r6, c cVar) {
        if (r6 <= 0) {
            return;
        }
        int r0 = canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        if (r6 < 255) {
            q(canvas, rect, r6);
        }
        cVar.a(canvas);
        canvas.restoreToCount(r0);
    }

    static c.a.b.c.u.o s(c.a.b.c.u.o oVar, c.a.b.c.u.o oVar2, RectF rectF, d dVar) {
        return (j(oVar, rectF) ? oVar : oVar2).v().L(dVar.a(oVar.r(), oVar2.r())).Q(dVar.a(oVar.t(), oVar2.t())).y(dVar.a(oVar.j(), oVar2.j())).D(dVar.a(oVar.l(), oVar2.l())).m();
    }
}
