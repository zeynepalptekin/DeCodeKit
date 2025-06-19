package c.a.b.b.g.c;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes.dex */
final class z3<V> extends AbstractCollection<V> {
    private final /* synthetic */ r3 d;

    z3(r3 r3Var) {
        this.d = r3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return this.d.t();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.d.size();
    }
}
