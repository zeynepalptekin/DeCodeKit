package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cj {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f2978a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2979b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2980c;
    private final String d;
    private final boolean e;
    private final String f;
    private final String g;
    private String h;
    private final int i;
    private final boolean j;
    private final JSONObject k;
    private final String l;
    private final boolean m;
    private final String n;

    public cj(JSONObject jSONObject) {
        this.h = jSONObject.optString(com.google.android.gms.common.internal.o.f2536a);
        this.f2979b = jSONObject.optString("base_uri");
        this.f2980c = jSONObject.optString("post_parameters");
        String strOptString = jSONObject.optString("drt_include");
        this.e = strOptString != null && (strOptString.equals("1") || strOptString.equals("true"));
        this.f = jSONObject.optString("request_id");
        this.d = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("errors");
        this.f2978a = strOptString2 == null ? null : Arrays.asList(strOptString2.split(","));
        this.i = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.g = jSONObject.optString("fetched_ad");
        this.j = jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.k = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        this.l = jSONObject.optString("analytics_query_ad_event_id");
        this.m = jSONObject.optBoolean("is_analytics_logging_enabled");
        this.n = jSONObject.optString("pool_key");
    }

    public final int a() {
        return this.i;
    }

    public final String b() {
        return this.h;
    }

    public final List<String> c() {
        return this.f2978a;
    }

    public final String d() {
        return this.f2979b;
    }

    public final String e() {
        return this.f2980c;
    }

    public final boolean f() {
        return this.e;
    }

    public final JSONObject g() {
        return this.k;
    }

    public final String h() {
        return this.n;
    }
}
