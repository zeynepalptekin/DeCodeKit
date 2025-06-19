package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
final class e7 implements h7 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ks f3226a;

    e7(f7 f7Var, ks ksVar) {
        this.f3226a = ksVar;
    }

    @Override // com.google.android.gms.internal.ads.h7
    public final void S(@androidx.annotation.i0 String str) {
        this.f3226a.b(new hb(str));
    }

    @Override // com.google.android.gms.internal.ads.h7
    public final void a(JSONObject jSONObject) {
        this.f3226a.a(jSONObject);
    }
}
