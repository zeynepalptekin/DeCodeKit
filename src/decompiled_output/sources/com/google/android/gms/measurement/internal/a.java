package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends d2 {

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Long> f6340b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Integer> f6341c;
    private long d;

    public a(b5 b5Var) {
        super(b5Var);
        this.f6341c = new b.f.a();
        this.f6340b = new b.f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void D(String str, long j) {
        c();
        com.google.android.gms.common.internal.r.g(str);
        if (this.f6341c.isEmpty()) {
            this.d = j;
        }
        Integer num = this.f6341c.get(str);
        if (num != null) {
            this.f6341c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f6341c.size() >= 100) {
            B().I().a("Too many ads visible");
        } else {
            this.f6341c.put(str, 1);
            this.f6340b.put(str, Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void E(String str, long j) {
        c();
        com.google.android.gms.common.internal.r.g(str);
        Integer num = this.f6341c.get(str);
        if (num == null) {
            B().E().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        p7 p7VarC = o().C(false);
        int r0 = num.intValue() - 1;
        if (r0 != 0) {
            this.f6341c.put(str, Integer.valueOf(r0));
            return;
        }
        this.f6341c.remove(str);
        Long l = this.f6340b.get(str);
        if (l == null) {
            B().E().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l.longValue();
            this.f6340b.remove(str);
            w(str, jLongValue, p7VarC);
        }
        if (this.f6341c.isEmpty()) {
            long j2 = this.d;
            if (j2 == 0) {
                B().E().a("First ad exposure time was never set");
            } else {
                s(j - j2, p7VarC);
                this.d = 0L;
            }
        }
    }

    @androidx.annotation.y0
    private final void s(long j, p7 p7Var) {
        if (p7Var == null) {
            B().N().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            B().N().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        s7.L(p7Var, bundle, true);
        l().Z("am", "_xa", bundle);
    }

    @androidx.annotation.y0
    private final void w(String str, long j, p7 p7Var) {
        if (p7Var == null) {
            B().N().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            B().N().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        s7.L(p7Var, bundle, true);
        l().Z("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void y(long j) {
        Iterator<String> it = this.f6340b.keySet().iterator();
        while (it.hasNext()) {
            this.f6340b.put(it.next(), Long.valueOf(j));
        }
        if (this.f6340b.isEmpty()) {
            return;
        }
        this.d = j;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    public final void C(String str, long j) throws IllegalStateException {
        if (str == null || str.length() == 0) {
            B().E().a("Ad unit id must be a non-empty string");
        } else {
            x().v(new b0(this, str, j));
        }
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ m d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ wa e() {
        return super.e();
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

    @androidx.annotation.y0
    public final void r(long j) {
        p7 p7VarC = o().C(false);
        for (String str : this.f6340b.keySet()) {
            w(str, j - this.f6340b.get(str).longValue(), p7VarC);
        }
        if (!this.f6340b.isEmpty()) {
            s(j - this.d, p7VarC);
        }
        y(j);
    }

    public final void v(String str, long j) throws IllegalStateException {
        if (str == null || str.length() == 0) {
            B().E().a("Ad unit id must be a non-empty string");
        } else {
            x().v(new c1(this, str, j));
        }
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
