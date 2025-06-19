package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* loaded from: classes.dex */
final class ow1<V, X extends Throwable> extends lw1<V, X, ax1<? super X, ? extends V>, dy1<? extends V>> {
    ow1(dy1<? extends V> dy1Var, Class<X> cls, ax1<? super X, ? extends V> ax1Var) {
        super(dy1Var, cls, ax1Var);
    }

    @Override // com.google.android.gms.internal.ads.lw1
    final /* synthetic */ void I(Object obj) {
        k((dy1) obj);
    }

    @Override // com.google.android.gms.internal.ads.lw1
    final /* synthetic */ Object K(Object obj, Throwable th) throws Exception {
        ax1 ax1Var = (ax1) obj;
        dy1 dy1VarA = ax1Var.a(th);
        bv1.d(dy1VarA, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ax1Var);
        return dy1VarA;
    }
}
