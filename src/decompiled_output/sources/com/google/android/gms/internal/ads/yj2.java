package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class yj2 {

    /* renamed from: a, reason: collision with root package name */
    private int f6144a;

    public void a() {
        this.f6144a = 0;
    }

    public final void b(int r1) {
        this.f6144a = r1;
    }

    public final void c(int r2) {
        this.f6144a |= Integer.MIN_VALUE;
    }

    protected final boolean d(int r2) {
        return (this.f6144a & r2) == r2;
    }

    public final boolean e() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean f() {
        return d(4);
    }

    public final boolean g() {
        return d(1);
    }
}
