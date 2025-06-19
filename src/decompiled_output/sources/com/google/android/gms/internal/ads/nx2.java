package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class nx2 extends rx2<xy2> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f4615b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ ax2 f4616c;

    nx2(ax2 ax2Var, Context context) {
        this.f4616c = ax2Var;
        this.f4615b = context;
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ xy2 a(uy2 uy2Var) throws RemoteException {
        return uy2Var.c6(c.a.b.b.e.e.i2(this.f4615b), 202510000);
    }

    @Override // com.google.android.gms.internal.ads.rx2
    protected final /* synthetic */ xy2 c() {
        ax2.f(this.f4615b, "mobile_ads_settings");
        return new b13();
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ xy2 d() throws RemoteException {
        return this.f4616c.f2764c.c(this.f4615b);
    }
}
