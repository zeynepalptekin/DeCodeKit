package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.as;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator<AdOverlayInfoParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int r1 = com.google.android.gms.common.internal.z.b.h0(parcel);
        b bVar = null;
        IBinder iBinderY = null;
        IBinder iBinderY2 = null;
        IBinder iBinderY3 = null;
        IBinder iBinderY4 = null;
        String strG = null;
        String strG2 = null;
        IBinder iBinderY5 = null;
        String strG3 = null;
        as asVar = null;
        String strG4 = null;
        com.google.android.gms.ads.internal.i iVar = null;
        IBinder iBinderY6 = null;
        boolean zP = false;
        int r14 = 0;
        int r15 = 0;
        while (parcel.dataPosition() < r1) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r2)) {
                case 2:
                    bVar = (b) com.google.android.gms.common.internal.z.b.C(parcel, r2, b.CREATOR);
                    break;
                case 3:
                    iBinderY = com.google.android.gms.common.internal.z.b.Y(parcel, r2);
                    break;
                case 4:
                    iBinderY2 = com.google.android.gms.common.internal.z.b.Y(parcel, r2);
                    break;
                case 5:
                    iBinderY3 = com.google.android.gms.common.internal.z.b.Y(parcel, r2);
                    break;
                case 6:
                    iBinderY4 = com.google.android.gms.common.internal.z.b.Y(parcel, r2);
                    break;
                case 7:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 8:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 9:
                    strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 10:
                    iBinderY5 = com.google.android.gms.common.internal.z.b.Y(parcel, r2);
                    break;
                case 11:
                    r14 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 12:
                    r15 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 13:
                    strG3 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 14:
                    asVar = (as) com.google.android.gms.common.internal.z.b.C(parcel, r2, as.CREATOR);
                    break;
                case 15:
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r2);
                    break;
                case 16:
                    strG4 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 17:
                    iVar = (com.google.android.gms.ads.internal.i) com.google.android.gms.common.internal.z.b.C(parcel, r2, com.google.android.gms.ads.internal.i.CREATOR);
                    break;
                case 18:
                    iBinderY6 = com.google.android.gms.common.internal.z.b.Y(parcel, r2);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r1);
        return new AdOverlayInfoParcel(bVar, iBinderY, iBinderY2, iBinderY3, iBinderY4, strG, zP, strG2, iBinderY5, r14, r15, strG3, asVar, strG4, iVar, iBinderY6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel[] newArray(int r1) {
        return new AdOverlayInfoParcel[r1];
    }
}
