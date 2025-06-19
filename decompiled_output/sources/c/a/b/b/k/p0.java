package c.a.b.b.k;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class p0 implements Runnable {
    private final /* synthetic */ l0 d;
    private final /* synthetic */ Callable e;

    p0(l0 l0Var, Callable callable) {
        this.d = l0Var;
        this.e = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.d.z(this.e.call());
        } catch (Exception e) {
            this.d.y(e);
        }
    }
}
