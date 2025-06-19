package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class lx2 extends rx2<hy2> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f4315b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ qw2 f4316c;
    private final /* synthetic */ String d;
    private final /* synthetic */ qc e;
    private final /* synthetic */ ax2 f;

    lx2(ax2 ax2Var, Context context, qw2 qw2Var, String str, qc qcVar) {
        this.f = ax2Var;
        this.f4315b = context;
        this.f4316c = qw2Var;
        this.d = str;
        this.e = qcVar;
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ hy2 a(uy2 uy2Var) throws RemoteException {
        return uy2Var.W6(c.a.b.b.e.e.i2(this.f4315b), this.f4316c, this.d, this.e, 202510000);
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ hy2 c() {
        ax2.f(this.f4315b, "interstitial");
        return new z03();
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ hy2 d() throws RemoteException {
        return this.f.f2762a.c(this.f4315b, this.f4316c, this.d, this.e, 2);
    }
}
