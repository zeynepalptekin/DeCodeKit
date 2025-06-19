package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "ValidateAccountRequestCreator")
@Deprecated
/* loaded from: classes.dex */
public final class x0 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<x0> CREATOR = new w0();

    @d.g(id = 1)
    private final int d;

    @d.b
    x0(@d.e(id = 1) int r1) {
        this.d = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int r42 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.b(parcel, r42);
    }
}
