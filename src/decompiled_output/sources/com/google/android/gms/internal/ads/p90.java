package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class p90 implements od0 {
    private final Context d;
    private final an1 e;
    private final as f;
    private final qo g;
    private final iv0 h;

    public p90(Context context, an1 an1Var, as asVar, qo qoVar, iv0 iv0Var) {
        this.d = context;
        this.e = an1Var;
        this.f = asVar;
        this.g = qoVar;
        this.h = iv0Var;
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void e0(wi wiVar) throws JSONException {
        if (((Boolean) qx2.e().c(e0.y2)).booleanValue()) {
            com.google.android.gms.ads.internal.p.k().a(this.d, this.f, this.e.f, this.g.i());
        }
        this.h.j();
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void t(wm1 wm1Var) {
    }
}
