package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class pw2 implements Parcelable.Creator<qw2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ qw2 createFromParcel(Parcel parcel) {
        int r1 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        qw2[] qw2VarArr = null;
        int r6 = 0;
        int r7 = 0;
        boolean zP = false;
        int r9 = 0;
        int r10 = 0;
        boolean zP2 = false;
        boolean zP3 = false;
        boolean zP4 = false;
        boolean zP5 = false;
        boolean zP6 = false;
        boolean zP7 = false;
        boolean zP8 = false;
        while (parcel.dataPosition() < r1) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r2)) {
                case 2:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 3:
                    r6 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 4:
                    r7 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 5:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 6:
                    r9 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 7:
                    r10 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 8:
                    qw2VarArr = (qw2[]) com.google.android.gms.common.internal.z.b.K(parcel, r2, qw2.CREATOR);
                    break;
                case 9:
                    zP2 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 10:
                    zP3 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 11:
                    zP4 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 12:
                    zP5 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 13:
                    zP6 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 14:
                    zP7 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 15:
                    zP8 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r2);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r1);
        return new qw2(strG, r6, r7, zP, r9, r10, qw2VarArr, zP2, zP3, zP4, zP5, zP6, zP7, zP8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ qw2[] newArray(int r1) {
        return new qw2[r1];
    }
}
