package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.e70;
import com.google.android.gms.internal.ads.ga0;

/* loaded from: classes.dex */
final class qj1<R extends ga0<AdT>, AdT extends e70> implements np1<AdT> {

    /* renamed from: a, reason: collision with root package name */
    private final ik1<R, cp1<AdT>> f5024a;

    public qj1(ik1<R, cp1<AdT>> ik1Var) {
        this.f5024a = ik1Var;
    }

    @Override // com.google.android.gms.internal.ads.np1
    public final void a(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.np1
    public final dy1<cp1<AdT>> b(qp1 qp1Var) {
        pj1 pj1Var = (pj1) qp1Var;
        return this.f5024a.b(pj1Var.f4825b, pj1Var.f4824a);
    }

    @Override // com.google.android.gms.internal.ads.np1
    public final void c(cp1<AdT> cp1Var) {
        cp1Var.f3012a = this.f5024a.a().b();
    }
}
