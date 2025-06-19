package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zo1 implements Parcelable.Creator<yo1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ yo1 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r9 = 0;
        int r10 = 0;
        while (parcel.dataPosition() < r0) {
            int r1 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r1)) {
                case 1:
                    r4 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
                    break;
                case 2:
                    r5 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
                    break;
                case 3:
                    r6 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
                    break;
                case 4:
                    r7 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
                    break;
                case 5:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r1);
                    break;
                case 6:
                    r9 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
                    break;
                case 7:
                    r10 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
                    break;
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r1);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new yo1(r4, r5, r6, r7, strG, r9, r10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ yo1[] newArray(int r1) {
        return new yo1[r1];
    }
}
