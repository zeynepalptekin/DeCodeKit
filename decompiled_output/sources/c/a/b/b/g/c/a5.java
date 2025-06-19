package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class a5<E> extends m4<E> {
    private final transient E f;
    private transient int g;

    a5(E e) {
        this.f = (E) g3.b(e);
    }

    a5(E e, int r2) {
        this.f = e;
        this.g = r2;
    }

    @Override // c.a.b.b.g.c.d4
    final int c(Object[] objArr, int r3) {
        objArr[r3] = this.f;
        return r3 + 1;
    }

    @Override // c.a.b.b.g.c.d4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f.equals(obj);
    }

    @Override // c.a.b.b.g.c.m4, c.a.b.b.g.c.d4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h */
    public final d5<E> iterator() {
        return new r4(this.f);
    }

    @Override // c.a.b.b.g.c.m4, java.util.Collection, java.util.Set
    public final int hashCode() {
        int r0 = this.g;
        if (r0 != 0) {
            return r0;
        }
        int r02 = this.f.hashCode();
        this.g = r02;
        return r02;
    }

    @Override // c.a.b.b.g.c.d4
    final boolean o() {
        return false;
    }

    @Override // c.a.b.b.g.c.m4
    final boolean s() {
        return this.g != 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // c.a.b.b.g.c.m4
    final h4<E> t() {
        return h4.s(this.f);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
