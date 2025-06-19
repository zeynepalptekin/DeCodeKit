package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class aw1<K, V> extends qv1<Map.Entry<K, V>> {
    private final transient rv1<K, V> f;
    private final transient Object[] g;
    private final transient int h = 0;
    private final transient int i;

    aw1(rv1<K, V> rv1Var, Object[] objArr, int r3, int r4) {
        this.f = rv1Var;
        this.g = objArr;
        this.i = r4;
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final int c(Object[] objArr, int r3) {
        return n().c(objArr, r3);
    }

    @Override // com.google.android.gms.internal.ads.iv1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.qv1, com.google.android.gms.internal.ads.iv1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h */
    public final fw1<Map.Entry<K, V>> iterator() {
        return (fw1) n().iterator();
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.qv1
    final nv1<Map.Entry<K, V>> v() {
        return new zv1(this);
    }
}
