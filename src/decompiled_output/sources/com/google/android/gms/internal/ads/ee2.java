package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes.dex */
final class ee2<E> implements Iterator<E> {
    private int d = 0;
    private final /* synthetic */ fe2 e;

    ee2(fe2 fe2Var) {
        this.e = fe2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.e.d.size() || this.e.e.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        while (this.d >= this.e.d.size()) {
            fe2 fe2Var = this.e;
            fe2Var.d.add(fe2Var.e.next());
        }
        List<E> list = this.e.d;
        int r1 = this.d;
        this.d = r1 + 1;
        return list.get(r1);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
