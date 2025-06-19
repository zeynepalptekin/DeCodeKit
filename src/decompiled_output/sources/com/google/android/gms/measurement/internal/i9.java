package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class i9 implements Runnable {
    long d;
    long e;
    final /* synthetic */ j9 f;

    i9(j9 j9Var, long j, long j2) {
        this.f = j9Var;
        this.d = j;
        this.e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f.f6421b.x().v(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.m9
            private final i9 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                i9 i9Var = this.d;
                j9 j9Var = i9Var.f;
                long j = i9Var.d;
                long j2 = i9Var.e;
                j9Var.f6421b.c();
                j9Var.f6421b.B().M().a("Application going to the background");
                boolean z = true;
                if (j9Var.f6421b.j().p(u.w0)) {
                    j9Var.f6421b.i().w.a(true);
                }
                Bundle bundle = new Bundle();
                if (!j9Var.f6421b.j().I().booleanValue()) {
                    j9Var.f6421b.e.f(j2);
                    if (j9Var.f6421b.j().p(u.n0)) {
                        bundle.putLong("_et", j9Var.f6421b.y(j2));
                        s7.L(j9Var.f6421b.o().C(true), bundle, true);
                    } else {
                        z = false;
                    }
                    j9Var.f6421b.D(false, z, j2);
                }
                j9Var.f6421b.l().W("auto", "_ab", j, bundle);
            }
        });
    }
}
