package com.google.android.gms.internal.ads;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
final class qs<T> implements rx1<T> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ rs f5056a;

    qs(rs rsVar) {
        this.f5056a = rsVar;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        this.f5056a.f5181b.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void b(@androidx.annotation.i0 T t) {
        this.f5056a.f5181b.set(1);
    }
}
