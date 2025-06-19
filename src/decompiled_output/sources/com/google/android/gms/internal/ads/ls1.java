package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

/* loaded from: classes.dex */
final class ls1 implements d.a, d.b {
    private final gt1 d;
    private final ys1 e;
    private final Object f = new Object();
    private boolean g = false;
    private boolean h = false;

    ls1(@androidx.annotation.h0 Context context, @androidx.annotation.h0 Looper looper, @androidx.annotation.h0 ys1 ys1Var) {
        this.e = ys1Var;
        this.d = new gt1(context, looper, this, this, 12800000);
    }

    private final void d() {
        synchronized (this.f) {
            if (this.d.D() || this.d.E()) {
                this.d.e();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void a(int r1) {
    }

    @Override // com.google.android.gms.common.internal.d.b
    public final void b(@androidx.annotation.h0 c.a.b.b.d.c cVar) {
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void c(@androidx.annotation.i0 Bundle bundle) {
        synchronized (this.f) {
            if (this.h) {
                return;
            }
            this.h = true;
            try {
                this.d.m0().E4(new et1(this.e.f()));
            } catch (Exception unused) {
            } catch (Throwable th) {
                d();
                throw th;
            }
            d();
        }
    }

    final void e() {
        synchronized (this.f) {
            if (!this.g) {
                this.g = true;
                this.d.a();
            }
        }
    }
}
