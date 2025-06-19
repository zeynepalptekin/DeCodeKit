package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ao2 {
    private int i;
    private int j;
    private int k;
    private int l;
    private di2 q;

    /* renamed from: a, reason: collision with root package name */
    private int f2728a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private int[] f2729b = new int[1000];

    /* renamed from: c, reason: collision with root package name */
    private long[] f2730c = new long[1000];
    private long[] f = new long[1000];
    private int[] e = new int[1000];
    private int[] d = new int[1000];
    private xk2[] g = new xk2[1000];
    private di2[] h = new di2[1000];
    private long m = Long.MIN_VALUE;
    private long n = Long.MIN_VALUE;
    private boolean p = true;
    private boolean o = true;

    public final synchronized int a(fi2 fi2Var, bk2 bk2Var, boolean z, boolean z2, di2 di2Var, do2 do2Var) {
        if (!j()) {
            if (z2) {
                bk2Var.b(4);
                return -4;
            }
            if (this.q == null || (!z && this.q == di2Var)) {
                return -3;
            }
            fi2Var.f3412a = this.q;
            return -5;
        }
        if (!z && this.h[this.k] == di2Var) {
            if (bk2Var.f2844c == null) {
                return -3;
            }
            bk2Var.d = this.f[this.k];
            bk2Var.b(this.e[this.k]);
            do2Var.f3152a = this.d[this.k];
            do2Var.f3153b = this.f2730c[this.k];
            do2Var.d = this.g[this.k];
            this.m = Math.max(this.m, bk2Var.d);
            this.i--;
            int r5 = this.k + 1;
            this.k = r5;
            this.j++;
            if (r5 == this.f2728a) {
                this.k = 0;
            }
            do2Var.f3154c = this.i > 0 ? this.f2730c[this.k] : do2Var.f3153b + do2Var.f3152a;
            return -4;
        }
        fi2Var.f3412a = this.h[this.k];
        return -5;
    }

    public final synchronized void b(long j, int r8, long j2, int r11, xk2 xk2Var) {
        if (this.o) {
            if ((r8 & 1) == 0) {
                return;
            } else {
                this.o = false;
            }
        }
        vp2.e(!this.p);
        d(j);
        this.f[this.l] = j;
        this.f2730c[this.l] = j2;
        this.d[this.l] = r11;
        this.e[this.l] = r8;
        this.g[this.l] = xk2Var;
        this.h[this.l] = this.q;
        this.f2729b[this.l] = 0;
        int r6 = this.i + 1;
        this.i = r6;
        if (r6 != this.f2728a) {
            int r62 = this.l + 1;
            this.l = r62;
            if (r62 == this.f2728a) {
                this.l = 0;
            }
            return;
        }
        int r63 = this.f2728a + 1000;
        int[] r7 = new int[r63];
        long[] jArr = new long[r63];
        long[] jArr2 = new long[r63];
        int[] r10 = new int[r63];
        int[] r112 = new int[r63];
        xk2[] xk2VarArr = new xk2[r63];
        di2[] di2VarArr = new di2[r63];
        int r2 = this.f2728a - this.k;
        System.arraycopy(this.f2730c, this.k, jArr, 0, r2);
        System.arraycopy(this.f, this.k, jArr2, 0, r2);
        System.arraycopy(this.e, this.k, r10, 0, r2);
        System.arraycopy(this.d, this.k, r112, 0, r2);
        System.arraycopy(this.g, this.k, xk2VarArr, 0, r2);
        System.arraycopy(this.h, this.k, di2VarArr, 0, r2);
        System.arraycopy(this.f2729b, this.k, r7, 0, r2);
        int r3 = this.k;
        System.arraycopy(this.f2730c, 0, jArr, r2, r3);
        System.arraycopy(this.f, 0, jArr2, r2, r3);
        System.arraycopy(this.e, 0, r10, r2, r3);
        System.arraycopy(this.d, 0, r112, r2, r3);
        System.arraycopy(this.g, 0, xk2VarArr, r2, r3);
        System.arraycopy(this.h, 0, di2VarArr, r2, r3);
        System.arraycopy(this.f2729b, 0, r7, r2, r3);
        this.f2730c = jArr;
        this.f = jArr2;
        this.e = r10;
        this.d = r112;
        this.g = xk2VarArr;
        this.h = di2VarArr;
        this.f2729b = r7;
        this.k = 0;
        this.l = this.f2728a;
        this.i = this.f2728a;
        this.f2728a = r63;
    }

    public final synchronized long c(long j, boolean z) {
        if (j() && j >= this.f[this.k]) {
            if (j > this.n && !z) {
                return -1L;
            }
            int r11 = 0;
            int r0 = this.k;
            int r4 = -1;
            while (r0 != this.l && this.f[r0] <= j) {
                if ((this.e[r0] & 1) != 0) {
                    r4 = r11;
                }
                r0 = (r0 + 1) % this.f2728a;
                r11++;
            }
            if (r4 == -1) {
                return -1L;
            }
            int r9 = (this.k + r4) % this.f2728a;
            this.k = r9;
            this.j += r4;
            this.i -= r4;
            return this.f2730c[r9];
        }
        return -1L;
    }

    public final synchronized void d(long j) {
        this.n = Math.max(this.n, j);
    }

    public final synchronized boolean e(di2 di2Var) {
        if (di2Var == null) {
            this.p = true;
            return false;
        }
        this.p = false;
        if (nq2.g(di2Var, this.q)) {
            return false;
        }
        this.q = di2Var;
        return true;
    }

    public final synchronized long f() {
        return Math.max(this.m, this.n);
    }

    public final void g() {
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.i = 0;
        this.o = true;
    }

    public final void h() {
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
    }

    public final int i() {
        return this.j + this.i;
    }

    public final synchronized boolean j() {
        return this.i != 0;
    }

    public final synchronized di2 k() {
        if (this.p) {
            return null;
        }
        return this.q;
    }

    public final synchronized long l() {
        if (!j()) {
            return -1L;
        }
        int r0 = ((this.k + this.i) - 1) % this.f2728a;
        this.k = (this.k + this.i) % this.f2728a;
        this.j += this.i;
        this.i = 0;
        return this.f2730c[r0] + this.d[r0];
    }
}
