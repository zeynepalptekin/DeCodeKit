package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.f({1})
@d.a(creator = "StringParcelCreator")
/* loaded from: classes.dex */
public final class yi extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<yi> CREATOR = new bj();

    @d.c(id = 2)
    String d;

    @d.b
    public yi(@d.e(id = 2) String str) {
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.d, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
