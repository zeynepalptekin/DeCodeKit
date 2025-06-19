package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class xw implements rx1<Map<String, String>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ List f6047a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f6048b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ qw f6049c;

    xw(qw qwVar, List list, String str) {
        this.f6049c = qwVar;
        this.f6047a = list;
        this.f6048b = str;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(Map<String, String> map) {
        this.f6049c.y(map, this.f6047a, this.f6048b);
    }
}
