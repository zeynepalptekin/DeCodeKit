package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class w extends s<Float> {
    w(int r2, String str, Float f) {
        super(1, str, f, null);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ Float g(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(a(), m().floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ Float h(Bundle bundle) {
        String strValueOf = String.valueOf(a());
        if (!bundle.containsKey(strValueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf) : new String("com.google.android.gms.ads.flag."))) {
            return m();
        }
        String strValueOf2 = String.valueOf(a());
        return Float.valueOf(bundle.getFloat(strValueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ void i(SharedPreferences.Editor editor, Float f) {
        editor.putFloat(a(), f.floatValue());
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ Float l(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(a(), m().floatValue()));
    }
}
