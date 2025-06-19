package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class q extends RecyclerView.b0 {
    private static final boolean q = false;
    private static final float r = 25.0f;
    private static final int s = 10000;
    public static final int t = -1;
    public static final int u = 1;
    public static final int v = 0;
    private static final float w = 1.2f;
    protected PointF k;
    private final DisplayMetrics l;
    private float n;
    protected final LinearInterpolator i = new LinearInterpolator();
    protected final DecelerateInterpolator j = new DecelerateInterpolator();
    private boolean m = false;
    protected int o = 0;
    protected int p = 0;

    public q(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    private float B() {
        if (!this.m) {
            this.n = w(this.l);
            this.m = true;
        }
        return this.n;
    }

    private int z(int r1, int r2) {
        int r22 = r1 - r2;
        if (r1 * r22 <= 0) {
            return 0;
        }
        return r22;
    }

    protected int A() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected int C() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected void D(RecyclerView.b0.a aVar) {
        PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            aVar.f(f());
            s();
            return;
        }
        j(pointFA);
        this.k = pointFA;
        this.o = (int) (pointFA.x * 10000.0f);
        this.p = (int) (pointFA.y * 10000.0f);
        aVar.l((int) (this.o * w), (int) (this.p * w), (int) (y(s) * w), this.i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    protected void m(int r1, int r2, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
        if (c() == 0) {
            s();
            return;
        }
        this.o = z(this.o, r1);
        int r12 = z(this.p, r2);
        this.p = r12;
        if (this.o == 0 && r12 == 0) {
            D(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    protected void n() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    protected void o() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    protected void p(View view, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
        int r4 = u(view, A());
        int r3 = v(view, C());
        int r0 = x((int) Math.sqrt((r4 * r4) + (r3 * r3)));
        if (r0 > 0) {
            aVar.l(-r4, -r3, r0, this.j);
        }
    }

    public int t(int r2, int r3, int r4, int r5, int r6) {
        if (r6 == -1) {
            return r4 - r2;
        }
        if (r6 != 0) {
            if (r6 == 1) {
                return r5 - r3;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int r42 = r4 - r2;
        if (r42 > 0) {
            return r42;
        }
        int r52 = r5 - r3;
        if (r52 < 0) {
            return r52;
        }
        return 0;
    }

    public int u(View view, int r12) {
        RecyclerView.o oVarE = e();
        if (oVarE == null || !oVarE.n()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return t(oVarE.Y(view) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, oVarE.b0(view) + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, oVarE.o0(), oVarE.z0() - oVarE.p0(), r12);
    }

    public int v(View view, int r12) {
        RecyclerView.o oVarE = e();
        if (oVarE == null || !oVarE.o()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return t(oVarE.c0(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, oVarE.W(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, oVarE.r0(), oVarE.e0() - oVarE.m0(), r12);
    }

    protected float w(DisplayMetrics displayMetrics) {
        return r / displayMetrics.densityDpi;
    }

    protected int x(int r5) {
        return (int) Math.ceil(y(r5) / 0.3356d);
    }

    protected int y(int r3) {
        return (int) Math.ceil(Math.abs(r3) * B());
    }
}
