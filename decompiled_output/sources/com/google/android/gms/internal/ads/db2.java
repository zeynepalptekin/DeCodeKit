package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class db2<T> implements ub2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final xa2 f3107a;

    /* renamed from: b, reason: collision with root package name */
    private final mc2<?, ?> f3108b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3109c;
    private final a92<?> d;

    private db2(mc2<?, ?> mc2Var, a92<?> a92Var, xa2 xa2Var) {
        this.f3108b = mc2Var;
        this.f3109c = a92Var.j(xa2Var);
        this.d = a92Var;
        this.f3107a = xa2Var;
    }

    static <T> db2<T> k(mc2<?, ?> mc2Var, a92<?> a92Var, xa2 xa2Var) {
        return new db2<>(mc2Var, a92Var, xa2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099 A[EDGE_INSN: B:56:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:61:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.ub2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.ads.v72 r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.ads.l92 r0 = (com.google.android.gms.internal.ads.l92) r0
            com.google.android.gms.internal.ads.qc2 r1 = r0.zzijc
            com.google.android.gms.internal.ads.qc2 r2 = com.google.android.gms.internal.ads.qc2.h()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.ads.qc2 r1 = com.google.android.gms.internal.ads.qc2.i()
            r0.zzijc = r1
        L11:
            com.google.android.gms.internal.ads.l92$d r10 = (com.google.android.gms.internal.ads.l92.d) r10
            r10.H()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.ads.w72.h(r11, r12, r14)
            int r2 = r14.f5640a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.ads.a92<?> r12 = r9.d
            com.google.android.gms.internal.ads.y82 r0 = r14.d
            com.google.android.gms.internal.ads.xa2 r3 = r9.f3107a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.b(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.ads.l92$f r0 = (com.google.android.gms.internal.ads.l92.f) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.ads.w72.c(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.ads.mb2.b()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.ads.w72.a(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.ads.w72.h(r11, r4, r14)
            int r5 = r14.f5640a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.ads.w72.m(r11, r4, r14)
            java.lang.Object r2 = r14.f5642c
            com.google.android.gms.internal.ads.a82 r2 = (com.google.android.gms.internal.ads.a82) r2
            goto L53
        L72:
            com.google.android.gms.internal.ads.mb2.b()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.ads.w72.h(r11, r4, r14)
            int r12 = r14.f5640a
            com.google.android.gms.internal.ads.a92<?> r0 = r9.d
            com.google.android.gms.internal.ads.y82 r5 = r14.d
            com.google.android.gms.internal.ads.xa2 r6 = r9.f3107a
            java.lang.Object r0 = r0.b(r5, r6, r12)
            com.google.android.gms.internal.ads.l92$f r0 = (com.google.android.gms.internal.ads.l92.f) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.ads.w72.a(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.k(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.ads.w92 r10 = com.google.android.gms.internal.ads.w92.h()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.db2.a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.v72):void");
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final void b(T t, T t2) {
        wb2.h(this.f3108b, t, t2);
        if (this.f3109c) {
            wb2.f(this.d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final void c(T t) {
        this.f3108b.g(t);
        this.d.i(t);
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final int d(T t) {
        mc2<?, ?> mc2Var = this.f3108b;
        int r0 = mc2Var.l(mc2Var.j(t)) + 0;
        return this.f3109c ? r0 + this.d.g(t).q() : r0;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[LOOP:0: B:45:0x000c->B:53:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.ub2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(T r11, com.google.android.gms.internal.ads.nb2 r12, com.google.android.gms.internal.ads.y82 r13) throws java.io.IOException {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.mc2<?, ?> r0 = r10.f3108b
            com.google.android.gms.internal.ads.a92<?> r1 = r10.d
            java.lang.Object r2 = r0.k(r11)
            com.google.android.gms.internal.ads.e92 r3 = r1.h(r11)
        Lc:
            int r4 = r12.F()     // Catch: java.lang.Throwable -> L8e
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L19
            r0.r(r11, r2)
            return
        L19:
            int r4 = r12.s()     // Catch: java.lang.Throwable -> L8e
            r6 = 11
            if (r4 == r6) goto L3e
            r5 = r4 & 7
            r6 = 2
            if (r5 != r6) goto L39
            com.google.android.gms.internal.ads.xa2 r5 = r10.f3107a     // Catch: java.lang.Throwable -> L8e
            int r4 = r4 >>> 3
            java.lang.Object r4 = r1.b(r13, r5, r4)     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L34
            r1.e(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L8e
            goto L82
        L34:
            boolean r4 = r0.f(r2, r12)     // Catch: java.lang.Throwable -> L8e
            goto L83
        L39:
            boolean r4 = r12.v()     // Catch: java.lang.Throwable -> L8e
            goto L83
        L3e:
            r4 = 0
            r6 = 0
            r7 = r6
        L41:
            int r8 = r12.F()     // Catch: java.lang.Throwable -> L8e
            if (r8 == r5) goto L6f
            int r8 = r12.s()     // Catch: java.lang.Throwable -> L8e
            r9 = 16
            if (r8 != r9) goto L5a
            int r4 = r12.O()     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.xa2 r6 = r10.f3107a     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r6 = r1.b(r13, r6, r4)     // Catch: java.lang.Throwable -> L8e
            goto L41
        L5a:
            r9 = 26
            if (r8 != r9) goto L69
            if (r6 == 0) goto L64
            r1.e(r12, r6, r13, r3)     // Catch: java.lang.Throwable -> L8e
            goto L41
        L64:
            com.google.android.gms.internal.ads.a82 r7 = r12.C()     // Catch: java.lang.Throwable -> L8e
            goto L41
        L69:
            boolean r8 = r12.v()     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L41
        L6f:
            int r5 = r12.s()     // Catch: java.lang.Throwable -> L8e
            r8 = 12
            if (r5 != r8) goto L89
            if (r7 == 0) goto L82
            if (r6 == 0) goto L7f
            r1.d(r7, r6, r13, r3)     // Catch: java.lang.Throwable -> L8e
            goto L82
        L7f:
            r0.b(r2, r4, r7)     // Catch: java.lang.Throwable -> L8e
        L82:
            r4 = 1
        L83:
            if (r4 != 0) goto Lc
            r0.r(r11, r2)
            return
        L89:
            com.google.android.gms.internal.ads.w92 r12 = com.google.android.gms.internal.ads.w92.e()     // Catch: java.lang.Throwable -> L8e
            throw r12     // Catch: java.lang.Throwable -> L8e
        L8e:
            r12 = move-exception
            r0.r(r11, r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.db2.e(java.lang.Object, com.google.android.gms.internal.ads.nb2, com.google.android.gms.internal.ads.y82):void");
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final boolean f(T t, T t2) {
        if (!this.f3108b.j(t).equals(this.f3108b.j(t2))) {
            return false;
        }
        if (this.f3109c) {
            return this.d.g(t).equals(this.d.g(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final T g() {
        return (T) this.f3107a.e().E();
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final boolean h(T t) {
        return this.d.g(t).c();
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final int i(T t) {
        int r0 = this.f3108b.j(t).hashCode();
        return this.f3109c ? (r0 * 53) + this.d.g(t).hashCode() : r0;
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final void j(T t, kd2 kd2Var) throws IOException {
        Iterator itD = this.d.g(t).d();
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            g92 g92Var = (g92) entry.getKey();
            if (g92Var.D() != hd2.MESSAGE || g92Var.L() || g92Var.l()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            kd2Var.B(g92Var.h(), entry instanceof da2 ? ((da2) entry).a().a() : entry.getValue());
        }
        mc2<?, ?> mc2Var = this.f3108b;
        mc2Var.p(mc2Var.j(t), kd2Var);
    }
}
