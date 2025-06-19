package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class gw2 implements Parcelable.Creator<dw2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ dw2 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        String strG2 = null;
        dw2 dw2Var = null;
        IBinder iBinderY = null;
        int r4 = 0;
        while (parcel.dataPosition() < r0) {
            int r1 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r2 = com.google.android.gms.common.internal.z.b.O(r1);
            if (r2 == 1) {
                r4 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
            } else if (r2 == 2) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r1);
            } else if (r2 == 3) {
                strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r1);
            } else if (r2 == 4) {
                dw2Var = (dw2) com.google.android.gms.common.internal.z.b.C(parcel, r1, dw2.CREATOR);
            } else if (r2 != 5) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r1);
            } else {
                iBinderY = com.google.android.gms.common.internal.z.b.Y(parcel, r1);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new dw2(r4, strG, strG2, dw2Var, iBinderY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ dw2[] newArray(int r1) {
        return new dw2[r1];
    }
}
