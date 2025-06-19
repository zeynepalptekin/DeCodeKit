package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

/* loaded from: classes.dex */
public final class er2 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f3320a;

    /* renamed from: b, reason: collision with root package name */
    private final br2 f3321b;

    public er2(Handler handler, br2 br2Var) {
        this.f3320a = br2Var != null ? (Handler) vp2.d(handler) : null;
        this.f3321b = br2Var;
    }

    public final void b(int r9, int r10, int r11, float f) {
        if (this.f3321b != null) {
            this.f3320a.post(new hr2(this, r9, r10, r11, f));
        }
    }

    public final void c(Surface surface) {
        if (this.f3321b != null) {
            this.f3320a.post(new kr2(this, surface));
        }
    }

    public final void d(String str, long j, long j2) {
        if (this.f3321b != null) {
            this.f3320a.post(new gr2(this, str, j, j2));
        }
    }

    public final void e(di2 di2Var) {
        if (this.f3321b != null) {
            this.f3320a.post(new fr2(this, di2Var));
        }
    }

    public final void f(ck2 ck2Var) {
        if (this.f3321b != null) {
            this.f3320a.post(new dr2(this, ck2Var));
        }
    }

    public final void g(ck2 ck2Var) {
        if (this.f3321b != null) {
            this.f3320a.post(new jr2(this, ck2Var));
        }
    }

    public final void h(int r3, long j) {
        if (this.f3321b != null) {
            this.f3320a.post(new ir2(this, r3, j));
        }
    }
}
