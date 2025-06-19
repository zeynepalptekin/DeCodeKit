package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class wo1 {

    /* renamed from: a, reason: collision with root package name */
    private final vo1 f5868a = new vo1();

    /* renamed from: b, reason: collision with root package name */
    private int f5869b;

    /* renamed from: c, reason: collision with root package name */
    private int f5870c;
    private int d;
    private int e;
    private int f;

    wo1() {
    }

    public final void a() {
        this.d++;
    }

    public final void b() {
        this.e++;
    }

    public final void c() {
        this.f5869b++;
        this.f5868a.d = true;
    }

    public final void d() {
        this.f5870c++;
        this.f5868a.e = true;
    }

    public final void e() {
        this.f++;
    }

    public final vo1 f() {
        vo1 vo1Var = (vo1) this.f5868a.clone();
        vo1 vo1Var2 = this.f5868a;
        vo1Var2.d = false;
        vo1Var2.e = false;
        return vo1Var;
    }

    public final String g() {
        return "\n\tPool does not exist: " + this.d + "\n\tNew pools created: " + this.f5869b + "\n\tPools removed: " + this.f5870c + "\n\tEntries added: " + this.f + "\n\tNo entries retrieved: " + this.e + "\n";
    }
}
