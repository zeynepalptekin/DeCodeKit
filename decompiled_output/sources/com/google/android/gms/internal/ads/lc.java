package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class lc {

    /* renamed from: a, reason: collision with root package name */
    private final String f4237a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4238b;

    /* renamed from: c, reason: collision with root package name */
    public final List<String> f4239c;
    private final String d;
    private final String e;
    private final List<String> f;
    private final List<String> g;
    private final List<String> h;
    private final List<String> i;
    private final List<String> j;
    public final String k;
    private final List<String> l;
    private final List<String> m;
    private final List<String> n;
    private final String o;
    private final String p;

    @androidx.annotation.i0
    private final String q;

    @androidx.annotation.i0
    private final String r;
    private final String s;

    @androidx.annotation.i0
    private final List<String> t;
    private final String u;

    @androidx.annotation.i0
    public final String v;
    private final long w;

    public lc(JSONObject jSONObject) throws JSONException {
        List<String> listA;
        this.f4238b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int r2 = 0; r2 < jSONArray.length(); r2++) {
            arrayList.add(jSONArray.getString(r2));
        }
        this.f4239c = Collections.unmodifiableList(arrayList);
        this.d = jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.p.u();
        this.f = nc.a(jSONObject, "clickurl");
        com.google.android.gms.ads.internal.p.u();
        this.g = nc.a(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.p.u();
        this.h = nc.a(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.p.u();
        this.j = nc.a(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.p.u();
        this.l = nc.a(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.p.u();
        this.n = nc.a(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.p.u();
        this.m = nc.a(jSONObject, "video_reward_urls");
        this.o = jSONObject.optString(FirebaseAnalytics.b.H);
        this.p = jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            com.google.android.gms.ads.internal.p.u();
            listA = nc.a(jSONObjectOptJSONObject, "manual_impression_urls");
        } else {
            listA = null;
        }
        this.i = listA;
        this.f4237a = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.k = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        this.e = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("class_name") : null;
        this.q = jSONObject.optString("html_template", null);
        this.r = jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        this.s = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.toString() : null;
        com.google.android.gms.ads.internal.p.u();
        this.t = nc.a(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.u = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.toString() : null;
        this.v = jSONObject.optString("response_type", null);
        this.w = jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
