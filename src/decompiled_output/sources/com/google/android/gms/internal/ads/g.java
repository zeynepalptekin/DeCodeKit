package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "RequestConfigurationParcelCreator")
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<g> CREATOR = new f();

    @d.c(id = 1)
    private final int d;

    @d.c(id = 2)
    private final int e;

    @d.b
    public g(@d.e(id = 1) int r1, @d.e(id = 2) int r2) {
        this.d = r1;
        this.e = r2;
    }

    public g(com.google.android.gms.ads.x xVar) {
        this.d = xVar.b();
        this.e = xVar.c();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int r42 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.F(parcel, 2, this.e);
        com.google.android.gms.common.internal.z.c.b(parcel, r42);
    }
}
