package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.fm0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class if2 implements bu1 {

    /* renamed from: a, reason: collision with root package name */
    private final yr1 f3817a;

    /* renamed from: b, reason: collision with root package name */
    private final ks1 f3818b;

    /* renamed from: c, reason: collision with root package name */
    private final vf2 f3819c;
    private final hf2 d;

    if2(@androidx.annotation.h0 yr1 yr1Var, @androidx.annotation.h0 ks1 ks1Var, @androidx.annotation.h0 vf2 vf2Var, @androidx.annotation.h0 hf2 hf2Var) {
        this.f3817a = yr1Var;
        this.f3818b = ks1Var;
        this.f3819c = vf2Var;
        this.d = hf2Var;
    }

    private final Map<String, Object> e() {
        HashMap map = new HashMap();
        fm0.a aVarG = this.f3818b.g();
        map.put("v", this.f3817a.a());
        map.put("gms", Boolean.valueOf(this.f3817a.d()));
        map.put("int", aVarG.Z());
        map.put("up", Boolean.valueOf(this.d.a()));
        map.put("t", new Throwable());
        return map;
    }

    @Override // com.google.android.gms.internal.ads.bu1
    public final Map<String, Object> a() {
        return e();
    }

    @Override // com.google.android.gms.internal.ads.bu1
    public final Map<String, Object> b() {
        Map<String, Object> mapE = e();
        mapE.put("lts", Long.valueOf(this.f3819c.e()));
        return mapE;
    }

    @Override // com.google.android.gms.internal.ads.bu1
    public final Map<String, Object> c() {
        Map<String, Object> mapE = e();
        fm0.a aVarC = this.f3818b.c();
        mapE.put("gai", Boolean.valueOf(this.f3817a.b()));
        mapE.put("did", aVarC.k0());
        mapE.put("dst", Integer.valueOf(aVarC.n0().h()));
        mapE.put("doo", Boolean.valueOf(aVarC.q0()));
        return mapE;
    }

    final void d(View view) {
        this.f3819c.g(view);
    }
}
