package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class eu2 implements Parcelable.Creator<fu2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ fu2 createFromParcel(Parcel parcel) {
        int r1 = com.google.android.gms.common.internal.z.b.h0(parcel);
        long jC0 = 0;
        long jC02 = 0;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        Bundle bundleG = null;
        boolean zP = false;
        while (parcel.dataPosition() < r1) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r2)) {
                case 2:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 3:
                    jC0 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 4:
                    strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 5:
                    strG3 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 6:
                    strG4 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 7:
                    bundleG = com.google.android.gms.common.internal.z.b.g(parcel, r2);
                    break;
                case 8:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 9:
                    jC02 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r2);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r1);
        return new fu2(strG, jC0, strG2, strG3, strG4, bundleG, zP, jC02);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ fu2[] newArray(int r1) {
        return new fu2[r1];
    }
}
