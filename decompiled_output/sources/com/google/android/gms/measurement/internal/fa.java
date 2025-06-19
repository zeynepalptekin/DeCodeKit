package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class fa implements Parcelable.Creator<ca> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ca createFromParcel(Parcel parcel) {
        int r1 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        Long lD0 = null;
        Float fW = null;
        String strG2 = null;
        String strG3 = null;
        Double dU = null;
        long jC0 = 0;
        int r7 = 0;
        while (parcel.dataPosition() < r1) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r2)) {
                case 1:
                    r7 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 2:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 3:
                    jC0 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 4:
                    lD0 = com.google.android.gms.common.internal.z.b.d0(parcel, r2);
                    break;
                case 5:
                    fW = com.google.android.gms.common.internal.z.b.W(parcel, r2);
                    break;
                case 6:
                    strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 7:
                    strG3 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 8:
                    dU = com.google.android.gms.common.internal.z.b.U(parcel, r2);
                    break;
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r2);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r1);
        return new ca(r7, strG, jC0, lD0, fW, strG2, strG3, dU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ca[] newArray(int r1) {
        return new ca[r1];
    }
}
