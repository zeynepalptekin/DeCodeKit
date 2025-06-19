package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rk0 implements pe2<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final pk0 f5149a;

    public rk0(pk0 pk0Var) {
        this.f5149a = pk0Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (JSONObject) we2.b(this.f5149a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
