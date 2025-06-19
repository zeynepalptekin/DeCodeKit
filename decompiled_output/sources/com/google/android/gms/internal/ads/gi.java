package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@d.a(creator = "AdRequestInfoParcelCreator")
/* loaded from: classes.dex */
public final class gi extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<gi> CREATOR = new fi();

    @d.c(id = 28)
    private final String A;

    @d.c(id = 29)
    private final z2 B;

    @d.c(id = 30)
    private final List<String> C;

    @d.c(id = 31)
    private final long D;

    @d.c(id = 33)
    private final String E;

    @d.c(id = 34)
    private final float F;

    @d.c(id = 35)
    private final int G;

    @d.c(id = 36)
    private final int H;

    @d.c(id = 37)
    private final boolean I;

    @d.c(id = 38)
    private final boolean J;

    @d.c(id = 39)
    private final String K;

    @d.c(id = 40)
    private final boolean L;

    @d.c(id = 41)
    private final String M;

    @d.c(id = 42)
    private final boolean N;

    @d.c(id = 43)
    private final int O;

    @d.c(id = 44)
    private final Bundle P;

    @d.c(id = 45)
    private final String Q;

    @androidx.annotation.i0
    @d.c(id = 46)
    private final a03 R;

    @d.c(id = 47)
    private final boolean S;

    @d.c(id = 48)
    private final Bundle T;

    @androidx.annotation.i0
    @d.c(id = 49)
    private final String U;

    @androidx.annotation.i0
    @d.c(id = 50)
    private final String V;

    @androidx.annotation.i0
    @d.c(id = 51)
    private final String W;

    @d.c(id = 52)
    private final boolean X;

    @d.c(id = 53)
    private final List<Integer> Y;

    @d.c(id = 54)
    private final String Z;

    @d.c(id = 55)
    private final List<String> a0;

    @d.c(id = 56)
    private final int b0;

    @d.c(id = 57)
    private final boolean c0;

    @d.c(id = 1)
    private final int d;

    @d.c(id = 58)
    private final boolean d0;

    @androidx.annotation.i0
    @d.c(id = 2)
    private final Bundle e;

    @d.c(id = 59)
    private final boolean e0;

    @d.c(id = 3)
    private final jw2 f;

    @d.c(id = 60)
    private final ArrayList<String> f0;

    @d.c(id = 4)
    private final qw2 g;

    @d.c(id = 61)
    private final String g0;

    @d.c(id = 5)
    private final String h;

    @d.c(id = 63)
    private final n8 h0;

    @d.c(id = 6)
    private final ApplicationInfo i;

    @androidx.annotation.i0
    @d.c(id = 64)
    private final String i0;

    @androidx.annotation.i0
    @d.c(id = 7)
    private final PackageInfo j;

    @d.c(id = 65)
    private final Bundle j0;

    @d.c(id = 8)
    private final String k;

    @d.c(id = 9)
    private final String l;

    @d.c(id = 10)
    private final String m;

    @d.c(id = 11)
    private final as n;

    @d.c(id = 12)
    private final Bundle o;

    @d.c(id = 13)
    private final int p;

    @d.c(id = 14)
    private final List<String> q;

    @d.c(id = 15)
    private final Bundle r;

    @d.c(id = 16)
    private final boolean s;

    @d.c(id = 18)
    private final int t;

    @d.c(id = 19)
    private final int u;

    @d.c(id = 20)
    private final float v;

    @d.c(id = 21)
    private final String w;

    @d.c(id = 25)
    private final long x;

    @d.c(id = 26)
    private final String y;

    @androidx.annotation.i0
    @d.c(id = 27)
    private final List<String> z;

    @d.b
    gi(@d.e(id = 1) int r4, @d.e(id = 2) Bundle bundle, @d.e(id = 3) jw2 jw2Var, @d.e(id = 4) qw2 qw2Var, @d.e(id = 5) String str, @d.e(id = 6) ApplicationInfo applicationInfo, @d.e(id = 7) PackageInfo packageInfo, @d.e(id = 8) String str2, @d.e(id = 9) String str3, @d.e(id = 10) String str4, @d.e(id = 11) as asVar, @d.e(id = 12) Bundle bundle2, @d.e(id = 13) int r16, @d.e(id = 14) List<String> list, @d.e(id = 15) Bundle bundle3, @d.e(id = 16) boolean z, @d.e(id = 18) int r20, @d.e(id = 19) int r21, @d.e(id = 20) float f, @d.e(id = 21) String str5, @d.e(id = 25) long j, @d.e(id = 26) String str6, @d.e(id = 27) List<String> list2, @d.e(id = 28) String str7, @d.e(id = 29) z2 z2Var, @d.e(id = 30) List<String> list3, @d.e(id = 31) long j2, @d.e(id = 33) String str8, @d.e(id = 34) float f2, @d.e(id = 40) boolean z2, @d.e(id = 35) int r36, @d.e(id = 36) int r37, @d.e(id = 37) boolean z3, @d.e(id = 38) boolean z4, @d.e(id = 39) String str9, @d.e(id = 41) String str10, @d.e(id = 42) boolean z5, @d.e(id = 43) int r43, @d.e(id = 44) Bundle bundle4, @d.e(id = 45) String str11, @d.e(id = 46) a03 a03Var, @d.e(id = 47) boolean z6, @d.e(id = 48) Bundle bundle5, @androidx.annotation.i0 @d.e(id = 49) String str12, @androidx.annotation.i0 @d.e(id = 50) String str13, @androidx.annotation.i0 @d.e(id = 51) String str14, @d.e(id = 52) boolean z7, @d.e(id = 53) List<Integer> list4, @d.e(id = 54) String str15, @d.e(id = 55) List<String> list5, @d.e(id = 56) int r56, @d.e(id = 57) boolean z8, @d.e(id = 58) boolean z9, @d.e(id = 59) boolean z10, @d.e(id = 60) ArrayList<String> arrayList, @d.e(id = 61) String str16, @d.e(id = 63) n8 n8Var, @androidx.annotation.i0 @d.e(id = 64) String str17, @d.e(id = 65) Bundle bundle6) {
        this.d = r4;
        this.e = bundle;
        this.f = jw2Var;
        this.g = qw2Var;
        this.h = str;
        this.i = applicationInfo;
        this.j = packageInfo;
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = asVar;
        this.o = bundle2;
        this.p = r16;
        this.q = list;
        this.C = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.r = bundle3;
        this.s = z;
        this.t = r20;
        this.u = r21;
        this.v = f;
        this.w = str5;
        this.x = j;
        this.y = str6;
        this.z = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.A = str7;
        this.B = z2Var;
        this.D = j2;
        this.E = str8;
        this.F = f2;
        this.L = z2;
        this.G = r36;
        this.H = r37;
        this.I = z3;
        this.J = z4;
        this.K = str9;
        this.M = str10;
        this.N = z5;
        this.O = r43;
        this.P = bundle4;
        this.Q = str11;
        this.R = a03Var;
        this.S = z6;
        this.T = bundle5;
        this.U = str12;
        this.V = str13;
        this.W = str14;
        this.X = z7;
        this.Y = list4;
        this.Z = str15;
        this.a0 = list5;
        this.b0 = r56;
        this.c0 = z8;
        this.d0 = z9;
        this.e0 = z10;
        this.f0 = arrayList;
        this.g0 = str16;
        this.h0 = n8Var;
        this.i0 = str17;
        this.j0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r7) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.k(parcel, 2, this.e, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 3, this.f, r7, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 4, this.g, r7, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 5, this.h, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 6, this.i, r7, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 7, this.j, r7, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 8, this.k, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 9, this.l, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 10, this.m, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 11, this.n, r7, false);
        com.google.android.gms.common.internal.z.c.k(parcel, 12, this.o, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 13, this.p);
        com.google.android.gms.common.internal.z.c.Z(parcel, 14, this.q, false);
        com.google.android.gms.common.internal.z.c.k(parcel, 15, this.r, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 16, this.s);
        com.google.android.gms.common.internal.z.c.F(parcel, 18, this.t);
        com.google.android.gms.common.internal.z.c.F(parcel, 19, this.u);
        com.google.android.gms.common.internal.z.c.w(parcel, 20, this.v);
        com.google.android.gms.common.internal.z.c.X(parcel, 21, this.w, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 25, this.x);
        com.google.android.gms.common.internal.z.c.X(parcel, 26, this.y, false);
        com.google.android.gms.common.internal.z.c.Z(parcel, 27, this.z, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 28, this.A, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 29, this.B, r7, false);
        com.google.android.gms.common.internal.z.c.Z(parcel, 30, this.C, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 31, this.D);
        com.google.android.gms.common.internal.z.c.X(parcel, 33, this.E, false);
        com.google.android.gms.common.internal.z.c.w(parcel, 34, this.F);
        com.google.android.gms.common.internal.z.c.F(parcel, 35, this.G);
        com.google.android.gms.common.internal.z.c.F(parcel, 36, this.H);
        com.google.android.gms.common.internal.z.c.g(parcel, 37, this.I);
        com.google.android.gms.common.internal.z.c.g(parcel, 38, this.J);
        com.google.android.gms.common.internal.z.c.X(parcel, 39, this.K, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 40, this.L);
        com.google.android.gms.common.internal.z.c.X(parcel, 41, this.M, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 42, this.N);
        com.google.android.gms.common.internal.z.c.F(parcel, 43, this.O);
        com.google.android.gms.common.internal.z.c.k(parcel, 44, this.P, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 45, this.Q, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 46, this.R, r7, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 47, this.S);
        com.google.android.gms.common.internal.z.c.k(parcel, 48, this.T, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 49, this.U, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 50, this.V, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 51, this.W, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 52, this.X);
        com.google.android.gms.common.internal.z.c.H(parcel, 53, this.Y, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 54, this.Z, false);
        com.google.android.gms.common.internal.z.c.Z(parcel, 55, this.a0, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 56, this.b0);
        com.google.android.gms.common.internal.z.c.g(parcel, 57, this.c0);
        com.google.android.gms.common.internal.z.c.g(parcel, 58, this.d0);
        com.google.android.gms.common.internal.z.c.g(parcel, 59, this.e0);
        com.google.android.gms.common.internal.z.c.Z(parcel, 60, this.f0, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 61, this.g0, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 63, this.h0, r7, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 64, this.i0, false);
        com.google.android.gms.common.internal.z.c.k(parcel, 65, this.j0, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
