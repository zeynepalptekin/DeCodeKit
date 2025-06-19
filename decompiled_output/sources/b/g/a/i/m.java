package b.g.a.i;

import b.g.a.i.h;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final int f945a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f946b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f947c = 2;
    public static final int d = 4;
    public static final int e = 8;
    public static final int f = 16;
    public static final int g = 32;
    public static final int h = 7;
    static boolean[] i = new boolean[3];
    static final int j = 0;
    static final int k = 1;
    static final int l = 2;

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c4, code lost:
    
        if (r6 != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c6, code lost:
    
        r4.l(r2, 1, r17.c0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01cf, code lost:
    
        r4.k(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e0, code lost:
    
        if (r6 != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e9, code lost:
    
        if (r6 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f4, code lost:
    
        r7 = r17.p0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010f, code lost:
    
        if (r6 != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8 A[PHI: r7
  0x00f8: PHI (r7v38 int) = (r7v31 int), (r7v39 int), (r7v39 int) binds: [B:58:0x00f4, B:33:0x0080, B:27:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(int r16, b.g.a.i.h r17) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.i.m.a(int, b.g.a.i.h):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[PHI: r11 r12
  0x0034: PHI (r11v18 boolean) = (r11v2 boolean), (r11v21 boolean) binds: [B:25:0x0048, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r12v9 boolean) = (r12v2 boolean), (r12v12 boolean) binds: [B:25:0x0048, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[PHI: r11 r12
  0x0036: PHI (r11v4 boolean) = (r11v2 boolean), (r11v21 boolean) binds: [B:25:0x0048, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0036: PHI (r12v4 boolean) = (r12v2 boolean), (r12v12 boolean) binds: [B:25:0x0048, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean b(b.g.a.i.i r24, b.g.a.e r25, int r26, int r27, b.g.a.i.d r28) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.i.m.b(b.g.a.i.i, b.g.a.e, int, int, b.g.a.i.d):boolean");
    }

    static void c(i iVar, b.g.a.e eVar, h hVar) {
        if (iVar.E[0] != h.c.WRAP_CONTENT && hVar.E[0] == h.c.MATCH_PARENT) {
            int r0 = hVar.u.e;
            int r1 = iVar.p0() - hVar.w.e;
            e eVar2 = hVar.u;
            eVar2.j = eVar.u(eVar2);
            e eVar3 = hVar.w;
            eVar3.j = eVar.u(eVar3);
            eVar.f(hVar.u.j, r0);
            eVar.f(hVar.w.j, r1);
            hVar.f936a = 2;
            hVar.k1(r0, r1);
        }
        if (iVar.E[1] == h.c.WRAP_CONTENT || hVar.E[1] != h.c.MATCH_PARENT) {
            return;
        }
        int r02 = hVar.v.e;
        int r5 = iVar.J() - hVar.x.e;
        e eVar4 = hVar.v;
        eVar4.j = eVar.u(eVar4);
        e eVar5 = hVar.x;
        eVar5.j = eVar.u(eVar5);
        eVar.f(hVar.v.j, r02);
        eVar.f(hVar.x.j, r5);
        if (hVar.U > 0 || hVar.o0() == 8) {
            e eVar6 = hVar.y;
            eVar6.j = eVar.u(eVar6);
            eVar.f(hVar.y.j, hVar.U + r02);
        }
        hVar.f937b = 2;
        hVar.A1(r02, r5);
    }

    private static boolean d(h hVar, int r6) {
        h.c[] cVarArr = hVar.E;
        if (cVarArr[r6] != h.c.MATCH_CONSTRAINT) {
            return false;
        }
        if (hVar.I != 0.0f) {
            h.c cVar = cVarArr[r6 != 0 ? (char) 0 : (char) 1];
            h.c cVar2 = h.c.MATCH_CONSTRAINT;
            return false;
        }
        if (r6 == 0) {
            if (hVar.e != 0 || hVar.h != 0 || hVar.i != 0) {
                return false;
            }
        } else if (hVar.f != 0 || hVar.k != 0 || hVar.l != 0) {
            return false;
        }
        return true;
    }

    static void e(h hVar, int r5, int r6) {
        int r0 = r5 * 2;
        int r1 = r0 + 1;
        hVar.C[r0].k().j = hVar.a0().u.k();
        hVar.C[r0].k().k = r6;
        hVar.C[r0].k().f953b = 1;
        hVar.C[r1].k().j = hVar.C[r0].k();
        hVar.C[r1].k().k = hVar.T(r5);
        hVar.C[r1].k().f953b = 1;
    }
}
