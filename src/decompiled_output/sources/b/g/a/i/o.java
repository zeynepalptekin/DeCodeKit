package b.g.a.i;

import b.g.a.i.e;

/* loaded from: classes.dex */
public class o extends q {
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 3;
    public static final int w = 4;
    public static final int x = 5;
    e f;
    float g;
    o h;
    float i;
    o j;
    float k;
    private o m;
    private float n;
    int l = 0;
    private p o = null;
    private int p = 1;
    private p q = null;
    private int r = 1;

    public o(e eVar) {
        this.f = eVar;
    }

    @Override // b.g.a.i.q
    public void f(p pVar) {
        p pVar2 = this.o;
        if (pVar2 == pVar) {
            this.o = null;
            this.i = this.p;
        } else if (pVar2 == this.q) {
            this.q = null;
            this.n = this.r;
        }
        h();
    }

    @Override // b.g.a.i.q
    public void g() {
        super.g();
        this.h = null;
        this.i = 0.0f;
        this.o = null;
        this.p = 1;
        this.q = null;
        this.r = 1;
        this.j = null;
        this.k = 0.0f;
        this.g = 0.0f;
        this.m = null;
        this.n = 0.0f;
        this.l = 0;
    }

    @Override // b.g.a.i.q
    public void h() {
        o oVar;
        o oVar2;
        o oVar3;
        o oVar4;
        o oVar5;
        o oVar6;
        float f;
        o oVar7;
        float fP0;
        float f2;
        o oVar8;
        float f3;
        boolean z = true;
        if (this.f953b == 1 || this.l == 4) {
            return;
        }
        p pVar = this.o;
        if (pVar != null) {
            if (pVar.f953b != 1) {
                return;
            } else {
                this.i = this.p * pVar.f;
            }
        }
        p pVar2 = this.q;
        if (pVar2 != null) {
            if (pVar2.f953b != 1) {
                return;
            } else {
                this.n = this.r * pVar2.f;
            }
        }
        if (this.l == 1 && ((oVar8 = this.h) == null || oVar8.f953b == 1)) {
            o oVar9 = this.h;
            if (oVar9 == null) {
                this.j = this;
                f3 = this.i;
            } else {
                this.j = oVar9.j;
                f3 = oVar9.k + this.i;
            }
            this.k = f3;
            b();
            return;
        }
        if (this.l == 2 && (oVar4 = this.h) != null && oVar4.f953b == 1 && (oVar5 = this.m) != null && (oVar6 = oVar5.h) != null && oVar6.f953b == 1) {
            if (b.g.a.e.P() != null) {
                b.g.a.e.P().w++;
            }
            this.j = this.h.j;
            o oVar10 = this.m;
            oVar10.j = oVar10.h.j;
            e.d dVar = this.f.f928c;
            int r3 = 0;
            if (dVar != e.d.RIGHT && dVar != e.d.BOTTOM) {
                z = false;
            }
            if (z) {
                f = this.h.k;
                oVar7 = this.m.h;
            } else {
                f = this.m.h.k;
                oVar7 = this.h;
            }
            float f4 = f - oVar7.k;
            e.d dVar2 = this.f.f928c;
            if (dVar2 == e.d.LEFT || dVar2 == e.d.RIGHT) {
                fP0 = f4 - this.f.f927b.p0();
                f2 = this.f.f927b.Z;
            } else {
                fP0 = f4 - r2.f927b.J();
                f2 = this.f.f927b.a0;
            }
            int r4 = this.f.g();
            int r5 = this.m.f.g();
            if (this.f.o() == this.m.f.o()) {
                f2 = 0.5f;
                r5 = 0;
            } else {
                r3 = r4;
            }
            float f5 = r3;
            float f6 = r5;
            float f7 = (fP0 - f5) - f6;
            if (z) {
                o oVar11 = this.m;
                oVar11.k = oVar11.h.k + f6 + (f7 * f2);
                this.k = (this.h.k - f5) - (f7 * (1.0f - f2));
            } else {
                this.k = this.h.k + f5 + (f7 * f2);
                o oVar12 = this.m;
                oVar12.k = (oVar12.h.k - f6) - (f7 * (1.0f - f2));
            }
        } else {
            if (this.l != 3 || (oVar = this.h) == null || oVar.f953b != 1 || (oVar2 = this.m) == null || (oVar3 = oVar2.h) == null || oVar3.f953b != 1) {
                if (this.l == 5) {
                    this.f.f927b.P0();
                    return;
                }
                return;
            }
            if (b.g.a.e.P() != null) {
                b.g.a.e.P().x++;
            }
            o oVar13 = this.h;
            this.j = oVar13.j;
            o oVar14 = this.m;
            o oVar15 = oVar14.h;
            oVar14.j = oVar15.j;
            this.k = oVar13.k + this.i;
            oVar14.k = oVar15.k + oVar14.i;
        }
        b();
        this.m.b();
    }

    void i(b.g.a.e eVar) {
        b.g.a.h hVarM = this.f.m();
        o oVar = this.j;
        if (oVar == null) {
            eVar.f(hVarM, (int) (this.k + 0.5f));
        } else {
            eVar.e(hVarM, eVar.u(oVar.f), (int) (this.k + 0.5f), 6);
        }
    }

    public void j(int r1, o oVar, int r3) {
        this.l = r1;
        this.h = oVar;
        this.i = r3;
        oVar.a(this);
    }

    public void k(o oVar, int r2) {
        this.h = oVar;
        this.i = r2;
        oVar.a(this);
    }

    public void l(o oVar, int r2, p pVar) {
        this.h = oVar;
        oVar.a(this);
        this.o = pVar;
        this.p = r2;
        pVar.a(this);
    }

    public float m() {
        return this.k;
    }

    public void n(o oVar, float f) {
        if (this.f953b == 0 || !(this.j == oVar || this.k == f)) {
            this.j = oVar;
            this.k = f;
            if (this.f953b == 1) {
                c();
            }
            b();
        }
    }

    String o(int r2) {
        return r2 == 1 ? "DIRECT" : r2 == 2 ? "CENTER" : r2 == 3 ? "MATCH" : r2 == 4 ? "CHAIN" : r2 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public void p(o oVar, float f) {
        this.m = oVar;
        this.n = f;
    }

    public void q(o oVar, int r2, p pVar) {
        this.m = oVar;
        this.q = pVar;
        this.r = r2;
    }

    public void r(int r1) {
        this.l = r1;
    }

    public void s() {
        e eVarO = this.f.o();
        if (eVarO == null) {
            return;
        }
        if (eVarO.o() == this.f) {
            this.l = 4;
            eVarO.k().l = 4;
        }
        int r1 = this.f.g();
        e.d dVar = this.f.f928c;
        if (dVar == e.d.RIGHT || dVar == e.d.BOTTOM) {
            r1 = -r1;
        }
        k(eVarO.k(), r1);
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (this.f953b != 1) {
            sb = new StringBuilder();
            sb.append("{ ");
            sb.append(this.f);
            str = " UNRESOLVED} type: ";
        } else if (this.j == this) {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f);
            sb.append(", RESOLVED: ");
            sb.append(this.k);
            str = "]  type: ";
        } else {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f);
            sb.append(", RESOLVED: ");
            sb.append(this.j);
            sb.append(":");
            sb.append(this.k);
            str = "] type: ";
        }
        sb.append(str);
        sb.append(o(this.l));
        return sb.toString();
    }
}
