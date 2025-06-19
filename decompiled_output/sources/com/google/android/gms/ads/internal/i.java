package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.f({1})
@d.a(creator = "InterstitialAdParameterParcelCreator")
/* loaded from: classes.dex */
public final class i extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<i> CREATOR = new h();

    @d.c(id = 2)
    public final boolean d;

    @d.c(id = 3)
    public final boolean e;

    @d.c(id = 4)
    private final String f;

    @d.c(id = 5)
    public final boolean g;

    @d.c(id = 6)
    public final float h;

    @d.c(id = 7)
    public final int i;

    @d.c(id = 8)
    public final boolean j;

    @d.c(id = 9)
    public final boolean k;

    @d.c(id = 10)
    public final boolean l;

    @d.b
    i(@d.e(id = 2) boolean z, @d.e(id = 3) boolean z2, @d.e(id = 4) String str, @d.e(id = 5) boolean z3, @d.e(id = 6) float f, @d.e(id = 7) int r6, @d.e(id = 8) boolean z4, @d.e(id = 9) boolean z5, @d.e(id = 10) boolean z6) {
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = z3;
        this.h = f;
        this.i = r6;
        this.j = z4;
        this.k = z5;
        this.l = z6;
    }

    public i(boolean z, boolean z2, boolean z3, float f, int r15, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, false, 0.0f, -1, z4, z5, z6);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.g(parcel, 2, this.d);
        com.google.android.gms.common.internal.z.c.g(parcel, 3, this.e);
        com.google.android.gms.common.internal.z.c.X(parcel, 4, this.f, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 5, this.g);
        com.google.android.gms.common.internal.z.c.w(parcel, 6, this.h);
        com.google.android.gms.common.internal.z.c.F(parcel, 7, this.i);
        com.google.android.gms.common.internal.z.c.g(parcel, 8, this.j);
        com.google.android.gms.common.internal.z.c.g(parcel, 9, this.k);
        com.google.android.gms.common.internal.z.c.g(parcel, 10, this.l);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
