package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class oc2 extends mc2<qc2, qc2> {
    oc2() {
    }

    private static void t(Object obj, qc2 qc2Var) {
        ((l92) obj).zzijc = qc2Var;
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ void a(qc2 qc2Var, int r2, long j) {
        qc2Var.k(r2 << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ void b(qc2 qc2Var, int r2, a82 a82Var) {
        qc2Var.k((r2 << 3) | 2, a82Var);
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ void c(qc2 qc2Var, int r2, qc2 qc2Var2) {
        qc2Var.k((r2 << 3) | 3, qc2Var2);
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ void d(qc2 qc2Var, kd2 kd2Var) throws IOException {
        qc2Var.e(kd2Var);
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final boolean e(nb2 nb2Var) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final void g(Object obj) {
        ((l92) obj).zzijc.f();
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ qc2 h(qc2 qc2Var) {
        qc2 qc2Var2 = qc2Var;
        qc2Var2.f();
        return qc2Var2;
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ int i(qc2 qc2Var) {
        return qc2Var.g();
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ qc2 j(Object obj) {
        return ((l92) obj).zzijc;
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ qc2 k(Object obj) {
        qc2 qc2Var = ((l92) obj).zzijc;
        if (qc2Var != qc2.h()) {
            return qc2Var;
        }
        qc2 qc2VarI = qc2.i();
        t(obj, qc2VarI);
        return qc2VarI;
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ int l(qc2 qc2Var) {
        return qc2Var.j();
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ void m(qc2 qc2Var, int r2, long j) {
        qc2Var.k((r2 << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ qc2 n() {
        return qc2.i();
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ void o(qc2 qc2Var, int r2, int r3) {
        qc2Var.k((r2 << 3) | 5, Integer.valueOf(r3));
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ void p(qc2 qc2Var, kd2 kd2Var) throws IOException {
        qc2Var.b(kd2Var);
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ void q(Object obj, qc2 qc2Var) {
        t(obj, qc2Var);
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ void r(Object obj, qc2 qc2Var) {
        t(obj, qc2Var);
    }

    @Override // com.google.android.gms.internal.ads.mc2
    final /* synthetic */ qc2 s(qc2 qc2Var, qc2 qc2Var2) {
        qc2 qc2Var3 = qc2Var;
        qc2 qc2Var4 = qc2Var2;
        return qc2Var4.equals(qc2.h()) ? qc2Var3 : qc2.a(qc2Var3, qc2Var4);
    }
}
