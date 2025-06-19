package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class ev1<E> extends iw1<E> {
    private final int d;
    private int e;

    protected ev1(int r1, int r2) {
        bv1.h(r2, r1);
        this.d = r1;
        this.e = r2;
    }

    protected abstract E b(int r1);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.e < this.d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int r0 = this.e;
        this.e = r0 + 1;
        return b(r0);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.e;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int r0 = this.e - 1;
        this.e = r0;
        return b(r0);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.e - 1;
    }
}
