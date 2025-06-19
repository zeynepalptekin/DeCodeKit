package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class zy0 implements rx1<ParcelFileDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ pi f6321a;

    zy0(my0 my0Var, pi piVar) {
        this.f6321a = piVar;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        try {
            this.f6321a.R6(yp.h(th));
        } catch (RemoteException e) {
            oo.l("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.f6321a.k2(parcelFileDescriptor);
        } catch (RemoteException e) {
            oo.l("Service can't call client", e);
        }
    }
}
