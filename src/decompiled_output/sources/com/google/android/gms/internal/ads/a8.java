package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "AdapterStatusParcelCreator")
/* loaded from: classes.dex */
public final class a8 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<a8> CREATOR = new z7();

    @d.c(id = 1)
    public final String d;

    @d.c(id = 2)
    public final boolean e;

    @d.c(id = 3)
    public final int f;

    @d.c(id = 4)
    public final String g;

    @d.b
    public a8(@d.e(id = 1) String str, @d.e(id = 2) boolean z, @d.e(id = 3) int r3, @d.e(id = 4) String str2) {
        this.d = str;
        this.e = z;
        this.f = r3;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 1, this.d, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 2, this.e);
        com.google.android.gms.common.internal.z.c.F(parcel, 3, this.f);
        com.google.android.gms.common.internal.z.c.X(parcel, 4, this.g, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
