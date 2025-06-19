package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        boolean zP = false;
        boolean zP2 = false;
        boolean zP3 = false;
        while (parcel.dataPosition() < r0) {
            int r4 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r5 = com.google.android.gms.common.internal.z.b.O(r4);
            if (r5 == 2) {
                zP = com.google.android.gms.common.internal.z.b.P(parcel, r4);
            } else if (r5 == 3) {
                zP2 = com.google.android.gms.common.internal.z.b.P(parcel, r4);
            } else if (r5 != 4) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r4);
            } else {
                zP3 = com.google.android.gms.common.internal.z.b.P(parcel, r4);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new m(zP, zP2, zP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m[] newArray(int r1) {
        return new m[r1];
    }
}
