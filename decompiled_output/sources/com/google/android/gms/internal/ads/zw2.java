package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class zw2 extends rx2<hy2> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f6316b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ qw2 f6317c;
    private final /* synthetic */ String d;
    private final /* synthetic */ qc e;
    private final /* synthetic */ ax2 f;

    zw2(ax2 ax2Var, Context context, qw2 qw2Var, String str, qc qcVar) {
        this.f = ax2Var;
        this.f6316b = context;
        this.f6317c = qw2Var;
        this.d = str;
        this.e = qcVar;
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ hy2 a(uy2 uy2Var) throws RemoteException {
        return uy2Var.r5(c.a.b.b.e.e.i2(this.f6316b), this.f6317c, this.d, this.e, 202510000);
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ hy2 c() {
        ax2.f(this.f6316b, "banner");
        return new z03();
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ hy2 d() throws RemoteException {
        return this.f.f2762a.c(this.f6316b, this.f6317c, this.d, this.e, 1);
    }
}
