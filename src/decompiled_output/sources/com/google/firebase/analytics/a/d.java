package com.google.firebase.analytics.a;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final /* synthetic */ class d implements Executor {
    static final Executor d = new d();

    private d() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
