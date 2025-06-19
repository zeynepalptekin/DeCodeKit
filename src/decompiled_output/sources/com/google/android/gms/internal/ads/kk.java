package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class kk implements Parcelable.Creator<hk> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hk createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        jw2 jw2Var = null;
        String strG = null;
        while (parcel.dataPosition() < r0) {
            int r3 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r4 = com.google.android.gms.common.internal.z.b.O(r3);
            if (r4 == 2) {
                jw2Var = (jw2) com.google.android.gms.common.internal.z.b.C(parcel, r3, jw2.CREATOR);
            } else if (r4 != 3) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r3);
            } else {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r3);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new hk(jw2Var, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hk[] newArray(int r1) {
        return new hk[r1];
    }
}
