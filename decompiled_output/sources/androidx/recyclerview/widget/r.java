package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.i0;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class r extends b0 {
    private static final float g = 1.0f;

    @i0
    private w e;

    @i0
    private w f;

    private float m(RecyclerView.o oVar, w wVar) {
        int r0 = oVar.Q();
        if (r0 == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int r5 = ActivityChooserView.f.j;
        int r6 = Integer.MIN_VALUE;
        for (int r2 = 0; r2 < r0; r2++) {
            View viewP = oVar.P(r2);
            int r8 = oVar.s0(viewP);
            if (r8 != -1) {
                if (r8 < r5) {
                    view = viewP;
                    r5 = r8;
                }
                if (r8 > r6) {
                    view2 = viewP;
                    r6 = r8;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int r12 = Math.max(wVar.d(view), wVar.d(view2)) - Math.min(wVar.g(view), wVar.g(view2));
        if (r12 == 0) {
            return 1.0f;
        }
        return (r12 * 1.0f) / ((r6 - r5) + 1);
    }

    private int n(@androidx.annotation.h0 RecyclerView.o oVar, @androidx.annotation.h0 View view, w wVar) {
        return (wVar.g(view) + (wVar.e(view) / 2)) - (wVar.n() + (wVar.o() / 2));
    }

    private int o(RecyclerView.o oVar, w wVar, int r5, int r6) {
        int[] r52 = d(r5, r6);
        float fM = m(oVar, wVar);
        if (fM <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(r52[0]) > Math.abs(r52[1]) ? r52[0] : r52[1]) / fM);
    }

    @i0
    private View p(RecyclerView.o oVar, w wVar) {
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
    private w q(@androidx.annotation.h0 RecyclerView.o oVar) {
        w wVar = this.f;
        if (wVar == null || wVar.f743a != oVar) {
            this.f = w.a(oVar);
        }
        return this.f;
    }

    @androidx.annotation.h0
    private w r(@androidx.annotation.h0 RecyclerView.o oVar) {
        w wVar = this.e;
        if (wVar == null || wVar.f743a != oVar) {
            this.e = w.c(oVar);
        }
        return this.e;
    }

    @Override // androidx.recyclerview.widget.b0
    public int[] c(@androidx.annotation.h0 RecyclerView.o oVar, @androidx.annotation.h0 View view) {
        int[] r0 = new int[2];
        if (oVar.n()) {
            r0[0] = n(oVar, view, q(oVar));
        } else {
            r0[0] = 0;
        }
        if (oVar.o()) {
            r0[1] = n(oVar, view, r(oVar));
        } else {
            r0[1] = 0;
        }
        return r0;
    }

    @Override // androidx.recyclerview.widget.b0
    public View h(RecyclerView.o oVar) {
        w wVarQ;
        if (oVar.o()) {
            wVarQ = r(oVar);
        } else {
            if (!oVar.n()) {
                return null;
            }
            wVarQ = q(oVar);
        }
        return p(oVar, wVarQ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.b0
    public int i(RecyclerView.o oVar, int r10, int r11) {
        int r0;
        View viewH;
        int r2;
        int r4;
        PointF pointFA;
        int r102;
        int r112;
        if (!(oVar instanceof RecyclerView.b0.b) || (r0 = oVar.g0()) == 0 || (viewH = h(oVar)) == null || (r2 = oVar.s0(viewH)) == -1 || (pointFA = ((RecyclerView.b0.b) oVar).a(r0 - 1)) == null) {
            return -1;
        }
        if (oVar.n()) {
            r102 = o(oVar, q(oVar), r10, 0);
            if (pointFA.x < 0.0f) {
                r102 = -r102;
            }
        } else {
            r102 = 0;
        }
        if (oVar.o()) {
            r112 = o(oVar, r(oVar), 0, r11);
            if (pointFA.y < 0.0f) {
                r112 = -r112;
            }
        } else {
            r112 = 0;
        }
        if (oVar.o()) {
            r102 = r112;
        }
        if (r102 == 0) {
            return -1;
        }
        int r22 = r2 + r102;
        int r7 = r22 >= 0 ? r22 : 0;
        return r7 >= r0 ? r4 : r7;
    }
}
