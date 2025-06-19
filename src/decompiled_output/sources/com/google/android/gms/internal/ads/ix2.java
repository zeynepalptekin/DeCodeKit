package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes.dex */
final class ix2 extends rx2<hy2> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f3880b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ qw2 f3881c;
    private final /* synthetic */ String d;
    private final /* synthetic */ ax2 e;

    ix2(ax2 ax2Var, Context context, qw2 qw2Var, String str) {
        this.e = ax2Var;
        this.f3880b = context;
        this.f3881c = qw2Var;
        this.d = str;
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ hy2 a(uy2 uy2Var) throws RemoteException {
        return uy2Var.t2(c.a.b.b.e.e.i2(this.f3880b), this.f3881c, this.d, 202510000);
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ hy2 c() {
        ax2.f(this.f3880b, FirebaseAnalytics.a.r);
        return new z03();
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ hy2 d() throws RemoteException {
        return this.e.f2762a.c(this.f3880b, this.f3881c, this.d, null, 3);
    }
}
