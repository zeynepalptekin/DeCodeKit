package com.google.android.gms.ads.d0;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        IBinder iBinderY = null;
        IBinder iBinderY2 = null;
        boolean zP = false;
        while (parcel.dataPosition() < r0) {
            int r4 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r5 = com.google.android.gms.common.internal.z.b.O(r4);
            if (r5 == 1) {
                zP = com.google.android.gms.common.internal.z.b.P(parcel, r4);
            } else if (r5 == 2) {
                iBinderY = com.google.android.gms.common.internal.z.b.Y(parcel, r4);
            } else if (r5 != 3) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r4);
            } else {
                iBinderY2 = com.google.android.gms.common.internal.z.b.Y(parcel, r4);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new m(zP, iBinderY, iBinderY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m[] newArray(int r1) {
        return new m[r1];
    }
}
