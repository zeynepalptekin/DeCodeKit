package com.google.android.gms.ads;

import androidx.annotation.h0;
import androidx.annotation.i0;
import com.google.android.gms.internal.ads.dw2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static final String e = "undefined";

    /* renamed from: a, reason: collision with root package name */
    private final int f2336a;

    /* renamed from: b, reason: collision with root package name */
    @h0
    private final String f2337b;

    /* renamed from: c, reason: collision with root package name */
    @h0
    private final String f2338c;

    @i0
    private final a d;

    public a(int r1, @h0 String str, @h0 String str2) {
        this.f2336a = r1;
        this.f2337b = str;
        this.f2338c = str2;
        this.d = null;
    }

    public a(int r1, @h0 String str, @h0 String str2, @h0 a aVar) {
        this.f2336a = r1;
        this.f2337b = str;
        this.f2338c = str2;
        this.d = aVar;
    }

    @i0
    public a a() {
        return this.d;
    }

    public int b() {
        return this.f2336a;
    }

    @h0
    public String c() {
        return this.f2338c;
    }

    @h0
    public String d() {
        return this.f2337b;
    }

    @h0
    public final dw2 e() {
        dw2 dw2Var;
        if (this.d == null) {
            dw2Var = null;
        } else {
            a aVar = this.d;
            dw2Var = new dw2(aVar.f2336a, aVar.f2337b, aVar.f2338c, null, null);
        }
        return new dw2(this.f2336a, this.f2337b, this.f2338c, dw2Var, null);
    }

    public JSONObject f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f2336a);
        jSONObject.put("Message", this.f2337b);
        jSONObject.put("Domain", this.f2338c);
        a aVar = this.d;
        jSONObject.put("Cause", aVar == null ? "null" : aVar.f());
        return jSONObject;
    }

    public String toString() {
        try {
            return f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
