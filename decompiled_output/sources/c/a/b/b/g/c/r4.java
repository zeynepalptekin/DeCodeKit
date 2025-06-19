package c.a.b.b.g.c;

import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
final class r4<T> extends d5<T> {
    private boolean d;
    private final /* synthetic */ Object e;

    r4(Object obj) {
        this.e = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.d;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.d) {
            throw new NoSuchElementException();
        }
        this.d = true;
        return (T) this.e;
    }
}
