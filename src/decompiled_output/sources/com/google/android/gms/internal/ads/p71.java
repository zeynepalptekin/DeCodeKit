package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class p71 implements zv2 {

    @GuardedBy("this")
    private sx2 d;

    public final synchronized void a(sx2 sx2Var) {
        this.d = sx2Var;
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
}
