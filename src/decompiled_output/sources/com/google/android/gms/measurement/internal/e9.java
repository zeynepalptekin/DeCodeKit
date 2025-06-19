package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import c.a.b.b.g.c.jf;

/* loaded from: classes.dex */
public final class e9 extends g5 {

    /* renamed from: c, reason: collision with root package name */
    private Handler f6377c;
    protected final n9 d;
    protected final l9 e;
    private final j9 f;

    e9(b5 b5Var) {
        super(b5Var);
        this.d = new n9(this);
        this.e = new l9(this);
        this.f = new j9(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void E() {
        c();
        if (this.f6377c == null) {
            this.f6377c = new jf(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void H(long j) {
        c();
        E();
        B().N().b("Activity resumed, time", Long.valueOf(j));
        if (j().p(u.w0)) {
            if (j().I().booleanValue() || i().w.b()) {
                this.e.b(j);
            }
            this.f.a();
        } else {
            this.f.a();
            if (j().I().booleanValue()) {
                this.e.b(j);
            }
        }
        n9 n9Var = this.d;
        n9Var.f6470a.c();
        if (n9Var.f6470a.f6543a.l()) {
            if (!n9Var.f6470a.j().p(u.w0)) {
                n9Var.f6470a.i().w.a(false);
            }
            n9Var.b(n9Var.f6470a.z().a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void J(long j) {
        c();
        E();
        B().N().b("Activity paused, time", Long.valueOf(j));
        this.f.b(j);
        if (j().I().booleanValue()) {
            this.e.f(j);
        }
        n9 n9Var = this.d;
        if (n9Var.f6470a.j().p(u.w0)) {
            return;
        }
        n9Var.f6470a.i().w.a(true);
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    public final boolean D(boolean z, boolean z2, long j) {
        return this.e.d(z, z2, j);
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

    @Override // com.google.android.gms.measurement.internal.g5
    protected final boolean v() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ u4 x() {
        return super.x();
    }

    final long y(long j) {
        return this.e.g(j);
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.g z() {
        return super.z();
    }
}
