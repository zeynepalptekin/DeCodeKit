package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class p8 implements Runnable {
    private final /* synthetic */ boolean d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ s f;
    private final /* synthetic */ ma g;
    private final /* synthetic */ String h;
    private final /* synthetic */ x7 i;

    p8(x7 x7Var, boolean z, boolean z2, s sVar, ma maVar, String str) {
        this.i = x7Var;
        this.d = z;
        this.e = z2;
        this.f = sVar;
        this.g = maVar;
        this.h = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        o3 o3Var = this.i.d;
        if (o3Var == null) {
            this.i.B().E().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.d) {
            this.i.L(o3Var, this.e ? null : this.f, this.g);
        } else {
            try {
                if (TextUtils.isEmpty(this.h)) {
                    o3Var.a4(this.f, this.g);
                } else {
                    o3Var.F7(this.f, this.h, this.i.B().O());
                }
            } catch (RemoteException e) {
                this.i.B().E().b("Failed to send event to the service", e);
            }
        }
        this.i.f0();
    }
}
