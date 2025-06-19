package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class i20 implements ax1<wm1, wm1> {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, m20> f3752a;

    public i20(Map<String, m20> map) {
        this.f3752a = map;
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public final /* synthetic */ dy1<wm1> a(wm1 wm1Var) throws Exception {
        wm1 wm1Var2 = wm1Var;
        for (xm1 xm1Var : wm1Var2.f5858b.f5552c) {
            if (this.f3752a.containsKey(xm1Var.f6003a)) {
                this.f3752a.get(xm1Var.f6003a).a(xm1Var.f6004b);
            }
        }
        return qx1.g(wm1Var2);
    }
}
