package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class nx0 extends lx0 {
    public nx0(Context context) {
        this.i = new di(context, com.google.android.gms.ads.internal.p.q().b(), this, this);
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void c(Bundle bundle) {
        ks<InputStream> ksVar;
        dy0 dy0Var;
        synchronized (this.e) {
            if (!this.g) {
                this.g = true;
                try {
                    this.i.m0().v6(this.h, new ox0(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    ksVar = this.d;
                    dy0Var = new dy0(xn1.INTERNAL_ERROR);
                    ksVar.b(dy0Var);
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.p.g().e(th, "RemoteSignalsClientTask.onConnected");
                    ksVar = this.d;
                    dy0Var = new dy0(xn1.INTERNAL_ERROR);
                    ksVar.b(dy0Var);
                }
            }
        }
    }

    public final dy1<InputStream> e(wi wiVar) {
        synchronized (this.e) {
            if (this.f) {
                return this.d;
            }
            this.f = true;
            this.h = wiVar;
            this.i.a();
            this.d.e(new Runnable(this) { // from class: com.google.android.gms.internal.ads.rx0
                private final nx0 d;

                {
                    this.d = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d();
                }
            }, cs.f);
            return this.d;
        }
    }
}
