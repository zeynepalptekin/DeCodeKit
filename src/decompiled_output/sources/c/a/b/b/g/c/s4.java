package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class s4<E> extends h4<E> {
    static final h4<Object> h = new s4(new Object[0], 0);
    private final transient Object[] f;
    private final transient int g;

    s4(Object[] objArr, int r2) {
        this.f = objArr;
        this.g = r2;
    }

    @Override // c.a.b.b.g.c.h4, c.a.b.b.g.c.d4
    final int c(Object[] objArr, int r5) {
        System.arraycopy(this.f, 0, objArr, r5, this.g);
        return r5 + this.g;
    }

    @Override // java.util.List
    public final E get(int r2) {
        g3.a(r2, this.g);
        return (E) this.f[r2];
    }

    @Override // c.a.b.b.g.c.d4
    final Object[] i() {
        return this.f;
    }

    @Override // c.a.b.b.g.c.d4
    final int j() {
        return 0;
    }

    @Override // c.a.b.b.g.c.d4
    final int l() {
        return this.g;
    }

    @Override // c.a.b.b.g.c.d4
    final boolean o() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
