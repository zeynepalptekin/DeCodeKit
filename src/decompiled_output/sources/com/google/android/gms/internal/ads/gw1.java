package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class gw1<E> extends qv1<E> {
    private final transient E f;
    private transient int g;

    gw1(E e) {
        this.f = (E) bv1.b(e);
    }

    gw1(E e, int r2) {
        this.f = e;
        this.g = r2;
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final int c(Object[] objArr, int r3) {
        objArr[r3] = this.f;
        return r3 + 1;
    }

    @Override // com.google.android.gms.internal.ads.iv1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.qv1, com.google.android.gms.internal.ads.iv1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h */
    public final fw1<E> iterator() {
        return new sv1(this.f);
    }

    @Override // com.google.android.gms.internal.ads.qv1, java.util.Collection, java.util.Set
    public final int hashCode() {
        int r0 = this.g;
        if (r0 != 0) {
            return r0;
        }
        int r02 = this.f.hashCode();
        this.g = r02;
        return r02;
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final boolean o() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.qv1
    final boolean u() {
        return this.g != 0;
    }

    @Override // com.google.android.gms.internal.ads.qv1
    final nv1<E> v() {
        return nv1.r(this.f);
    }
}
