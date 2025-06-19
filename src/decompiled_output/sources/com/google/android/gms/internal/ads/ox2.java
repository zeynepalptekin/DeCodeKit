package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class ox2 extends rx2<yj> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f4753b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ qc f4754c;
    private final /* synthetic */ ax2 d;

    ox2(ax2 ax2Var, Context context, qc qcVar) {
        this.d = ax2Var;
        this.f4753b = context;
        this.f4754c = qcVar;
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ yj a(uy2 uy2Var) throws RemoteException {
        return uy2Var.p7(c.a.b.b.e.e.i2(this.f4753b), this.f4754c, 202510000);
    }

    @Override // com.google.android.gms.internal.ads.rx2
    protected final /* synthetic */ yj c() {
        ax2.f(this.f4753b, "rewarded_video");
        return new c();
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ yj d() throws RemoteException {
        return this.d.e.c(this.f4753b, this.f4754c);
    }
}
