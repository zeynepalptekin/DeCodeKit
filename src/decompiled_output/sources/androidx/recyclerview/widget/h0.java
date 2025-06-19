package androidx.recyclerview.widget;

import androidx.annotation.i0;
import androidx.annotation.x0;
import androidx.recyclerview.widget.RecyclerView;
import b.i.o.h;

/* loaded from: classes.dex */
class h0 {

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f679c = false;

    /* renamed from: a, reason: collision with root package name */
    @x0
    final b.f.i<RecyclerView.f0, a> f680a = new b.f.i<>();

    /* renamed from: b, reason: collision with root package name */
    @x0
    final b.f.f<RecyclerView.f0> f681b = new b.f.f<>();

    static class a {
        static final int d = 1;
        static final int e = 2;
        static final int f = 4;
        static final int g = 8;
        static final int h = 3;
        static final int i = 12;
        static final int j = 14;
        static h.a<a> k = new h.b(20);

        /* renamed from: a, reason: collision with root package name */
        int f682a;

        /* renamed from: b, reason: collision with root package name */
        @i0
        RecyclerView.l.d f683b;

        /* renamed from: c, reason: collision with root package name */
        @i0
        RecyclerView.l.d f684c;

        private a() {
        }

        static void a() {
            while (k.b() != null) {
            }
        }

        static a b() {
            a aVarB = k.b();
            return aVarB == null ? new a() : aVarB;
        }

        static void c(a aVar) {
            aVar.f682a = 0;
            aVar.f683b = null;
            aVar.f684c = null;
            k.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.f0 f0Var);

        void b(RecyclerView.f0 f0Var, @i0 RecyclerView.l.d dVar, RecyclerView.l.d dVar2);

        void c(RecyclerView.f0 f0Var, @androidx.annotation.h0 RecyclerView.l.d dVar, @i0 RecyclerView.l.d dVar2);

        void d(RecyclerView.f0 f0Var, @androidx.annotation.h0 RecyclerView.l.d dVar, @androidx.annotation.h0 RecyclerView.l.d dVar2);
    }

    h0() {
    }

    private RecyclerView.l.d l(RecyclerView.f0 f0Var, int r6) {
        a aVarM;
        RecyclerView.l.d dVar;
        int r5 = this.f680a.f(f0Var);
        if (r5 >= 0 && (aVarM = this.f680a.m(r5)) != null) {
            int r2 = aVarM.f682a;
            if ((r2 & r6) != 0) {
                aVarM.f682a = (~r6) & r2;
                if (r6 == 4) {
                    dVar = aVarM.f683b;
                } else {
                    if (r6 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    dVar = aVarM.f684c;
                }
                if ((aVarM.f682a & 12) == 0) {
                    this.f680a.k(r5);
                    a.c(aVarM);
                }
                return dVar;
            }
        }
        return null;
    }

    void a(RecyclerView.f0 f0Var, RecyclerView.l.d dVar) {
        a aVarB = this.f680a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f680a.put(f0Var, aVarB);
        }
        aVarB.f682a |= 2;
        aVarB.f683b = dVar;
    }

    void b(RecyclerView.f0 f0Var) {
        a aVarB = this.f680a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f680a.put(f0Var, aVarB);
        }
        aVarB.f682a |= 1;
    }

    void c(long j, RecyclerView.f0 f0Var) {
        this.f681b.q(j, f0Var);
    }

    void d(RecyclerView.f0 f0Var, RecyclerView.l.d dVar) {
        a aVarB = this.f680a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f680a.put(f0Var, aVarB);
        }
        aVarB.f684c = dVar;
        aVarB.f682a |= 8;
    }

    void e(RecyclerView.f0 f0Var, RecyclerView.l.d dVar) {
        a aVarB = this.f680a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f680a.put(f0Var, aVarB);
        }
        aVarB.f683b = dVar;
        aVarB.f682a |= 4;
    }

    void f() {
        this.f680a.clear();
        this.f681b.c();
    }

    RecyclerView.f0 g(long j) {
        return this.f681b.k(j);
    }

    boolean h(RecyclerView.f0 f0Var) {
        a aVar = this.f680a.get(f0Var);
        return (aVar == null || (aVar.f682a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.f0 f0Var) {
        a aVar = this.f680a.get(f0Var);
        return (aVar == null || (aVar.f682a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.f0 f0Var) {
        p(f0Var);
    }

    @i0
    RecyclerView.l.d m(RecyclerView.f0 f0Var) {
        return l(f0Var, 8);
    }

    @i0
    RecyclerView.l.d n(RecyclerView.f0 f0Var) {
        return l(f0Var, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void o(androidx.recyclerview.widget.h0.b r7) {
        /*
            r6 = this;
            b.f.i<androidx.recyclerview.widget.RecyclerView$f0, androidx.recyclerview.widget.h0$a> r0 = r6.f680a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L63
            b.f.i<androidx.recyclerview.widget.RecyclerView$f0, androidx.recyclerview.widget.h0$a> r1 = r6.f680a
            java.lang.Object r1 = r1.i(r0)
            androidx.recyclerview.widget.RecyclerView$f0 r1 = (androidx.recyclerview.widget.RecyclerView.f0) r1
            b.f.i<androidx.recyclerview.widget.RecyclerView$f0, androidx.recyclerview.widget.h0$a> r2 = r6.f680a
            java.lang.Object r2 = r2.k(r0)
            androidx.recyclerview.widget.h0$a r2 = (androidx.recyclerview.widget.h0.a) r2
            int r3 = r2.f682a
            r4 = r3 & 3
            r5 = 3
            if (r4 != r5) goto L25
        L21:
            r7.a(r1)
            goto L5d
        L25:
            r4 = r3 & 1
            if (r4 == 0) goto L34
            androidx.recyclerview.widget.RecyclerView$l$d r3 = r2.f683b
            if (r3 != 0) goto L2e
            goto L21
        L2e:
            androidx.recyclerview.widget.RecyclerView$l$d r4 = r2.f684c
        L30:
            r7.c(r1, r3, r4)
            goto L5d
        L34:
            r4 = r3 & 14
            r5 = 14
            if (r4 != r5) goto L42
        L3a:
            androidx.recyclerview.widget.RecyclerView$l$d r3 = r2.f683b
            androidx.recyclerview.widget.RecyclerView$l$d r4 = r2.f684c
            r7.b(r1, r3, r4)
            goto L5d
        L42:
            r4 = r3 & 12
            r5 = 12
            if (r4 != r5) goto L50
            androidx.recyclerview.widget.RecyclerView$l$d r3 = r2.f683b
            androidx.recyclerview.widget.RecyclerView$l$d r4 = r2.f684c
            r7.d(r1, r3, r4)
            goto L5d
        L50:
            r4 = r3 & 4
            if (r4 == 0) goto L58
            androidx.recyclerview.widget.RecyclerView$l$d r3 = r2.f683b
            r4 = 0
            goto L30
        L58:
            r3 = r3 & 8
            if (r3 == 0) goto L5d
            goto L3a
        L5d:
            androidx.recyclerview.widget.h0.a.c(r2)
            int r0 = r0 + (-1)
            goto L8
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h0.o(androidx.recyclerview.widget.h0$b):void");
    }

    void p(RecyclerView.f0 f0Var) {
        a aVar = this.f680a.get(f0Var);
        if (aVar == null) {
            return;
        }
        aVar.f682a &= -2;
    }

    void q(RecyclerView.f0 f0Var) {
        int r0 = this.f681b.A() - 1;
        while (true) {
            if (r0 < 0) {
                break;
            }
            if (f0Var == this.f681b.C(r0)) {
                this.f681b.v(r0);
                break;
            }
            r0--;
        }
        a aVarRemove = this.f680a.remove(f0Var);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}
