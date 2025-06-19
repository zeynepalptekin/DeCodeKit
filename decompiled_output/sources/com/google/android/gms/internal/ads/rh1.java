package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final /* synthetic */ class rh1 implements cf1 {

    /* renamed from: a, reason: collision with root package name */
    static final cf1 f5140a = new rh1();

    private rh1() {
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final void b(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451009);
        } catch (JSONException unused) {
        }
    }
}
