package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class t extends s<Long> {
    t(int r2, String str, Long l) {
        super(1, str, l, null);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ Long g(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(a(), m().longValue()));
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ Long h(Bundle bundle) {
        String strValueOf = String.valueOf(a());
        if (!bundle.containsKey(strValueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf) : new String("com.google.android.gms.ads.flag."))) {
            return m();
        }
        String strValueOf2 = String.valueOf(a());
        return Long.valueOf(bundle.getLong(strValueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ void i(SharedPreferences.Editor editor, Long l) {
        editor.putLong(a(), l.longValue());
    }

    @Override // com.google.android.gms.internal.ads.s
    public final /* synthetic */ Long l(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(a(), m().longValue()));
    }
}
