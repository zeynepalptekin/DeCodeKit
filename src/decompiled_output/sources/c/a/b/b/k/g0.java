package c.a.b.b.k;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class g0<TResult, TContinuationResult> implements e, g, h<TContinuationResult>, i0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1898a;

    /* renamed from: b, reason: collision with root package name */
    private final l<TResult, TContinuationResult> f1899b;

    /* renamed from: c, reason: collision with root package name */
    private final l0<TContinuationResult> f1900c;

    public g0(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 l<TResult, TContinuationResult> lVar, @androidx.annotation.h0 l0<TContinuationResult> l0Var) {
        this.f1898a = executor;
        this.f1899b = lVar;
        this.f1900c = l0Var;
    }

    @Override // c.a.b.b.k.i0
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // c.a.b.b.k.h
    public final void b(TContinuationResult tcontinuationresult) {
        this.f1900c.z(tcontinuationresult);
    }

    @Override // c.a.b.b.k.e
    public final void c() {
        this.f1900c.A();
    }

    @Override // c.a.b.b.k.i0
    public final void d(@androidx.annotation.h0 m<TResult> mVar) {
        this.f1898a.execute(new f0(this, mVar));
    }

    @Override // c.a.b.b.k.g
    public final void e(@androidx.annotation.h0 Exception exc) {
        this.f1900c.y(exc);
    }
}
