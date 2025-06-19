package c.a.b.b.k;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class y<TResult> implements i0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1929a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1930b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private e f1931c;

    public y(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 e eVar) {
        this.f1929a = executor;
        this.f1931c = eVar;
    }

    @Override // c.a.b.b.k.i0
    public final void a() {
        synchronized (this.f1930b) {
            this.f1931c = null;
        }
    }

    @Override // c.a.b.b.k.i0
    public final void d(@androidx.annotation.h0 m<TResult> mVar) {
        if (mVar.t()) {
            synchronized (this.f1930b) {
                if (this.f1931c == null) {
                    return;
                }
                this.f1929a.execute(new x(this));
            }
        }
    }
}
