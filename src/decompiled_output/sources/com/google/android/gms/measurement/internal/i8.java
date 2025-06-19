package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class i8 implements Runnable {
    private final /* synthetic */ p7 d;
    private final /* synthetic */ x7 e;

    i8(x7 x7Var, p7 p7Var) {
        this.e = x7Var;
        this.d = p7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        String str;
        String str2;
        String packageName;
        o3 o3Var = this.e.d;
        if (o3Var == null) {
            this.e.B().E().a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.d == null) {
                j = 0;
                str = null;
                str2 = null;
                packageName = this.e.F().getPackageName();
            } else {
                j = this.d.f6488c;
                str = this.d.f6486a;
                str2 = this.d.f6487b;
                packageName = this.e.F().getPackageName();
            }
            o3Var.m7(j, str, str2, packageName);
            this.e.f0();
        } catch (RemoteException e) {
            this.e.B().E().b("Failed to send current screen to the service", e);
        }
    }
}
