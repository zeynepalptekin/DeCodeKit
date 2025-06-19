package c.a.b.b.k;

/* loaded from: classes.dex */
final class e0 implements Runnable {
    private final /* synthetic */ m d;
    private final /* synthetic */ d0 e;

    e0(d0 d0Var, m mVar) {
        this.e = d0Var;
        this.d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.e.f1896b) {
            if (this.e.f1897c != null) {
                this.e.f1897c.b(this.d.r());
            }
        }
    }
}
