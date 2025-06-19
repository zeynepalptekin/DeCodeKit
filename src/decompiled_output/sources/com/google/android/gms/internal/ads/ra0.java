package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class ra0 extends sz2 {
    private final String e;
    private final String f;
    private final List<uw2> g;

    public ra0(km1 km1Var, String str, x01 x01Var) {
        this.f = km1Var == null ? null : km1Var.W;
        String strZ8 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) ? z8(km1Var) : null;
        this.e = strZ8 != null ? strZ8 : str;
        this.g = x01Var.a();
    }

    private static String z8(km1 km1Var) {
        try {
            return km1Var.u.getString("class_name");
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.tz2
    public final String e() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.tz2
    public final String f4() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.tz2
    @androidx.annotation.i0
    public final List<uw2> j2() {
        if (((Boolean) qx2.e().c(e0.x5)).booleanValue()) {
            return this.g;
        }
        return null;
    }
}
