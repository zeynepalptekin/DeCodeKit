package c.a.b.b.g.c;

import java.util.List;

/* loaded from: classes.dex */
final class f8 extends a8 {
    private f8() {
        super();
    }

    private static <E> r7<E> f(Object obj, long j) {
        return (r7) ia.F(obj, j);
    }

    @Override // c.a.b.b.g.c.a8
    final <L> List<L> b(Object obj, long j) {
        r7 r7VarF = f(obj, j);
        if (r7VarF.a()) {
            return r7VarF;
        }
        int size = r7VarF.size();
        r7 r7VarE = r7VarF.e(size == 0 ? 10 : size << 1);
        ia.j(obj, j, r7VarE);
        return r7VarE;
    }

    @Override // c.a.b.b.g.c.a8
    final <E> void c(Object obj, Object obj2, long j) {
        r7 r7VarF = f(obj, j);
        r7 r7VarF2 = f(obj2, j);
        int size = r7VarF.size();
        int size2 = r7VarF2.size();
        if (size > 0 && size2 > 0) {
            if (!r7VarF.a()) {
                r7VarF = r7VarF.e(size2 + size);
            }
            r7VarF.addAll(r7VarF2);
        }
        if (size > 0) {
            r7VarF2 = r7VarF;
        }
        ia.j(obj, j, r7VarF2);
    }

    @Override // c.a.b.b.g.c.a8
    final void e(Object obj, long j) {
        f(obj, j).b();
    }
}
