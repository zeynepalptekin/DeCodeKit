package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
final class zh2 {

    /* renamed from: a, reason: collision with root package name */
    public final rn2 f6264a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6265b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6266c;
    public final ho2[] d;
    private final boolean[] e;
    public final long f;
    public int g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public zh2 l;
    public ep2 m;
    private final mi2[] n;
    private final li2[] o;
    private final cp2 p;
    private final hi2 q;
    private final tn2 r;
    private ep2 s;

    public zh2(mi2[] mi2VarArr, li2[] li2VarArr, long j, cp2 cp2Var, hi2 hi2Var, tn2 tn2Var, Object obj, int r9, int r10, boolean z, long j2) {
        this.n = mi2VarArr;
        this.o = li2VarArr;
        this.f = j;
        this.p = cp2Var;
        this.q = hi2Var;
        this.r = tn2Var;
        this.f6265b = vp2.d(obj);
        this.f6266c = r9;
        this.g = r10;
        this.i = z;
        this.h = j2;
        this.d = new ho2[mi2VarArr.length];
        this.e = new boolean[mi2VarArr.length];
        this.f6264a = tn2Var.e(r10, hi2Var.d());
    }

    public final void a() {
        try {
            this.r.c(this.f6264a);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }

    public final long b(long j, boolean z, boolean[] zArr) {
        zo2 zo2Var = this.m.f3305b;
        int r3 = 0;
        while (true) {
            boolean z2 = true;
            if (r3 >= zo2Var.f6297a) {
                break;
            }
            boolean[] zArr2 = this.e;
            if (z || !this.m.a(this.s, r3)) {
                z2 = false;
            }
            zArr2[r3] = z2;
            r3++;
        }
        long jG = this.f6264a.g(zo2Var.b(), this.e, this.d, zArr, j);
        this.s = this.m;
        this.k = false;
        int r6 = 0;
        while (true) {
            ho2[] ho2VarArr = this.d;
            if (r6 >= ho2VarArr.length) {
                this.q.g(this.n, this.m.f3304a, zo2Var);
                return jG;
            }
            if (ho2VarArr[r6] != null) {
                vp2.e(zo2Var.a(r6) != null);
                this.k = true;
            } else {
                vp2.e(zo2Var.a(r6) == null);
            }
            r6++;
        }
    }

    public final long c(long j, boolean z) {
        return b(j, false, new boolean[this.n.length]);
    }

    public final void d(int r1, boolean z) {
        this.g = r1;
        this.i = z;
    }

    public final long e() {
        return this.f - this.h;
    }

    public final boolean f() {
        if (this.j) {
            return !this.k || this.f6264a.n() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean g() throws sh2 {
        boolean z;
        ep2 ep2VarB = this.p.b(this.o, this.f6264a.q());
        ep2 ep2Var = this.s;
        if (ep2Var == null) {
            z = false;
            break;
        }
        for (int r4 = 0; r4 < ep2VarB.f3305b.f6297a; r4++) {
            if (!ep2VarB.a(ep2Var, r4)) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            return false;
        }
        this.m = ep2VarB;
        return true;
    }
}
