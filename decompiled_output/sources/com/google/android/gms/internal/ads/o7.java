package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "HttpResponseParcelCreator")
/* loaded from: classes.dex */
public final class o7 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<o7> CREATOR = new n7();

    @d.c(id = 1)
    public final boolean d;

    @d.c(id = 2)
    public final String e;

    @d.c(id = 3)
    public final int f;

    @d.c(id = 4)
    public final byte[] g;

    @d.c(id = 5)
    public final String[] h;

    @d.c(id = 6)
    public final String[] i;

    @d.c(id = 7)
    public final boolean j;

    @d.c(id = 8)
    public final long k;

    @d.b
    o7(@d.e(id = 1) boolean z, @d.e(id = 2) String str, @d.e(id = 3) int r3, @d.e(id = 4) byte[] bArr, @d.e(id = 5) String[] strArr, @d.e(id = 6) String[] strArr2, @d.e(id = 7) boolean z2, @d.e(id = 8) long j) {
        this.d = z;
        this.e = str;
        this.f = r3;
        this.g = bArr;
        this.h = strArr;
        this.i = strArr2;
        this.j = z2;
        this.k = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.g(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.e, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 3, this.f);
        com.google.android.gms.common.internal.z.c.m(parcel, 4, this.g, false);
        com.google.android.gms.common.internal.z.c.Y(parcel, 5, this.h, false);
        com.google.android.gms.common.internal.z.c.Y(parcel, 6, this.i, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 7, this.j);
        com.google.android.gms.common.internal.z.c.K(parcel, 8, this.k);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
