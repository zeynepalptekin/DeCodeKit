package b.g.a.i;

import b.g.a.i.e;
import b.g.a.i.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class k extends h {
    public static final int l1 = 0;
    public static final int m1 = 1;
    public static final int n1 = 0;
    public static final int o1 = 1;
    public static final int p1 = 2;
    public static final int q1 = -1;
    protected float c1 = -1.0f;
    protected int d1 = -1;
    protected int e1 = -1;
    private e f1 = this.v;
    private int g1 = 0;
    private boolean h1 = false;
    private int i1 = 0;
    private n j1 = new n();
    private int k1 = 8;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f944a;

        static {
            int[] r0 = new int[e.d.values().length];
            f944a = r0;
            try {
                r0[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f944a[e.d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f944a[e.d.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f944a[e.d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f944a[e.d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f944a[e.d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f944a[e.d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f944a[e.d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f944a[e.d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public k() {
        this.D.clear();
        this.D.add(this.f1);
        int length = this.C.length;
        for (int r0 = 0; r0 < length; r0++) {
            this.C[r0] = this.f1;
        }
    }

    @Override // b.g.a.i.h
    public void N1(b.g.a.e eVar) {
        if (a0() == null) {
            return;
        }
        int r4 = eVar.S(this.f1);
        if (this.g1 == 1) {
            J1(r4);
            K1(0);
            g1(a0().J());
            F1(0);
            return;
        }
        J1(0);
        K1(r4);
        F1(a0().p0());
        g1(0);
    }

    public void P1() {
        if (this.d1 != -1) {
            Z1();
        } else if (this.c1 != -1.0f) {
            Y1();
        } else if (this.e1 != -1) {
            X1();
        }
    }

    public e Q1() {
        return this.f1;
    }

    public n R1() {
        n nVar = this.j1;
        int r1 = H() - this.k1;
        int I = I();
        int r3 = this.k1;
        nVar.f(r1, I - (r3 * 2), r3 * 2, r3 * 2);
        if (S1() == 0) {
            n nVar2 = this.j1;
            int r12 = H() - (this.k1 * 2);
            int I2 = I();
            int r32 = this.k1;
            nVar2.f(r12, I2 - r32, r32 * 2, r32 * 2);
        }
        return this.j1;
    }

    public int S1() {
        return this.g1;
    }

    public int T1() {
        return this.d1;
    }

    public int U1() {
        if (this.c1 != -1.0f) {
            return 0;
        }
        if (this.d1 != -1) {
            return 1;
        }
        return this.e1 != -1 ? 2 : -1;
    }

    public int V1() {
        return this.e1;
    }

    public float W1() {
        return this.c1;
    }

    void X1() {
        int r0 = s0();
        if (this.g1 == 0) {
            r0 = t0();
        }
        a2(r0);
    }

    void Y1() {
        int r0 = a0().p0() - s0();
        if (this.g1 == 0) {
            r0 = a0().J() - t0();
        }
        b2(r0);
    }

    @Override // b.g.a.i.h
    public void Z0(int r5, int r6) {
        float f;
        int r62;
        if (this.g1 == 1) {
            int r52 = r5 - this.S;
            if (this.d1 != -1) {
                a2(r52);
                return;
            } else if (this.e1 != -1) {
                b2(a0().p0() - r52);
                return;
            } else {
                if (this.c1 == -1.0f) {
                    return;
                }
                f = r52;
                r62 = a0().p0();
            }
        } else {
            int r63 = r6 - this.T;
            if (this.d1 != -1) {
                a2(r63);
                return;
            } else if (this.e1 != -1) {
                b2(a0().J() - r63);
                return;
            } else {
                if (this.c1 == -1.0f) {
                    return;
                }
                f = r63;
                r62 = a0().J();
            }
        }
        c2(f / r62);
    }

    void Z1() {
        float fS0 = s0() / a0().p0();
        if (this.g1 == 0) {
            fS0 = t0() / a0().J();
        }
        c2(fS0);
    }

    public void a2(int r3) {
        if (r3 > -1) {
            this.c1 = -1.0f;
            this.d1 = r3;
            this.e1 = -1;
        }
    }

    @Override // b.g.a.i.h
    public void b(b.g.a.e eVar) {
        i iVar = (i) a0();
        if (iVar == null) {
            return;
        }
        e eVarS = iVar.s(e.d.LEFT);
        e eVarS2 = iVar.s(e.d.RIGHT);
        h hVar = this.F;
        boolean z = hVar != null && hVar.E[0] == h.c.WRAP_CONTENT;
        if (this.g1 == 0) {
            eVarS = iVar.s(e.d.TOP);
            eVarS2 = iVar.s(e.d.BOTTOM);
            h hVar2 = this.F;
            z = hVar2 != null && hVar2.E[1] == h.c.WRAP_CONTENT;
        }
        if (this.d1 != -1) {
            b.g.a.h hVarU = eVar.u(this.f1);
            eVar.e(hVarU, eVar.u(eVarS), this.d1, 6);
            if (z) {
                eVar.k(eVar.u(eVarS2), hVarU, 0, 5);
                return;
            }
            return;
        }
        if (this.e1 == -1) {
            if (this.c1 != -1.0f) {
                eVar.d(b.g.a.e.x(eVar, eVar.u(this.f1), eVar.u(eVarS), eVar.u(eVarS2), this.c1, this.h1));
                return;
            }
            return;
        }
        b.g.a.h hVarU2 = eVar.u(this.f1);
        b.g.a.h hVarU3 = eVar.u(eVarS2);
        eVar.e(hVarU2, hVarU3, -this.e1, 6);
        if (z) {
            eVar.k(hVarU2, eVar.u(eVarS), 0, 5);
            eVar.k(hVarU3, hVarU2, 0, 5);
        }
    }

    public void b2(int r3) {
        if (r3 > -1) {
            this.c1 = -1.0f;
            this.d1 = -1;
            this.e1 = r3;
        }
    }

    @Override // b.g.a.i.h
    public boolean c() {
        return true;
    }

    public void c2(float f) {
        if (f > -1.0f) {
            this.c1 = f;
            this.d1 = -1;
            this.e1 = -1;
        }
    }

    @Override // b.g.a.i.h
    public void d(int r7) {
        int r0;
        o oVarK;
        e eVar;
        o oVarK2;
        e eVar2;
        e eVar3;
        o oVarK3;
        int r1;
        h hVarA0 = a0();
        if (hVarA0 == null) {
            return;
        }
        if (S1() == 1) {
            this.v.k().j(1, hVarA0.v.k(), 0);
            this.x.k().j(1, hVarA0.v.k(), 0);
            if (this.d1 != -1) {
                this.u.k().j(1, hVarA0.u.k(), this.d1);
                oVarK2 = this.w.k();
                eVar3 = hVarA0.u;
                oVarK3 = eVar3.k();
                r1 = this.d1;
            } else {
                if (this.e1 == -1) {
                    if (this.c1 == -1.0f || hVarA0.N() != h.c.FIXED) {
                        return;
                    }
                    r0 = (int) (hVarA0.G * this.c1);
                    this.u.k().j(1, hVarA0.u.k(), r0);
                    oVarK = this.w.k();
                    eVar = hVarA0.u;
                    oVarK.j(1, eVar.k(), r0);
                    return;
                }
                this.u.k().j(1, hVarA0.w.k(), -this.e1);
                oVarK2 = this.w.k();
                eVar2 = hVarA0.w;
                oVarK3 = eVar2.k();
                r1 = -this.e1;
            }
        } else {
            this.u.k().j(1, hVarA0.u.k(), 0);
            this.w.k().j(1, hVarA0.u.k(), 0);
            if (this.d1 != -1) {
                this.v.k().j(1, hVarA0.v.k(), this.d1);
                oVarK2 = this.x.k();
                eVar3 = hVarA0.v;
                oVarK3 = eVar3.k();
                r1 = this.d1;
            } else {
                if (this.e1 == -1) {
                    if (this.c1 == -1.0f || hVarA0.n0() != h.c.FIXED) {
                        return;
                    }
                    r0 = (int) (hVarA0.H * this.c1);
                    this.v.k().j(1, hVarA0.v.k(), r0);
                    oVarK = this.x.k();
                    eVar = hVarA0.v;
                    oVarK.j(1, eVar.k(), r0);
                    return;
                }
                this.v.k().j(1, hVarA0.x.k(), -this.e1);
                oVarK2 = this.x.k();
                eVar2 = hVarA0.x;
                oVarK3 = eVar2.k();
                r1 = -this.e1;
            }
        }
        oVarK2.j(1, oVarK3, r1);
    }

    public void d2(int r2) {
        c2(r2 / 100.0f);
    }

    public void e2(int r1) {
        this.i1 = r1;
    }

    public void f2(int r4) {
        if (this.g1 == r4) {
            return;
        }
        this.g1 = r4;
        this.D.clear();
        this.f1 = this.g1 == 1 ? this.u : this.v;
        this.D.add(this.f1);
        int length = this.C.length;
        for (int r0 = 0; r0 < length; r0++) {
            this.C[r0] = this.f1;
        }
    }

    public void g2(boolean z) {
        if (this.h1 == z) {
            return;
        }
        this.h1 = z;
    }

    @Override // b.g.a.i.h
    public String j0() {
        return "Guideline";
    }

    @Override // b.g.a.i.h
    public e s(e.d dVar) {
        switch (a.f944a[dVar.ordinal()]) {
            case 1:
            case 2:
                if (this.g1 == 1) {
                    return this.f1;
                }
                break;
            case 3:
            case 4:
                if (this.g1 == 0) {
                    return this.f1;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(dVar.name());
    }

    @Override // b.g.a.i.h
    public ArrayList<e> t() {
        return this.D;
    }
}
