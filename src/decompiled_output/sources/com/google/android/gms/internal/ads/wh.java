package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class wh implements Parcelable.Creator<th> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ th createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        IBinder iBinderY = null;
        IBinder iBinderY2 = null;
        while (parcel.dataPosition() < r0) {
            int r3 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r4 = com.google.android.gms.common.internal.z.b.O(r3);
            if (r4 == 1) {
                iBinderY = com.google.android.gms.common.internal.z.b.Y(parcel, r3);
            } else if (r4 != 2) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r3);
            } else {
                iBinderY2 = com.google.android.gms.common.internal.z.b.Y(parcel, r3);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new th(iBinderY, iBinderY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ th[] newArray(int r1) {
        return new th[r1];
    }
}
