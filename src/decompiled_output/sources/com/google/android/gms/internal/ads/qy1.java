package com.google.android.gms.internal.ads;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes.dex */
final class qy1<V> extends yx1<dy1<V>> {
    private final bx1<V> g;
    private final /* synthetic */ ry1 h;

    qy1(ry1 ry1Var, bx1<V> bx1Var) {
        this.h = ry1Var;
        this.g = (bx1) bv1.b(bx1Var);
    }

    @Override // com.google.android.gms.internal.ads.yx1
    final boolean b() {
        return this.h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.yx1
    final /* synthetic */ Object c() throws Exception {
        return (dy1) bv1.d(this.g.a(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.g);
    }

    @Override // com.google.android.gms.internal.ads.yx1
    final String d() {
        return this.g.toString();
    }

    @Override // com.google.android.gms.internal.ads.yx1
    final /* synthetic */ void e(Object obj, Throwable th) {
        dy1<? extends V> dy1Var = (dy1) obj;
        if (th == null) {
            this.h.k(dy1Var);
        } else {
            this.h.j(th);
        }
    }
}
