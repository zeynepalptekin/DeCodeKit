package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class kg extends hh2 implements lg {
    public static lg y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return iInterfaceQueryLocalInterface instanceof lg ? (lg) iInterfaceQueryLocalInterface : new ng(iBinder);
    }
}
