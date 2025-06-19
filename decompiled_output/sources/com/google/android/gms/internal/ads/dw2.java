package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "AdErrorParcelCreator")
/* loaded from: classes.dex */
public final class dw2 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<dw2> CREATOR = new gw2();

    @d.c(id = 1)
    public final int d;

    @d.c(id = 2)
    public final String e;

    @d.c(id = 3)
    public final String f;

    @androidx.annotation.i0
    @d.c(id = 4)
    public dw2 g;

    @androidx.annotation.i0
    @d.c(id = 5, type = "android.os.IBinder")
    public IBinder h;

    @d.b
    public dw2(@d.e(id = 1) int r1, @d.e(id = 2) String str, @d.e(id = 3) String str2, @androidx.annotation.i0 @d.e(id = 4) dw2 dw2Var, @androidx.annotation.i0 @d.e(id = 5) IBinder iBinder) {
        this.d = r1;
        this.e = str;
        this.f = str2;
        this.g = dw2Var;
        this.h = iBinder;
    }

    public final com.google.android.gms.ads.a h() {
        dw2 dw2Var = this.g;
        return new com.google.android.gms.ads.a(this.d, this.e, this.f, dw2Var == null ? null : new com.google.android.gms.ads.a(dw2Var.d, dw2Var.e, dw2Var.f));
    }

    public final com.google.android.gms.ads.m i() {
        dw2 dw2Var = this.g;
        tz2 vz2Var = null;
        com.google.android.gms.ads.a aVar = dw2Var == null ? null : new com.google.android.gms.ads.a(dw2Var.d, dw2Var.e, dw2Var.f);
        int r6 = this.d;
        String str = this.e;
        String str2 = this.f;
        IBinder iBinder = this.h;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            vz2Var = iInterfaceQueryLocalInterface instanceof tz2 ? (tz2) iInterfaceQueryLocalInterface : new vz2(iBinder);
        }
        return new com.google.android.gms.ads.m(r6, str, str2, aVar, com.google.android.gms.ads.y.d(vz2Var));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.e, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 3, this.f, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 4, this.g, r6, false);
        com.google.android.gms.common.internal.z.c.B(parcel, 5, this.h, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
