package com.google.android.gms.ads.l0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.i0;
import androidx.annotation.o0;
import com.google.android.gms.ads.u;
import com.google.android.gms.ads.y;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.jl;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final jl f2432a;

    public c(Context context, String str) {
        r.l(context, "context cannot be null");
        r.l(str, "adUnitID cannot be null");
        this.f2432a = new jl(context, str);
    }

    public final Bundle a() {
        return this.f2432a.a();
    }

    @Deprecated
    public final String b() {
        return this.f2432a.b();
    }

    @i0
    public final y c() {
        return this.f2432a.c();
    }

    @i0
    public final b d() {
        return this.f2432a.d();
    }

    public final boolean e() {
        return this.f2432a.e();
    }

    @o0("android.permission.INTERNET")
    public final void f(com.google.android.gms.ads.e eVar, e eVar2) {
        this.f2432a.k(eVar.k(), eVar2);
    }

    @o0("android.permission.INTERNET")
    public final void g(com.google.android.gms.ads.c0.d dVar, e eVar) {
        this.f2432a.k(dVar.n(), eVar);
    }

    public final void h(a aVar) {
        this.f2432a.f(aVar);
    }

    public final void i(@i0 u uVar) {
        this.f2432a.g(uVar);
    }

    public final void j(f fVar) {
        this.f2432a.h(fVar);
    }

    public final void k(Activity activity, d dVar) {
        this.f2432a.i(activity, dVar);
    }

    public final void l(Activity activity, d dVar, boolean z) {
        this.f2432a.j(activity, dVar, z);
    }
}
