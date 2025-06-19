package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y2 implements Parcelable.Creator<z2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ z2 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        m mVar = null;
        int r4 = 0;
        boolean zP = false;
        int r6 = 0;
        boolean zP2 = false;
        int r8 = 0;
        boolean zP3 = false;
        int r11 = 0;
        while (parcel.dataPosition() < r0) {
            int r1 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r1)) {
                case 1:
                    r4 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
                    break;
                case 2:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r1);
                    break;
                case 3:
                    r6 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
                    break;
                case 4:
                    zP2 = com.google.android.gms.common.internal.z.b.P(parcel, r1);
                    break;
                case 5:
                    r8 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
                    break;
                case 6:
                    mVar = (m) com.google.android.gms.common.internal.z.b.C(parcel, r1, m.CREATOR);
                    break;
                case 7:
                    zP3 = com.google.android.gms.common.internal.z.b.P(parcel, r1);
                    break;
                case 8:
                    r11 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
                    break;
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r1);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new z2(r4, zP, r6, zP2, r8, mVar, zP3, r11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ z2[] newArray(int r1) {
        return new z2[r1];
    }
}
