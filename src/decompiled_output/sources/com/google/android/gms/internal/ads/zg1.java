package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zg1 implements cf1<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private List<String> f6259a;

    public zg1(List<String> list) {
        this.f6259a = list;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("eid", TextUtils.join(",", this.f6259a));
        } catch (JSONException unused) {
            oo.m("Failed putting experiment ids.");
        }
    }
}
