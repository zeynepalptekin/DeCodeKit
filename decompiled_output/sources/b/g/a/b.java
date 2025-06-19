package b.g.a;

import b.g.a.e;
import b.g.a.h;

/* loaded from: classes.dex */
public class b implements e.a {
    private static final boolean f = false;
    private static final float g = 0.001f;
    public final a d;

    /* renamed from: a, reason: collision with root package name */
    h f903a = null;

    /* renamed from: b, reason: collision with root package name */
    float f904b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f905c = false;
    boolean e = false;

    public b(c cVar) {
        this.d = new a(this, cVar);
    }

    @Override // b.g.a.e.a
    public void a(e.a aVar) {
        if (!(aVar instanceof b)) {
            return;
        }
        b bVar = (b) aVar;
        this.f903a = null;
        this.d.c();
        int r0 = 0;
        while (true) {
            a aVar2 = bVar.d;
            if (r0 >= aVar2.f900a) {
                return;
            }
            this.d.a(aVar2.j(r0), bVar.d.k(r0), true);
            r0++;
        }
    }

    @Override // b.g.a.e.a
    public void b(h hVar) {
        int r0 = hVar.d;
        float f2 = 1.0f;
        if (r0 != 1) {
            if (r0 == 2) {
                f2 = 1000.0f;
            } else if (r0 == 3) {
                f2 = 1000000.0f;
            } else if (r0 == 4) {
                f2 = 1.0E9f;
            } else if (r0 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.d.o(hVar, f2);
    }

    @Override // b.g.a.e.a
    public h c(e eVar, boolean[] zArr) {
        return this.d.i(zArr, null);
    }

    @Override // b.g.a.e.a
    public void clear() {
        this.d.c();
        this.f903a = null;
        this.f904b = 0.0f;
    }

    public b d(e eVar, int r5) {
        this.d.o(eVar.s(r5, "ep"), 1.0f);
        this.d.o(eVar.s(r5, "em"), -1.0f);
        return this;
    }

    b e(h hVar, int r3) {
        this.d.o(hVar, r3);
        return this;
    }

    boolean f(e eVar) {
        boolean z;
        h hVarB = this.d.b(eVar);
        if (hVarB == null) {
            z = true;
        } else {
            w(hVarB);
            z = false;
        }
        if (this.d.f900a == 0) {
            this.e = true;
        }
        return z;
    }

    b g(h hVar, h hVar2, int r8, float f2, h hVar3, h hVar4, int r12) {
        float f3;
        if (hVar2 == hVar3) {
            this.d.o(hVar, 1.0f);
            this.d.o(hVar4, 1.0f);
            this.d.o(hVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.d.o(hVar, 1.0f);
            this.d.o(hVar2, -1.0f);
            this.d.o(hVar3, -1.0f);
            this.d.o(hVar4, 1.0f);
            if (r8 > 0 || r12 > 0) {
                f3 = (-r8) + r12;
                this.f904b = f3;
            }
        } else {
            if (f2 <= 0.0f) {
                this.d.o(hVar, -1.0f);
                this.d.o(hVar2, 1.0f);
                f3 = r8;
            } else if (f2 >= 1.0f) {
                this.d.o(hVar3, -1.0f);
                this.d.o(hVar4, 1.0f);
                f3 = r12;
            } else {
                float f4 = 1.0f - f2;
                this.d.o(hVar, f4 * 1.0f);
                this.d.o(hVar2, f4 * (-1.0f));
                this.d.o(hVar3, (-1.0f) * f2);
                this.d.o(hVar4, 1.0f * f2);
                if (r8 > 0 || r12 > 0) {
                    f3 = ((-r8) * f4) + (r12 * f2);
                }
            }
            this.f904b = f3;
        }
        return this;
    }

    @Override // b.g.a.e.a
    public h getKey() {
        return this.f903a;
    }

    b h(h hVar, int r2) {
        this.f903a = hVar;
        float f2 = r2;
        hVar.e = f2;
        this.f904b = f2;
        this.e = true;
        return this;
    }

    b i(h hVar, h hVar2, h hVar3, float f2) {
        this.d.o(hVar, -1.0f);
        this.d.o(hVar2, 1.0f - f2);
        this.d.o(hVar3, f2);
        return this;
    }

    @Override // b.g.a.e.a
    public boolean isEmpty() {
        return this.f903a == null && this.f904b == 0.0f && this.d.f900a == 0;
    }

    public b j(h hVar, h hVar2, h hVar3, h hVar4, float f2) {
        this.d.o(hVar, -1.0f);
        this.d.o(hVar2, 1.0f);
        this.d.o(hVar3, f2);
        this.d.o(hVar4, -f2);
        return this;
    }

    public b k(float f2, float f3, float f4, h hVar, int r8, h hVar2, int r10, h hVar3, int r12, h hVar4, int r14) {
        if (f3 == 0.0f || f2 == f4) {
            this.f904b = ((-r8) - r10) + r12 + r14;
            this.d.o(hVar, 1.0f);
            this.d.o(hVar2, -1.0f);
            this.d.o(hVar4, 1.0f);
            this.d.o(hVar3, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f904b = ((-r8) - r10) + (r12 * f5) + (r14 * f5);
            this.d.o(hVar, 1.0f);
            this.d.o(hVar2, -1.0f);
            this.d.o(hVar4, f5);
            this.d.o(hVar3, -f5);
        }
        return this;
    }

    public b l(float f2, float f3, float f4, h hVar, h hVar2, h hVar3, h hVar4) {
        this.f904b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.d.o(hVar, 1.0f);
            this.d.o(hVar2, -1.0f);
            this.d.o(hVar4, 1.0f);
            this.d.o(hVar3, -1.0f);
        } else if (f2 == 0.0f) {
            this.d.o(hVar, 1.0f);
            this.d.o(hVar2, -1.0f);
        } else if (f4 == 0.0f) {
            this.d.o(hVar3, 1.0f);
            this.d.o(hVar4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.d.o(hVar, 1.0f);
            this.d.o(hVar2, -1.0f);
            this.d.o(hVar4, f5);
            this.d.o(hVar3, -f5);
        }
        return this;
    }

    public b m(h hVar, int r3) {
        a aVar;
        float f2;
        if (r3 < 0) {
            this.f904b = r3 * (-1);
            aVar = this.d;
            f2 = 1.0f;
        } else {
            this.f904b = r3;
            aVar = this.d;
            f2 = -1.0f;
        }
        aVar.o(hVar, f2);
        return this;
    }

    public b n(h hVar, h hVar2, int r5) {
        boolean z = false;
        if (r5 != 0) {
            if (r5 < 0) {
                r5 *= -1;
                z = true;
            }
            this.f904b = r5;
        }
        if (z) {
            this.d.o(hVar, 1.0f);
            this.d.o(hVar2, -1.0f);
        } else {
            this.d.o(hVar, -1.0f);
            this.d.o(hVar2, 1.0f);
        }
        return this;
    }

    public b o(h hVar, int r2, h hVar2) {
        this.f904b = r2;
        this.d.o(hVar, -1.0f);
        return this;
    }

    public b p(h hVar, h hVar2, h hVar3, int r6) {
        boolean z = false;
        if (r6 != 0) {
            if (r6 < 0) {
                r6 *= -1;
                z = true;
            }
            this.f904b = r6;
        }
        if (z) {
            this.d.o(hVar, 1.0f);
            this.d.o(hVar2, -1.0f);
            this.d.o(hVar3, -1.0f);
        } else {
            this.d.o(hVar, -1.0f);
            this.d.o(hVar2, 1.0f);
            this.d.o(hVar3, 1.0f);
        }
        return this;
    }

    public b q(h hVar, h hVar2, h hVar3, int r6) {
        boolean z = false;
        if (r6 != 0) {
            if (r6 < 0) {
                r6 *= -1;
                z = true;
            }
            this.f904b = r6;
        }
        if (z) {
            this.d.o(hVar, 1.0f);
            this.d.o(hVar2, -1.0f);
            this.d.o(hVar3, 1.0f);
        } else {
            this.d.o(hVar, -1.0f);
            this.d.o(hVar2, 1.0f);
            this.d.o(hVar3, -1.0f);
        }
        return this;
    }

    public b r(h hVar, h hVar2, h hVar3, h hVar4, float f2) {
        this.d.o(hVar3, 0.5f);
        this.d.o(hVar4, 0.5f);
        this.d.o(hVar, -0.5f);
        this.d.o(hVar2, -0.5f);
        this.f904b = -f2;
        return this;
    }

    void s() {
        float f2 = this.f904b;
        if (f2 < 0.0f) {
            this.f904b = f2 * (-1.0f);
            this.d.m();
        }
    }

    boolean t() {
        h hVar = this.f903a;
        return hVar != null && (hVar.g == h.b.UNRESTRICTED || this.f904b >= 0.0f);
    }

    public String toString() {
        return z();
    }

    boolean u(h hVar) {
        return this.d.d(hVar);
    }

    h v(h hVar) {
        return this.d.i(null, hVar);
    }

    void w(h hVar) {
        h hVar2 = this.f903a;
        if (hVar2 != null) {
            this.d.o(hVar2, -1.0f);
            this.f903a = null;
        }
        float fP = this.d.p(hVar, true) * (-1.0f);
        this.f903a = hVar;
        if (fP == 1.0f) {
            return;
        }
        this.f904b /= fP;
        this.d.f(fP);
    }

    public void x() {
        this.f903a = null;
        this.d.c();
        this.f904b = 0.0f;
        this.e = false;
    }

    int y() {
        return (this.f903a != null ? 4 : 0) + 4 + 4 + this.d.q();
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    java.lang.String z() {
        /*
            r10 = this;
            b.g.a.h r0 = r10.f903a
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            b.g.a.h r1 = r10.f903a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f904b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f904b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L53
        L52:
            r1 = 0
        L53:
            b.g.a.a r5 = r10.d
            int r5 = r5.f900a
        L57:
            if (r2 >= r5) goto Ld0
            b.g.a.a r6 = r10.d
            b.g.a.h r6 = r6.j(r2)
            if (r6 != 0) goto L62
            goto Lcd
        L62:
            b.g.a.a r7 = r10.d
            float r7 = r7.k(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L6d
            goto Lcd
        L6d:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L84
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto La9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La0
        L84:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L98
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto La9
        L98:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La0:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        La9:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc2
        Lb5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc2:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        Lcd:
            int r2 = r2 + 1
            goto L57
        Ld0:
            if (r1 != 0) goto Le3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.b.z():java.lang.String");
    }
}
