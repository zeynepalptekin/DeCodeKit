package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n30 implements pe2<mr2> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<km1> f4479a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<as> f4480b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<JSONObject> f4481c;
    private final ze2<String> d;

    private n30(ze2<km1> ze2Var, ze2<as> ze2Var2, ze2<JSONObject> ze2Var3, ze2<String> ze2Var4) {
        this.f4479a = ze2Var;
        this.f4480b = ze2Var2;
        this.f4481c = ze2Var3;
        this.d = ze2Var4;
    }

    public static n30 a(ze2<km1> ze2Var, ze2<as> ze2Var2, ze2<JSONObject> ze2Var3, ze2<String> ze2Var4) {
        return new n30(ze2Var, ze2Var2, ze2Var3, ze2Var4);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        this.f4479a.get();
        as asVar = this.f4480b.get();
        JSONObject jSONObject = this.f4481c.get();
        String str = this.d.get();
        boolean zEquals = "native".equals(str);
        com.google.android.gms.ads.internal.p.c();
        return (mr2) we2.b(new mr2(to.q0(), asVar, str, jSONObject, false, zEquals), "Cannot return null from a non-@Nullable @Provides method");
    }
}
