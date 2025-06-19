package b.g.a.i;

import b.g.a.i.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b extends l {
    public static final int h1 = 0;
    public static final int i1 = 1;
    public static final int j1 = 2;
    public static final int k1 = 3;
    private int e1 = 0;
    private ArrayList<o> f1 = new ArrayList<>(4);
    private boolean g1 = true;

    @Override // b.g.a.i.h
    public void N0() {
        super.N0();
        this.f1.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[PHI: r9
  0x0051: PHI (r9v4 float) = (r9v3 float), (r9v5 float) binds: [B:27:0x004f, B:24:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    @Override // b.g.a.i.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P0() {
        /*
            r11 = this;
            int r0 = r11.e1
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L20
            if (r0 == r4) goto L18
            if (r0 == r3) goto L15
            if (r0 == r2) goto L12
            return
        L12:
            b.g.a.i.e r0 = r11.x
            goto L1a
        L15:
            b.g.a.i.e r0 = r11.v
            goto L22
        L18:
            b.g.a.i.e r0 = r11.w
        L1a:
            b.g.a.i.o r0 = r0.k()
            r1 = 0
            goto L26
        L20:
            b.g.a.i.e r0 = r11.u
        L22:
            b.g.a.i.o r0 = r0.k()
        L26:
            java.util.ArrayList<b.g.a.i.o> r5 = r11.f1
            int r5 = r5.size()
            r6 = 0
            r7 = 0
        L2e:
            if (r7 >= r5) goto L58
            java.util.ArrayList<b.g.a.i.o> r8 = r11.f1
            java.lang.Object r8 = r8.get(r7)
            b.g.a.i.o r8 = (b.g.a.i.o) r8
            int r9 = r8.f953b
            if (r9 == r4) goto L3d
            return
        L3d:
            int r9 = r11.e1
            if (r9 == 0) goto L4b
            if (r9 != r3) goto L44
            goto L4b
        L44:
            float r9 = r8.k
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 <= 0) goto L55
            goto L51
        L4b:
            float r9 = r8.k
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 >= 0) goto L55
        L51:
            b.g.a.i.o r1 = r8.j
            r6 = r1
            r1 = r9
        L55:
            int r7 = r7 + 1
            goto L2e
        L58:
            b.g.a.f r5 = b.g.a.e.P()
            if (r5 == 0) goto L69
            b.g.a.f r5 = b.g.a.e.P()
            long r7 = r5.z
            r9 = 1
            long r7 = r7 + r9
            r5.z = r7
        L69:
            r0.j = r6
            r0.k = r1
            r0.b()
            int r0 = r11.e1
            if (r0 == 0) goto L84
            if (r0 == r4) goto L81
            if (r0 == r3) goto L7e
            if (r0 == r2) goto L7b
            return
        L7b:
            b.g.a.i.e r0 = r11.v
            goto L86
        L7e:
            b.g.a.i.e r0 = r11.x
            goto L86
        L81:
            b.g.a.i.e r0 = r11.u
            goto L86
        L84:
            b.g.a.i.e r0 = r11.w
        L86:
            b.g.a.i.o r0 = r0.k()
            r0.n(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.i.b.P0():void");
    }

    public boolean R1() {
        return this.g1;
    }

    public void S1(boolean z) {
        this.g1 = z;
    }

    public void T1(int r1) {
        this.e1 = r1;
    }

    @Override // b.g.a.i.h
    public void b(b.g.a.e eVar) {
        e[] eVarArr;
        boolean z;
        b.g.a.h hVar;
        e eVar2;
        int r7;
        int r72;
        e[] eVarArr2 = this.C;
        eVarArr2[0] = this.u;
        eVarArr2[2] = this.v;
        eVarArr2[1] = this.w;
        eVarArr2[3] = this.x;
        int r0 = 0;
        while (true) {
            eVarArr = this.C;
            if (r0 >= eVarArr.length) {
                break;
            }
            eVarArr[r0].j = eVar.u(eVarArr[r0]);
            r0++;
        }
        int r02 = this.e1;
        if (r02 < 0 || r02 >= 4) {
            return;
        }
        e eVar3 = eVarArr[r02];
        for (int r1 = 0; r1 < this.d1; r1++) {
            h hVar2 = this.c1[r1];
            if ((this.g1 || hVar2.c()) && ((((r7 = this.e1) == 0 || r7 == 1) && hVar2.N() == h.c.MATCH_CONSTRAINT) || (((r72 = this.e1) == 2 || r72 == 3) && hVar2.n0() == h.c.MATCH_CONSTRAINT))) {
                z = true;
                break;
            }
        }
        z = false;
        int r6 = this.e1;
        if (r6 == 0 || r6 == 1 ? a0().N() == h.c.WRAP_CONTENT : a0().n0() == h.c.WRAP_CONTENT) {
            z = false;
        }
        for (int r62 = 0; r62 < this.d1; r62++) {
            h hVar3 = this.c1[r62];
            if (this.g1 || hVar3.c()) {
                b.g.a.h hVarU = eVar.u(hVar3.C[this.e1]);
                e[] eVarArr3 = hVar3.C;
                int r9 = this.e1;
                eVarArr3[r9].j = hVarU;
                if (r9 == 0 || r9 == 2) {
                    eVar.l(eVar3.j, hVarU, z);
                } else {
                    eVar.i(eVar3.j, hVarU, z);
                }
            }
        }
        int r03 = this.e1;
        if (r03 == 0) {
            eVar.e(this.w.j, this.u.j, 0, 6);
            if (z) {
                return;
            }
            hVar = this.u.j;
            eVar2 = this.F.w;
        } else if (r03 == 1) {
            eVar.e(this.u.j, this.w.j, 0, 6);
            if (z) {
                return;
            }
            hVar = this.u.j;
            eVar2 = this.F.u;
        } else if (r03 == 2) {
            eVar.e(this.x.j, this.v.j, 0, 6);
            if (z) {
                return;
            }
            hVar = this.v.j;
            eVar2 = this.F.x;
        } else {
            if (r03 != 3) {
                return;
            }
            eVar.e(this.v.j, this.x.j, 0, 6);
            if (z) {
                return;
            }
            hVar = this.v.j;
            eVar2 = this.F.v;
        }
        eVar.e(hVar, eVar2.j, 0, 5);
    }

    @Override // b.g.a.i.h
    public boolean c() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094 A[SYNTHETIC] */
    @Override // b.g.a.i.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r8) {
        /*
            r7 = this;
            b.g.a.i.h r8 = r7.F
            if (r8 != 0) goto L5
            return
        L5:
            b.g.a.i.i r8 = (b.g.a.i.i) r8
            r0 = 2
            boolean r8 = r8.o2(r0)
            if (r8 != 0) goto Lf
            return
        Lf:
            int r8 = r7.e1
            r1 = 3
            r2 = 1
            if (r8 == 0) goto L25
            if (r8 == r2) goto L22
            if (r8 == r0) goto L1f
            if (r8 == r1) goto L1c
            return
        L1c:
            b.g.a.i.e r8 = r7.x
            goto L27
        L1f:
            b.g.a.i.e r8 = r7.v
            goto L27
        L22:
            b.g.a.i.e r8 = r7.w
            goto L27
        L25:
            b.g.a.i.e r8 = r7.u
        L27:
            b.g.a.i.o r8 = r8.k()
            r3 = 5
            r8.r(r3)
            int r3 = r7.e1
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L44
            if (r3 != r2) goto L38
            goto L44
        L38:
            b.g.a.i.e r3 = r7.u
            b.g.a.i.o r3 = r3.k()
            r3.n(r5, r4)
            b.g.a.i.e r3 = r7.w
            goto L4f
        L44:
            b.g.a.i.e r3 = r7.v
            b.g.a.i.o r3 = r3.k()
            r3.n(r5, r4)
            b.g.a.i.e r3 = r7.x
        L4f:
            b.g.a.i.o r3 = r3.k()
            r3.n(r5, r4)
            java.util.ArrayList<b.g.a.i.o> r3 = r7.f1
            r3.clear()
            r3 = 0
        L5c:
            int r4 = r7.d1
            if (r3 >= r4) goto L97
            b.g.a.i.h[] r4 = r7.c1
            r4 = r4[r3]
            boolean r6 = r7.g1
            if (r6 != 0) goto L6f
            boolean r6 = r4.c()
            if (r6 != 0) goto L6f
            goto L94
        L6f:
            int r6 = r7.e1
            if (r6 == 0) goto L84
            if (r6 == r2) goto L81
            if (r6 == r0) goto L7e
            if (r6 == r1) goto L7b
            r4 = r5
            goto L8a
        L7b:
            b.g.a.i.e r4 = r4.x
            goto L86
        L7e:
            b.g.a.i.e r4 = r4.v
            goto L86
        L81:
            b.g.a.i.e r4 = r4.w
            goto L86
        L84:
            b.g.a.i.e r4 = r4.u
        L86:
            b.g.a.i.o r4 = r4.k()
        L8a:
            if (r4 == 0) goto L94
            java.util.ArrayList<b.g.a.i.o> r6 = r7.f1
            r6.add(r4)
            r4.a(r8)
        L94:
            int r3 = r3 + 1
            goto L5c
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.i.b.d(int):void");
    }
}
