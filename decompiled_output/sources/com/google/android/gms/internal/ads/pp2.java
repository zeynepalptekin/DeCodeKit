package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class pp2 {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f4864a;

    /* renamed from: b, reason: collision with root package name */
    private rp2<? extends up2> f4865b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f4866c;

    public pp2(String str) {
        this.f4864a = nq2.i(str);
    }

    public final boolean a() {
        return this.f4865b != null;
    }

    public final <T extends up2> long b(T t, sp2<T> sp2Var, int r14) {
        Looper looperMyLooper = Looper.myLooper();
        vp2.e(looperMyLooper != null);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new rp2(this, looperMyLooper, t, sp2Var, r14, jElapsedRealtime).d(0L);
        return jElapsedRealtime;
    }

    public final void f(Runnable runnable) {
        rp2<? extends up2> rp2Var = this.f4865b;
        if (rp2Var != null) {
            rp2Var.e(true);
        }
        this.f4864a.execute(runnable);
        this.f4864a.shutdown();
    }

    public final void h(int r2) throws IOException {
        IOException iOException = this.f4866c;
        if (iOException != null) {
            throw iOException;
        }
        rp2<? extends up2> rp2Var = this.f4865b;
        if (rp2Var != null) {
            rp2Var.c(rp2Var.f);
        }
    }

    public final void i() {
        this.f4865b.e(false);
    }
}
