package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b0 implements Parcelable.Creator<c0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c0 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        Bundle bundleG = null;
        c.a.b.b.d.d[] dVarArr = null;
        e eVar = null;
        int r4 = 0;
        while (parcel.dataPosition() < r0) {
            int r5 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r6 = com.google.android.gms.common.internal.z.b.O(r5);
            if (r6 == 1) {
                bundleG = com.google.android.gms.common.internal.z.b.g(parcel, r5);
            } else if (r6 == 2) {
                dVarArr = (c.a.b.b.d.d[]) com.google.android.gms.common.internal.z.b.K(parcel, r5, c.a.b.b.d.d.CREATOR);
            } else if (r6 == 3) {
                r4 = com.google.android.gms.common.internal.z.b.Z(parcel, r5);
            } else if (r6 != 4) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r5);
            } else {
                eVar = (e) com.google.android.gms.common.internal.z.b.C(parcel, r5, e.CREATOR);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new c0(bundleG, dVarArr, r4, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c0[] newArray(int r1) {
        return new c0[r1];
    }
}
