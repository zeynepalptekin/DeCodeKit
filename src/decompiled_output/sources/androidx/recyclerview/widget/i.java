package androidx.recyclerview.widget;

import androidx.annotation.i0;
import androidx.annotation.x0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<g> f685a = new a();

    static class a implements Comparator<g> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            int r0 = gVar.f695a - gVar2.f695a;
            return r0 == 0 ? gVar.f696b - gVar2.f696b : r0;
        }
    }

    public static abstract class b {
        public abstract boolean a(int r1, int r2);

        public abstract boolean b(int r1, int r2);

        @i0
        public Object c(int r1, int r2) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    public static class c {
        public static final int h = -1;
        private static final int i = 1;
        private static final int j = 2;
        private static final int k = 4;
        private static final int l = 8;
        private static final int m = 16;
        private static final int n = 5;
        private static final int o = 31;

        /* renamed from: a, reason: collision with root package name */
        private final List<g> f686a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f687b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f688c;
        private final b d;
        private final int e;
        private final int f;
        private final boolean g;

        c(b bVar, List<g> list, int[] r3, int[] r4, boolean z) {
            this.f686a = list;
            this.f687b = r3;
            this.f688c = r4;
            Arrays.fill(r3, 0);
            Arrays.fill(this.f688c, 0);
            this.d = bVar;
            this.e = bVar.e();
            this.f = bVar.d();
            this.g = z;
            a();
            j();
        }

        private void a() {
            g gVar = this.f686a.isEmpty() ? null : this.f686a.get(0);
            if (gVar != null && gVar.f695a == 0 && gVar.f696b == 0) {
                return;
            }
            g gVar2 = new g();
            gVar2.f695a = 0;
            gVar2.f696b = 0;
            gVar2.d = false;
            gVar2.f697c = 0;
            gVar2.e = false;
            this.f686a.add(0, gVar2);
        }

        private void d(List<e> list, t tVar, int r9, int r10, int r11) {
            if (!this.g) {
                tVar.c(r9, r10);
                return;
            }
            for (int r102 = r10 - 1; r102 >= 0; r102--) {
                int r2 = r11 + r102;
                int r1 = this.f688c[r2] & 31;
                if (r1 == 0) {
                    tVar.c(r9, 1);
                    Iterator<e> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().f690b++;
                    }
                } else if (r1 == 4 || r1 == 8) {
                    int r4 = this.f688c[r2] >> 5;
                    tVar.b(m(list, r4, true).f690b, r9);
                    if (r1 == 4) {
                        tVar.d(r9, 1, this.d.c(r4, r2));
                    }
                } else {
                    if (r1 != 16) {
                        throw new IllegalStateException("unknown flag for pos " + r2 + " " + Long.toBinaryString(r1));
                    }
                    list.add(new e(r2, r9, false));
                }
            }
        }

        private void e(List<e> list, t tVar, int r11, int r12, int r13) {
            if (!this.g) {
                tVar.a(r11, r12);
                return;
            }
            for (int r122 = r12 - 1; r122 >= 0; r122--) {
                int r2 = r13 + r122;
                int r1 = this.f687b[r2] & 31;
                if (r1 == 0) {
                    tVar.a(r11 + r122, 1);
                    Iterator<e> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().f690b--;
                    }
                } else if (r1 == 4 || r1 == 8) {
                    int r4 = this.f687b[r2] >> 5;
                    e eVarM = m(list, r4, false);
                    tVar.b(r11 + r122, eVarM.f690b - 1);
                    if (r1 == 4) {
                        tVar.d(eVarM.f690b - 1, 1, this.d.c(r2, r4));
                    }
                } else {
                    if (r1 != 16) {
                        throw new IllegalStateException("unknown flag for pos " + r2 + " " + Long.toBinaryString(r1));
                    }
                    list.add(new e(r2, r11 + r122, true));
                }
            }
        }

        private void h(int r3, int r4, int r5) {
            if (this.f687b[r3 - 1] != 0) {
                return;
            }
            i(r3, r4, r5, false);
        }

        private boolean i(int r9, int r10, int r11, boolean z) {
            int r0;
            int r1;
            int r4;
            if (z) {
                r10--;
                r1 = r9;
                r0 = r10;
            } else {
                r0 = r9 - 1;
                r1 = r0;
            }
            while (r11 >= 0) {
                g gVar = this.f686a.get(r11);
                int r3 = gVar.f695a;
                int r42 = gVar.f697c;
                int r32 = r3 + r42;
                int r5 = gVar.f696b + r42;
                if (z) {
                    for (int r12 = r1 - 1; r12 >= r32; r12--) {
                        if (this.d.b(r12, r0)) {
                            r4 = this.d.a(r12, r0) ? 8 : 4;
                            this.f688c[r0] = (r12 << 5) | 16;
                            this.f687b[r12] = (r0 << 5) | r4;
                            return true;
                        }
                    }
                } else {
                    for (int r102 = r10 - 1; r102 >= r5; r102--) {
                        if (this.d.b(r0, r102)) {
                            r4 = this.d.a(r0, r102) ? 8 : 4;
                            int r92 = r9 - 1;
                            this.f687b[r92] = (r102 << 5) | 16;
                            this.f688c[r102] = (r92 << 5) | r4;
                            return true;
                        }
                    }
                }
                r1 = gVar.f695a;
                r10 = gVar.f696b;
                r11--;
            }
            return false;
        }

        private void j() {
            int r0 = this.e;
            int r1 = this.f;
            for (int size = this.f686a.size() - 1; size >= 0; size--) {
                g gVar = this.f686a.get(size);
                int r5 = gVar.f695a;
                int r6 = gVar.f697c;
                int r52 = r5 + r6;
                int r7 = gVar.f696b + r6;
                if (this.g) {
                    while (r0 > r52) {
                        h(r0, r1, size);
                        r0--;
                    }
                    while (r1 > r7) {
                        k(r0, r1, size);
                        r1--;
                    }
                }
                for (int r02 = 0; r02 < gVar.f697c; r02++) {
                    int r12 = gVar.f695a + r02;
                    int r53 = gVar.f696b + r02;
                    int r62 = this.d.a(r12, r53) ? 1 : 2;
                    this.f687b[r12] = (r53 << 5) | r62;
                    this.f688c[r53] = (r12 << 5) | r62;
                }
                r0 = gVar.f695a;
                r1 = gVar.f696b;
            }
        }

        private void k(int r3, int r4, int r5) {
            if (this.f688c[r4 - 1] != 0) {
                return;
            }
            i(r3, r4, r5, true);
        }

        private static e m(List<e> list, int r6, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                e eVar = list.get(size);
                if (eVar.f689a == r6 && eVar.f691c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f690b += z ? 1 : -1;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        public int b(@androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r4) {
            if (r4 >= 0 && r4 < this.f) {
                int r42 = this.f688c[r4];
                if ((r42 & 31) == 0) {
                    return -1;
                }
                return r42 >> 5;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + r4 + ", new list size = " + this.f);
        }

        public int c(@androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r4) {
            if (r4 >= 0 && r4 < this.e) {
                int r42 = this.f687b[r4];
                if ((r42 & 31) == 0) {
                    return -1;
                }
                return r42 >> 5;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + r4 + ", old list size = " + this.e);
        }

        public void f(@androidx.annotation.h0 t tVar) {
            androidx.recyclerview.widget.f fVar = tVar instanceof androidx.recyclerview.widget.f ? (androidx.recyclerview.widget.f) tVar : new androidx.recyclerview.widget.f(tVar);
            ArrayList arrayList = new ArrayList();
            int r1 = this.e;
            int r8 = this.f;
            for (int size = this.f686a.size() - 1; size >= 0; size--) {
                g gVar = this.f686a.get(size);
                int r11 = gVar.f697c;
                int r12 = gVar.f695a + r11;
                int r13 = gVar.f696b + r11;
                if (r12 < r1) {
                    e(arrayList, fVar, r12, r1 - r12, r12);
                }
                if (r13 < r8) {
                    d(arrayList, fVar, r12, r8 - r13, r13);
                }
                for (int r112 = r11 - 1; r112 >= 0; r112--) {
                    int[] r14 = this.f687b;
                    int r2 = gVar.f695a;
                    if ((r14[r2 + r112] & 31) == 2) {
                        fVar.d(r2 + r112, 1, this.d.c(r2 + r112, gVar.f696b + r112));
                    }
                }
                r1 = gVar.f695a;
                r8 = gVar.f696b;
            }
            fVar.e();
        }

        public void g(@androidx.annotation.h0 RecyclerView.g gVar) {
            f(new androidx.recyclerview.widget.b(gVar));
        }

        @x0
        List<g> l() {
            return this.f686a;
        }
    }

    public static abstract class d<T> {
        public abstract boolean a(@androidx.annotation.h0 T t, @androidx.annotation.h0 T t2);

        public abstract boolean b(@androidx.annotation.h0 T t, @androidx.annotation.h0 T t2);

        @i0
        public Object c(@androidx.annotation.h0 T t, @androidx.annotation.h0 T t2) {
            return null;
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        int f689a;

        /* renamed from: b, reason: collision with root package name */
        int f690b;

        /* renamed from: c, reason: collision with root package name */
        boolean f691c;

        public e(int r1, int r2, boolean z) {
            this.f689a = r1;
            this.f690b = r2;
            this.f691c = z;
        }
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        int f692a;

        /* renamed from: b, reason: collision with root package name */
        int f693b;

        /* renamed from: c, reason: collision with root package name */
        int f694c;
        int d;

        public f() {
        }

        public f(int r1, int r2, int r3, int r4) {
            this.f692a = r1;
            this.f693b = r2;
            this.f694c = r3;
            this.d = r4;
        }
    }

    static class g {

        /* renamed from: a, reason: collision with root package name */
        int f695a;

        /* renamed from: b, reason: collision with root package name */
        int f696b;

        /* renamed from: c, reason: collision with root package name */
        int f697c;
        boolean d;
        boolean e;

        g() {
        }
    }

    private i() {
    }

    @androidx.annotation.h0
    public static c a(@androidx.annotation.h0 b bVar) {
        return b(bVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    @androidx.annotation.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.recyclerview.widget.i.c b(@androidx.annotation.h0 androidx.recyclerview.widget.i.b r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.b(androidx.recyclerview.widget.i$b, boolean):androidx.recyclerview.widget.i$c");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:52:0x00cd
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.recyclerview.widget.i.g c(androidx.recyclerview.widget.i.b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.c(androidx.recyclerview.widget.i$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.i$g");
    }
}
