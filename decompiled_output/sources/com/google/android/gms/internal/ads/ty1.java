package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes.dex */
final class ty1<V> extends yx1<V> {
    private final Callable<V> g;
    private final /* synthetic */ ry1 h;

    ty1(ry1 ry1Var, Callable<V> callable) {
        this.h = ry1Var;
        this.g = (Callable) bv1.b(callable);
    }

    @Override // com.google.android.gms.internal.ads.yx1
    final boolean b() {
        return this.h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.yx1
    final V c() throws Exception {
        return this.g.call();
    }

    @Override // com.google.android.gms.internal.ads.yx1
    final String d() {
        return this.g.toString();
    }

    @Override // com.google.android.gms.internal.ads.yx1
    final void e(V v, Throwable th) {
        if (th == null) {
            this.h.i(v);
        } else {
            this.h.j(th);
        }
    }
}
