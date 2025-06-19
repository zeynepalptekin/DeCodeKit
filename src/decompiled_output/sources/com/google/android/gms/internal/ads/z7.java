package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z7 implements Parcelable.Creator<a8> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a8 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        boolean zP = false;
        String strG = null;
        String strG2 = null;
        int r2 = 0;
        while (parcel.dataPosition() < r0) {
            int r5 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r6 = com.google.android.gms.common.internal.z.b.O(r5);
            if (r6 == 1) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r5);
            } else if (r6 == 2) {
                zP = com.google.android.gms.common.internal.z.b.P(parcel, r5);
            } else if (r6 == 3) {
                r2 = com.google.android.gms.common.internal.z.b.Z(parcel, r5);
            } else if (r6 != 4) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r5);
            } else {
                strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r5);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new a8(strG, zP, r2, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a8[] newArray(int r1) {
        return new a8[r1];
    }
}
