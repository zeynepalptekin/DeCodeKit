package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class fx2 extends rx2<jn> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f3472b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ qc f3473c;

    fx2(ax2 ax2Var, Context context, qc qcVar) {
        this.f3472b = context;
        this.f3473c = qcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.rx2
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final jn d() {
        try {
            return ((kn) wr.a(this.f3472b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", ex2.f3338a)).d7(c.a.b.b.e.e.i2(this.f3472b), this.f3473c, 202510000);
        } catch (RemoteException | yr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ jn a(uy2 uy2Var) throws RemoteException {
        return uy2Var.Y1(c.a.b.b.e.e.i2(this.f3472b), this.f3473c, 202510000);
    }

    @Override // com.google.android.gms.internal.ads.rx2
    protected final /* bridge */ /* synthetic */ jn c() {
        return null;
    }
}
