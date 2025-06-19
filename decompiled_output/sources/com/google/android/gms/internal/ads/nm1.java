package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nm1 implements vq {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    public final String f4569a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    public final String f4570b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f4571c;
    private final JSONObject d;

    nm1(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        JSONObject jSONObjectM = qq.m(jsonReader);
        this.d = jSONObjectM;
        this.f4569a = jSONObjectM.optString("ad_html", null);
        this.f4570b = this.d.optString("ad_base_url", null);
        this.f4571c = this.d.optJSONObject("ad_json");
    }

    @Override // com.google.android.gms.internal.ads.vq
    public final void a(JsonWriter jsonWriter) throws JSONException, IOException {
        qq.h(jsonWriter, this.d);
    }
}
