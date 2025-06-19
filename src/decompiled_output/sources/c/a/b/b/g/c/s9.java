package c.a.b.b.g.c;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class s9 implements Iterator<Object> {
    s9() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
