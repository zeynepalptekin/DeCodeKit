package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v0 implements Parcelable.Creator<t> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        int r3 = 0;
        boolean zP = false;
        boolean zP2 = false;
        int r6 = 0;
        int r7 = 0;
        while (parcel.dataPosition() < r0) {
            int r1 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r2 = com.google.android.gms.common.internal.z.b.O(r1);
            if (r2 == 1) {
                r3 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
            } else if (r2 == 2) {
                zP = com.google.android.gms.common.internal.z.b.P(parcel, r1);
            } else if (r2 == 3) {
                zP2 = com.google.android.gms.common.internal.z.b.P(parcel, r1);
            } else if (r2 == 4) {
                r6 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
            } else if (r2 != 5) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r1);
            } else {
                r7 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new t(r3, zP, zP2, r6, r7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t[] newArray(int r1) {
        return new t[r1];
    }
}
