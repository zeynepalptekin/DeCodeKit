package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes.dex */
public final class zi2 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f6269a;

    /* renamed from: b, reason: collision with root package name */
    private final wi2 f6270b;

    public zi2(Handler handler, wi2 wi2Var) {
        this.f6269a = wi2Var != null ? (Handler) vp2.d(handler) : null;
        this.f6270b = wi2Var;
    }

    public final void b(int r10, long j, long j2) {
        if (this.f6270b != null) {
            this.f6269a.post(new dj2(this, r10, j, j2));
        }
    }

    public final void c(String str, long j, long j2) {
        if (this.f6270b != null) {
            this.f6269a.post(new bj2(this, str, j, j2));
        }
    }

    public final void d(di2 di2Var) {
        if (this.f6270b != null) {
            this.f6269a.post(new aj2(this, di2Var));
        }
    }

    public final void e(ck2 ck2Var) {
        if (this.f6270b != null) {
            this.f6269a.post(new yi2(this, ck2Var));
        }
    }

    public final void f(ck2 ck2Var) {
        if (this.f6270b != null) {
            this.f6269a.post(new cj2(this, ck2Var));
        }
    }

    public final void g(int r3) {
        if (this.f6270b != null) {
            this.f6269a.post(new fj2(this, r3));
        }
    }
}
