package c.a.b.b.k;

/* loaded from: classes.dex */
final class a0 implements Runnable {
    private final /* synthetic */ m d;
    private final /* synthetic */ z e;

    a0(z zVar, m mVar) {
        this.e = zVar;
        this.d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.e.f1933b) {
            if (this.e.f1934c != null) {
                this.e.f1934c.a(this.d);
            }
        }
    }
}
