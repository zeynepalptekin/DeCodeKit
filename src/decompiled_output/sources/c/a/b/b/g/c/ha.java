package c.a.b.b.g.c;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class ha extends AbstractList<String> implements b8, RandomAccess {
    private final b8 d;

    public ha(b8 b8Var) {
        this.d = b8Var;
    }

    @Override // c.a.b.b.g.c.b8
    public final void O(y5 y5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // c.a.b.b.g.c.b8
    public final List<?> d() {
        return this.d.d();
    }

    @Override // c.a.b.b.g.c.b8
    public final b8 f() {
        return this;
    }

    @Override // c.a.b.b.g.c.b8
    public final Object g(int r2) {
        return this.d.g(r2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r2) {
        return (String) this.d.get(r2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new ja(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int r2) {
        return new ga(this, r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.size();
    }
}
