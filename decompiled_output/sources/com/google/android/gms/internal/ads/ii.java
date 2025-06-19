package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.z.d;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@d.a(creator = "AdResponseParcelCreator")
/* loaded from: classes.dex */
public final class ii extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<ii> CREATOR = new hi();

    @d.c(id = 28)
    private vi A;

    @d.c(id = 29)
    private String B;

    @d.c(id = 30)
    private final String C;

    @d.c(id = 31)
    private final boolean D;

    @d.c(id = 32)
    private final boolean E;

    @androidx.annotation.i0
    @d.c(id = 33)
    private final qk F;

    @androidx.annotation.i0
    @d.c(id = 34)
    private final List<String> G;

    @androidx.annotation.i0
    @d.c(id = 35)
    private final List<String> H;

    @d.c(id = 36)
    private final boolean I;

    @androidx.annotation.i0
    @d.c(id = 37)
    private final ki J;

    @d.c(id = 38)
    private final boolean K;

    @androidx.annotation.i0
    @d.c(id = 39)
    private String L;

    @d.c(id = 40)
    private final List<String> M;

    @d.c(id = 42)
    private final boolean N;

    @androidx.annotation.i0
    @d.c(id = 43)
    private final String O;

    @androidx.annotation.i0
    @d.c(id = 44)
    private final dm P;

    @androidx.annotation.i0
    @d.c(id = 45)
    private final String Q;

    @d.c(id = 46)
    private final boolean R;

    @d.c(id = 47)
    private final boolean S;

    @d.c(id = 48)
    private Bundle T;

    @d.c(id = 49)
    private final boolean U;

    @d.c(id = 50)
    private final int V;

    @d.c(id = 51)
    private final boolean W;

    @d.c(id = 52)
    private final List<String> X;

    @d.c(id = 53)
    private final boolean Y;

    @androidx.annotation.i0
    @d.c(id = 54)
    private final String Z;

    @androidx.annotation.i0
    @d.c(id = 55)
    private String a0;

    @d.c(id = 56)
    private boolean b0;

    @d.c(id = 57)
    private boolean c0;

    @d.c(id = 1)
    private final int d;

    @d.c(id = 2)
    private final String e;

    @d.c(id = 3)
    private String f;

    @d.c(id = 4)
    private final List<String> g;

    @d.c(id = 5)
    private final int h;

    @d.c(id = 6)
    private final List<String> i;

    @d.c(id = 7)
    private final long j;

    @d.c(id = 8)
    private final boolean k;

    @d.c(id = 9)
    private final long l;

    @d.c(id = 10)
    private final List<String> m;

    @d.c(id = 11)
    private final long n;

    @d.c(id = 12)
    private final int o;

    @d.c(id = 13)
    private final String p;

    @d.c(id = 14)
    private final long q;

    @d.c(id = 15)
    private final String r;

    @d.c(id = 18)
    private final boolean s;

    @d.c(id = 19)
    private final String t;

    @d.c(id = 21)
    private final String u;

    @d.c(id = 22)
    private final boolean v;

    @d.c(id = 23)
    private final boolean w;

    @d.c(id = 24)
    private final boolean x;

    @d.c(id = 25)
    private final boolean y;

    @d.c(id = 26)
    private final boolean z;

    @d.b
    ii(@d.e(id = 1) int r6, @d.e(id = 2) String str, @d.e(id = 3) String str2, @d.e(id = 4) List<String> list, @d.e(id = 5) int r10, @d.e(id = 6) List<String> list2, @d.e(id = 7) long j, @d.e(id = 8) boolean z, @d.e(id = 9) long j2, @d.e(id = 10) List<String> list3, @d.e(id = 11) long j3, @d.e(id = 12) int r20, @d.e(id = 13) String str3, @d.e(id = 14) long j4, @d.e(id = 15) String str4, @d.e(id = 18) boolean z2, @d.e(id = 19) String str5, @d.e(id = 21) String str6, @d.e(id = 22) boolean z3, @d.e(id = 23) boolean z4, @d.e(id = 24) boolean z5, @d.e(id = 25) boolean z6, @d.e(id = 26) boolean z7, @d.e(id = 28) vi viVar, @d.e(id = 29) String str7, @d.e(id = 30) String str8, @d.e(id = 31) boolean z8, @d.e(id = 32) boolean z9, @d.e(id = 33) qk qkVar, @d.e(id = 34) List<String> list4, @d.e(id = 35) List<String> list5, @d.e(id = 36) boolean z10, @d.e(id = 37) ki kiVar, @d.e(id = 38) boolean z11, @d.e(id = 39) String str9, @d.e(id = 40) List<String> list6, @d.e(id = 42) boolean z12, @d.e(id = 43) String str10, @d.e(id = 44) dm dmVar, @d.e(id = 45) String str11, @d.e(id = 46) boolean z13, @d.e(id = 47) boolean z14, @d.e(id = 48) Bundle bundle, @d.e(id = 49) boolean z15, @d.e(id = 50) int r54, @d.e(id = 51) boolean z16, @d.e(id = 52) List<String> list7, @d.e(id = 53) boolean z17, @d.e(id = 54) String str12, @androidx.annotation.i0 @d.e(id = 55) String str13, @d.e(id = 56) boolean z18, @d.e(id = 57) boolean z19) {
        yi yiVar;
        this.d = r6;
        this.e = str;
        this.f = str2;
        this.g = list != null ? Collections.unmodifiableList(list) : null;
        this.h = r10;
        this.i = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.j = j;
        this.k = z;
        this.l = j2;
        this.m = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.n = j3;
        this.o = r20;
        this.p = str3;
        this.q = j4;
        this.r = str4;
        this.s = z2;
        this.t = str5;
        this.u = str6;
        this.v = z3;
        this.w = z4;
        this.x = z5;
        this.y = z6;
        this.R = z13;
        this.z = z7;
        this.A = viVar;
        this.B = str7;
        this.C = str8;
        if (this.f == null && viVar != null && (yiVar = (yi) viVar.h(yi.CREATOR)) != null && !TextUtils.isEmpty(yiVar.d)) {
            this.f = yiVar.d;
        }
        this.D = z8;
        this.E = z9;
        this.F = qkVar;
        this.G = list4;
        this.H = list5;
        this.I = z10;
        this.J = kiVar;
        this.K = z11;
        this.L = str9;
        this.M = list6;
        this.N = z12;
        this.O = str10;
        this.P = dmVar;
        this.Q = str11;
        this.S = z14;
        this.T = bundle;
        this.U = z15;
        this.V = r54;
        this.W = z16;
        this.X = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.Y = z17;
        this.Z = str12;
        this.a0 = str13;
        this.b0 = z18;
        this.c0 = z19;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r7) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.e, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 3, this.f, false);
        com.google.android.gms.common.internal.z.c.Z(parcel, 4, this.g, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 5, this.h);
        com.google.android.gms.common.internal.z.c.Z(parcel, 6, this.i, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 7, this.j);
        com.google.android.gms.common.internal.z.c.g(parcel, 8, this.k);
        com.google.android.gms.common.internal.z.c.K(parcel, 9, this.l);
        com.google.android.gms.common.internal.z.c.Z(parcel, 10, this.m, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 11, this.n);
        com.google.android.gms.common.internal.z.c.F(parcel, 12, this.o);
        com.google.android.gms.common.internal.z.c.X(parcel, 13, this.p, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 14, this.q);
        com.google.android.gms.common.internal.z.c.X(parcel, 15, this.r, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 18, this.s);
        com.google.android.gms.common.internal.z.c.X(parcel, 19, this.t, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 21, this.u, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 22, this.v);
        com.google.android.gms.common.internal.z.c.g(parcel, 23, this.w);
        com.google.android.gms.common.internal.z.c.g(parcel, 24, this.x);
        com.google.android.gms.common.internal.z.c.g(parcel, 25, this.y);
        com.google.android.gms.common.internal.z.c.g(parcel, 26, this.z);
        com.google.android.gms.common.internal.z.c.S(parcel, 28, this.A, r7, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 29, this.B, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 30, this.C, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 31, this.D);
        com.google.android.gms.common.internal.z.c.g(parcel, 32, this.E);
        com.google.android.gms.common.internal.z.c.S(parcel, 33, this.F, r7, false);
        com.google.android.gms.common.internal.z.c.Z(parcel, 34, this.G, false);
        com.google.android.gms.common.internal.z.c.Z(parcel, 35, this.H, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 36, this.I);
        com.google.android.gms.common.internal.z.c.S(parcel, 37, this.J, r7, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 38, this.K);
        com.google.android.gms.common.internal.z.c.X(parcel, 39, this.L, false);
        com.google.android.gms.common.internal.z.c.Z(parcel, 40, this.M, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 42, this.N);
        com.google.android.gms.common.internal.z.c.X(parcel, 43, this.O, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 44, this.P, r7, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 45, this.Q, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 46, this.R);
        com.google.android.gms.common.internal.z.c.g(parcel, 47, this.S);
        com.google.android.gms.common.internal.z.c.k(parcel, 48, this.T, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 49, this.U);
        com.google.android.gms.common.internal.z.c.F(parcel, 50, this.V);
        com.google.android.gms.common.internal.z.c.g(parcel, 51, this.W);
        com.google.android.gms.common.internal.z.c.Z(parcel, 52, this.X, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 53, this.Y);
        com.google.android.gms.common.internal.z.c.X(parcel, 54, this.Z, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 55, this.a0, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 56, this.b0);
        com.google.android.gms.common.internal.z.c.g(parcel, 57, this.c0);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
