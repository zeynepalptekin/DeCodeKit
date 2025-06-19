package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class h8 implements Runnable {
    private final /* synthetic */ Bundle d;
    private final /* synthetic */ ma e;
    private final /* synthetic */ x7 f;

    h8(x7 x7Var, Bundle bundle, ma maVar) {
        this.f = x7Var;
        this.d = bundle;
        this.e = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o3 o3Var = this.f.d;
        if (o3Var == null) {
            this.f.B().E().a("Failed to send default event parameters to service");
            return;
        }
        try {
            o3Var.Y5(this.d, this.e);
        } catch (RemoteException e) {
            this.f.B().E().b("Failed to send default event parameters to service", e);
        }
    }
}
