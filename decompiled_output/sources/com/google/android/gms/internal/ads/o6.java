package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class o6 implements z6<rw> {
    o6() {
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final /* synthetic */ void a(rw rwVar, Map map) {
        JSONObject jSONObjectL0;
        rw rwVar2 = rwVar;
        x2 x2VarL0 = rwVar2.l0();
        if (x2VarL0 == null || (jSONObjectL0 = x2VarL0.L0()) == null) {
            rwVar2.e("nativeAdViewSignalsReady", new JSONObject());
        } else {
            rwVar2.e("nativeAdViewSignalsReady", jSONObjectL0);
        }
    }
}
