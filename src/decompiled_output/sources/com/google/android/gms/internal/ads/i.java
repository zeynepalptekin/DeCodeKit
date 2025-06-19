package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.f({1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14})
@d.a(creator = "SearchAdRequestParcelCreator")
/* loaded from: classes.dex */
public final class i extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<i> CREATOR = new h();

    @d.c(id = 15)
    public final String d;

    public i(com.google.android.gms.ads.n0.b bVar) {
        this.d = bVar.r();
    }

    @d.b
    i(@d.e(id = 15) String str) {
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 15, this.d, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
