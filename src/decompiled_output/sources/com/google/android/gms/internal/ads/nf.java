package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class nf implements com.google.android.gms.ads.mediation.i, com.google.android.gms.ads.mediation.o, com.google.android.gms.ads.mediation.r, com.google.android.gms.ads.mediation.v {

    /* renamed from: a, reason: collision with root package name */
    private wc f4527a;

    nf(wc wcVar) {
        this.f4527a = wcVar;
    }

    @Override // com.google.android.gms.ads.mediation.v
    public final void O0() {
        try {
            this.f4527a.n7();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.o, com.google.android.gms.ads.mediation.v
    public final void a(com.google.android.gms.ads.a aVar) {
        try {
            int r0 = aVar.b();
            String strD = aVar.d();
            String strC = aVar.c();
            StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 86 + String.valueOf(strC).length());
            sb.append("Mediated ad failed to show: Error Code = ");
            sb.append(r0);
            sb.append(". Error Message = ");
            sb.append(strD);
            sb.append(" Error Domain = ");
            sb.append(strC);
            tr.i(sb.toString());
            this.f4527a.q3(aVar.e());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.o, com.google.android.gms.ads.mediation.v
    public final void b(String str) {
        try {
            String strValueOf = String.valueOf(str);
            tr.i(strValueOf.length() != 0 ? "Mediated ad failed to show: ".concat(strValueOf) : new String("Mediated ad failed to show: "));
            this.f4527a.o5(str);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.v
    public final void c(com.google.android.gms.ads.l0.b bVar) {
        try {
            this.f4527a.J0(new ql(bVar));
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.r
    public final void g0() {
    }

    @Override // com.google.android.gms.ads.mediation.i, com.google.android.gms.ads.mediation.o, com.google.android.gms.ads.mediation.r
    public final void h() {
        try {
            this.f4527a.h();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.r
    public final void j0() {
        try {
            this.f4527a.j0();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.r, com.google.android.gms.ads.mediation.v
    public final void k0() {
        try {
            this.f4527a.D1();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.r
    public final void l0() {
    }

    @Override // com.google.android.gms.ads.mediation.r
    public final void m0() {
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void r() {
        try {
            this.f4527a.r();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void s() {
        try {
            this.f4527a.s();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void t() {
        try {
            this.f4527a.U();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void u() {
        try {
            this.f4527a.p();
        } catch (RemoteException unused) {
        }
    }
}
