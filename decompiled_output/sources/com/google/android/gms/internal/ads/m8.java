package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m8 implements Parcelable.Creator<n8> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n8 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        int r1 = 0;
        String strG = null;
        int r2 = 0;
        int r3 = 0;
        while (parcel.dataPosition() < r0) {
            int r5 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r6 = com.google.android.gms.common.internal.z.b.O(r5);
            if (r6 == 1) {
                r2 = com.google.android.gms.common.internal.z.b.Z(parcel, r5);
            } else if (r6 == 2) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r5);
            } else if (r6 == 3) {
                r3 = com.google.android.gms.common.internal.z.b.Z(parcel, r5);
            } else if (r6 != 1000) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r5);
            } else {
                r1 = com.google.android.gms.common.internal.z.b.Z(parcel, r5);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new n8(r1, r2, strG, r3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n8[] newArray(int r1) {
        return new n8[r1];
    }
}
