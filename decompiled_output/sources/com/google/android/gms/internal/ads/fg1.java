package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fg1 implements cf1<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private String f3408a;

    public fg1(String str) {
        this.f3408a = str;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObjectK = qq.k(jSONObject, "pii");
            if (TextUtils.isEmpty(this.f3408a)) {
                return;
            }
            jSONObjectK.put("attok", this.f3408a);
        } catch (JSONException e) {
            oo.l("Failed putting attestation token.", e);
        }
    }
}
