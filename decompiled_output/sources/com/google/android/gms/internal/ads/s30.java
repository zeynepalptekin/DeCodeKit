package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s30 {
    @androidx.annotation.i0
    public static JSONObject a(km1 km1Var) {
        try {
            return new JSONObject(km1Var.y);
        } catch (JSONException unused) {
            return null;
        }
    }
}
