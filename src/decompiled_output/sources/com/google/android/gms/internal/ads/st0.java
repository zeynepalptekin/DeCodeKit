package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class st0 implements pe2<rt0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<tu2> f5303a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Map<zq1, tt0>> f5304b;

    private st0(ze2<tu2> ze2Var, ze2<Map<zq1, tt0>> ze2Var2) {
        this.f5303a = ze2Var;
        this.f5304b = ze2Var2;
    }

    public static st0 a(ze2<tu2> ze2Var, ze2<Map<zq1, tt0>> ze2Var2) {
        return new st0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new rt0(this.f5303a.get(), this.f5304b.get());
    }
}
