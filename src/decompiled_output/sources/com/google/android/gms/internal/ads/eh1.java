package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class eh1 implements cf1<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f3273a;

    public eh1(Bundle bundle) {
        this.f3273a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        if (this.f3273a != null) {
            try {
                qq.k(qq.k(jSONObject2, "device"), "play_store").put("parental_controls", com.google.android.gms.ads.internal.p.c().R(this.f3273a));
            } catch (JSONException unused) {
                oo.m("Failed putting parental controls bundle.");
            }
        }
    }
}
