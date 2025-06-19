package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2748a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2749b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2750c;
    public final int d;
    private final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final int k;

    public au(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f2748a = a(jSONObject, "aggressive_media_codec_release", e0.B);
        this.f2749b = c(jSONObject, "byte_buffer_precache_limit", e0.j);
        this.f2750c = c(jSONObject, "exo_cache_buffer_size", e0.q);
        this.d = c(jSONObject, "exo_connect_timeout_millis", e0.f);
        this.e = d(jSONObject, "exo_player_version", e0.e);
        this.f = c(jSONObject, "exo_read_timeout_millis", e0.g);
        this.g = c(jSONObject, "load_check_interval_bytes", e0.h);
        this.h = c(jSONObject, "player_precache_limit", e0.i);
        this.i = c(jSONObject, "socket_receive_buffer_size", e0.k);
        this.j = a(jSONObject, "use_cache_data_source", e0.K2);
        this.k = c(jSONObject, "min_retry_count", e0.m);
    }

    private static boolean a(JSONObject jSONObject, String str, s<Boolean> sVar) {
        return b(jSONObject, str, ((Boolean) qx2.e().c(sVar)).booleanValue());
    }

    private static boolean b(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    private static int c(JSONObject jSONObject, String str, s<Integer> sVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) qx2.e().c(sVar)).intValue();
    }

    private static String d(JSONObject jSONObject, String str, s<String> sVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) qx2.e().c(sVar);
    }
}
