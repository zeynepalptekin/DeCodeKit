package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.i0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class l implements Runnable {
    static final ThreadLocal<l> h = new ThreadLocal<>();
    static Comparator<c> i = new a();
    long e;
    long f;
    ArrayList<RecyclerView> d = new ArrayList<>();
    private ArrayList<c> g = new ArrayList<>();

    static class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            if ((cVar.d == null) != (cVar2.d == null)) {
                return cVar.d == null ? 1 : -1;
            }
            boolean z = cVar.f711a;
            if (z != cVar2.f711a) {
                return z ? -1 : 1;
            }
            int r0 = cVar2.f712b - cVar.f712b;
            if (r0 != 0) {
                return r0;
            }
            int r6 = cVar.f713c - cVar2.f713c;
            if (r6 != 0) {
                return r6;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    static class b implements RecyclerView.o.c {

        /* renamed from: a, reason: collision with root package name */
        int f708a;

        /* renamed from: b, reason: collision with root package name */
        int f709b;

        /* renamed from: c, reason: collision with root package name */
        int[] f710c;
        int d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int r6, int r7) {
            if (r6 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (r7 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int r0 = this.d * 2;
            int[] r1 = this.f710c;
            if (r1 == null) {
                int[] r12 = new int[4];
                this.f710c = r12;
                Arrays.fill(r12, -1);
            } else if (r0 >= r1.length) {
                int[] r2 = new int[r0 * 2];
                this.f710c = r2;
                System.arraycopy(r1, 0, r2, 0, r1.length);
            }
            int[] r13 = this.f710c;
            r13[r0] = r6;
            r13[r0 + 1] = r7;
            this.d++;
        }

        void b() {
            int[] r0 = this.f710c;
            if (r0 != null) {
                Arrays.fill(r0, -1);
            }
            this.d = 0;
        }

        void c(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] r0 = this.f710c;
            if (r0 != null) {
                Arrays.fill(r0, -1);
            }
            RecyclerView.o oVar = recyclerView.p;
            if (recyclerView.o == null || oVar == null || !oVar.I0()) {
                return;
            }
            if (z) {
                if (!recyclerView.g.q()) {
                    oVar.s(recyclerView.o.e(), this);
                }
            } else if (!recyclerView.C0()) {
                oVar.r(this.f708a, this.f709b, recyclerView.k0, this);
            }
            int r1 = this.d;
            if (r1 > oVar.m) {
                oVar.m = r1;
                oVar.n = z;
                recyclerView.e.L();
            }
        }

        boolean d(int r5) {
            if (this.f710c != null) {
                int r0 = this.d * 2;
                for (int r2 = 0; r2 < r0; r2 += 2) {
                    if (this.f710c[r2] == r5) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int r1, int r2) {
            this.f708a = r1;
            this.f709b = r2;
        }
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f711a;

        /* renamed from: b, reason: collision with root package name */
        public int f712b;

        /* renamed from: c, reason: collision with root package name */
        public int f713c;
        public RecyclerView d;
        public int e;

        c() {
        }

        public void a() {
            this.f711a = false;
            this.f712b = 0;
            this.f713c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    l() {
    }

    private void b() {
        c cVar;
        int size = this.d.size();
        int r3 = 0;
        for (int r2 = 0; r2 < size; r2++) {
            RecyclerView recyclerView = this.d.get(r2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.j0.c(recyclerView, false);
                r3 += recyclerView.j0.d;
            }
        }
        this.g.ensureCapacity(r3);
        int r32 = 0;
        for (int r22 = 0; r22 < size; r22++) {
            RecyclerView recyclerView2 = this.d.get(r22);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.j0;
                int r6 = Math.abs(bVar.f708a) + Math.abs(bVar.f709b);
                for (int r7 = 0; r7 < bVar.d * 2; r7 += 2) {
                    if (r32 >= this.g.size()) {
                        cVar = new c();
                        this.g.add(cVar);
                    } else {
                        cVar = this.g.get(r32);
                    }
                    int r9 = bVar.f710c[r7 + 1];
                    cVar.f711a = r9 <= r6;
                    cVar.f712b = r6;
                    cVar.f713c = r9;
                    cVar.d = recyclerView2;
                    cVar.e = bVar.f710c[r7];
                    r32++;
                }
            }
        }
        Collections.sort(this.g, i);
    }

    private void c(c cVar, long j) {
        RecyclerView.f0 f0VarI = i(cVar.d, cVar.e, cVar.f711a ? Long.MAX_VALUE : j);
        if (f0VarI == null || f0VarI.f562b == null || !f0VarI.t() || f0VarI.u()) {
            return;
        }
        h(f0VarI.f562b.get(), j);
    }

    private void d(long j) {
        for (int r0 = 0; r0 < this.g.size(); r0++) {
            c cVar = this.g.get(r0);
            if (cVar.d == null) {
                return;
            }
            c(cVar, j);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int r6) {
        int r0 = recyclerView.h.j();
        for (int r2 = 0; r2 < r0; r2++) {
            RecyclerView.f0 f0VarT0 = RecyclerView.t0(recyclerView.h.i(r2));
            if (f0VarT0.f563c == r6 && !f0VarT0.u()) {
                return true;
            }
        }
        return false;
    }

    private void h(@i0 RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.G && recyclerView.h.j() != 0) {
            recyclerView.n1();
        }
        b bVar = recyclerView.j0;
        bVar.c(recyclerView, true);
        if (bVar.d != 0) {
            try {
                b.i.k.o.b("RV Nested Prefetch");
                recyclerView.k0.k(recyclerView.o);
                for (int r1 = 0; r1 < bVar.d * 2; r1 += 2) {
                    i(recyclerView, bVar.f710c[r1], j);
                }
            } finally {
                b.i.k.o.d();
            }
        }
    }

    private RecyclerView.f0 i(RecyclerView recyclerView, int r4, long j) {
        if (e(recyclerView, r4)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.e;
        try {
            recyclerView.Z0();
            RecyclerView.f0 f0VarJ = wVar.J(r4, false, j);
            if (f0VarJ != null) {
                if (!f0VarJ.t() || f0VarJ.u()) {
                    wVar.a(f0VarJ, false);
                } else {
                    wVar.C(f0VarJ.f561a);
                }
            }
            return f0VarJ;
        } finally {
            recyclerView.b1(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.d.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int r7, int r8) {
        if (recyclerView.isAttachedToWindow() && this.e == 0) {
            this.e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.j0.e(r7, r8);
    }

    void g(long j) {
        b();
        d(j);
    }

    public void j(RecyclerView recyclerView) {
        this.d.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            b.i.k.o.b("RV Prefetch");
            if (!this.d.isEmpty()) {
                int size = this.d.size();
                long jMax = 0;
                for (int r3 = 0; r3 < size; r3++) {
                    RecyclerView recyclerView = this.d.get(r3);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f);
                }
            }
        } finally {
            this.e = 0L;
            b.i.k.o.d();
        }
    }
}
