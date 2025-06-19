package com.google.android.gms.ads;

import androidx.annotation.h0;
import androidx.annotation.i0;
import com.google.android.gms.internal.ads.e0;
import com.google.android.gms.internal.ads.qx2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m extends a {

    @i0
    private final y f;

    public m(int r1, @h0 String str, @h0 String str2, @i0 a aVar, @i0 y yVar) {
        super(r1, str, str2, aVar);
        this.f = yVar;
    }

    @Override // com.google.android.gms.ads.a
    public final JSONObject f() throws JSONException {
        JSONObject jSONObjectF = super.f();
        y yVarG = g();
        jSONObjectF.put("Response Info", yVarG == null ? "null" : yVarG.e());
        return jSONObjectF;
    }

    @i0
    public final y g() {
        if (((Boolean) qx2.e().c(e0.x5)).booleanValue()) {
            return this.f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.a
    public final String toString() {
        try {
            return f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
