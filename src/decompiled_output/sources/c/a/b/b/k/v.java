package c.a.b.b.k;

/* loaded from: classes.dex */
final class v implements Runnable {
    private final /* synthetic */ m d;
    private final /* synthetic */ t e;

    v(t tVar, m mVar) {
        this.e = tVar;
        this.d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.t()) {
            this.e.f1925c.A();
            return;
        }
        try {
            this.e.f1925c.z(this.e.f1924b.a(this.d));
        } catch (k e) {
            if (e.getCause() instanceof Exception) {
                this.e.f1925c.y((Exception) e.getCause());
            } else {
                this.e.f1925c.y(e);
            }
        } catch (Exception e2) {
            this.e.f1925c.y(e2);
        }
    }
}
