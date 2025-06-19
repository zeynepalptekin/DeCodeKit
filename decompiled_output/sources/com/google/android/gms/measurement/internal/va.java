package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "ConditionalUserPropertyParcelCreator")
/* loaded from: classes.dex */
public final class va extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<va> CREATOR = new ya();

    @d.c(id = 2)
    public String d;

    @d.c(id = 3)
    public String e;

    @d.c(id = 4)
    public ca f;

    @d.c(id = 5)
    public long g;

    @d.c(id = 6)
    public boolean h;

    @d.c(id = 7)
    public String i;

    @d.c(id = 8)
    public s j;

    @d.c(id = 9)
    public long k;

    @d.c(id = 10)
    public s l;

    @d.c(id = 11)
    public long m;

    @d.c(id = 12)
    public s n;

    va(va vaVar) {
        com.google.android.gms.common.internal.r.k(vaVar);
        this.d = vaVar.d;
        this.e = vaVar.e;
        this.f = vaVar.f;
        this.g = vaVar.g;
        this.h = vaVar.h;
        this.i = vaVar.i;
        this.j = vaVar.j;
        this.k = vaVar.k;
        this.l = vaVar.l;
        this.m = vaVar.m;
        this.n = vaVar.n;
    }

    @d.b
    va(@d.e(id = 2) String str, @d.e(id = 3) String str2, @d.e(id = 4) ca caVar, @d.e(id = 5) long j, @d.e(id = 6) boolean z, @d.e(id = 7) String str3, @d.e(id = 8) s sVar, @d.e(id = 9) long j2, @d.e(id = 10) s sVar2, @d.e(id = 11) long j3, @d.e(id = 12) s sVar3) {
        this.d = str;
        this.e = str2;
        this.f = caVar;
        this.g = j;
        this.h = z;
        this.i = str3;
        this.j = sVar;
        this.k = j2;
        this.l = sVar2;
        this.m = j3;
        this.n = sVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r7) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.d, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 3, this.e, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 4, this.f, r7, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 5, this.g);
        com.google.android.gms.common.internal.z.c.g(parcel, 6, this.h);
        com.google.android.gms.common.internal.z.c.X(parcel, 7, this.i, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 8, this.j, r7, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 9, this.k);
        com.google.android.gms.common.internal.z.c.S(parcel, 10, this.l, r7, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 11, this.m);
        com.google.android.gms.common.internal.z.c.S(parcel, 12, this.n, r7, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
