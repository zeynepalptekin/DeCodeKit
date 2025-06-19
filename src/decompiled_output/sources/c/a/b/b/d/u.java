package c.a.b.b.d;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class u implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        int r2 = 0;
        long jC0 = -1;
        while (parcel.dataPosition() < r0) {
            int r5 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r6 = com.google.android.gms.common.internal.z.b.O(r5);
            if (r6 == 1) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r5);
            } else if (r6 == 2) {
                r2 = com.google.android.gms.common.internal.z.b.Z(parcel, r5);
            } else if (r6 != 3) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r5);
            } else {
                jC0 = com.google.android.gms.common.internal.z.b.c0(parcel, r5);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new d(strG, r2, jC0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int r1) {
        return new d[r1];
    }
}
