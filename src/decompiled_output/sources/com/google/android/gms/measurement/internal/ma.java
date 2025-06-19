package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.z.d;
import java.util.List;

@d.f({1, 20})
@d.a(creator = "AppMetadataCreator")
/* loaded from: classes.dex */
public final class ma extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<ma> CREATOR = new la();

    @d.c(id = 2)
    public final String d;

    @d.c(id = 3)
    public final String e;

    @d.c(id = 4)
    public final String f;

    @d.c(id = 5)
    public final String g;

    @d.c(id = 6)
    public final long h;

    @d.c(id = 7)
    public final long i;

    @d.c(id = 8)
    public final String j;

    @d.c(defaultValue = "true", id = 9)
    public final boolean k;

    @d.c(id = 10)
    public final boolean l;

    @d.c(defaultValueUnchecked = "Integer.MIN_VALUE", id = 11)
    public final long m;

    @d.c(id = 12)
    public final String n;

    @d.c(id = 13)
    public final long o;

    @d.c(id = 14)
    public final long p;

    @d.c(id = 15)
    public final int q;

    @d.c(defaultValue = "true", id = 16)
    public final boolean r;

    @d.c(defaultValue = "true", id = 17)
    public final boolean s;

    @d.c(id = 18)
    public final boolean t;

    @d.c(id = 19)
    public final String u;

    @d.c(id = 21)
    public final Boolean v;

    @d.c(id = 22)
    public final long w;

    @d.c(id = 23)
    public final List<String> x;

    @d.c(id = 24)
    public final String y;

    @d.c(defaultValue = "", id = 25)
    public final String z;

    ma(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int r22, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8, String str9) {
        com.google.android.gms.common.internal.r.g(str);
        this.d = str;
        this.e = TextUtils.isEmpty(str2) ? null : str2;
        this.f = str3;
        this.m = j;
        this.g = str4;
        this.h = j2;
        this.i = j3;
        this.j = str5;
        this.k = z;
        this.l = z2;
        this.n = str6;
        this.o = j4;
        this.p = j5;
        this.q = r22;
        this.r = z3;
        this.s = z4;
        this.t = z5;
        this.u = str7;
        this.v = bool;
        this.w = j6;
        this.x = list;
        this.y = str8;
        this.z = str9;
    }

    @d.b
    ma(@d.e(id = 2) String str, @d.e(id = 3) String str2, @d.e(id = 4) String str3, @d.e(id = 5) String str4, @d.e(id = 6) long j, @d.e(id = 7) long j2, @d.e(id = 8) String str5, @d.e(id = 9) boolean z, @d.e(id = 10) boolean z2, @d.e(id = 11) long j3, @d.e(id = 12) String str6, @d.e(id = 13) long j4, @d.e(id = 14) long j5, @d.e(id = 15) int r22, @d.e(id = 16) boolean z3, @d.e(id = 17) boolean z4, @d.e(id = 18) boolean z5, @d.e(id = 19) String str7, @d.e(id = 21) Boolean bool, @d.e(id = 22) long j6, @d.e(id = 23) List<String> list, @d.e(id = 24) String str8, @d.e(id = 25) String str9) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.m = j3;
        this.g = str4;
        this.h = j;
        this.i = j2;
        this.j = str5;
        this.k = z;
        this.l = z2;
        this.n = str6;
        this.o = j4;
        this.p = j5;
        this.q = r22;
        this.r = z3;
        this.s = z4;
        this.t = z5;
        this.u = str7;
        this.v = bool;
        this.w = j6;
        this.x = list;
        this.y = str8;
        this.z = str9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int r62 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.d, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 3, this.e, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 4, this.f, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 5, this.g, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 6, this.h);
        com.google.android.gms.common.internal.z.c.K(parcel, 7, this.i);
        com.google.android.gms.common.internal.z.c.X(parcel, 8, this.j, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 9, this.k);
        com.google.android.gms.common.internal.z.c.g(parcel, 10, this.l);
        com.google.android.gms.common.internal.z.c.K(parcel, 11, this.m);
        com.google.android.gms.common.internal.z.c.X(parcel, 12, this.n, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 13, this.o);
        com.google.android.gms.common.internal.z.c.K(parcel, 14, this.p);
        com.google.android.gms.common.internal.z.c.F(parcel, 15, this.q);
        com.google.android.gms.common.internal.z.c.g(parcel, 16, this.r);
        com.google.android.gms.common.internal.z.c.g(parcel, 17, this.s);
        com.google.android.gms.common.internal.z.c.g(parcel, 18, this.t);
        com.google.android.gms.common.internal.z.c.X(parcel, 19, this.u, false);
        com.google.android.gms.common.internal.z.c.j(parcel, 21, this.v, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 22, this.w);
        com.google.android.gms.common.internal.z.c.Z(parcel, 23, this.x, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 24, this.y, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 25, this.z, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r62);
    }
}
