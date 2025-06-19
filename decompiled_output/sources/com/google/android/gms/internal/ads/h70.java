package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class h70<AdT> implements pe2<i70<AdT>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Map<String, u01<AdT>>> f3635a;

    private h70(ze2<Map<String, u01<AdT>>> ze2Var) {
        this.f3635a = ze2Var;
    }

    public static <AdT> h70<AdT> a(ze2<Map<String, u01<AdT>>> ze2Var) {
        return new h70<>(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new i70(this.f3635a.get());
    }
}
