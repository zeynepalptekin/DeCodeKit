package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class j9 {

    /* renamed from: a, reason: collision with root package name */
    private i9 f6420a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e9 f6421b;

    j9(e9 e9Var) {
        this.f6421b = e9Var;
    }

    @androidx.annotation.y0
    final void a() {
        this.f6421b.c();
        if (this.f6420a != null) {
            this.f6421b.f6377c.removeCallbacks(this.f6420a);
        }
        if (this.f6421b.j().p(u.w0)) {
            this.f6421b.i().w.a(false);
        }
    }

    @androidx.annotation.y0
    final void b(long j) {
        this.f6420a = new i9(this, this.f6421b.z().a(), j);
        this.f6421b.f6377c.postDelayed(this.f6420a, 2000L);
    }
}
