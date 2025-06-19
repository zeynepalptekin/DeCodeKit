package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class au2 implements l9 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f2753a;

    public au2(Handler handler) {
        this.f2753a = new zs2(this, handler);
    }

    @Override // com.google.android.gms.internal.ads.l9
    public final void a(b<?> bVar, pd pdVar) {
        bVar.s("post-error");
        this.f2753a.execute(new cw2(bVar, k8.c(pdVar), null));
    }

    @Override // com.google.android.gms.internal.ads.l9
    public final void b(b<?> bVar, k8<?> k8Var) {
        c(bVar, k8Var, null);
    }

    @Override // com.google.android.gms.internal.ads.l9
    public final void c(b<?> bVar, k8<?> k8Var, Runnable runnable) {
        bVar.J();
        bVar.s("post-response");
        this.f2753a.execute(new cw2(bVar, k8Var, runnable));
    }
}
