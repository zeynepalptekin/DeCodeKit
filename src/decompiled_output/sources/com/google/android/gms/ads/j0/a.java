package com.google.android.gms.ads.j0;

import com.google.android.gms.internal.ads.tr;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f2425a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2426b;

    @com.google.android.gms.common.annotation.a
    public a(b bVar, String str) {
        this.f2425a = bVar;
        this.f2426b = str;
    }

    @com.google.android.gms.common.annotation.a
    public static String c(String str) {
        String str2;
        if (str == null) {
            str2 = "adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.";
        } else {
            try {
                return new JSONObject(str).optString("request_id", "");
            } catch (JSONException unused) {
                str2 = "Invalid adString passed to AdInfo.getRequestId(). Returning empty string.";
            }
        }
        tr.i(str2);
        return "";
    }

    @com.google.android.gms.common.annotation.a
    public String a() {
        return this.f2426b;
    }

    @com.google.android.gms.common.annotation.a
    public b b() {
        return this.f2425a;
    }
}
