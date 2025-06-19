package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class of implements Parcelable.Creator<mf> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ mf createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        while (parcel.dataPosition() < r0) {
            int r4 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r5 = com.google.android.gms.common.internal.z.b.O(r4);
            if (r5 == 1) {
                r1 = com.google.android.gms.common.internal.z.b.Z(parcel, r4);
            } else if (r5 == 2) {
                r2 = com.google.android.gms.common.internal.z.b.Z(parcel, r4);
            } else if (r5 != 3) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r4);
            } else {
                r3 = com.google.android.gms.common.internal.z.b.Z(parcel, r4);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new mf(r1, r2, r3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ mf[] newArray(int r1) {
        return new mf[r1];
    }
}
