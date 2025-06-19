package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class fz extends hh2 implements cz {
    public static cz y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return iInterfaceQueryLocalInterface instanceof cz ? (cz) iInterfaceQueryLocalInterface : new ez(iBinder);
    }
}
