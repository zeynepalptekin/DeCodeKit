package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "GassRequestParcelCreator")
/* loaded from: classes.dex */
public final class ft1 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<ft1> CREATOR = new it1();

    @d.g(id = 1)
    private final int d;

    @d.c(id = 2)
    private final String e;

    @d.c(id = 3)
    private final String f;

    @d.b
    ft1(@d.e(id = 1) int r1, @d.e(id = 2) String str, @d.e(id = 3) String str2) {
        this.d = r1;
        this.e = str;
        this.f = str2;
    }

    public ft1(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.e, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 3, this.f, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
