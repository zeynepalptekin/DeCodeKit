package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class o9 {
    public static void a(k9 k9Var, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        k9Var.i(sb.toString());
    }

    public static void b(k9 k9Var, String str, Map map) {
        try {
            k9Var.e(str, com.google.android.gms.ads.internal.p.c().e0(map));
        } catch (JSONException unused) {
            tr.i("Could not convert parameters to JSON.");
        }
    }

    public static void c(k9 k9Var, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        k9Var.s(str, jSONObject.toString());
    }

    public static void d(k9 k9Var, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(string);
        sb.append(");");
        String strValueOf = String.valueOf(sb.toString());
        tr.f(strValueOf.length() != 0 ? "Dispatching AFMA event: ".concat(strValueOf) : new String("Dispatching AFMA event: "));
        k9Var.i(sb.toString());
    }
}
