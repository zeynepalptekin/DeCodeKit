package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2679a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2680b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2681c;
    private final boolean d;
    private final boolean e;

    private ag(cg cgVar) {
        this.f2679a = cgVar.f2966a;
        this.f2680b = cgVar.f2967b;
        this.f2681c = cgVar.f2968c;
        this.d = cgVar.d;
        this.e = cgVar.e;
    }

    public final JSONObject a() {
        try {
            return new JSONObject().put("sms", this.f2679a).put("tel", this.f2680b).put("calendar", this.f2681c).put("storePicture", this.d).put("inlineVideo", this.e);
        } catch (JSONException e) {
            tr.c("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
