package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class bj implements Parcelable.Creator<yi> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ yi createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        while (parcel.dataPosition() < r0) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            if (com.google.android.gms.common.internal.z.b.O(r2) != 2) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r2);
            } else {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r2);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new yi(strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ yi[] newArray(int r1) {
        return new yi[r1];
    }
}
