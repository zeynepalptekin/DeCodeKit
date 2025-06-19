package c.a.b.c.z;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import b.w.n0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class p extends q<v> {
    public static final int k0 = 0;
    public static final int l0 = 1;
    public static final int m0 = 2;
    private final int i0;
    private final boolean j0;

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface a {
    }

    public p(int r3, boolean z) {
        super(Y0(r3, z), Z0());
        this.i0 = r3;
        this.j0 = z;
    }

    private static v Y0(int r2, boolean z) {
        if (r2 == 0) {
            return new s(z ? b.i.p.h.f1199c : b.i.p.h.f1198b);
        }
        if (r2 == 1) {
            return new s(z ? 80 : 48);
        }
        if (r2 == 2) {
            return new r(z);
        }
        throw new IllegalArgumentException("Invalid axis: " + r2);
    }

    private static v Z0() {
        return new e();
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
    @h0
    public /* bridge */ /* synthetic */ v V0() {
        return super.V0();
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

    public int a1() {
        return this.i0;
    }

    public boolean b1() {
        return this.j0;
    }
}
