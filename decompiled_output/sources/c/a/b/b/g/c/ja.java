package c.a.b.b.g.c;

import java.util.Iterator;

/* loaded from: classes.dex */
final class ja implements Iterator<String> {
    private Iterator<String> d;
    private final /* synthetic */ ha e;

    ja(ha haVar) {
        this.e = haVar;
        this.d = this.e.d.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
