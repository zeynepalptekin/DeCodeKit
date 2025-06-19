package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zr implements Parcelable.Creator<as> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ as createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        int r5 = 0;
        int r6 = 0;
        boolean zP = false;
        boolean zP2 = false;
        while (parcel.dataPosition() < r0) {
            int r1 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r2 = com.google.android.gms.common.internal.z.b.O(r1);
            if (r2 == 2) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r1);
            } else if (r2 == 3) {
                r5 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
            } else if (r2 == 4) {
                r6 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
            } else if (r2 == 5) {
                zP = com.google.android.gms.common.internal.z.b.P(parcel, r1);
            } else if (r2 != 6) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r1);
            } else {
                zP2 = com.google.android.gms.common.internal.z.b.P(parcel, r1);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new as(strG, r5, r6, zP, zP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ as[] newArray(int r1) {
        return new as[r1];
    }
}
