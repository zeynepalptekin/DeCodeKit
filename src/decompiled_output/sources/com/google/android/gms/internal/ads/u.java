package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class u extends s<Integer> {
    u(int r2, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ Integer g(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(a(), m().intValue()));
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ Integer h(Bundle bundle) {
        String strValueOf = String.valueOf(a());
        if (!bundle.containsKey(strValueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf) : new String("com.google.android.gms.ads.flag."))) {
            return m();
        }
        String strValueOf2 = String.valueOf(a());
        return Integer.valueOf(bundle.getInt(strValueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ void i(SharedPreferences.Editor editor, Integer num) {
        editor.putInt(a(), num.intValue());
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ Integer l(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(a(), m().intValue()));
    }
}
