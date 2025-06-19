package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yk0 implements pe2<mr2> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<as> f6145a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<String> f6146b;

    public yk0(ze2<as> ze2Var, ze2<String> ze2Var2) {
        this.f6145a = ze2Var;
        this.f6146b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        as asVar = this.f6145a.get();
        String str = this.f6146b.get();
        com.google.android.gms.ads.internal.p.c();
        return (mr2) we2.b(new mr2(to.q0(), asVar, str, new JSONObject(), false, true), "Cannot return null from a non-@Nullable @Provides method");
    }
}
