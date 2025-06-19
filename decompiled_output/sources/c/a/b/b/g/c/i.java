package c.a.b.b.g.c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f createFromParcel(Parcel parcel) {
        int r1 = com.google.android.gms.common.internal.z.b.h0(parcel);
        long jC0 = 0;
        long jC02 = 0;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        Bundle bundleG = null;
        boolean zP = false;
        while (parcel.dataPosition() < r1) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r2)) {
                case 1:
                    jC0 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 2:
                    jC02 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 3:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 4:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 5:
                    strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 6:
                    strG3 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 7:
                    bundleG = com.google.android.gms.common.internal.z.b.g(parcel, r2);
                    break;
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r2);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r1);
        return new f(jC0, jC02, zP, strG, strG2, strG3, bundleG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int r1) {
        return new f[r1];
    }
}
