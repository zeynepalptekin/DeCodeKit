package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        while (parcel.dataPosition() < r0) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            if (com.google.android.gms.common.internal.z.b.O(r2) != 15) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r2);
            } else {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r2);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new i(strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int r1) {
        return new i[r1];
    }
}
