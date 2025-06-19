package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class bx2 extends rx2<pg> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Activity f2895b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ ax2 f2896c;

    bx2(ax2 ax2Var, Activity activity) {
        this.f2896c = ax2Var;
        this.f2895b = activity;
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ pg a(uy2 uy2Var) throws RemoteException {
        return uy2Var.F0(c.a.b.b.e.e.i2(this.f2895b));
    }

    @Override // com.google.android.gms.internal.ads.rx2
    protected final /* synthetic */ pg c() {
        ax2.f(this.f2895b, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ pg d() throws RemoteException {
        return this.f2896c.g.c(this.f2895b);
    }
}
