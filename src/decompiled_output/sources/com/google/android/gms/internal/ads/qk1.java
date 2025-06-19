package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class qk1 extends com.google.android.gms.ads.k0.a implements bb0, cb0, pb0, nc0, hd0, fk1 {
    private final no1 d;
    private final AtomicReference<com.google.android.gms.ads.k0.a> e = new AtomicReference<>();
    private final AtomicReference<cl> f = new AtomicReference<>();
    private final AtomicReference<zk> g = new AtomicReference<>();
    private final AtomicReference<bk> h = new AtomicReference<>();
    private final AtomicReference<hl> i = new AtomicReference<>();
    private final AtomicReference<wj> j = new AtomicReference<>();
    private final AtomicReference<oz2> k = new AtomicReference<>();
    private qk1 l = null;

    public qk1(no1 no1Var) {
        this.d = no1Var;
    }

    public static qk1 g(qk1 qk1Var) {
        qk1 qk1Var2 = new qk1(qk1Var.d);
        qk1Var2.a(qk1Var);
        return qk1Var2;
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void a(fk1 fk1Var) {
        this.l = (qk1) fk1Var;
    }

    @Override // com.google.android.gms.internal.ads.hd0
    public final void b(@androidx.annotation.h0 final sw2 sw2Var) {
        qk1 qk1Var = this;
        while (true) {
            qk1 qk1Var2 = qk1Var.l;
            if (qk1Var2 == null) {
                yj1.a(qk1Var.k, new xj1(sw2Var) { // from class: com.google.android.gms.internal.ads.cl1

                    /* renamed from: a, reason: collision with root package name */
                    private final sw2 f2989a;

                    {
                        this.f2989a = sw2Var;
                    }

                    @Override // com.google.android.gms.internal.ads.xj1
                    public final void a(Object obj) throws RemoteException {
                        ((oz2) obj).m6(this.f2989a);
                    }
                });
                return;
            }
            qk1Var = qk1Var2;
        }
    }

    @Override // com.google.android.gms.ads.k0.a
    public final void c() {
        qk1 qk1Var = this.l;
        if (qk1Var != null) {
            qk1Var.c();
        } else {
            yj1.a(this.e, dl1.f3133a);
        }
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final void d(final dw2 dw2Var) {
        qk1 qk1Var = this;
        while (true) {
            qk1 qk1Var2 = qk1Var.l;
            if (qk1Var2 == null) {
                yj1.a(qk1Var.g, new xj1(dw2Var) { // from class: com.google.android.gms.internal.ads.bl1

                    /* renamed from: a, reason: collision with root package name */
                    private final dw2 f2845a;

                    {
                        this.f2845a = dw2Var;
                    }

                    @Override // com.google.android.gms.internal.ads.xj1
                    public final void a(Object obj) throws RemoteException {
                        ((zk) obj).J3(this.f2845a);
                    }
                });
                yj1.a(qk1Var.g, new xj1(dw2Var) { // from class: com.google.android.gms.internal.ads.al1

                    /* renamed from: a, reason: collision with root package name */
                    private final dw2 f2705a;

                    {
                        this.f2705a = dw2Var;
                    }

                    @Override // com.google.android.gms.internal.ads.xj1
                    public final void a(Object obj) throws RemoteException {
                        ((zk) obj).X6(this.f2705a.d);
                    }
                });
                return;
            }
            qk1Var = qk1Var2;
        }
    }

    public final void e(com.google.android.gms.ads.k0.a aVar) {
        this.e.set(aVar);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void f(final qj qjVar, final String str, final String str2) {
        qk1 qk1Var = this;
        while (true) {
            qk1 qk1Var2 = qk1Var.l;
            if (qk1Var2 == null) {
                yj1.a(qk1Var.g, new xj1(qjVar) { // from class: com.google.android.gms.internal.ads.uk1

                    /* renamed from: a, reason: collision with root package name */
                    private final qj f5538a;

                    {
                        this.f5538a = qjVar;
                    }

                    @Override // com.google.android.gms.internal.ads.xj1
                    public final void a(Object obj) throws RemoteException {
                        qj qjVar2 = this.f5538a;
                        ((zk) obj).J0(new ql(qjVar2.q(), qjVar2.R()));
                    }
                });
                yj1.a(qk1Var.i, new xj1(qjVar, str, str2) { // from class: com.google.android.gms.internal.ads.xk1

                    /* renamed from: a, reason: collision with root package name */
                    private final qj f5989a;

                    /* renamed from: b, reason: collision with root package name */
                    private final String f5990b;

                    /* renamed from: c, reason: collision with root package name */
                    private final String f5991c;

                    {
                        this.f5989a = qjVar;
                        this.f5990b = str;
                        this.f5991c = str2;
                    }

                    @Override // com.google.android.gms.internal.ads.xj1
                    public final void a(Object obj) throws RemoteException {
                        qj qjVar2 = this.f5989a;
                        ((hl) obj).Y6(new ql(qjVar2.q(), qjVar2.R()), this.f5990b, this.f5991c);
                    }
                });
                yj1.a(qk1Var.h, new xj1(qjVar) { // from class: com.google.android.gms.internal.ads.wk1

                    /* renamed from: a, reason: collision with root package name */
                    private final qj f5846a;

                    {
                        this.f5846a = qjVar;
                    }

                    @Override // com.google.android.gms.internal.ads.xj1
                    public final void a(Object obj) throws RemoteException {
                        ((bk) obj).S5(this.f5846a);
                    }
                });
                yj1.a(qk1Var.j, new xj1(qjVar, str, str2) { // from class: com.google.android.gms.internal.ads.zk1

                    /* renamed from: a, reason: collision with root package name */
                    private final qj f6277a;

                    /* renamed from: b, reason: collision with root package name */
                    private final String f6278b;

                    /* renamed from: c, reason: collision with root package name */
                    private final String f6279c;

                    {
                        this.f6277a = qjVar;
                        this.f6278b = str;
                        this.f6279c = str2;
                    }

                    @Override // com.google.android.gms.internal.ads.xj1
                    public final void a(Object obj) throws RemoteException {
                        ((wj) obj).W7(this.f6277a, this.f6278b, this.f6279c);
                    }
                });
                return;
            }
            qk1Var = qk1Var2;
        }
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void h() {
        qk1 qk1Var = this;
        while (true) {
            qk1 qk1Var2 = qk1Var.l;
            if (qk1Var2 == null) {
                yj1.a(qk1Var.h, kl1.f4104a);
                return;
            }
            qk1Var = qk1Var2;
        }
    }

    @Override // com.google.android.gms.internal.ads.cb0
    public final void i(final dw2 dw2Var) {
        qk1 qk1Var = this;
        while (true) {
            qk1 qk1Var2 = qk1Var.l;
            if (qk1Var2 == null) {
                final int r1 = dw2Var.d;
                yj1.a(qk1Var.f, new xj1(dw2Var) { // from class: com.google.android.gms.internal.ads.fl1

                    /* renamed from: a, reason: collision with root package name */
                    private final dw2 f3416a;

                    {
                        this.f3416a = dw2Var;
                    }

                    @Override // com.google.android.gms.internal.ads.xj1
                    public final void a(Object obj) throws RemoteException {
                        ((cl) obj).P1(this.f3416a);
                    }
                });
                yj1.a(qk1Var.f, new xj1(r1) { // from class: com.google.android.gms.internal.ads.el1

                    /* renamed from: a, reason: collision with root package name */
                    private final int f3288a;

                    {
                        this.f3288a = r1;
                    }

                    @Override // com.google.android.gms.internal.ads.xj1
                    public final void a(Object obj) throws RemoteException {
                        ((cl) obj).P3(this.f3288a);
                    }
                });
                yj1.a(qk1Var.h, new xj1(r1) { // from class: com.google.android.gms.internal.ads.hl1

                    /* renamed from: a, reason: collision with root package name */
                    private final int f3686a;

                    {
                        this.f3686a = r1;
                    }

                    @Override // com.google.android.gms.internal.ads.xj1
                    public final void a(Object obj) throws RemoteException {
                        ((bk) obj).a1(this.f3686a);
                    }
                });
                return;
            }
            qk1Var = qk1Var2;
        }
    }

    @Deprecated
    public final void j(wj wjVar) {
        this.j.set(wjVar);
    }

    @Deprecated
    public final void k(bk bkVar) {
        this.h.set(bkVar);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void k0() {
        qk1 qk1Var = this;
        while (true) {
            qk1 qk1Var2 = qk1Var.l;
            if (qk1Var2 == null) {
                yj1.a(qk1Var.h, vk1.f5697a);
                return;
            }
            qk1Var = qk1Var2;
        }
    }

    public final void l(zk zkVar) {
        this.g.set(zkVar);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void l0() {
        qk1 qk1Var = this;
        while (true) {
            qk1 qk1Var2 = qk1Var.l;
            if (qk1Var2 == null) {
                yj1.a(qk1Var.h, yk1.f6147a);
                return;
            }
            qk1Var = qk1Var2;
        }
    }

    public final void m(cl clVar) {
        this.f.set(clVar);
    }

    public final void n(hl hlVar) {
        this.i.set(hlVar);
    }

    public final void o(oz2 oz2Var) {
        this.k.set(oz2Var);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void r() {
        qk1 qk1Var = this;
        while (true) {
            qk1 qk1Var2 = qk1Var.l;
            if (qk1Var2 == null) {
                qk1Var.d.a();
                yj1.a(qk1Var.g, il1.f3834a);
                yj1.a(qk1Var.h, ll1.f4267a);
                return;
            }
            qk1Var = qk1Var2;
        }
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final void s() {
        qk1 qk1Var = this;
        while (true) {
            qk1 qk1Var2 = qk1Var.l;
            if (qk1Var2 == null) {
                yj1.a(qk1Var.g, gl1.f3554a);
                yj1.a(qk1Var.h, jl1.f3990a);
                return;
            }
            qk1Var = qk1Var2;
        }
    }

    @Override // com.google.android.gms.internal.ads.nc0
    public final void u() {
        qk1 qk1Var = this;
        while (true) {
            qk1 qk1Var2 = qk1Var.l;
            if (qk1Var2 == null) {
                yj1.a(qk1Var.f, tk1.f5415a);
                yj1.a(qk1Var.h, sk1.f5272a);
                return;
            }
            qk1Var = qk1Var2;
        }
    }
}
