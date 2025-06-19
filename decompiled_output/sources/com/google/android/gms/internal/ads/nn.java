package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class nn extends hh2 implements kn {
    public static kn y8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return iInterfaceQueryLocalInterface instanceof kn ? (kn) iInterfaceQueryLocalInterface : new mn(iBinder);
    }
}
