package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class w20 implements rx1<String> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t20 f5771a;

    w20(t20 t20Var) {
        this.f5771a = t20Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        hn1 hn1Var = this.f5771a.j;
        List<String> listC = this.f5771a.i.c(this.f5771a.g, this.f5771a.h, false, "", "failure_click_attok", this.f5771a.h.f4113c);
        com.google.android.gms.ads.internal.p.c();
        hn1Var.a(listC, to.M(this.f5771a.d) ? j01.f3893b : j01.f3892a);
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(@androidx.annotation.i0 String str) {
        String str2 = str;
        hn1 hn1Var = this.f5771a.j;
        List<String> listC = this.f5771a.i.c(this.f5771a.g, this.f5771a.h, false, "", str2, this.f5771a.h.f4113c);
        com.google.android.gms.ads.internal.p.c();
        hn1Var.a(listC, to.M(this.f5771a.d) ? j01.f3893b : j01.f3892a);
    }
}
