package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d0 implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        t tVar = null;
        int[] r7 = null;
        boolean zP = false;
        boolean zP2 = false;
        int r8 = 0;
        while (parcel.dataPosition() < r0) {
            int r1 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r2 = com.google.android.gms.common.internal.z.b.O(r1);
            if (r2 == 1) {
                tVar = (t) com.google.android.gms.common.internal.z.b.C(parcel, r1, t.CREATOR);
            } else if (r2 == 2) {
                zP = com.google.android.gms.common.internal.z.b.P(parcel, r1);
            } else if (r2 == 3) {
                zP2 = com.google.android.gms.common.internal.z.b.P(parcel, r1);
            } else if (r2 == 4) {
                r7 = com.google.android.gms.common.internal.z.b.u(parcel, r1);
            } else if (r2 != 5) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r1);
            } else {
                r8 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new e(tVar, zP, zP2, r7, r8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int r1) {
        return new e[r1];
    }
}
