package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
final class t82 implements nb2 {

    /* renamed from: a, reason: collision with root package name */
    private final m82 f5363a;

    /* renamed from: b, reason: collision with root package name */
    private int f5364b;

    /* renamed from: c, reason: collision with root package name */
    private int f5365c;
    private int d = 0;

    private t82(m82 m82Var) {
        m82 m82Var2 = (m82) o92.d(m82Var, "input");
        this.f5363a = m82Var2;
        m82Var2.d = this;
    }

    private final void W(int r2) throws IOException {
        if (this.f5363a.v() != r2) {
            throw w92.a();
        }
    }

    public static t82 a(m82 m82Var) {
        t82 t82Var = m82Var.d;
        return t82Var != null ? t82Var : new t82(m82Var);
    }

    private final Object b(ed2 ed2Var, Class<?> cls, y82 y82Var) throws IOException {
        switch (s82.f5229a[ed2Var.ordinal()]) {
            case 1:
                return Boolean.valueOf(U());
            case 2:
                return C();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(V());
            case 5:
                return Integer.valueOf(M());
            case 6:
                return Long.valueOf(w());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(q());
            case 9:
                return Long.valueOf(Q());
            case 10:
                f(2);
                return d(mb2.b().c(cls), y82Var);
            case 11:
                return Integer.valueOf(p());
            case 12:
                return Long.valueOf(y());
            case 13:
                return Integer.valueOf(J());
            case 14:
                return Long.valueOf(P());
            case 15:
                return t();
            case 16:
                return Integer.valueOf(O());
            case 17:
                return Long.valueOf(I());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final void c(List<String> list, boolean z) throws IOException {
        int r0;
        int r3;
        if ((this.f5364b & 7) != 2) {
            throw w92.f();
        }
        if (!(list instanceof ha2) || z) {
            do {
                list.add(z ? t() : z());
                if (this.f5363a.u()) {
                    return;
                } else {
                    r0 = this.f5363a.e();
                }
            } while (r0 == this.f5364b);
            this.d = r0;
            return;
        }
        ha2 ha2Var = (ha2) list;
        do {
            ha2Var.M(C());
            if (this.f5363a.u()) {
                return;
            } else {
                r3 = this.f5363a.e();
            }
        } while (r3 == this.f5364b);
        this.d = r3;
    }

    private final <T> T d(ub2<T> ub2Var, y82 y82Var) throws IOException {
        int r0 = this.f5363a.n();
        m82 m82Var = this.f5363a;
        if (m82Var.f4363a >= m82Var.f4364b) {
            throw new w92("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int r02 = m82Var.z(r0);
        T tG = ub2Var.g();
        this.f5363a.f4363a++;
        ub2Var.e(tG, this, y82Var);
        ub2Var.c(tG);
        this.f5363a.x(0);
        r5.f4363a--;
        this.f5363a.A(r02);
        return tG;
    }

    private final <T> T e(ub2<T> ub2Var, y82 y82Var) throws IOException {
        int r0 = this.f5365c;
        this.f5365c = ((this.f5364b >>> 3) << 3) | 4;
        try {
            T tG = ub2Var.g();
            ub2Var.e(tG, this, y82Var);
            ub2Var.c(tG);
            if (this.f5364b == this.f5365c) {
                return tG;
            }
            throw w92.h();
        } finally {
            this.f5365c = r0;
        }
    }

    private final void f(int r2) throws IOException {
        if ((this.f5364b & 7) != r2) {
            throw w92.f();
        }
    }

    private static void j(int r0) throws IOException {
        if ((r0 & 7) != 0) {
            throw w92.h();
        }
    }

    private static void l(int r0) throws IOException {
        if ((r0 & 3) != 0) {
            throw w92.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void A(List<Integer> list) throws IOException {
        int r0;
        int r3;
        if (!(list instanceof p92)) {
            int r02 = this.f5364b & 7;
            if (r02 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5363a.o()));
                    if (this.f5363a.u()) {
                        return;
                    } else {
                        r0 = this.f5363a.e();
                    }
                } while (r0 == this.f5364b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw w92.f();
            }
            int r1 = this.f5363a.v() + this.f5363a.n();
            do {
                list.add(Integer.valueOf(this.f5363a.o()));
            } while (this.f5363a.v() < r1);
            W(r1);
            return;
        }
        p92 p92Var = (p92) list;
        int r32 = this.f5364b & 7;
        if (r32 == 0) {
            do {
                p92Var.U(this.f5363a.o());
                if (this.f5363a.u()) {
                    return;
                } else {
                    r3 = this.f5363a.e();
                }
            } while (r3 == this.f5364b);
            this.d = r3;
            return;
        }
        if (r32 != 2) {
            throw w92.f();
        }
        int r12 = this.f5363a.v() + this.f5363a.n();
        do {
            p92Var.U(this.f5363a.o());
        } while (this.f5363a.v() < r12);
        W(r12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.nb2
    public final <T> void B(List<T> list, ub2<T> ub2Var, y82 y82Var) throws IOException {
        int r1;
        int r0 = this.f5364b;
        if ((r0 & 7) != 3) {
            throw w92.f();
        }
        do {
            list.add(e(ub2Var, y82Var));
            if (this.f5363a.u() || this.d != 0) {
                return;
            } else {
                r1 = this.f5363a.e();
            }
        } while (r1 == r0);
        this.d = r1;
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final a82 C() throws IOException {
        f(2);
        return this.f5363a.m();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void D(List<Long> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof ka2)) {
            int r02 = this.f5364b & 7;
            if (r02 == 0) {
                do {
                    list.add(Long.valueOf(this.f5363a.s()));
                    if (this.f5363a.u()) {
                        return;
                    } else {
                        r0 = this.f5363a.e();
                    }
                } while (r0 == this.f5364b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw w92.f();
            }
            int r1 = this.f5363a.v() + this.f5363a.n();
            do {
                list.add(Long.valueOf(this.f5363a.s()));
            } while (this.f5363a.v() < r1);
            W(r1);
            return;
        }
        ka2 ka2Var = (ka2) list;
        int r52 = this.f5364b & 7;
        if (r52 == 0) {
            do {
                ka2Var.n(this.f5363a.s());
                if (this.f5363a.u()) {
                    return;
                } else {
                    r5 = this.f5363a.e();
                }
            } while (r5 == this.f5364b);
            this.d = r5;
            return;
        }
        if (r52 != 2) {
            throw w92.f();
        }
        int r12 = this.f5363a.v() + this.f5363a.n();
        do {
            ka2Var.n(this.f5363a.s());
        } while (this.f5363a.v() < r12);
        W(r12);
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void E(List<Boolean> list) throws IOException {
        int r0;
        int r3;
        if (!(list instanceof y72)) {
            int r02 = this.f5364b & 7;
            if (r02 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f5363a.k()));
                    if (this.f5363a.u()) {
                        return;
                    } else {
                        r0 = this.f5363a.e();
                    }
                } while (r0 == this.f5364b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw w92.f();
            }
            int r1 = this.f5363a.v() + this.f5363a.n();
            do {
                list.add(Boolean.valueOf(this.f5363a.k()));
            } while (this.f5363a.v() < r1);
            W(r1);
            return;
        }
        y72 y72Var = (y72) list;
        int r32 = this.f5364b & 7;
        if (r32 == 0) {
            do {
                y72Var.h(this.f5363a.k());
                if (this.f5363a.u()) {
                    return;
                } else {
                    r3 = this.f5363a.e();
                }
            } while (r3 == this.f5364b);
            this.d = r3;
            return;
        }
        if (r32 != 2) {
            throw w92.f();
        }
        int r12 = this.f5363a.v() + this.f5363a.n();
        do {
            y72Var.h(this.f5363a.k());
        } while (this.f5363a.v() < r12);
        W(r12);
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final int F() throws IOException {
        int r0 = this.d;
        if (r0 != 0) {
            this.f5364b = r0;
            this.d = 0;
        } else {
            this.f5364b = this.f5363a.e();
        }
        int r02 = this.f5364b;
        return (r02 == 0 || r02 == this.f5365c) ? ActivityChooserView.f.j : r02 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void G(List<String> list) throws IOException {
        c(list, false);
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final <T> T H(ub2<T> ub2Var, y82 y82Var) throws IOException {
        f(2);
        return (T) d(ub2Var, y82Var);
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final long I() throws IOException {
        f(0);
        return this.f5363a.f();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final int J() throws IOException {
        f(0);
        return this.f5363a.r();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void K(List<Integer> list) throws IOException {
        int r0;
        int r3;
        if (!(list instanceof p92)) {
            int r02 = this.f5364b & 7;
            if (r02 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5363a.n()));
                    if (this.f5363a.u()) {
                        return;
                    } else {
                        r0 = this.f5363a.e();
                    }
                } while (r0 == this.f5364b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw w92.f();
            }
            int r1 = this.f5363a.v() + this.f5363a.n();
            do {
                list.add(Integer.valueOf(this.f5363a.n()));
            } while (this.f5363a.v() < r1);
            W(r1);
            return;
        }
        p92 p92Var = (p92) list;
        int r32 = this.f5364b & 7;
        if (r32 == 0) {
            do {
                p92Var.U(this.f5363a.n());
                if (this.f5363a.u()) {
                    return;
                } else {
                    r3 = this.f5363a.e();
                }
            } while (r3 == this.f5364b);
            this.d = r3;
            return;
        }
        if (r32 != 2) {
            throw w92.f();
        }
        int r12 = this.f5363a.v() + this.f5363a.n();
        do {
            p92Var.U(this.f5363a.n());
        } while (this.f5363a.v() < r12);
        W(r12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.nb2
    public final <T> void L(List<T> list, ub2<T> ub2Var, y82 y82Var) throws IOException {
        int r1;
        int r0 = this.f5364b;
        if ((r0 & 7) != 2) {
            throw w92.f();
        }
        do {
            list.add(d(ub2Var, y82Var));
            if (this.f5363a.u() || this.d != 0) {
                return;
            } else {
                r1 = this.f5363a.e();
            }
        } while (r1 == r0);
        this.d = r1;
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final int M() throws IOException {
        f(5);
        return this.f5363a.j();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void N(List<Integer> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof p92)) {
            int r02 = this.f5364b & 7;
            if (r02 == 2) {
                int r03 = this.f5363a.n();
                l(r03);
                int r1 = this.f5363a.v() + r03;
                do {
                    list.add(Integer.valueOf(this.f5363a.j()));
                } while (this.f5363a.v() < r1);
                return;
            }
            if (r02 != 5) {
                throw w92.f();
            }
            do {
                list.add(Integer.valueOf(this.f5363a.j()));
                if (this.f5363a.u()) {
                    return;
                } else {
                    r0 = this.f5363a.e();
                }
            } while (r0 == this.f5364b);
            this.d = r0;
            return;
        }
        p92 p92Var = (p92) list;
        int r52 = this.f5364b & 7;
        if (r52 == 2) {
            int r53 = this.f5363a.n();
            l(r53);
            int r3 = this.f5363a.v() + r53;
            do {
                p92Var.U(this.f5363a.j());
            } while (this.f5363a.v() < r3);
            return;
        }
        if (r52 != 5) {
            throw w92.f();
        }
        do {
            p92Var.U(this.f5363a.j());
            if (this.f5363a.u()) {
                return;
            } else {
                r5 = this.f5363a.e();
            }
        } while (r5 == this.f5364b);
        this.d = r5;
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final int O() throws IOException {
        f(0);
        return this.f5363a.n();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final long P() throws IOException {
        f(0);
        return this.f5363a.s();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final long Q() throws IOException {
        f(0);
        return this.f5363a.g();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void R(List<Integer> list) throws IOException {
        int r0;
        int r3;
        if (!(list instanceof p92)) {
            int r02 = this.f5364b & 7;
            if (r02 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5363a.r()));
                    if (this.f5363a.u()) {
                        return;
                    } else {
                        r0 = this.f5363a.e();
                    }
                } while (r0 == this.f5364b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw w92.f();
            }
            int r1 = this.f5363a.v() + this.f5363a.n();
            do {
                list.add(Integer.valueOf(this.f5363a.r()));
            } while (this.f5363a.v() < r1);
            W(r1);
            return;
        }
        p92 p92Var = (p92) list;
        int r32 = this.f5364b & 7;
        if (r32 == 0) {
            do {
                p92Var.U(this.f5363a.r());
                if (this.f5363a.u()) {
                    return;
                } else {
                    r3 = this.f5363a.e();
                }
            } while (r3 == this.f5364b);
            this.d = r3;
            return;
        }
        if (r32 != 2) {
            throw w92.f();
        }
        int r12 = this.f5363a.v() + this.f5363a.n();
        do {
            p92Var.U(this.f5363a.r());
        } while (this.f5363a.v() < r12);
        W(r12);
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final <T> T S(ub2<T> ub2Var, y82 y82Var) throws IOException {
        f(3);
        return (T) e(ub2Var, y82Var);
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void T(List<a82> list) throws IOException {
        int r0;
        if ((this.f5364b & 7) != 2) {
            throw w92.f();
        }
        do {
            list.add(C());
            if (this.f5363a.u()) {
                return;
            } else {
                r0 = this.f5363a.e();
            }
        } while (r0 == this.f5364b);
        this.d = r0;
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final boolean U() throws IOException {
        f(0);
        return this.f5363a.k();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final int V() throws IOException {
        f(0);
        return this.f5363a.o();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void g(List<Double> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof w82)) {
            int r02 = this.f5364b & 7;
            if (r02 == 1) {
                do {
                    list.add(Double.valueOf(this.f5363a.a()));
                    if (this.f5363a.u()) {
                        return;
                    } else {
                        r0 = this.f5363a.e();
                    }
                } while (r0 == this.f5364b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw w92.f();
            }
            int r03 = this.f5363a.n();
            j(r03);
            int r1 = this.f5363a.v() + r03;
            do {
                list.add(Double.valueOf(this.f5363a.a()));
            } while (this.f5363a.v() < r1);
            return;
        }
        w82 w82Var = (w82) list;
        int r52 = this.f5364b & 7;
        if (r52 == 1) {
            do {
                w82Var.h(this.f5363a.a());
                if (this.f5363a.u()) {
                    return;
                } else {
                    r5 = this.f5363a.e();
                }
            } while (r5 == this.f5364b);
            this.d = r5;
            return;
        }
        if (r52 != 2) {
            throw w92.f();
        }
        int r53 = this.f5363a.n();
        j(r53);
        int r12 = this.f5363a.v() + r53;
        do {
            w82Var.h(this.f5363a.a());
        } while (this.f5363a.v() < r12);
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void h(List<Integer> list) throws IOException {
        int r0;
        int r3;
        if (!(list instanceof p92)) {
            int r02 = this.f5364b & 7;
            if (r02 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5363a.h()));
                    if (this.f5363a.u()) {
                        return;
                    } else {
                        r0 = this.f5363a.e();
                    }
                } while (r0 == this.f5364b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw w92.f();
            }
            int r1 = this.f5363a.v() + this.f5363a.n();
            do {
                list.add(Integer.valueOf(this.f5363a.h()));
            } while (this.f5363a.v() < r1);
            W(r1);
            return;
        }
        p92 p92Var = (p92) list;
        int r32 = this.f5364b & 7;
        if (r32 == 0) {
            do {
                p92Var.U(this.f5363a.h());
                if (this.f5363a.u()) {
                    return;
                } else {
                    r3 = this.f5363a.e();
                }
            } while (r3 == this.f5364b);
            this.d = r3;
            return;
        }
        if (r32 != 2) {
            throw w92.f();
        }
        int r12 = this.f5363a.v() + this.f5363a.n();
        do {
            p92Var.U(this.f5363a.h());
        } while (this.f5363a.v() < r12);
        W(r12);
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void i(List<Long> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof ka2)) {
            int r02 = this.f5364b & 7;
            if (r02 == 0) {
                do {
                    list.add(Long.valueOf(this.f5363a.g()));
                    if (this.f5363a.u()) {
                        return;
                    } else {
                        r0 = this.f5363a.e();
                    }
                } while (r0 == this.f5364b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw w92.f();
            }
            int r1 = this.f5363a.v() + this.f5363a.n();
            do {
                list.add(Long.valueOf(this.f5363a.g()));
            } while (this.f5363a.v() < r1);
            W(r1);
            return;
        }
        ka2 ka2Var = (ka2) list;
        int r52 = this.f5364b & 7;
        if (r52 == 0) {
            do {
                ka2Var.n(this.f5363a.g());
                if (this.f5363a.u()) {
                    return;
                } else {
                    r5 = this.f5363a.e();
                }
            } while (r5 == this.f5364b);
            this.d = r5;
            return;
        }
        if (r52 != 2) {
            throw w92.f();
        }
        int r12 = this.f5363a.v() + this.f5363a.n();
        do {
            ka2Var.n(this.f5363a.g());
        } while (this.f5363a.v() < r12);
        W(r12);
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void k(List<Long> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof ka2)) {
            int r02 = this.f5364b & 7;
            if (r02 == 0) {
                do {
                    list.add(Long.valueOf(this.f5363a.f()));
                    if (this.f5363a.u()) {
                        return;
                    } else {
                        r0 = this.f5363a.e();
                    }
                } while (r0 == this.f5364b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw w92.f();
            }
            int r1 = this.f5363a.v() + this.f5363a.n();
            do {
                list.add(Long.valueOf(this.f5363a.f()));
            } while (this.f5363a.v() < r1);
            W(r1);
            return;
        }
        ka2 ka2Var = (ka2) list;
        int r52 = this.f5364b & 7;
        if (r52 == 0) {
            do {
                ka2Var.n(this.f5363a.f());
                if (this.f5363a.u()) {
                    return;
                } else {
                    r5 = this.f5363a.e();
                }
            } while (r5 == this.f5364b);
            this.d = r5;
            return;
        }
        if (r52 != 2) {
            throw w92.f();
        }
        int r12 = this.f5363a.v() + this.f5363a.n();
        do {
            ka2Var.n(this.f5363a.f());
        } while (this.f5363a.v() < r12);
        W(r12);
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void m(List<Float> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof k92)) {
            int r02 = this.f5364b & 7;
            if (r02 == 2) {
                int r03 = this.f5363a.n();
                l(r03);
                int r1 = this.f5363a.v() + r03;
                do {
                    list.add(Float.valueOf(this.f5363a.b()));
                } while (this.f5363a.v() < r1);
                return;
            }
            if (r02 != 5) {
                throw w92.f();
            }
            do {
                list.add(Float.valueOf(this.f5363a.b()));
                if (this.f5363a.u()) {
                    return;
                } else {
                    r0 = this.f5363a.e();
                }
            } while (r0 == this.f5364b);
            this.d = r0;
            return;
        }
        k92 k92Var = (k92) list;
        int r52 = this.f5364b & 7;
        if (r52 == 2) {
            int r53 = this.f5363a.n();
            l(r53);
            int r3 = this.f5363a.v() + r53;
            do {
                k92Var.j(this.f5363a.b());
            } while (this.f5363a.v() < r3);
            return;
        }
        if (r52 != 5) {
            throw w92.f();
        }
        do {
            k92Var.j(this.f5363a.b());
            if (this.f5363a.u()) {
                return;
            } else {
                r5 = this.f5363a.e();
            }
        } while (r5 == this.f5364b);
        this.d = r5;
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void n(List<Long> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof ka2)) {
            int r02 = this.f5364b & 7;
            if (r02 == 1) {
                do {
                    list.add(Long.valueOf(this.f5363a.i()));
                    if (this.f5363a.u()) {
                        return;
                    } else {
                        r0 = this.f5363a.e();
                    }
                } while (r0 == this.f5364b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw w92.f();
            }
            int r03 = this.f5363a.n();
            j(r03);
            int r1 = this.f5363a.v() + r03;
            do {
                list.add(Long.valueOf(this.f5363a.i()));
            } while (this.f5363a.v() < r1);
            return;
        }
        ka2 ka2Var = (ka2) list;
        int r52 = this.f5364b & 7;
        if (r52 == 1) {
            do {
                ka2Var.n(this.f5363a.i());
                if (this.f5363a.u()) {
                    return;
                } else {
                    r5 = this.f5363a.e();
                }
            } while (r5 == this.f5364b);
            this.d = r5;
            return;
        }
        if (r52 != 2) {
            throw w92.f();
        }
        int r53 = this.f5363a.n();
        j(r53);
        int r12 = this.f5363a.v() + r53;
        do {
            ka2Var.n(this.f5363a.i());
        } while (this.f5363a.v() < r12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.nb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <K, V> void o(java.util.Map<K, V> r8, com.google.android.gms.internal.ads.sa2<K, V> r9, com.google.android.gms.internal.ads.y82 r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.f(r0)
            com.google.android.gms.internal.ads.m82 r1 = r7.f5363a
            int r1 = r1.n()
            com.google.android.gms.internal.ads.m82 r2 = r7.f5363a
            int r1 = r2.z(r1)
            K r2 = r9.f5238b
            V r3 = r9.d
        L14:
            int r4 = r7.F()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            com.google.android.gms.internal.ads.m82 r5 = r7.f5363a     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.u()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.v()     // Catch: com.google.android.gms.internal.ads.z92 -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.ads.w92 r4 = new com.google.android.gms.internal.ads.w92     // Catch: com.google.android.gms.internal.ads.z92 -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.ads.z92 -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.android.gms.internal.ads.z92 -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.ads.ed2 r4 = r9.f5239c     // Catch: com.google.android.gms.internal.ads.z92 -> L4e java.lang.Throwable -> L64
            V r5 = r9.d     // Catch: com.google.android.gms.internal.ads.z92 -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.android.gms.internal.ads.z92 -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.b(r4, r5, r10)     // Catch: com.google.android.gms.internal.ads.z92 -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.ads.ed2 r4 = r9.f5237a     // Catch: com.google.android.gms.internal.ads.z92 -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.b(r4, r5, r5)     // Catch: com.google.android.gms.internal.ads.z92 -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.v()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.ads.w92 r8 = new com.google.android.gms.internal.ads.w92     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.ads.m82 r8 = r7.f5363a
            r8.A(r1)
            return
        L64:
            r8 = move-exception
            com.google.android.gms.internal.ads.m82 r9 = r7.f5363a
            r9.A(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t82.o(java.util.Map, com.google.android.gms.internal.ads.sa2, com.google.android.gms.internal.ads.y82):void");
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final int p() throws IOException {
        f(5);
        return this.f5363a.p();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final int q() throws IOException {
        f(0);
        return this.f5363a.h();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void r(List<Long> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof ka2)) {
            int r02 = this.f5364b & 7;
            if (r02 == 1) {
                do {
                    list.add(Long.valueOf(this.f5363a.q()));
                    if (this.f5363a.u()) {
                        return;
                    } else {
                        r0 = this.f5363a.e();
                    }
                } while (r0 == this.f5364b);
                this.d = r0;
                return;
            }
            if (r02 != 2) {
                throw w92.f();
            }
            int r03 = this.f5363a.n();
            j(r03);
            int r1 = this.f5363a.v() + r03;
            do {
                list.add(Long.valueOf(this.f5363a.q()));
            } while (this.f5363a.v() < r1);
            return;
        }
        ka2 ka2Var = (ka2) list;
        int r52 = this.f5364b & 7;
        if (r52 == 1) {
            do {
                ka2Var.n(this.f5363a.q());
                if (this.f5363a.u()) {
                    return;
                } else {
                    r5 = this.f5363a.e();
                }
            } while (r5 == this.f5364b);
            this.d = r5;
            return;
        }
        if (r52 != 2) {
            throw w92.f();
        }
        int r53 = this.f5363a.n();
        j(r53);
        int r12 = this.f5363a.v() + r53;
        do {
            ka2Var.n(this.f5363a.q());
        } while (this.f5363a.v() < r12);
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final double readDouble() throws IOException {
        f(1);
        return this.f5363a.a();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final float readFloat() throws IOException {
        f(5);
        return this.f5363a.b();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final int s() {
        return this.f5364b;
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final String t() throws IOException {
        f(2);
        return this.f5363a.l();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void u(List<String> list) throws IOException {
        c(list, true);
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final boolean v() throws IOException {
        int r0;
        if (this.f5363a.u() || (r0 = this.f5364b) == this.f5365c) {
            return false;
        }
        return this.f5363a.y(r0);
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final long w() throws IOException {
        f(1);
        return this.f5363a.i();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final void x(List<Integer> list) throws IOException {
        int r0;
        int r5;
        if (!(list instanceof p92)) {
            int r02 = this.f5364b & 7;
            if (r02 == 2) {
                int r03 = this.f5363a.n();
                l(r03);
                int r1 = this.f5363a.v() + r03;
                do {
                    list.add(Integer.valueOf(this.f5363a.p()));
                } while (this.f5363a.v() < r1);
                return;
            }
            if (r02 != 5) {
                throw w92.f();
            }
            do {
                list.add(Integer.valueOf(this.f5363a.p()));
                if (this.f5363a.u()) {
                    return;
                } else {
                    r0 = this.f5363a.e();
                }
            } while (r0 == this.f5364b);
            this.d = r0;
            return;
        }
        p92 p92Var = (p92) list;
        int r52 = this.f5364b & 7;
        if (r52 == 2) {
            int r53 = this.f5363a.n();
            l(r53);
            int r3 = this.f5363a.v() + r53;
            do {
                p92Var.U(this.f5363a.p());
            } while (this.f5363a.v() < r3);
            return;
        }
        if (r52 != 5) {
            throw w92.f();
        }
        do {
            p92Var.U(this.f5363a.p());
            if (this.f5363a.u()) {
                return;
            } else {
                r5 = this.f5363a.e();
            }
        } while (r5 == this.f5364b);
        this.d = r5;
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final long y() throws IOException {
        f(1);
        return this.f5363a.q();
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final String z() throws IOException {
        f(2);
        return this.f5363a.c();
    }
}
