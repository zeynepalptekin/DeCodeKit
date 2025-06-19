package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.i0;
import com.google.android.gms.internal.ads.h03;
import com.google.android.gms.internal.ads.zv2;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final h03 f2430a;

    public l(Context context) {
        this.f2430a = new h03(context);
        com.google.android.gms.common.internal.r.l(context, "Context cannot be null");
    }

    public final c a() {
        return this.f2430a.a();
    }

    public final Bundle b() {
        return this.f2430a.b();
    }

    public final String c() {
        return this.f2430a.c();
    }

    @Deprecated
    public final String d() {
        return this.f2430a.e();
    }

    @i0
    public final y e() {
        return this.f2430a.g();
    }

    public final boolean f() {
        return this.f2430a.h();
    }

    public final boolean g() {
        return this.f2430a.i();
    }

    @androidx.annotation.o0("android.permission.INTERNET")
    public final void h(e eVar) {
        this.f2430a.t(eVar.k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(c cVar) {
        this.f2430a.j(cVar);
        if (cVar != 0 && (cVar instanceof zv2)) {
            this.f2430a.s((zv2) cVar);
        } else if (cVar == 0) {
            this.f2430a.s(null);
        }
    }

    public final void j(com.google.android.gms.ads.k0.a aVar) {
        this.f2430a.k(aVar);
    }

    public final void k(String str) {
        this.f2430a.l(str);
    }

    public final void l(boolean z) {
        this.f2430a.n(z);
    }

    public final void m(@i0 u uVar) {
        this.f2430a.p(uVar);
    }

    public final void n(com.google.android.gms.ads.k0.d dVar) {
        this.f2430a.q(dVar);
    }

    public final void o() {
        this.f2430a.r();
    }

    public final void p(boolean z) {
        this.f2430a.v(true);
    }
}
