package c.a.b.b.g.c;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes.dex */
final class j4<E> extends h4<E> {
    private final transient int f;
    private final transient int g;
    private final /* synthetic */ h4 h;

    j4(h4 h4Var, int r2, int r3) {
        this.h = h4Var;
        this.f = r2;
        this.g = r3;
    }

    @Override // java.util.List
    public final E get(int r3) {
        g3.a(r3, this.g);
        return this.h.get(r3 + this.f);
    }

    @Override // c.a.b.b.g.c.d4
    final Object[] i() {
        return this.h.i();
    }

    @Override // c.a.b.b.g.c.d4
    final int j() {
        return this.h.j() + this.f;
    }

    @Override // c.a.b.b.g.c.d4
    final int l() {
        return this.h.j() + this.f + this.g;
    }

    @Override // c.a.b.b.g.c.d4
    final boolean o() {
        return true;
    }

    @Override // c.a.b.b.g.c.h4, java.util.List
    /* renamed from: r */
    public final h4<E> subList(int r3, int r4) {
        g3.e(r3, r4, this.g);
        h4 h4Var = this.h;
        int r1 = this.f;
        return (h4) h4Var.subList(r3 + r1, r4 + r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
