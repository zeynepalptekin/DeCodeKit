package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class qg1 implements ff1<cf1<JSONObject>> {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f5011a;

    qg1(Context context) {
        this.f5011a = ij.c(context);
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<cf1<JSONObject>> a() {
        return qx1.g(new cf1(this) { // from class: com.google.android.gms.internal.ads.tg1

            /* renamed from: a, reason: collision with root package name */
            private final qg1 f5398a;

            {
                this.f5398a = this;
            }

            @Override // com.google.android.gms.internal.ads.cf1
            public final void b(Object obj) throws JSONException {
                this.f5398a.b((JSONObject) obj);
            }
        });
    }

    final /* synthetic */ void b(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("gms_sdk_env", this.f5011a);
        } catch (JSONException unused) {
            oo.m("Failed putting version constants.");
        }
    }
}
