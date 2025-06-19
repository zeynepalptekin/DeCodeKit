package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l7 implements Parcelable.Creator<m7> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m7 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        String[] strArrH = null;
        String[] strArrH2 = null;
        while (parcel.dataPosition() < r0) {
            int r4 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r5 = com.google.android.gms.common.internal.z.b.O(r4);
            if (r5 == 1) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r4);
            } else if (r5 == 2) {
                strArrH = com.google.android.gms.common.internal.z.b.H(parcel, r4);
            } else if (r5 != 3) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r4);
            } else {
                strArrH2 = com.google.android.gms.common.internal.z.b.H(parcel, r4);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new m7(strG, strArrH, strArrH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m7[] newArray(int r1) {
        return new m7[r1];
    }
}
