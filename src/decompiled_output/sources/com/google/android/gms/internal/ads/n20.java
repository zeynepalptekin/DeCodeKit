package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class n20 implements m20 {

    /* renamed from: a, reason: collision with root package name */
    private qo f4477a;

    public n20(qo qoVar) {
        this.f4477a = qoVar;
    }

    @Override // com.google.android.gms.internal.ads.m20
    public final void a(Map<String, String> map) {
        this.f4477a.m(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
