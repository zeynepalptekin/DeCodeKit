package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r implements Parcelable.Creator<s> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        n nVar = null;
        String strG2 = null;
        long jC0 = 0;
        while (parcel.dataPosition() < r0) {
            int r1 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r2 = com.google.android.gms.common.internal.z.b.O(r1);
            if (r2 == 2) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r1);
            } else if (r2 == 3) {
                nVar = (n) com.google.android.gms.common.internal.z.b.C(parcel, r1, n.CREATOR);
            } else if (r2 == 4) {
                strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r1);
            } else if (r2 != 5) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r1);
            } else {
                jC0 = com.google.android.gms.common.internal.z.b.c0(parcel, r1);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new s(strG, nVar, strG2, jC0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s[] newArray(int r1) {
        return new s[r1];
    }
}
