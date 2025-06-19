package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class v20 implements rx1<String> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f5627a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t20 f5628b;

    v20(t20 t20Var, String str) {
        this.f5628b = t20Var;
        this.f5627a = str;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        this.f5628b.j.c(this.f5628b.i.c(this.f5628b.g, this.f5628b.h, false, this.f5627a, null, this.f5628b.h.d));
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(@androidx.annotation.i0 String str) {
        this.f5628b.j.c(this.f5628b.i.c(this.f5628b.g, this.f5628b.h, false, this.f5627a, str, this.f5628b.h.d));
    }
}
