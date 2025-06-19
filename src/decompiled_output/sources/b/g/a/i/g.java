package b.g.a.i;

import b.g.a.i.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class g extends i {
    public static final int N1 = 0;
    public static final int O1 = 1;
    public static final int P1 = 2;
    private static final int Q1 = 3;
    private boolean E1;
    private int F1;
    private int G1;
    private int H1;
    private ArrayList<b> I1;
    private ArrayList<a> J1;
    private ArrayList<k> K1;
    private ArrayList<k> L1;
    private b.g.a.e M1;

    class a {

        /* renamed from: a, reason: collision with root package name */
        h f930a;

        /* renamed from: b, reason: collision with root package name */
        h f931b;

        /* renamed from: c, reason: collision with root package name */
        int f932c;

        a() {
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        h f933a;

        /* renamed from: b, reason: collision with root package name */
        h f934b;

        /* renamed from: c, reason: collision with root package name */
        int f935c = 1;
        int d;

        b() {
        }
    }

    public g() {
        this.E1 = true;
        this.F1 = 0;
        this.G1 = 0;
        this.H1 = 8;
        this.I1 = new ArrayList<>();
        this.J1 = new ArrayList<>();
        this.K1 = new ArrayList<>();
        this.L1 = new ArrayList<>();
        this.M1 = null;
    }

    public g(int r1, int r2) {
        super(r1, r2);
        this.E1 = true;
        this.F1 = 0;
        this.G1 = 0;
        this.H1 = 8;
        this.I1 = new ArrayList<>();
        this.J1 = new ArrayList<>();
        this.K1 = new ArrayList<>();
        this.L1 = new ArrayList<>();
        this.M1 = null;
    }

    public g(int r1, int r2, int r3, int r4) {
        super(r1, r2, r3, r4);
        this.E1 = true;
        this.F1 = 0;
        this.G1 = 0;
        this.H1 = 8;
        this.I1 = new ArrayList<>();
        this.J1 = new ArrayList<>();
        this.K1 = new ArrayList<>();
        this.L1 = new ArrayList<>();
        this.M1 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void H2() {
        /*
            r11 = this;
            java.util.ArrayList<b.g.a.i.h> r0 = r11.c1
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r1 >= r0) goto Ld5
            java.util.ArrayList<b.g.a.i.h> r3 = r11.c1
            java.lang.Object r3 = r3.get(r1)
            b.g.a.i.h r3 = (b.g.a.i.h) r3
            int r4 = r3.y()
            int r2 = r2 + r4
            int r4 = r11.F1
            int r5 = r2 % r4
            int r4 = r2 / r4
            java.util.ArrayList<b.g.a.i.g$a> r6 = r11.J1
            java.lang.Object r4 = r6.get(r4)
            b.g.a.i.g$a r4 = (b.g.a.i.g.a) r4
            java.util.ArrayList<b.g.a.i.g$b> r6 = r11.I1
            java.lang.Object r5 = r6.get(r5)
            b.g.a.i.g$b r5 = (b.g.a.i.g.b) r5
            b.g.a.i.h r6 = r5.f933a
            b.g.a.i.h r7 = r5.f934b
            b.g.a.i.h r8 = r4.f930a
            b.g.a.i.h r4 = r4.f931b
            b.g.a.i.e$d r9 = b.g.a.i.e.d.LEFT
            b.g.a.i.e r9 = r3.s(r9)
            b.g.a.i.e$d r10 = b.g.a.i.e.d.LEFT
            b.g.a.i.e r6 = r6.s(r10)
            int r10 = r11.H1
            r9.a(r6, r10)
            boolean r6 = r7 instanceof b.g.a.i.k
            if (r6 == 0) goto L53
            b.g.a.i.e$d r6 = b.g.a.i.e.d.RIGHT
            b.g.a.i.e r6 = r3.s(r6)
            b.g.a.i.e$d r9 = b.g.a.i.e.d.LEFT
            goto L5b
        L53:
            b.g.a.i.e$d r6 = b.g.a.i.e.d.RIGHT
            b.g.a.i.e r6 = r3.s(r6)
            b.g.a.i.e$d r9 = b.g.a.i.e.d.RIGHT
        L5b:
            b.g.a.i.e r7 = r7.s(r9)
            int r9 = r11.H1
            r6.a(r7, r9)
            int r5 = r5.f935c
            r6 = 1
            if (r5 == r6) goto L8a
            r6 = 2
            if (r5 == r6) goto L76
            r6 = 3
            if (r5 == r6) goto L70
            goto La0
        L70:
            b.g.a.i.h$c r5 = b.g.a.i.h.c.MATCH_CONSTRAINT
            r3.l1(r5)
            goto La0
        L76:
            b.g.a.i.e$d r5 = b.g.a.i.e.d.LEFT
            b.g.a.i.e r5 = r3.s(r5)
            b.g.a.i.e$c r6 = b.g.a.i.e.c.WEAK
            r5.F(r6)
            b.g.a.i.e$d r5 = b.g.a.i.e.d.RIGHT
            b.g.a.i.e r5 = r3.s(r5)
            b.g.a.i.e$c r6 = b.g.a.i.e.c.STRONG
            goto L9d
        L8a:
            b.g.a.i.e$d r5 = b.g.a.i.e.d.LEFT
            b.g.a.i.e r5 = r3.s(r5)
            b.g.a.i.e$c r6 = b.g.a.i.e.c.STRONG
            r5.F(r6)
            b.g.a.i.e$d r5 = b.g.a.i.e.d.RIGHT
            b.g.a.i.e r5 = r3.s(r5)
            b.g.a.i.e$c r6 = b.g.a.i.e.c.WEAK
        L9d:
            r5.F(r6)
        La0:
            b.g.a.i.e$d r5 = b.g.a.i.e.d.TOP
            b.g.a.i.e r5 = r3.s(r5)
            b.g.a.i.e$d r6 = b.g.a.i.e.d.TOP
            b.g.a.i.e r6 = r8.s(r6)
            int r7 = r11.H1
            r5.a(r6, r7)
            boolean r5 = r4 instanceof b.g.a.i.k
            if (r5 == 0) goto Lbe
            b.g.a.i.e$d r5 = b.g.a.i.e.d.BOTTOM
            b.g.a.i.e r3 = r3.s(r5)
            b.g.a.i.e$d r5 = b.g.a.i.e.d.TOP
            goto Lc6
        Lbe:
            b.g.a.i.e$d r5 = b.g.a.i.e.d.BOTTOM
            b.g.a.i.e r3 = r3.s(r5)
            b.g.a.i.e$d r5 = b.g.a.i.e.d.BOTTOM
        Lc6:
            b.g.a.i.e r4 = r4.s(r5)
            int r5 = r11.H1
            r3.a(r4, r5)
            int r2 = r2 + 1
            int r1 = r1 + 1
            goto L8
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.i.g.H2():void");
    }

    private void K2() {
        this.J1.clear();
        float f = 100.0f / this.G1;
        h hVar = this;
        float f2 = f;
        for (int r2 = 0; r2 < this.G1; r2++) {
            a aVar = new a();
            aVar.f930a = hVar;
            if (r2 < this.G1 - 1) {
                k kVar = new k();
                kVar.f2(0);
                kVar.v1(this);
                kVar.d2((int) f2);
                f2 += f;
                aVar.f931b = kVar;
                this.L1.add(kVar);
            } else {
                aVar.f931b = this;
            }
            hVar = aVar.f931b;
            this.J1.add(aVar);
        }
        R2();
    }

    private void Q2() {
        this.I1.clear();
        float f = 100.0f / this.F1;
        h hVar = this;
        float f2 = f;
        for (int r0 = 0; r0 < this.F1; r0++) {
            b bVar = new b();
            bVar.f933a = hVar;
            if (r0 < this.F1 - 1) {
                k kVar = new k();
                kVar.f2(1);
                kVar.v1(this);
                kVar.d2((int) f2);
                f2 += f;
                bVar.f934b = kVar;
                this.K1.add(kVar);
            } else {
                bVar.f934b = this;
            }
            hVar = bVar.f934b;
            this.I1.add(bVar);
        }
        R2();
    }

    private void R2() {
        if (this.M1 == null) {
            return;
        }
        int size = this.K1.size();
        for (int r2 = 0; r2 < size; r2++) {
            this.K1.get(r2).U0(this.M1, z() + ".VG" + r2);
        }
        int size2 = this.L1.size();
        for (int r1 = 0; r1 < size2; r1++) {
            this.L1.get(r1).U0(this.M1, z() + ".HG" + r1);
        }
    }

    public void A2(int r4) {
        b bVar = this.I1.get(r4);
        int r0 = bVar.f935c;
        if (r0 == 0) {
            bVar.f935c = 2;
        } else if (r0 == 1) {
            bVar.f935c = 0;
        } else if (r0 == 2) {
            bVar.f935c = 1;
        }
        H2();
    }

    public String B2(int r2) {
        int r22 = this.I1.get(r2).f935c;
        return r22 == 1 ? "L" : r22 == 0 ? "C" : r22 == 3 ? "F" : r22 == 2 ? "R" : "!";
    }

    public String C2() {
        StringBuilder sb;
        String str;
        int size = this.I1.size();
        String string = "";
        for (int r2 = 0; r2 < size; r2++) {
            int r3 = this.I1.get(r2).f935c;
            if (r3 == 1) {
                sb = new StringBuilder();
                sb.append(string);
                str = "L";
            } else if (r3 == 0) {
                sb = new StringBuilder();
                sb.append(string);
                str = "C";
            } else if (r3 == 3) {
                sb = new StringBuilder();
                sb.append(string);
                str = "F";
            } else if (r3 == 2) {
                sb = new StringBuilder();
                sb.append(string);
                str = "R";
            }
            sb.append(str);
            string = sb.toString();
        }
        return string;
    }

    public int D2() {
        return this.F1;
    }

    public int E2() {
        return this.G1;
    }

    public int F2() {
        return this.H1;
    }

    public boolean G2() {
        return this.E1;
    }

    public void I2(int r2, int r3) {
        if (r2 < this.I1.size()) {
            this.I1.get(r2).f935c = r3;
            H2();
        }
    }

    public void J2(String str) {
        int r3;
        int length = str.length();
        for (int r2 = 0; r2 < length; r2++) {
            char cCharAt = str.charAt(r2);
            if (cCharAt == 'L') {
                r3 = 1;
            } else {
                if (cCharAt != 'C') {
                    if (cCharAt == 'F') {
                        r3 = 3;
                    } else if (cCharAt == 'R') {
                        r3 = 2;
                    }
                }
                I2(r2, 0);
            }
            I2(r2, r3);
        }
    }

    public void L2(int r2) {
        if (!this.E1 || this.F1 == r2) {
            return;
        }
        this.F1 = r2;
        Q2();
        O2();
    }

    public void M2(int r2) {
        if (this.E1 || this.F1 == r2) {
            return;
        }
        this.G1 = r2;
        K2();
        O2();
    }

    @Override // b.g.a.i.h
    public void N1(b.g.a.e eVar) {
        super.N1(eVar);
        if (eVar == this.e1) {
            int size = this.K1.size();
            for (int r2 = 0; r2 < size; r2++) {
                this.K1.get(r2).N1(eVar);
            }
            int size2 = this.L1.size();
            for (int r1 = 0; r1 < size2; r1++) {
                this.L1.get(r1).N1(eVar);
            }
        }
    }

    public void N2(int r2) {
        if (r2 > 1) {
            this.H1 = r2;
        }
    }

    public void O2() {
        int size = this.c1.size();
        int r2 = 0;
        for (int r1 = 0; r1 < size; r1++) {
            r2 += this.c1.get(r1).y();
        }
        int r0 = size + r2;
        if (this.E1) {
            if (this.F1 == 0) {
                L2(1);
            }
            int r12 = this.F1;
            int r3 = r0 / r12;
            if (r12 * r3 < r0) {
                r3++;
            }
            if (this.G1 == r3 && this.K1.size() == this.F1 - 1) {
                return;
            }
            this.G1 = r3;
            K2();
        } else {
            if (this.G1 == 0) {
                M2(1);
            }
            int r13 = this.G1;
            int r32 = r0 / r13;
            if (r13 * r32 < r0) {
                r32++;
            }
            if (this.F1 == r32 && this.L1.size() == this.G1 - 1) {
                return;
            }
            this.F1 = r32;
            Q2();
        }
        H2();
    }

    public void P2(boolean z) {
        this.E1 = z;
    }

    @Override // b.g.a.i.h
    public void U0(b.g.a.e eVar, String str) {
        this.M1 = eVar;
        super.U0(eVar, str);
        R2();
    }

    @Override // b.g.a.i.h
    public void b(b.g.a.e eVar) {
        super.b(eVar);
        int size = this.c1.size();
        if (size == 0) {
            return;
        }
        O2();
        if (eVar == this.e1) {
            int size2 = this.K1.size();
            int r3 = 0;
            while (true) {
                boolean z = true;
                if (r3 >= size2) {
                    break;
                }
                k kVar = this.K1.get(r3);
                if (N() != h.c.WRAP_CONTENT) {
                    z = false;
                }
                kVar.g2(z);
                kVar.b(eVar);
                r3++;
            }
            int size3 = this.L1.size();
            for (int r32 = 0; r32 < size3; r32++) {
                k kVar2 = this.L1.get(r32);
                kVar2.g2(n0() == h.c.WRAP_CONTENT);
                kVar2.b(eVar);
            }
            for (int r2 = 0; r2 < size; r2++) {
                this.c1.get(r2).b(eVar);
            }
        }
    }

    @Override // b.g.a.i.i
    public ArrayList<k> e2() {
        return this.L1;
    }

    @Override // b.g.a.i.i
    public ArrayList<k> h2() {
        return this.K1;
    }

    @Override // b.g.a.i.i, b.g.a.i.h
    public String j0() {
        return "ConstraintTableLayout";
    }

    @Override // b.g.a.i.i
    public boolean j2() {
        return true;
    }

    public void z2() {
        int size = this.K1.size();
        for (int r2 = 0; r2 < size; r2++) {
            this.K1.get(r2).Z1();
        }
        int size2 = this.L1.size();
        for (int r1 = 0; r1 < size2; r1++) {
            this.L1.get(r1).Z1();
        }
    }
}
