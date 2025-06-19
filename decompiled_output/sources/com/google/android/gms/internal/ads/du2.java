package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class du2 implements Parcelable.Creator<zt2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zt2 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < r0) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            if (com.google.android.gms.common.internal.z.b.O(r2) != 2) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r2);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) com.google.android.gms.common.internal.z.b.C(parcel, r2, ParcelFileDescriptor.CREATOR);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new zt2(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zt2[] newArray(int r1) {
        return new zt2[r1];
    }
}
