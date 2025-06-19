package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class lw2 implements Parcelable.Creator<jw2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ jw2 createFromParcel(Parcel parcel) {
        int r1 = com.google.android.gms.common.internal.z.b.h0(parcel);
        Bundle bundleG = null;
        ArrayList<String> arrayListI = null;
        String strG = null;
        i iVar = null;
        Location location = null;
        String strG2 = null;
        Bundle bundleG2 = null;
        Bundle bundleG3 = null;
        ArrayList<String> arrayListI2 = null;
        String strG3 = null;
        String strG4 = null;
        aw2 aw2Var = null;
        String strG5 = null;
        ArrayList<String> arrayListI3 = null;
        long jC0 = 0;
        int r7 = 0;
        int r11 = 0;
        boolean zP = false;
        int r14 = 0;
        boolean zP2 = false;
        boolean zP3 = false;
        int r27 = 0;
        while (parcel.dataPosition() < r1) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r2)) {
                case 1:
                    r7 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 2:
                    jC0 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 3:
                    bundleG = com.google.android.gms.common.internal.z.b.g(parcel, r2);
                    break;
                case 4:
                    r11 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 5:
                    arrayListI = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 6:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 7:
                    r14 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 8:
                    zP2 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 9:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 10:
                    iVar = (i) com.google.android.gms.common.internal.z.b.C(parcel, r2, i.CREATOR);
                    break;
                case 11:
                    location = (Location) com.google.android.gms.common.internal.z.b.C(parcel, r2, Location.CREATOR);
                    break;
                case 12:
                    strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 13:
                    bundleG2 = com.google.android.gms.common.internal.z.b.g(parcel, r2);
                    break;
                case 14:
                    bundleG3 = com.google.android.gms.common.internal.z.b.g(parcel, r2);
                    break;
                case 15:
                    arrayListI2 = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 16:
                    strG3 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 17:
                    strG4 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 18:
                    zP3 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 19:
                    aw2Var = (aw2) com.google.android.gms.common.internal.z.b.C(parcel, r2, aw2.CREATOR);
                    break;
                case 20:
                    r27 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 21:
                    strG5 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 22:
                    arrayListI3 = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r2);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r1);
        return new jw2(r7, jC0, bundleG, r11, arrayListI, zP, r14, zP2, strG, iVar, location, strG2, bundleG2, bundleG3, arrayListI2, strG3, strG4, zP3, aw2Var, r27, strG5, arrayListI3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ jw2[] newArray(int r1) {
        return new jw2[r1];
    }
}
