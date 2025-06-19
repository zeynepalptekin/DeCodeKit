package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class q0 extends c.a.b.b.g.b.a implements r0 {
    public static r0 b2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof r0 ? (r0) iInterfaceQueryLocalInterface : new s0(iBinder);
    }
}
