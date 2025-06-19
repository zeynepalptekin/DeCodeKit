package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class g4<E> extends o3<E> {
    private final h4<E> f;

    g4(h4<E> h4Var, int r3) {
        super(h4Var.size(), r3);
        this.f = h4Var;
    }

    @Override // c.a.b.b.g.c.o3
    protected final E b(int r2) {
        return this.f.get(r2);
    }
}
