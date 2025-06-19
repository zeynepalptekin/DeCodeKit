package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        int r1 = 0;
        int r2 = 0;
        while (parcel.dataPosition() < r0) {
            int r3 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r4 = com.google.android.gms.common.internal.z.b.O(r3);
            if (r4 == 1) {
                r1 = com.google.android.gms.common.internal.z.b.Z(parcel, r3);
            } else if (r4 != 2) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r3);
            } else {
                r2 = com.google.android.gms.common.internal.z.b.Z(parcel, r3);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new g(r1, r2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int r1) {
        return new g[r1];
    }
}
