package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class kt1 implements Parcelable.Creator<ht1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ht1 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        int r1 = 0;
        byte[] bArrH = null;
        while (parcel.dataPosition() < r0) {
            int r3 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r4 = com.google.android.gms.common.internal.z.b.O(r3);
            if (r4 == 1) {
                r1 = com.google.android.gms.common.internal.z.b.Z(parcel, r3);
            } else if (r4 != 2) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r3);
            } else {
                bArrH = com.google.android.gms.common.internal.z.b.h(parcel, r3);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new ht1(r1, bArrH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ht1[] newArray(int r1) {
        return new ht1[r1];
    }
}
