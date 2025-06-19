package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<WakeLockEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent createFromParcel(Parcel parcel) {
        int r1 = com.google.android.gms.common.internal.z.b.h0(parcel);
        long jC0 = 0;
        long jC02 = 0;
        long jC03 = 0;
        String strG = null;
        ArrayList<String> arrayListI = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        int r8 = 0;
        int r11 = 0;
        int r13 = 0;
        int r18 = 0;
        float fV = 0.0f;
        boolean zP = false;
        while (parcel.dataPosition() < r1) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r2)) {
                case 1:
                    r8 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 2:
                    jC0 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 3:
                case 7:
                case 9:
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r2);
                    break;
                case 4:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 5:
                    r13 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 6:
                    arrayListI = com.google.android.gms.common.internal.z.b.I(parcel, r2);
                    break;
                case 8:
                    jC02 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 10:
                    strG3 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 11:
                    r11 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 12:
                    strG2 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 13:
                    strG4 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 14:
                    r18 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 15:
                    fV = com.google.android.gms.common.internal.z.b.V(parcel, r2);
                    break;
                case 16:
                    jC03 = com.google.android.gms.common.internal.z.b.c0(parcel, r2);
                    break;
                case 17:
                    strG5 = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 18:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r1);
        return new WakeLockEvent(r8, jC0, r11, strG, r13, arrayListI, strG2, jC02, r18, strG3, strG4, fV, jC03, strG5, zP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent[] newArray(int r1) {
        return new WakeLockEvent[r1];
    }
}
