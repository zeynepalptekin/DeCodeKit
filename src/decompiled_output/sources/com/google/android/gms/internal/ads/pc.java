package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pc {

    /* renamed from: a, reason: collision with root package name */
    public final List<lc> f4798a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4799b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f4800c;
    private final List<String> d;
    private final List<String> e;
    private final List<String> f;
    private final List<String> g;
    private final boolean h;
    private final String i;
    private final long j;
    private final String k;
    private final int l;
    private final int m;
    private final long n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private int s;
    private int t;
    private boolean u;

    public pc(JSONObject jSONObject) throws JSONException {
        if (tr.a(2)) {
            String strValueOf = String.valueOf(jSONObject.toString(2));
            oo.m(strValueOf.length() != 0 ? "Mediation Response JSON: ".concat(strValueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int r5 = -1;
        for (int r4 = 0; r4 < jSONArray.length(); r4++) {
            try {
                lc lcVar = new lc(jSONArray.getJSONObject(r4));
                boolean z = true;
                if ("banner".equalsIgnoreCase(lcVar.v)) {
                    this.u = true;
                }
                arrayList.add(lcVar);
                if (r5 < 0) {
                    Iterator<String> it = lcVar.f4239c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        r5 = r4;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.s = r5;
        this.t = jSONArray.length();
        this.f4798a = Collections.unmodifiableList(arrayList);
        this.i = jSONObject.optString("qdata");
        this.m = jSONObject.optInt("fs_model_type", -1);
        this.n = jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject == null) {
            this.f4799b = -1L;
            this.f4800c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.j = -1L;
            this.k = null;
            this.l = 0;
            this.o = false;
            this.h = false;
            this.p = false;
            this.q = false;
            this.r = false;
            return;
        }
        this.f4799b = jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
        com.google.android.gms.ads.internal.p.u();
        this.f4800c = nc.a(jSONObjectOptJSONObject, "click_urls");
        com.google.android.gms.ads.internal.p.u();
        this.d = nc.a(jSONObjectOptJSONObject, "imp_urls");
        com.google.android.gms.ads.internal.p.u();
        this.e = nc.a(jSONObjectOptJSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.p.u();
        this.f = nc.a(jSONObjectOptJSONObject, "nofill_urls");
        com.google.android.gms.ads.internal.p.u();
        this.g = nc.a(jSONObjectOptJSONObject, "remote_ping_urls");
        this.h = jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
        long jOptLong = jSONObjectOptJSONObject.optLong("refresh", -1L);
        this.j = jOptLong > 0 ? 1000 * jOptLong : -1L;
        qk qkVarH = qk.h(jSONObjectOptJSONObject.optJSONArray("rewards"));
        if (qkVarH == null) {
            this.k = null;
            this.l = 0;
        } else {
            this.k = qkVarH.d;
            this.l = qkVarH.e;
        }
        this.o = jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
        this.p = jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        this.q = jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        this.r = jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
