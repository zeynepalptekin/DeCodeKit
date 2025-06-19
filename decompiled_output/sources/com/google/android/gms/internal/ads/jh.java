package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class jh extends hh2 implements gh {
    public static gh y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return iInterfaceQueryLocalInterface instanceof gh ? (gh) iInterfaceQueryLocalInterface : new ih(iBinder);
    }
}
