package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import c.a.b.b.g.c.md;
import c.a.b.b.g.c.wb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class c5 extends n3 {
    private final t9 e;
    private Boolean f;

    @androidx.annotation.i0
    private String g;

    public c5(t9 t9Var) {
        this(t9Var, null);
    }

    private c5(t9 t9Var, @androidx.annotation.i0 String str) {
        com.google.android.gms.common.internal.r.k(t9Var);
        this.e = t9Var;
        this.g = null;
    }

    @androidx.annotation.g
    private final void D2(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.e.B().E().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f == null) {
                    this.f = Boolean.valueOf("com.google.android.gms".equals(this.g) || com.google.android.gms.common.util.c0.a(this.e.F(), Binder.getCallingUid()) || c.a.b.b.d.j.a(this.e.F()).d(Binder.getCallingUid()));
                }
                if (this.f.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.e.B().E().b("Measurement Service called with invalid calling package. appId", w3.t(str));
                throw e;
            }
        }
        if (this.g == null && c.a.b.b.d.i.t(this.e.F(), Binder.getCallingUid(), str)) {
            this.g = str;
        }
        if (str.equals(this.g)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @androidx.annotation.g
    private final void N3(ma maVar, boolean z) {
        com.google.android.gms.common.internal.r.k(maVar);
        D2(maVar.d, false);
        this.e.h0().j0(maVar.e, maVar.u, maVar.y);
    }

    @com.google.android.gms.common.util.d0
    private final void i2(Runnable runnable) throws IllegalStateException {
        com.google.android.gms.common.internal.r.k(runnable);
        if (this.e.x().I()) {
            runnable.run();
        } else {
            this.e.x().v(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final void F7(s sVar, String str, String str2) throws IllegalStateException {
        com.google.android.gms.common.internal.r.k(sVar);
        com.google.android.gms.common.internal.r.g(str);
        D2(str, true);
        i2(new p5(this, sVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final List<va> H7(String str, String str2, ma maVar) {
        N3(maVar, false);
        try {
            return (List) this.e.x().s(new m5(this, maVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.e.B().E().b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final List<ca> K1(String str, String str2, boolean z, ma maVar) {
        N3(maVar, false);
        try {
            List<ea> list = (List) this.e.x().s(new k5(this, maVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ea eaVar : list) {
                if (z || !ha.C0(eaVar.f6380c)) {
                    arrayList.add(new ca(eaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.e.B().E().c("Failed to query user properties. appId", w3.t(maVar.d), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final String K5(ma maVar) {
        N3(maVar, false);
        return this.e.Z(maVar);
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final void L3(ma maVar) throws IllegalStateException {
        N3(maVar, false);
        i2(new e5(this, maVar));
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final List<ca> M1(ma maVar, boolean z) {
        N3(maVar, false);
        try {
            List<ea> list = (List) this.e.x().s(new u5(this, maVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ea eaVar : list) {
                if (z || !ha.C0(eaVar.f6380c)) {
                    arrayList.add(new ca(eaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.e.B().E().c("Failed to get user properties. appId", w3.t(maVar.d), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final void N1(va vaVar, ma maVar) throws IllegalStateException {
        com.google.android.gms.common.internal.r.k(vaVar);
        com.google.android.gms.common.internal.r.k(vaVar.f);
        N3(maVar, false);
        va vaVar2 = new va(vaVar);
        vaVar2.d = maVar.d;
        i2(new i5(this, vaVar2, maVar));
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final void R1(ma maVar) throws IllegalStateException {
        N3(maVar, false);
        i2(new t5(this, maVar));
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final void U2(va vaVar) throws IllegalStateException {
        com.google.android.gms.common.internal.r.k(vaVar);
        com.google.android.gms.common.internal.r.k(vaVar.f);
        D2(vaVar.d, true);
        i2(new h5(this, new va(vaVar)));
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final List<ca> V3(String str, String str2, String str3, boolean z) {
        D2(str, true);
        try {
            List<ea> list = (List) this.e.x().s(new j5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ea eaVar : list) {
                if (z || !ha.C0(eaVar.f6380c)) {
                    arrayList.add(new ca(eaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.e.B().E().c("Failed to get user properties as. appId", w3.t(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final void Y5(final Bundle bundle, final ma maVar) throws IllegalStateException {
        if (md.b() && this.e.M().p(u.C0)) {
            N3(maVar, false);
            i2(new Runnable(this, maVar, bundle) { // from class: com.google.android.gms.measurement.internal.f5
                private final c5 d;
                private final ma e;
                private final Bundle f;

                {
                    this.d = this;
                    this.e = maVar;
                    this.f = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e2(this.e, this.f);
                }
            });
        }
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final byte[] Z3(s sVar, String str) throws IllegalStateException {
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.k(sVar);
        D2(str, true);
        this.e.B().M().b("Log and bundle. event", this.e.g0().s(sVar.d));
        long jD = this.e.z().d() / 1000000;
        try {
            byte[] bArr = (byte[]) this.e.x().y(new s5(this, sVar, str)).get();
            if (bArr == null) {
                this.e.B().E().b("Log and bundle returned null. appId", w3.t(str));
                bArr = new byte[0];
            }
            this.e.B().M().d("Log and bundle processed. event, size, time_ms", this.e.g0().s(sVar.d), Integer.valueOf(bArr.length), Long.valueOf((this.e.z().d() / 1000000) - jD));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.e.B().E().d("Failed to log and bundle. appId, event, error", w3.t(str), this.e.g0().s(sVar.d), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final void a4(s sVar, ma maVar) throws IllegalStateException {
        com.google.android.gms.common.internal.r.k(sVar);
        N3(maVar, false);
        i2(new q5(this, sVar, maVar));
    }

    final /* synthetic */ void e2(ma maVar, Bundle bundle) {
        this.e.a0().a0(maVar.d, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final void k6(ca caVar, ma maVar) throws IllegalStateException {
        com.google.android.gms.common.internal.r.k(caVar);
        N3(maVar, false);
        i2(new r5(this, caVar, maVar));
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final void m7(long j, String str, String str2, String str3) throws IllegalStateException {
        i2(new w5(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final void q2(ma maVar) throws IllegalStateException {
        if (wb.b() && this.e.M().p(u.L0)) {
            com.google.android.gms.common.internal.r.g(maVar.d);
            com.google.android.gms.common.internal.r.k(maVar.z);
            n5 n5Var = new n5(this, maVar);
            com.google.android.gms.common.internal.r.k(n5Var);
            if (this.e.x().I()) {
                n5Var.run();
            } else {
                this.e.x().A(n5Var);
            }
        }
    }

    @com.google.android.gms.common.util.d0
    final s y3(s sVar, ma maVar) {
        n nVar;
        boolean z = false;
        if ("_cmp".equals(sVar.d) && (nVar = sVar.e) != null && nVar.h() != 0) {
            String strY = sVar.e.y("_cis");
            if ("referrer broadcast".equals(strY) || "referrer API".equals(strY)) {
                z = true;
            }
        }
        if (!z) {
            return sVar;
        }
        this.e.B().L().b("Event has been filtered ", sVar.toString());
        return new s("_cmpx", sVar.e, sVar.f, sVar.g);
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final void y7(ma maVar) throws IllegalStateException {
        D2(maVar.d, false);
        i2(new o5(this, maVar));
    }

    @Override // com.google.android.gms.measurement.internal.o3
    @androidx.annotation.g
    public final List<va> z7(String str, String str2, String str3) {
        D2(str, true);
        try {
            return (List) this.e.x().s(new l5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.e.B().E().b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }
}
