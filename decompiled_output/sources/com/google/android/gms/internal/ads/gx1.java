package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
abstract class gx1<T> extends yx1<T> {
    private final Executor g;
    boolean h = true;
    private final /* synthetic */ ex1 i;

    gx1(ex1 ex1Var, Executor executor) {
        this.i = ex1Var;
        this.g = (Executor) bv1.b(executor);
    }

    @Override // com.google.android.gms.internal.ads.yx1
    final boolean b() {
        return this.i.isDone();
    }

    @Override // com.google.android.gms.internal.ads.yx1
    final void e(T t, Throwable th) {
        ex1.V(this.i, null);
        if (th == null) {
            g(t);
            return;
        }
        if (th instanceof ExecutionException) {
            this.i.j(th.getCause());
        } else if (th instanceof CancellationException) {
            this.i.cancel(false);
        } else {
            this.i.j(th);
        }
    }

    final void f() {
        try {
            this.g.execute(this);
        } catch (RejectedExecutionException e) {
            if (this.h) {
                this.i.j(e);
            }
        }
    }

    abstract void g(T t);
}
