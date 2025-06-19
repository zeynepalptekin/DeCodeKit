package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class xv1<E> extends nv1<E> {
    static final nv1<Object> h = new xv1(new Object[0], 0);
    private final transient Object[] f;
    private final transient int g;

    xv1(Object[] objArr, int r2) {
        this.f = objArr;
        this.g = r2;
    }

    @Override // com.google.android.gms.internal.ads.nv1, com.google.android.gms.internal.ads.iv1
    final int c(Object[] objArr, int r5) {
        System.arraycopy(this.f, 0, objArr, r5, this.g);
        return r5 + this.g;
    }

    @Override // java.util.List
    public final E get(int r2) {
        bv1.g(r2, this.g);
        return (E) this.f[r2];
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
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final boolean o() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
