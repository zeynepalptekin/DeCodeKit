package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class z4 extends h4<Object> {
    private final transient Object[] f;
    private final transient int g;
    private final transient int h;

    z4(Object[] objArr, int r2, int r3) {
        this.f = objArr;
        this.g = r2;
        this.h = r3;
    }

    @Override // java.util.List
    public final Object get(int r3) {
        g3.a(r3, this.h);
        return this.f[(r3 * 2) + this.g];
    }

    @Override // c.a.b.b.g.c.d4
    final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h;
    }
}
