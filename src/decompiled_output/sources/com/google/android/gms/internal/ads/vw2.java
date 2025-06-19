package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.b0.a;
import com.google.android.gms.common.internal.z.d;

@d.f({1})
@d.a(creator = "AppOpenAdOptionsParcelCreator")
/* loaded from: classes.dex */
public final class vw2 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<vw2> CREATOR = new yw2();

    @d.c(id = 2)
    @a.b
    public final int d;

    @d.b
    public vw2(@a.b @d.e(id = 2) int r1) {
        this.d = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int r42 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 2, this.d);
        com.google.android.gms.common.internal.z.c.b(parcel, r42);
    }
}
