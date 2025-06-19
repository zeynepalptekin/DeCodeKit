package c.a.b.b.k;

/* loaded from: classes.dex */
final class b0 implements Runnable {
    private final /* synthetic */ m d;
    private final /* synthetic */ c0 e;

    b0(c0 c0Var, m mVar) {
        this.e = c0Var;
        this.d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.e.f1893b) {
            if (this.e.f1894c != null) {
                this.e.f1894c.e(this.d.q());
            }
        }
    }
}
