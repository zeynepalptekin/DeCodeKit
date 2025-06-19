package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "ConnectionInfoCreator")
/* loaded from: classes.dex */
public final class c0 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<c0> CREATOR = new b0();

    @d.c(id = 1)
    Bundle d;

    @d.c(id = 2)
    c.a.b.b.d.d[] e;

    @d.c(defaultValue = "0", id = 3)
    private int f;

    public c0() {
    }

    @d.b
    c0(@d.e(id = 1) Bundle bundle, @d.e(id = 2) c.a.b.b.d.d[] dVarArr, @d.e(id = 3) int r3, @androidx.annotation.i0 @d.e(id = 4) e eVar) {
        this.d = bundle;
        this.e = dVarArr;
        this.f = r3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.k(parcel, 1, this.d, false);
        com.google.android.gms.common.internal.z.c.b0(parcel, 2, this.e, r6, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 3, this.f);
        com.google.android.gms.common.internal.z.c.S(parcel, 4, null, r6, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
