package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w0 implements Parcelable.Creator<x0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x0 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        int r1 = 0;
        while (parcel.dataPosition() < r0) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            if (com.google.android.gms.common.internal.z.b.O(r2) != 1) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r2);
            } else {
                r1 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new x0(r1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x0[] newArray(int r1) {
        return new x0[r1];
    }
}
