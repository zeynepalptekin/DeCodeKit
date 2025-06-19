package com.google.android.gms.ads.i0.a.a;

import androidx.annotation.i0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f2398a;

    public b(JSONObject jSONObject) {
        this.f2398a = jSONObject;
    }

    public a a() {
        int r0 = this.f2398a.optInt("media_type", -1);
        return r0 != 0 ? r0 != 1 ? a.UNKNOWN : a.VIDEO : a.DISPLAY;
    }

    @i0
    public String b() {
        if (c.f2399a[a().ordinal()] != 1) {
            return "javascript";
        }
        return null;
    }
}
