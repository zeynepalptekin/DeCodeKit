package c.a.b.b.g.c;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class w4<K> extends m4<K> {
    private final transient i4<K, ?> f;
    private final transient h4<K> g;

    w4(i4<K, ?> i4Var, h4<K> h4Var) {
        this.f = i4Var;
        this.g = h4Var;
    }

    @Override // c.a.b.b.g.c.d4
    final int c(Object[] objArr, int r3) {
        return n().c(objArr, r3);
    }

    @Override // c.a.b.b.g.c.d4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        return this.f.get(obj) != null;
    }

    @Override // c.a.b.b.g.c.m4, c.a.b.b.g.c.d4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h */
    public final d5<K> iterator() {
        return (d5) n().iterator();
    }

    @Override // c.a.b.b.g.c.m4, c.a.b.b.g.c.d4
    public final h4<K> n() {
        return this.g;
    }

    @Override // c.a.b.b.g.c.d4
    final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.size();
    }
}
