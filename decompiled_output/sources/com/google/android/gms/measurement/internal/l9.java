package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import c.a.b.b.g.c.ad;
import c.a.b.b.g.c.vc;

/* loaded from: classes.dex */
final class l9 {

    /* renamed from: a, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private long f6450a;

    /* renamed from: b, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private long f6451b;

    /* renamed from: c, reason: collision with root package name */
    private final k f6452c;
    private final /* synthetic */ e9 d;

    public l9(e9 e9Var) {
        this.d = e9Var;
        this.f6452c = new o9(this, this.d.f6543a);
        long jC = e9Var.z().c();
        this.f6450a = jC;
        this.f6451b = jC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void h() {
        this.d.c();
        d(false, false, this.d.z().c());
        this.d.k().r(this.d.z().c());
    }

    final void a() {
        this.f6452c.e();
        this.f6450a = 0L;
        this.f6451b = 0L;
    }

    @androidx.annotation.y0
    final void b(long j) {
        this.d.c();
        this.f6452c.e();
        this.f6450a = j;
        this.f6451b = j;
    }

    @androidx.annotation.y0
    public final boolean d(boolean z, boolean z2, long j) {
        this.d.c();
        this.d.s();
        if (!vc.b() || !this.d.j().p(u.r0) || this.d.f6543a.l()) {
            this.d.i().u.b(this.d.z().a());
        }
        long jG = j - this.f6450a;
        if (!z && jG < 1000) {
            this.d.B().N().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(jG));
            return false;
        }
        if (this.d.j().p(u.U) && !z2) {
            jG = (ad.b() && this.d.j().p(u.W)) ? g(j) : e();
        }
        this.d.B().N().b("Recording user engagement, ms", Long.valueOf(jG));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", jG);
        s7.L(this.d.o().C(!this.d.j().I().booleanValue()), bundle, true);
        if (this.d.j().p(u.U) && !this.d.j().p(u.V) && z2) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.d.j().p(u.V) || !z2) {
            this.d.l().Z("auto", "_e", bundle);
        }
        this.f6450a = j;
        this.f6452c.e();
        this.f6452c.c(3600000L);
        return true;
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    final long e() {
        long jC = this.d.z().c();
        long j = jC - this.f6451b;
        this.f6451b = jC;
        return j;
    }

    @androidx.annotation.y0
    final void f(long j) {
        this.f6452c.e();
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    final long g(long j) {
        long j2 = j - this.f6451b;
        this.f6451b = j;
        return j2;
    }
}
