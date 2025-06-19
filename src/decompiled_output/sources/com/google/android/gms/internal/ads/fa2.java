package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class fa2 {
    private static final y82 d = y82.b();

    /* renamed from: a, reason: collision with root package name */
    private a82 f3393a;

    /* renamed from: b, reason: collision with root package name */
    private volatile xa2 f3394b;

    /* renamed from: c, reason: collision with root package name */
    private volatile a82 f3395c;

    private final xa2 c(xa2 xa2Var) {
        if (this.f3394b == null) {
            synchronized (this) {
                if (this.f3394b == null) {
                    try {
                        this.f3394b = xa2Var;
                        this.f3395c = a82.e;
                    } catch (w92 unused) {
                        this.f3394b = xa2Var;
                        this.f3395c = a82.e;
                    }
                }
            }
        }
        return this.f3394b;
    }

    public final a82 a() {
        if (this.f3395c != null) {
            return this.f3395c;
        }
        synchronized (this) {
            if (this.f3395c != null) {
                return this.f3395c;
            }
            this.f3395c = this.f3394b == null ? a82.e : this.f3394b.h();
            return this.f3395c;
        }
    }

    public final int b() {
        if (this.f3395c != null) {
            return this.f3395c.size();
        }
        if (this.f3394b != null) {
            return this.f3394b.b();
        }
        return 0;
    }

    public final xa2 d(xa2 xa2Var) {
        xa2 xa2Var2 = this.f3394b;
        this.f3393a = null;
        this.f3395c = null;
        this.f3394b = xa2Var;
        return xa2Var2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa2)) {
            return false;
        }
        fa2 fa2Var = (fa2) obj;
        xa2 xa2Var = this.f3394b;
        xa2 xa2Var2 = fa2Var.f3394b;
        return (xa2Var == null && xa2Var2 == null) ? a().equals(fa2Var.a()) : (xa2Var == null || xa2Var2 == null) ? xa2Var != null ? xa2Var.equals(fa2Var.c(xa2Var.g())) : c(xa2Var2.g()).equals(xa2Var2) : xa2Var.equals(xa2Var2);
    }

    public int hashCode() {
        return 1;
    }
}
