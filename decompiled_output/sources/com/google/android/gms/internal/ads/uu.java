package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class uu implements hi2 {

    /* renamed from: a, reason: collision with root package name */
    private final mp2 f5599a;

    /* renamed from: b, reason: collision with root package name */
    private long f5600b;

    /* renamed from: c, reason: collision with root package name */
    private long f5601c;
    private long d;
    private long e;
    private int f;
    private boolean g;

    uu() {
        this(15000, 30000, 2500L, 5000L);
    }

    private uu(int r1, int r2, long j, long j2) {
        this.f5599a = new mp2(true, 65536);
        this.f5600b = 15000000L;
        this.f5601c = 30000000L;
        this.d = 2500000L;
        this.e = 5000000L;
    }

    @com.google.android.gms.common.util.d0
    private final void l(boolean z) {
        this.f = 0;
        this.g = false;
        if (z) {
            this.f5599a.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.hi2
    public final void a() {
        l(false);
    }

    @Override // com.google.android.gms.internal.ads.hi2
    public final void b() {
        l(true);
    }

    @Override // com.google.android.gms.internal.ads.hi2
    public final synchronized boolean c(long j) {
        boolean z;
        z = false;
        char c2 = j > this.f5601c ? (char) 0 : j < this.f5600b ? (char) 2 : (char) 1;
        boolean z2 = this.f5599a.g() >= this.f;
        if (c2 == 2 || (c2 == 1 && this.g && !z2)) {
            z = true;
        }
        this.g = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.hi2
    public final gp2 d() {
        return this.f5599a;
    }

    @Override // com.google.android.gms.internal.ads.hi2
    public final void e() {
        l(true);
    }

    @Override // com.google.android.gms.internal.ads.hi2
    public final synchronized boolean f(long j, boolean z) {
        long j2;
        j2 = z ? this.e : this.d;
        return j2 <= 0 || j >= j2;
    }

    @Override // com.google.android.gms.internal.ads.hi2
    public final void g(mi2[] mi2VarArr, ko2 ko2Var, zo2 zo2Var) {
        this.f = 0;
        for (int r4 = 0; r4 < mi2VarArr.length; r4++) {
            if (zo2Var.a(r4) != null) {
                this.f += nq2.o(mi2VarArr[r4].a());
            }
        }
        this.f5599a.f(this.f);
    }

    public final synchronized void h(int r5) {
        this.d = r5 * 1000;
    }

    public final synchronized void i(int r5) {
        this.e = r5 * 1000;
    }

    public final synchronized void j(int r5) {
        this.f5600b = r5 * 1000;
    }

    public final synchronized void k(int r5) {
        this.f5601c = r5 * 1000;
    }
}
