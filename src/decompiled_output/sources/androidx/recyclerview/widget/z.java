package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class z {
    private z() {
    }

    static int a(RecyclerView.c0 c0Var, w wVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.Q() == 0 || c0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.s0(view) - oVar.s0(view2)) + 1;
        }
        return Math.min(wVar.o(), wVar.d(view2) - wVar.g(view));
    }

    static int b(RecyclerView.c0 c0Var, w wVar, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        if (oVar.Q() == 0 || c0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        int r4 = z2 ? Math.max(0, (c0Var.d() - Math.max(oVar.s0(view), oVar.s0(view2))) - 1) : Math.max(0, Math.min(oVar.s0(view), oVar.s0(view2)));
        if (z) {
            return Math.round((r4 * (Math.abs(wVar.d(view2) - wVar.g(view)) / (Math.abs(oVar.s0(view) - oVar.s0(view2)) + 1))) + (wVar.n() - wVar.g(view)));
        }
        return r4;
    }

    static int c(RecyclerView.c0 c0Var, w wVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.Q() == 0 || c0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0Var.d();
        }
        return (int) (((wVar.d(view2) - wVar.g(view)) / (Math.abs(oVar.s0(view) - oVar.s0(view2)) + 1)) * c0Var.d());
    }
}
