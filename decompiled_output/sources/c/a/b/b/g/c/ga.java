package c.a.b.b.g.c;

import java.util.ListIterator;

/* loaded from: classes.dex */
final class ga implements ListIterator<String> {
    private ListIterator<String> d;
    private final /* synthetic */ int e;
    private final /* synthetic */ ha f;

    ga(ha haVar, int r2) {
        this.f = haVar;
        this.e = r2;
        this.d = this.f.d.listIterator(this.e);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.d.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.d.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.d.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.d.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.d.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
