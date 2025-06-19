package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ads.fm0;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@com.google.android.gms.common.util.d0
/* loaded from: classes.dex */
final class hs1 implements d.a, d.b {

    @com.google.android.gms.common.util.d0
    private gt1 d;
    private final String e;
    private final String f;
    private final LinkedBlockingQueue<fm0.a> g;
    private final HandlerThread h;

    public hs1(Context context, String str, String str2) {
        this.e = str;
        this.f = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.h = handlerThread;
        handlerThread.start();
        this.d = new gt1(context, this.h.getLooper(), this, this, 9200000);
        this.g = new LinkedBlockingQueue<>();
        this.d.a();
    }

    private final void d() {
        gt1 gt1Var = this.d;
        if (gt1Var != null) {
            if (gt1Var.D() || this.d.E()) {
                this.d.e();
            }
        }
    }

    private final jt1 e() {
        try {
            return this.d.m0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @com.google.android.gms.common.util.d0
    private static fm0.a f() {
        return (fm0.a) ((l92) fm0.a.v0().k0(32768L).P());
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void a(int r2) throws InterruptedException {
        try {
            this.g.put(f());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.d.b
    public final void b(c.a.b.b.d.c cVar) throws InterruptedException {
        try {
            this.g.put(f());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void c(Bundle bundle) {
        jt1 jt1VarE = e();
        if (jt1VarE != null) {
            try {
                try {
                    this.g.put(jt1VarE.N2(new ft1(this.e, this.f)).h());
                } catch (Throwable unused) {
                    this.g.put(f());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                d();
                this.h.quit();
                throw th;
            }
            d();
            this.h.quit();
        }
    }

    public final fm0.a g(int r4) throws InterruptedException {
        fm0.a aVarPoll;
        try {
            aVarPoll = this.g.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            aVarPoll = null;
        }
        return aVarPoll == null ? f() : aVarPoll;
    }
}
