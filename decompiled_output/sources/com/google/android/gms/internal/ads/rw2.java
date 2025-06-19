package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class rw2 implements Parcelable.Creator<sw2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ sw2 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        long jC0 = 0;
        int r6 = 0;
        int r7 = 0;
        while (parcel.dataPosition() < r0) {
            int r1 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r2 = com.google.android.gms.common.internal.z.b.O(r1);
            if (r2 == 1) {
                r6 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
            } else if (r2 == 2) {
                r7 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
            } else if (r2 == 3) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r1);
            } else if (r2 != 4) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r1);
            } else {
                jC0 = com.google.android.gms.common.internal.z.b.c0(parcel, r1);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new sw2(r6, r7, strG, jC0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ sw2[] newArray(int r1) {
        return new sw2[r1];
    }
}
