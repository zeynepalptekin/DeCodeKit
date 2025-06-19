package b.g.a;

import b.g.a.h;
import b.g.a.i.e;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class e {
    public static final boolean q = false;
    private static final boolean r = false;
    private static int s = 1000;
    public static f t;

    /* renamed from: c, reason: collision with root package name */
    private a f911c;
    b[] f;
    final c l;
    private final a p;

    /* renamed from: a, reason: collision with root package name */
    int f909a = 0;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, h> f910b = null;
    private int d = 32;
    private int e = 32;
    public boolean g = false;
    private boolean[] h = new boolean[32];
    int i = 1;
    int j = 0;
    private int k = 32;
    private h[] m = new h[s];
    private int n = 0;
    private b[] o = new b[32];

    interface a {
        void a(a aVar);

        void b(h hVar);

        h c(e eVar, boolean[] zArr);

        void clear();

        h getKey();

        boolean isEmpty();
    }

    public e() {
        this.f = null;
        this.f = new b[32];
        a0();
        c cVar = new c();
        this.l = cVar;
        this.f911c = new d(cVar);
        this.p = new b(this.l);
    }

    public static b A(e eVar, h hVar, h hVar2, int r5, boolean z) {
        h hVarB = eVar.B();
        b bVarV = eVar.v();
        bVarV.q(hVar, hVar2, hVarB, r5);
        if (z) {
            eVar.p(bVarV, (int) (bVarV.d.g(hVarB) * (-1.0f)));
        }
        return bVarV;
    }

    private h C(String str, h.b bVar) {
        f fVar = t;
        if (fVar != null) {
            fVar.l++;
        }
        if (this.i + 1 >= this.e) {
            W();
        }
        h hVarA = a(bVar, null);
        hVarA.h(str);
        int r0 = this.f909a + 1;
        this.f909a = r0;
        this.i++;
        hVarA.f919b = r0;
        if (this.f910b == null) {
            this.f910b = new HashMap<>();
        }
        this.f910b.put(str, hVarA);
        this.l.f908c[this.f909a] = hVarA;
        return hVarA;
    }

    private void E() {
        F();
        String str = "";
        for (int r1 = 0; r1 < this.j; r1++) {
            str = (str + this.f[r1]) + "\n";
        }
        System.out.println(str + this.f911c + "\n");
    }

    private void F() {
        System.out.println("Display Rows (" + this.j + "x" + this.i + ")\n");
    }

    private int I(a aVar) throws Exception {
        float f;
        boolean z;
        int r2 = 0;
        while (true) {
            f = 0.0f;
            if (r2 >= this.j) {
                z = false;
                break;
            }
            b[] bVarArr = this.f;
            if (bVarArr[r2].f903a.g != h.b.UNRESTRICTED && bVarArr[r2].f904b < 0.0f) {
                z = true;
                break;
            }
            r2++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int r3 = 0;
        while (!z2) {
            f fVar = t;
            if (fVar != null) {
                fVar.k++;
            }
            r3++;
            float f2 = Float.MAX_VALUE;
            int r10 = 0;
            int r11 = -1;
            int r12 = -1;
            int r13 = 0;
            while (r10 < this.j) {
                b bVar = this.f[r10];
                if (bVar.f903a.g != h.b.UNRESTRICTED && !bVar.e && bVar.f904b < f) {
                    int r1 = 1;
                    while (r1 < this.i) {
                        h hVar = this.l.f908c[r1];
                        float fG = bVar.d.g(hVar);
                        if (fG > f) {
                            for (int r4 = 0; r4 < 7; r4++) {
                                float f3 = hVar.f[r4] / fG;
                                if ((f3 < f2 && r4 == r13) || r4 > r13) {
                                    r12 = r1;
                                    r13 = r4;
                                    f2 = f3;
                                    r11 = r10;
                                }
                            }
                        }
                        r1++;
                        f = 0.0f;
                    }
                }
                r10++;
                f = 0.0f;
            }
            if (r11 != -1) {
                b bVar2 = this.f[r11];
                bVar2.f903a.f920c = -1;
                f fVar2 = t;
                if (fVar2 != null) {
                    fVar2.j++;
                }
                bVar2.w(this.l.f908c[r12]);
                h hVar2 = bVar2.f903a;
                hVar2.f920c = r11;
                hVar2.k(bVar2);
            } else {
                z2 = true;
            }
            if (r3 > this.i / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return r3;
    }

    private String L(int r4) {
        int r42 = r4 * 4;
        int r0 = r42 / 1024;
        int r1 = r0 / 1024;
        if (r1 > 0) {
            return "" + r1 + " Mb";
        }
        if (r0 > 0) {
            return "" + r0 + " Kb";
        }
        return "" + r42 + " bytes";
    }

    private String M(int r2) {
        return r2 == 1 ? "LOW" : r2 == 2 ? "MEDIUM" : r2 == 3 ? "HIGH" : r2 == 4 ? "HIGHEST" : r2 == 5 ? "EQUALITY" : r2 == 6 ? "FIXED" : "NONE";
    }

    public static f P() {
        return t;
    }

    private void W() {
        int r0 = this.d * 2;
        this.d = r0;
        this.f = (b[]) Arrays.copyOf(this.f, r0);
        c cVar = this.l;
        cVar.f908c = (h[]) Arrays.copyOf(cVar.f908c, this.d);
        int r02 = this.d;
        this.h = new boolean[r02];
        this.e = r02;
        this.k = r02;
        f fVar = t;
        if (fVar != null) {
            fVar.d++;
            fVar.p = Math.max(fVar.p, r02);
            f fVar2 = t;
            fVar2.D = fVar2.p;
        }
    }

    private final int Z(a aVar, boolean z) {
        f fVar = t;
        if (fVar != null) {
            fVar.h++;
        }
        for (int r2 = 0; r2 < this.i; r2++) {
            this.h[r2] = false;
        }
        boolean z2 = false;
        int r3 = 0;
        while (!z2) {
            f fVar2 = t;
            if (fVar2 != null) {
                fVar2.i++;
            }
            r3++;
            if (r3 >= this.i * 2) {
                return r3;
            }
            if (aVar.getKey() != null) {
                this.h[aVar.getKey().f919b] = true;
            }
            h hVarC = aVar.c(this, this.h);
            if (hVarC != null) {
                boolean[] zArr = this.h;
                int r7 = hVarC.f919b;
                if (zArr[r7]) {
                    return r3;
                }
                zArr[r7] = true;
            }
            if (hVarC != null) {
                float f = Float.MAX_VALUE;
                int r9 = -1;
                for (int r8 = 0; r8 < this.j; r8++) {
                    b bVar = this.f[r8];
                    if (bVar.f903a.g != h.b.UNRESTRICTED && !bVar.e && bVar.u(hVarC)) {
                        float fG = bVar.d.g(hVarC);
                        if (fG < 0.0f) {
                            float f2 = (-bVar.f904b) / fG;
                            if (f2 < f) {
                                r9 = r8;
                                f = f2;
                            }
                        }
                    }
                }
                if (r9 > -1) {
                    b bVar2 = this.f[r9];
                    bVar2.f903a.f920c = -1;
                    f fVar3 = t;
                    if (fVar3 != null) {
                        fVar3.j++;
                    }
                    bVar2.w(hVarC);
                    h hVar = bVar2.f903a;
                    hVar.f920c = r9;
                    hVar.k(bVar2);
                }
            }
            z2 = true;
        }
        return r3;
    }

    private h a(h.b bVar, String str) {
        h hVarB = this.l.f907b.b();
        if (hVarB == null) {
            hVarB = new h(bVar, str);
        } else {
            hVarB.g();
        }
        hVarB.i(bVar, str);
        int r3 = this.n;
        int r4 = s;
        if (r3 >= r4) {
            int r42 = r4 * 2;
            s = r42;
            this.m = (h[]) Arrays.copyOf(this.m, r42);
        }
        h[] hVarArr = this.m;
        int r43 = this.n;
        this.n = r43 + 1;
        hVarArr[r43] = hVarB;
        return hVarB;
    }

    private void a0() {
        int r0 = 0;
        while (true) {
            b[] bVarArr = this.f;
            if (r0 >= bVarArr.length) {
                return;
            }
            b bVar = bVarArr[r0];
            if (bVar != null) {
                this.l.f906a.a(bVar);
            }
            this.f[r0] = null;
            r0++;
        }
    }

    private final void c0(b bVar) {
        if (this.j > 0) {
            bVar.d.s(bVar, this.f);
            if (bVar.d.f900a == 0) {
                bVar.e = true;
            }
        }
    }

    private void h(b bVar) {
        bVar.d(this, 0);
    }

    private final void o(b bVar) {
        b[] bVarArr = this.f;
        int r1 = this.j;
        if (bVarArr[r1] != null) {
            this.l.f906a.a(bVarArr[r1]);
        }
        b[] bVarArr2 = this.f;
        int r12 = this.j;
        bVarArr2[r12] = bVar;
        h hVar = bVar.f903a;
        hVar.f920c = r12;
        this.j = r12 + 1;
        hVar.k(bVar);
    }

    private void p(b bVar, int r3) {
        q(bVar, r3, 0);
    }

    private void r() {
        for (int r0 = 0; r0 < this.j; r0++) {
            b bVar = this.f[r0];
            bVar.f903a.e = bVar.f904b;
        }
    }

    public static b w(e eVar, h hVar, h hVar2, int r12, float f, h hVar3, h hVar4, int r16, boolean z) {
        b bVarV = eVar.v();
        bVarV.g(hVar, hVar2, r12, f, hVar3, hVar4, r16);
        if (z) {
            bVarV.d(eVar, 4);
        }
        return bVarV;
    }

    public static b x(e eVar, h hVar, h hVar2, h hVar3, float f, boolean z) {
        b bVarV = eVar.v();
        if (z) {
            eVar.h(bVarV);
        }
        return bVarV.i(hVar, hVar2, hVar3, f);
    }

    public static b y(e eVar, h hVar, h hVar2, int r4, boolean z) {
        b bVarV = eVar.v();
        bVarV.n(hVar, hVar2, r4);
        if (z) {
            eVar.p(bVarV, 1);
        }
        return bVarV;
    }

    public static b z(e eVar, h hVar, h hVar2, int r5, boolean z) {
        h hVarB = eVar.B();
        b bVarV = eVar.v();
        bVarV.p(hVar, hVar2, hVarB, r5);
        if (z) {
            eVar.p(bVarV, (int) (bVarV.d.g(hVarB) * (-1.0f)));
        }
        return bVarV;
    }

    public h B() {
        f fVar = t;
        if (fVar != null) {
            fVar.n++;
        }
        if (this.i + 1 >= this.e) {
            W();
        }
        h hVarA = a(h.b.SLACK, null);
        int r1 = this.f909a + 1;
        this.f909a = r1;
        this.i++;
        hVarA.f919b = r1;
        this.l.f908c[r1] = hVarA;
        return hVarA;
    }

    void D() {
        F();
        String str = " #  ";
        for (int r1 = 0; r1 < this.j; r1++) {
            str = (str + this.f[r1].z()) + "\n #  ";
        }
        if (this.f911c != null) {
            str = str + this.f911c + "\n";
        }
        System.out.println(str);
    }

    void G() {
        int r2 = 0;
        for (int r1 = 0; r1 < this.d; r1++) {
            b[] bVarArr = this.f;
            if (bVarArr[r1] != null) {
                r2 += bVarArr[r1].y();
            }
        }
        int r3 = 0;
        for (int r12 = 0; r12 < this.j; r12++) {
            b[] bVarArr2 = this.f;
            if (bVarArr2[r12] != null) {
                r3 += bVarArr2[r12].y();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("Linear System -> Table size: ");
        sb.append(this.d);
        sb.append(" (");
        int r5 = this.d;
        sb.append(L(r5 * r5));
        sb.append(") -- row sizes: ");
        sb.append(L(r2));
        sb.append(", actual size: ");
        sb.append(L(r3));
        sb.append(" rows: ");
        sb.append(this.j);
        sb.append("/");
        sb.append(this.k);
        sb.append(" cols: ");
        sb.append(this.i);
        sb.append("/");
        sb.append(this.e);
        sb.append(" ");
        sb.append(0);
        sb.append(" occupied cells, ");
        sb.append(L(0));
        printStream.println(sb.toString());
    }

    public void H() {
        F();
        String str = "";
        for (int r1 = 0; r1 < this.j; r1++) {
            if (this.f[r1].f903a.g == h.b.UNRESTRICTED) {
                str = (str + this.f[r1].z()) + "\n";
            }
        }
        System.out.println(str + this.f911c + "\n");
    }

    public void J(f fVar) {
        t = fVar;
    }

    public c K() {
        return this.l;
    }

    a N() {
        return this.f911c;
    }

    public int O() {
        int r1 = 0;
        for (int r0 = 0; r0 < this.j; r0++) {
            b[] bVarArr = this.f;
            if (bVarArr[r0] != null) {
                r1 += bVarArr[r0].y();
            }
        }
        return r1;
    }

    public int Q() {
        return this.j;
    }

    public int R() {
        return this.f909a;
    }

    public int S(Object obj) {
        h hVarM = ((b.g.a.i.e) obj).m();
        if (hVarM != null) {
            return (int) (hVarM.e + 0.5f);
        }
        return 0;
    }

    b T(int r2) {
        return this.f[r2];
    }

    float U(String str) {
        h hVarV = V(str, h.b.UNRESTRICTED);
        if (hVarV == null) {
            return 0.0f;
        }
        return hVarV.e;
    }

    h V(String str, h.b bVar) {
        if (this.f910b == null) {
            this.f910b = new HashMap<>();
        }
        h hVar = this.f910b.get(str);
        return hVar == null ? C(str, bVar) : hVar;
    }

    public void X() throws Exception {
        f fVar = t;
        if (fVar != null) {
            fVar.e++;
        }
        if (this.g) {
            f fVar2 = t;
            if (fVar2 != null) {
                fVar2.r++;
            }
            boolean z = false;
            int r3 = 0;
            while (true) {
                if (r3 >= this.j) {
                    z = true;
                    break;
                } else if (!this.f[r3].e) {
                    break;
                } else {
                    r3++;
                }
            }
            if (z) {
                f fVar3 = t;
                if (fVar3 != null) {
                    fVar3.q++;
                }
                r();
                return;
            }
        }
        Y(this.f911c);
    }

    void Y(a aVar) throws Exception {
        f fVar = t;
        if (fVar != null) {
            fVar.t++;
            fVar.u = Math.max(fVar.u, this.i);
            f fVar2 = t;
            fVar2.v = Math.max(fVar2.v, this.j);
        }
        c0((b) aVar);
        I(aVar);
        Z(aVar, false);
        r();
    }

    public void b(b.g.a.i.h hVar, b.g.a.i.h hVar2, float f, int r22) {
        h hVarU = u(hVar.s(e.d.LEFT));
        h hVarU2 = u(hVar.s(e.d.TOP));
        h hVarU3 = u(hVar.s(e.d.RIGHT));
        h hVarU4 = u(hVar.s(e.d.BOTTOM));
        h hVarU5 = u(hVar2.s(e.d.LEFT));
        h hVarU6 = u(hVar2.s(e.d.TOP));
        h hVarU7 = u(hVar2.s(e.d.RIGHT));
        h hVarU8 = u(hVar2.s(e.d.BOTTOM));
        b bVarV = v();
        double d = f;
        double d2 = r22;
        bVarV.r(hVarU2, hVarU4, hVarU6, hVarU8, (float) (Math.sin(d) * d2));
        d(bVarV);
        b bVarV2 = v();
        bVarV2.r(hVarU, hVarU3, hVarU5, hVarU7, (float) (Math.cos(d) * d2));
        d(bVarV2);
    }

    public void b0() {
        c cVar;
        int r1 = 0;
        while (true) {
            cVar = this.l;
            h[] hVarArr = cVar.f908c;
            if (r1 >= hVarArr.length) {
                break;
            }
            h hVar = hVarArr[r1];
            if (hVar != null) {
                hVar.g();
            }
            r1++;
        }
        cVar.f907b.c(this.m, this.n);
        this.n = 0;
        Arrays.fill(this.l.f908c, (Object) null);
        HashMap<String, h> map = this.f910b;
        if (map != null) {
            map.clear();
        }
        this.f909a = 0;
        this.f911c.clear();
        this.i = 1;
        for (int r12 = 0; r12 < this.j; r12++) {
            this.f[r12].f905c = false;
        }
        a0();
        this.j = 0;
    }

    public void c(h hVar, h hVar2, int r14, float f, h hVar3, h hVar4, int r18, int r19) {
        b bVarV = v();
        bVarV.g(hVar, hVar2, r14, f, hVar3, hVar4, r18);
        if (r19 != 6) {
            bVarV.d(this, r19);
        }
        d(bVarV);
    }

    public void d(b bVar) {
        h hVarV;
        if (bVar == null) {
            return;
        }
        f fVar = t;
        if (fVar != null) {
            fVar.f++;
            if (bVar.e) {
                fVar.g++;
            }
        }
        boolean z = true;
        if (this.j + 1 >= this.k || this.i + 1 >= this.e) {
            W();
        }
        boolean z2 = false;
        if (!bVar.e) {
            c0(bVar);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.s();
            if (bVar.f(this)) {
                h hVarT = t();
                bVar.f903a = hVarT;
                o(bVar);
                this.p.a(bVar);
                Z(this.p, true);
                if (hVarT.f920c == -1) {
                    if (bVar.f903a == hVarT && (hVarV = bVar.v(hVarT)) != null) {
                        f fVar2 = t;
                        if (fVar2 != null) {
                            fVar2.j++;
                        }
                        bVar.w(hVarV);
                    }
                    if (!bVar.e) {
                        bVar.f903a.k(bVar);
                    }
                    this.j--;
                }
            } else {
                z = false;
            }
            if (!bVar.t()) {
                return;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            return;
        }
        o(bVar);
    }

    public b e(h hVar, h hVar2, int r4, int r5) {
        b bVarV = v();
        bVarV.n(hVar, hVar2, r4);
        if (r5 != 6) {
            bVarV.d(this, r5);
        }
        d(bVarV);
        return bVarV;
    }

    public void f(h hVar, int r4) {
        b bVarV;
        int r0 = hVar.f920c;
        if (r0 != -1) {
            b bVar = this.f[r0];
            if (!bVar.e) {
                if (bVar.d.f900a == 0) {
                    bVar.e = true;
                } else {
                    bVarV = v();
                    bVarV.m(hVar, r4);
                }
            }
            bVar.f904b = r4;
            return;
        }
        bVarV = v();
        bVarV.h(hVar, r4);
        d(bVarV);
    }

    public void g(h hVar, int r4, int r5) {
        b bVarV;
        int r0 = hVar.f920c;
        if (r0 != -1) {
            b bVar = this.f[r0];
            if (bVar.e) {
                bVar.f904b = r4;
                return;
            } else {
                bVarV = v();
                bVarV.m(hVar, r4);
            }
        } else {
            bVarV = v();
            bVarV.h(hVar, r4);
        }
        bVarV.d(this, r5);
        d(bVarV);
    }

    public void i(h hVar, h hVar2, boolean z) {
        b bVarV = v();
        h hVarB = B();
        hVarB.d = 0;
        bVarV.p(hVar, hVar2, hVarB, 0);
        if (z) {
            q(bVarV, (int) (bVarV.d.g(hVarB) * (-1.0f)), 1);
        }
        d(bVarV);
    }

    public void j(h hVar, int r5) {
        b bVarV = v();
        h hVarB = B();
        hVarB.d = 0;
        bVarV.o(hVar, r5, hVarB);
        d(bVarV);
    }

    public void k(h hVar, h hVar2, int r6, int r7) {
        b bVarV = v();
        h hVarB = B();
        hVarB.d = 0;
        bVarV.p(hVar, hVar2, hVarB, r6);
        if (r7 != 6) {
            q(bVarV, (int) (bVarV.d.g(hVarB) * (-1.0f)), r7);
        }
        d(bVarV);
    }

    public void l(h hVar, h hVar2, boolean z) {
        b bVarV = v();
        h hVarB = B();
        hVarB.d = 0;
        bVarV.q(hVar, hVar2, hVarB, 0);
        if (z) {
            q(bVarV, (int) (bVarV.d.g(hVarB) * (-1.0f)), 1);
        }
        d(bVarV);
    }

    public void m(h hVar, h hVar2, int r6, int r7) {
        b bVarV = v();
        h hVarB = B();
        hVarB.d = 0;
        bVarV.q(hVar, hVar2, hVarB, r6);
        if (r7 != 6) {
            q(bVarV, (int) (bVarV.d.g(hVarB) * (-1.0f)), r7);
        }
        d(bVarV);
    }

    public void n(h hVar, h hVar2, h hVar3, h hVar4, float f, int r13) {
        b bVarV = v();
        bVarV.j(hVar, hVar2, hVar3, hVar4, f);
        if (r13 != 6) {
            bVarV.d(this, r13);
        }
        d(bVarV);
    }

    void q(b bVar, int r3, int r4) {
        bVar.e(s(r4, null), r3);
    }

    public h s(int r6, String str) {
        f fVar = t;
        if (fVar != null) {
            fVar.m++;
        }
        if (this.i + 1 >= this.e) {
            W();
        }
        h hVarA = a(h.b.ERROR, str);
        int r0 = this.f909a + 1;
        this.f909a = r0;
        this.i++;
        hVarA.f919b = r0;
        hVarA.d = r6;
        this.l.f908c[r0] = hVarA;
        this.f911c.b(hVarA);
        return hVarA;
    }

    public h t() {
        f fVar = t;
        if (fVar != null) {
            fVar.o++;
        }
        if (this.i + 1 >= this.e) {
            W();
        }
        h hVarA = a(h.b.SLACK, null);
        int r1 = this.f909a + 1;
        this.f909a = r1;
        this.i++;
        hVarA.f919b = r1;
        this.l.f908c[r1] = hVarA;
        return hVarA;
    }

    public h u(Object obj) {
        h hVarM = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            W();
        }
        if (obj instanceof b.g.a.i.e) {
            b.g.a.i.e eVar = (b.g.a.i.e) obj;
            hVarM = eVar.m();
            if (hVarM == null) {
                eVar.A(this.l);
                hVarM = eVar.m();
            }
            int r4 = hVarM.f919b;
            if (r4 == -1 || r4 > this.f909a || this.l.f908c[r4] == null) {
                if (hVarM.f919b != -1) {
                    hVarM.g();
                }
                int r42 = this.f909a + 1;
                this.f909a = r42;
                this.i++;
                hVarM.f919b = r42;
                hVarM.g = h.b.UNRESTRICTED;
                this.l.f908c[r42] = hVarM;
            }
        }
        return hVarM;
    }

    public b v() {
        b bVarB = this.l.f906a.b();
        if (bVarB == null) {
            bVarB = new b(this.l);
        } else {
            bVarB.x();
        }
        h.e();
        return bVarB;
    }
}
