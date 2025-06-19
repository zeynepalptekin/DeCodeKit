package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.i0;
import androidx.annotation.w0;
import androidx.annotation.y0;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.f0;

/* loaded from: classes.dex */
public class e<T> {
    static final String s = "AsyncListUtil";
    static final boolean t = false;

    /* renamed from: a, reason: collision with root package name */
    final Class<T> f630a;

    /* renamed from: b, reason: collision with root package name */
    final int f631b;

    /* renamed from: c, reason: collision with root package name */
    final c<T> f632c;
    final d d;
    final f0<T> e;
    final e0.b<T> f;
    final e0.a<T> g;
    boolean k;
    final int[] h = new int[2];
    final int[] i = new int[2];
    final int[] j = new int[2];
    private int l = 0;
    int m = 0;
    int n = 0;
    int o = 0;
    final SparseIntArray p = new SparseIntArray();
    private final e0.b<T> q = new a();
    private final e0.a<T> r = new b();

    class a implements e0.b<T> {
        a() {
        }

        private boolean d(int r2) {
            return r2 == e.this.o;
        }

        private void e() {
            for (int r0 = 0; r0 < e.this.e.f(); r0++) {
                e eVar = e.this;
                eVar.g.a(eVar.e.c(r0));
            }
            e.this.e.b();
        }

        @Override // androidx.recyclerview.widget.e0.b
        public void a(int r1, int r2) {
            if (d(r1)) {
                e eVar = e.this;
                eVar.m = r2;
                eVar.d.c();
                e eVar2 = e.this;
                eVar2.n = eVar2.o;
                e();
                e eVar3 = e.this;
                eVar3.k = false;
                eVar3.g();
            }
        }

        @Override // androidx.recyclerview.widget.e0.b
        public void b(int r4, f0.a<T> aVar) {
            if (!d(r4)) {
                e.this.g.a(aVar);
                return;
            }
            f0.a<T> aVarA = e.this.e.a(aVar);
            if (aVarA != null) {
                Log.e(e.s, "duplicate tile @" + aVarA.f644b);
                e.this.g.a(aVarA);
            }
            int r42 = aVar.f644b + aVar.f645c;
            int r0 = 0;
            while (r0 < e.this.p.size()) {
                int r1 = e.this.p.keyAt(r0);
                if (aVar.f644b > r1 || r1 >= r42) {
                    r0++;
                } else {
                    e.this.p.removeAt(r0);
                    e.this.d.d(r1);
                }
            }
        }

        @Override // androidx.recyclerview.widget.e0.b
        public void c(int r2, int r3) {
            if (d(r2)) {
                f0.a<T> aVarE = e.this.e.e(r3);
                if (aVarE != null) {
                    e.this.g.a(aVarE);
                    return;
                }
                Log.e(e.s, "tile not found @" + r3);
            }
        }
    }

    class b implements e0.a<T> {

        /* renamed from: a, reason: collision with root package name */
        private f0.a<T> f634a;

        /* renamed from: b, reason: collision with root package name */
        final SparseBooleanArray f635b = new SparseBooleanArray();

        /* renamed from: c, reason: collision with root package name */
        private int f636c;
        private int d;
        private int e;
        private int f;

        b() {
        }

        private f0.a<T> e() {
            f0.a<T> aVar = this.f634a;
            if (aVar != null) {
                this.f634a = aVar.d;
                return aVar;
            }
            e eVar = e.this;
            return new f0.a<>(eVar.f630a, eVar.f631b);
        }

        private void f(f0.a<T> aVar) {
            this.f635b.put(aVar.f644b, true);
            e.this.f.b(this.f636c, aVar);
        }

        private void g(int r8) {
            int r0 = e.this.f632c.b();
            while (this.f635b.size() >= r0) {
                int r1 = this.f635b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f635b;
                int r2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int r3 = this.e - r1;
                int r5 = r2 - this.f;
                if (r3 > 0 && (r3 >= r5 || r8 == 2)) {
                    k(r1);
                } else {
                    if (r5 <= 0) {
                        return;
                    }
                    if (r3 >= r5 && r8 != 1) {
                        return;
                    } else {
                        k(r2);
                    }
                }
            }
        }

        private int h(int r2) {
            return r2 - (r2 % e.this.f631b);
        }

        private boolean i(int r2) {
            return this.f635b.get(r2);
        }

        private void j(String str, Object... objArr) {
            Log.d(e.s, "[BKGR] " + String.format(str, objArr));
        }

        private void k(int r3) {
            this.f635b.delete(r3);
            e.this.f.c(this.f636c, r3);
        }

        private void l(int r4, int r5, int r6, boolean z) {
            int r0 = r4;
            while (r0 <= r5) {
                e.this.g.c(z ? (r5 + r4) - r0 : r0, r6);
                r0 += e.this.f631b;
            }
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void a(f0.a<T> aVar) {
            e.this.f632c.c(aVar.f643a, aVar.f645c);
            aVar.d = this.f634a;
            this.f634a = aVar;
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void b(int r2, int r3, int r4, int r5, int r6) {
            if (r2 > r3) {
                return;
            }
            int r22 = h(r2);
            int r32 = h(r3);
            this.e = h(r4);
            int r42 = h(r5);
            this.f = r42;
            if (r6 == 1) {
                l(this.e, r32, r6, true);
                l(r32 + e.this.f631b, this.f, r6, false);
            } else {
                l(r22, r42, r6, false);
                l(this.e, r22 - e.this.f631b, r6, true);
            }
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void c(int r5, int r6) {
            if (i(r5)) {
                return;
            }
            f0.a<T> aVarE = e();
            aVarE.f644b = r5;
            int r52 = Math.min(e.this.f631b, this.d - r5);
            aVarE.f645c = r52;
            e.this.f632c.a(aVarE.f643a, aVarE.f644b, r52);
            g(r6);
            f(aVarE);
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void d(int r3) {
            this.f636c = r3;
            this.f635b.clear();
            int r32 = e.this.f632c.d();
            this.d = r32;
            e.this.f.a(this.f636c, r32);
        }
    }

    public static abstract class c<T> {
        @y0
        public abstract void a(@androidx.annotation.h0 T[] tArr, int r2, int r3);

        @y0
        public int b() {
            return 10;
        }

        @y0
        public void c(@androidx.annotation.h0 T[] tArr, int r2) {
        }

        @y0
        public abstract int d();
    }

    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public static final int f637a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f638b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f639c = 2;

        @w0
        public void a(@androidx.annotation.h0 int[] r7, @androidx.annotation.h0 int[] r8, int r9) {
            int r1 = (r7[1] - r7[0]) + 1;
            int r3 = r1 / 2;
            r8[0] = r7[0] - (r9 == 1 ? r1 : r3);
            int r72 = r7[1];
            if (r9 != 2) {
                r1 = r3;
            }
            r8[1] = r72 + r1;
        }

        @w0
        public abstract void b(@androidx.annotation.h0 int[] r1);

        @w0
        public abstract void c();

        @w0
        public abstract void d(int r1);
    }

    public e(@androidx.annotation.h0 Class<T> cls, int r4, @androidx.annotation.h0 c<T> cVar, @androidx.annotation.h0 d dVar) {
        this.f630a = cls;
        this.f631b = r4;
        this.f632c = cVar;
        this.d = dVar;
        this.e = new f0<>(r4);
        u uVar = new u();
        this.f = uVar.b(this.q);
        this.g = uVar.a(this.r);
        f();
    }

    private boolean c() {
        return this.o != this.n;
    }

    @i0
    public T a(int r4) {
        if (r4 < 0 || r4 >= this.m) {
            throw new IndexOutOfBoundsException(r4 + " is not within 0 and " + this.m);
        }
        T tD = this.e.d(r4);
        if (tD == null && !c()) {
            this.p.put(r4, 0);
        }
        return tD;
    }

    public int b() {
        return this.m;
    }

    void d(String str, Object... objArr) {
        Log.d(s, "[MAIN] " + String.format(str, objArr));
    }

    public void e() {
        if (c()) {
            return;
        }
        g();
        this.k = true;
    }

    public void f() {
        this.p.clear();
        e0.a<T> aVar = this.g;
        int r1 = this.o + 1;
        this.o = r1;
        aVar.d(r1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void g() {
        /*
            r10 = this;
            androidx.recyclerview.widget.e$d r0 = r10.d
            int[] r1 = r10.h
            r0.b(r1)
            int[] r0 = r10.h
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            r4 = r0[r3]
            if (r2 > r4) goto L95
            r2 = r0[r1]
            if (r2 >= 0) goto L17
            goto L95
        L17:
            r2 = r0[r3]
            int r4 = r10.m
            if (r2 < r4) goto L1e
            return
        L1e:
            boolean r2 = r10.k
            if (r2 != 0) goto L25
        L22:
            r10.l = r1
            goto L46
        L25:
            r2 = r0[r1]
            int[] r4 = r10.i
            r5 = r4[r3]
            if (r2 > r5) goto L22
            r2 = r4[r1]
            r5 = r0[r3]
            if (r2 <= r5) goto L34
            goto L22
        L34:
            r2 = r0[r1]
            r5 = r4[r1]
            if (r2 >= r5) goto L3d
            r10.l = r3
            goto L46
        L3d:
            r0 = r0[r1]
            r2 = r4[r1]
            if (r0 <= r2) goto L46
            r0 = 2
            r10.l = r0
        L46:
            int[] r0 = r10.i
            int[] r2 = r10.h
            r4 = r2[r1]
            r0[r1] = r4
            r4 = r2[r3]
            r0[r3] = r4
            androidx.recyclerview.widget.e$d r0 = r10.d
            int[] r4 = r10.j
            int r5 = r10.l
            r0.a(r2, r4, r5)
            int[] r0 = r10.j
            int[] r2 = r10.h
            r2 = r2[r1]
            r4 = r0[r1]
            int r4 = java.lang.Math.max(r4, r1)
            int r2 = java.lang.Math.min(r2, r4)
            r0[r1] = r2
            int[] r0 = r10.j
            int[] r2 = r10.h
            r2 = r2[r3]
            r4 = r0[r3]
            int r5 = r10.m
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
            int r2 = java.lang.Math.max(r2, r4)
            r0[r3] = r2
            androidx.recyclerview.widget.e0$a<T> r4 = r10.g
            int[] r0 = r10.h
            r5 = r0[r1]
            r6 = r0[r3]
            int[] r0 = r10.j
            r7 = r0[r1]
            r8 = r0[r3]
            int r9 = r10.l
            r4.b(r5, r6, r7, r8, r9)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.e.g():void");
    }
}
