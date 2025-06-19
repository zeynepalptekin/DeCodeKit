package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xf1 implements cf1<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final String f5973a;

    public xf1(String str) {
        this.f5973a = str;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("ms", this.f5973a);
        } catch (JSONException e) {
            oo.l("Failed putting Ad ID.", e);
        }
    }
}
