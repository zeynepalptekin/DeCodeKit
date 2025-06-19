package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vx1<V> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5746a;

    /* renamed from: b, reason: collision with root package name */
    private final nv1<dy1<? extends V>> f5747b;

    private vx1(boolean z, nv1<dy1<? extends V>> nv1Var) {
        this.f5746a = z;
        this.f5747b = nv1Var;
    }

    /* synthetic */ vx1(boolean z, nv1 nv1Var, tx1 tx1Var) {
        this(z, nv1Var);
    }

    public final <C> dy1<C> a(Callable<C> callable, Executor executor) {
        return new ex1(this.f5747b, this.f5746a, executor, callable);
    }
}
