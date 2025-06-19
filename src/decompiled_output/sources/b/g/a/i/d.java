package b.g.a.i;

import b.g.a.i.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    protected h f923a;

    /* renamed from: b, reason: collision with root package name */
    protected h f924b;

    /* renamed from: c, reason: collision with root package name */
    protected h f925c;
    protected h d;
    protected h e;
    protected h f;
    protected h g;
    protected ArrayList<h> h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    private int l;
    private boolean m;
    protected boolean n;
    protected boolean o;
    protected boolean p;
    private boolean q;

    public d(h hVar, int r3, boolean z) {
        this.m = false;
        this.f923a = hVar;
        this.l = r3;
        this.m = z;
    }

    private void b() {
        int r0 = this.l * 2;
        h hVar = this.f923a;
        boolean z = false;
        h hVar2 = hVar;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            h[] hVarArr = hVar.z0;
            int r8 = this.l;
            h hVar3 = null;
            hVarArr[r8] = null;
            hVar.y0[r8] = null;
            if (hVar.o0() != 8) {
                if (this.f924b == null) {
                    this.f924b = hVar;
                }
                this.d = hVar;
                h.c[] cVarArr = hVar.E;
                int r82 = this.l;
                if (cVarArr[r82] == h.c.MATCH_CONSTRAINT) {
                    int[] r7 = hVar.g;
                    if (r7[r82] == 0 || r7[r82] == 3 || r7[r82] == 2) {
                        this.j++;
                        float[] fArr = hVar.x0;
                        int r83 = this.l;
                        float f = fArr[r83];
                        if (f > 0.0f) {
                            this.k += fArr[r83];
                        }
                        if (k(hVar, this.l)) {
                            if (f < 0.0f) {
                                this.n = true;
                            } else {
                                this.o = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(hVar);
                        }
                        if (this.f == null) {
                            this.f = hVar;
                        }
                        h hVar4 = this.g;
                        if (hVar4 != null) {
                            hVar4.y0[this.l] = hVar;
                        }
                        this.g = hVar;
                    }
                }
            }
            if (hVar2 != hVar) {
                hVar2.z0[this.l] = hVar;
            }
            e eVar = hVar.C[r0 + 1].d;
            if (eVar != null) {
                h hVar5 = eVar.f927b;
                e[] eVarArr = hVar5.C;
                if (eVarArr[r0].d != null && eVarArr[r0].d.f927b == hVar) {
                    hVar3 = hVar5;
                }
            }
            if (hVar3 == null) {
                hVar3 = hVar;
                z2 = true;
            }
            hVar2 = hVar;
            hVar = hVar3;
        }
        this.f925c = hVar;
        if (this.l == 0 && this.m) {
            this.e = hVar;
        } else {
            this.e = this.f923a;
        }
        if (this.o && this.n) {
            z = true;
        }
        this.p = z;
    }

    private static boolean k(h hVar, int r3) {
        if (hVar.o0() != 8 && hVar.E[r3] == h.c.MATCH_CONSTRAINT) {
            int[] r2 = hVar.g;
            if (r2[r3] == 0 || r2[r3] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.q) {
            b();
        }
        this.q = true;
    }

    public h c() {
        return this.f923a;
    }

    public h d() {
        return this.f;
    }

    public h e() {
        return this.f924b;
    }

    public h f() {
        return this.e;
    }

    public h g() {
        return this.f925c;
    }

    public h h() {
        return this.g;
    }

    public h i() {
        return this.d;
    }

    public float j() {
        return this.k;
    }
}
