package c.a.b.b.g.c;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class y4<E> extends m4<E> {
    static final y4<Object> k = new y4<>(new Object[0], 0, null, 0, 0);
    private final transient Object[] f;
    private final transient Object[] g;
    private final transient int h;
    private final transient int i;
    private final transient int j;

    y4(Object[] objArr, int r2, Object[] objArr2, int r4, int r5) {
        this.f = objArr;
        this.g = objArr2;
        this.h = r4;
        this.i = r2;
        this.j = r5;
    }

    @Override // c.a.b.b.g.c.d4
    final int c(Object[] objArr, int r5) {
        System.arraycopy(this.f, 0, objArr, r5, this.j);
        return r5 + this.j;
    }

    @Override // c.a.b.b.g.c.d4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.g;
        if (obj == null || objArr == null) {
            return false;
        }
        int r2 = e4.b(obj);
        while (true) {
            int r22 = r2 & this.h;
            Object obj2 = objArr[r22];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            r2 = r22 + 1;
        }
    }

    @Override // c.a.b.b.g.c.m4, c.a.b.b.g.c.d4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h */
    public final d5<E> iterator() {
        return (d5) n().iterator();
    }

    @Override // c.a.b.b.g.c.m4, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.i;
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
        return this.j;
    }

    @Override // c.a.b.b.g.c.d4
    final boolean o() {
        return false;
    }

    @Override // c.a.b.b.g.c.m4
    final boolean s() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.j;
    }

    @Override // c.a.b.b.g.c.m4
    final h4<E> t() {
        return h4.u(this.f, this.j);
    }
}
