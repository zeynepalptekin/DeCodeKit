package b.g.a.i;

import b.g.a.i.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    private a() {
    }

    public static void a(i iVar) {
        if ((iVar.f2() & 32) != 32) {
            j(iVar);
            return;
        }
        iVar.v1 = true;
        iVar.p1 = false;
        iVar.q1 = false;
        iVar.r1 = false;
        ArrayList<h> arrayList = iVar.c1;
        List<j> list = iVar.o1;
        boolean z = iVar.N() == h.c.WRAP_CONTENT;
        boolean z2 = iVar.n0() == h.c.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (h hVar : arrayList) {
            hVar.r = null;
            hVar.s0 = false;
            hVar.N0();
        }
        for (h hVar2 : arrayList) {
            if (hVar2.r == null && !b(hVar2, list, z3)) {
                j(iVar);
                iVar.v1 = false;
                return;
            }
        }
        int r6 = 0;
        int r7 = 0;
        for (j jVar : list) {
            r6 = Math.max(r6, c(jVar, 0));
            r7 = Math.max(r7, c(jVar, 1));
        }
        if (z) {
            iVar.l1(h.c.FIXED);
            iVar.F1(r6);
            iVar.p1 = true;
            iVar.q1 = true;
            iVar.s1 = r6;
        }
        if (z2) {
            iVar.B1(h.c.FIXED);
            iVar.g1(r7);
            iVar.p1 = true;
            iVar.r1 = true;
            iVar.t1 = r7;
        }
        i(list, 0, iVar.p0());
        i(list, 1, iVar.J());
    }

    private static boolean b(h hVar, List<j> list, boolean z) {
        j jVar = new j(new ArrayList(), true);
        list.add(jVar);
        return k(hVar, jVar, list, z);
    }

    private static int c(j jVar, int r11) {
        int r0 = r11 * 2;
        List<h> listB = jVar.b(r11);
        int size = listB.size();
        int r5 = 0;
        for (int r4 = 0; r4 < size; r4++) {
            h hVar = listB.get(r4);
            e[] eVarArr = hVar.C;
            int r8 = r0 + 1;
            r5 = Math.max(r5, d(hVar, r11, eVarArr[r8].d == null || !(eVarArr[r0].d == null || eVarArr[r8].d == null), 0));
        }
        jVar.e[r11] = r5;
        return r5;
    }

    private static int d(h hVar, int r21, boolean z, int r23) {
        int r6;
        int r7;
        int r9;
        int r8;
        int r10;
        int r15;
        int r17;
        int r3;
        int r172;
        int r4 = 0;
        if (!hVar.q0) {
            return 0;
        }
        boolean z2 = hVar.y.d != null && r21 == 1;
        if (z) {
            r6 = hVar.u();
            r7 = hVar.J() - hVar.u();
            r8 = r21 * 2;
            r9 = r8 + 1;
        } else {
            r6 = hVar.J() - hVar.u();
            r7 = hVar.u();
            r9 = r21 * 2;
            r8 = r9 + 1;
        }
        e[] eVarArr = hVar.C;
        if (eVarArr[r9].d == null || eVarArr[r8].d != null) {
            r10 = 1;
        } else {
            r10 = -1;
            int r19 = r9;
            r9 = r8;
            r8 = r19;
        }
        int r11 = z2 ? r23 - r6 : r23;
        int r13 = (hVar.C[r8].g() * r10) + e(hVar, r21);
        int r112 = r11 + r13;
        int r14 = (r21 == 0 ? hVar.p0() : hVar.J()) * r10;
        Iterator<q> it = hVar.C[r8].k().f952a.iterator();
        while (it.hasNext()) {
            r4 = Math.max(r4, d(((o) it.next()).f.f927b, r21, z, r112));
        }
        int r152 = 0;
        for (Iterator<q> it2 = hVar.C[r9].k().f952a.iterator(); it2.hasNext(); it2 = it2) {
            r152 = Math.max(r152, d(((o) it2.next()).f.f927b, r21, z, r14 + r112));
        }
        if (z2) {
            r4 -= r6;
            r15 = r152 + r7;
        } else {
            r15 = r152 + ((r21 == 0 ? hVar.p0() : hVar.J()) * r10);
        }
        int r5 = 1;
        if (r21 == 1) {
            Iterator<q> it3 = hVar.y.k().f952a.iterator();
            int r18 = 0;
            while (it3.hasNext()) {
                Iterator<q> it4 = it3;
                o oVar = (o) it3.next();
                if (r10 == r5) {
                    r18 = Math.max(r18, d(oVar.f.f927b, r21, z, r6 + r112));
                    r172 = r9;
                } else {
                    r172 = r9;
                    r18 = Math.max(r18, d(oVar.f.f927b, r21, z, (r7 * r10) + r112));
                }
                it3 = it4;
                r9 = r172;
                r5 = 1;
            }
            r17 = r9;
            int r52 = r18;
            r3 = (hVar.y.k().f952a.size() <= 0 || z2) ? r52 : r10 == 1 ? r52 + r6 : r52 - r7;
        } else {
            r17 = r9;
            r3 = 0;
        }
        int r132 = r13 + Math.max(r4, Math.max(r15, r3));
        int r142 = r14 + r112;
        if (r10 == -1) {
            r142 = r112;
            r112 = r142;
        }
        if (z) {
            m.e(hVar, r21, r112);
            hVar.d1(r112, r142, r21);
        } else {
            hVar.r.a(hVar, r21);
            hVar.w1(r112, r21);
        }
        if (hVar.A(r21) == h.c.MATCH_CONSTRAINT && hVar.I != 0.0f) {
            hVar.r.a(hVar, r21);
        }
        e[] eVarArr2 = hVar.C;
        if (eVarArr2[r8].d != null && eVarArr2[r17].d != null) {
            h hVarA0 = hVar.a0();
            e[] eVarArr3 = hVar.C;
            if (eVarArr3[r8].d.f927b == hVarA0 && eVarArr3[r17].d.f927b == hVarA0) {
                hVar.r.a(hVar, r21);
            }
        }
        return r132;
    }

    private static int e(h hVar, int r5) {
        e eVar;
        int r0 = r5 * 2;
        e[] eVarArr = hVar.C;
        e eVar2 = eVarArr[r0];
        e eVar3 = eVarArr[r0 + 1];
        e eVar4 = eVar2.d;
        if (eVar4 == null) {
            return 0;
        }
        h hVar2 = eVar4.f927b;
        h hVar3 = hVar.F;
        if (hVar2 != hVar3 || (eVar = eVar3.d) == null || eVar.f927b != hVar3) {
            return 0;
        }
        return (int) ((((hVar3.T(r5) - eVar2.g()) - eVar3.g()) - hVar.T(r5)) * (r5 == 0 ? hVar.Z : hVar.a0));
    }

    private static void f(i iVar, h hVar, j jVar) {
        jVar.d = false;
        iVar.v1 = false;
        hVar.q0 = false;
    }

    private static int g(h hVar) {
        if (hVar.N() == h.c.MATCH_CONSTRAINT) {
            int r0 = (int) (hVar.J == 0 ? hVar.J() * hVar.I : hVar.J() / hVar.I);
            hVar.F1(r0);
            return r0;
        }
        if (hVar.n0() != h.c.MATCH_CONSTRAINT) {
            return -1;
        }
        int r02 = (int) (hVar.J == 1 ? hVar.p0() * hVar.I : hVar.p0() / hVar.I);
        hVar.g1(r02);
        return r02;
    }

    private static void h(e eVar) {
        o oVarK = eVar.k();
        e eVar2 = eVar.d;
        if (eVar2 == null || eVar2.d == eVar) {
            return;
        }
        eVar2.k().a(oVarK);
    }

    public static void i(List<j> list, int r6, int r7) {
        int size = list.size();
        for (int r1 = 0; r1 < size; r1++) {
            for (h hVar : list.get(r1).c(r6)) {
                if (hVar.q0) {
                    l(hVar, r6, r7);
                }
            }
        }
    }

    private static void j(i iVar) {
        iVar.o1.clear();
        iVar.o1.add(0, new j(iVar.c1));
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean k(b.g.a.i.h r8, b.g.a.i.j r9, java.util.List<b.g.a.i.j> r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.i.a.k(b.g.a.i.h, b.g.a.i.j, java.util.List, boolean):boolean");
    }

    private static void l(h hVar, int r7, int r8) {
        int r0 = r7 * 2;
        e[] eVarArr = hVar.C;
        e eVar = eVarArr[r0];
        e eVar2 = eVarArr[r0 + 1];
        if ((eVar.d == null || eVar2.d == null) ? false : true) {
            m.e(hVar, r7, e(hVar, r7) + eVar.g());
            return;
        }
        if (hVar.I == 0.0f || hVar.A(r7) != h.c.MATCH_CONSTRAINT) {
            int r82 = r8 - hVar.b0(r7);
            int r02 = r82 - hVar.T(r7);
            hVar.d1(r02, r82, r7);
            m.e(hVar, r7, r02);
            return;
        }
        int r83 = g(hVar);
        int r03 = (int) hVar.C[r0].k().k;
        eVar2.k().j = eVar.k();
        eVar2.k().k = r83;
        eVar2.k().f953b = 1;
        hVar.d1(r03, r03 + r83, r7);
    }
}
