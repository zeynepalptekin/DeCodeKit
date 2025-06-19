package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
final /* synthetic */ class nl implements vr {

    /* renamed from: a, reason: collision with root package name */
    static final vr f4560a = new nl();

    private nl() {
    }

    @Override // com.google.android.gms.internal.ads.vr
    public final Object a(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return iInterfaceQueryLocalInterface instanceof al ? (al) iInterfaceQueryLocalInterface : new dl(iBinder);
    }
}
