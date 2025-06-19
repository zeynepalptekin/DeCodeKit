package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i31 implements v01<rn1, p21> {

    /* renamed from: a, reason: collision with root package name */
    private final fs0 f3760a;

    public i31(fs0 fs0Var) {
        this.f3760a = fs0Var;
    }

    @Override // com.google.android.gms.internal.ads.v01
    public final w01<rn1, p21> a(String str, JSONObject jSONObject) throws in1 {
        rn1 rn1VarD = this.f3760a.d(str, jSONObject);
        if (rn1VarD == null) {
            return null;
        }
        return new w01<>(rn1VarD, new p21(), str);
    }
}
