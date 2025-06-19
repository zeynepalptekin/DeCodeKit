package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vz0 {

    /* renamed from: a, reason: collision with root package name */
    private int f5752a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f5753b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f5754c = 0;
    private long d = 0;
    private final Object e = new Object();
    private final Object f = new Object();
    private final Object g = new Object();
    private final Object h = new Object();

    public final int a() {
        int r1;
        synchronized (this.e) {
            r1 = this.f5752a;
        }
        return r1;
    }

    public final long b() {
        long j;
        synchronized (this.f) {
            j = this.f5753b;
        }
        return j;
    }

    public final synchronized long c() {
        long j;
        synchronized (this.g) {
            j = this.f5754c;
        }
        return j;
    }

    public final synchronized long d() {
        long j;
        synchronized (this.h) {
            j = this.d;
        }
        return j;
    }

    public final void e(int r2) {
        synchronized (this.e) {
            this.f5752a = r2;
        }
    }

    public final void f(long j) {
        synchronized (this.f) {
            this.f5753b = j;
        }
    }

    public final synchronized void g(long j) {
        synchronized (this.h) {
            this.d = j;
        }
    }

    public final synchronized void h(long j) {
        synchronized (this.g) {
            this.f5754c = j;
        }
    }
}
