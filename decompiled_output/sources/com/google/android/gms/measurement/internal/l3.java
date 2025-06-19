package com.google.android.gms.measurement.internal;

@com.google.android.gms.common.util.d0
/* loaded from: classes.dex */
public final class l3<V> {
    private static final Object h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f6441a;

    /* renamed from: b, reason: collision with root package name */
    private final j3<V> f6442b;

    /* renamed from: c, reason: collision with root package name */
    private final V f6443c;
    private final V d;
    private final Object e;

    @androidx.annotation.u("overrideLock")
    private volatile V f;

    @androidx.annotation.u("cachingLock")
    private volatile V g;

    private l3(@androidx.annotation.h0 String str, @androidx.annotation.h0 V v, @androidx.annotation.h0 V v2, @androidx.annotation.i0 j3<V> j3Var) {
        this.e = new Object();
        this.f = null;
        this.g = null;
        this.f6441a = str;
        this.f6443c = v;
        this.d = v2;
        this.f6442b = j3Var;
    }

    public final V a(@androidx.annotation.i0 V v) {
        synchronized (this.e) {
        }
        if (v != null) {
            return v;
        }
        if (m3.f6457a == null) {
            return this.f6443c;
        }
        synchronized (h) {
            if (wa.a()) {
                return this.g == null ? this.f6443c : this.g;
            }
            try {
                for (l3 l3Var : u.f6525a) {
                    if (wa.a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V vA = null;
                    try {
                        if (l3Var.f6442b != null) {
                            vA = l3Var.f6442b.a();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (h) {
                        l3Var.g = vA;
                    }
                }
            } catch (SecurityException unused2) {
            }
            j3<V> j3Var = this.f6442b;
            if (j3Var == null) {
                return this.f6443c;
            }
            try {
                return j3Var.a();
            } catch (IllegalStateException unused3) {
                return this.f6443c;
            } catch (SecurityException unused4) {
                return this.f6443c;
            }
        }
    }

    public final String b() {
        return this.f6441a;
    }
}
