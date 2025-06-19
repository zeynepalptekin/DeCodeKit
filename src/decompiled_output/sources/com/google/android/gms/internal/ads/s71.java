package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class s71 implements bb0, cb0, tb0, nc0, zv2 {

    @GuardedBy("this")
    private xx2 d;

    @Override // com.google.android.gms.internal.ads.tb0
    public final synchronized void U() {
        if (this.d != null) {
            try {
                this.d.U();
            } catch (RemoteException e) {
                tr.d("Remote Exception at onAdImpression.", e);
            }
        }
    }

    public final synchronized xx2 a() {
        return this.d;
    }

    public final synchronized void b(xx2 xx2Var) {
        this.d = xx2Var;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void f(qj qjVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized void h() {
        if (this.d != null) {
            try {
                this.d.h();
            } catch (RemoteException e) {
                tr.d("Remote Exception at onAdLeftApplication.", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0015 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.cb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void i(com.google.android.gms.internal.ads.dw2 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.xx2 r0 = r2.d     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L11
            com.google.android.gms.internal.ads.xx2 r0 = r2.d     // Catch: android.os.RemoteException -> Lb java.lang.Throwable -> L26
            r0.q1(r3)     // Catch: android.os.RemoteException -> Lb java.lang.Throwable -> L26
            goto L11
        Lb:
            r0 = move-exception
            java.lang.String r1 = "Remote Exception at onAdFailedToLoadWithAdError."
            com.google.android.gms.internal.ads.tr.d(r1, r0)     // Catch: java.lang.Throwable -> L26
        L11:
            com.google.android.gms.internal.ads.xx2 r0 = r2.d     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.xx2 r0 = r2.d     // Catch: android.os.RemoteException -> L1e java.lang.Throwable -> L26
            int r3 = r3.d     // Catch: android.os.RemoteException -> L1e java.lang.Throwable -> L26
            r0.E(r3)     // Catch: android.os.RemoteException -> L1e java.lang.Throwable -> L26
            monitor-exit(r2)
            return
        L1e:
            r3 = move-exception
            java.lang.String r0 = "Remote Exception at onAdFailedToLoad."
            com.google.android.gms.internal.ads.tr.d(r0, r3)     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r2)
            return
        L26:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s71.i(com.google.android.gms.internal.ads.dw2):void");
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void k0() {
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void l0() {
    }

    @Override // com.google.android.gms.internal.ads.zv2
    public final synchronized void p() {
        if (this.d != null) {
            try {
                this.d.p();
            } catch (RemoteException e) {
                tr.d("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized void r() {
        if (this.d != null) {
            try {
                this.d.r();
            } catch (RemoteException e) {
                tr.d("Remote Exception at onAdClosed.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized void s() {
        if (this.d != null) {
            try {
                this.d.s();
            } catch (RemoteException e) {
                tr.d("Remote Exception at onAdOpened.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nc0
    public final synchronized void u() {
        if (this.d != null) {
            try {
                this.d.u();
            } catch (RemoteException e) {
                tr.d("Remote Exception at onAdLoaded.", e);
            }
        }
    }
}
