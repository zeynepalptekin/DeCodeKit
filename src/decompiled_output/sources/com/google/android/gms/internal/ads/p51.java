package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p51 implements v01<ye, p21> {

    /* renamed from: a, reason: collision with root package name */
    private final x61 f4784a;

    public p51(x61 x61Var) {
        this.f4784a = x61Var;
    }

    @Override // com.google.android.gms.internal.ads.v01
    public final w01<ye, p21> a(String str, JSONObject jSONObject) throws in1 {
        ye yeVarB = this.f4784a.b(str);
        if (yeVarB == null) {
            return null;
        }
        return new w01<>(yeVarB, new p21(), str);
    }
}
