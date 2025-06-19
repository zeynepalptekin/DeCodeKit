package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class x82 implements kd2 {

    /* renamed from: a, reason: collision with root package name */
    private final v82 f5949a;

    private x82(v82 v82Var) {
        v82 v82Var2 = (v82) o92.d(v82Var, "output");
        this.f5949a = v82Var2;
        v82Var2.f5649a = this;
    }

    public static x82 a(v82 v82Var) {
        x82 x82Var = v82Var.f5649a;
        return x82Var != null ? x82Var : new x82(v82Var);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void A(int r2, float f) throws IOException {
        this.f5949a.f(r2, f);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void B(int r2, Object obj) throws IOException {
        if (obj instanceof a82) {
            this.f5949a.B(r2, (a82) obj);
        } else {
            this.f5949a.h(r2, (xa2) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void C(int r2, long j) throws IOException {
        this.f5949a.x0(r2, j);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void D(int r2, double d) throws IOException {
        this.f5949a.A(r2, d);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final <K, V> void E(int r5, sa2<K, V> sa2Var, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f5949a.b(r5, 2);
            this.f5949a.b0(pa2.a(sa2Var, entry.getKey(), entry.getValue()));
            pa2.b(this.f5949a, sa2Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void F(int r2, int r3) throws IOException {
        this.f5949a.n(r2, r3);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void G(int r2, String str) throws IOException {
        this.f5949a.v0(r2, str);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final int H() {
        return l92.e.l;
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void I(int r3, Object obj, ub2 ub2Var) throws IOException {
        v82 v82Var = this.f5949a;
        v82Var.b(r3, 3);
        ub2Var.j((xa2) obj, v82Var.f5649a);
        v82Var.b(r3, 4);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void J(int r2, int r3) throws IOException {
        this.f5949a.k(r2, r3);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void K(int r3) throws IOException {
        this.f5949a.b(r3, 4);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void L(int r3, List<?> list, ub2 ub2Var) throws IOException {
        for (int r0 = 0; r0 < list.size(); r0++) {
            R(r3, list.get(r0), ub2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void M(int r2, long j) throws IOException {
        this.f5949a.o0(r2, j);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void N(int r2, int r3) throws IOException {
        this.f5949a.n(r2, r3);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void O(int r2, a82 a82Var) throws IOException {
        this.f5949a.g(r2, a82Var);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void P(int r3, List<?> list, ub2 ub2Var) throws IOException {
        for (int r0 = 0; r0 < list.size(); r0++) {
            I(r3, list.get(r0), ub2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void Q(int r2, long j) throws IOException {
        this.f5949a.o0(r2, j);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void R(int r2, Object obj, ub2 ub2Var) throws IOException {
        this.f5949a.i(r2, (xa2) obj, ub2Var);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void S(int r2, int r3) throws IOException {
        this.f5949a.l(r2, r3);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void T(int r2, long j) throws IOException {
        this.f5949a.x0(r2, j);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void U(int r2, boolean z) throws IOException {
        this.f5949a.p0(r2, z);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void V(int r3) throws IOException {
        this.f5949a.b(r3, 3);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void W(int r2, int r3) throws IOException {
        this.f5949a.k(r2, r3);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void X(int r2, long j) throws IOException {
        this.f5949a.u0(r2, j);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void Y(int r2, int r3) throws IOException {
        this.f5949a.m(r2, r3);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void b(int r4, List<Long> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f5949a.x0(r4, list.get(r0).longValue());
                r0++;
            }
            return;
        }
        this.f5949a.b(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += v82.V(list.get(r42).longValue());
        }
        this.f5949a.b0(r6);
        while (r0 < list.size()) {
            this.f5949a.R(list.get(r0).longValue());
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void c(int r3, List<Boolean> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f5949a.p0(r3, list.get(r0).booleanValue());
                r0++;
            }
            return;
        }
        this.f5949a.b(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += v82.G(list.get(r32).booleanValue());
        }
        this.f5949a.b0(r5);
        while (r0 < list.size()) {
            this.f5949a.F(list.get(r0).booleanValue());
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void d(int r4, List<Long> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f5949a.u0(r4, list.get(r0).longValue());
                r0++;
            }
            return;
        }
        this.f5949a.b(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += v82.U(list.get(r42).longValue());
        }
        this.f5949a.b0(r6);
        while (r0 < list.size()) {
            this.f5949a.Q(list.get(r0).longValue());
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void f(int r3, List<Integer> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f5949a.k(r3, list.get(r0).intValue());
                r0++;
            }
            return;
        }
        this.f5949a.b(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += v82.f0(list.get(r32).intValue());
        }
        this.f5949a.b0(r5);
        while (r0 < list.size()) {
            this.f5949a.a0(list.get(r0).intValue());
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void h(int r4, List<Long> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f5949a.o0(r4, list.get(r0).longValue());
                r0++;
            }
            return;
        }
        this.f5949a.b(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += v82.T(list.get(r42).longValue());
        }
        this.f5949a.b0(r6);
        while (r0 < list.size()) {
            this.f5949a.P(list.get(r0).longValue());
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void i(int r3, List<Integer> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f5949a.k(r3, list.get(r0).intValue());
                r0++;
            }
            return;
        }
        this.f5949a.b(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += v82.k0(list.get(r32).intValue());
        }
        this.f5949a.b0(r5);
        while (r0 < list.size()) {
            this.f5949a.a0(list.get(r0).intValue());
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void j(int r3, List<Integer> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f5949a.m(r3, list.get(r0).intValue());
                r0++;
            }
            return;
        }
        this.f5949a.b(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += v82.h0(list.get(r32).intValue());
        }
        this.f5949a.b0(r5);
        while (r0 < list.size()) {
            this.f5949a.c0(list.get(r0).intValue());
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void n(int r4, List<Long> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f5949a.o0(r4, list.get(r0).longValue());
                r0++;
            }
            return;
        }
        this.f5949a.b(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += v82.S(list.get(r42).longValue());
        }
        this.f5949a.b0(r6);
        while (r0 < list.size()) {
            this.f5949a.P(list.get(r0).longValue());
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void o(int r4, List<Double> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f5949a.A(r4, list.get(r0).doubleValue());
                r0++;
            }
            return;
        }
        this.f5949a.b(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += v82.L(list.get(r42).doubleValue());
        }
        this.f5949a.b0(r6);
        while (r0 < list.size()) {
            this.f5949a.K(list.get(r0).doubleValue());
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void p(int r4, List<a82> list) throws IOException {
        for (int r0 = 0; r0 < list.size(); r0++) {
            this.f5949a.g(r4, list.get(r0));
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void q(int r4, List<Long> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f5949a.x0(r4, list.get(r0).longValue());
                r0++;
            }
            return;
        }
        this.f5949a.b(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += v82.W(list.get(r42).longValue());
        }
        this.f5949a.b0(r6);
        while (r0 < list.size()) {
            this.f5949a.R(list.get(r0).longValue());
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void r(int r3, List<Integer> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f5949a.n(r3, list.get(r0).intValue());
                r0++;
            }
            return;
        }
        this.f5949a.b(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += v82.i0(list.get(r32).intValue());
        }
        this.f5949a.b0(r5);
        while (r0 < list.size()) {
            this.f5949a.d0(list.get(r0).intValue());
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void s(int r3, List<Float> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f5949a.f(r3, list.get(r0).floatValue());
                r0++;
            }
            return;
        }
        this.f5949a.b(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += v82.Y(list.get(r32).floatValue());
        }
        this.f5949a.b0(r5);
        while (r0 < list.size()) {
            this.f5949a.O(list.get(r0).floatValue());
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void u(int r3, List<Integer> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f5949a.l(r3, list.get(r0).intValue());
                r0++;
            }
            return;
        }
        this.f5949a.b(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += v82.g0(list.get(r32).intValue());
        }
        this.f5949a.b0(r5);
        while (r0 < list.size()) {
            this.f5949a.b0(list.get(r0).intValue());
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void v(int r3, List<Integer> list, boolean z) throws IOException {
        int r0 = 0;
        if (!z) {
            while (r0 < list.size()) {
                this.f5949a.n(r3, list.get(r0).intValue());
                r0++;
            }
            return;
        }
        this.f5949a.b(r3, 2);
        int r5 = 0;
        for (int r32 = 0; r32 < list.size(); r32++) {
            r5 += v82.j0(list.get(r32).intValue());
        }
        this.f5949a.b0(r5);
        while (r0 < list.size()) {
            this.f5949a.d0(list.get(r0).intValue());
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void x(int r5, List<String> list) throws IOException {
        int r1 = 0;
        if (!(list instanceof ha2)) {
            while (r1 < list.size()) {
                this.f5949a.v0(r5, list.get(r1));
                r1++;
            }
            return;
        }
        ha2 ha2Var = (ha2) list;
        while (r1 < list.size()) {
            Object objZ = ha2Var.z(r1);
            if (objZ instanceof String) {
                this.f5949a.v0(r5, (String) objZ);
            } else {
                this.f5949a.g(r5, (a82) objZ);
            }
            r1++;
        }
    }
}
