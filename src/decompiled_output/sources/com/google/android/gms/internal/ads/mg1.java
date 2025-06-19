package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mg1 implements cf1<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f4412a;

    public mg1(JSONObject jSONObject) {
        this.f4412a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("cache_state", this.f4412a);
        } catch (JSONException unused) {
            oo.m("Unable to get cache_state");
        }
    }
}
