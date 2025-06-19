package com.google.android.gms.ads.c0;

import android.content.Context;
import androidx.annotation.i0;
import androidx.annotation.o0;
import com.google.android.gms.ads.j;
import com.google.android.gms.ads.y;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.h03;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final h03 f2351a;

    public f(Context context) {
        this.f2351a = new h03(context, this);
        r.l(context, "Context cannot be null");
    }

    public final com.google.android.gms.ads.c a() {
        return this.f2351a.a();
    }

    public final String b() {
        return this.f2351a.c();
    }

    public final a c() {
        return this.f2351a.d();
    }

    @Deprecated
    public final String d() {
        return this.f2351a.e();
    }

    public final c e() {
        return this.f2351a.f();
    }

    @i0
    public final y f() {
        return this.f2351a.g();
    }

    public final boolean g() {
        return this.f2351a.h();
    }

    public final boolean h() {
        return this.f2351a.i();
    }

    @o0("android.permission.INTERNET")
    public final void i(d dVar) {
        this.f2351a.t(dVar.n());
    }

    public final void j(com.google.android.gms.ads.c cVar) {
        this.f2351a.j(cVar);
    }

    public final void k(String str) {
        this.f2351a.l(str);
    }

    public final void l(a aVar) {
        this.f2351a.m(aVar);
    }

    @com.google.android.gms.common.annotation.a
    @Deprecated
    public final void m(j jVar) {
    }

    public final void n(boolean z) {
        this.f2351a.n(z);
    }

    public final void o(c cVar) {
        this.f2351a.o(cVar);
    }

    public final void p() {
        this.f2351a.r();
    }
}
