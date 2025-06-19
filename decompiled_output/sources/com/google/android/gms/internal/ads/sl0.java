package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sl0 implements pe2<ql0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<km1> f5273a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<JSONObject> f5274b;

    public sl0(ze2<km1> ze2Var, ze2<JSONObject> ze2Var2) {
        this.f5273a = ze2Var;
        this.f5274b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ql0(this.f5273a.get(), this.f5274b.get());
    }
}
