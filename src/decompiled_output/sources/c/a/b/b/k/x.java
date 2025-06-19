package c.a.b.b.k;

/* loaded from: classes.dex */
final class x implements Runnable {
    private final /* synthetic */ y d;

    x(y yVar) {
        this.d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d.f1930b) {
            if (this.d.f1931c != null) {
                this.d.f1931c.c();
            }
        }
    }
}
