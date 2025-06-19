package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "NativeAdOptionsParcelCreator")
/* loaded from: classes.dex */
public final class z2 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<z2> CREATOR = new y2();

    @d.c(id = 1)
    public final int d;

    @d.c(id = 2)
    public final boolean e;

    @d.c(id = 3)
    public final int f;

    @d.c(id = 4)
    public final boolean g;

    @d.c(id = 5)
    public final int h;

    @androidx.annotation.i0
    @d.c(id = 6)
    public final m i;

    @d.c(id = 7)
    public final boolean j;

    @d.c(id = 8)
    public final int k;

    @d.b
    public z2(@d.e(id = 1) int r1, @d.e(id = 2) boolean z, @d.e(id = 3) int r3, @d.e(id = 4) boolean z2, @d.e(id = 5) int r5, @d.e(id = 6) m mVar, @d.e(id = 7) boolean z3, @d.e(id = 8) int r8) {
        this.d = r1;
        this.e = z;
        this.f = r3;
        this.g = z2;
        this.h = r5;
        this.i = mVar;
        this.j = z3;
        this.k = r8;
    }

    public z2(com.google.android.gms.ads.d0.d dVar) {
        this(4, dVar.f(), dVar.b(), dVar.e(), dVar.a(), dVar.d() != null ? new m(dVar.d()) : null, dVar.g(), dVar.c());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.g(parcel, 2, this.e);
        com.google.android.gms.common.internal.z.c.F(parcel, 3, this.f);
        com.google.android.gms.common.internal.z.c.g(parcel, 4, this.g);
        com.google.android.gms.common.internal.z.c.F(parcel, 5, this.h);
        com.google.android.gms.common.internal.z.c.S(parcel, 6, this.i, r6, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 7, this.j);
        com.google.android.gms.common.internal.z.c.F(parcel, 8, this.k);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
