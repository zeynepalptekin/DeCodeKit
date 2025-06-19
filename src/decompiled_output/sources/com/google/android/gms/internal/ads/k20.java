package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class k20 implements m20 {

    /* renamed from: a, reason: collision with root package name */
    private qo f4047a;

    public k20(qo qoVar) {
        this.f4047a = qoVar;
    }

    @Override // com.google.android.gms.internal.ads.m20
    public final void a(Map<String, String> map) {
        this.f4047a.D(Boolean.parseBoolean(map.get("content_url_opted_out")));
    }
}
