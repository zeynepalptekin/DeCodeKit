package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vg1 implements cf1<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private String f5677a;

    /* renamed from: b, reason: collision with root package name */
    private String f5678b;

    public vg1(String str, String str2) {
        this.f5677a = str;
        this.f5678b = str2;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObjectK = qq.k(jSONObject, "pii");
            jSONObjectK.put("doritos", this.f5677a);
            jSONObjectK.put("doritos_v2", this.f5678b);
        } catch (JSONException unused) {
            oo.m("Failed putting doritos string.");
        }
    }
}
