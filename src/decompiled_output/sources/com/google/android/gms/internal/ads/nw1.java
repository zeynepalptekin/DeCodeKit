package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class nw1<V, X extends Throwable> extends lw1<V, X, ru1<? super X, ? extends V>, V> {
    nw1(dy1<? extends V> dy1Var, Class<X> cls, ru1<? super X, ? extends V> ru1Var) {
        super(dy1Var, cls, ru1Var);
    }

    @Override // com.google.android.gms.internal.ads.lw1
    final void I(@NullableDecl V v) {
        i(v);
    }

    @Override // com.google.android.gms.internal.ads.lw1
    @NullableDecl
    final /* synthetic */ Object K(Object obj, Throwable th) throws Exception {
        return ((ru1) obj).a(th);
    }
}
