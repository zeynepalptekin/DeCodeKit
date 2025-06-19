package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class nq1<E> {
    private static final dy1<?> d = qx1.g(null);

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f4589a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f4590b;

    /* renamed from: c, reason: collision with root package name */
    private final ar1<E> f4591c;

    public nq1(cy1 cy1Var, ScheduledExecutorService scheduledExecutorService, ar1<E> ar1Var) {
        this.f4589a = cy1Var;
        this.f4590b = scheduledExecutorService;
        this.f4591c = ar1Var;
    }

    public final pq1 a(E e, dy1<?>... dy1VarArr) {
        return new pq1(this, e, Arrays.asList(dy1VarArr));
    }

    public final <I> uq1<I> b(E e, dy1<I> dy1Var) {
        return new uq1<>(this, e, dy1Var, Collections.singletonList(dy1Var), dy1Var);
    }

    public final rq1 g(E e) {
        return new rq1(this, e);
    }

    protected abstract String h(E e);
}
