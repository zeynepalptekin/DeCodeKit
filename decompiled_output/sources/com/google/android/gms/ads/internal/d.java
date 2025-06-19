package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.ax1;
import com.google.android.gms.internal.ads.dy1;
import com.google.android.gms.internal.ads.qx1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final /* synthetic */ class d implements ax1 {

    /* renamed from: a, reason: collision with root package name */
    static final ax1 f2406a = new d();

    private d() {
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public final dy1 a(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            p.g().r().k(jSONObject.getString("appSettingsJson"));
        }
        return qx1.g(null);
    }
}
