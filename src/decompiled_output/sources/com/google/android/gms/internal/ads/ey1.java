package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
final class ey1 implements Executor {
    boolean d = true;
    private final /* synthetic */ Executor e;
    private final /* synthetic */ pw1 f;

    ey1(Executor executor, pw1 pw1Var) {
        this.e = executor;
        this.f = pw1Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.e.execute(new hy1(this, runnable));
        } catch (RejectedExecutionException e) {
            if (this.d) {
                this.f.j(e);
            }
        }
    }
}
