package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class s20 implements m20 {

    /* renamed from: a, reason: collision with root package name */
    private final qo f5215a;

    public s20(qo qoVar) {
        this.f5215a = qoVar;
    }

    @Override // com.google.android.gms.internal.ads.m20
    public final void a(Map<String, String> map) {
        String str = map.get("key");
        String str2 = map.get("value");
        if ("auto_collect_location".equals(str)) {
            this.f5215a.t(Boolean.parseBoolean(str2));
        }
    }
}
