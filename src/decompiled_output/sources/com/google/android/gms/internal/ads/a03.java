package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.f({1})
@d.a(creator = "IconAdOptionsParcelCreator")
/* loaded from: classes.dex */
public final class a03 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<a03> CREATOR = new d03();

    @d.c(id = 2)
    private final int d;

    @d.b
    public a03(@d.e(id = 2) int r1) {
        this.d = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int r42 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 2, this.d);
        com.google.android.gms.common.internal.z.c.b(parcel, r42);
    }
}
