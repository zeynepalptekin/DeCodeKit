package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class o8 implements Runnable {
    private final /* synthetic */ boolean d = true;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ va f;
    private final /* synthetic */ ma g;
    private final /* synthetic */ va h;
    private final /* synthetic */ x7 i;

    o8(x7 x7Var, boolean z, boolean z2, va vaVar, ma maVar, va vaVar2) {
        this.i = x7Var;
        this.e = z2;
        this.f = vaVar;
        this.g = maVar;
        this.h = vaVar2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        o3 o3Var = this.i.d;
        if (o3Var == null) {
            this.i.B().E().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.d) {
            this.i.L(o3Var, this.e ? null : this.f, this.g);
        } else {
            try {
                if (TextUtils.isEmpty(this.h.d)) {
                    o3Var.N1(this.f, this.g);
                } else {
                    o3Var.U2(this.f);
                }
            } catch (RemoteException e) {
                this.i.B().E().b("Failed to send conditional user property to the service", e);
            }
        }
        this.i.f0();
    }
}
