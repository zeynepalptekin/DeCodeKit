package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class v extends s<String> {
    v(int r2, String str, String str2) {
        super(r2, str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ String g(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(a(), m());
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ String h(Bundle bundle) {
        String strValueOf = String.valueOf(a());
        if (!bundle.containsKey(strValueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf) : new String("com.google.android.gms.ads.flag."))) {
            return m();
        }
        String strValueOf2 = String.valueOf(a());
        return bundle.getString(strValueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf2) : new String("com.google.android.gms.ads.flag."));
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ void i(SharedPreferences.Editor editor, String str) {
        editor.putString(a(), str);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ String l(JSONObject jSONObject) {
        return jSONObject.optString(a(), m());
    }
}
