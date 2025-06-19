package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ql0 extends rl0 {

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f5031b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5032c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public ql0(km1 km1Var, JSONObject jSONObject) {
        super(km1Var);
        this.f5031b = qq.e(jSONObject, "tracking_urls_and_actions", "active_view");
        boolean z = false;
        this.f5032c = qq.i(false, jSONObject, "allow_pub_owned_ad_view");
        this.d = qq.i(false, jSONObject, "attribution", "allow_pub_rendering");
        this.e = qq.i(false, jSONObject, "enable_omid");
        if (jSONObject != null && jSONObject.optJSONObject("overlay") != null) {
            z = true;
        }
        this.f = z;
    }

    @Override // com.google.android.gms.internal.ads.rl0
    public final boolean a() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.rl0
    public final JSONObject b() {
        JSONObject jSONObject = this.f5031b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f5152a.y);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.rl0
    public final boolean c() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.rl0
    public final boolean d() {
        return this.f5032c;
    }

    @Override // com.google.android.gms.internal.ads.rl0
    public final boolean e() {
        return this.d;
    }
}
