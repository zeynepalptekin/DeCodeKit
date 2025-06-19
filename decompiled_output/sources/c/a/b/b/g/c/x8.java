package c.a.b.b.g.c;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class x8<T> implements j9<T> {

    /* renamed from: a, reason: collision with root package name */
    private final r8 f1858a;

    /* renamed from: b, reason: collision with root package name */
    private final ca<?, ?> f1859b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1860c;
    private final w6<?> d;

    private x8(ca<?, ?> caVar, w6<?> w6Var, r8 r8Var) {
        this.f1859b = caVar;
        this.f1860c = w6Var.h(r8Var);
        this.d = w6Var;
        this.f1858a = r8Var;
    }

    static <T> x8<T> k(ca<?, ?> caVar, w6<?> w6Var, r8 r8Var) {
        return new x8<>(caVar, w6Var, r8Var);
    }

    @Override // c.a.b.b.g.c.j9
    public final T a() {
        return (T) this.f1858a.f().i();
    }

    @Override // c.a.b.b.g.c.j9
    public final int b(T t) {
        int r0 = this.f1859b.k(t).hashCode();
        return this.f1860c ? (r0 * 53) + this.d.b(t).hashCode() : r0;
    }

    @Override // c.a.b.b.g.c.j9
    public final int c(T t) {
        ca<?, ?> caVar = this.f1859b;
        int r0 = caVar.r(caVar.k(t)) + 0;
        return this.f1860c ? r0 + this.d.b(t).s() : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099 A[EDGE_INSN: B:56:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:61:0x0053], SYNTHETIC] */
    @Override // c.a.b.b.g.c.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(T r10, byte[] r11, int r12, int r13, c.a.b.b.g.c.t5 r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            c.a.b.b.g.c.h7 r0 = (c.a.b.b.g.c.h7) r0
            c.a.b.b.g.c.fa r1 = r0.zzb
            c.a.b.b.g.c.fa r2 = c.a.b.b.g.c.fa.a()
            if (r1 != r2) goto L11
            c.a.b.b.g.c.fa r1 = c.a.b.b.g.c.fa.g()
            r0.zzb = r1
        L11:
            c.a.b.b.g.c.h7$b r10 = (c.a.b.b.g.c.h7.b) r10
            r10.C()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = c.a.b.b.g.c.u5.i(r11, r12, r14)
            int r2 = r14.f1823a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            c.a.b.b.g.c.w6<?> r12 = r9.d
            c.a.b.b.g.c.u6 r0 = r14.d
            c.a.b.b.g.c.r8 r3 = r9.f1858a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.c(r0, r3, r5)
            r0 = r12
            c.a.b.b.g.c.h7$d r0 = (c.a.b.b.g.c.h7.d) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = c.a.b.b.g.c.u5.c(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            c.a.b.b.g.c.f9.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = c.a.b.b.g.c.u5.a(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = c.a.b.b.g.c.u5.i(r11, r4, r14)
            int r5 = r14.f1823a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = c.a.b.b.g.c.u5.q(r11, r4, r14)
            java.lang.Object r2 = r14.f1825c
            c.a.b.b.g.c.y5 r2 = (c.a.b.b.g.c.y5) r2
            goto L53
        L72:
            c.a.b.b.g.c.f9.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = c.a.b.b.g.c.u5.i(r11, r4, r14)
            int r12 = r14.f1823a
            c.a.b.b.g.c.w6<?> r0 = r9.d
            c.a.b.b.g.c.u6 r5 = r14.d
            c.a.b.b.g.c.r8 r6 = r9.f1858a
            java.lang.Object r0 = r0.c(r5, r6, r12)
            c.a.b.b.g.c.h7$d r0 = (c.a.b.b.g.c.h7.d) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = c.a.b.b.g.c.u5.a(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.c(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            c.a.b.b.g.c.q7 r10 = c.a.b.b.g.c.q7.g()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.x8.d(java.lang.Object, byte[], int, int, c.a.b.b.g.c.t5):void");
    }

    @Override // c.a.b.b.g.c.j9
    public final boolean e(T t) {
        return this.d.b(t).r();
    }

    @Override // c.a.b.b.g.c.j9
    public final boolean f(T t, T t2) {
        if (!this.f1859b.k(t).equals(this.f1859b.k(t2))) {
            return false;
        }
        if (this.f1860c) {
            return this.d.b(t).equals(this.d.b(t2));
        }
        return true;
    }

    @Override // c.a.b.b.g.c.j9
    public final void g(T t) {
        this.f1859b.q(t);
        this.d.j(t);
    }

    @Override // c.a.b.b.g.c.j9
    public final void h(T t, ab abVar) throws IOException {
        Iterator itP = this.d.b(t).p();
        while (itP.hasNext()) {
            Map.Entry entry = (Map.Entry) itP.next();
            z6 z6Var = (z6) entry.getKey();
            if (z6Var.c() != xa.MESSAGE || z6Var.d() || z6Var.f()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            abVar.m(z6Var.a(), entry instanceof x7 ? ((x7) entry).a().d() : entry.getValue());
        }
        ca<?, ?> caVar = this.f1859b;
        caVar.m(caVar.k(t), abVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[LOOP:0: B:45:0x000c->B:53:?, LOOP_END, SYNTHETIC] */
    @Override // c.a.b.b.g.c.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(T r11, c.a.b.b.g.c.l9 r12, c.a.b.b.g.c.u6 r13) throws java.io.IOException {
        /*
            r10 = this;
            c.a.b.b.g.c.ca<?, ?> r0 = r10.f1859b
            c.a.b.b.g.c.w6<?> r1 = r10.d
            java.lang.Object r2 = r0.o(r11)
            c.a.b.b.g.c.x6 r3 = r1.i(r11)
        Lc:
            int r4 = r12.a()     // Catch: java.lang.Throwable -> L8e
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L19
            r0.n(r11, r2)
            return
        L19:
            int r4 = r12.b()     // Catch: java.lang.Throwable -> L8e
            r6 = 11
            if (r4 == r6) goto L3e
            r5 = r4 & 7
            r6 = 2
            if (r5 != r6) goto L39
            c.a.b.b.g.c.r8 r5 = r10.f1858a     // Catch: java.lang.Throwable -> L8e
            int r4 = r4 >>> 3
            java.lang.Object r4 = r1.c(r13, r5, r4)     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L34
            r1.f(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L8e
            goto L82
        L34:
            boolean r4 = r0.j(r2, r12)     // Catch: java.lang.Throwable -> L8e
            goto L83
        L39:
            boolean r4 = r12.c()     // Catch: java.lang.Throwable -> L8e
            goto L83
        L3e:
            r4 = 0
            r6 = 0
            r7 = r6
        L41:
            int r8 = r12.a()     // Catch: java.lang.Throwable -> L8e
            if (r8 == r5) goto L6f
            int r8 = r12.b()     // Catch: java.lang.Throwable -> L8e
            r9 = 16
            if (r8 != r9) goto L5a
            int r4 = r12.O()     // Catch: java.lang.Throwable -> L8e
            c.a.b.b.g.c.r8 r6 = r10.f1858a     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r6 = r1.c(r13, r6, r4)     // Catch: java.lang.Throwable -> L8e
            goto L41
        L5a:
            r9 = 26
            if (r8 != r9) goto L69
            if (r6 == 0) goto L64
            r1.f(r12, r6, r13, r3)     // Catch: java.lang.Throwable -> L8e
            goto L41
        L64:
            c.a.b.b.g.c.y5 r7 = r12.I()     // Catch: java.lang.Throwable -> L8e
            goto L41
        L69:
            boolean r8 = r12.c()     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L41
        L6f:
            int r5 = r12.b()     // Catch: java.lang.Throwable -> L8e
            r8 = 12
            if (r5 != r8) goto L89
            if (r7 == 0) goto L82
            if (r6 == 0) goto L7f
            r1.e(r7, r6, r13, r3)     // Catch: java.lang.Throwable -> L8e
            goto L82
        L7f:
            r0.e(r2, r4, r7)     // Catch: java.lang.Throwable -> L8e
        L82:
            r4 = 1
        L83:
            if (r4 != 0) goto Lc
            r0.n(r11, r2)
            return
        L89:
            c.a.b.b.g.c.q7 r12 = c.a.b.b.g.c.q7.e()     // Catch: java.lang.Throwable -> L8e
            throw r12     // Catch: java.lang.Throwable -> L8e
        L8e:
            r12 = move-exception
            r0.n(r11, r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.x8.i(java.lang.Object, c.a.b.b.g.c.l9, c.a.b.b.g.c.u6):void");
    }

    @Override // c.a.b.b.g.c.j9
    public final void j(T t, T t2) {
        m9.o(this.f1859b, t, t2);
        if (this.f1860c) {
            m9.m(this.d, t, t2);
        }
    }
}
