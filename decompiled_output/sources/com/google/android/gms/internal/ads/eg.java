package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class eg {

    /* renamed from: a, reason: collision with root package name */
    private final rw f3266a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3267b;

    public eg(rw rwVar) {
        this(rwVar, "");
    }

    public eg(rw rwVar, String str) {
        this.f3266a = rwVar;
        this.f3267b = str;
    }

    public final void b(int r3, int r4, int r5, int r6) throws JSONException {
        try {
            this.f3266a.e("onSizeChanged", new JSONObject().put("x", r3).put("y", r4).put("width", r5).put("height", r6));
        } catch (JSONException e) {
            tr.c("Error occurred while dispatching size change.", e);
        }
    }

    public final void c(int r3, int r4, int r5, int r6, float f, int r8) throws JSONException {
        try {
            this.f3266a.e("onScreenInfoChanged", new JSONObject().put("width", r3).put("height", r4).put("maxSizeWidth", r5).put("maxSizeHeight", r6).put("density", f).put("rotation", r8));
        } catch (JSONException e) {
            tr.c("Error occurred while obtaining screen information.", e);
        }
    }

    public final void d(int r3, int r4, int r5, int r6) throws JSONException {
        try {
            this.f3266a.e("onDefaultPositionReceived", new JSONObject().put("x", r3).put("y", r4).put("width", r5).put("height", r6));
        } catch (JSONException e) {
            tr.c("Error occurred while dispatching default position.", e);
        }
    }

    public final void e(String str) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.f3267b);
            if (this.f3266a != null) {
                this.f3266a.e("onError", jSONObjectPut);
            }
        } catch (JSONException e) {
            tr.c("Error occurred while dispatching error event.", e);
        }
    }

    public final void f(String str) throws JSONException {
        try {
            this.f3266a.e("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            tr.c("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void g(String str) throws JSONException {
        try {
            this.f3266a.e("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            tr.c("Error occurred while dispatching state change.", e);
        }
    }
}
