package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class wb2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f5816a = y();

    /* renamed from: b, reason: collision with root package name */
    private static final mc2<?, ?> f5817b = A(false);

    /* renamed from: c, reason: collision with root package name */
    private static final mc2<?, ?> f5818c = A(true);
    private static final mc2<?, ?> d = new oc2();

    private static mc2<?, ?> A(boolean z) {
        try {
            Class<?> clsZ = z();
            if (clsZ == null) {
                return null;
            }
            return (mc2) clsZ.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    static int B(int r1, Object obj, ub2 ub2Var) {
        return obj instanceof fa2 ? v82.c(r1, (fa2) obj) : v82.z(r1, (xa2) obj, ub2Var);
    }

    static int C(int r4, List<?> list) {
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        int r42 = v82.e0(r4) * size;
        if (list instanceof ha2) {
            ha2 ha2Var = (ha2) list;
            while (r1 < size) {
                Object objZ = ha2Var.z(r1);
                r42 += objZ instanceof a82 ? v82.t((a82) objZ) : v82.r0((String) objZ);
                r1++;
            }
        } else {
            while (r1 < size) {
                Object obj = list.get(r1);
                r42 += obj instanceof a82 ? v82.t((a82) obj) : v82.r0((String) obj);
                r1++;
            }
        }
        return r42;
    }

    static int D(int r4, List<?> list, ub2 ub2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r42 = v82.e0(r4) * size;
        for (int r1 = 0; r1 < size; r1++) {
            Object obj = list.get(r1);
            r42 += obj instanceof fa2 ? v82.d((fa2) obj) : v82.e((xa2) obj, ub2Var);
        }
        return r42;
    }

    public static void E(int r1, List<Long> list, kd2 kd2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.n(r1, list, z);
    }

    static int F(int r2, List<a82> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r0 = size * v82.e0(r2);
        for (int r1 = 0; r1 < list.size(); r1++) {
            r0 += v82.t(list.get(r1));
        }
        return r0;
    }

    static int G(int r4, List<xa2> list, ub2 ub2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r2 = 0;
        for (int r1 = 0; r1 < size; r1++) {
            r2 += v82.J(r4, list.get(r1), ub2Var);
        }
        return r2;
    }

    public static void H(int r1, List<Long> list, kd2 kd2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.h(r1, list, z);
    }

    public static void I(int r1, List<Long> list, kd2 kd2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.d(r1, list, z);
    }

    public static void J(int r1, List<Long> list, kd2 kd2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.b(r1, list, z);
    }

    public static void K(int r1, List<Long> list, kd2 kd2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.q(r1, list, z);
    }

    public static void L(int r1, List<Integer> list, kd2 kd2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.f(r1, list, z);
    }

    static boolean M(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void N(int r1, List<Integer> list, kd2 kd2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.u(r1, list, z);
    }

    public static void O(Class<?> cls) {
        Class<?> cls2;
        if (!l92.class.isAssignableFrom(cls) && (cls2 = f5816a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void P(int r1, List<Integer> list, kd2 kd2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.j(r1, list, z);
    }

    public static void Q(int r1, List<Integer> list, kd2 kd2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.r(r1, list, z);
    }

    public static void R(int r1, List<Integer> list, kd2 kd2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.v(r1, list, z);
    }

    public static void S(int r1, List<Integer> list, kd2 kd2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.i(r1, list, z);
    }

    public static void T(int r1, List<Boolean> list, kd2 kd2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.c(r1, list, z);
    }

    static int U(int r0, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return i(list) + (list.size() * v82.e0(r0));
    }

    static int V(int r0, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j(list) + (size * v82.e0(r0));
    }

    static int W(int r0, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k(list) + (size * v82.e0(r0));
    }

    static int X(int r0, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l(list) + (size * v82.e0(r0));
    }

    static int Y(int r0, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m(list) + (size * v82.e0(r0));
    }

    static int Z(int r0, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return n(list) + (size * v82.e0(r0));
    }

    static <UT, UB> UB a(int r2, int r3, UB ub, mc2<UT, UB> mc2Var) {
        if (ub == null) {
            ub = mc2Var.n();
        }
        mc2Var.a(ub, r2, r3);
        return ub;
    }

    static int a0(int r0, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return o(list) + (size * v82.e0(r0));
    }

    static <UT, UB> UB b(int r5, List<Integer> list, t92 t92Var, UB ub, mc2<UT, UB> mc2Var) {
        if (t92Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int r2 = 0;
            for (int r1 = 0; r1 < size; r1++) {
                int r3 = list.get(r1).intValue();
                if (t92Var.a(r3)) {
                    if (r1 != r2) {
                        list.set(r2, Integer.valueOf(r3));
                    }
                    r2++;
                } else {
                    ub = (UB) a(r5, r3, ub, mc2Var);
                }
            }
            if (r2 != size) {
                list.subList(r2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int r0 = it.next().intValue();
                if (!t92Var.a(r0)) {
                    ub = (UB) a(r5, r0, ub, mc2Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static int b0(int r0, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * v82.s(r0, 0);
    }

    public static void c(int r1, List<String> list, kd2 kd2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.x(r1, list);
    }

    static int c0(int r2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * v82.C0(r2, 0L);
    }

    public static void d(int r1, List<?> list, kd2 kd2Var, ub2 ub2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.L(r1, list, ub2Var);
    }

    static int d0(int r0, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * v82.s0(r0, true);
    }

    public static void e(int r1, List<Double> list, kd2 kd2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.o(r1, list, z);
    }

    static <T, FT extends g92<FT>> void f(a92<FT> a92Var, T t, T t2) {
        e92<T> e92VarG = a92Var.g(t2);
        if (e92VarG.f3239a.isEmpty()) {
            return;
        }
        a92Var.h(t).h(e92VarG);
    }

    static <T> void g(ua2 ua2Var, T t, T t2, long j) {
        tc2.f(t, j, ua2Var.h(tc2.G(t, j), tc2.G(t2, j)));
    }

    static <T, UT, UB> void h(mc2<UT, UB> mc2Var, T t, T t2) {
        mc2Var.q(t, mc2Var.s(mc2Var.j(t), mc2Var.j(t2)));
    }

    static int i(List<Long> list) {
        int r2;
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ka2) {
            ka2 ka2Var = (ka2) list;
            r2 = 0;
            while (r1 < size) {
                r2 += v82.S(ka2Var.h(r1));
                r1++;
            }
        } else {
            r2 = 0;
            while (r1 < size) {
                r2 += v82.S(list.get(r1).longValue());
                r1++;
            }
        }
        return r2;
    }

    static int j(List<Long> list) {
        int r2;
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ka2) {
            ka2 ka2Var = (ka2) list;
            r2 = 0;
            while (r1 < size) {
                r2 += v82.T(ka2Var.h(r1));
                r1++;
            }
        } else {
            r2 = 0;
            while (r1 < size) {
                r2 += v82.T(list.get(r1).longValue());
                r1++;
            }
        }
        return r2;
    }

    static int k(List<Long> list) {
        int r2;
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ka2) {
            ka2 ka2Var = (ka2) list;
            r2 = 0;
            while (r1 < size) {
                r2 += v82.U(ka2Var.h(r1));
                r1++;
            }
        } else {
            r2 = 0;
            while (r1 < size) {
                r2 += v82.U(list.get(r1).longValue());
                r1++;
            }
        }
        return r2;
    }

    static int l(List<Integer> list) {
        int r2;
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p92) {
            p92 p92Var = (p92) list;
            r2 = 0;
            while (r1 < size) {
                r2 += v82.k0(p92Var.h(r1));
                r1++;
            }
        } else {
            r2 = 0;
            while (r1 < size) {
                r2 += v82.k0(list.get(r1).intValue());
                r1++;
            }
        }
        return r2;
    }

    static int m(List<Integer> list) {
        int r2;
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p92) {
            p92 p92Var = (p92) list;
            r2 = 0;
            while (r1 < size) {
                r2 += v82.f0(p92Var.h(r1));
                r1++;
            }
        } else {
            r2 = 0;
            while (r1 < size) {
                r2 += v82.f0(list.get(r1).intValue());
                r1++;
            }
        }
        return r2;
    }

    static int n(List<Integer> list) {
        int r2;
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p92) {
            p92 p92Var = (p92) list;
            r2 = 0;
            while (r1 < size) {
                r2 += v82.g0(p92Var.h(r1));
                r1++;
            }
        } else {
            r2 = 0;
            while (r1 < size) {
                r2 += v82.g0(list.get(r1).intValue());
                r1++;
            }
        }
        return r2;
    }

    static int o(List<Integer> list) {
        int r2;
        int size = list.size();
        int r1 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p92) {
            p92 p92Var = (p92) list;
            r2 = 0;
            while (r1 < size) {
                r2 += v82.h0(p92Var.h(r1));
                r1++;
            }
        } else {
            r2 = 0;
            while (r1 < size) {
                r2 += v82.h0(list.get(r1).intValue());
                r1++;
            }
        }
        return r2;
    }

    static int p(List<?> list) {
        return list.size() << 2;
    }

    static int q(List<?> list) {
        return list.size() << 3;
    }

    static int r(List<?> list) {
        return list.size();
    }

    public static void s(int r1, List<a82> list, kd2 kd2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.p(r1, list);
    }

    public static void t(int r1, List<?> list, kd2 kd2Var, ub2 ub2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.P(r1, list, ub2Var);
    }

    public static void u(int r1, List<Float> list, kd2 kd2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        kd2Var.s(r1, list, z);
    }

    public static mc2<?, ?> v() {
        return f5817b;
    }

    public static mc2<?, ?> w() {
        return f5818c;
    }

    public static mc2<?, ?> x() {
        return d;
    }

    private static Class<?> y() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> z() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }
}
