package c.a.b.b.d;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f0 implements Parcelable.Creator<c0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c0 createFromParcel(Parcel parcel) {
        int r0 = com.google.android.gms.common.internal.z.b.h0(parcel);
        boolean zP = false;
        String strG = null;
        IBinder iBinderY = null;
        boolean zP2 = false;
        while (parcel.dataPosition() < r0) {
            int r5 = com.google.android.gms.common.internal.z.b.X(parcel);
            int r6 = com.google.android.gms.common.internal.z.b.O(r5);
            if (r6 == 1) {
                strG = com.google.android.gms.common.internal.z.b.G(parcel, r5);
            } else if (r6 == 2) {
                iBinderY = com.google.android.gms.common.internal.z.b.Y(parcel, r5);
            } else if (r6 == 3) {
                zP = com.google.android.gms.common.internal.z.b.P(parcel, r5);
            } else if (r6 != 4) {
                com.google.android.gms.common.internal.z.b.g0(parcel, r5);
            } else {
                zP2 = com.google.android.gms.common.internal.z.b.P(parcel, r5);
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r0);
        return new c0(strG, iBinderY, zP, zP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c0[] newArray(int r1) {
        return new c0[r1];
    }
}
