package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "AdDataParcelCreator")
/* loaded from: classes.dex */
public final class aw2 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<aw2> CREATOR = new ew2();

    @d.c(id = 1)
    public final String d;

    @d.c(id = 2)
    public final String e;

    @d.b
    public aw2(@d.e(id = 1) String str, @d.e(id = 2) String str2) {
        this.d = str;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 1, this.d, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.e, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
