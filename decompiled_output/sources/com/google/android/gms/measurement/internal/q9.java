package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class q9 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.g f6495a;

    /* renamed from: b, reason: collision with root package name */
    private long f6496b;

    public q9(com.google.android.gms.common.util.g gVar) {
        com.google.android.gms.common.internal.r.k(gVar);
        this.f6495a = gVar;
    }

    public final void a() {
        this.f6496b = this.f6495a.c();
    }

    public final boolean b(long j) {
        return this.f6496b == 0 || this.f6495a.c() - this.f6496b >= 3600000;
    }

    public final void c() {
        this.f6496b = 0L;
    }
}
