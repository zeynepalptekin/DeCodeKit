package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zs2 implements Executor {
    private final /* synthetic */ Handler d;

    zs2(au2 au2Var, Handler handler) {
        this.d = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.post(runnable);
    }
}
