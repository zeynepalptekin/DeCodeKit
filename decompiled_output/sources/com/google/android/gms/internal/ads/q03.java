package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q03 {

    /* renamed from: a, reason: collision with root package name */
    private final String f4928a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f4929b;

    public q03(String str, Bundle bundle) {
        this.f4928a = str;
        this.f4929b = bundle;
    }

    public static String c(com.google.android.gms.ads.j0.b bVar) {
        String str = qx2.i().get(bVar);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final String a() {
        return this.f4928a;
    }

    public final Bundle b() {
        return this.f4929b;
    }
}
