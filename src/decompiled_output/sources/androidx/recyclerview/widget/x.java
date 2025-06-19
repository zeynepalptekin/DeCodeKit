package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.i0;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class x extends b0 {
    private static final int g = 100;

    @i0
    private w e;

    @i0
    private w f;

    class a extends q {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.q, androidx.recyclerview.widget.RecyclerView.b0
        protected void p(View view, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
            x xVar = x.this;
            int[] r3 = xVar.c(xVar.f612a.getLayoutManager(), view);
            int r4 = r3[0];
            int r32 = r3[1];
            int r0 = x(Math.max(Math.abs(r4), Math.abs(r32)));
            if (r0 > 0) {
                aVar.l(r4, r32, r0, this.j);
            }
        }

        @Override // androidx.recyclerview.widget.q
        protected float w(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.q
        protected int y(int r2) {
            return Math.min(100, super.y(r2));
        }
    }

    private int m(@androidx.annotation.h0 RecyclerView.o oVar, @androidx.annotation.h0 View view, w wVar) {
        return (wVar.g(view) + (wVar.e(view) / 2)) - (wVar.n() + (wVar.o() / 2));
    }

    @i0
    private View n(RecyclerView.o oVar, w wVar) {
        int r0 = oVar.Q();
        View view = null;
        if (r0 == 0) {
            return null;
        }
        int r2 = wVar.n() + (wVar.o() / 2);
        int r3 = ActivityChooserView.f.j;
        for (int r4 = 0; r4 < r0; r4++) {
            View viewP = oVar.P(r4);
            int r6 = Math.abs((wVar.g(viewP) + (wVar.e(viewP) / 2)) - r2);
            if (r6 < r3) {
                view = viewP;
                r3 = r6;
            }
        }
        return view;
    }

    @androidx.annotation.h0
    private w o(@androidx.annotation.h0 RecyclerView.o oVar) {
        w wVar = this.f;
        if (wVar == null || wVar.f743a != oVar) {
            this.f = w.a(oVar);
        }
        return this.f;
    }

    @i0
    private w p(RecyclerView.o oVar) {
        if (oVar.o()) {
            return q(oVar);
        }
        if (oVar.n()) {
            return o(oVar);
        }
        return null;
    }

    @androidx.annotation.h0
    private w q(@androidx.annotation.h0 RecyclerView.o oVar) {
        w wVar = this.e;
        if (wVar == null || wVar.f743a != oVar) {
            this.e = w.c(oVar);
        }
        return this.e;
    }

    private boolean r(RecyclerView.o oVar, int r4, int r5) {
        return oVar.n() ? r4 > 0 : r5 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean s(RecyclerView.o oVar) {
        PointF pointFA;
        int r0 = oVar.g0();
        if (!(oVar instanceof RecyclerView.b0.b) || (pointFA = ((RecyclerView.b0.b) oVar).a(r0 - 1)) == null) {
            return false;
        }
        return pointFA.x < 0.0f || pointFA.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.b0
    @i0
    public int[] c(@androidx.annotation.h0 RecyclerView.o oVar, @androidx.annotation.h0 View view) {
        int[] r0 = new int[2];
        if (oVar.n()) {
            r0[0] = m(oVar, view, o(oVar));
        } else {
            r0[0] = 0;
        }
        if (oVar.o()) {
            r0[1] = m(oVar, view, q(oVar));
        } else {
            r0[1] = 0;
        }
        return r0;
    }

    @Override // androidx.recyclerview.widget.b0
    protected q f(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.b0.b) {
            return new a(this.f612a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.b0
    @i0
    public View h(RecyclerView.o oVar) {
        w wVarO;
        if (oVar.o()) {
            wVarO = q(oVar);
        } else {
            if (!oVar.n()) {
                return null;
            }
            wVarO = o(oVar);
        }
        return n(oVar, wVarO);
    }

    @Override // androidx.recyclerview.widget.b0
    public int i(RecyclerView.o oVar, int r13, int r14) {
        w wVarP;
        int r0 = oVar.g0();
        if (r0 == 0 || (wVarP = p(oVar)) == null) {
            return -1;
        }
        int r3 = Integer.MIN_VALUE;
        int r4 = ActivityChooserView.f.j;
        int r5 = oVar.Q();
        View view = null;
        View view2 = null;
        for (int r6 = 0; r6 < r5; r6++) {
            View viewP = oVar.P(r6);
            if (viewP != null) {
                int r10 = m(oVar, viewP, wVarP);
                if (r10 <= 0 && r10 > r3) {
                    view2 = viewP;
                    r3 = r10;
                }
                if (r10 >= 0 && r10 < r4) {
                    view = viewP;
                    r4 = r10;
                }
            }
        }
        boolean zR = r(oVar, r13, r14);
        if (zR && view != null) {
            return oVar.s0(view);
        }
        if (!zR && view2 != null) {
            return oVar.s0(view2);
        }
        if (zR) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int r142 = oVar.s0(view) + (s(oVar) == zR ? -1 : 1);
        if (r142 < 0 || r142 >= r0) {
            return -1;
        }
        return r142;
    }
}
