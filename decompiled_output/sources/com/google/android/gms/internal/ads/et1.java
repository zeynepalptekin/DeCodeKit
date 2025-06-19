package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "GassEventParcelCreator")
/* loaded from: classes.dex */
public final class et1 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<et1> CREATOR = new dt1();

    @d.g(id = 1)
    private final int d;

    @d.c(id = 2)
    private final byte[] e;

    @d.b
    et1(@d.e(id = 1) int r1, @d.e(id = 2) byte[] bArr) {
        this.d = r1;
        this.e = bArr;
    }

    public et1(byte[] bArr) {
        this(1, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.m(parcel, 2, this.e, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
