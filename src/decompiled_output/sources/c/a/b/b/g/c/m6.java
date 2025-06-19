package c.a.b.b.g.c;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
final class m6 implements l9 {

    /* renamed from: a, reason: collision with root package name */
    private final l6 f1768a;

    /* renamed from: b, reason: collision with root package name */
    private int f1769b;

    /* renamed from: c, reason: collision with root package name */
    private int f1770c;
    private int d = 0;

    private m6(l6 l6Var) {
        l6 l6Var2 = (l6) l7.f(l6Var, "input");
        this.f1768a = l6Var2;
        l6Var2.d = this;
    }

    public static m6 G(l6 l6Var) {
        m6 m6Var = l6Var.d;
        return m6Var != null ? m6Var : new m6(l6Var);
    }

    private final Object H(ua uaVar, Class<?> cls, u6 u6Var) throws IOException {
        switch (p6.f1789a[uaVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(A0());
            case 2:
                return I();
            case 3:
                return Double.valueOf(d());
            case 4:
                return Integer.valueOf(x());
            case 5:
                return Integer.valueOf(u0());
            case 6:
                return Long.valueOf(n0());
            case 7:
                return Float.valueOf(f());
            case 8:
                return Integer.valueOf(e0());
            case 9:
                return Long.valueOf(B0());
            case 10:
                J(2);
                return M(f9.a().b(cls), u6Var);
            case 11:
                return Integer.valueOf(B());
            case 12:
                return Long.valueOf(p0());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Long.valueOf(e());
            case 15:
                return F();
            case 16:
                return Integer.valueOf(O());
            case 17:
                return Long.valueOf(y0());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final void J(int r2) throws IOException {
        if ((this.f1769b & 7) != r2) {
            throw q7.f();
        }
    }

    private final void K(List<String> list, boolean z) throws IOException {
        int r0;
        int r3;
        if ((this.f1769b & 7) != 2) {
            throw q7.f();
        }
        if (!(list instanceof b8) || z) {
            do {
                list.add(z ? F() : z());
                if (this.f1768a.A()) {
                    return;
                } else {
                    r0 = this.f1768a.a();
                }
            } while (r0 == this.f1769b);
            this.d = r0;
            return;
        }
        b8 b8Var = (b8) list;
        do {
            b8Var.O(I());
            if (this.f1768a.A()) {
                return;
            } else {
                r3 = this.f1768a.a();
            }
        } while (r3 == this.f1769b);
        this.d = r3;
    }

    private static void L(int r0) throws IOException {
        if ((r0 & 7) != 0) {
            throw q7.g();
        }
    }

    private final <T> T M(j9<T> j9Var, u6 u6Var) throws IOException {
        int r0 = this.f1768a.t();
        l6 l6Var = this.f1768a;
        if (l6Var.f1759a >= l6Var.f1760b) {
            throw new q7("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int r02 = l6Var.h(r0);
        T tA = j9Var.a();
        this.f1768a.f1759a++;
        j9Var.i(tA, this, u6Var);
        j9Var.g(tA);
        this.f1768a.d(0);
        r5.f1759a--;
        this.f1768a.j(r02);
        return tA;
    }

    private static void N(int r0) throws IOException {
        if ((r0 & 3) != 0) {
            throw q7.g();
        }
    }

    private final <T> T P(j9<T> j9Var, u6 u6Var) throws IOException {
        int r0 = this.f1770c;
        this.f1770c = ((this.f1769b >>> 3) << 3) | 4;
        try {
            T tA = j9Var.a();
            j9Var.i(tA, this, u6Var);
            j9Var.g(tA);
            if (this.f1769b == this.f1770c) {
                return tA;
            }
            throw q7.g();
        } finally {
            this.f1770c = r0;
        }
    }

    private final void Q(int r2) throws IOException {
        if (this.f1768a.B() != r2) {
            throw q7.a();
        }
    }

    @Override // c.a.b.b.g.c.l9
    public final void A(List<Double> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof t6)) {
            int r02 = this.f1769b & 7;
            if (r02 == 1) {
                do {
                    list.add(Double.valueOf(this.f1768a.e()));
                    if (this.f1768a.A()) {
                        return;
                    } else {
                        r0 = this.f1768a.a();
                    }
                } while (r0 == this.f1769b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw q7.f();
            }
            int r03 = this.f1768a.t();
            L(r03);
            int r1 = this.f1768a.B() + r03;
            do {
                list.add(Double.valueOf(this.f1768a.e()));
            } while (this.f1768a.B() < r1);
            return;
        }
        t6 t6Var = (t6) list;
        int r52 = this.f1769b & 7;
        if (r52 == 1) {
            do {
                t6Var.h(this.f1768a.e());
                if (this.f1768a.A()) {
                    return;
                } else {
                    r5 = this.f1768a.a();
                }
            } while (r5 == this.f1769b);
            this.d = r5;
            return;
        }
        if (r52 != 2) {
            throw q7.f();
        }
        int r53 = this.f1768a.t();
        L(r53);
        int r12 = this.f1768a.B() + r53;
        do {
            t6Var.h(this.f1768a.e());
        } while (this.f1768a.B() < r12);
    }

    @Override // c.a.b.b.g.c.l9
    public final boolean A0() throws IOException {
        J(0);
        return this.f1768a.p();
    }

    @Override // c.a.b.b.g.c.l9
    public final int B() throws IOException {
        J(5);
        return this.f1768a.v();
    }

    @Override // c.a.b.b.g.c.l9
    public final long B0() throws IOException {
        J(0);
        return this.f1768a.l();
    }

    @Override // c.a.b.b.g.c.l9
    public final void C(List<String> list) throws IOException {
        K(list, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.a.b.b.g.c.l9
    public final <T> void D(List<T> list, j9<T> j9Var, u6 u6Var) throws IOException {
        int r1;
        int r0 = this.f1769b;
        if ((r0 & 7) != 3) {
            throw q7.f();
        }
        do {
            list.add(P(j9Var, u6Var));
            if (this.f1768a.A() || this.d != 0) {
                return;
            } else {
                r1 = this.f1768a.a();
            }
        } while (r1 == r0);
        this.d = r1;
    }

    @Override // c.a.b.b.g.c.l9
    public final void E(List<Long> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof e8)) {
            int r02 = this.f1769b & 7;
            if (r02 == 0) {
                do {
                    list.add(Long.valueOf(this.f1768a.l()));
                    if (this.f1768a.A()) {
                        return;
                    } else {
                        r0 = this.f1768a.a();
                    }
                } while (r0 == this.f1769b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw q7.f();
            }
            int r1 = this.f1768a.B() + this.f1768a.t();
            do {
                list.add(Long.valueOf(this.f1768a.l()));
            } while (this.f1768a.B() < r1);
            Q(r1);
            return;
        }
        e8 e8Var = (e8) list;
        int r52 = this.f1769b & 7;
        if (r52 == 0) {
            do {
                e8Var.h(this.f1768a.l());
                if (this.f1768a.A()) {
                    return;
                } else {
                    r5 = this.f1768a.a();
                }
            } while (r5 == this.f1769b);
            this.d = r5;
            return;
        }
        if (r52 != 2) {
            throw q7.f();
        }
        int r12 = this.f1768a.B() + this.f1768a.t();
        do {
            e8Var.h(this.f1768a.l());
        } while (this.f1768a.B() < r12);
        Q(r12);
    }

    @Override // c.a.b.b.g.c.l9
    public final String F() throws IOException {
        J(2);
        return this.f1768a.r();
    }

    @Override // c.a.b.b.g.c.l9
    public final y5 I() throws IOException {
        J(2);
        return this.f1768a.s();
    }

    @Override // c.a.b.b.g.c.l9
    public final int O() throws IOException {
        J(0);
        return this.f1768a.t();
    }

    @Override // c.a.b.b.g.c.l9
    public final int a() throws IOException {
        int r0 = this.d;
        if (r0 != 0) {
            this.f1769b = r0;
            this.d = 0;
        } else {
            this.f1769b = this.f1768a.a();
        }
        int r02 = this.f1769b;
        return (r02 == 0 || r02 == this.f1770c) ? ActivityChooserView.f.j : r02 >>> 3;
    }

    @Override // c.a.b.b.g.c.l9
    public final int b() {
        return this.f1769b;
    }

    @Override // c.a.b.b.g.c.l9
    public final boolean c() throws IOException {
        int r0;
        if (this.f1768a.A() || (r0 = this.f1769b) == this.f1770c) {
            return false;
        }
        return this.f1768a.f(r0);
    }

    @Override // c.a.b.b.g.c.l9
    public final double d() throws IOException {
        J(1);
        return this.f1768a.e();
    }

    @Override // c.a.b.b.g.c.l9
    public final long e() throws IOException {
        J(0);
        return this.f1768a.y();
    }

    @Override // c.a.b.b.g.c.l9
    public final int e0() throws IOException {
        J(0);
        return this.f1768a.m();
    }

    @Override // c.a.b.b.g.c.l9
    public final float f() throws IOException {
        J(5);
        return this.f1768a.g();
    }

    @Override // c.a.b.b.g.c.l9
    public final void g(List<Integer> list) throws IOException {
        int r0;
        int r3;
        if (!(list instanceof j7)) {
            int r02 = this.f1769b & 7;
            if (r02 == 0) {
                do {
                    list.add(Integer.valueOf(this.f1768a.t()));
                    if (this.f1768a.A()) {
                        return;
                    } else {
                        r0 = this.f1768a.a();
                    }
                } while (r0 == this.f1769b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw q7.f();
            }
            int r1 = this.f1768a.B() + this.f1768a.t();
            do {
                list.add(Integer.valueOf(this.f1768a.t()));
            } while (this.f1768a.B() < r1);
            Q(r1);
            return;
        }
        j7 j7Var = (j7) list;
        int r32 = this.f1769b & 7;
        if (r32 == 0) {
            do {
                j7Var.j(this.f1768a.t());
                if (this.f1768a.A()) {
                    return;
                } else {
                    r3 = this.f1768a.a();
                }
            } while (r3 == this.f1769b);
            this.d = r3;
            return;
        }
        if (r32 != 2) {
            throw q7.f();
        }
        int r12 = this.f1768a.B() + this.f1768a.t();
        do {
            j7Var.j(this.f1768a.t());
        } while (this.f1768a.B() < r12);
        Q(r12);
    }

    @Override // c.a.b.b.g.c.l9
    public final void h(List<Integer> list) throws IOException {
        int r0;
        int r3;
        if (!(list instanceof j7)) {
            int r02 = this.f1769b & 7;
            if (r02 == 0) {
                do {
                    list.add(Integer.valueOf(this.f1768a.x()));
                    if (this.f1768a.A()) {
                        return;
                    } else {
                        r0 = this.f1768a.a();
                    }
                } while (r0 == this.f1769b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw q7.f();
            }
            int r1 = this.f1768a.B() + this.f1768a.t();
            do {
                list.add(Integer.valueOf(this.f1768a.x()));
            } while (this.f1768a.B() < r1);
            Q(r1);
            return;
        }
        j7 j7Var = (j7) list;
        int r32 = this.f1769b & 7;
        if (r32 == 0) {
            do {
                j7Var.j(this.f1768a.x());
                if (this.f1768a.A()) {
                    return;
                } else {
                    r3 = this.f1768a.a();
                }
            } while (r3 == this.f1769b);
            this.d = r3;
            return;
        }
        if (r32 != 2) {
            throw q7.f();
        }
        int r12 = this.f1768a.B() + this.f1768a.t();
        do {
            j7Var.j(this.f1768a.x());
        } while (this.f1768a.B() < r12);
        Q(r12);
    }

    @Override // c.a.b.b.g.c.l9
    public final void i(List<Long> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof e8)) {
            int r02 = this.f1769b & 7;
            if (r02 == 1) {
                do {
                    list.add(Long.valueOf(this.f1768a.w()));
                    if (this.f1768a.A()) {
                        return;
                    } else {
                        r0 = this.f1768a.a();
                    }
                } while (r0 == this.f1769b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw q7.f();
            }
            int r03 = this.f1768a.t();
            L(r03);
            int r1 = this.f1768a.B() + r03;
            do {
                list.add(Long.valueOf(this.f1768a.w()));
            } while (this.f1768a.B() < r1);
            return;
        }
        e8 e8Var = (e8) list;
        int r52 = this.f1769b & 7;
        if (r52 == 1) {
            do {
                e8Var.h(this.f1768a.w());
                if (this.f1768a.A()) {
                    return;
                } else {
                    r5 = this.f1768a.a();
                }
            } while (r5 == this.f1769b);
            this.d = r5;
            return;
        }
        if (r52 != 2) {
            throw q7.f();
        }
        int r53 = this.f1768a.t();
        L(r53);
        int r12 = this.f1768a.B() + r53;
        do {
            e8Var.h(this.f1768a.w());
        } while (this.f1768a.B() < r12);
    }

    @Override // c.a.b.b.g.c.l9
    public final void j(List<Long> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof e8)) {
            int r02 = this.f1769b & 7;
            if (r02 == 1) {
                do {
                    list.add(Long.valueOf(this.f1768a.n()));
                    if (this.f1768a.A()) {
                        return;
                    } else {
                        r0 = this.f1768a.a();
                    }
                } while (r0 == this.f1769b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw q7.f();
            }
            int r03 = this.f1768a.t();
            L(r03);
            int r1 = this.f1768a.B() + r03;
            do {
                list.add(Long.valueOf(this.f1768a.n()));
            } while (this.f1768a.B() < r1);
            return;
        }
        e8 e8Var = (e8) list;
        int r52 = this.f1769b & 7;
        if (r52 == 1) {
            do {
                e8Var.h(this.f1768a.n());
                if (this.f1768a.A()) {
                    return;
                } else {
                    r5 = this.f1768a.a();
                }
            } while (r5 == this.f1769b);
            this.d = r5;
            return;
        }
        if (r52 != 2) {
            throw q7.f();
        }
        int r53 = this.f1768a.t();
        L(r53);
        int r12 = this.f1768a.B() + r53;
        do {
            e8Var.h(this.f1768a.n());
        } while (this.f1768a.B() < r12);
    }

    @Override // c.a.b.b.g.c.l9
    public final void k(List<Integer> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof j7)) {
            int r02 = this.f1769b & 7;
            if (r02 == 2) {
                int r03 = this.f1768a.t();
                N(r03);
                int r1 = this.f1768a.B() + r03;
                do {
                    list.add(Integer.valueOf(this.f1768a.v()));
                } while (this.f1768a.B() < r1);
                return;
            }
            if (r02 != 5) {
                throw q7.f();
            }
            do {
                list.add(Integer.valueOf(this.f1768a.v()));
                if (this.f1768a.A()) {
                    return;
                } else {
                    r0 = this.f1768a.a();
                }
            } while (r0 == this.f1769b);
            this.d = r0;
            return;
        }
        j7 j7Var = (j7) list;
        int r52 = this.f1769b & 7;
        if (r52 == 2) {
            int r53 = this.f1768a.t();
            N(r53);
            int r3 = this.f1768a.B() + r53;
            do {
                j7Var.j(this.f1768a.v());
            } while (this.f1768a.B() < r3);
            return;
        }
        if (r52 != 5) {
            throw q7.f();
        }
        do {
            j7Var.j(this.f1768a.v());
            if (this.f1768a.A()) {
                return;
            } else {
                r5 = this.f1768a.a();
            }
        } while (r5 == this.f1769b);
        this.d = r5;
    }

    @Override // c.a.b.b.g.c.l9
    public final int l() throws IOException {
        J(0);
        return this.f1768a.x();
    }

    @Override // c.a.b.b.g.c.l9
    public final void m(List<Integer> list) throws IOException {
        int r0;
        int r3;
        if (!(list instanceof j7)) {
            int r02 = this.f1769b & 7;
            if (r02 == 0) {
                do {
                    list.add(Integer.valueOf(this.f1768a.u()));
                    if (this.f1768a.A()) {
                        return;
                    } else {
                        r0 = this.f1768a.a();
                    }
                } while (r0 == this.f1769b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw q7.f();
            }
            int r1 = this.f1768a.B() + this.f1768a.t();
            do {
                list.add(Integer.valueOf(this.f1768a.u()));
            } while (this.f1768a.B() < r1);
            Q(r1);
            return;
        }
        j7 j7Var = (j7) list;
        int r32 = this.f1769b & 7;
        if (r32 == 0) {
            do {
                j7Var.j(this.f1768a.u());
                if (this.f1768a.A()) {
                    return;
                } else {
                    r3 = this.f1768a.a();
                }
            } while (r3 == this.f1769b);
            this.d = r3;
            return;
        }
        if (r32 != 2) {
            throw q7.f();
        }
        int r12 = this.f1768a.B() + this.f1768a.t();
        do {
            j7Var.j(this.f1768a.u());
        } while (this.f1768a.B() < r12);
        Q(r12);
    }

    @Override // c.a.b.b.g.c.l9
    public final void n(List<Long> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof e8)) {
            int r02 = this.f1769b & 7;
            if (r02 == 0) {
                do {
                    list.add(Long.valueOf(this.f1768a.y()));
                    if (this.f1768a.A()) {
                        return;
                    } else {
                        r0 = this.f1768a.a();
                    }
                } while (r0 == this.f1769b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw q7.f();
            }
            int r1 = this.f1768a.B() + this.f1768a.t();
            do {
                list.add(Long.valueOf(this.f1768a.y()));
            } while (this.f1768a.B() < r1);
            Q(r1);
            return;
        }
        e8 e8Var = (e8) list;
        int r52 = this.f1769b & 7;
        if (r52 == 0) {
            do {
                e8Var.h(this.f1768a.y());
                if (this.f1768a.A()) {
                    return;
                } else {
                    r5 = this.f1768a.a();
                }
            } while (r5 == this.f1769b);
            this.d = r5;
            return;
        }
        if (r52 != 2) {
            throw q7.f();
        }
        int r12 = this.f1768a.B() + this.f1768a.t();
        do {
            e8Var.h(this.f1768a.y());
        } while (this.f1768a.B() < r12);
        Q(r12);
    }

    @Override // c.a.b.b.g.c.l9
    public final long n0() throws IOException {
        J(1);
        return this.f1768a.n();
    }

    @Override // c.a.b.b.g.c.l9
    public final void o(List<Boolean> list) throws IOException {
        int r0;
        int r3;
        if (!(list instanceof w5)) {
            int r02 = this.f1769b & 7;
            if (r02 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f1768a.p()));
                    if (this.f1768a.A()) {
                        return;
                    } else {
                        r0 = this.f1768a.a();
                    }
                } while (r0 == this.f1769b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw q7.f();
            }
            int r1 = this.f1768a.B() + this.f1768a.t();
            do {
                list.add(Boolean.valueOf(this.f1768a.p()));
            } while (this.f1768a.B() < r1);
            Q(r1);
            return;
        }
        w5 w5Var = (w5) list;
        int r32 = this.f1769b & 7;
        if (r32 == 0) {
            do {
                w5Var.h(this.f1768a.p());
                if (this.f1768a.A()) {
                    return;
                } else {
                    r3 = this.f1768a.a();
                }
            } while (r3 == this.f1769b);
            this.d = r3;
            return;
        }
        if (r32 != 2) {
            throw q7.f();
        }
        int r12 = this.f1768a.B() + this.f1768a.t();
        do {
            w5Var.h(this.f1768a.p());
        } while (this.f1768a.B() < r12);
        Q(r12);
    }

    @Override // c.a.b.b.g.c.l9
    public final void p(List<Integer> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof j7)) {
            int r02 = this.f1769b & 7;
            if (r02 == 2) {
                int r03 = this.f1768a.t();
                N(r03);
                int r1 = this.f1768a.B() + r03;
                do {
                    list.add(Integer.valueOf(this.f1768a.o()));
                } while (this.f1768a.B() < r1);
                return;
            }
            if (r02 != 5) {
                throw q7.f();
            }
            do {
                list.add(Integer.valueOf(this.f1768a.o()));
                if (this.f1768a.A()) {
                    return;
                } else {
                    r0 = this.f1768a.a();
                }
            } while (r0 == this.f1769b);
            this.d = r0;
            return;
        }
        j7 j7Var = (j7) list;
        int r52 = this.f1769b & 7;
        if (r52 == 2) {
            int r53 = this.f1768a.t();
            N(r53);
            int r3 = this.f1768a.B() + r53;
            do {
                j7Var.j(this.f1768a.o());
            } while (this.f1768a.B() < r3);
            return;
        }
        if (r52 != 5) {
            throw q7.f();
        }
        do {
            j7Var.j(this.f1768a.o());
            if (this.f1768a.A()) {
                return;
            } else {
                r5 = this.f1768a.a();
            }
        } while (r5 == this.f1769b);
        this.d = r5;
    }

    @Override // c.a.b.b.g.c.l9
    public final long p0() throws IOException {
        J(1);
        return this.f1768a.w();
    }

    @Override // c.a.b.b.g.c.l9
    public final void p1(List<Integer> list) throws IOException {
        int r0;
        int r3;
        if (!(list instanceof j7)) {
            int r02 = this.f1769b & 7;
            if (r02 == 0) {
                do {
                    list.add(Integer.valueOf(this.f1768a.m()));
                    if (this.f1768a.A()) {
                        return;
                    } else {
                        r0 = this.f1768a.a();
                    }
                } while (r0 == this.f1769b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw q7.f();
            }
            int r1 = this.f1768a.B() + this.f1768a.t();
            do {
                list.add(Integer.valueOf(this.f1768a.m()));
            } while (this.f1768a.B() < r1);
            Q(r1);
            return;
        }
        j7 j7Var = (j7) list;
        int r32 = this.f1769b & 7;
        if (r32 == 0) {
            do {
                j7Var.j(this.f1768a.m());
                if (this.f1768a.A()) {
                    return;
                } else {
                    r3 = this.f1768a.a();
                }
            } while (r3 == this.f1769b);
            this.d = r3;
            return;
        }
        if (r32 != 2) {
            throw q7.f();
        }
        int r12 = this.f1768a.B() + this.f1768a.t();
        do {
            j7Var.j(this.f1768a.m());
        } while (this.f1768a.B() < r12);
        Q(r12);
    }

    @Override // c.a.b.b.g.c.l9
    public final void q(List<Long> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof e8)) {
            int r02 = this.f1769b & 7;
            if (r02 == 0) {
                do {
                    list.add(Long.valueOf(this.f1768a.i()));
                    if (this.f1768a.A()) {
                        return;
                    } else {
                        r0 = this.f1768a.a();
                    }
                } while (r0 == this.f1769b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw q7.f();
            }
            int r1 = this.f1768a.B() + this.f1768a.t();
            do {
                list.add(Long.valueOf(this.f1768a.i()));
            } while (this.f1768a.B() < r1);
            Q(r1);
            return;
        }
        e8 e8Var = (e8) list;
        int r52 = this.f1769b & 7;
        if (r52 == 0) {
            do {
                e8Var.h(this.f1768a.i());
                if (this.f1768a.A()) {
                    return;
                } else {
                    r5 = this.f1768a.a();
                }
            } while (r5 == this.f1769b);
            this.d = r5;
            return;
        }
        if (r52 != 2) {
            throw q7.f();
        }
        int r12 = this.f1768a.B() + this.f1768a.t();
        do {
            e8Var.h(this.f1768a.i());
        } while (this.f1768a.B() < r12);
        Q(r12);
    }

    @Override // c.a.b.b.g.c.l9
    public final <T> T r(j9<T> j9Var, u6 u6Var) throws IOException {
        J(3);
        return (T) P(j9Var, u6Var);
    }

    @Override // c.a.b.b.g.c.l9
    public final void s(List<y5> list) throws IOException {
        int r0;
        if ((this.f1769b & 7) != 2) {
            throw q7.f();
        }
        do {
            list.add(I());
            if (this.f1768a.A()) {
                return;
            } else {
                r0 = this.f1768a.a();
            }
        } while (r0 == this.f1769b);
        this.d = r0;
    }

    @Override // c.a.b.b.g.c.l9
    public final void t(List<Float> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof d7)) {
            int r02 = this.f1769b & 7;
            if (r02 == 2) {
                int r03 = this.f1768a.t();
                N(r03);
                int r1 = this.f1768a.B() + r03;
                do {
                    list.add(Float.valueOf(this.f1768a.g()));
                } while (this.f1768a.B() < r1);
                return;
            }
            if (r02 != 5) {
                throw q7.f();
            }
            do {
                list.add(Float.valueOf(this.f1768a.g()));
                if (this.f1768a.A()) {
                    return;
                } else {
                    r0 = this.f1768a.a();
                }
            } while (r0 == this.f1769b);
            this.d = r0;
            return;
        }
        d7 d7Var = (d7) list;
        int r52 = this.f1769b & 7;
        if (r52 == 2) {
            int r53 = this.f1768a.t();
            N(r53);
            int r3 = this.f1768a.B() + r53;
            do {
                d7Var.h(this.f1768a.g());
            } while (this.f1768a.B() < r3);
            return;
        }
        if (r52 != 5) {
            throw q7.f();
        }
        do {
            d7Var.h(this.f1768a.g());
            if (this.f1768a.A()) {
                return;
            } else {
                r5 = this.f1768a.a();
            }
        } while (r5 == this.f1769b);
        this.d = r5;
    }

    @Override // c.a.b.b.g.c.l9
    public final <T> T u(j9<T> j9Var, u6 u6Var) throws IOException {
        J(2);
        return (T) M(j9Var, u6Var);
    }

    @Override // c.a.b.b.g.c.l9
    public final int u0() throws IOException {
        J(5);
        return this.f1768a.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.a.b.b.g.c.l9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <K, V> void v(java.util.Map<K, V> r8, c.a.b.b.g.c.m8<K, V> r9, c.a.b.b.g.c.u6 r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.J(r0)
            c.a.b.b.g.c.l6 r1 = r7.f1768a
            int r1 = r1.t()
            c.a.b.b.g.c.l6 r2 = r7.f1768a
            int r1 = r2.h(r1)
            K r2 = r9.f1772b
            V r3 = r9.d
        L14:
            int r4 = r7.a()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            c.a.b.b.g.c.l6 r5 = r7.f1768a     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.A()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.c()     // Catch: c.a.b.b.g.c.t7 -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            c.a.b.b.g.c.q7 r4 = new c.a.b.b.g.c.q7     // Catch: c.a.b.b.g.c.t7 -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: c.a.b.b.g.c.t7 -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: c.a.b.b.g.c.t7 -> L4e java.lang.Throwable -> L64
        L39:
            c.a.b.b.g.c.ua r4 = r9.f1773c     // Catch: c.a.b.b.g.c.t7 -> L4e java.lang.Throwable -> L64
            V r5 = r9.d     // Catch: c.a.b.b.g.c.t7 -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: c.a.b.b.g.c.t7 -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.H(r4, r5, r10)     // Catch: c.a.b.b.g.c.t7 -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            c.a.b.b.g.c.ua r4 = r9.f1771a     // Catch: c.a.b.b.g.c.t7 -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.H(r4, r5, r5)     // Catch: c.a.b.b.g.c.t7 -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.c()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            c.a.b.b.g.c.q7 r8 = new c.a.b.b.g.c.q7     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            c.a.b.b.g.c.l6 r8 = r7.f1768a
            r8.j(r1)
            return
        L64:
            r8 = move-exception
            c.a.b.b.g.c.l6 r9 = r7.f1768a
            r9.j(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.m6.v(java.util.Map, c.a.b.b.g.c.m8, c.a.b.b.g.c.u6):void");
    }

    @Override // c.a.b.b.g.c.l9
    public final void w(List<String> list) throws IOException {
        K(list, true);
    }

    @Override // c.a.b.b.g.c.l9
    public final int x() throws IOException {
        J(0);
        return this.f1768a.u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.a.b.b.g.c.l9
    public final <T> void y(List<T> list, j9<T> j9Var, u6 u6Var) throws IOException {
        int r1;
        int r0 = this.f1769b;
        if ((r0 & 7) != 2) {
            throw q7.f();
        }
        do {
            list.add(M(j9Var, u6Var));
            if (this.f1768a.A() || this.d != 0) {
                return;
            } else {
                r1 = this.f1768a.a();
            }
        } while (r1 == r0);
        this.d = r1;
    }

    @Override // c.a.b.b.g.c.l9
    public final long y0() throws IOException {
        J(0);
        return this.f1768a.i();
    }

    @Override // c.a.b.b.g.c.l9
    public final String z() throws IOException {
        J(2);
        return this.f1768a.q();
    }
}
