package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.d;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class wt2 {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f5891a = new vt2(this);

    /* renamed from: b, reason: collision with root package name */
    private final Object f5892b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    @GuardedBy("lock")
    private cu2 f5893c;

    @androidx.annotation.i0
    @GuardedBy("lock")
    private Context d;

    @androidx.annotation.i0
    @GuardedBy("lock")
    private gu2 e;

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        synchronized (this.f5892b) {
            if (this.d != null && this.f5893c == null) {
                cu2 cu2VarE = e(new xt2(this), new bu2(this));
                this.f5893c = cu2VarE;
                cu2VarE.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        synchronized (this.f5892b) {
            if (this.f5893c == null) {
                return;
            }
            if (this.f5893c.D() || this.f5893c.E()) {
                this.f5893c.e();
            }
            this.f5893c = null;
            this.e = null;
            Binder.flushPendingCommands();
        }
    }

    @com.google.android.gms.common.util.d0
    private final synchronized cu2 e(d.a aVar, d.b bVar) {
        return new cu2(this.d, com.google.android.gms.ads.internal.p.q().b(), aVar, bVar);
    }

    static /* synthetic */ cu2 f(wt2 wt2Var, cu2 cu2Var) {
        wt2Var.f5893c = null;
        return null;
    }

    public final void c(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f5892b) {
            if (this.d != null) {
                return;
            }
            this.d = context.getApplicationContext();
            if (((Boolean) qx2.e().c(e0.H2)).booleanValue()) {
                a();
            } else {
                if (((Boolean) qx2.e().c(e0.G2)).booleanValue()) {
                    com.google.android.gms.ads.internal.p.f().d(new yt2(this));
                }
            }
        }
    }

    public final zt2 d(fu2 fu2Var) {
        synchronized (this.f5892b) {
            if (this.e == null) {
                return new zt2();
            }
            try {
                return this.e.A5(fu2Var);
            } catch (RemoteException e) {
                tr.c("Unable to call into cache service.", e);
                return new zt2();
            }
        }
    }

    public final void l() {
        if (((Boolean) qx2.e().c(e0.I2)).booleanValue()) {
            synchronized (this.f5892b) {
                a();
                com.google.android.gms.ads.internal.p.c();
                to.h.removeCallbacks(this.f5891a);
                com.google.android.gms.ads.internal.p.c();
                to.h.postDelayed(this.f5891a, ((Long) qx2.e().c(e0.J2)).longValue());
            }
        }
    }
}
