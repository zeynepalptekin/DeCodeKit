package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        boolean zP = false;
        boolean zP2 = false;
        boolean zP3 = false;
        float fV = 0.0f;
        int r10 = 0;
        boolean zP4 = false;
        boolean zP5 = false;
        boolean zP6 = false;
        while (parcel.dataPosition() < r0) {
            int r1 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r1)) {
                case 2:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r1);
                    break;
                case 3:
                    zP2 = com.google.android.gms.common.internal.z.b.P(parcel, r1);
                    break;
                case 4:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r1);
                    break;
                case 5:
                    zP3 = com.google.android.gms.common.internal.z.b.P(parcel, r1);
                    break;
                case 6:
                    fV = com.google.android.gms.common.internal.z.b.V(parcel, r1);
                    break;
                case 7:
                    r10 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
                    break;
                case 8:
                    zP4 = com.google.android.gms.common.internal.z.b.P(parcel, r1);
                    break;
                case 9:
                    zP5 = com.google.android.gms.common.internal.z.b.P(parcel, r1);
                    break;
                case 10:
                    zP6 = com.google.android.gms.common.internal.z.b.P(parcel, r1);
                    break;
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r1);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new i(zP, zP2, strG, zP3, fV, r10, zP4, zP5, zP6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int r1) {
        return new i[r1];
    }
}
