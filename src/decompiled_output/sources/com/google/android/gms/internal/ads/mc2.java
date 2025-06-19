package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
abstract class mc2<T, B> {
    mc2() {
    }

    abstract void a(B b2, int r2, long j);

    abstract void b(B b2, int r2, a82 a82Var);

    abstract void c(B b2, int r2, T t);

    abstract void d(T t, kd2 kd2Var) throws IOException;

    abstract boolean e(nb2 nb2Var);

    final boolean f(B b2, nb2 nb2Var) throws IOException {
        int r0 = nb2Var.s();
        int r1 = r0 >>> 3;
        int r02 = r0 & 7;
        if (r02 == 0) {
            a(b2, r1, nb2Var.Q());
            return true;
        }
        if (r02 == 1) {
            m(b2, r1, nb2Var.w());
            return true;
        }
        if (r02 == 2) {
            b(b2, r1, nb2Var.C());
            return true;
        }
        if (r02 != 3) {
            if (r02 == 4) {
                return false;
            }
            if (r02 != 5) {
                throw w92.f();
            }
            o(b2, r1, nb2Var.M());
            return true;
        }
        B bN = n();
        int r3 = 4 | (r1 << 3);
        while (nb2Var.F() != Integer.MAX_VALUE && f(bN, nb2Var)) {
        }
        if (r3 != nb2Var.s()) {
            throw w92.e();
        }
        c(b2, r1, h(bN));
        return true;
    }

    abstract void g(Object obj);

    abstract T h(B b2);

    abstract int i(T t);

    abstract T j(Object obj);

    abstract B k(Object obj);

    abstract int l(T t);

    abstract void m(B b2, int r2, long j);

    abstract B n();

    abstract void o(B b2, int r2, int r3);

    abstract void p(T t, kd2 kd2Var) throws IOException;

    abstract void q(Object obj, T t);

    abstract void r(Object obj, B b2);

    abstract T s(T t, T t2);
}
