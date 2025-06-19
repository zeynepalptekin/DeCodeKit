package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class cw1<K> extends qv1<K> {
    private final transient rv1<K, ?> f;
    private final transient nv1<K> g;

    cw1(rv1<K, ?> rv1Var, nv1<K> nv1Var) {
        this.f = rv1Var;
        this.g = nv1Var;
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final int c(Object[] objArr, int r3) {
        return n().c(objArr, r3);
    }

    @Override // com.google.android.gms.internal.ads.iv1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        return this.f.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.qv1, com.google.android.gms.internal.ads.iv1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h */
    public final fw1<K> iterator() {
        return (fw1) n().iterator();
    }

    @Override // com.google.android.gms.internal.ads.qv1, com.google.android.gms.internal.ads.iv1
    public final nv1<K> n() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.size();
    }
}
