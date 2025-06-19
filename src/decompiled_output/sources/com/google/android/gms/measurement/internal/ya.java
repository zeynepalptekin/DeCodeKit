package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ya implements Parcelable.Creator<va> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ va createFromParcel(Parcel parcel) {
        int r1 = com.google.android.gms.common.internal.z.b.h0(parcel);
        long jC0 = 0;
        long jC02 = 0;
        long jC03 = 0;
        String strG = null;
        String strG2 = null;
        ca caVar = null;
        String strG3 = null;
        s sVar = null;
        s sVar2 = null;
        s sVar3 = null;
        boolean zP = false;
        while (parcel.dataPosition() < r1) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r2)) {
                case 2:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 3:
                    strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 4:
                    caVar = (ca) com.google.android.gms.common.internal.z.b.C(parcel, r2, ca.CREATOR);
                    break;
                case 5:
                    jC0 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 6:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 7:
                    strG3 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 8:
                    sVar = (s) com.google.android.gms.common.internal.z.b.C(parcel, r2, s.CREATOR);
                    break;
                case 9:
                    jC02 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 10:
                    sVar2 = (s) com.google.android.gms.common.internal.z.b.C(parcel, r2, s.CREATOR);
                    break;
                case 11:
                    jC03 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 12:
                    sVar3 = (s) com.google.android.gms.common.internal.z.b.C(parcel, r2, s.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r2);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r1);
        return new va(strG, strG2, caVar, jC0, zP, strG3, sVar, jC02, sVar2, jC03, sVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ va[] newArray(int r1) {
        return new va[r1];
    }
}
