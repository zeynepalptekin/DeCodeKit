package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        Intent intent = null;
        while (parcel.dataPosition() < r0) {
            int r1 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r1)) {
                case 2:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r1);
                    break;
                case 3:
                    strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r1);
                    break;
                case 4:
                    strG3 = com.google.android.gms.common.internal.z.b.G(parcel, r1);
                    break;
                case 5:
                    strG4 = com.google.android.gms.common.internal.z.b.G(parcel, r1);
                    break;
                case 6:
                    strG5 = com.google.android.gms.common.internal.z.b.G(parcel, r1);
                    break;
                case 7:
                    strG6 = com.google.android.gms.common.internal.z.b.G(parcel, r1);
                    break;
                case 8:
                    strG7 = com.google.android.gms.common.internal.z.b.G(parcel, r1);
                    break;
                case 9:
                    intent = (Intent) com.google.android.gms.common.internal.z.b.C(parcel, r1, Intent.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r1);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new b(strG, strG2, strG3, strG4, strG5, strG6, strG7, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int r1) {
        return new b[r1];
    }
}
