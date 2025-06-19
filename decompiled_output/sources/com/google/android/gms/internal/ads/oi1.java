package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class oi1 implements com.google.android.gms.ads.internal.overlay.p, cb0, xc0, fk1 {
    private final no1 d;
    private final AtomicReference<ht2> e = new AtomicReference<>();
    private final AtomicReference<mt2> f = new AtomicReference<>();
    private final AtomicReference<qt2> g = new AtomicReference<>();
    private final AtomicReference<xc0> h = new AtomicReference<>();
    private final AtomicReference<com.google.android.gms.ads.internal.overlay.p> i = new AtomicReference<>();
    private oi1 j = null;

    public oi1(no1 no1Var) {
        this.d = no1Var;
    }

    public static oi1 f(oi1 oi1Var) {
        oi1 oi1Var2 = new oi1(oi1Var.d);
        oi1Var2.a(oi1Var);
        return oi1Var2;
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void a(fk1 fk1Var) {
        this.j = (oi1) fk1Var;
    }

    public final void b() {
        oi1 oi1Var = this;
        while (true) {
            oi1 oi1Var2 = oi1Var.j;
            if (oi1Var2 == null) {
                oi1Var.d.a();
                yj1.a(oi1Var.f, si1.f5264a);
                yj1.a(oi1Var.g, vi1.f5683a);
                return;
            }
            oi1Var = oi1Var2;
        }
    }

    @Override // com.google.android.gms.internal.ads.xc0
    public final void b2() {
        oi1 oi1Var = this;
        while (true) {
            oi1 oi1Var2 = oi1Var.j;
            if (oi1Var2 == null) {
                yj1.a(oi1Var.h, ui1.f5524a);
                yj1.a(oi1Var.g, xi1.f5980a);
                return;
            }
            oi1Var = oi1Var2;
        }
    }

    public final void c(com.google.android.gms.ads.internal.overlay.p pVar) {
        this.i.set(pVar);
    }

    public final void d(xc0 xc0Var) {
        this.h.set(xc0Var);
    }

    public final void e(qt2 qt2Var) {
        this.g.set(qt2Var);
    }

    public final void g(final gt2 gt2Var) {
        oi1 oi1Var = this;
        while (true) {
            oi1 oi1Var2 = oi1Var.j;
            if (oi1Var2 == null) {
                yj1.a(oi1Var.e, new xj1(gt2Var) { // from class: com.google.android.gms.internal.ads.ri1

                    /* renamed from: a, reason: collision with root package name */
                    private final gt2 f5143a;

                    {
                        this.f5143a = gt2Var;
                    }

                    @Override // com.google.android.gms.internal.ads.xj1
                    public final void a(Object obj) throws RemoteException {
                        ((ht2) obj).W3(this.f5143a);
                    }
                });
                return;
            }
            oi1Var = oi1Var2;
        }
    }

    public final void h(ht2 ht2Var) {
        this.e.set(ht2Var);
    }

    @Override // com.google.android.gms.internal.ads.cb0
    public final void i(final dw2 dw2Var) {
        oi1 oi1Var = this;
        while (true) {
            oi1 oi1Var2 = oi1Var.j;
            if (oi1Var2 == null) {
                yj1.a(oi1Var.e, new xj1(dw2Var) { // from class: com.google.android.gms.internal.ads.qi1

                    /* renamed from: a, reason: collision with root package name */
                    private final dw2 f5017a;

                    {
                        this.f5017a = dw2Var;
                    }

                    @Override // com.google.android.gms.internal.ads.xj1
                    public final void a(Object obj) throws RemoteException {
                        ((ht2) obj).Q2(this.f5017a);
                    }
                });
                yj1.a(oi1Var.e, new xj1(dw2Var) { // from class: com.google.android.gms.internal.ads.ti1

                    /* renamed from: a, reason: collision with root package name */
                    private final dw2 f5406a;

                    {
                        this.f5406a = dw2Var;
                    }

                    @Override // com.google.android.gms.internal.ads.xj1
                    public final void a(Object obj) throws RemoteException {
                        ((ht2) obj).o3(this.f5406a.d);
                    }
                });
                return;
            }
            oi1Var = oi1Var2;
        }
    }

    public final void j(mt2 mt2Var) {
        this.f.set(mt2Var);
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void q4() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void r6() {
        oi1 oi1Var = this;
        while (true) {
            oi1 oi1Var2 = oi1Var.j;
            if (oi1Var2 == null) {
                yj1.a(oi1Var.i, wi1.f5838a);
                return;
            }
            oi1Var = oi1Var2;
        }
    }
}
