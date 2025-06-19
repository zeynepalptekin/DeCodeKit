package c.a.b.b.g.c;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class r6 implements ab {

    /* renamed from: a, reason: collision with root package name */
    private final o6 f1807a;

    private r6(o6 o6Var) {
        o6 o6Var2 = (o6) l7.f(o6Var, "output");
        this.f1807a = o6Var2;
        o6Var2.f1784a = this;
    }

    public static r6 P(o6 o6Var) {
        r6 r6Var = o6Var.f1784a;
        return r6Var != null ? r6Var : new r6(o6Var);
    }

    @Override // c.a.b.b.g.c.ab
    public final void A(int r2, float f) throws IOException {
        this.f1807a.l(r2, f);
    }

    @Override // c.a.b.b.g.c.ab
    public final void B(int r3, Object obj, j9 j9Var) throws IOException {
        o6 o6Var = this.f1807a;
        o6Var.m(r3, 3);
        j9Var.h((r8) obj, o6Var.f1784a);
        o6Var.m(r3, 4);
    }

    @Override // c.a.b.b.g.c.ab
    public final void C(int r2, boolean z) throws IOException {
        this.f1807a.s(r2, z);
    }

    @Override // c.a.b.b.g.c.ab
    public final void D(int r2, y5 y5Var) throws IOException {
        this.f1807a.o(r2, y5Var);
    }

    @Override // c.a.b.b.g.c.ab
    public final void E(int r2, int r3) throws IOException {
        this.f1807a.g0(r2, r3);
    }

    @Override // c.a.b.b.g.c.ab
    public final void F(int r2, long j) throws IOException {
        this.f1807a.Z(r2, j);
    }

    @Override // c.a.b.b.g.c.ab
    public final void G(int r2, int r3) throws IOException {
        this.f1807a.P(r2, r3);
    }

    @Override // c.a.b.b.g.c.ab
    public final void H(int r3, List<?> list, j9 j9Var) throws IOException {
        for (int r0 = 0; r0 < list.size(); r0++) {
            B(r3, list.get(r0), j9Var);
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final <K, V> void I(int r5, m8<K, V> m8Var, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f1807a.m(r5, 2);
            this.f1807a.O(i8.a(m8Var, entry.getKey(), entry.getValue()));
            i8.b(this.f1807a, m8Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void J(int r3, List<?> list, j9 j9Var) throws IOException {
        for (int r0 = 0; r0 < list.size(); r0++) {
            M(r3, list.get(r0), j9Var);
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void K(int r2, int r3) throws IOException {
        this.f1807a.k0(r2, r3);
    }

    @Override // c.a.b.b.g.c.ab
    public final void L(int r2, long j) throws IOException {
        this.f1807a.Z(r2, j);
    }

    @Override // c.a.b.b.g.c.ab
    public final void M(int r2, Object obj, j9 j9Var) throws IOException {
        this.f1807a.q(r2, (r8) obj, j9Var);
    }

    @Override // c.a.b.b.g.c.ab
    public final void N(int r2, int r3) throws IOException {
        this.f1807a.Y(r2, r3);
    }

    @Override // c.a.b.b.g.c.ab
    public final void O(int r2, long j) throws IOException {
        this.f1807a.n(r2, j);
    }

    @Override // c.a.b.b.g.c.ab
    public final int a() {
        return za.f1879a;
    }

    @Override // c.a.b.b.g.c.ab
    public final void b(int r4, List<Long> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f1807a.Z(r4, list.get(r0).longValue());
                r0++;
            }
            return;
        }
        this.f1807a.m(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += o6.s0(list.get(r42).longValue());
        }
        this.f1807a.O(r6);
        while (r0 < list.size()) {
            this.f1807a.a0(list.get(r0).longValue());
            r0++;
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void c(int r3, List<Boolean> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f1807a.s(r3, list.get(r0).booleanValue());
                r0++;
            }
            return;
        }
        this.f1807a.m(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += o6.L(list.get(r32).booleanValue());
        }
        this.f1807a.O(r5);
        while (r0 < list.size()) {
            this.f1807a.y(list.get(r0).booleanValue());
            r0++;
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void d(int r4, List<Long> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f1807a.Q(r4, list.get(r0).longValue());
                r0++;
            }
            return;
        }
        this.f1807a.m(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += o6.o0(list.get(r42).longValue());
        }
        this.f1807a.O(r6);
        while (r0 < list.size()) {
            this.f1807a.S(list.get(r0).longValue());
            r0++;
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void e(int r3) throws IOException {
        this.f1807a.m(r3, 3);
    }

    @Override // c.a.b.b.g.c.ab
    public final void f(int r3, List<Integer> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f1807a.P(r3, list.get(r0).intValue());
                r0++;
            }
            return;
        }
        this.f1807a.m(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += o6.l0(list.get(r32).intValue());
        }
        this.f1807a.O(r5);
        while (r0 < list.size()) {
            this.f1807a.j(list.get(r0).intValue());
            r0++;
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void g(int r3) throws IOException {
        this.f1807a.m(r3, 4);
    }

    @Override // c.a.b.b.g.c.ab
    public final void h(int r4, List<Long> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f1807a.n(r4, list.get(r0).longValue());
                r0++;
            }
            return;
        }
        this.f1807a.m(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += o6.j0(list.get(r42).longValue());
        }
        this.f1807a.O(r6);
        while (r0 < list.size()) {
            this.f1807a.t(list.get(r0).longValue());
            r0++;
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void i(int r3, List<Integer> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f1807a.P(r3, list.get(r0).intValue());
                r0++;
            }
            return;
        }
        this.f1807a.m(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += o6.C0(list.get(r32).intValue());
        }
        this.f1807a.O(r5);
        while (r0 < list.size()) {
            this.f1807a.j(list.get(r0).intValue());
            r0++;
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void j(int r3, List<Integer> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f1807a.g0(r3, list.get(r0).intValue());
                r0++;
            }
            return;
        }
        this.f1807a.m(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += o6.t0(list.get(r32).intValue());
        }
        this.f1807a.O(r5);
        while (r0 < list.size()) {
            this.f1807a.X(list.get(r0).intValue());
            r0++;
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void k(int r2, int r3) throws IOException {
        this.f1807a.P(r2, r3);
    }

    @Override // c.a.b.b.g.c.ab
    public final void l(int r2, long j) throws IOException {
        this.f1807a.n(r2, j);
    }

    @Override // c.a.b.b.g.c.ab
    public final void m(int r2, Object obj) throws IOException {
        if (obj instanceof y5) {
            this.f1807a.R(r2, (y5) obj);
        } else {
            this.f1807a.p(r2, (r8) obj);
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void n(int r4, List<Long> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f1807a.n(r4, list.get(r0).longValue());
                r0++;
            }
            return;
        }
        this.f1807a.m(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += o6.e0(list.get(r42).longValue());
        }
        this.f1807a.O(r6);
        while (r0 < list.size()) {
            this.f1807a.t(list.get(r0).longValue());
            r0++;
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void o(int r4, List<Double> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f1807a.k(r4, list.get(r0).doubleValue());
                r0++;
            }
            return;
        }
        this.f1807a.m(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += o6.z(list.get(r42).doubleValue());
        }
        this.f1807a.O(r6);
        while (r0 < list.size()) {
            this.f1807a.h(list.get(r0).doubleValue());
            r0++;
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void p(int r4, List<y5> list) throws IOException {
        for (int r0 = 0; r0 < list.size(); r0++) {
            this.f1807a.o(r4, list.get(r0));
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void q(int r4, List<Long> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f1807a.Z(r4, list.get(r0).longValue());
                r0++;
            }
            return;
        }
        this.f1807a.m(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += o6.w0(list.get(r42).longValue());
        }
        this.f1807a.O(r6);
        while (r0 < list.size()) {
            this.f1807a.a0(list.get(r0).longValue());
            r0++;
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void r(int r3, List<Integer> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f1807a.k0(r3, list.get(r0).intValue());
                r0++;
            }
            return;
        }
        this.f1807a.m(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += o6.x0(list.get(r32).intValue());
        }
        this.f1807a.O(r5);
        while (r0 < list.size()) {
            this.f1807a.f0(list.get(r0).intValue());
            r0++;
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void s(int r3, List<Float> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f1807a.l(r3, list.get(r0).floatValue());
                r0++;
            }
            return;
        }
        this.f1807a.m(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += o6.A(list.get(r32).floatValue());
        }
        this.f1807a.O(r5);
        while (r0 < list.size()) {
            this.f1807a.i(list.get(r0).floatValue());
            r0++;
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void t(int r2, String str) throws IOException {
        this.f1807a.r(r2, str);
    }

    @Override // c.a.b.b.g.c.ab
    public final void u(int r3, List<Integer> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f1807a.Y(r3, list.get(r0).intValue());
                r0++;
            }
            return;
        }
        this.f1807a.m(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += o6.p0(list.get(r32).intValue());
        }
        this.f1807a.O(r5);
        while (r0 < list.size()) {
            this.f1807a.O(list.get(r0).intValue());
            r0++;
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void v(int r3, List<Integer> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f1807a.k0(r3, list.get(r0).intValue());
                r0++;
            }
            return;
        }
        this.f1807a.m(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += o6.A0(list.get(r32).intValue());
        }
        this.f1807a.O(r5);
        while (r0 < list.size()) {
            this.f1807a.f0(list.get(r0).intValue());
            r0++;
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void w(int r2, long j) throws IOException {
        this.f1807a.Q(r2, j);
    }

    @Override // c.a.b.b.g.c.ab
    public final void x(int r5, List<String> list) throws IOException {
        int r1 = 0;
        if (!(list instanceof b8)) {
            while (r1 < list.size()) {
                this.f1807a.r(r5, list.get(r1));
                r1++;
            }
            return;
        }
        b8 b8Var = (b8) list;
        while (r1 < list.size()) {
            Object objG = b8Var.g(r1);
            if (objG instanceof String) {
                this.f1807a.r(r5, (String) objG);
            } else {
                this.f1807a.o(r5, (y5) objG);
            }
            r1++;
        }
    }

    @Override // c.a.b.b.g.c.ab
    public final void y(int r2, int r3) throws IOException {
        this.f1807a.k0(r2, r3);
    }

    @Override // c.a.b.b.g.c.ab
    public final void z(int r2, double d) throws IOException {
        this.f1807a.k(r2, d);
    }
}
