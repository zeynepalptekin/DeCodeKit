package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class tw2 implements Parcelable.Creator<uw2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ uw2 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        dw2 dw2Var = null;
        Bundle bundleG = null;
        long jC0 = 0;
        while (parcel.dataPosition() < r0) {
            int r1 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r2 = com.google.android.gms.common.internal.z.b.O(r1);
            if (r2 == 1) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r1);
            } else if (r2 == 2) {
                jC0 = com.google.android.gms.common.internal.z.b.c0(parcel, r1);
            } else if (r2 == 3) {
                dw2Var = (dw2) com.google.android.gms.common.internal.z.b.C(parcel, r1, dw2.CREATOR);
            } else if (r2 != 4) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r1);
            } else {
                bundleG = com.google.android.gms.common.internal.z.b.g(parcel, r1);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new uw2(strG, jC0, dw2Var, bundleG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ uw2[] newArray(int r1) {
        return new uw2[r1];
    }
}
