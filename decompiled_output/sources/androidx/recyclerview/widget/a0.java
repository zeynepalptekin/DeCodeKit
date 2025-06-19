package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.i0;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class a0 extends RecyclerView.l {
    private static final boolean m = false;
    private static final String n = "SimpleItemAnimator";
    boolean l = true;

    public abstract boolean D(RecyclerView.f0 f0Var);

    public abstract boolean E(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int r3, int r4, int r5, int r6);

    public abstract boolean F(RecyclerView.f0 f0Var, int r2, int r3, int r4, int r5);

    public abstract boolean G(RecyclerView.f0 f0Var);

    public final void H(RecyclerView.f0 f0Var) {
        Q(f0Var);
        h(f0Var);
    }

    public final void I(RecyclerView.f0 f0Var) {
        R(f0Var);
    }

    public final void J(RecyclerView.f0 f0Var, boolean z) {
        S(f0Var, z);
        h(f0Var);
    }

    public final void K(RecyclerView.f0 f0Var, boolean z) {
        T(f0Var, z);
    }

    public final void L(RecyclerView.f0 f0Var) {
        U(f0Var);
        h(f0Var);
    }

    public final void M(RecyclerView.f0 f0Var) {
        V(f0Var);
    }

    public final void N(RecyclerView.f0 f0Var) {
        W(f0Var);
        h(f0Var);
    }

    public final void O(RecyclerView.f0 f0Var) {
        X(f0Var);
    }

    public boolean P() {
        return this.l;
    }

    public void Q(RecyclerView.f0 f0Var) {
    }

    public void R(RecyclerView.f0 f0Var) {
    }

    public void S(RecyclerView.f0 f0Var, boolean z) {
    }

    public void T(RecyclerView.f0 f0Var, boolean z) {
    }

    public void U(RecyclerView.f0 f0Var) {
    }

    public void V(RecyclerView.f0 f0Var) {
    }

    public void W(RecyclerView.f0 f0Var) {
    }

    public void X(RecyclerView.f0 f0Var) {
    }

    public void Y(boolean z) {
        this.l = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(@androidx.annotation.h0 RecyclerView.f0 f0Var, @i0 RecyclerView.l.d dVar, @androidx.annotation.h0 RecyclerView.l.d dVar2) {
        return (dVar == null || (dVar.f572a == dVar2.f572a && dVar.f573b == dVar2.f573b)) ? D(f0Var) : F(f0Var, dVar.f572a, dVar.f573b, dVar2.f572a, dVar2.f573b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(@androidx.annotation.h0 RecyclerView.f0 f0Var, @androidx.annotation.h0 RecyclerView.f0 f0Var2, @androidx.annotation.h0 RecyclerView.l.d dVar, @androidx.annotation.h0 RecyclerView.l.d dVar2) {
        int r5;
        int r6;
        int r3 = dVar.f572a;
        int r4 = dVar.f573b;
        if (f0Var2.K()) {
            int r11 = dVar.f572a;
            r6 = dVar.f573b;
            r5 = r11;
        } else {
            r5 = dVar2.f572a;
            r6 = dVar2.f573b;
        }
        return E(f0Var, f0Var2, r3, r4, r5, r6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(@androidx.annotation.h0 RecyclerView.f0 f0Var, @androidx.annotation.h0 RecyclerView.l.d dVar, @i0 RecyclerView.l.d dVar2) {
        int r2 = dVar.f572a;
        int r3 = dVar.f573b;
        View view = f0Var.f561a;
        int left = dVar2 == null ? view.getLeft() : dVar2.f572a;
        int top = dVar2 == null ? view.getTop() : dVar2.f573b;
        if (f0Var.w() || (r2 == left && r3 == top)) {
            return G(f0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return F(f0Var, r2, r3, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d(@androidx.annotation.h0 RecyclerView.f0 f0Var, @androidx.annotation.h0 RecyclerView.l.d dVar, @androidx.annotation.h0 RecyclerView.l.d dVar2) {
        if (dVar.f572a != dVar2.f572a || dVar.f573b != dVar2.f573b) {
            return F(f0Var, dVar.f572a, dVar.f573b, dVar2.f572a, dVar2.f573b);
        }
        L(f0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(@androidx.annotation.h0 RecyclerView.f0 f0Var) {
        return !this.l || f0Var.u();
    }
}
