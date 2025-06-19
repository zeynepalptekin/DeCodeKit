package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class e0 implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g createFromParcel(Parcel parcel) {
        int r1 = com.google.android.gms.common.internal.z.b.h0(parcel);
        String strG = null;
        IBinder iBinderY = null;
        Scope[] scopeArr = null;
        Bundle bundleG = null;
        Account account = null;
        c.a.b.b.d.d[] dVarArr = null;
        c.a.b.b.d.d[] dVarArr2 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        boolean zP = false;
        int r16 = 0;
        boolean zP2 = false;
        while (parcel.dataPosition() < r1) {
            int r2 = com.google.android.gms.common.internal.z.b.X(parcel);
            switch (com.google.android.gms.common.internal.z.b.O(r2)) {
                case 1:
                    r5 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 2:
                    r6 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 3:
                    r7 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 4:
                    strG = com.google.android.gms.common.internal.z.b.G(parcel, r2);
                    break;
                case 5:
                    iBinderY = com.google.android.gms.common.internal.z.b.Y(parcel, r2);
                    break;
                case 6:
                    scopeArr = (Scope[]) com.google.android.gms.common.internal.z.b.K(parcel, r2, Scope.CREATOR);
                    break;
                case 7:
                    bundleG = com.google.android.gms.common.internal.z.b.g(parcel, r2);
                    break;
                case 8:
                    account = (Account) com.google.android.gms.common.internal.z.b.C(parcel, r2, Account.CREATOR);
                    break;
                case 9:
                default:
                    com.google.android.gms.common.internal.z.b.g0(parcel, r2);
                    break;
                case 10:
                    dVarArr = (c.a.b.b.d.d[]) com.google.android.gms.common.internal.z.b.K(parcel, r2, c.a.b.b.d.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (c.a.b.b.d.d[]) com.google.android.gms.common.internal.z.b.K(parcel, r2, c.a.b.b.d.d.CREATOR);
                    break;
                case 12:
                    zP = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
                case 13:
                    r16 = com.google.android.gms.common.internal.z.b.Z(parcel, r2);
                    break;
                case 14:
                    zP2 = com.google.android.gms.common.internal.z.b.P(parcel, r2);
                    break;
            }
        }
        com.google.android.gms.common.internal.z.b.N(parcel, r1);
        return new g(r5, r6, r7, strG, iBinderY, scopeArr, bundleG, account, dVarArr, dVarArr2, zP, r16, zP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int r1) {
        return new g[r1];
    }
}
