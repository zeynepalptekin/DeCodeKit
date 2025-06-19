package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class kx2 extends rx2<dy2> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f4158b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f4159c;
    private final /* synthetic */ qc d;
    private final /* synthetic */ ax2 e;

    kx2(ax2 ax2Var, Context context, String str, qc qcVar) {
        this.e = ax2Var;
        this.f4158b = context;
        this.f4159c = str;
        this.d = qcVar;
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ dy2 a(uy2 uy2Var) throws RemoteException {
        return uy2Var.N5(c.a.b.b.e.e.i2(this.f4158b), this.f4159c, this.d, 202510000);
    }

    @Override // com.google.android.gms.internal.ads.rx2
    protected final /* synthetic */ dy2 c() {
        ax2.f(this.f4158b, "native_ad");
        return new v03();
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ dy2 d() throws RemoteException {
        return this.e.f2763b.c(this.f4158b, this.f4159c, this.d);
    }
}
