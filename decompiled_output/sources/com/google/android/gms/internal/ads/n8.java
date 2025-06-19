package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@d.a(creator = "InstreamAdConfigurationParcelCreator")
/* loaded from: classes.dex */
public final class n8 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<n8> CREATOR = new m8();

    @d.g(id = 1000)
    public final int d;

    @d.c(id = 1)
    public final int e;

    @d.c(id = 2)
    public final String f;

    @d.c(id = 3)
    public final int g;

    @d.b
    public n8(@d.e(id = 1000) int r1, @d.e(id = 1) int r2, @d.e(id = 2) String str, @d.e(id = 3) int r4) {
        this.d = r1;
        this.e = r2;
        this.f = str;
        this.g = r4;
    }

    public n8(z8 z8Var) {
        this(2, 1, z8Var.b(), z8Var.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.e);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.f, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 3, this.g);
        com.google.android.gms.common.internal.z.c.F(parcel, 1000, this.d);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
