package com.google.android.gms.internal.ads;

/* JADX INFO: Add missing generic type declarations: [O] */
/* loaded from: classes.dex */
final class xq1<O> implements rx1<O> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ kq1 f6022a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ uq1 f6023b;

    xq1(uq1 uq1Var, kq1 kq1Var) {
        this.f6023b = uq1Var;
        this.f6022a = kq1Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        this.f6023b.f.f4591c.r0(this.f6022a, th);
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void b(O o) {
        this.f6023b.f.f4591c.P(this.f6022a);
    }
}
