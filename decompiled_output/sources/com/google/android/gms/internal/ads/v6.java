package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class v6 implements z6<rw> {
    v6() {
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final /* synthetic */ void a(rw rwVar, Map map) {
        rw rwVar2 = rwVar;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            rwVar2.Q();
        } else if ("resume".equals(str)) {
            rwVar2.g0();
        }
    }
}
