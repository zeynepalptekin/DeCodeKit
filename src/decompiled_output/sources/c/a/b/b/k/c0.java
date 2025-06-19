package c.a.b.b.k;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class c0<TResult> implements i0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1892a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1893b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private g f1894c;

    public c0(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 g gVar) {
        this.f1892a = executor;
        this.f1894c = gVar;
    }

    @Override // c.a.b.b.k.i0
    public final void a() {
        synchronized (this.f1893b) {
            this.f1894c = null;
        }
    }

    @Override // c.a.b.b.k.i0
    public final void d(@androidx.annotation.h0 m<TResult> mVar) {
        if (mVar.v() || mVar.t()) {
            return;
        }
        synchronized (this.f1893b) {
            if (this.f1894c == null) {
                return;
            }
            this.f1892a.execute(new b0(this, mVar));
        }
    }
}
