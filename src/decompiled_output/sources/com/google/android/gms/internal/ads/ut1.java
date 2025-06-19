package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ut1 implements Parcelable.Creator<rt1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ rt1 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        int r1 = 0;
        byte[] bArrH = null;
        int r2 = 0;
        while (parcel.dataPosition() < r0) {
            int r4 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r5 = com.google.android.gms.common.internal.z.b.O(r4);
            if (r5 == 1) {
                r1 = com.google.android.gms.common.internal.z.b.Z(parcel, r4);
            } else if (r5 == 2) {
                bArrH = com.google.android.gms.common.internal.z.b.h(parcel, r4);
            } else if (r5 != 3) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r4);
            } else {
                r2 = com.google.android.gms.common.internal.z.b.Z(parcel, r4);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new rt1(r1, bArrH, r2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ rt1[] newArray(int r1) {
        return new rt1[r1];
    }
}
