package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wn {

    /* renamed from: a, reason: collision with root package name */
    private final long f5859a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f5860b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f5861c = new ArrayList();
    private final Map<String, pc> d = new HashMap();
    private String e;
    private String f;
    private JSONObject g;
    private boolean h;

    public wn(String str, long j) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        this.h = false;
        this.f = str;
        this.f5859a = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.g = jSONObject;
            if (jSONObject.optInt(androidx.core.app.p.t0, -1) != 1) {
                this.h = false;
                tr.i("App settings could not be fetched successfully.");
                return;
            }
            this.h = true;
            this.e = this.g.optString("app_id");
            JSONArray jSONArrayOptJSONArray = this.g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray != null) {
                for (int r6 = 0; r6 < jSONArrayOptJSONArray.length(); r6++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(r6);
                    String strOptString = jSONObject2.optString("format");
                    String strOptString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f5861c.add(strOptString2);
                        } else if ("rewarded".equalsIgnoreCase(strOptString) && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.d.put(strOptString2, new pc(jSONObjectOptJSONObject));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray2 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray2 != null) {
                for (int r0 = 0; r0 < jSONArrayOptJSONArray2.length(); r0++) {
                    this.f5860b.add(jSONArrayOptJSONArray2.optString(r0));
                }
            }
        } catch (JSONException e) {
            tr.d("Exception occurred while processing app setting json", e);
            com.google.android.gms.ads.internal.p.g().e(e, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long a() {
        return this.f5859a;
    }

    public final boolean b() {
        return this.h;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.e;
    }

    public final Map<String, pc> e() {
        return this.d;
    }

    public final JSONObject f() {
        return this.g;
    }
}
