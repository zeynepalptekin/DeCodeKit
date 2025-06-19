package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.tw1;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
abstract class dx1<V, C> extends tw1<V, C> {
    private List<fx1<V>> s;

    dx1(iv1<? extends dy1<? extends V>> iv1Var, boolean z) {
        super(iv1Var, true, true);
        List<fx1<V>> listS = iv1Var.isEmpty() ? nv1.s() : vv1.a(iv1Var.size());
        for (int r0 = 0; r0 < iv1Var.size(); r0++) {
            listS.add(null);
        }
        this.s = listS;
    }

    @Override // com.google.android.gms.internal.ads.tw1
    final void M(tw1.a aVar) {
        super.M(aVar);
        this.s = null;
    }

    @Override // com.google.android.gms.internal.ads.tw1
    final void Q() {
        List<fx1<V>> list = this.s;
        if (list != null) {
            i(V(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.tw1
    final void R(int r3, @NullableDecl V v) {
        List<fx1<V>> list = this.s;
        if (list != null) {
            list.set(r3, new fx1<>(v));
        }
    }

    abstract C V(List<fx1<V>> list);
}
