package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "AdapterResponseInfoParcelCreator")
/* loaded from: classes.dex */
public final class uw2 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<uw2> CREATOR = new tw2();

    @d.c(id = 1)
    public String d;

    @d.c(id = 2)
    public long e;

    @androidx.annotation.i0
    @d.c(id = 3)
    public dw2 f;

    @d.c(id = 4)
    public Bundle g;

    @d.b
    public uw2(@d.e(id = 1) String str, @d.e(id = 2) long j, @androidx.annotation.i0 @d.e(id = 3) dw2 dw2Var, @d.e(id = 4) Bundle bundle) {
        this.d = str;
        this.e = j;
        this.f = dw2Var;
        this.g = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r7) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 1, this.d, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 2, this.e);
        com.google.android.gms.common.internal.z.c.S(parcel, 3, this.f, r7, false);
        com.google.android.gms.common.internal.z.c.k(parcel, 4, this.g, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
