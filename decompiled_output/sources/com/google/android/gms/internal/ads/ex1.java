package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.tw1;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class ex1<V> extends tw1<Object, V> {
    private gx1<?> s;

    ex1(iv1<? extends dy1<?>> iv1Var, boolean z, Executor executor, Callable<V> callable) {
        super(iv1Var, z, false);
        this.s = new hx1(this, callable, executor);
        P();
    }

    static /* synthetic */ gx1 V(ex1 ex1Var, gx1 gx1Var) {
        ex1Var.s = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tw1
    final void M(tw1.a aVar) {
        super.M(aVar);
        if (aVar == tw1.a.OUTPUT_FUTURE_DONE) {
            this.s = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.tw1
    final void Q() {
        gx1<?> gx1Var = this.s;
        if (gx1Var != null) {
            gx1Var.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.tw1
    final void R(int r1, @NullableDecl Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.pw1
    protected final void f() {
        gx1<?> gx1Var = this.s;
        if (gx1Var != null) {
            gx1Var.a();
        }
    }
}
