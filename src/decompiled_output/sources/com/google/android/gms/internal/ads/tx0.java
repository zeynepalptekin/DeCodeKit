package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class tx0 extends lx0 {
    private String j;
    private int k = ux0.f5607a;

    public tx0(Context context) {
        this.i = new di(context, com.google.android.gms.ads.internal.p.q().b(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.lx0, com.google.android.gms.common.internal.d.b
    public final void b(@androidx.annotation.h0 c.a.b.b.d.c cVar) {
        tr.f("Cannot connect to remote service, fallback to local instance.");
        this.d.b(new dy0(xn1.INTERNAL_ERROR));
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void c(@androidx.annotation.i0 Bundle bundle) {
        ks<InputStream> ksVar;
        dy0 dy0Var;
        synchronized (this.e) {
            if (!this.g) {
                this.g = true;
                try {
                    if (this.k == ux0.f5608b) {
                        this.i.m0().Z7(this.h, new ox0(this));
                    } else if (this.k == ux0.f5609c) {
                        this.i.m0().r4(this.j, new ox0(this));
                    } else {
                        this.d.b(new dy0(xn1.INTERNAL_ERROR));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    ksVar = this.d;
                    dy0Var = new dy0(xn1.INTERNAL_ERROR);
                    ksVar.b(dy0Var);
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.p.g().e(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    ksVar = this.d;
                    dy0Var = new dy0(xn1.INTERNAL_ERROR);
                    ksVar.b(dy0Var);
                }
            }
        }
    }

    public final dy1<InputStream> e(String str) {
        synchronized (this.e) {
            if (this.k != ux0.f5607a && this.k != ux0.f5609c) {
                return qx1.a(new dy0(xn1.INVALID_REQUEST));
            }
            if (this.f) {
                return this.d;
            }
            this.k = ux0.f5609c;
            this.f = true;
            this.j = str;
            this.i.a();
            this.d.e(new Runnable(this) { // from class: com.google.android.gms.internal.ads.vx0
                private final tx0 d;

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

    public final dy1<InputStream> f(wi wiVar) {
        synchronized (this.e) {
            if (this.k != ux0.f5607a && this.k != ux0.f5608b) {
                return qx1.a(new dy0(xn1.INVALID_REQUEST));
            }
            if (this.f) {
                return this.d;
            }
            this.k = ux0.f5608b;
            this.f = true;
            this.h = wiVar;
            this.i.a();
            this.d.e(new Runnable(this) { // from class: com.google.android.gms.internal.ads.sx0
                private final tx0 d;

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
