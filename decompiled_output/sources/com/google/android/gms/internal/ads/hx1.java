package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes.dex */
final class hx1<V> extends gx1<V> {
    private final Callable<V> j;
    private final /* synthetic */ ex1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hx1(ex1 ex1Var, Callable<V> callable, Executor executor) {
        super(ex1Var, executor);
        this.k = ex1Var;
        this.j = (Callable) bv1.b(callable);
    }

    @Override // com.google.android.gms.internal.ads.yx1
    final V c() throws Exception {
        this.h = false;
        return this.j.call();
    }

    @Override // com.google.android.gms.internal.ads.yx1
    final String d() {
        return this.j.toString();
    }

    @Override // com.google.android.gms.internal.ads.gx1
    final void g(V v) {
        this.k.i(v);
    }
}
