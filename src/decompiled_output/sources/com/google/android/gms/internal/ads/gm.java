package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gm implements Parcelable.Creator<dm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ dm createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        String strG2 = null;
        ArrayList<String> arrayListI = null;
        ArrayList<String> arrayListI2 = null;
        boolean zP = false;
        boolean zP2 = false;
        boolean zP3 = false;
        boolean zP4 = false;
        while (parcel.dataPosition() < r0) {
            int r1 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r1)) {
                case 2:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r1);
                    break;
                case 3:
                    strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r1);
                    break;
                case 4:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r1);
                    break;
                case 5:
                    zP2 = com.google.android.gms.common.internal.z.b.P(parcel, r1);
                    break;
                case 6:
                    arrayListI = com.google.android.gms.common.internal.z.b.I(parcel, r1);
                    break;
                case 7:
                    zP3 = com.google.android.gms.common.internal.z.b.P(parcel, r1);
                    break;
                case 8:
                    zP4 = com.google.android.gms.common.internal.z.b.P(parcel, r1);
                    break;
                case 9:
                    arrayListI2 = com.google.android.gms.common.internal.z.b.I(parcel, r1);
                    break;
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r1);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new dm(strG, strG2, zP, zP2, arrayListI, zP3, zP4, arrayListI2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ dm[] newArray(int r1) {
        return new dm[r1];
    }
}
