package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class ox0 extends si {
    private final /* synthetic */ lx0 e;

    protected ox0(lx0 lx0Var) {
        this.e = lx0Var;
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final void R6(yp ypVar) {
        this.e.d.b(new dq(ypVar.d, ypVar.e));
    }

    @Override // com.google.android.gms.internal.ads.pi
    public final void k2(ParcelFileDescriptor parcelFileDescriptor) {
        this.e.d.a(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
