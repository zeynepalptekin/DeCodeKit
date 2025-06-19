package c.a.b.b.k;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class d0<TResult> implements i0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1895a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1896b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private h<? super TResult> f1897c;

    public d0(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 h<? super TResult> hVar) {
        this.f1895a = executor;
        this.f1897c = hVar;
    }

    @Override // c.a.b.b.k.i0
    public final void a() {
        synchronized (this.f1896b) {
            this.f1897c = null;
        }
    }

    @Override // c.a.b.b.k.i0
    public final void d(@androidx.annotation.h0 m<TResult> mVar) {
        if (mVar.v()) {
            synchronized (this.f1896b) {
                if (this.f1897c == null) {
                    return;
                }
                this.f1895a.execute(new e0(this, mVar));
            }
        }
    }
}
