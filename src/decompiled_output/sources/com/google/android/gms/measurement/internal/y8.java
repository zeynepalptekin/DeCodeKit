package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.util.Pair;
import c.a.b.b.g.c.wb;
import com.google.android.gms.ads.e0.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y8 extends u9 {
    private String d;
    private boolean e;
    private long f;

    y8(t9 t9Var) {
        super(t9Var);
    }

    @androidx.annotation.y0
    @androidx.annotation.h0
    @Deprecated
    private final Pair<String, Boolean> v(String str) {
        c();
        long jC = z().c();
        if (this.d != null && jC < this.f) {
            return new Pair<>(this.d, Boolean.valueOf(this.e));
        }
        this.f = jC + j().y(str);
        com.google.android.gms.ads.e0.a.e(true);
        try {
            a.C0160a c0160aB = com.google.android.gms.ads.e0.a.b(F());
            if (c0160aB != null) {
                this.d = c0160aB.a();
                this.e = c0160aB.b();
            }
            if (this.d == null) {
                this.d = "";
            }
        } catch (Exception e) {
            B().M().b("Unable to get advertising id", e);
            this.d = "";
        }
        com.google.android.gms.ads.e0.a.e(false);
        return new Pair<>(this.d, Boolean.valueOf(this.e));
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.v5
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

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ da k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ y8 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ na m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ d n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ v4 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.u9
    protected final boolean s() {
        return false;
    }

    @androidx.annotation.y0
    @androidx.annotation.h0
    final Pair<String, Boolean> t(String str, e eVar) {
        return (wb.b() && j().p(u.L0) && !eVar.o()) ? new Pair<>("", Boolean.FALSE) : v(str);
    }

    @androidx.annotation.y0
    @Deprecated
    final String u(String str) throws NoSuchAlgorithmException {
        c();
        String str2 = (String) v(str).first;
        MessageDigest messageDigestJ0 = ha.J0();
        if (messageDigestJ0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestJ0.digest(str2.getBytes())));
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
