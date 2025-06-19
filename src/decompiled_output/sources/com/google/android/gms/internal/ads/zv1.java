package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class zv1<K, V> extends nv1<Map.Entry<K, V>> {
    private final /* synthetic */ aw1 f;

    zv1(aw1 aw1Var) {
        this.f = aw1Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int r3) {
        bv1.g(r3, this.f.i);
        int r32 = r3 * 2;
        return new AbstractMap.SimpleImmutableEntry(this.f.g[r32], this.f.g[r32 + 1]);
    }

    @Override // com.google.android.gms.internal.ads.iv1
    public final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f.i;
    }
}
