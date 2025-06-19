package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class hx2 extends rx2<gg> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f3729b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ qc f3730c;

    hx2(ax2 ax2Var, Context context, qc qcVar) {
        this.f3729b = context;
        this.f3730c = qcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.rx2
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final gg d() {
        try {
            return ((lg) wr.a(this.f3729b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", gx2.f3593a)).Y0(c.a.b.b.e.e.i2(this.f3729b), this.f3730c, 202510000);
        } catch (RemoteException | yr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ gg a(uy2 uy2Var) throws RemoteException {
        return uy2Var.Y0(c.a.b.b.e.e.i2(this.f3729b), this.f3730c, 202510000);
    }

    @Override // com.google.android.gms.internal.ads.rx2
    protected final /* bridge */ /* synthetic */ gg c() {
        return null;
    }
}
