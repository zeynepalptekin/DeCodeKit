package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class wb implements ms {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ks f5813a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ va f5814b;

    wb(ub ubVar, ks ksVar, va vaVar) {
        this.f5813a = ksVar;
        this.f5814b = vaVar;
    }

    @Override // com.google.android.gms.internal.ads.ms
    public final void run() {
        this.f5813a.b(new hb("Unable to obtain a JavascriptEngine."));
        this.f5814b.f();
    }
}
