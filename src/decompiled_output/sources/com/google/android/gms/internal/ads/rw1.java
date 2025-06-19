package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class rw1<I, O> extends sw1<I, O, ax1<? super I, ? extends O>, dy1<? extends O>> {
    rw1(dy1<? extends I> dy1Var, ax1<? super I, ? extends O> ax1Var) {
        super(dy1Var, ax1Var);
    }

    @Override // com.google.android.gms.internal.ads.sw1
    final /* synthetic */ void I(Object obj) {
        k((dy1) obj);
    }

    @Override // com.google.android.gms.internal.ads.sw1
    final /* synthetic */ Object L(Object obj, @NullableDecl Object obj2) throws Exception {
        ax1 ax1Var = (ax1) obj;
        dy1<O> dy1VarA = ax1Var.a(obj2);
        bv1.d(dy1VarA, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ax1Var);
        return dy1VarA;
    }
}
