package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class x6 implements z6<rw> {
    x6() {
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final /* synthetic */ void a(rw rwVar, Map map) {
        rw rwVar2 = rwVar;
        if (map.keySet().contains("start")) {
            rwVar2.Z(true);
        }
        if (map.keySet().contains("stop")) {
            rwVar2.Z(false);
        }
    }
}
