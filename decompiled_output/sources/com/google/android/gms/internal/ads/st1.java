package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class st1 implements Parcelable.Creator<pt1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ pt1 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        String strG2 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        while (parcel.dataPosition() < r0) {
            int r1 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r2 = com.google.android.gms.common.internal.z.b.O(r1);
            if (r2 == 1) {
                r4 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
            } else if (r2 == 2) {
                r5 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
            } else if (r2 == 3) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r1);
            } else if (r2 == 4) {
                strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r1);
            } else if (r2 != 5) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r1);
            } else {
                r6 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new pt1(r4, r5, r6, strG, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ pt1[] newArray(int r1) {
        return new pt1[r1];
    }
}
