package c.a.b.b.g.c;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class o3<E> extends c5<E> {
    private final int d;
    private int e;

    protected o3(int r1, int r2) {
        g3.g(r2, r1);
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
