package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.e0.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rf1 implements cf1<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final a.C0160a f5132a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5133b;

    public rf1(a.C0160a c0160a, String str) {
        this.f5132a = c0160a;
        this.f5133b = str;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObjectK = qq.k(jSONObject, "pii");
            if (this.f5132a == null || TextUtils.isEmpty(this.f5132a.a())) {
                jSONObjectK.put("pdid", this.f5133b);
                jSONObjectK.put("pdidtype", "ssaid");
            } else {
                jSONObjectK.put("rdid", this.f5132a.a());
                jSONObjectK.put("is_lat", this.f5132a.b());
                jSONObjectK.put("idtype", "adid");
            }
        } catch (JSONException e) {
            oo.l("Failed putting Ad ID.", e);
        }
    }
}
