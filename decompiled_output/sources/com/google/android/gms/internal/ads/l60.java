package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class l60 extends e50 {
    private final f5 h;
    private final Runnable i;
    private final Executor j;

    public l60(d70 d70Var, f5 f5Var, Runnable runnable, Executor executor) {
        super(d70Var);
        this.h = f5Var;
        this.i = runnable;
        this.j = executor;
    }

    @Override // com.google.android.gms.internal.ads.e70
    @androidx.annotation.y0
    public final void b() {
        final AtomicReference atomicReference = new AtomicReference(this.i);
        final Runnable runnable = new Runnable(atomicReference) { // from class: com.google.android.gms.internal.ads.k60
            private final AtomicReference d;

            {
                this.d = atomicReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = (Runnable) this.d.getAndSet(null);
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        this.j.execute(new Runnable(this, runnable) { // from class: com.google.android.gms.internal.ads.n60
            private final l60 d;
            private final Runnable e;

            {
                this.d = this;
                this.e = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.n(this.e);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final uz2 g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void h(ViewGroup viewGroup, qw2 qw2Var) {
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final jm1 i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final View j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final jm1 k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final int l() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void m() {
    }

    final /* synthetic */ void n(Runnable runnable) {
        try {
            if (this.h.p6(c.a.b.b.e.e.i2(runnable))) {
                return;
            }
            runnable.run();
        } catch (RemoteException unused) {
            runnable.run();
        }
    }
}
