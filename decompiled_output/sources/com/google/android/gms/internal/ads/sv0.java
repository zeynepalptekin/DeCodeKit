package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class sv0 extends b8 {
    private final /* synthetic */ Object e;
    private final /* synthetic */ String f;
    private final /* synthetic */ long g;
    private final /* synthetic */ ks h;
    private final /* synthetic */ iv0 i;

    sv0(iv0 iv0Var, Object obj, String str, long j, ks ksVar) {
        this.i = iv0Var;
        this.e = obj;
        this.f = str;
        this.g = j;
        this.h = ksVar;
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final void f0() {
        synchronized (this.e) {
            this.i.h(this.f, true, "", (int) (com.google.android.gms.ads.internal.p.j().c() - this.g));
            this.i.k.e(this.f);
            this.h.a(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final void i1(String str) {
        synchronized (this.e) {
            this.i.h(this.f, false, str, (int) (com.google.android.gms.ads.internal.p.j().c() - this.g));
            this.i.k.f(this.f, "error");
            this.h.a(Boolean.FALSE);
        }
    }
}
