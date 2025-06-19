package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class pp1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f4861a;

    /* renamed from: c, reason: collision with root package name */
    private long f4863c;

    /* renamed from: b, reason: collision with root package name */
    private final tp1 f4862b = new tp1();
    private int d = 0;
    private int e = 0;
    private int f = 0;

    public pp1() {
        long jA = com.google.android.gms.ads.internal.p.j().a();
        this.f4861a = jA;
        this.f4863c = jA;
    }

    public final long a() {
        return this.f4861a;
    }

    public final long b() {
        return this.f4863c;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return "Created: " + this.f4861a + " Last accessed: " + this.f4863c + " Accesses: " + this.d + "\nEntries retrieved: Valid: " + this.e + " Stale: " + this.f;
    }

    public final void e() {
        this.f4863c = com.google.android.gms.ads.internal.p.j().a();
        this.d++;
    }

    public final void f() {
        this.e++;
        this.f4862b.d = true;
    }

    public final void g() {
        this.f++;
        this.f4862b.e++;
    }

    public final tp1 h() {
        tp1 tp1Var = (tp1) this.f4862b.clone();
        tp1 tp1Var2 = this.f4862b;
        tp1Var2.d = false;
        tp1Var2.e = 0;
        return tp1Var;
    }
}
