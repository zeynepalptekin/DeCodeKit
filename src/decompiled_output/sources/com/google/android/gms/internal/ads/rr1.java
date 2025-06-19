package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class rr1 extends hh2 implements sr1 {
    public static sr1 y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        return iInterfaceQueryLocalInterface instanceof sr1 ? (sr1) iInterfaceQueryLocalInterface : new tr1(iBinder);
    }
}
