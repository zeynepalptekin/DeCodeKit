package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class rq1 {

    /* renamed from: a, reason: collision with root package name */
    private final E f5176a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ nq1 f5177b;

    private rq1(nq1 nq1Var, E e) {
        this.f5177b = nq1Var;
        this.f5176a = e;
    }

    private final <O> uq1<O> b(Callable<O> callable, cy1 cy1Var) {
        return new uq1<>(this.f5177b, this.f5176a, nq1.d, Collections.emptyList(), cy1Var.submit(callable));
    }

    public final uq1<?> a(final lq1 lq1Var, cy1 cy1Var) {
        return b(new Callable(lq1Var) { // from class: com.google.android.gms.internal.ads.qq1

            /* renamed from: a, reason: collision with root package name */
            private final lq1 f5050a;

            {
                this.f5050a = lq1Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f5050a.run();
                return null;
            }
        }, cy1Var);
    }

    public final <O> uq1<O> c(Callable<O> callable) {
        return b(callable, this.f5177b.f4589a);
    }

    public final <O> uq1<O> d(dy1<O> dy1Var) {
        return new uq1<>(this.f5177b, this.f5176a, nq1.d, Collections.emptyList(), dy1Var);
    }
}
