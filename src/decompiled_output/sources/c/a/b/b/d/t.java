package c.a.b.b.d;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        PendingIntent pendingIntent = null;
        String strG = null;
        int r3 = 0;
        int r4 = 0;
        while (parcel.dataPosition() < r0) {
            int r5 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r6 = com.google.android.gms.common.internal.z.b.O(r5);
            if (r6 == 1) {
                r3 = com.google.android.gms.common.internal.z.b.Z(parcel, r5);
            } else if (r6 == 2) {
                r4 = com.google.android.gms.common.internal.z.b.Z(parcel, r5);
            } else if (r6 == 3) {
                pendingIntent = (PendingIntent) com.google.android.gms.common.internal.z.b.C(parcel, r5, PendingIntent.CREATOR);
            } else if (r6 != 4) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r5);
            } else {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r5);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new c(r3, r4, pendingIntent, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int r1) {
        return new c[r1];
    }
}
