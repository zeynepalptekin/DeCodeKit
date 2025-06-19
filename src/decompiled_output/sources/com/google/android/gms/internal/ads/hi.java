package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hi implements Parcelable.Creator<ii> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ii createFromParcel(Parcel parcel) {
        int r1 = com.google.android.gms.common.internal.z.b.h0(parcel);
        long jC0 = 0;
        long jC02 = 0;
        long jC03 = 0;
        long jC04 = 0;
        String strG = null;
        String strG2 = null;
        ArrayList<String> arrayListI = null;
        ArrayList<String> arrayListI2 = null;
        ArrayList<String> arrayListI3 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        String strG6 = null;
        vi viVar = null;
        String strG7 = null;
        String strG8 = null;
        qk qkVar = null;
        ArrayList<String> arrayListI4 = null;
        ArrayList<String> arrayListI5 = null;
        ki kiVar = null;
        String strG9 = null;
        ArrayList<String> arrayListI6 = null;
        String strG10 = null;
        dm dmVar = null;
        String strG11 = null;
        Bundle bundleG = null;
        ArrayList<String> arrayListI7 = null;
        String strG12 = null;
        String strG13 = null;
        int r7 = 0;
        int r11 = 0;
        boolean zP = false;
        int r21 = 0;
        boolean zP2 = false;
        boolean zP3 = false;
        boolean zP4 = false;
        boolean zP5 = false;
        boolean zP6 = false;
        boolean zP7 = false;
        boolean zP8 = false;
        boolean zP9 = false;
        boolean zP10 = false;
        boolean zP11 = false;
        boolean zP12 = false;
        boolean zP13 = false;
        boolean zP14 = false;
        boolean zP15 = false;
        int r55 = 0;
        boolean zP16 = false;
        boolean zP17 = false;
        boolean zP18 = false;
        boolean zP19 = false;
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
                    strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 4:
                    arrayListI = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 5:
                    r11 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 6:
                    arrayListI2 = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 7:
                    jC0 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 8:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 9:
                    jC02 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 10:
                    arrayListI3 = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 11:
                    jC03 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 12:
                    r21 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 13:
                    strG3 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 14:
                    jC04 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 15:
                    strG4 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 16:
                case 17:
                case 20:
                case 27:
                case 41:
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r2);
                    break;
                case 18:
                    zP2 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 19:
                    strG5 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 21:
                    strG6 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 22:
                    zP3 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 23:
                    zP4 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 24:
                    zP5 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 25:
                    zP6 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 26:
                    zP7 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 28:
                    viVar = (vi) com.google.android.gms.common.internal.z.b.C(parcel, r2, vi.CREATOR);
                    break;
                case 29:
                    strG7 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 30:
                    strG8 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 31:
                    zP8 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 32:
                    zP9 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 33:
                    qkVar = (qk) com.google.android.gms.common.internal.z.b.C(parcel, r2, qk.CREATOR);
                    break;
                case 34:
                    arrayListI4 = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 35:
                    arrayListI5 = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 36:
                    zP10 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 37:
                    kiVar = (ki) com.google.android.gms.common.internal.z.b.C(parcel, r2, ki.CREATOR);
                    break;
                case 38:
                    zP11 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 39:
                    strG9 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 40:
                    arrayListI6 = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 42:
                    zP12 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 43:
                    strG10 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 44:
                    dmVar = (dm) com.google.android.gms.common.internal.z.b.C(parcel, r2, dm.CREATOR);
                    break;
                case 45:
                    strG11 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 46:
                    zP13 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 47:
                    zP14 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 48:
                    bundleG = com.google.android.gms.common.internal.z.b.g(parcel, r2);
                    break;
                case 49:
                    zP15 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 50:
                    r55 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 51:
                    zP16 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 52:
                    arrayListI7 = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 53:
                    zP17 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 54:
                    strG12 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 55:
                    strG13 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 56:
                    zP18 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 57:
                    zP19 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r1);
        return new ii(r7, strG, strG2, arrayListI, r11, arrayListI2, jC0, zP, jC02, arrayListI3, jC03, r21, strG3, jC04, strG4, zP2, strG5, strG6, zP3, zP4, zP5, zP6, zP7, viVar, strG7, strG8, zP8, zP9, qkVar, arrayListI4, arrayListI5, zP10, kiVar, zP11, strG9, arrayListI6, zP12, strG10, dmVar, strG11, zP13, zP14, bundleG, zP15, r55, zP16, arrayListI7, zP17, strG12, strG13, zP18, zP19);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ii[] newArray(int r1) {
        return new ii[r1];
    }
}
