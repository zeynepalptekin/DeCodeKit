package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class hy {

    /* renamed from: a, reason: collision with root package name */
    private final int f3731a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3732b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3733c;

    private hy(int r1, int r2, int r3) {
        this.f3731a = r1;
        this.f3733c = r2;
        this.f3732b = r3;
    }

    public static hy b() {
        return new hy(0, 0, 0);
    }

    public static hy c() {
        return new hy(4, 0, 0);
    }

    public static hy d() {
        return new hy(5, 0, 0);
    }

    public static hy i(qw2 qw2Var) {
        return qw2Var.g ? new hy(3, 0, 0) : qw2Var.l ? new hy(2, 0, 0) : qw2Var.k ? b() : j(qw2Var.i, qw2Var.f);
    }

    public static hy j(int r2, int r3) {
        return new hy(1, r2, r3);
    }

    public final boolean a() {
        return this.f3731a == 2;
    }

    public final boolean e() {
        return this.f3731a == 3;
    }

    public final boolean f() {
        return this.f3731a == 0;
    }

    public final boolean g() {
        return this.f3731a == 4;
    }

    public final boolean h() {
        return this.f3731a == 5;
    }
}
