package c.a.b.b.g.c;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class n8 implements o8 {
    n8() {
    }

    @Override // c.a.b.b.g.c.o8
    public final Object a(Object obj) {
        return l8.c().e();
    }

    @Override // c.a.b.b.g.c.o8
    public final Map<?, ?> b(Object obj) {
        return (l8) obj;
    }

    @Override // c.a.b.b.g.c.o8
    public final m8<?, ?> c(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // c.a.b.b.g.c.o8
    public final Object d(Object obj) {
        ((l8) obj).f();
        return obj;
    }

    @Override // c.a.b.b.g.c.o8
    public final boolean e(Object obj) {
        return !((l8) obj).g();
    }

    @Override // c.a.b.b.g.c.o8
    public final Object f(Object obj, Object obj2) {
        l8 l8VarE = (l8) obj;
        l8 l8Var = (l8) obj2;
        if (!l8Var.isEmpty()) {
            if (!l8VarE.g()) {
                l8VarE = l8VarE.e();
            }
            l8VarE.d(l8Var);
        }
        return l8VarE;
    }

    @Override // c.a.b.b.g.c.o8
    public final Map<?, ?> g(Object obj) {
        return (l8) obj;
    }

    @Override // c.a.b.b.g.c.o8
    public final int h(int r1, Object obj, Object obj2) {
        l8 l8Var = (l8) obj;
        if (l8Var.isEmpty()) {
            return 0;
        }
        Iterator it = l8Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
