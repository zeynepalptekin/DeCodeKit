package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class th1 implements cf1<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f5399a;

    public th1(Map<String, Object> map) {
        this.f5399a = map;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("video_decoders", com.google.android.gms.ads.internal.p.c().e0(this.f5399a));
        } catch (JSONException e) {
            String strValueOf = String.valueOf(e.getMessage());
            oo.m(strValueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(strValueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
