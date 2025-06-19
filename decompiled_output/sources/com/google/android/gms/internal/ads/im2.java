package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class im2 {

    /* renamed from: a, reason: collision with root package name */
    public ul2 f3841a;

    /* renamed from: b, reason: collision with root package name */
    public long f3842b;

    /* renamed from: c, reason: collision with root package name */
    public long f3843c;
    public long d;
    public int e;
    public int f;
    public long[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public long[] k;
    public boolean[] l;
    public boolean m;
    public boolean[] n;
    public jm2 o;
    public int p;
    public hq2 q;
    public boolean r;
    public long s;

    im2() {
    }

    public final void a(int r2) {
        hq2 hq2Var = this.q;
        if (hq2Var == null || hq2Var.c() < r2) {
            this.q = new hq2(r2);
        }
        this.p = r2;
        this.m = true;
        this.r = true;
    }

    public final long b(int r6) {
        return this.k[r6] + this.j[r6];
    }
}
