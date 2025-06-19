package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bg1 implements cf1<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f2832a;

    public bg1(JSONObject jSONObject) {
        this.f2832a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObjectK = qq.k(jSONObject, "content_info");
            JSONObject jSONObject2 = this.f2832a;
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectK.put(next, jSONObject2.get(next));
            }
        } catch (JSONException unused) {
            oo.m("Failed putting app indexing json.");
        }
    }
}
