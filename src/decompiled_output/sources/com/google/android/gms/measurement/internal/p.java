package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p implements Parcelable.Creator<n> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        Bundle bundleG = null;
        while (parcel.dataPosition() < r0) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            if (com.google.android.gms.common.internal.z.b.O(r2) != 2) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r2);
            } else {
                bundleG = com.google.android.gms.common.internal.z.b.g(parcel, r2);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new n(bundleG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n[] newArray(int r1) {
        return new n[r1];
    }
}
