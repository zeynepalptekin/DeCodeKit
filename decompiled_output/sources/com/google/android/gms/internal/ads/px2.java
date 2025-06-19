package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes.dex */
final class px2 extends rx2<r3> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ View f4914b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ HashMap f4915c;
    private final /* synthetic */ HashMap d;
    private final /* synthetic */ ax2 e;

    px2(ax2 ax2Var, View view, HashMap map, HashMap map2) {
        this.e = ax2Var;
        this.f4914b = view;
        this.f4915c = map;
        this.d = map2;
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ r3 a(uy2 uy2Var) throws RemoteException {
        return uy2Var.t3(c.a.b.b.e.e.i2(this.f4914b), c.a.b.b.e.e.i2(this.f4915c), c.a.b.b.e.e.i2(this.d));
    }

    @Override // com.google.android.gms.internal.ads.rx2
    protected final /* synthetic */ r3 c() {
        ax2.f(this.f4914b.getContext(), "native_ad_view_holder_delegate");
        return new c13();
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ r3 d() throws RemoteException {
        return this.e.h.c(this.f4914b, this.f4915c, this.d);
    }
}
