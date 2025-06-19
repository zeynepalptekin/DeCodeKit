package c.a.b.b.g.c;

import java.io.IOException;

/* loaded from: classes.dex */
abstract class ca<T, B> {
    ca() {
    }

    abstract B a();

    abstract T b(B b2);

    abstract void c(B b2, int r2, int r3);

    abstract void d(B b2, int r2, long j);

    abstract void e(B b2, int r2, y5 y5Var);

    abstract void f(B b2, int r2, T t);

    abstract void g(T t, ab abVar) throws IOException;

    abstract void h(Object obj, T t);

    abstract boolean i(l9 l9Var);

    final boolean j(B b2, l9 l9Var) throws IOException {
        int r0 = l9Var.b();
        int r1 = r0 >>> 3;
        int r02 = r0 & 7;
        if (r02 == 0) {
            d(b2, r1, l9Var.B0());
            return true;
        }
        if (r02 == 1) {
            l(b2, r1, l9Var.n0());
            return true;
        }
        if (r02 == 2) {
            e(b2, r1, l9Var.I());
            return true;
        }
        if (r02 != 3) {
            if (r02 == 4) {
                return false;
            }
            if (r02 != 5) {
                throw q7.f();
            }
            c(b2, r1, l9Var.u0());
            return true;
        }
        B bA = a();
        int r3 = 4 | (r1 << 3);
        while (l9Var.a() != Integer.MAX_VALUE && j(bA, l9Var)) {
        }
        if (r3 != l9Var.b()) {
            throw q7.e();
        }
        f(b2, r1, b(bA));
        return true;
    }

    abstract T k(Object obj);

    abstract void l(B b2, int r2, long j);

    abstract void m(T t, ab abVar) throws IOException;

    abstract void n(Object obj, B b2);

    abstract B o(Object obj);

    abstract T p(T t, T t2);

    abstract void q(Object obj);

    abstract int r(T t);

    abstract int s(T t);
}
