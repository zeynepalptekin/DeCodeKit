package c.a.b.b.k;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class u<TResult, TContinuationResult> implements e, g, h<TContinuationResult>, i0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1926a;

    /* renamed from: b, reason: collision with root package name */
    private final c<TResult, m<TContinuationResult>> f1927b;

    /* renamed from: c, reason: collision with root package name */
    private final l0<TContinuationResult> f1928c;

    public u(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 c<TResult, m<TContinuationResult>> cVar, @androidx.annotation.h0 l0<TContinuationResult> l0Var) {
        this.f1926a = executor;
        this.f1927b = cVar;
        this.f1928c = l0Var;
    }

    @Override // c.a.b.b.k.i0
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // c.a.b.b.k.h
    public final void b(TContinuationResult tcontinuationresult) {
        this.f1928c.z(tcontinuationresult);
    }

    @Override // c.a.b.b.k.e
    public final void c() {
        this.f1928c.A();
    }

    @Override // c.a.b.b.k.i0
    public final void d(@androidx.annotation.h0 m<TResult> mVar) {
        this.f1926a.execute(new w(this, mVar));
    }

    @Override // c.a.b.b.k.g
    public final void e(@androidx.annotation.h0 Exception exc) {
        this.f1928c.y(exc);
    }
}
