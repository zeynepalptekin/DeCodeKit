package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class r extends s<Boolean> {
    r(int r2, String str, Boolean bool) {
        super(r2, str, bool, null);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ Boolean g(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(a(), m().booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ Boolean h(Bundle bundle) {
        String strValueOf = String.valueOf(a());
        if (!bundle.containsKey(strValueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf) : new String("com.google.android.gms.ads.flag."))) {
            return m();
        }
        String strValueOf2 = String.valueOf(a());
        return Boolean.valueOf(bundle.getBoolean(strValueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ void i(SharedPreferences.Editor editor, Boolean bool) {
        editor.putBoolean(a(), bool.booleanValue());
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ Boolean l(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(a(), m().booleanValue()));
    }
}
