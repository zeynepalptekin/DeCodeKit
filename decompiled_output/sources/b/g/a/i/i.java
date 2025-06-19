package b.g.a.i;

import b.g.a.i.e;
import b.g.a.i.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class i extends s {
    private static final int A1 = 8;
    private static final boolean B1 = false;
    private static final boolean C1 = false;
    static final boolean D1 = false;
    private static final boolean z1 = true;
    private boolean d1;
    protected b.g.a.e e1;
    private r f1;
    int g1;
    int h1;
    int i1;
    int j1;
    int k1;
    int l1;
    d[] m1;
    d[] n1;
    public List<j> o1;
    public boolean p1;
    public boolean q1;
    public boolean r1;
    public int s1;
    public int t1;
    private int u1;
    public boolean v1;
    private boolean w1;
    private boolean x1;
    int y1;

    public i() {
        this.d1 = false;
        this.e1 = new b.g.a.e();
        this.k1 = 0;
        this.l1 = 0;
        this.m1 = new d[4];
        this.n1 = new d[4];
        this.o1 = new ArrayList();
        this.p1 = false;
        this.q1 = false;
        this.r1 = false;
        this.s1 = 0;
        this.t1 = 0;
        this.u1 = 7;
        this.v1 = false;
        this.w1 = false;
        this.x1 = false;
        this.y1 = 0;
    }

    public i(int r2, int r3) {
        super(r2, r3);
        this.d1 = false;
        this.e1 = new b.g.a.e();
        this.k1 = 0;
        this.l1 = 0;
        this.m1 = new d[4];
        this.n1 = new d[4];
        this.o1 = new ArrayList();
        this.p1 = false;
        this.q1 = false;
        this.r1 = false;
        this.s1 = 0;
        this.t1 = 0;
        this.u1 = 7;
        this.v1 = false;
        this.w1 = false;
        this.x1 = false;
        this.y1 = 0;
    }

    public i(int r1, int r2, int r3, int r4) {
        super(r1, r2, r3, r4);
        this.d1 = false;
        this.e1 = new b.g.a.e();
        this.k1 = 0;
        this.l1 = 0;
        this.m1 = new d[4];
        this.n1 = new d[4];
        this.o1 = new ArrayList();
        this.p1 = false;
        this.q1 = false;
        this.r1 = false;
        this.s1 = 0;
        this.t1 = 0;
        this.u1 = 7;
        this.v1 = false;
        this.w1 = false;
        this.x1 = false;
        this.y1 = 0;
    }

    private void b2(h hVar) {
        int r0 = this.k1 + 1;
        d[] dVarArr = this.n1;
        if (r0 >= dVarArr.length) {
            this.n1 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.n1[this.k1] = new d(hVar, 0, l2());
        this.k1++;
    }

    private void c2(h hVar) {
        int r0 = this.l1 + 1;
        d[] dVarArr = this.m1;
        if (r0 >= dVarArr.length) {
            this.m1 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.m1[this.l1] = new d(hVar, 1, l2());
        this.l1++;
    }

    private void s2() {
        this.k1 = 0;
        this.l1 = 0;
    }

    @Override // b.g.a.i.s, b.g.a.i.h
    public void I0() {
        this.e1.b0();
        this.g1 = 0;
        this.i1 = 0;
        this.h1 = 0;
        this.j1 = 0;
        this.o1.clear();
        this.v1 = false;
        super.I0();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02cb A[PHI: r0 r9
  0x02cb: PHI (r0v34 boolean) = (r0v33 boolean), (r0v36 boolean), (r0v36 boolean), (r0v36 boolean) binds: [B:115:0x028c, B:123:0x02b3, B:124:0x02b5, B:126:0x02bb] A[DONT_GENERATE, DONT_INLINE]
  0x02cb: PHI (r9v11 boolean) = (r9v10 boolean), (r9v12 boolean), (r9v12 boolean), (r9v12 boolean) binds: [B:115:0x028c, B:123:0x02b3, B:124:0x02b5, B:126:0x02bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d6  */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // b.g.a.i.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W1() {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.i.i.W1():void");
    }

    void Z1(h hVar, int r3) {
        if (r3 == 0) {
            b2(hVar);
        } else if (r3 == 1) {
            c2(hVar);
        }
    }

    public boolean a2(b.g.a.e eVar) {
        b(eVar);
        int size = this.c1.size();
        for (int r2 = 0; r2 < size; r2++) {
            h hVar = this.c1.get(r2);
            if (hVar instanceof i) {
                h.c[] cVarArr = hVar.E;
                h.c cVar = cVarArr[0];
                h.c cVar2 = cVarArr[1];
                if (cVar == h.c.WRAP_CONTENT) {
                    hVar.l1(h.c.FIXED);
                }
                if (cVar2 == h.c.WRAP_CONTENT) {
                    hVar.B1(h.c.FIXED);
                }
                hVar.b(eVar);
                if (cVar == h.c.WRAP_CONTENT) {
                    hVar.l1(cVar);
                }
                if (cVar2 == h.c.WRAP_CONTENT) {
                    hVar.B1(cVar2);
                }
            } else {
                m.c(this, eVar, hVar);
                hVar.b(eVar);
            }
        }
        if (this.k1 > 0) {
            c.a(this, eVar, 0);
        }
        if (this.l1 > 0) {
            c.a(this, eVar, 1);
        }
        return z1;
    }

    @Override // b.g.a.i.h
    public void d(int r4) {
        super.d(r4);
        int size = this.c1.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.c1.get(r1).d(r4);
        }
    }

    public void d2(b.g.a.f fVar) {
        this.e1.J(fVar);
    }

    public ArrayList<k> e2() {
        ArrayList<k> arrayList = new ArrayList<>();
        int size = this.c1.size();
        for (int r2 = 0; r2 < size; r2++) {
            h hVar = this.c1.get(r2);
            if (hVar instanceof k) {
                k kVar = (k) hVar;
                if (kVar.S1() == 0) {
                    arrayList.add(kVar);
                }
            }
        }
        return arrayList;
    }

    public int f2() {
        return this.u1;
    }

    public b.g.a.e g2() {
        return this.e1;
    }

    public ArrayList<k> h2() {
        ArrayList<k> arrayList = new ArrayList<>();
        int size = this.c1.size();
        for (int r2 = 0; r2 < size; r2++) {
            h hVar = this.c1.get(r2);
            if (hVar instanceof k) {
                k kVar = (k) hVar;
                if (kVar.S1() == 1) {
                    arrayList.add(kVar);
                }
            }
        }
        return arrayList;
    }

    public List<j> i2() {
        return this.o1;
    }

    @Override // b.g.a.i.h
    public String j0() {
        return "ConstraintLayout";
    }

    public boolean j2() {
        return false;
    }

    public boolean k2() {
        return this.x1;
    }

    public boolean l2() {
        return this.d1;
    }

    public boolean m2() {
        return this.w1;
    }

    public void n2() {
        if (!o2(8)) {
            d(this.u1);
        }
        x2();
    }

    public boolean o2(int r2) {
        if ((this.u1 & r2) == r2) {
            return z1;
        }
        return false;
    }

    public void p2(int r3, int r4) {
        p pVar;
        p pVar2;
        if (this.E[0] != h.c.WRAP_CONTENT && (pVar2 = this.f938c) != null) {
            pVar2.j(r3);
        }
        if (this.E[1] == h.c.WRAP_CONTENT || (pVar = this.d) == null) {
            return;
        }
        pVar.j(r4);
    }

    public void q2() {
        int size = this.c1.size();
        N0();
        for (int r1 = 0; r1 < size; r1++) {
            this.c1.get(r1).N0();
        }
    }

    public void r2() {
        q2();
        d(this.u1);
    }

    public void t2() {
        o oVarK = s(e.d.LEFT).k();
        o oVarK2 = s(e.d.TOP).k();
        oVarK.d();
        oVarK2.d();
        oVarK.n(null, 0.0f);
        oVarK2.n(null, 0.0f);
    }

    public void u2(int r1) {
        this.u1 = r1;
    }

    public void v2(int r1, int r2, int r3, int r4) {
        this.g1 = r1;
        this.h1 = r2;
        this.i1 = r3;
        this.j1 = r4;
    }

    public void w2(boolean z) {
        this.d1 = z;
    }

    public void x2() {
        o oVarK = s(e.d.LEFT).k();
        o oVarK2 = s(e.d.TOP).k();
        oVarK.n(null, 0.0f);
        oVarK2.n(null, 0.0f);
    }

    public void y2(b.g.a.e eVar, boolean[] zArr) {
        zArr[2] = false;
        N1(eVar);
        int size = this.c1.size();
        for (int r3 = 0; r3 < size; r3++) {
            h hVar = this.c1.get(r3);
            hVar.N1(eVar);
            if (hVar.E[0] == h.c.MATCH_CONSTRAINT && hVar.p0() < hVar.r0()) {
                zArr[2] = z1;
            }
            if (hVar.E[1] == h.c.MATCH_CONSTRAINT && hVar.J() < hVar.q0()) {
                zArr[2] = z1;
            }
        }
    }
}
