package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class u6 implements z6<rw> {
    u6() {
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final /* synthetic */ void a(rw rwVar, Map map) {
        rw rwVar2 = rwVar;
        if (map.keySet().contains("start")) {
            rwVar2.C0().p();
        } else if (map.keySet().contains("stop")) {
            rwVar2.C0().j();
        } else if (map.keySet().contains("cancel")) {
            rwVar2.C0().c();
        }
    }
}
