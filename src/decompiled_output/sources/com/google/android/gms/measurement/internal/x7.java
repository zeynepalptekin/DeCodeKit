package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import c.a.b.b.g.c.pf;
import c.a.b.b.g.c.wb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@com.google.android.gms.common.util.d0
/* loaded from: classes.dex */
public final class x7 extends g5 {

    /* renamed from: c, reason: collision with root package name */
    private final s8 f6559c;
    private o3 d;
    private volatile Boolean e;
    private final k f;
    private final q9 g;
    private final List<Runnable> h;
    private final k i;

    protected x7(b5 b5Var) {
        super(b5Var);
        this.h = new ArrayList();
        this.g = new q9(b5Var.z());
        this.f6559c = new s8(this);
        this.f = new a8(this, b5Var);
        this.i = new l8(this, b5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void C(ComponentName componentName) {
        c();
        if (this.d != null) {
            this.d = null;
            B().N().b("Disconnected from device MeasurementService", componentName);
            c();
            a0();
        }
    }

    @androidx.annotation.y0
    private final void Q(Runnable runnable) throws IllegalStateException {
        c();
        if (W()) {
            runnable.run();
        } else {
            if (this.h.size() >= 1000) {
                B().E().a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.h.add(runnable);
            this.i.c(60000L);
            a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void f0() {
        c();
        this.g.a();
        this.f.c(u.K.a(null).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean g0() {
        /*
            r5 = this;
            r5.c()
            r5.s()
            java.lang.Boolean r0 = r5.e
            if (r0 != 0) goto Lfb
            r5.c()
            r5.s()
            com.google.android.gms.measurement.internal.j4 r0 = r5.i()
            java.lang.Boolean r0 = r0.H()
            r1 = 1
            if (r0 == 0) goto L23
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L23
            goto Lf5
        L23:
            com.google.android.gms.measurement.internal.p3 r2 = r5.m()
            int r2 = r2.H()
            r3 = 0
            if (r2 != r1) goto L31
        L2e:
            r0 = 1
            goto Ld1
        L31:
            com.google.android.gms.measurement.internal.w3 r2 = r5.B()
            com.google.android.gms.measurement.internal.y3 r2 = r2.N()
            java.lang.String r4 = "Checking service availability"
            r2.a(r4)
            com.google.android.gms.measurement.internal.ha r2 = r5.h()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.q(r4)
            if (r2 == 0) goto Lc2
            if (r2 == r1) goto Lb2
            r4 = 2
            if (r2 == r4) goto L92
            r0 = 3
            if (r2 == r0) goto L83
            r0 = 9
            if (r2 == r0) goto L78
            r0 = 18
            if (r2 == r0) goto L6d
            com.google.android.gms.measurement.internal.w3 r0 = r5.B()
            com.google.android.gms.measurement.internal.y3 r0 = r0.I()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.b(r2, r1)
            goto L90
        L6d:
            com.google.android.gms.measurement.internal.w3 r0 = r5.B()
            com.google.android.gms.measurement.internal.y3 r0 = r0.I()
            java.lang.String r2 = "Service updating"
            goto Lcc
        L78:
            com.google.android.gms.measurement.internal.w3 r0 = r5.B()
            com.google.android.gms.measurement.internal.y3 r0 = r0.I()
            java.lang.String r1 = "Service invalid"
            goto L8d
        L83:
            com.google.android.gms.measurement.internal.w3 r0 = r5.B()
            com.google.android.gms.measurement.internal.y3 r0 = r0.I()
            java.lang.String r1 = "Service disabled"
        L8d:
            r0.a(r1)
        L90:
            r0 = 0
            goto Lc0
        L92:
            com.google.android.gms.measurement.internal.w3 r2 = r5.B()
            com.google.android.gms.measurement.internal.y3 r2 = r2.M()
            java.lang.String r4 = "Service container out of date"
            r2.a(r4)
            com.google.android.gms.measurement.internal.ha r2 = r5.h()
            int r2 = r2.K0()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto Lac
            goto Lbf
        Lac:
            if (r0 != 0) goto Laf
            goto Lb0
        Laf:
            r1 = 0
        Lb0:
            r0 = 0
            goto Ld1
        Lb2:
            com.google.android.gms.measurement.internal.w3 r0 = r5.B()
            com.google.android.gms.measurement.internal.y3 r0 = r0.N()
            java.lang.String r2 = "Service missing"
            r0.a(r2)
        Lbf:
            r0 = 1
        Lc0:
            r1 = 0
            goto Ld1
        Lc2:
            com.google.android.gms.measurement.internal.w3 r0 = r5.B()
            com.google.android.gms.measurement.internal.y3 r0 = r0.N()
            java.lang.String r2 = "Service available"
        Lcc:
            r0.a(r2)
            goto L2e
        Ld1:
            if (r1 != 0) goto Leb
            com.google.android.gms.measurement.internal.xa r2 = r5.j()
            boolean r2 = r2.R()
            if (r2 == 0) goto Leb
            com.google.android.gms.measurement.internal.w3 r0 = r5.B()
            com.google.android.gms.measurement.internal.y3 r0 = r0.E()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r2)
            goto Lec
        Leb:
            r3 = r0
        Lec:
            if (r3 == 0) goto Lf5
            com.google.android.gms.measurement.internal.j4 r0 = r5.i()
            r0.s(r1)
        Lf5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.e = r0
        Lfb:
            java.lang.Boolean r0 = r5.e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x7.g0():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void h0() {
        c();
        if (W()) {
            B().N().a("Inactivity, disconnecting from the service");
            c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void i0() {
        c();
        B().N().b("Processing queued up service tasks", Integer.valueOf(this.h.size()));
        Iterator<Runnable> it = this.h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (Exception e) {
                B().E().b("Task exception while flushing queue", e);
            }
        }
        this.h.clear();
        this.i.e();
    }

    @androidx.annotation.i0
    @androidx.annotation.y0
    private final ma j0(boolean z) {
        return m().y(z ? B().O() : null);
    }

    static /* synthetic */ o3 y(x7 x7Var, o3 o3Var) {
        x7Var.d = null;
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    @androidx.annotation.y0
    public final void D(Bundle bundle) {
        c();
        s();
        Q(new h8(this, bundle, j0(false)));
    }

    @androidx.annotation.y0
    public final void E(pf pfVar) throws IllegalStateException {
        c();
        s();
        Q(new g8(this, j0(false), pfVar));
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
    }

    @androidx.annotation.y0
    public final void G(pf pfVar, s sVar, String str) throws IllegalStateException {
        c();
        s();
        if (h().q(12451000) == 0) {
            Q(new k8(this, sVar, str, pfVar));
        } else {
            B().I().a("Not bundling data. Service unavailable or out of date");
            h().U(pfVar, new byte[0]);
        }
    }

    @androidx.annotation.y0
    protected final void H(pf pfVar, String str, String str2) throws IllegalStateException {
        c();
        s();
        Q(new q8(this, str, str2, j0(false), pfVar));
    }

    @androidx.annotation.y0
    protected final void I(pf pfVar, String str, String str2, boolean z) throws IllegalStateException {
        c();
        s();
        Q(new z7(this, str, str2, z, j0(false), pfVar));
    }

    @androidx.annotation.y0
    protected final void J(s sVar, String str) {
        com.google.android.gms.common.internal.r.k(sVar);
        c();
        s();
        Q(new p8(this, true, p().D(sVar), sVar, j0(true), str));
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    protected final void K(o3 o3Var) {
        c();
        com.google.android.gms.common.internal.r.k(o3Var);
        this.d = o3Var;
        f0();
        i0();
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    final void L(o3 o3Var, com.google.android.gms.common.internal.z.a aVar, ma maVar) throws Throwable {
        int size;
        y3 y3VarE;
        String str;
        c();
        s();
        int r2 = 0;
        int r3 = 100;
        while (r2 < 1001 && r3 == 100) {
            ArrayList arrayList = new ArrayList();
            List<com.google.android.gms.common.internal.z.a> listA = p().A(100);
            if (listA != null) {
                arrayList.addAll(listA);
                size = listA.size();
            } else {
                size = 0;
            }
            if (aVar != null && size < 100) {
                arrayList.add(aVar);
            }
            int size2 = arrayList.size();
            int r6 = 0;
            while (r6 < size2) {
                Object obj = arrayList.get(r6);
                r6++;
                com.google.android.gms.common.internal.z.a aVar2 = (com.google.android.gms.common.internal.z.a) obj;
                if (aVar2 instanceof s) {
                    try {
                        o3Var.a4((s) aVar2, maVar);
                    } catch (RemoteException e) {
                        e = e;
                        y3VarE = B().E();
                        str = "Failed to send event to the service";
                        y3VarE.b(str, e);
                    }
                } else if (aVar2 instanceof ca) {
                    try {
                        o3Var.k6((ca) aVar2, maVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        y3VarE = B().E();
                        str = "Failed to send user property to the service";
                        y3VarE.b(str, e);
                    }
                } else if (aVar2 instanceof va) {
                    try {
                        o3Var.N1((va) aVar2, maVar);
                    } catch (RemoteException e3) {
                        e = e3;
                        y3VarE = B().E();
                        str = "Failed to send conditional user property to the service";
                        y3VarE.b(str, e);
                    }
                } else {
                    B().E().a("Discarding data. Unrecognized parcel type.");
                }
            }
            r2++;
            r3 = size;
        }
    }

    @androidx.annotation.y0
    protected final void M(p7 p7Var) {
        c();
        s();
        Q(new i8(this, p7Var));
    }

    @androidx.annotation.y0
    protected final void O(ca caVar) {
        c();
        s();
        Q(new c8(this, p().E(caVar), caVar, j0(true)));
    }

    @androidx.annotation.y0
    protected final void P(va vaVar) {
        com.google.android.gms.common.internal.r.k(vaVar);
        c();
        s();
        Q(new o8(this, true, p().G(vaVar), new va(vaVar), j0(true), vaVar));
    }

    @androidx.annotation.y0
    public final void R(AtomicReference<String> atomicReference) {
        c();
        s();
        Q(new d8(this, atomicReference, j0(false)));
    }

    @androidx.annotation.y0
    protected final void S(AtomicReference<List<va>> atomicReference, String str, String str2, String str3) throws IllegalStateException {
        c();
        s();
        Q(new r8(this, atomicReference, str, str2, str3, j0(false)));
    }

    @androidx.annotation.y0
    protected final void T(AtomicReference<List<ca>> atomicReference, String str, String str2, String str3, boolean z) throws IllegalStateException {
        c();
        s();
        Q(new t8(this, atomicReference, str, str2, str3, z, j0(false)));
    }

    @androidx.annotation.y0
    protected final void U(AtomicReference<List<ca>> atomicReference, boolean z) throws IllegalStateException {
        c();
        s();
        Q(new b8(this, atomicReference, j0(false), z));
    }

    @androidx.annotation.y0
    protected final void V(boolean z) {
        if (wb.b() && j().p(u.J0)) {
            c();
            s();
            if (z) {
                p().H();
            }
            if (e0()) {
                Q(new m8(this, j0(false)));
            }
        }
    }

    @androidx.annotation.y0
    public final boolean W() {
        c();
        s();
        return this.d != null;
    }

    @androidx.annotation.y0
    protected final void X() {
        c();
        s();
        Q(new n8(this, j0(true)));
    }

    @androidx.annotation.y0
    protected final void Y() {
        c();
        s();
        ma maVarJ0 = j0(false);
        p().H();
        Q(new e8(this, maVarJ0));
    }

    @androidx.annotation.y0
    protected final void Z() throws IllegalStateException {
        c();
        s();
        ma maVarJ0 = j0(true);
        p().I();
        Q(new f8(this, maVarJ0));
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @androidx.annotation.y0
    final void a0() {
        c();
        s();
        if (W()) {
            return;
        }
        if (g0()) {
            this.f6559c.g();
            return;
        }
        if (j().R()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = F().getPackageManager().queryIntentServices(new Intent().setClassName(F(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (!(listQueryIntentServices != null && listQueryIntentServices.size() > 0)) {
            B().E().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(F(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.f6559c.e(intent);
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    final Boolean b0() {
        return this.e;
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @androidx.annotation.y0
    public final void c0() {
        c();
        s();
        this.f6559c.d();
        try {
            com.google.android.gms.common.stats.a.b().c(F(), this.f6559c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ m d() {
        return super.d();
    }

    @androidx.annotation.y0
    final boolean d0() {
        c();
        s();
        return !g0() || h().K0() >= 200900;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ wa e() {
        return super.e();
    }

    @androidx.annotation.y0
    final boolean e0() {
        c();
        s();
        if (j().p(u.L0)) {
            return !g0() || h().K0() >= u.M0.a(null).intValue();
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ u3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ ha h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ j4 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ xa j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ a k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ f6 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ p3 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ x7 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ s7 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ s3 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ e9 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.g5
    protected final boolean v() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ u4 x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.g z() {
        return super.z();
    }
}
