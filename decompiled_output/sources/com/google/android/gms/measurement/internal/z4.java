package com.google.android.gms.measurement.internal;

import c.a.b.b.g.c.mb;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
final class z4<V> extends FutureTask<V> implements Comparable<z4<V>> {
    private final long d;
    final boolean e;
    private final String f;
    private final /* synthetic */ u4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z4(u4 u4Var, Runnable runnable, boolean z, String str) {
        super(mb.a().b(runnable), null);
        this.g = u4Var;
        com.google.android.gms.common.internal.r.k(str);
        long andIncrement = u4.l.getAndIncrement();
        this.d = andIncrement;
        this.f = str;
        this.e = z;
        if (andIncrement == Long.MAX_VALUE) {
            u4Var.B().E().a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z4(u4 u4Var, Callable<V> callable, boolean z, String str) {
        super(mb.a().a(callable));
        this.g = u4Var;
        com.google.android.gms.common.internal.r.k(str);
        long andIncrement = u4.l.getAndIncrement();
        this.d = andIncrement;
        this.f = str;
        this.e = z;
        if (andIncrement == Long.MAX_VALUE) {
            u4Var.B().E().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(@androidx.annotation.h0 Object obj) {
        z4 z4Var = (z4) obj;
        boolean z = this.e;
        if (z != z4Var.e) {
            return z ? -1 : 1;
        }
        long j = this.d;
        long j2 = z4Var.d;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.g.B().G().b("Two tasks share the same index. index", Long.valueOf(this.d));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.g.B().E().b(this.f, th);
        if (th instanceof x4) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
