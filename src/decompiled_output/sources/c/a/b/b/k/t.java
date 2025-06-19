package c.a.b.b.k;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class t<TResult, TContinuationResult> implements i0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1923a;

    /* renamed from: b, reason: collision with root package name */
    private final c<TResult, TContinuationResult> f1924b;

    /* renamed from: c, reason: collision with root package name */
    private final l0<TContinuationResult> f1925c;

    public t(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 c<TResult, TContinuationResult> cVar, @androidx.annotation.h0 l0<TContinuationResult> l0Var) {
        this.f1923a = executor;
        this.f1924b = cVar;
        this.f1925c = l0Var;
    }

    @Override // c.a.b.b.k.i0
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // c.a.b.b.k.i0
    public final void d(@androidx.annotation.h0 m<TResult> mVar) {
        this.f1923a.execute(new v(this, mVar));
    }
}
