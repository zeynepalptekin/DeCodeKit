package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class em1 extends xj {
    private final ql1 e;
    private final qk1 f;
    private final zm1 g;

    @androidx.annotation.i0
    @GuardedBy("this")
    private qq0 h;

    @GuardedBy("this")
    private boolean i = false;

    public em1(ql1 ql1Var, qk1 qk1Var, zm1 zm1Var) {
        this.e = ql1Var;
        this.f = qk1Var;
        this.g = zm1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean B8() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.qq0 r0 = r1.h     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L10
            com.google.android.gms.internal.ads.qq0 r0 = r1.h     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.h()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L10
            r0 = 1
        Le:
            monitor-exit(r1)
            return r0
        L10:
            r0 = 0
            goto Le
        L12:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.em1.B8():boolean");
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final Bundle A() {
        com.google.android.gms.common.internal.r.f("getAdMetadata can only be called from the UI thread.");
        qq0 qq0Var = this.h;
        return qq0Var != null ? qq0Var.g() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void D() {
        V2(null);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void H0(bk bkVar) throws RemoteException {
        com.google.android.gms.common.internal.r.f("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f.k(bkVar);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final boolean L1() {
        qq0 qq0Var = this.h;
        return qq0Var != null && qq0Var.l();
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final synchronized void N7(c.a.b.b.e.c cVar) {
        com.google.android.gms.common.internal.r.f("destroy must be called on the main UI thread.");
        Context context = null;
        this.f.e(null);
        if (this.h != null) {
            if (cVar != null) {
                context = (Context) c.a.b.b.e.e.e2(cVar);
            }
            this.h.c().K0(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void S0(oy2 oy2Var) {
        com.google.android.gms.common.internal.r.f("setAdMetadataListener can only be called from the UI thread.");
        if (oy2Var == null) {
            this.f.e(null);
        } else {
            this.f.e(new gm1(this, oy2Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final synchronized void T(boolean z) {
        com.google.android.gms.common.internal.r.f("setImmersiveMode must be called on the main UI thread.");
        this.i = z;
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final synchronized void V2(c.a.b.b.e.c cVar) {
        com.google.android.gms.common.internal.r.f("resume must be called on the main UI thread.");
        if (this.h != null) {
            this.h.c().J0(cVar == null ? null : (Context) c.a.b.b.e.e.e2(cVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final boolean W() throws RemoteException {
        com.google.android.gms.common.internal.r.f("isLoaded must be called on the main UI thread.");
        return B8();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    @Override // com.google.android.gms.internal.ads.yj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void X3(@androidx.annotation.i0 c.a.b.b.e.c r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "showAd must be called on the main UI thread."
            com.google.android.gms.common.internal.r.f(r0)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.qq0 r0 = r2.h     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Lc
            monitor-exit(r2)
            return
        Lc:
            if (r3 == 0) goto L19
            java.lang.Object r3 = c.a.b.b.e.e.e2(r3)     // Catch: java.lang.Throwable -> L23
            boolean r0 = r3 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L19
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Throwable -> L23
            goto L1a
        L19:
            r3 = 0
        L1a:
            com.google.android.gms.internal.ads.qq0 r0 = r2.h     // Catch: java.lang.Throwable -> L23
            boolean r1 = r2.i     // Catch: java.lang.Throwable -> L23
            r0.j(r1, r3)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            return
        L23:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.em1.X3(c.a.b.b.e.c):void");
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void destroy() throws RemoteException {
        N7(null);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final synchronized String e() throws RemoteException {
        if (this.h == null || this.h.d() == null) {
            return null;
        }
        return this.h.d().e();
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void e5(wj wjVar) {
        com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f.j(wjVar);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final synchronized void m0(String str) throws RemoteException {
        com.google.android.gms.common.internal.r.f("setUserId must be called on the main UI thread.");
        this.g.f6290a = str;
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final synchronized tz2 o() throws RemoteException {
        if (!((Boolean) qx2.e().c(e0.T4)).booleanValue()) {
            return null;
        }
        if (this.h == null) {
            return null;
        }
        return this.h.d();
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void t() {
        w4(null);
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final synchronized void t1(String str) throws RemoteException {
        if (((Boolean) qx2.e().c(e0.v0)).booleanValue()) {
            com.google.android.gms.common.internal.r.f("#008 Must be called on the main UI thread.: setCustomData");
            this.g.f6291b = str;
        }
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final synchronized void w4(c.a.b.b.e.c cVar) {
        com.google.android.gms.common.internal.r.f("pause must be called on the main UI thread.");
        if (this.h != null) {
            this.h.c().I0(cVar == null ? null : (Context) c.a.b.b.e.e.e2(cVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final synchronized void w5(hk hkVar) throws RemoteException {
        com.google.android.gms.common.internal.r.f("loadAd must be called on the main UI thread.");
        if (g0.a(hkVar.e)) {
            return;
        }
        if (B8()) {
            if (!((Boolean) qx2.e().c(e0.D3)).booleanValue()) {
                return;
            }
        }
        ml1 ml1Var = new ml1(null);
        this.h = null;
        this.e.h(sm1.f5280a);
        this.e.Z(hkVar.d, hkVar.e, ml1Var, new dm1(this));
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final void x4(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.yj
    public final synchronized void y() throws RemoteException {
        X3(null);
    }
}
