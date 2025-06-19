package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* loaded from: classes.dex */
final class tb implements os<cb> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ va f5375a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Object f5376b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ ks f5377c;
    private final /* synthetic */ ub d;

    tb(ub ubVar, va vaVar, Object obj, ks ksVar) {
        this.d = ubVar;
        this.f5375a = vaVar;
        this.f5376b = obj;
        this.f5377c = ksVar;
    }

    @Override // com.google.android.gms.internal.ads.os
    public final /* synthetic */ void a(cb cbVar) throws JSONException {
        this.d.d(this.f5375a, cbVar, this.f5376b, this.f5377c);
    }
}
