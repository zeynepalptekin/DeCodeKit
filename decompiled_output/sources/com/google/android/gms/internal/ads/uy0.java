package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
final /* synthetic */ class uy0 implements iq1 {

    /* renamed from: a, reason: collision with root package name */
    static final iq1 f5613a = new uy0();

    private uy0() {
    }

    @Override // com.google.android.gms.internal.ads.iq1
    public final Object a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        oo.m("Ad request signals:");
        oo.m(jSONObject.toString(2));
        return jSONObject;
    }
}
