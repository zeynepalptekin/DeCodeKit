package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import java.util.Arrays;

@d.a(creator = "ProgramResponseCreator")
/* loaded from: classes.dex */
public final class rt1 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<rt1> CREATOR = new ut1();

    @d.g(id = 1)
    private final int d;

    @d.c(id = 2)
    public final byte[] e;

    @d.c(id = 3)
    public final int f;

    @d.b
    rt1(@d.e(id = 1) int r1, @d.e(id = 2) byte[] bArr, @d.e(id = 3) int r3) {
        this.d = r1;
        this.e = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f = r3;
    }

    public rt1(byte[] bArr, int r2) {
        this(1, null, 1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.m(parcel, 2, this.e, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 3, this.f);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
