package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class pq1 {

    /* renamed from: a, reason: collision with root package name */
    private final E f4867a;

    /* renamed from: b, reason: collision with root package name */
    private final List<dy1<?>> f4868b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ nq1 f4869c;

    private pq1(nq1 nq1Var, E e, List<dy1<?>> list) {
        this.f4869c = nq1Var;
        this.f4867a = e;
        this.f4868b = list;
    }

    public final <O> uq1<O> a(Callable<O> callable) {
        vx1 vx1VarO = qx1.o(this.f4868b);
        dy1 dy1VarA = vx1VarO.a(oq1.f4727a, cs.f);
        nq1 nq1Var = this.f4869c;
        return new uq1<>(nq1Var, this.f4867a, dy1VarA, this.f4868b, vx1VarO.a(callable, nq1Var.f4589a));
    }
}
