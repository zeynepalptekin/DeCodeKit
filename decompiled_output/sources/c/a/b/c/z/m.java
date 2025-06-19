package c.a.b.c.z;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.i0;
import b.w.n0;

/* loaded from: classes.dex */
public final class m extends q<r> {
    private static final float j0 = 0.85f;
    private final boolean i0;

    public m(boolean z) {
        super(Y0(z), Z0());
        this.i0 = z;
    }

    private static r Y0(boolean z) {
        r rVar = new r(z);
        rVar.m(j0);
        rVar.l(j0);
        return rVar;
    }

    private static v Z0() {
        return new d();
    }

    @Override // c.a.b.c.z.q, b.w.f1
    public /* bridge */ /* synthetic */ Animator P0(ViewGroup viewGroup, View view, n0 n0Var, n0 n0Var2) {
        return super.P0(viewGroup, view, n0Var, n0Var2);
    }

    @Override // c.a.b.c.z.q, b.w.f1
    public /* bridge */ /* synthetic */ Animator R0(ViewGroup viewGroup, View view, n0 n0Var, n0 n0Var2) {
        return super.R0(viewGroup, view, n0Var, n0Var2);
    }

    @Override // c.a.b.c.z.q
    @i0
    public /* bridge */ /* synthetic */ v W0() {
        return super.W0();
    }

    @Override // c.a.b.c.z.q
    public /* bridge */ /* synthetic */ void X0(@i0 v vVar) {
        super.X0(vVar);
    }

    public boolean a1() {
        return this.i0;
    }
}
