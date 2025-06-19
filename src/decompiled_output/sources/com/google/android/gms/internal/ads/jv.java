package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jv implements aw {
    @Override // com.google.android.gms.internal.ads.aw
    public final sv a(zt ztVar, int r2, String str, au auVar) {
        if (r2 <= 0) {
            return new zv(ztVar);
        }
        int r22 = xu.u();
        return r22 < auVar.h ? new dw(ztVar, auVar) : r22 < auVar.f2749b ? new ew(ztVar, auVar) : new cw(ztVar);
    }
}
