package com.google.android.gms.internal.ads;

/* JADX INFO: Add missing generic type declarations: [AdT] */
/* loaded from: classes.dex */
final class lp1<AdT> implements rx1<cp1<AdT>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ kp1 f4292a;

    lp1(kp1 kp1Var) {
        this.f4292a = kp1Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        synchronized (this.f4292a) {
            this.f4292a.g.a(th);
            this.f4292a.f4134c.j(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(Object obj) {
        cp1<?> cp1Var = (cp1) obj;
        synchronized (this.f4292a) {
            this.f4292a.g.c(cp1Var);
            if (this.f4292a.e != ap1.h) {
                this.f4292a.f.e(this.f4292a.f4133b.a(), cp1Var);
            }
            if (this.f4292a.e == ap1.g) {
                this.f4292a.l(this.f4292a.f4133b);
            }
            this.f4292a.e = ap1.g;
            this.f4292a.f4134c.i(cp1Var);
        }
    }
}
