package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        PendingIntent pendingIntent = null;
        c.a.b.b.d.c cVar = null;
        int r4 = 0;
        int r5 = 0;
        while (parcel.dataPosition() < r0) {
            int r1 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r2 = com.google.android.gms.common.internal.z.b.O(r1);
            if (r2 == 1) {
                r5 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
            } else if (r2 == 2) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r1);
            } else if (r2 == 3) {
                pendingIntent = (PendingIntent) com.google.android.gms.common.internal.z.b.C(parcel, r1, PendingIntent.CREATOR);
            } else if (r2 == 4) {
                cVar = (c.a.b.b.d.c) com.google.android.gms.common.internal.z.b.C(parcel, r1, c.a.b.b.d.c.CREATOR);
            } else if (r2 != 1000) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r1);
            } else {
                r4 = com.google.android.gms.common.internal.z.b.Z(parcel, r1);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new Status(r4, r5, strG, pendingIntent, cVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int r1) {
        return new Status[r1];
    }
}
