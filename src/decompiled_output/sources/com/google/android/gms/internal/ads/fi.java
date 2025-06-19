package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fi implements Parcelable.Creator<gi> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ gi createFromParcel(Parcel parcel) {
        int r1 = com.google.android.gms.common.internal.z.b.h0(parcel);
        long jC0 = 0;
        long jC02 = 0;
        Bundle bundleG = null;
        jw2 jw2Var = null;
        qw2 qw2Var = null;
        String strG = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        as asVar = null;
        Bundle bundleG2 = null;
        ArrayList<String> arrayListI = null;
        Bundle bundleG3 = null;
        String strG5 = null;
        String strG6 = null;
        ArrayList<String> arrayListI2 = null;
        String strG7 = null;
        z2 z2Var = null;
        ArrayList<String> arrayListI3 = null;
        String strG8 = null;
        String strG9 = null;
        String strG10 = null;
        Bundle bundleG4 = null;
        String strG11 = null;
        a03 a03Var = null;
        Bundle bundleG5 = null;
        String strG12 = null;
        String strG13 = null;
        String strG14 = null;
        ArrayList<Integer> arrayListV = null;
        String strG15 = null;
        ArrayList<String> arrayListI4 = null;
        ArrayList<String> arrayListI5 = null;
        String strG16 = null;
        n8 n8Var = null;
        String strG17 = null;
        Bundle bundleG6 = null;
        int r8 = 0;
        int r20 = 0;
        boolean zP = false;
        int r24 = 0;
        int r25 = 0;
        float fV = 0.0f;
        float fV2 = 0.0f;
        boolean zP2 = false;
        int r40 = 0;
        int r41 = 0;
        boolean zP3 = false;
        boolean zP4 = false;
        boolean zP5 = false;
        int r47 = 0;
        boolean zP6 = false;
        boolean zP7 = false;
        int r60 = 0;
        boolean zP8 = false;
        boolean zP9 = false;
        boolean zP10 = false;
        while (parcel.dataPosition() < r1) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r2)) {
                case 1:
                    r8 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 2:
                    bundleG = com.google.android.gms.common.internal.z.b.g(parcel, r2);
                    break;
                case 3:
                    jw2Var = (jw2) com.google.android.gms.common.internal.z.b.C(parcel, r2, jw2.CREATOR);
                    break;
                case 4:
                    qw2Var = (qw2) com.google.android.gms.common.internal.z.b.C(parcel, r2, qw2.CREATOR);
                    break;
                case 5:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) com.google.android.gms.common.internal.z.b.C(parcel, r2, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) com.google.android.gms.common.internal.z.b.C(parcel, r2, PackageInfo.CREATOR);
                    break;
                case 8:
                    strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 9:
                    strG3 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 10:
                    strG4 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 11:
                    asVar = (as) com.google.android.gms.common.internal.z.b.C(parcel, r2, as.CREATOR);
                    break;
                case 12:
                    bundleG2 = com.google.android.gms.common.internal.z.b.g(parcel, r2);
                    break;
                case 13:
                    r20 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 14:
                    arrayListI = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 15:
                    bundleG3 = com.google.android.gms.common.internal.z.b.g(parcel, r2);
                    break;
                case 16:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 62:
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r2);
                    break;
                case 18:
                    r24 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 19:
                    r25 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 20:
                    fV = com.google.android.gms.common.internal.z.b.V(parcel, r2);
                    break;
                case 21:
                    strG5 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 25:
                    jC0 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 26:
                    strG6 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 27:
                    arrayListI2 = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 28:
                    strG7 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 29:
                    z2Var = (z2) com.google.android.gms.common.internal.z.b.C(parcel, r2, z2.CREATOR);
                    break;
                case 30:
                    arrayListI3 = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 31:
                    jC02 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 33:
                    strG8 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 34:
                    fV2 = com.google.android.gms.common.internal.z.b.V(parcel, r2);
                    break;
                case 35:
                    r40 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 36:
                    r41 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 37:
                    zP3 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 38:
                    zP4 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 39:
                    strG9 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 40:
                    zP2 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 41:
                    strG10 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 42:
                    zP5 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 43:
                    r47 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 44:
                    bundleG4 = com.google.android.gms.common.internal.z.b.g(parcel, r2);
                    break;
                case 45:
                    strG11 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 46:
                    a03Var = (a03) com.google.android.gms.common.internal.z.b.C(parcel, r2, a03.CREATOR);
                    break;
                case 47:
                    zP6 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 48:
                    bundleG5 = com.google.android.gms.common.internal.z.b.g(parcel, r2);
                    break;
                case 49:
                    strG12 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 50:
                    strG13 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 51:
                    strG14 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 52:
                    zP7 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 53:
                    arrayListV = com.google.android.gms.common.internal.z.b.v(parcel, r2);
                    break;
                case 54:
                    strG15 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 55:
                    arrayListI4 = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 56:
                    r60 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 57:
                    zP8 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 58:
                    zP9 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 59:
                    zP10 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 60:
                    arrayListI5 = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 61:
                    strG16 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 63:
                    n8Var = (n8) com.google.android.gms.common.internal.z.b.C(parcel, r2, n8.CREATOR);
                    break;
                case 64:
                    strG17 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 65:
                    bundleG6 = com.google.android.gms.common.internal.z.b.g(parcel, r2);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r1);
        return new gi(r8, bundleG, jw2Var, qw2Var, strG, applicationInfo, packageInfo, strG2, strG3, strG4, asVar, bundleG2, r20, arrayListI, bundleG3, zP, r24, r25, fV, strG5, jC0, strG6, arrayListI2, strG7, z2Var, arrayListI3, jC02, strG8, fV2, zP2, r40, r41, zP3, zP4, strG9, strG10, zP5, r47, bundleG4, strG11, a03Var, zP6, bundleG5, strG12, strG13, strG14, zP7, arrayListV, strG15, arrayListI4, r60, zP8, zP9, zP10, arrayListI5, strG16, n8Var, strG17, bundleG6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ gi[] newArray(int r1) {
        return new gi[r1];
    }
}
