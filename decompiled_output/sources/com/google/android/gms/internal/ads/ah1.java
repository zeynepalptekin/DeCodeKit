package com.google.android.gms.internal.ads;

import android.location.Location;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ah1 implements cf1<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final Location f2688a;

    public ah1(Location location) {
        this.f2688a = location;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        try {
            if (this.f2688a != null) {
                JSONObject jSONObject3 = new JSONObject();
                Float fValueOf = Float.valueOf(this.f2688a.getAccuracy() * 1000.0f);
                Long lValueOf = Long.valueOf(this.f2688a.getTime() * 1000);
                Long lValueOf2 = Long.valueOf((long) (this.f2688a.getLatitude() * 1.0E7d));
                Long lValueOf3 = Long.valueOf((long) (this.f2688a.getLongitude() * 1.0E7d));
                jSONObject3.put("radius", fValueOf);
                jSONObject3.put("lat", lValueOf2);
                jSONObject3.put("long", lValueOf3);
                jSONObject3.put("time", lValueOf);
                jSONObject2.put("uule", jSONObject3);
            }
        } catch (JSONException e) {
            oo.l("Failed adding location to the request JSON.", e);
        }
    }
}
