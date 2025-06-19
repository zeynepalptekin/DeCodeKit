package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class ew1<E> extends qv1<E> {
    static final ew1<Object> k = new ew1<>(new Object[0], 0, null, 0, 0);
    private final transient Object[] f;
    private final transient Object[] g;
    private final transient int h;
    private final transient int i;
    private final transient int j;

    ew1(Object[] objArr, int r2, Object[] objArr2, int r4, int r5) {
        this.f = objArr;
        this.g = objArr2;
        this.h = r4;
        this.i = r2;
        this.j = r5;
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final int c(Object[] objArr, int r5) {
        System.arraycopy(this.f, 0, objArr, r5, this.j);
        return r5 + this.j;
    }

    @Override // com.google.android.gms.internal.ads.iv1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.g;
        if (obj == null || objArr == null) {
            return false;
        }
        int r2 = jv1.a(obj == null ? 0 : obj.hashCode());
        while (true) {
            int r22 = r2 & this.h;
            Object obj2 = objArr[r22];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            r2 = r22 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.qv1, com.google.android.gms.internal.ads.iv1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h */
    public final fw1<E> iterator() {
        return (fw1) n().iterator();
    }

    @Override // com.google.android.gms.internal.ads.qv1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final Object[] i() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final int l() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final boolean o() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.qv1
    final boolean u() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.qv1
    final nv1<E> v() {
        return nv1.v(this.f, this.j);
    }
}
