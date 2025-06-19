package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class eh extends hh2 implements fh {
    public static fh y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        return iInterfaceQueryLocalInterface instanceof fh ? (fh) iInterfaceQueryLocalInterface : new hh(iBinder);
    }
}
