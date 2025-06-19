package com.google.android.gms.internal.ads;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
final class ts<T> implements rx1<T> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ os f5441a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ms f5442b;

    ts(rs rsVar, os osVar, ms msVar) {
        this.f5441a = osVar;
        this.f5442b = msVar;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        this.f5442b.run();
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void b(@androidx.annotation.i0 T t) {
        this.f5441a.a(t);
    }
}
