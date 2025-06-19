package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class cx2 extends rx2<tk> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f3044b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f3045c;
    private final /* synthetic */ qc d;
    private final /* synthetic */ ax2 e;

    cx2(ax2 ax2Var, Context context, String str, qc qcVar) {
        this.e = ax2Var;
        this.f3044b = context;
        this.f3045c = str;
        this.d = qcVar;
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ tk a(uy2 uy2Var) throws RemoteException {
        return uy2Var.D7(c.a.b.b.e.e.i2(this.f3044b), this.f3045c, this.d, 202510000);
    }

    @Override // com.google.android.gms.internal.ads.rx2
    protected final /* synthetic */ tk c() {
        ax2.f(this.f3044b, "rewarded");
        return new f13();
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ tk d() throws RemoteException {
        return kl.a(this.f3044b, this.f3045c, this.d);
    }
}
