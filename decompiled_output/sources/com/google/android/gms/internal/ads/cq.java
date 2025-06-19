package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class cq implements Parcelable.Creator<yp> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ yp createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        int r2 = 0;
        while (parcel.dataPosition() < r0) {
            int r3 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r4 = com.google.android.gms.common.internal.z.b.O(r3);
            if (r4 == 1) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r3);
            } else if (r4 != 2) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r3);
            } else {
                r2 = com.google.android.gms.common.internal.z.b.Z(parcel, r3);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new yp(strG, r2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ yp[] newArray(int r1) {
        return new yp[r1];
    }
}
