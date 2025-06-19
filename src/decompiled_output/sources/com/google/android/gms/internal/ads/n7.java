package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n7 implements Parcelable.Creator<o7> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o7 createFromParcel(Parcel parcel) {
        int r1 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        byte[] bArrH = null;
        String[] strArrH = null;
        String[] strArrH2 = null;
        long jC0 = 0;
        boolean zP = false;
        int r9 = 0;
        boolean zP2 = false;
        while (parcel.dataPosition() < r1) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r2)) {
                case 1:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 2:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 3:
                    r9 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 4:
                    bArrH = com.google.android.gms.common.internal.z.b.h(parcel, r2);
                    break;
                case 5:
                    strArrH = com.google.android.gms.common.internal.z.b.H(parcel, r2);
                    break;
                case 6:
                    strArrH2 = com.google.android.gms.common.internal.z.b.H(parcel, r2);
                    break;
                case 7:
                    zP2 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 8:
                    jC0 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r2);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r1);
        return new o7(zP, strG, r9, bArrH, strArrH, strArrH2, zP2, jC0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o7[] newArray(int r1) {
        return new o7[r1];
    }
}
