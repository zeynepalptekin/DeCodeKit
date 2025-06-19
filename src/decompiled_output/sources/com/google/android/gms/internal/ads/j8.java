package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j8 implements Parcelable.Creator<l8> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l8 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        Bundle bundleG = null;
        while (parcel.dataPosition() < r0) {
            int r3 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r4 = com.google.android.gms.common.internal.z.b.O(r3);
            if (r4 == 1) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r3);
            } else if (r4 != 2) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r3);
            } else {
                bundleG = com.google.android.gms.common.internal.z.b.g(parcel, r3);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new l8(strG, bundleG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l8[] newArray(int r1) {
        return new l8[r1];
    }
}
