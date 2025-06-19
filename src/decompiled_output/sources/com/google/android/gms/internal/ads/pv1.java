package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class pv1<E> extends ev1<E> {
    private final nv1<E> f;

    pv1(nv1<E> nv1Var, int r3) {
        super(nv1Var.size(), r3);
        this.f = nv1Var;
    }

    @Override // com.google.android.gms.internal.ads.ev1
    protected final E b(int r2) {
        return this.f.get(r2);
    }
}
