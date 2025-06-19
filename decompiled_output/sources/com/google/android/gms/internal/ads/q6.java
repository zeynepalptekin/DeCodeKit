package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class q6 implements z6<Object> {
    q6() {
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final void a(Object obj, Map<String, String> map) {
        String strValueOf = String.valueOf(map.get("string"));
        tr.h(strValueOf.length() != 0 ? "Received log message: ".concat(strValueOf) : new String("Received log message: "));
    }
}
