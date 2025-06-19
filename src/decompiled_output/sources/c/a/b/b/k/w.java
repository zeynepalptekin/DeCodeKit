package c.a.b.b.k;

/* loaded from: classes.dex */
final class w implements Runnable {
    private final /* synthetic */ m d;
    private final /* synthetic */ u e;

    w(u uVar, m mVar) {
        this.e = uVar;
        this.d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            m mVar = (m) this.e.f1927b.a(this.d);
            if (mVar == null) {
                this.e.e(new NullPointerException("Continuation returned null"));
                return;
            }
            mVar.l(o.f1913b, this.e);
            mVar.i(o.f1913b, this.e);
            mVar.c(o.f1913b, this.e);
        } catch (k e) {
            if (e.getCause() instanceof Exception) {
                this.e.f1928c.y((Exception) e.getCause());
            } else {
                this.e.f1928c.y(e);
            }
        } catch (Exception e2) {
            this.e.f1928c.y(e2);
        }
    }
}
