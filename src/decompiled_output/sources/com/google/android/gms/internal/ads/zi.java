package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zi implements Parcelable.Creator<wi> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wi createFromParcel(Parcel parcel) {
        int r1 = com.google.android.gms.common.internal.z.b.h0(parcel);
        Bundle bundleG = null;
        as asVar = null;
        ApplicationInfo applicationInfo = null;
        String strG = null;
        ArrayList<String> arrayListI = null;
        PackageInfo packageInfo = null;
        String strG2 = null;
        String strG3 = null;
        yo1 yo1Var = null;
        String strG4 = null;
        boolean zP = false;
        while (parcel.dataPosition() < r1) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r2)) {
                case 1:
                    bundleG = com.google.android.gms.common.internal.z.b.g(parcel, r2);
                    break;
                case 2:
                    asVar = (as) com.google.android.gms.common.internal.z.b.C(parcel, r2, as.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) com.google.android.gms.common.internal.z.b.C(parcel, r2, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 5:
                    arrayListI = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 6:
                    packageInfo = (PackageInfo) com.google.android.gms.common.internal.z.b.C(parcel, r2, PackageInfo.CREATOR);
                    break;
                case 7:
                    strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 8:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 9:
                    strG3 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 10:
                    yo1Var = (yo1) com.google.android.gms.common.internal.z.b.C(parcel, r2, yo1.CREATOR);
                    break;
                case 11:
                    strG4 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r2);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r1);
        return new wi(bundleG, asVar, applicationInfo, strG, arrayListI, packageInfo, strG2, zP, strG3, yo1Var, strG4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wi[] newArray(int r1) {
        return new wi[r1];
    }
}
