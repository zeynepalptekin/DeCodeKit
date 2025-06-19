package b.g.a.i;

import androidx.appcompat.widget.ActivityChooserView;
import b.g.a.i.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class h {
    private static final boolean C0 = false;
    protected static final int D0 = 1;
    protected static final int E0 = 2;
    public static final int F0 = 0;
    public static final int G0 = 1;
    public static final int H0 = 2;
    public static final int I0 = 3;
    public static final int J0 = 4;
    public static final int K0 = -1;
    public static final int L0 = 0;
    public static final int M0 = 1;
    public static final int N0 = 0;
    public static final int O0 = 4;
    public static final int P0 = 8;
    public static final int Q0 = 0;
    public static final int R0 = 1;
    public static final int S0 = 2;
    private static final int T0 = -2;
    protected static final int U0 = 0;
    protected static final int V0 = 1;
    protected static final int W0 = 2;
    protected static final int X0 = 3;
    protected static final int Y0 = 4;
    static final int Z0 = 0;
    static final int a1 = 1;
    public static float b1 = 0.5f;
    e A;
    h A0;
    e B;
    h B0;
    protected e[] C;
    protected ArrayList<e> D;
    protected c[] E;
    h F;
    int G;
    int H;
    protected float I;
    protected int J;
    protected int K;
    protected int L;
    int M;
    int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    protected int S;
    protected int T;
    int U;
    protected int V;
    protected int W;
    private int X;
    private int Y;
    float Z;

    /* renamed from: a, reason: collision with root package name */
    public int f936a;
    float a0;

    /* renamed from: b, reason: collision with root package name */
    public int f937b;
    private Object b0;

    /* renamed from: c, reason: collision with root package name */
    p f938c;
    private int c0;
    p d;
    private int d0;
    int e;
    private String e0;
    int f;
    private String f0;
    int[] g;
    int g0;
    int h;
    int h0;
    int i;
    int i0;
    float j;
    int j0;
    int k;
    boolean k0;
    int l;
    boolean l0;
    float m;
    boolean m0;
    boolean n;
    boolean n0;
    boolean o;
    boolean o0;
    int p;
    boolean p0;
    float q;
    boolean q0;
    j r;
    boolean r0;
    private int[] s;
    boolean s0;
    private float t;
    int t0;
    e u;
    int u0;
    e v;
    boolean v0;
    e w;
    boolean w0;
    e x;
    float[] x0;
    e y;
    protected h[] y0;
    e z;
    protected h[] z0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f939a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f940b;

        static {
            int[] r0 = new int[c.values().length];
            f940b = r0;
            try {
                r0[c.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f940b[c.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f940b[c.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f940b[c.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] r4 = new int[e.d.values().length];
            f939a = r4;
            try {
                r4[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f939a[e.d.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f939a[e.d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f939a[e.d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f939a[e.d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f939a[e.d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f939a[e.d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f939a[e.d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f939a[e.d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        BEGIN,
        MIDDLE,
        END,
        TOP,
        VERTICAL_MIDDLE,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public enum c {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public h() {
        this.f936a = -1;
        this.f937b = -1;
        this.e = 0;
        this.f = 0;
        this.g = new int[2];
        this.h = 0;
        this.i = 0;
        this.j = 1.0f;
        this.k = 0;
        this.l = 0;
        this.m = 1.0f;
        this.p = -1;
        this.q = 1.0f;
        this.r = null;
        this.s = new int[]{ActivityChooserView.f.j, ActivityChooserView.f.j};
        this.t = 0.0f;
        this.u = new e(this, e.d.LEFT);
        this.v = new e(this, e.d.TOP);
        this.w = new e(this, e.d.RIGHT);
        this.x = new e(this, e.d.BOTTOM);
        this.y = new e(this, e.d.BASELINE);
        this.z = new e(this, e.d.CENTER_X);
        this.A = new e(this, e.d.CENTER_Y);
        e eVar = new e(this, e.d.CENTER);
        this.B = eVar;
        this.C = new e[]{this.u, this.w, this.v, this.x, this.y, eVar};
        this.D = new ArrayList<>();
        c cVar = c.FIXED;
        this.E = new c[]{cVar, cVar};
        this.F = null;
        this.G = 0;
        this.H = 0;
        this.I = 0.0f;
        this.J = -1;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        float f = b1;
        this.Z = f;
        this.a0 = f;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = null;
        this.f0 = null;
        this.q0 = false;
        this.r0 = false;
        this.s0 = false;
        this.t0 = 0;
        this.u0 = 0;
        this.x0 = new float[]{-1.0f, -1.0f};
        this.y0 = new h[]{null, null};
        this.z0 = new h[]{null, null};
        this.A0 = null;
        this.B0 = null;
        a();
    }

    public h(int r2, int r3) {
        this(0, 0, r2, r3);
    }

    public h(int r11, int r12, int r13, int r14) {
        this.f936a = -1;
        this.f937b = -1;
        this.e = 0;
        this.f = 0;
        this.g = new int[2];
        this.h = 0;
        this.i = 0;
        this.j = 1.0f;
        this.k = 0;
        this.l = 0;
        this.m = 1.0f;
        this.p = -1;
        this.q = 1.0f;
        this.r = null;
        this.s = new int[]{ActivityChooserView.f.j, ActivityChooserView.f.j};
        this.t = 0.0f;
        this.u = new e(this, e.d.LEFT);
        this.v = new e(this, e.d.TOP);
        this.w = new e(this, e.d.RIGHT);
        this.x = new e(this, e.d.BOTTOM);
        this.y = new e(this, e.d.BASELINE);
        this.z = new e(this, e.d.CENTER_X);
        this.A = new e(this, e.d.CENTER_Y);
        e eVar = new e(this, e.d.CENTER);
        this.B = eVar;
        this.C = new e[]{this.u, this.w, this.v, this.x, this.y, eVar};
        this.D = new ArrayList<>();
        c cVar = c.FIXED;
        this.E = new c[]{cVar, cVar};
        this.F = null;
        this.G = 0;
        this.H = 0;
        this.I = 0.0f;
        this.J = -1;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        float f = b1;
        this.Z = f;
        this.a0 = f;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = null;
        this.f0 = null;
        this.q0 = false;
        this.r0 = false;
        this.s0 = false;
        this.t0 = 0;
        this.u0 = 0;
        this.x0 = new float[]{-1.0f, -1.0f};
        this.y0 = new h[]{null, null};
        this.z0 = new h[]{null, null};
        this.A0 = null;
        this.B0 = null;
        this.K = r11;
        this.L = r12;
        this.G = r13;
        this.H = r14;
        a();
        r();
    }

    private void a() {
        this.D.add(this.u);
        this.D.add(this.v);
        this.D.add(this.w);
        this.D.add(this.x);
        this.D.add(this.z);
        this.D.add(this.A);
        this.D.add(this.B);
        this.D.add(this.y);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c1 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e(b.g.a.e r24, boolean r25, b.g.a.h r26, b.g.a.h r27, b.g.a.i.h.c r28, boolean r29, b.g.a.i.e r30, b.g.a.i.e r31, int r32, int r33, int r34, int r35, float r36, boolean r37, boolean r38, int r39, int r40, int r41, float r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.i.h.e(b.g.a.e, boolean, b.g.a.h, b.g.a.h, b.g.a.i.h$c, boolean, b.g.a.i.e, b.g.a.i.e, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    private boolean x0(int r5) {
        int r52 = r5 * 2;
        e[] eVarArr = this.C;
        if (eVarArr[r52].d != null && eVarArr[r52].d.d != eVarArr[r52]) {
            int r53 = r52 + 1;
            if (eVarArr[r53].d != null && eVarArr[r53].d.d == eVarArr[r53]) {
                return true;
            }
        }
        return false;
    }

    public c A(int r2) {
        if (r2 == 0) {
            return N();
        }
        if (r2 == 1) {
            return n0();
        }
        return null;
    }

    public boolean A0() {
        e eVar = this.u;
        e eVar2 = eVar.d;
        if (eVar2 != null && eVar2.d == eVar) {
            return true;
        }
        e eVar3 = this.w;
        e eVar4 = eVar3.d;
        return eVar4 != null && eVar4.d == eVar3;
    }

    public void A1(int r1, int r2) {
        this.L = r1;
        int r22 = r2 - r1;
        this.H = r22;
        int r12 = this.W;
        if (r22 < r12) {
            this.H = r12;
        }
    }

    public float B() {
        return this.I;
    }

    public boolean B0() {
        e eVar = this.v;
        e eVar2 = eVar.d;
        if (eVar2 != null && eVar2.d == eVar) {
            return true;
        }
        e eVar3 = this.x;
        e eVar4 = eVar3.d;
        return eVar4 != null && eVar4.d == eVar3;
    }

    public void B1(c cVar) {
        this.E[1] = cVar;
        if (cVar == c.WRAP_CONTENT) {
            g1(this.Y);
        }
    }

    public int C() {
        return this.J;
    }

    public boolean C0() {
        h hVarA0 = a0();
        if (hVarA0 == null) {
            return false;
        }
        while (hVarA0 != null) {
            if (hVarA0 instanceof i) {
                return true;
            }
            hVarA0 = hVarA0.a0();
        }
        return false;
    }

    public void C1(int r1, int r2, int r3, float f) {
        this.f = r1;
        this.k = r2;
        this.l = r3;
        this.m = f;
        if (f >= 1.0f || r1 != 0) {
            return;
        }
        this.f = 2;
    }

    public int D() {
        return I() + this.R;
    }

    public boolean D0() {
        return this.F == null;
    }

    public void D1(float f) {
        this.x0[1] = f;
    }

    public int E() {
        return this.R;
    }

    public boolean E0() {
        h hVar;
        return (this instanceof i) && ((hVar = this.F) == null || !(hVar instanceof i));
    }

    public void E1(int r1) {
        this.d0 = r1;
    }

    public int F() {
        return H() + this.Q;
    }

    public boolean F0() {
        return this.f == 0 && this.I == 0.0f && this.k == 0 && this.l == 0 && this.E[1] == c.MATCH_CONSTRAINT;
    }

    public void F1(int r2) {
        this.G = r2;
        int r0 = this.V;
        if (r2 < r0) {
            this.G = r0;
        }
    }

    public int G() {
        return this.Q;
    }

    public boolean G0() {
        return this.e == 0 && this.I == 0.0f && this.h == 0 && this.i == 0 && this.E[0] == c.MATCH_CONSTRAINT;
    }

    public void G1(boolean z) {
        this.n = z;
    }

    public int H() {
        return this.O + this.S;
    }

    public boolean H0() {
        return this.n;
    }

    public void H1(int r1) {
        this.Y = r1;
    }

    public int I() {
        return this.P + this.T;
    }

    public void I0() {
        this.u.z();
        this.v.z();
        this.w.z();
        this.x.z();
        this.y.z();
        this.z.z();
        this.A.z();
        this.B.z();
        this.F = null;
        this.t = 0.0f;
        this.G = 0;
        this.H = 0;
        this.I = 0.0f;
        this.J = -1;
        this.K = 0;
        this.L = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        float f = b1;
        this.Z = f;
        this.a0 = f;
        c[] cVarArr = this.E;
        c cVar = c.FIXED;
        cVarArr[0] = cVar;
        cVarArr[1] = cVar;
        this.b0 = null;
        this.c0 = 0;
        this.d0 = 0;
        this.f0 = null;
        this.o0 = false;
        this.p0 = false;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = false;
        this.w0 = false;
        float[] fArr = this.x0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f936a = -1;
        this.f937b = -1;
        int[] r3 = this.s;
        r3[0] = Integer.MAX_VALUE;
        r3[1] = Integer.MAX_VALUE;
        this.e = 0;
        this.f = 0;
        this.j = 1.0f;
        this.m = 1.0f;
        this.i = ActivityChooserView.f.j;
        this.l = ActivityChooserView.f.j;
        this.h = 0;
        this.k = 0;
        this.p = -1;
        this.q = 1.0f;
        p pVar = this.f938c;
        if (pVar != null) {
            pVar.g();
        }
        p pVar2 = this.d;
        if (pVar2 != null) {
            pVar2.g();
        }
        this.r = null;
        this.q0 = false;
        this.r0 = false;
        this.s0 = false;
    }

    public void I1(int r1) {
        this.X = r1;
    }

    public int J() {
        if (this.d0 == 8) {
            return 0;
        }
        return this.H;
    }

    public void J0() {
        c cVar;
        c cVar2;
        L0();
        y1(b1);
        i1(b1);
        if (this instanceof i) {
            return;
        }
        if (N() == c.MATCH_CONSTRAINT) {
            if (p0() == r0()) {
                cVar2 = c.WRAP_CONTENT;
            } else if (p0() > X()) {
                cVar2 = c.FIXED;
            }
            l1(cVar2);
        }
        if (n0() == c.MATCH_CONSTRAINT) {
            if (J() == q0()) {
                cVar = c.WRAP_CONTENT;
            } else if (J() <= W()) {
                return;
            } else {
                cVar = c.FIXED;
            }
            B1(cVar);
        }
    }

    public void J1(int r1) {
        this.K = r1;
    }

    public float K() {
        return this.Z;
    }

    public void K0(e eVar) {
        if (a0() != null && (a0() instanceof i) && ((i) a0()).j2()) {
            return;
        }
        e eVarS = s(e.d.LEFT);
        e eVarS2 = s(e.d.RIGHT);
        e eVarS3 = s(e.d.TOP);
        e eVarS4 = s(e.d.BOTTOM);
        e eVarS5 = s(e.d.CENTER);
        e eVarS6 = s(e.d.CENTER_X);
        e eVarS7 = s(e.d.CENTER_Y);
        if (eVar != eVarS5) {
            if (eVar == eVarS6) {
                if (eVarS.q() && eVarS2.q() && eVarS.o().i() == eVarS2.o().i()) {
                    eVarS.z();
                    eVarS2.z();
                }
                this.Z = 0.5f;
            } else if (eVar == eVarS7) {
                if (eVarS3.q() && eVarS4.q() && eVarS3.o().i() == eVarS4.o().i()) {
                    eVarS3.z();
                    eVarS4.z();
                }
            } else if (eVar == eVarS || eVar == eVarS2 ? !(!eVarS.q() || eVarS.o() != eVarS2.o()) : !((eVar != eVarS3 && eVar != eVarS4) || !eVarS3.q() || eVarS3.o() != eVarS4.o())) {
                eVarS5.z();
            }
            eVar.z();
        }
        if (eVarS.q() && eVarS2.q() && eVarS.o() == eVarS2.o()) {
            eVarS.z();
            eVarS2.z();
        }
        if (eVarS3.q() && eVarS4.q() && eVarS3.o() == eVarS4.o()) {
            eVarS3.z();
            eVarS4.z();
        }
        this.Z = 0.5f;
        this.a0 = 0.5f;
        eVar.z();
    }

    public void K1(int r1) {
        this.L = r1;
    }

    public h L() {
        if (!A0()) {
            return null;
        }
        h hVar = this;
        h hVar2 = null;
        while (hVar2 == null && hVar != null) {
            e eVarS = hVar.s(e.d.LEFT);
            e eVarO = eVarS == null ? null : eVarS.o();
            h hVarI = eVarO == null ? null : eVarO.i();
            if (hVarI == a0()) {
                return hVar;
            }
            e eVarO2 = hVarI == null ? null : hVarI.s(e.d.RIGHT).o();
            if (eVarO2 == null || eVarO2.i() == hVar) {
                hVar = hVarI;
            } else {
                hVar2 = hVar;
            }
        }
        return hVar2;
    }

    public void L0() {
        h hVarA0 = a0();
        if (hVarA0 != null && (hVarA0 instanceof i) && ((i) a0()).j2()) {
            return;
        }
        int size = this.D.size();
        for (int r0 = 0; r0 < size; r0++) {
            this.D.get(r0).z();
        }
    }

    public void L1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.p == -1) {
            if (z3 && !z4) {
                this.p = 0;
            } else if (!z3 && z4) {
                this.p = 1;
                if (this.J == -1) {
                    this.q = 1.0f / this.q;
                }
            }
        }
        if (this.p == 0 && (!this.v.q() || !this.x.q())) {
            this.p = 1;
        } else if (this.p == 1 && (!this.u.q() || !this.w.q())) {
            this.p = 0;
        }
        if (this.p == -1 && (!this.v.q() || !this.x.q() || !this.u.q() || !this.w.q())) {
            if (this.v.q() && this.x.q()) {
                this.p = 0;
            } else if (this.u.q() && this.w.q()) {
                this.q = 1.0f / this.q;
                this.p = 1;
            }
        }
        if (this.p == -1) {
            if (z && !z2) {
                this.p = 0;
            } else if (!z && z2) {
                this.q = 1.0f / this.q;
                this.p = 1;
            }
        }
        if (this.p == -1) {
            if (this.h > 0 && this.k == 0) {
                this.p = 0;
            } else if (this.h == 0 && this.k > 0) {
                this.q = 1.0f / this.q;
                this.p = 1;
            }
        }
        if (this.p == -1 && z && z2) {
            this.q = 1.0f / this.q;
            this.p = 1;
        }
    }

    public int M() {
        return this.t0;
    }

    public void M0(int r5) {
        h hVarA0 = a0();
        if (hVarA0 != null && (hVarA0 instanceof i) && ((i) a0()).j2()) {
            return;
        }
        int size = this.D.size();
        for (int r0 = 0; r0 < size; r0++) {
            e eVar = this.D.get(r0);
            if (r5 == eVar.e()) {
                if (eVar.y()) {
                    y1(b1);
                } else {
                    i1(b1);
                }
                eVar.z();
            }
        }
    }

    public void M1() {
        int r0 = this.K;
        int r1 = this.L;
        int r2 = this.G + r0;
        int r3 = this.H + r1;
        this.O = r0;
        this.P = r1;
        this.Q = r2 - r0;
        this.R = r3 - r1;
    }

    public c N() {
        return this.E[0];
    }

    public void N0() {
        for (int r0 = 0; r0 < 6; r0++) {
            this.C[r0].k().g();
        }
    }

    public void N1(b.g.a.e eVar) {
        int r0 = eVar.S(this.u);
        int r1 = eVar.S(this.v);
        int r2 = eVar.S(this.w);
        int r7 = eVar.S(this.x);
        int r4 = r7 - r1;
        if (r2 - r0 < 0 || r4 < 0 || r0 == Integer.MIN_VALUE || r0 == Integer.MAX_VALUE || r1 == Integer.MIN_VALUE || r1 == Integer.MAX_VALUE || r2 == Integer.MIN_VALUE || r2 == Integer.MAX_VALUE || r7 == Integer.MIN_VALUE || r7 == Integer.MAX_VALUE) {
            r7 = 0;
            r0 = 0;
            r1 = 0;
            r2 = 0;
        }
        e1(r0, r1, r2, r7);
    }

    public int O() {
        return this.P + this.R;
    }

    public void O0(b.g.a.c cVar) {
        this.u.A(cVar);
        this.v.A(cVar);
        this.w.A(cVar);
        this.x.A(cVar);
        this.y.A(cVar);
        this.B.A(cVar);
        this.z.A(cVar);
        this.A.A(cVar);
    }

    public void O1() {
        for (int r0 = 0; r0 < 6; r0++) {
            this.C[r0].k().s();
        }
    }

    public int P() {
        return this.O + this.Q;
    }

    public void P0() {
    }

    int Q() {
        return this.O;
    }

    public void Q0(int r1) {
        this.U = r1;
    }

    int R() {
        return this.P;
    }

    public void R0(Object obj) {
        this.b0 = obj;
    }

    public int S() {
        return s0();
    }

    public void S0(int r1) {
        if (r1 < 0) {
            r1 = 0;
        }
        this.c0 = r1;
    }

    public int T(int r2) {
        if (r2 == 0) {
            return p0();
        }
        if (r2 == 1) {
            return J();
        }
        return 0;
    }

    public void T0(String str) {
        this.e0 = str;
    }

    public int U() {
        return this.s[1];
    }

    public void U0(b.g.a.e eVar, String str) {
        this.e0 = str;
        b.g.a.h hVarU = eVar.u(this.u);
        b.g.a.h hVarU2 = eVar.u(this.v);
        b.g.a.h hVarU3 = eVar.u(this.w);
        b.g.a.h hVarU4 = eVar.u(this.x);
        hVarU.h(str + ".left");
        hVarU2.h(str + ".top");
        hVarU3.h(str + ".right");
        hVarU4.h(str + ".bottom");
        if (this.U > 0) {
            eVar.u(this.y).h(str + ".baseline");
        }
    }

    public int V() {
        return this.s[0];
    }

    public void V0(int r2, int r3) {
        this.G = r2;
        int r0 = this.V;
        if (r2 < r0) {
            this.G = r0;
        }
        this.H = r3;
        int r22 = this.W;
        if (r3 < r22) {
            this.H = r22;
        }
    }

    public int W() {
        return this.W;
    }

    public void W0(float f, int r2) {
        this.I = f;
        this.J = r2;
    }

    public int X() {
        return this.V;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[PHI: r0
  0x0084: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:45:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X0(java.lang.String r9) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L8e
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L8e
        Lb:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L37
            int r6 = r2 + (-1)
            if (r3 >= r6) goto L37
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2c
            r1 = 0
            goto L35
        L2c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L35
            r1 = 1
        L35:
            int r4 = r3 + 1
        L37:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L75
            int r2 = r2 - r5
            if (r3 >= r2) goto L75
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L84
            int r3 = r9.length()
            if (r3 <= 0) goto L84
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L84
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L84
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L84
            if (r1 != r5) goto L6f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L6f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L75:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L84
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L84:
            r9 = 0
        L85:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8d
            r8.I = r9
            r8.J = r1
        L8d:
            return
        L8e:
            r8.I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.i.h.X0(java.lang.String):void");
    }

    public int Y() {
        int r0;
        int r02 = this.H;
        if (this.E[1] != c.MATCH_CONSTRAINT) {
            return r02;
        }
        if (this.f == 1) {
            r0 = Math.max(this.k, r02);
        } else {
            r0 = this.k;
            if (r0 > 0) {
                this.H = r0;
            } else {
                r0 = 0;
            }
        }
        int r1 = this.l;
        return (r1 <= 0 || r1 >= r0) ? r0 : r1;
    }

    public void Y0(int r1) {
        this.R = r1;
    }

    public int Z() {
        int r0;
        int r02 = this.G;
        if (this.E[0] != c.MATCH_CONSTRAINT) {
            return r02;
        }
        if (this.e == 1) {
            r0 = Math.max(this.h, r02);
        } else {
            r0 = this.h;
            if (r0 > 0) {
                this.G = r0;
            } else {
                r0 = 0;
            }
        }
        int r1 = this.i;
        return (r1 <= 0 || r1 >= r0) ? r0 : r1;
    }

    public void Z0(int r2, int r3) {
        int r22 = r2 - this.S;
        this.O = r22;
        int r32 = r3 - this.T;
        this.P = r32;
        this.K = r22;
        this.L = r32;
    }

    public h a0() {
        return this.F;
    }

    public void a1(int r1) {
        this.Q = r1;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(b.g.a.e r39) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.i.h.b(b.g.a.e):void");
    }

    int b0(int r2) {
        if (r2 == 0) {
            return this.M;
        }
        if (r2 == 1) {
            return this.N;
        }
        return 0;
    }

    public void b1(int r2) {
        int r22 = r2 - this.S;
        this.O = r22;
        this.K = r22;
    }

    public boolean c() {
        return this.d0 != 8;
    }

    public p c0() {
        if (this.d == null) {
            this.d = new p();
        }
        return this.d;
    }

    public void c1(int r2) {
        int r22 = r2 - this.T;
        this.P = r22;
        this.L = r22;
    }

    public void d(int r1) {
        m.a(r1, this);
    }

    public p d0() {
        if (this.f938c == null) {
            this.f938c = new p();
        }
        return this.f938c;
    }

    public void d1(int r2, int r3, int r4) {
        if (r4 == 0) {
            k1(r2, r3);
        } else if (r4 == 1) {
            A1(r2, r3);
        }
        this.r0 = true;
    }

    public int e0() {
        return s0() + this.G;
    }

    public void e1(int r2, int r3, int r4, int r5) {
        int r22;
        int r23;
        int r42 = r4 - r2;
        int r52 = r5 - r3;
        this.K = r2;
        this.L = r3;
        if (this.d0 == 8) {
            this.G = 0;
            this.H = 0;
            return;
        }
        if (this.E[0] == c.FIXED && r42 < (r23 = this.G)) {
            r42 = r23;
        }
        if (this.E[1] == c.FIXED && r52 < (r22 = this.H)) {
            r52 = r22;
        }
        this.G = r42;
        this.H = r52;
        int r24 = this.W;
        if (r52 < r24) {
            this.H = r24;
        }
        int r25 = this.G;
        int r43 = this.V;
        if (r25 < r43) {
            this.G = r43;
        }
        this.r0 = true;
    }

    public void f(e.d dVar, h hVar, e.d dVar2) {
        h(dVar, hVar, dVar2, 0, e.c.STRONG);
    }

    public s f0() {
        h hVarA0 = this;
        while (hVarA0.a0() != null) {
            hVarA0 = hVarA0.a0();
        }
        if (hVarA0 instanceof s) {
            return (s) hVarA0;
        }
        return null;
    }

    public void f1(e.d dVar, int r3) {
        e eVar;
        int r2 = a.f939a[dVar.ordinal()];
        if (r2 == 1) {
            eVar = this.u;
        } else if (r2 == 2) {
            eVar = this.v;
        } else if (r2 == 3) {
            eVar = this.w;
        } else if (r2 != 4) {
            return;
        } else {
            eVar = this.x;
        }
        eVar.f = r3;
    }

    public void g(e.d dVar, h hVar, e.d dVar2, int r10) {
        h(dVar, hVar, dVar2, r10, e.c.STRONG);
    }

    protected int g0() {
        return this.K + this.S;
    }

    public void g1(int r2) {
        this.H = r2;
        int r0 = this.W;
        if (r2 < r0) {
            this.H = r0;
        }
    }

    public void h(e.d dVar, h hVar, e.d dVar2, int r11, e.c cVar) {
        i(dVar, hVar, dVar2, r11, cVar, 0);
    }

    protected int h0() {
        return this.L + this.T;
    }

    public void h1(boolean z) {
        this.o = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01f4 A[PHI: r0 r3
  0x01f4: PHI (r0v3 b.g.a.i.e) = (r0v2 b.g.a.i.e), (r0v5 b.g.a.i.e) binds: [B:99:0x0227, B:90:0x01f2] A[DONT_GENERATE, DONT_INLINE]
  0x01f4: PHI (r3v9 b.g.a.i.e) = (r3v8 b.g.a.i.e), (r3v15 b.g.a.i.e) binds: [B:99:0x0227, B:90:0x01f2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(b.g.a.i.e.d r16, b.g.a.i.h r17, b.g.a.i.e.d r18, int r19, b.g.a.i.e.c r20, int r21) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.i.h.i(b.g.a.i.e$d, b.g.a.i.h, b.g.a.i.e$d, int, b.g.a.i.e$c, int):void");
    }

    public int i0() {
        return t0();
    }

    public void i1(float f) {
        this.Z = f;
    }

    public void j(e eVar, e eVar2, int r9) {
        l(eVar, eVar2, r9, e.c.STRONG, 0);
    }

    public String j0() {
        return this.f0;
    }

    public void j1(int r1) {
        this.t0 = r1;
    }

    public void k(e eVar, e eVar2, int r9, int r10) {
        l(eVar, eVar2, r9, e.c.STRONG, r10);
    }

    public float k0() {
        return this.a0;
    }

    public void k1(int r1, int r2) {
        this.K = r1;
        int r22 = r2 - r1;
        this.G = r22;
        int r12 = this.V;
        if (r22 < r12) {
            this.G = r12;
        }
    }

    public void l(e eVar, e eVar2, int r11, e.c cVar, int r13) {
        if (eVar.i() == this) {
            i(eVar.p(), eVar2.i(), eVar2.p(), r11, cVar, r13);
        }
    }

    public h l0() {
        if (!B0()) {
            return null;
        }
        h hVar = this;
        h hVar2 = null;
        while (hVar2 == null && hVar != null) {
            e eVarS = hVar.s(e.d.TOP);
            e eVarO = eVarS == null ? null : eVarS.o();
            h hVarI = eVarO == null ? null : eVarO.i();
            if (hVarI == a0()) {
                return hVar;
            }
            e eVarO2 = hVarI == null ? null : hVarI.s(e.d.BOTTOM).o();
            if (eVarO2 == null || eVarO2.i() == hVar) {
                hVar = hVarI;
            } else {
                hVar2 = hVar;
            }
        }
        return hVar2;
    }

    public void l1(c cVar) {
        this.E[0] = cVar;
        if (cVar == c.WRAP_CONTENT) {
            F1(this.X);
        }
    }

    public void m(h hVar, float f, int r9) {
        e.d dVar = e.d.CENTER;
        w0(dVar, hVar, dVar, r9, 0);
        this.t = f;
    }

    public int m0() {
        return this.u0;
    }

    public void m1(int r1, int r2, int r3, float f) {
        this.e = r1;
        this.h = r2;
        this.i = r3;
        this.j = f;
        if (f >= 1.0f || r1 != 0) {
            return;
        }
        this.e = 2;
    }

    public void n(h hVar) {
    }

    public c n0() {
        return this.E[1];
    }

    public void n1(float f) {
        this.x0[0] = f;
    }

    public void o(b.g.a.e eVar) {
        eVar.u(this.u);
        eVar.u(this.v);
        eVar.u(this.w);
        eVar.u(this.x);
        if (this.U > 0) {
            eVar.u(this.y);
        }
    }

    public int o0() {
        return this.d0;
    }

    public void o1(int r2, int r3) {
        if (r3 == 0) {
            F1(r2);
        } else if (r3 == 1) {
            g1(r2);
        }
    }

    public void p(h hVar) {
        ArrayList<e> arrayListT = t();
        int size = arrayListT.size();
        for (int r2 = 0; r2 < size; r2++) {
            e eVar = arrayListT.get(r2);
            if (eVar.q() && eVar.o().i() == hVar && eVar.e() == 2) {
                eVar.z();
            }
        }
    }

    public int p0() {
        if (this.d0 == 8) {
            return 0;
        }
        return this.G;
    }

    public void p1(int r3) {
        this.s[1] = r3;
    }

    public void q(h hVar) {
        ArrayList<e> arrayListT = t();
        int size = arrayListT.size();
        for (int r2 = 0; r2 < size; r2++) {
            e eVar = arrayListT.get(r2);
            if (eVar.q() && eVar.o().i() == hVar) {
                eVar.z();
            }
        }
    }

    public int q0() {
        return this.Y;
    }

    public void q1(int r3) {
        this.s[0] = r3;
    }

    public void r() {
        int r0 = this.K;
        int r1 = this.L;
        int r2 = this.G + r0;
        int r3 = this.H + r1;
        this.O = r0;
        this.P = r1;
        this.Q = r2 - r0;
        this.R = r3 - r1;
    }

    public int r0() {
        return this.X;
    }

    public void r1(int r1) {
        if (r1 < 0) {
            r1 = 0;
        }
        this.W = r1;
    }

    public e s(e.d dVar) {
        switch (a.f939a[dVar.ordinal()]) {
            case 1:
                return this.u;
            case 2:
                return this.v;
            case 3:
                return this.w;
            case 4:
                return this.x;
            case 5:
                return this.y;
            case 6:
                return this.B;
            case 7:
                return this.z;
            case 8:
                return this.A;
            case 9:
                return null;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    public int s0() {
        return this.K;
    }

    public void s1(int r1) {
        if (r1 < 0) {
            r1 = 0;
        }
        this.V = r1;
    }

    public ArrayList<e> t() {
        return this.D;
    }

    public int t0() {
        return this.L;
    }

    public void t1(int r1, int r2) {
        this.S = r1;
        this.T = r2;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f0 != null) {
            str = "type: " + this.f0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.e0 != null) {
            str2 = "id: " + this.e0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.K);
        sb.append(", ");
        sb.append(this.L);
        sb.append(") - (");
        sb.append(this.G);
        sb.append(" x ");
        sb.append(this.H);
        sb.append(") wrap: (");
        sb.append(this.X);
        sb.append(" x ");
        sb.append(this.Y);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.U;
    }

    public boolean u0(h hVar) {
        h hVarA0 = a0();
        if (hVarA0 == hVar) {
            return true;
        }
        if (hVarA0 == hVar.a0()) {
            return false;
        }
        while (hVarA0 != null) {
            if (hVarA0 == hVar || hVarA0 == hVar.a0()) {
                return true;
            }
            hVarA0 = hVarA0.a0();
        }
        return false;
    }

    public void u1(int r1, int r2) {
        this.K = r1;
        this.L = r2;
    }

    public float v(int r2) {
        if (r2 == 0) {
            return this.Z;
        }
        if (r2 == 1) {
            return this.a0;
        }
        return -1.0f;
    }

    public boolean v0() {
        return this.U > 0;
    }

    public void v1(h hVar) {
        this.F = hVar;
    }

    public int w() {
        return t0() + this.H;
    }

    public void w0(e.d dVar, h hVar, e.d dVar2, int r11, int r12) {
        s(dVar).c(hVar.s(dVar2), r11, r12, e.c.STRONG, 0, true);
    }

    void w1(int r2, int r3) {
        if (r3 == 0) {
            this.M = r2;
        } else if (r3 == 1) {
            this.N = r2;
        }
    }

    public Object x() {
        return this.b0;
    }

    public void x1(String str) {
        this.f0 = str;
    }

    public int y() {
        return this.c0;
    }

    public boolean y0() {
        return this.u.k().f953b == 1 && this.w.k().f953b == 1 && this.v.k().f953b == 1 && this.x.k().f953b == 1;
    }

    public void y1(float f) {
        this.a0 = f;
    }

    public String z() {
        return this.e0;
    }

    public boolean z0() {
        return this.o;
    }

    public void z1(int r1) {
        this.u0 = r1;
    }
}
