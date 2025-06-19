package c.a.b.b.k;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final class f0 implements Runnable {
    private final /* synthetic */ m d;
    private final /* synthetic */ g0 e;

    f0(g0 g0Var, m mVar) {
        this.e = g0Var;
        this.d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            m mVarA = this.e.f1899b.a(this.d.r());
            if (mVarA == null) {
                this.e.e(new NullPointerException("Continuation returned null"));
                return;
            }
            mVarA.l(o.f1913b, this.e);
            mVarA.i(o.f1913b, this.e);
            mVarA.c(o.f1913b, this.e);
        } catch (k e) {
            if (e.getCause() instanceof Exception) {
                this.e.e((Exception) e.getCause());
            } else {
                this.e.e(e);
            }
        } catch (CancellationException unused) {
            this.e.c();
        } catch (Exception e2) {
            this.e.e(e2);
        }
    }
}
