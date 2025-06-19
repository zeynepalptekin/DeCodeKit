package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class ac2 extends gc2 {
    private final /* synthetic */ zb2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ac2(zb2 zb2Var) {
        super(zb2Var, null);
        this.e = zb2Var;
    }

    /* synthetic */ ac2(zb2 zb2Var, yb2 yb2Var) {
        this(zb2Var);
    }

    @Override // com.google.android.gms.internal.ads.gc2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new bc2(this.e, null);
    }
}
