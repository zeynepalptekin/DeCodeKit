package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class bw1 extends nv1<Object> {
    private final transient Object[] f;
    private final transient int g;
    private final transient int h;

    bw1(Object[] objArr, int r2, int r3) {
        this.f = objArr;
        this.g = r2;
        this.h = r3;
    }

    @Override // java.util.List
    public final Object get(int r3) {
        bv1.g(r3, this.h);
        return this.f[(r3 * 2) + this.g];
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h;
    }
}
