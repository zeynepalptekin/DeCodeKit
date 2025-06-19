package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import java.util.ArrayList;
import java.util.List;

@d.a(creator = "AdRequestParcelCreator")
/* loaded from: classes.dex */
public final class jw2 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<jw2> CREATOR = new lw2();

    @d.c(id = 1)
    public final int d;

    @d.c(id = 2)
    @Deprecated
    public final long e;

    @d.c(id = 3)
    public final Bundle f;

    @d.c(id = 4)
    @Deprecated
    public final int g;

    @d.c(id = 5)
    public final List<String> h;

    @d.c(id = 6)
    public final boolean i;

    @d.c(id = 7)
    public final int j;

    @d.c(id = 8)
    public final boolean k;

    @d.c(id = 9)
    public final String l;

    @d.c(id = 10)
    public final i m;

    @d.c(id = 11)
    public final Location n;

    @d.c(id = 12)
    public final String o;

    @d.c(id = 13)
    public final Bundle p;

    @d.c(id = 14)
    public final Bundle q;

    @d.c(id = 15)
    public final List<String> r;

    @d.c(id = 16)
    public final String s;

    @d.c(id = 17)
    public final String t;

    @d.c(id = 18)
    @Deprecated
    public final boolean u;

    @androidx.annotation.i0
    @d.c(id = 19)
    public final aw2 v;

    @d.c(id = 20)
    public final int w;

    @androidx.annotation.i0
    @d.c(id = 21)
    public final String x;

    @d.c(id = 22)
    public final List<String> y;

    @d.b
    public jw2(@d.e(id = 1) int r4, @d.e(id = 2) long j, @d.e(id = 3) Bundle bundle, @d.e(id = 4) int r8, @d.e(id = 5) List<String> list, @d.e(id = 6) boolean z, @d.e(id = 7) int r11, @d.e(id = 8) boolean z2, @d.e(id = 9) String str, @d.e(id = 10) i iVar, @d.e(id = 11) Location location, @d.e(id = 12) String str2, @d.e(id = 13) Bundle bundle2, @d.e(id = 14) Bundle bundle3, @d.e(id = 15) List<String> list2, @d.e(id = 16) String str3, @d.e(id = 17) String str4, @d.e(id = 18) boolean z3, @d.e(id = 19) aw2 aw2Var, @d.e(id = 20) int r24, @androidx.annotation.i0 @d.e(id = 21) String str5, @d.e(id = 22) List<String> list3) {
        this.d = r4;
        this.e = j;
        this.f = bundle == null ? new Bundle() : bundle;
        this.g = r8;
        this.h = list;
        this.i = z;
        this.j = r11;
        this.k = z2;
        this.l = str;
        this.m = iVar;
        this.n = location;
        this.o = str2;
        this.p = bundle2 == null ? new Bundle() : bundle2;
        this.q = bundle3;
        this.r = list2;
        this.s = str3;
        this.t = str4;
        this.u = z3;
        this.v = aw2Var;
        this.w = r24;
        this.x = str5;
        this.y = list3 == null ? new ArrayList<>() : list3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jw2)) {
            return false;
        }
        jw2 jw2Var = (jw2) obj;
        return this.d == jw2Var.d && this.e == jw2Var.e && com.google.android.gms.common.internal.q.b(this.f, jw2Var.f) && this.g == jw2Var.g && com.google.android.gms.common.internal.q.b(this.h, jw2Var.h) && this.i == jw2Var.i && this.j == jw2Var.j && this.k == jw2Var.k && com.google.android.gms.common.internal.q.b(this.l, jw2Var.l) && com.google.android.gms.common.internal.q.b(this.m, jw2Var.m) && com.google.android.gms.common.internal.q.b(this.n, jw2Var.n) && com.google.android.gms.common.internal.q.b(this.o, jw2Var.o) && com.google.android.gms.common.internal.q.b(this.p, jw2Var.p) && com.google.android.gms.common.internal.q.b(this.q, jw2Var.q) && com.google.android.gms.common.internal.q.b(this.r, jw2Var.r) && com.google.android.gms.common.internal.q.b(this.s, jw2Var.s) && com.google.android.gms.common.internal.q.b(this.t, jw2Var.t) && this.u == jw2Var.u && this.w == jw2Var.w && com.google.android.gms.common.internal.q.b(this.x, jw2Var.x) && com.google.android.gms.common.internal.q.b(this.y, jw2Var.y);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(this.d), Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Boolean.valueOf(this.i), Integer.valueOf(this.j), Boolean.valueOf(this.k), this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, Boolean.valueOf(this.u), Integer.valueOf(this.w), this.x, this.y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.K(parcel, 2, this.e);
        com.google.android.gms.common.internal.z.c.k(parcel, 3, this.f, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 4, this.g);
        com.google.android.gms.common.internal.z.c.Z(parcel, 5, this.h, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 6, this.i);
        com.google.android.gms.common.internal.z.c.F(parcel, 7, this.j);
        com.google.android.gms.common.internal.z.c.g(parcel, 8, this.k);
        com.google.android.gms.common.internal.z.c.X(parcel, 9, this.l, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 10, this.m, r6, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 11, this.n, r6, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 12, this.o, false);
        com.google.android.gms.common.internal.z.c.k(parcel, 13, this.p, false);
        com.google.android.gms.common.internal.z.c.k(parcel, 14, this.q, false);
        com.google.android.gms.common.internal.z.c.Z(parcel, 15, this.r, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 16, this.s, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 17, this.t, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 18, this.u);
        com.google.android.gms.common.internal.z.c.S(parcel, 19, this.v, r6, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 20, this.w);
        com.google.android.gms.common.internal.z.c.X(parcel, 21, this.x, false);
        com.google.android.gms.common.internal.z.c.Z(parcel, 22, this.y, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
