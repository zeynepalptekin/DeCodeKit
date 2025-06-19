package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class cx1<V> extends dx1<V, List<V>> {
    cx1(iv1<? extends dy1<? extends V>> iv1Var, boolean z) {
        super(iv1Var, true);
        P();
    }

    @Override // com.google.android.gms.internal.ads.dx1
    public final /* synthetic */ Object V(List list) {
        ArrayList arrayListA = vv1.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fx1 fx1Var = (fx1) it.next();
            arrayListA.add(fx1Var != null ? fx1Var.f3471a : null);
        }
        return Collections.unmodifiableList(arrayListA);
    }
}
