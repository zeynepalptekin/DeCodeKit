package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class pn1<T> {

    /* renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    private final Deque<dy1<T>> f4843a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    private final Callable<T> f4844b;

    /* renamed from: c, reason: collision with root package name */
    private final cy1 f4845c;

    public pn1(Callable<T> callable, cy1 cy1Var) {
        this.f4844b = callable;
        this.f4845c = cy1Var;
    }

    public final synchronized dy1<T> a() {
        c(1);
        return this.f4843a.poll();
    }

    public final synchronized void b(dy1<T> dy1Var) {
        this.f4843a.addFirst(dy1Var);
    }

    public final synchronized void c(int r5) {
        int size = r5 - this.f4843a.size();
        for (int r0 = 0; r0 < size; r0++) {
            this.f4843a.add(this.f4845c.e(this.f4844b));
        }
    }
}
