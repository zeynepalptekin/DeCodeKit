package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.z.d;

@d.f({1})
@d.a(creator = "AdSizeParcelCreator")
/* loaded from: classes.dex */
public final class qw2 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<qw2> CREATOR = new pw2();

    @d.c(id = 2)
    public final String d;

    @d.c(id = 3)
    public final int e;

    @d.c(id = 4)
    public final int f;

    @d.c(id = 5)
    public final boolean g;

    @d.c(id = 6)
    public final int h;

    @d.c(id = 7)
    public final int i;

    @d.c(id = 8)
    public final qw2[] j;

    @d.c(id = 9)
    public final boolean k;

    @d.c(id = 10)
    public final boolean l;

    @d.c(id = 11)
    public boolean m;

    @d.c(id = 12)
    public boolean n;

    @d.c(id = 13)
    private boolean o;

    @d.c(id = 14)
    public boolean p;

    @d.c(id = 15)
    public boolean q;

    public qw2() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false);
    }

    public qw2(Context context, com.google.android.gms.ads.f fVar) {
        this(context, new com.google.android.gms.ads.f[]{fVar});
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qw2(android.content.Context r13, com.google.android.gms.ads.f[] r14) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qw2.<init>(android.content.Context, com.google.android.gms.ads.f[]):void");
    }

    @d.b
    qw2(@d.e(id = 2) String str, @d.e(id = 3) int r2, @d.e(id = 4) int r3, @d.e(id = 5) boolean z, @d.e(id = 6) int r5, @d.e(id = 7) int r6, @d.e(id = 8) qw2[] qw2VarArr, @d.e(id = 9) boolean z2, @d.e(id = 10) boolean z3, @d.e(id = 11) boolean z4, @d.e(id = 12) boolean z5, @d.e(id = 13) boolean z6, @d.e(id = 14) boolean z7, @d.e(id = 15) boolean z8) {
        this.d = str;
        this.e = r2;
        this.f = r3;
        this.g = z;
        this.h = r5;
        this.i = r6;
        this.j = qw2VarArr;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.q = z8;
    }

    public static int h(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int i(DisplayMetrics displayMetrics) {
        return (int) (j(displayMetrics) * displayMetrics.density);
    }

    private static int j(DisplayMetrics displayMetrics) {
        int r1 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (r1 <= 400) {
            return 32;
        }
        return r1 <= 720 ? 50 : 90;
    }

    public static qw2 l() {
        return new qw2("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false);
    }

    public static qw2 t() {
        return new qw2("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false);
    }

    public static qw2 u() {
        return new qw2("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false);
    }

    public static qw2 y() {
        return new qw2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false);
    }

    public final com.google.android.gms.ads.f B() {
        return com.google.android.gms.ads.p0.b(this.h, this.e, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.d, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 3, this.e);
        com.google.android.gms.common.internal.z.c.F(parcel, 4, this.f);
        com.google.android.gms.common.internal.z.c.g(parcel, 5, this.g);
        com.google.android.gms.common.internal.z.c.F(parcel, 6, this.h);
        com.google.android.gms.common.internal.z.c.F(parcel, 7, this.i);
        com.google.android.gms.common.internal.z.c.b0(parcel, 8, this.j, r6, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 9, this.k);
        com.google.android.gms.common.internal.z.c.g(parcel, 10, this.l);
        com.google.android.gms.common.internal.z.c.g(parcel, 11, this.m);
        com.google.android.gms.common.internal.z.c.g(parcel, 12, this.n);
        com.google.android.gms.common.internal.z.c.g(parcel, 13, this.o);
        com.google.android.gms.common.internal.z.c.g(parcel, 14, this.p);
        com.google.android.gms.common.internal.z.c.g(parcel, 15, this.q);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
