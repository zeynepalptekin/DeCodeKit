package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class on implements Parcelable.Creator<pn> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ pn createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        String strG2 = null;
        qw2 qw2Var = null;
        jw2 jw2Var = null;
        while (parcel.dataPosition() < r0) {
            int r5 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r6 = com.google.android.gms.common.internal.z.b.O(r5);
            if (r6 == 1) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r5);
            } else if (r6 == 2) {
                strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r5);
            } else if (r6 == 3) {
                qw2Var = (qw2) com.google.android.gms.common.internal.z.b.C(parcel, r5, qw2.CREATOR);
            } else if (r6 != 4) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r5);
            } else {
                jw2Var = (jw2) com.google.android.gms.common.internal.z.b.C(parcel, r5, jw2.CREATOR);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new pn(strG, strG2, qw2Var, jw2Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ pn[] newArray(int r1) {
        return new pn[r1];
    }
}
