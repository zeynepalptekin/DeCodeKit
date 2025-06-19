package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
final class mx2 extends rx2<o3> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FrameLayout f4464b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FrameLayout f4465c;
    private final /* synthetic */ Context d;
    private final /* synthetic */ ax2 e;

    mx2(ax2 ax2Var, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.e = ax2Var;
        this.f4464b = frameLayout;
        this.f4465c = frameLayout2;
        this.d = context;
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ o3 a(uy2 uy2Var) throws RemoteException {
        return uy2Var.s8(c.a.b.b.e.e.i2(this.f4464b), c.a.b.b.e.e.i2(this.f4465c));
    }

    @Override // com.google.android.gms.internal.ads.rx2
    protected final /* synthetic */ o3 c() {
        ax2.f(this.d, "native_ad_view_delegate");
        return new d13();
    }

    @Override // com.google.android.gms.internal.ads.rx2
    public final /* synthetic */ o3 d() throws RemoteException {
        return this.e.d.c(this.d, this.f4464b, this.f4465c);
    }
}
