package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class it1 implements Parcelable.Creator<ft1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ft1 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        String strG2 = null;
        int r3 = 0;
        while (parcel.dataPosition() < r0) {
            int r4 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r5 = com.google.android.gms.common.internal.z.b.O(r4);
            if (r5 == 1) {
                r3 = com.google.android.gms.common.internal.z.b.Z(parcel, r4);
            } else if (r5 == 2) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r4);
            } else if (r5 != 3) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r4);
            } else {
                strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r4);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new ft1(r3, strG, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ft1[] newArray(int r1) {
        return new ft1[r1];
    }
}
