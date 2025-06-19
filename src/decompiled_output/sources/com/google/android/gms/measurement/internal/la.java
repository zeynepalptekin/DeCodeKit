package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class la implements Parcelable.Creator<ma> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ma createFromParcel(Parcel parcel) {
        int r1 = com.google.android.gms.common.internal.z.b.h0(parcel);
        long jC0 = 0;
        long jC02 = 0;
        long jC03 = 0;
        long jC04 = 0;
        long jC05 = 0;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        Boolean boolQ = null;
        ArrayList<String> arrayListI = null;
        String strG8 = null;
        long jC06 = -2147483648L;
        String strG9 = "";
        boolean zP = true;
        boolean zP2 = false;
        int r29 = 0;
        boolean zP3 = true;
        boolean zP4 = true;
        boolean zP5 = false;
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
                    strG3 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 5:
                    strG4 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 6:
                    jC0 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 7:
                    jC02 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 8:
                    strG5 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 9:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 10:
                    zP2 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 11:
                    jC06 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 12:
                    strG6 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 13:
                    jC03 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 14:
                    jC04 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 15:
                    r29 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 16:
                    zP3 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 17:
                    zP4 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 18:
                    zP5 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 19:
                    strG7 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 20:
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r2);
                    break;
                case 21:
                    boolQ = com.google.android.gms.common.internal.z.b.Q(parcel, r2);
                    break;
                case 22:
                    jC05 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 23:
                    arrayListI = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 24:
                    strG8 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 25:
                    strG9 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r1);
        return new ma(strG, strG2, strG3, strG4, jC0, jC02, strG5, zP, zP2, jC06, strG6, jC03, jC04, r29, zP3, zP4, zP5, strG7, boolQ, jC05, arrayListI, strG8, strG9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ma[] newArray(int r1) {
        return new ma[r1];
    }
}
