package c.a.b.b.k;

import android.app.Activity;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class m<TResult> {
    @androidx.annotation.h0
    public m<TResult> a(@androidx.annotation.h0 Activity activity, @androidx.annotation.h0 e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @androidx.annotation.h0
    public m<TResult> b(@androidx.annotation.h0 e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @androidx.annotation.h0
    public m<TResult> c(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @androidx.annotation.h0
    public m<TResult> d(@androidx.annotation.h0 Activity activity, @androidx.annotation.h0 f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @androidx.annotation.h0
    public m<TResult> e(@androidx.annotation.h0 f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @androidx.annotation.h0
    public m<TResult> f(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @androidx.annotation.h0
    public abstract m<TResult> g(@androidx.annotation.h0 Activity activity, @androidx.annotation.h0 g gVar);

    @androidx.annotation.h0
    public abstract m<TResult> h(@androidx.annotation.h0 g gVar);

    @androidx.annotation.h0
    public abstract m<TResult> i(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 g gVar);

    @androidx.annotation.h0
    public abstract m<TResult> j(@androidx.annotation.h0 Activity activity, @androidx.annotation.h0 h<? super TResult> hVar);

    @androidx.annotation.h0
    public abstract m<TResult> k(@androidx.annotation.h0 h<? super TResult> hVar);

    @androidx.annotation.h0
    public abstract m<TResult> l(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 h<? super TResult> hVar);

    @androidx.annotation.h0
    public <TContinuationResult> m<TContinuationResult> m(@androidx.annotation.h0 c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @androidx.annotation.h0
    public <TContinuationResult> m<TContinuationResult> n(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @androidx.annotation.h0
    public <TContinuationResult> m<TContinuationResult> o(@androidx.annotation.h0 c<TResult, m<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @androidx.annotation.h0
    public <TContinuationResult> m<TContinuationResult> p(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 c<TResult, m<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @androidx.annotation.i0
    public abstract Exception q();

    public abstract TResult r();

    public abstract <X extends Throwable> TResult s(@androidx.annotation.h0 Class<X> cls) throws Throwable;

    public abstract boolean t();

    public abstract boolean u();

    public abstract boolean v();

    @androidx.annotation.h0
    public <TContinuationResult> m<TContinuationResult> w(@androidx.annotation.h0 l<TResult, TContinuationResult> lVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @androidx.annotation.h0
    public <TContinuationResult> m<TContinuationResult> x(@androidx.annotation.h0 Executor executor, @androidx.annotation.h0 l<TResult, TContinuationResult> lVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
