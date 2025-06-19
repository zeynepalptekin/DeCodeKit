package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
final class y21 implements pj0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6082a;

    /* renamed from: b, reason: collision with root package name */
    private final as f6083b;

    /* renamed from: c, reason: collision with root package name */
    private final dy1<ii0> f6084c;
    private final km1 d;
    private final rw e;

    private y21(Context context, as asVar, dy1<ii0> dy1Var, km1 km1Var, rw rwVar) {
        this.f6082a = context;
        this.f6083b = asVar;
        this.f6084c = dy1Var;
        this.d = km1Var;
        this.e = rwVar;
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final void a(boolean z, Context context) throws NumberFormatException {
        ii0 ii0Var = (ii0) qx1.l(this.f6084c);
        this.e.y0(true);
        com.google.android.gms.ads.internal.p.c();
        com.google.android.gms.ads.internal.i iVar = new com.google.android.gms.ads.internal.i(false, to.J(this.f6082a), false, 0.0f, -1, z, this.d.J, false);
        com.google.android.gms.ads.internal.p.b();
        fj0 fj0VarI = ii0Var.i();
        rw rwVar = this.e;
        km1 km1Var = this.d;
        int r9 = km1Var.L;
        as asVar = this.f6083b;
        String str = km1Var.A;
        nm1 nm1Var = km1Var.r;
        com.google.android.gms.ads.internal.overlay.l.a(context, new AdOverlayInfoParcel((zv2) null, fj0VarI, (com.google.android.gms.ads.internal.overlay.v) null, rwVar, r9, asVar, str, iVar, nm1Var.f4570b, nm1Var.f4569a), true);
    }
}
