package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ji implements Parcelable.Creator<ki> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ki createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        boolean zP = false;
        ArrayList<String> arrayListI = null;
        while (parcel.dataPosition() < r0) {
            int r3 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r4 = com.google.android.gms.common.internal.z.b.O(r3);
            if (r4 == 2) {
                zP = com.google.android.gms.common.internal.z.b.P(parcel, r3);
            } else if (r4 != 3) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r3);
            } else {
                arrayListI = com.google.android.gms.common.internal.z.b.I(parcel, r3);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new ki(zP, arrayListI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ki[] newArray(int r1) {
        return new ki[r1];
    }
}
