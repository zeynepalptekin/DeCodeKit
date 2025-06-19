package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class ez0 implements lb<bz0> {
    ez0() {
    }

    @Override // com.google.android.gms.internal.ads.lb
    public final /* synthetic */ JSONObject a(bz0 bz0Var) throws JSONException {
        bz0 bz0Var2 = bz0Var;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", bz0Var2.f2900c.d());
        jSONObject2.put("signals", bz0Var2.f2899b);
        jSONObject3.put("body", bz0Var2.f2898a.f3890c);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.p.c().e0(bz0Var2.f2898a.f3889b));
        jSONObject3.put("response_code", bz0Var2.f2898a.f3888a);
        jSONObject3.put("latency", bz0Var2.f2898a.d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", bz0Var2.f2900c.g());
        return jSONObject;
    }
}
