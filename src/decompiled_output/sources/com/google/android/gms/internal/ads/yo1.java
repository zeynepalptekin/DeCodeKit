package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@d.a(creator = "PoolConfigurationCreator")
/* loaded from: classes.dex */
public final class yo1 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<yo1> CREATOR = new zo1();
    private final xo1[] d;
    private final int[] e;
    private final int[] f;

    @Nullable
    public final Context g;

    @d.c(getter = "getFormatInt", id = 1)
    private final int h;
    public final xo1 i;

    @d.c(id = 2)
    public final int j;

    @d.c(id = 3)
    public final int k;

    @d.c(id = 4)
    public final int l;

    @d.c(id = 5)
    public final String m;

    @d.c(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int n;
    public final int o;

    @d.c(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int p;
    private final int q;

    @d.b
    public yo1(@d.e(id = 1) int r3, @d.e(id = 2) int r4, @d.e(id = 3) int r5, @d.e(id = 4) int r6, @d.e(id = 5) String str, @d.e(id = 6) int r8, @d.e(id = 7) int r9) {
        this.d = xo1.values();
        this.e = ap1.a();
        int[] r0 = ap1.b();
        this.f = r0;
        this.g = null;
        this.h = r3;
        this.i = this.d[r3];
        this.j = r4;
        this.k = r5;
        this.l = r6;
        this.m = str;
        this.n = r8;
        this.o = this.e[r8];
        this.p = r9;
        this.q = r0[r9];
    }

    private yo1(@Nullable Context context, xo1 xo1Var, int r4, int r5, int r6, String str, String str2, String str3) {
        this.d = xo1.values();
        this.e = ap1.a();
        this.f = ap1.b();
        this.g = context;
        this.h = xo1Var.ordinal();
        this.i = xo1Var;
        this.j = r4;
        this.k = r5;
        this.l = r6;
        this.m = str;
        int r2 = "oldest".equals(str2) ? ap1.f2735a : ("lru".equals(str2) || !"lfu".equals(str2)) ? ap1.f2736b : ap1.f2737c;
        this.o = r2;
        this.n = r2 - 1;
        "onAdClosed".equals(str3);
        int r22 = ap1.e;
        this.q = r22;
        this.p = r22 - 1;
    }

    public static yo1 h(xo1 xo1Var, Context context) {
        if (xo1Var == xo1.Rewarded) {
            return new yo1(context, xo1Var, ((Integer) qx2.e().c(e0.z4)).intValue(), ((Integer) qx2.e().c(e0.F4)).intValue(), ((Integer) qx2.e().c(e0.H4)).intValue(), (String) qx2.e().c(e0.J4), (String) qx2.e().c(e0.B4), (String) qx2.e().c(e0.D4));
        }
        if (xo1Var == xo1.Interstitial) {
            return new yo1(context, xo1Var, ((Integer) qx2.e().c(e0.A4)).intValue(), ((Integer) qx2.e().c(e0.G4)).intValue(), ((Integer) qx2.e().c(e0.I4)).intValue(), (String) qx2.e().c(e0.K4), (String) qx2.e().c(e0.C4), (String) qx2.e().c(e0.E4));
        }
        if (xo1Var != xo1.AppOpen) {
            return null;
        }
        return new yo1(context, xo1Var, ((Integer) qx2.e().c(e0.N4)).intValue(), ((Integer) qx2.e().c(e0.P4)).intValue(), ((Integer) qx2.e().c(e0.Q4)).intValue(), (String) qx2.e().c(e0.L4), (String) qx2.e().c(e0.M4), (String) qx2.e().c(e0.O4));
    }

    public static boolean i() {
        return ((Boolean) qx2.e().c(e0.y4)).booleanValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.h);
        com.google.android.gms.common.internal.z.c.F(parcel, 2, this.j);
        com.google.android.gms.common.internal.z.c.F(parcel, 3, this.k);
        com.google.android.gms.common.internal.z.c.F(parcel, 4, this.l);
        com.google.android.gms.common.internal.z.c.X(parcel, 5, this.m, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 6, this.n);
        com.google.android.gms.common.internal.z.c.F(parcel, 7, this.p);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
