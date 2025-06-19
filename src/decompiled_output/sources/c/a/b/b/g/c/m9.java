package c.a.b.b.g.c;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class m9 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f1774a = F();

    /* renamed from: b, reason: collision with root package name */
    private static final ca<?, ?> f1775b = g(false);

    /* renamed from: c, reason: collision with root package name */
    private static final ca<?, ?> f1776c = g(true);
    private static final ca<?, ?> d = new ea();

    static int A(List<Long> list) {
        int r2;
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e8) {
            e8 e8Var = (e8) list;
            r2 = 0;
            while (r1 < size) {
                r2 += o6.o0(e8Var.g(r1));
                r1++;
            }
        } else {
            r2 = 0;
            while (r1 < size) {
                r2 += o6.o0(list.get(r1).longValue());
                r1++;
            }
        }
        return r2;
    }

    public static ca<?, ?> B() {
        return d;
    }

    public static void C(int r1, List<Long> list, ab abVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.n(r1, list, z);
    }

    static int D(int r0, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * o6.h0(r0));
    }

    static int E(List<Integer> list) {
        int r2;
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j7) {
            j7 j7Var = (j7) list;
            r2 = 0;
            while (r1 < size) {
                r2 += o6.C0(j7Var.h(r1));
                r1++;
            }
        } else {
            r2 = 0;
            while (r1 < size) {
                r2 += o6.C0(list.get(r1).intValue());
                r1++;
            }
        }
        return r2;
    }

    private static Class<?> F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void G(int r1, List<Long> list, ab abVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.h(r1, list, z);
    }

    static int H(int r0, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return I(list) + (size * o6.h0(r0));
    }

    static int I(List<Integer> list) {
        int r2;
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j7) {
            j7 j7Var = (j7) list;
            r2 = 0;
            while (r1 < size) {
                r2 += o6.l0(j7Var.h(r1));
                r1++;
            }
        } else {
            r2 = 0;
            while (r1 < size) {
                r2 += o6.l0(list.get(r1).intValue());
                r1++;
            }
        }
        return r2;
    }

    private static Class<?> J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void K(int r1, List<Long> list, ab abVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.d(r1, list, z);
    }

    static int L(int r0, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + (size * o6.h0(r0));
    }

    static int M(List<Integer> list) {
        int r2;
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j7) {
            j7 j7Var = (j7) list;
            r2 = 0;
            while (r1 < size) {
                r2 += o6.p0(j7Var.h(r1));
                r1++;
            }
        } else {
            r2 = 0;
            while (r1 < size) {
                r2 += o6.p0(list.get(r1).intValue());
                r1++;
            }
        }
        return r2;
    }

    public static void N(int r1, List<Long> list, ab abVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.b(r1, list, z);
    }

    static int O(int r0, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * o6.h0(r0));
    }

    static int P(List<Integer> list) {
        int r2;
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j7) {
            j7 j7Var = (j7) list;
            r2 = 0;
            while (r1 < size) {
                r2 += o6.t0(j7Var.h(r1));
                r1++;
            }
        } else {
            r2 = 0;
            while (r1 < size) {
                r2 += o6.t0(list.get(r1).intValue());
                r1++;
            }
        }
        return r2;
    }

    public static void Q(int r1, List<Long> list, ab abVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.q(r1, list, z);
    }

    static int R(int r0, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * o6.y0(r0, 0);
    }

    static int S(List<?> list) {
        return list.size() << 2;
    }

    public static void T(int r1, List<Integer> list, ab abVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.f(r1, list, z);
    }

    static int U(int r2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * o6.r0(r2, 0L);
    }

    static int V(List<?> list) {
        return list.size() << 3;
    }

    public static void W(int r1, List<Integer> list, ab abVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.u(r1, list, z);
    }

    static int X(int r0, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * o6.H(r0, true);
    }

    static int Y(List<?> list) {
        return list.size();
    }

    public static void Z(int r1, List<Integer> list, ab abVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.j(r1, list, z);
    }

    static int a(int r1, Object obj, j9 j9Var) {
        return obj instanceof z7 ? o6.c(r1, (z7) obj) : o6.F(r1, (r8) obj, j9Var);
    }

    public static void a0(int r1, List<Integer> list, ab abVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.r(r1, list, z);
    }

    static int b(int r4, List<?> list) {
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        int I = o6.h0(r4) * size;
        if (list instanceof b8) {
            b8 b8Var = (b8) list;
            while (r1 < size) {
                Object objG = b8Var.g(r1);
                I += objG instanceof y5 ? o6.I((y5) objG) : o6.K((String) objG);
                r1++;
            }
        } else {
            while (r1 < size) {
                Object obj = list.get(r1);
                I += obj instanceof y5 ? o6.I((y5) obj) : o6.K((String) obj);
                r1++;
            }
        }
        return I;
    }

    public static void b0(int r1, List<Integer> list, ab abVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.v(r1, list, z);
    }

    static int c(int r4, List<?> list, j9 j9Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r42 = o6.h0(r4) * size;
        for (int r1 = 0; r1 < size; r1++) {
            Object obj = list.get(r1);
            r42 += obj instanceof z7 ? o6.d((z7) obj) : o6.e((r8) obj, j9Var);
        }
        return r42;
    }

    public static void c0(int r1, List<Integer> list, ab abVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.i(r1, list, z);
    }

    static int d(int r0, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return e(list) + (list.size() * o6.h0(r0));
    }

    public static void d0(int r1, List<Boolean> list, ab abVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.c(r1, list, z);
    }

    static int e(List<Long> list) {
        int r2;
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e8) {
            e8 e8Var = (e8) list;
            r2 = 0;
            while (r1 < size) {
                r2 += o6.e0(e8Var.g(r1));
                r1++;
            }
        } else {
            r2 = 0;
            while (r1 < size) {
                r2 += o6.e0(list.get(r1).longValue());
                r1++;
            }
        }
        return r2;
    }

    public static ca<?, ?> f() {
        return f1775b;
    }

    private static ca<?, ?> g(boolean z) {
        try {
            Class<?> clsJ = J();
            if (clsJ == null) {
                return null;
            }
            return (ca) clsJ.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB h(int r2, int r3, UB ub, ca<UT, UB> caVar) {
        if (ub == null) {
            ub = caVar.a();
        }
        caVar.d(ub, r2, r3);
        return ub;
    }

    static <UT, UB> UB i(int r5, List<Integer> list, m7 m7Var, UB ub, ca<UT, UB> caVar) {
        if (m7Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int r2 = 0;
            for (int r1 = 0; r1 < size; r1++) {
                int r3 = list.get(r1).intValue();
                if (m7Var.e(r3)) {
                    if (r1 != r2) {
                        list.set(r2, Integer.valueOf(r3));
                    }
                    r2++;
                } else {
                    ub = (UB) h(r5, r3, ub, caVar);
                }
            }
            if (r2 != size) {
                list.subList(r2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int r0 = it.next().intValue();
                if (!m7Var.e(r0)) {
                    ub = (UB) h(r5, r0, ub, caVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void j(int r1, List<String> list, ab abVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.x(r1, list);
    }

    public static void k(int r1, List<?> list, ab abVar, j9 j9Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.J(r1, list, j9Var);
    }

    public static void l(int r1, List<Double> list, ab abVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.o(r1, list, z);
    }

    static <T, FT extends z6<FT>> void m(w6<FT> w6Var, T t, T t2) {
        x6<T> x6VarB = w6Var.b(t2);
        if (x6VarB.f1855a.isEmpty()) {
            return;
        }
        w6Var.i(t).g(x6VarB);
    }

    static <T> void n(o8 o8Var, T t, T t2, long j) {
        ia.j(t, j, o8Var.f(ia.F(t, j), ia.F(t2, j)));
    }

    static <T, UT, UB> void o(ca<UT, UB> caVar, T t, T t2) {
        caVar.h(t, caVar.p(caVar.k(t), caVar.k(t2)));
    }

    public static void p(Class<?> cls) {
        Class<?> cls2;
        if (!h7.class.isAssignableFrom(cls) && (cls2 = f1774a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int r(int r2, List<y5> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int I = size * o6.h0(r2);
        for (int r1 = 0; r1 < list.size(); r1++) {
            I += o6.I(list.get(r1));
        }
        return I;
    }

    static int s(int r4, List<r8> list, j9 j9Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r2 = 0;
        for (int r1 = 0; r1 < size; r1++) {
            r2 += o6.V(r4, list.get(r1), j9Var);
        }
        return r2;
    }

    static int t(int r0, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u(list) + (size * o6.h0(r0));
    }

    static int u(List<Long> list) {
        int r2;
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e8) {
            e8 e8Var = (e8) list;
            r2 = 0;
            while (r1 < size) {
                r2 += o6.j0(e8Var.g(r1));
                r1++;
            }
        } else {
            r2 = 0;
            while (r1 < size) {
                r2 += o6.j0(list.get(r1).longValue());
                r1++;
            }
        }
        return r2;
    }

    public static ca<?, ?> v() {
        return f1776c;
    }

    public static void w(int r1, List<y5> list, ab abVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.p(r1, list);
    }

    public static void x(int r1, List<?> list, ab abVar, j9 j9Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.H(r1, list, j9Var);
    }

    public static void y(int r1, List<Float> list, ab abVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        abVar.s(r1, list, z);
    }

    static int z(int r0, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A(list) + (size * o6.h0(r0));
    }
}
