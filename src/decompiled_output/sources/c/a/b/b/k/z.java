package c.a.b.b.k;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class z<TResult> implements i0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1932a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1933b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private f<TResult> f1934c;

    public z(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 f<TResult> fVar) {
        this.f1932a = executor;
        this.f1934c = fVar;
    }

    @Override // c.a.b.b.k.i0
    public final void a() {
        synchronized (this.f1933b) {
            this.f1934c = null;
        }
    }

    @Override // c.a.b.b.k.i0
    public final void d(@androidx.annotation.h0 m<TResult> mVar) {
        synchronized (this.f1933b) {
            if (this.f1934c == null) {
                return;
            }
            this.f1932a.execute(new a0(this, mVar));
        }
    }
}
