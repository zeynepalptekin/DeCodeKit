package c.a.b.b.g.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class c8 extends a8 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f1668c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private c8() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> f(Object obj, long j, int r6) {
        List<L> listE;
        y7 y7Var;
        List<L> listG = g(obj, j);
        if (!listG.isEmpty()) {
            if (f1668c.isAssignableFrom(listG.getClass())) {
                ArrayList arrayList = new ArrayList(listG.size() + r6);
                arrayList.addAll(listG);
                y7Var = arrayList;
            } else if (listG instanceof ha) {
                y7 y7Var2 = new y7(listG.size() + r6);
                y7Var2.addAll((ha) listG);
                y7Var = y7Var2;
            } else {
                if (!(listG instanceof d9) || !(listG instanceof r7)) {
                    return listG;
                }
                r7 r7Var = (r7) listG;
                if (r7Var.a()) {
                    return listG;
                }
                listE = r7Var.e(listG.size() + r6);
            }
            ia.j(obj, j, y7Var);
            return y7Var;
        }
        listE = listG instanceof b8 ? new y7(r6) : ((listG instanceof d9) && (listG instanceof r7)) ? ((r7) listG).e(r6) : new ArrayList<>(r6);
        ia.j(obj, j, listE);
        return listE;
    }

    private static <E> List<E> g(Object obj, long j) {
        return (List) ia.F(obj, j);
    }

    @Override // c.a.b.b.g.c.a8
    final <L> List<L> b(Object obj, long j) {
        return f(obj, j, 10);
    }

    @Override // c.a.b.b.g.c.a8
    final <E> void c(Object obj, Object obj2, long j) {
        List listG = g(obj2, j);
        List listF = f(obj, j, listG.size());
        int size = listF.size();
        int size2 = listG.size();
        if (size > 0 && size2 > 0) {
            listF.addAll(listG);
        }
        if (size > 0) {
            listG = listF;
        }
        ia.j(obj, j, listG);
    }

    @Override // c.a.b.b.g.c.a8
    final void e(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) ia.F(obj, j);
        if (list instanceof b8) {
            objUnmodifiableList = ((b8) list).f();
        } else {
            if (f1668c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof d9) && (list instanceof r7)) {
                r7 r7Var = (r7) list;
                if (r7Var.a()) {
                    r7Var.b();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        ia.j(obj, j, objUnmodifiableList);
    }
}
