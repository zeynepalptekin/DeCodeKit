package c.a.b.c.z;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import b.w.f1;
import b.w.n0;
import c.a.b.c.z.v;
import java.util.ArrayList;

/* loaded from: classes.dex */
abstract class q<P extends v> extends f1 {
    private final P g0;

    @i0
    private v h0;

    protected q(P p, @i0 v vVar) {
        this.g0 = p;
        this.h0 = vVar;
        D0(c.a.b.c.b.a.f1936b);
    }

    private Animator U0(ViewGroup viewGroup, View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        P p = this.g0;
        Animator animatorA = z ? p.a(viewGroup, view) : p.b(viewGroup, view);
        if (animatorA != null) {
            arrayList.add(animatorA);
        }
        v vVar = this.h0;
        if (vVar != null) {
            Animator animatorA2 = z ? vVar.a(viewGroup, view) : vVar.b(viewGroup, view);
            if (animatorA2 != null) {
                arrayList.add(animatorA2);
            }
        }
        c.a.b.c.b.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // b.w.f1
    public Animator P0(ViewGroup viewGroup, View view, n0 n0Var, n0 n0Var2) {
        return U0(viewGroup, view, true);
    }

    @Override // b.w.f1
    public Animator R0(ViewGroup viewGroup, View view, n0 n0Var, n0 n0Var2) {
        return U0(viewGroup, view, false);
    }

    @h0
    public P V0() {
        return this.g0;
    }

    @i0
    public v W0() {
        return this.h0;
    }

    public void X0(@i0 v vVar) {
        this.h0 = vVar;
    }
}
