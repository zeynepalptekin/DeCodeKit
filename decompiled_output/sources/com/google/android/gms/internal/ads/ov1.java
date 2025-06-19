package com.google.android.gms.internal.ads;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes.dex */
final class ov1<E> extends nv1<E> {
    private final transient int f;
    private final transient int g;
    private final /* synthetic */ nv1 h;

    ov1(nv1 nv1Var, int r2, int r3) {
        this.h = nv1Var;
        this.f = r2;
        this.g = r3;
    }

    @Override // com.google.android.gms.internal.ads.nv1, java.util.List
    /* renamed from: A */
    public final nv1<E> subList(int r3, int r4) {
        bv1.f(r3, r4, this.g);
        nv1 nv1Var = this.h;
        int r1 = this.f;
        return (nv1) nv1Var.subList(r3 + r1, r4 + r1);
    }

    @Override // java.util.List
    public final E get(int r3) {
        bv1.g(r3, this.g);
        return this.h.get(r3 + this.f);
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final Object[] i() {
        return this.h.i();
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final int j() {
        return this.h.j() + this.f;
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final int l() {
        return this.h.j() + this.f + this.g;
    }

    @Override // com.google.android.gms.internal.ads.iv1
    final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
