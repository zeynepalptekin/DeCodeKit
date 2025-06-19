package com.google.android.gms.ads;

import android.os.Bundle;
import androidx.annotation.i0;
import com.google.android.gms.internal.ads.dw2;
import com.google.android.gms.internal.ads.uw2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final uw2 f2396a;

    /* renamed from: b, reason: collision with root package name */
    private final a f2397b;

    private h(uw2 uw2Var) {
        this.f2396a = uw2Var;
        dw2 dw2Var = uw2Var.f;
        this.f2397b = dw2Var == null ? null : dw2Var.h();
    }

    @i0
    public static h e(@i0 uw2 uw2Var) {
        if (uw2Var != null) {
            return new h(uw2Var);
        }
        return null;
    }

    @i0
    public final a a() {
        return this.f2397b;
    }

    public final String b() {
        return this.f2396a.d;
    }

    public final Bundle c() {
        return this.f2396a.g;
    }

    public final long d() {
        return this.f2396a.e;
    }

    public final JSONObject f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f2396a.d);
        jSONObject.put("Latency", this.f2396a.e);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f2396a.g.keySet()) {
            jSONObject2.put(str, this.f2396a.g.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        a aVar = this.f2397b;
        jSONObject.put("Ad Error", aVar == null ? "null" : aVar.f());
        return jSONObject;
    }

    public final String toString() {
        try {
            return f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
