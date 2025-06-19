package c.a.b.b.g.c;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class v8<T> implements j9<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = ia.t();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f1841a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f1842b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1843c;
    private final int d;
    private final r8 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final z8 m;
    private final a8 n;
    private final ca<?, ?> o;
    private final w6<?> p;
    private final o8 q;

    private v8(int[] r1, Object[] objArr, int r3, int r4, r8 r8Var, boolean z, boolean z2, int[] r8, int r9, int r10, z8 z8Var, a8 a8Var, ca<?, ?> caVar, w6<?> w6Var, o8 o8Var) {
        this.f1841a = r1;
        this.f1842b = objArr;
        this.f1843c = r3;
        this.d = r4;
        this.g = r8Var instanceof h7;
        this.h = z;
        this.f = w6Var != null && w6Var.h(r8Var);
        this.i = false;
        this.j = r8;
        this.k = r9;
        this.l = r10;
        this.m = z8Var;
        this.n = a8Var;
        this.o = caVar;
        this.p = w6Var;
        this.e = r8Var;
        this.q = o8Var;
    }

    private final void A(Object obj, int r4, l9 l9Var) throws IOException {
        long j;
        Object objI;
        if (V(r4)) {
            j = r4 & 1048575;
            objI = l9Var.F();
        } else {
            int r42 = r4 & 1048575;
            if (this.g) {
                j = r42;
                objI = l9Var.z();
            } else {
                j = r42;
                objI = l9Var.I();
            }
        }
        ia.j(obj, j, objI);
    }

    private final void B(T t, T t2, int r6) {
        long jQ = Q(r6) & 1048575;
        if (C(t2, r6)) {
            Object objF = ia.F(t, jQ);
            Object objF2 = ia.F(t2, jQ);
            if (objF != null && objF2 != null) {
                ia.j(t, jQ, l7.e(objF, objF2));
                J(t, r6);
            } else if (objF2 != null) {
                ia.j(t, jQ, objF2);
                J(t, r6);
            }
        }
    }

    private final boolean C(T t, int r11) {
        int r0 = S(r11);
        long j = r0 & 1048575;
        if (j != 1048575) {
            return (ia.b(t, j) & (1 << (r0 >>> 20))) != 0;
        }
        int r112 = Q(r11);
        long j2 = r112 & 1048575;
        switch ((r112 & 267386880) >>> 20) {
            case 0:
                return ia.C(t, j2) != 0.0d;
            case 1:
                return ia.x(t, j2) != 0.0f;
            case 2:
                return ia.o(t, j2) != 0;
            case 3:
                return ia.o(t, j2) != 0;
            case 4:
                return ia.b(t, j2) != 0;
            case 5:
                return ia.o(t, j2) != 0;
            case 6:
                return ia.b(t, j2) != 0;
            case 7:
                return ia.w(t, j2);
            case 8:
                Object objF = ia.F(t, j2);
                if (objF instanceof String) {
                    return !((String) objF).isEmpty();
                }
                if (objF instanceof y5) {
                    return !y5.e.equals(objF);
                }
                throw new IllegalArgumentException();
            case 9:
                return ia.F(t, j2) != null;
            case 10:
                return !y5.e.equals(ia.F(t, j2));
            case 11:
                return ia.b(t, j2) != 0;
            case 12:
                return ia.b(t, j2) != 0;
            case 13:
                return ia.b(t, j2) != 0;
            case 14:
                return ia.o(t, j2) != 0;
            case 15:
                return ia.b(t, j2) != 0;
            case 16:
                return ia.o(t, j2) != 0;
            case 17:
                return ia.F(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean D(T t, int r4, int r5) {
        return ia.b(t, (long) (S(r5) & 1048575)) == r4;
    }

    private final boolean E(T t, int r3, int r4, int r5, int r6) {
        return r4 == 1048575 ? C(t, r3) : (r5 & r6) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean F(Object obj, int r3, j9 j9Var) {
        return j9Var.e(ia.F(obj, r3 & 1048575));
    }

    private static <T> double G(T t, long j) {
        return ((Double) ia.F(t, j)).doubleValue();
    }

    private final int H(int r5, int r6) {
        int length = (this.f1841a.length / 3) - 1;
        while (r6 <= length) {
            int r1 = (length + r6) >>> 1;
            int r2 = r1 * 3;
            int r3 = this.f1841a[r2];
            if (r5 == r3) {
                return r2;
            }
            if (r5 < r3) {
                length = r1 - 1;
            } else {
                r6 = r1 + 1;
            }
        }
        return -1;
    }

    private final Object I(int r2) {
        return this.f1842b[(r2 / 3) << 1];
    }

    private final void J(T t, int r7) {
        int r72 = S(r7);
        long j = 1048575 & r72;
        if (j == 1048575) {
            return;
        }
        ia.h(t, j, (1 << (r72 >>> 20)) | ia.b(t, j));
    }

    private final void K(T t, int r4, int r5) {
        ia.h(t, S(r5) & 1048575, r4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void L(T r18, c.a.b.b.g.c.ab r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.v8.L(java.lang.Object, c.a.b.b.g.c.ab):void");
    }

    private final void M(T t, T t2, int r8) {
        int r0 = Q(r8);
        int r1 = this.f1841a[r8];
        long j = r0 & 1048575;
        if (D(t2, r1, r8)) {
            Object objF = D(t, r1, r8) ? ia.F(t, j) : null;
            Object objF2 = ia.F(t2, j);
            if (objF != null && objF2 != null) {
                ia.j(t, j, l7.e(objF, objF2));
                K(t, r1, r8);
            } else if (objF2 != null) {
                ia.j(t, j, objF2);
                K(t, r1, r8);
            }
        }
    }

    private static <T> float N(T t, long j) {
        return ((Float) ia.F(t, j)).floatValue();
    }

    private final m7 O(int r2) {
        return (m7) this.f1842b[((r2 / 3) << 1) + 1];
    }

    private final boolean P(T t, T t2, int r3) {
        return C(t, r3) == C(t2, r3);
    }

    private final int Q(int r2) {
        return this.f1841a[r2 + 1];
    }

    private static <T> int R(T t, long j) {
        return ((Integer) ia.F(t, j)).intValue();
    }

    private final int S(int r2) {
        return this.f1841a[r2 + 2];
    }

    private static <T> long T(T t, long j) {
        return ((Long) ia.F(t, j)).longValue();
    }

    private static fa U(Object obj) {
        h7 h7Var = (h7) obj;
        fa faVar = h7Var.zzb;
        if (faVar != fa.a()) {
            return faVar;
        }
        fa faVarG = fa.g();
        h7Var.zzb = faVarG;
        return faVarG;
    }

    private static boolean V(int r1) {
        return (r1 & 536870912) != 0;
    }

    private static <T> boolean W(T t, long j) {
        return ((Boolean) ia.F(t, j)).booleanValue();
    }

    private final int X(int r2) {
        if (r2 < this.f1843c || r2 > this.d) {
            return -1;
        }
        return H(r2, 0);
    }

    private final int k(int r2, int r3) {
        if (r2 < this.f1843c || r2 > this.d) {
            return -1;
        }
        return H(r2, r3);
    }

    private static <UT, UB> int l(ca<UT, UB> caVar, T t) {
        return caVar.s(caVar.k(t));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int m(T t, byte[] bArr, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long j, int r28, t5 t5Var) throws IOException {
        Object objValueOf;
        Object objValueOf2;
        int i;
        long jB;
        int r3;
        Object objValueOf3;
        Unsafe unsafe = s;
        long j2 = this.f1841a[r28 + 2] & 1048575;
        switch (r25) {
            case 51:
                if (r23 == 1) {
                    objValueOf = Double.valueOf(u5.m(bArr, r19));
                    unsafe.putObject(t, j, objValueOf);
                    i = r19 + 8;
                    unsafe.putInt(t, j2, r22);
                    return i;
                }
                return r19;
            case 52:
                if (r23 == 5) {
                    objValueOf2 = Float.valueOf(u5.o(bArr, r19));
                    unsafe.putObject(t, j, objValueOf2);
                    i = r19 + 4;
                    unsafe.putInt(t, j2, r22);
                    return i;
                }
                return r19;
            case 53:
            case 54:
                if (r23 == 0) {
                    i = u5.k(bArr, r19, t5Var);
                    jB = t5Var.f1824b;
                    objValueOf3 = Long.valueOf(jB);
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return i;
                }
                return r19;
            case 55:
            case 62:
                if (r23 == 0) {
                    i = u5.i(bArr, r19, t5Var);
                    r3 = t5Var.f1823a;
                    objValueOf3 = Integer.valueOf(r3);
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return i;
                }
                return r19;
            case 56:
            case 65:
                if (r23 == 1) {
                    objValueOf = Long.valueOf(u5.l(bArr, r19));
                    unsafe.putObject(t, j, objValueOf);
                    i = r19 + 8;
                    unsafe.putInt(t, j2, r22);
                    return i;
                }
                return r19;
            case 57:
            case 64:
                if (r23 == 5) {
                    objValueOf2 = Integer.valueOf(u5.h(bArr, r19));
                    unsafe.putObject(t, j, objValueOf2);
                    i = r19 + 4;
                    unsafe.putInt(t, j2, r22);
                    return i;
                }
                return r19;
            case 58:
                if (r23 == 0) {
                    i = u5.k(bArr, r19, t5Var);
                    objValueOf3 = Boolean.valueOf(t5Var.f1824b != 0);
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return i;
                }
                return r19;
            case 59:
                if (r23 == 2) {
                    i = u5.i(bArr, r19, t5Var);
                    int r4 = t5Var.f1823a;
                    if (r4 == 0) {
                        objValueOf3 = "";
                        unsafe.putObject(t, j, objValueOf3);
                        unsafe.putInt(t, j2, r22);
                        return i;
                    }
                    if ((r24 & 536870912) != 0 && !ma.g(bArr, i, i + r4)) {
                        throw q7.h();
                    }
                    unsafe.putObject(t, j, new String(bArr, i, r4, l7.f1762a));
                    i += r4;
                    unsafe.putInt(t, j2, r22);
                    return i;
                }
                return r19;
            case 60:
                if (r23 == 2) {
                    i = u5.g(s(r28), bArr, r19, r20, t5Var);
                    Object object = unsafe.getInt(t, j2) == r22 ? unsafe.getObject(t, j) : null;
                    objValueOf3 = t5Var.f1825c;
                    if (object != null) {
                        objValueOf3 = l7.e(object, objValueOf3);
                    }
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return i;
                }
                return r19;
            case 61:
                if (r23 == 2) {
                    i = u5.q(bArr, r19, t5Var);
                    objValueOf3 = t5Var.f1825c;
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return i;
                }
                return r19;
            case 63:
                if (r23 == 0) {
                    int i2 = u5.i(bArr, r19, t5Var);
                    int r42 = t5Var.f1823a;
                    m7 m7VarO = O(r28);
                    if (m7VarO != null && !m7VarO.e(r42)) {
                        U(t).c(r21, Long.valueOf(r42));
                        return i2;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(r42));
                    i = i2;
                    unsafe.putInt(t, j2, r22);
                    return i;
                }
                return r19;
            case 66:
                if (r23 == 0) {
                    i = u5.i(bArr, r19, t5Var);
                    r3 = l6.k(t5Var.f1823a);
                    objValueOf3 = Integer.valueOf(r3);
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return i;
                }
                return r19;
            case 67:
                if (r23 == 0) {
                    i = u5.k(bArr, r19, t5Var);
                    jB = l6.b(t5Var.f1824b);
                    objValueOf3 = Long.valueOf(jB);
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return i;
                }
                return r19;
            case 68:
                if (r23 == 3) {
                    i = u5.f(s(r28), bArr, r19, r20, (r21 & (-8)) | 4, t5Var);
                    Object object2 = unsafe.getInt(t, j2) == r22 ? unsafe.getObject(t, j) : null;
                    objValueOf3 = t5Var.f1825c;
                    if (object2 != null) {
                        objValueOf3 = l7.e(object2, objValueOf3);
                    }
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return i;
                }
                return r19;
            default:
                return r19;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x026e, code lost:
    
        if (r30.f1824b != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0270, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0272, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0273, code lost:
    
        r11.h(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0276, code lost:
    
        if (r4 >= r20) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0278, code lost:
    
        r6 = c.a.b.b.g.c.u5.i(r18, r4, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x027e, code lost:
    
        if (r21 != r30.f1823a) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0280, code lost:
    
        r4 = c.a.b.b.g.c.u5.k(r18, r6, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0288, code lost:
    
        if (r30.f1824b == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0150, code lost:
    
        r11.add(c.a.b.b.g.c.y5.r(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0273, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
    
        if (r4 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
    
        r11.add(c.a.b.b.g.c.y5.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0148, code lost:
    
        r11.add(c.a.b.b.g.c.y5.r(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0150, code lost:
    
        if (r1 >= r20) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0152, code lost:
    
        r4 = c.a.b.b.g.c.u5.i(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0158, code lost:
    
        if (r21 != r30.f1823a) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015a, code lost:
    
        r1 = c.a.b.b.g.c.u5.i(r18, r4, r30);
        r4 = r30.f1823a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0160, code lost:
    
        if (r4 < 0) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
    
        if (r4 > (r18.length - r1)) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0166, code lost:
    
        if (r4 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016d, code lost:
    
        throw c.a.b.b.g.c.q7.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0172, code lost:
    
        throw c.a.b.b.g.c.q7.b();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01cf -> B:94:0x01ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0213 -> B:112:0x01ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x0288 -> B:151:0x0270). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0166 -> B:67:0x0142). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int n(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, c.a.b.b.g.c.t5 r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.v8.n(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, c.a.b.b.g.c.t5):int");
    }

    private final <K, V> int o(T t, byte[] bArr, int r10, int r11, int r12, long j, t5 t5Var) throws IOException {
        Unsafe unsafe = s;
        Object objI = I(r12);
        Object object = unsafe.getObject(t, j);
        if (this.q.e(object)) {
            Object objA = this.q.a(objI);
            this.q.f(objA, object);
            unsafe.putObject(t, j, objA);
            object = objA;
        }
        m8<?, ?> m8VarC = this.q.c(objI);
        Map<?, ?> mapB = this.q.b(object);
        int i = u5.i(bArr, r10, t5Var);
        int r13 = t5Var.f1823a;
        if (r13 < 0 || r13 > r11 - i) {
            throw q7.a();
        }
        int r132 = r13 + i;
        K k = m8VarC.f1772b;
        V v = m8VarC.d;
        while (i < r132) {
            int r1 = i + 1;
            int r102 = bArr[i];
            if (r102 < 0) {
                r1 = u5.d(r102, bArr, r1, t5Var);
                r102 = t5Var.f1823a;
            }
            int r2 = r1;
            int r14 = r102 >>> 3;
            int r3 = r102 & 7;
            if (r14 != 1) {
                if (r14 == 2 && r3 == m8VarC.f1773c.g()) {
                    i = q(bArr, r2, r11, m8VarC.f1773c, m8VarC.d.getClass(), t5Var);
                    v = t5Var.f1825c;
                } else {
                    i = u5.a(r102, bArr, r2, r11, t5Var);
                }
            } else if (r3 == m8VarC.f1771a.g()) {
                i = q(bArr, r2, r11, m8VarC.f1771a, null, t5Var);
                k = (K) t5Var.f1825c;
            } else {
                i = u5.a(r102, bArr, r2, r11, t5Var);
            }
        }
        if (i != r132) {
            throw q7.g();
        }
        mapB.put(k, v);
        return r132;
    }

    private static int q(byte[] bArr, int r2, int r3, ua uaVar, Class<?> cls, t5 t5Var) throws IOException {
        int i;
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        int r22;
        long jB;
        switch (y8.f1871a[uaVar.ordinal()]) {
            case 1:
                i = u5.k(bArr, r2, t5Var);
                objValueOf = Boolean.valueOf(t5Var.f1824b != 0);
                t5Var.f1825c = objValueOf;
                return i;
            case 2:
                return u5.q(bArr, r2, t5Var);
            case 3:
                objValueOf2 = Double.valueOf(u5.m(bArr, r2));
                t5Var.f1825c = objValueOf2;
                return r2 + 8;
            case 4:
            case 5:
                objValueOf3 = Integer.valueOf(u5.h(bArr, r2));
                t5Var.f1825c = objValueOf3;
                return r2 + 4;
            case 6:
            case 7:
                objValueOf2 = Long.valueOf(u5.l(bArr, r2));
                t5Var.f1825c = objValueOf2;
                return r2 + 8;
            case 8:
                objValueOf3 = Float.valueOf(u5.o(bArr, r2));
                t5Var.f1825c = objValueOf3;
                return r2 + 4;
            case 9:
            case 10:
            case 11:
                i = u5.i(bArr, r2, t5Var);
                r22 = t5Var.f1823a;
                objValueOf = Integer.valueOf(r22);
                t5Var.f1825c = objValueOf;
                return i;
            case 12:
            case 13:
                i = u5.k(bArr, r2, t5Var);
                jB = t5Var.f1824b;
                objValueOf = Long.valueOf(jB);
                t5Var.f1825c = objValueOf;
                return i;
            case 14:
                return u5.g(f9.a().b(cls), bArr, r2, r3, t5Var);
            case 15:
                i = u5.i(bArr, r2, t5Var);
                r22 = l6.k(t5Var.f1823a);
                objValueOf = Integer.valueOf(r22);
                t5Var.f1825c = objValueOf;
                return i;
            case 16:
                i = u5.k(bArr, r2, t5Var);
                jB = l6.b(t5Var.f1824b);
                objValueOf = Long.valueOf(jB);
                t5Var.f1825c = objValueOf;
                return i;
            case 17:
                return u5.p(bArr, r2, t5Var);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> c.a.b.b.g.c.v8<T> r(java.lang.Class<T> r33, c.a.b.b.g.c.p8 r34, c.a.b.b.g.c.z8 r35, c.a.b.b.g.c.a8 r36, c.a.b.b.g.c.ca<?, ?> r37, c.a.b.b.g.c.w6<?> r38, c.a.b.b.g.c.o8 r39) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.v8.r(java.lang.Class, c.a.b.b.g.c.p8, c.a.b.b.g.c.z8, c.a.b.b.g.c.a8, c.a.b.b.g.c.ca, c.a.b.b.g.c.w6, c.a.b.b.g.c.o8):c.a.b.b.g.c.v8");
    }

    private final j9 s(int r4) {
        int r42 = (r4 / 3) << 1;
        j9 j9Var = (j9) this.f1842b[r42];
        if (j9Var != null) {
            return j9Var;
        }
        j9<T> j9VarB = f9.a().b((Class) this.f1842b[r42 + 1]);
        this.f1842b[r42] = j9VarB;
        return j9VarB;
    }

    private final <K, V, UT, UB> UB t(int r5, int r6, Map<K, V> map, m7 m7Var, UB ub, ca<UT, UB> caVar) {
        m8<?, ?> m8VarC = this.q.c(I(r5));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!m7Var.e(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = caVar.a();
                }
                g6 g6VarA = y5.A(i8.a(m8VarC, next.getKey(), next.getValue()));
                try {
                    i8.b(g6VarA.b(), m8VarC, next.getKey(), next.getValue());
                    caVar.e(ub, r6, g6VarA.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final <UT, UB> UB u(Object obj, int r10, UB ub, ca<UT, UB> caVar) {
        m7 m7VarO;
        int r3 = this.f1841a[r10];
        Object objF = ia.F(obj, Q(r10) & 1048575);
        return (objF == null || (m7VarO = O(r10)) == null) ? ub : (UB) t(r10, r3, this.q.b(objF), m7VarO, ub, caVar);
    }

    private static Field v(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }

    private static List<?> w(Object obj, long j) {
        return (List) ia.F(obj, j);
    }

    private static void x(int r1, Object obj, ab abVar) throws IOException {
        if (obj instanceof String) {
            abVar.t(r1, (String) obj);
        } else {
            abVar.D(r1, (y5) obj);
        }
    }

    private static <UT, UB> void y(ca<UT, UB> caVar, T t, ab abVar) throws IOException {
        caVar.g(caVar.k(t), abVar);
    }

    private final <K, V> void z(ab abVar, int r3, Object obj, int r5) throws IOException {
        if (obj != null) {
            abVar.I(r3, this.q.c(I(r5)), this.q.g(obj));
        }
    }

    @Override // c.a.b.b.g.c.j9
    public final T a() {
        return (T) this.m.b(this.e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[PHI: r3
  0x00e2: PHI (r3v13 java.lang.Object) = (r3v11 java.lang.Object), (r3v14 java.lang.Object) binds: [B:67:0x00e0, B:62:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // c.a.b.b.g.c.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(T r9) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.v8.b(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03b8, code lost:
    
        if (D(r19, r15, r3) != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03d8, code lost:
    
        if (D(r19, r15, r3) != false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03e0, code lost:
    
        if (D(r19, r15, r3) != false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0400, code lost:
    
        if (D(r19, r15, r3) != false) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0408, code lost:
    
        if (D(r19, r15, r3) != false) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04b9, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x04c7, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04d5, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x04e3, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x04f1, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04ff, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x050d, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x051a, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0527, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0534, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0541, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x054e, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x055b, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0568, code lost:
    
        if (r4 > 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x056a, code lost:
    
        r8 = (c.a.b.b.g.c.o6.h0(r15) + c.a.b.b.g.c.o6.p0(r4)) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0632, code lost:
    
        if ((r12 & r11) != 0) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0634, code lost:
    
        r4 = c.a.b.b.g.c.o6.V(r15, (c.a.b.b.g.c.r8) r2.getObject(r19, r8), s(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x065f, code lost:
    
        if ((r12 & r11) != 0) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0661, code lost:
    
        r4 = c.a.b.b.g.c.o6.v0(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x066a, code lost:
    
        if ((r12 & r11) != 0) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x066c, code lost:
    
        r8 = c.a.b.b.g.c.o6.B0(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x068f, code lost:
    
        if ((r12 & r11) != 0) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0691, code lost:
    
        r4 = r2.getObject(r19, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x069e, code lost:
    
        if ((r12 & r11) != 0) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x06a0, code lost:
    
        r4 = c.a.b.b.g.c.m9.a(r15, r2.getObject(r19, r8), s(r3));
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ca A[PHI: r5
  0x02ca: PHI (r5v108 java.lang.Object) = (r5v27 java.lang.Object), (r5v106 java.lang.Object), (r5v110 java.lang.Object) binds: [B:163:0x02f1, B:44:0x00a8, B:155:0x02c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f4 A[PHI: r5
  0x02f4: PHI (r5v104 java.lang.Object) = (r5v27 java.lang.Object), (r5v106 java.lang.Object) binds: [B:163:0x02f1, B:44:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0628 A[PHI: r5
  0x0628: PHI (r5v4 int) = 
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v16 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v17 int)
  (r5v1 int)
 binds: [B:206:0x03af, B:368:0x06c5, B:362:0x06b0, B:359:0x069e, B:355:0x068f, B:351:0x0682, B:347:0x0675, B:343:0x066a, B:340:0x065f, B:336:0x0652, B:332:0x0645, B:329:0x0632, B:306:0x0568, B:303:0x055b, B:300:0x054e, B:297:0x0541, B:294:0x0534, B:291:0x0527, B:288:0x051a, B:285:0x050d, B:282:0x04ff, B:279:0x04f1, B:276:0x04e3, B:273:0x04d5, B:270:0x04c7, B:267:0x04b9, B:262:0x0485, B:259:0x0478, B:256:0x0468, B:253:0x0458, B:250:0x0448, B:247:0x043a, B:244:0x042d, B:241:0x0420, B:236:0x0410, B:233:0x0408, B:230:0x0400, B:227:0x03f4, B:224:0x03e8, B:345:0x0671, B:221:0x03e0, B:218:0x03d8, B:215:0x03cc, B:212:0x03c0, B:324:0x0627, B:209:0x03b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0695 A[PHI: r4
  0x0695: PHI (r4v144 java.lang.Object) = (r4v13 java.lang.Object), (r4v140 java.lang.Object), (r4v147 java.lang.Object) binds: [B:364:0x06b8, B:238:0x0418, B:356:0x0691] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06bb A[PHI: r4
  0x06bb: PHI (r4v136 java.lang.Object) = (r4v13 java.lang.Object), (r4v140 java.lang.Object) binds: [B:364:0x06b8, B:238:0x0418] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // c.a.b.b.g.c.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(T r19) {
        /*
            Method dump skipped, instructions count: 2238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.v8.c(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02c6, code lost:
    
        if (r0 == r5) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ca, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r18;
        r1 = r25;
        r6 = r27;
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x030d, code lost:
    
        if (r0 == r15) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x032e, code lost:
    
        if (r0 == r15) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0330, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0095. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    @Override // c.a.b.b.g.c.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(T r31, byte[] r32, int r33, int r34, c.a.b.b.g.c.t5 r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.v8.d(java.lang.Object, byte[], int, int, c.a.b.b.g.c.t5):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [c.a.b.b.g.c.j9] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [c.a.b.b.g.c.j9] */
    @Override // c.a.b.b.g.c.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(T r19) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.v8.e(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b2  */
    @Override // c.a.b.b.g.c.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.v8.f(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // c.a.b.b.g.c.j9
    public final void g(T t) {
        int r1;
        int r0 = this.k;
        while (true) {
            r1 = this.l;
            if (r0 >= r1) {
                break;
            }
            long jQ = Q(this.j[r0]) & 1048575;
            Object objF = ia.F(t, jQ);
            if (objF != null) {
                ia.j(t, jQ, this.q.d(objF));
            }
            r0++;
        }
        int length = this.j.length;
        while (r1 < length) {
            this.n.e(t, this.j[r1]);
            r1++;
        }
        this.o.q(t);
        if (this.f) {
            this.p.j(t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // c.a.b.b.g.c.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(T r14, c.a.b.b.g.c.ab r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.v8.h(java.lang.Object, c.a.b.b.g.c.ab):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.a.b.b.g.c.j9
    public final void i(T t, l9 l9Var, u6 u6Var) throws IOException {
        long j;
        Object objE;
        int r5;
        List<Double> listB;
        List<Float> listB2;
        List<Long> listB3;
        List<Long> listB4;
        List<Integer> listB5;
        List<Long> listB6;
        List<Integer> listB7;
        List<Boolean> listB8;
        List<Integer> listB9;
        List<Integer> listB10;
        m7 m7VarO;
        List<Integer> listB11;
        List<Long> listB12;
        List<Integer> listB13;
        List<Long> listB14;
        if (u6Var == null) {
            throw null;
        }
        ca caVar = this.o;
        w6<?> w6Var = this.p;
        Object objI = null;
        Object objU = null;
        while (true) {
            try {
                int r2 = l9Var.a();
                int r3 = X(r2);
                if (r3 >= 0) {
                    int r4 = Q(r3);
                    switch ((267386880 & r4) >>> 20) {
                        case 0:
                            ia.f(t, r4 & 1048575, l9Var.d());
                            J(t, r3);
                            break;
                        case 1:
                            ia.g(t, r4 & 1048575, l9Var.f());
                            J(t, r3);
                            break;
                        case 2:
                            ia.i(t, r4 & 1048575, l9Var.B0());
                            J(t, r3);
                            break;
                        case 3:
                            ia.i(t, r4 & 1048575, l9Var.y0());
                            J(t, r3);
                            break;
                        case 4:
                            ia.h(t, r4 & 1048575, l9Var.e0());
                            J(t, r3);
                            break;
                        case 5:
                            ia.i(t, r4 & 1048575, l9Var.n0());
                            J(t, r3);
                            break;
                        case 6:
                            ia.h(t, r4 & 1048575, l9Var.u0());
                            J(t, r3);
                            break;
                        case 7:
                            ia.k(t, r4 & 1048575, l9Var.A0());
                            J(t, r3);
                            break;
                        case 8:
                            A(t, r4, l9Var);
                            J(t, r3);
                            break;
                        case 9:
                            if (C(t, r3)) {
                                j = r4 & 1048575;
                                objE = l7.e(ia.F(t, j), l9Var.u(s(r3), u6Var));
                                ia.j(t, j, objE);
                                break;
                            } else {
                                ia.j(t, r4 & 1048575, l9Var.u(s(r3), u6Var));
                                J(t, r3);
                                break;
                            }
                        case 10:
                            ia.j(t, r4 & 1048575, l9Var.I());
                            J(t, r3);
                            break;
                        case 11:
                            ia.h(t, r4 & 1048575, l9Var.O());
                            J(t, r3);
                            break;
                        case 12:
                            r5 = l9Var.x();
                            m7 m7VarO2 = O(r3);
                            if (m7VarO2 != null && !m7VarO2.e(r5)) {
                                objU = m9.h(r2, r5, objU, caVar);
                                break;
                            } else {
                                ia.h(t, r4 & 1048575, r5);
                                J(t, r3);
                                break;
                            }
                            break;
                        case 13:
                            ia.h(t, r4 & 1048575, l9Var.B());
                            J(t, r3);
                            break;
                        case 14:
                            ia.i(t, r4 & 1048575, l9Var.p0());
                            J(t, r3);
                            break;
                        case 15:
                            ia.h(t, r4 & 1048575, l9Var.l());
                            J(t, r3);
                            break;
                        case 16:
                            ia.i(t, r4 & 1048575, l9Var.e());
                            J(t, r3);
                            break;
                        case 17:
                            if (C(t, r3)) {
                                j = r4 & 1048575;
                                objE = l7.e(ia.F(t, j), l9Var.r(s(r3), u6Var));
                                ia.j(t, j, objE);
                                break;
                            } else {
                                ia.j(t, r4 & 1048575, l9Var.r(s(r3), u6Var));
                                J(t, r3);
                                break;
                            }
                        case 18:
                            listB = this.n.b(t, r4 & 1048575);
                            l9Var.A(listB);
                            break;
                        case 19:
                            listB2 = this.n.b(t, r4 & 1048575);
                            l9Var.t(listB2);
                            break;
                        case 20:
                            listB3 = this.n.b(t, r4 & 1048575);
                            l9Var.E(listB3);
                            break;
                        case 21:
                            listB4 = this.n.b(t, r4 & 1048575);
                            l9Var.q(listB4);
                            break;
                        case 22:
                            listB5 = this.n.b(t, r4 & 1048575);
                            l9Var.p1(listB5);
                            break;
                        case 23:
                            listB6 = this.n.b(t, r4 & 1048575);
                            l9Var.j(listB6);
                            break;
                        case 24:
                            listB7 = this.n.b(t, r4 & 1048575);
                            l9Var.p(listB7);
                            break;
                        case 25:
                            listB8 = this.n.b(t, r4 & 1048575);
                            l9Var.o(listB8);
                            break;
                        case 26:
                            if (V(r4)) {
                                l9Var.w(this.n.b(t, r4 & 1048575));
                                break;
                            } else {
                                l9Var.C(this.n.b(t, r4 & 1048575));
                                break;
                            }
                        case 27:
                            l9Var.y(this.n.b(t, r4 & 1048575), s(r3), u6Var);
                            break;
                        case 28:
                            l9Var.s(this.n.b(t, r4 & 1048575));
                            break;
                        case 29:
                            listB9 = this.n.b(t, r4 & 1048575);
                            l9Var.g(listB9);
                            break;
                        case 30:
                            listB10 = this.n.b(t, r4 & 1048575);
                            l9Var.m(listB10);
                            m7VarO = O(r3);
                            objU = m9.i(r2, listB10, m7VarO, objU, caVar);
                            break;
                        case 31:
                            listB11 = this.n.b(t, r4 & 1048575);
                            l9Var.k(listB11);
                            break;
                        case 32:
                            listB12 = this.n.b(t, r4 & 1048575);
                            l9Var.i(listB12);
                            break;
                        case 33:
                            listB13 = this.n.b(t, r4 & 1048575);
                            l9Var.h(listB13);
                            break;
                        case 34:
                            listB14 = this.n.b(t, r4 & 1048575);
                            l9Var.n(listB14);
                            break;
                        case 35:
                            listB = this.n.b(t, r4 & 1048575);
                            l9Var.A(listB);
                            break;
                        case 36:
                            listB2 = this.n.b(t, r4 & 1048575);
                            l9Var.t(listB2);
                            break;
                        case 37:
                            listB3 = this.n.b(t, r4 & 1048575);
                            l9Var.E(listB3);
                            break;
                        case 38:
                            listB4 = this.n.b(t, r4 & 1048575);
                            l9Var.q(listB4);
                            break;
                        case 39:
                            listB5 = this.n.b(t, r4 & 1048575);
                            l9Var.p1(listB5);
                            break;
                        case 40:
                            listB6 = this.n.b(t, r4 & 1048575);
                            l9Var.j(listB6);
                            break;
                        case 41:
                            listB7 = this.n.b(t, r4 & 1048575);
                            l9Var.p(listB7);
                            break;
                        case 42:
                            listB8 = this.n.b(t, r4 & 1048575);
                            l9Var.o(listB8);
                            break;
                        case 43:
                            listB9 = this.n.b(t, r4 & 1048575);
                            l9Var.g(listB9);
                            break;
                        case 44:
                            listB10 = this.n.b(t, r4 & 1048575);
                            l9Var.m(listB10);
                            m7VarO = O(r3);
                            objU = m9.i(r2, listB10, m7VarO, objU, caVar);
                            break;
                        case 45:
                            listB11 = this.n.b(t, r4 & 1048575);
                            l9Var.k(listB11);
                            break;
                        case 46:
                            listB12 = this.n.b(t, r4 & 1048575);
                            l9Var.i(listB12);
                            break;
                        case 47:
                            listB13 = this.n.b(t, r4 & 1048575);
                            l9Var.h(listB13);
                            break;
                        case 48:
                            listB14 = this.n.b(t, r4 & 1048575);
                            l9Var.n(listB14);
                            break;
                        case 49:
                            l9Var.D(this.n.b(t, r4 & 1048575), s(r3), u6Var);
                            break;
                        case 50:
                            Object objI2 = I(r3);
                            long jQ = Q(r3) & 1048575;
                            Object objF = ia.F(t, jQ);
                            if (objF == null) {
                                objF = this.q.a(objI2);
                                ia.j(t, jQ, objF);
                            } else if (this.q.e(objF)) {
                                Object objA = this.q.a(objI2);
                                this.q.f(objA, objF);
                                ia.j(t, jQ, objA);
                                objF = objA;
                            }
                            l9Var.v(this.q.b(objF), this.q.c(objI2), u6Var);
                            break;
                        case 51:
                            ia.j(t, r4 & 1048575, Double.valueOf(l9Var.d()));
                            K(t, r2, r3);
                            break;
                        case 52:
                            ia.j(t, r4 & 1048575, Float.valueOf(l9Var.f()));
                            K(t, r2, r3);
                            break;
                        case 53:
                            ia.j(t, r4 & 1048575, Long.valueOf(l9Var.B0()));
                            K(t, r2, r3);
                            break;
                        case 54:
                            ia.j(t, r4 & 1048575, Long.valueOf(l9Var.y0()));
                            K(t, r2, r3);
                            break;
                        case 55:
                            ia.j(t, r4 & 1048575, Integer.valueOf(l9Var.e0()));
                            K(t, r2, r3);
                            break;
                        case 56:
                            ia.j(t, r4 & 1048575, Long.valueOf(l9Var.n0()));
                            K(t, r2, r3);
                            break;
                        case 57:
                            ia.j(t, r4 & 1048575, Integer.valueOf(l9Var.u0()));
                            K(t, r2, r3);
                            break;
                        case 58:
                            ia.j(t, r4 & 1048575, Boolean.valueOf(l9Var.A0()));
                            K(t, r2, r3);
                            break;
                        case 59:
                            A(t, r4, l9Var);
                            K(t, r2, r3);
                            break;
                        case 60:
                            int r42 = r4 & 1048575;
                            if (D(t, r2, r3)) {
                                long j2 = r42;
                                ia.j(t, j2, l7.e(ia.F(t, j2), l9Var.u(s(r3), u6Var)));
                            } else {
                                ia.j(t, r42, l9Var.u(s(r3), u6Var));
                                J(t, r3);
                            }
                            K(t, r2, r3);
                            break;
                        case 61:
                            ia.j(t, r4 & 1048575, l9Var.I());
                            K(t, r2, r3);
                            break;
                        case 62:
                            ia.j(t, r4 & 1048575, Integer.valueOf(l9Var.O()));
                            K(t, r2, r3);
                            break;
                        case 63:
                            r5 = l9Var.x();
                            m7 m7VarO3 = O(r3);
                            if (m7VarO3 != null && !m7VarO3.e(r5)) {
                                objU = m9.h(r2, r5, objU, caVar);
                                break;
                            }
                            ia.j(t, r4 & 1048575, Integer.valueOf(r5));
                            K(t, r2, r3);
                            break;
                        case 64:
                            ia.j(t, r4 & 1048575, Integer.valueOf(l9Var.B()));
                            K(t, r2, r3);
                            break;
                        case 65:
                            ia.j(t, r4 & 1048575, Long.valueOf(l9Var.p0()));
                            K(t, r2, r3);
                            break;
                        case 66:
                            ia.j(t, r4 & 1048575, Integer.valueOf(l9Var.l()));
                            K(t, r2, r3);
                            break;
                        case 67:
                            ia.j(t, r4 & 1048575, Long.valueOf(l9Var.e()));
                            K(t, r2, r3);
                            break;
                        case 68:
                            ia.j(t, r4 & 1048575, l9Var.r(s(r3), u6Var));
                            K(t, r2, r3);
                            break;
                        default:
                            if (objU == null) {
                                try {
                                    objU = caVar.a();
                                } catch (t7 unused) {
                                    caVar.i(l9Var);
                                    if (objU == null) {
                                        objU = caVar.o(t);
                                    }
                                    if (!caVar.j(objU, l9Var)) {
                                        for (int r14 = this.k; r14 < this.l; r14++) {
                                            objU = u(t, this.j[r14], objU, caVar);
                                        }
                                        if (objU != null) {
                                            caVar.n(t, objU);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!caVar.j(objU, l9Var)) {
                                for (int r142 = this.k; r142 < this.l; r142++) {
                                    objU = u(t, this.j[r142], objU, caVar);
                                }
                                if (objU != null) {
                                    caVar.n(t, objU);
                                    return;
                                }
                                return;
                            }
                            break;
                    }
                } else {
                    if (r2 == Integer.MAX_VALUE) {
                        for (int r143 = this.k; r143 < this.l; r143++) {
                            objU = u(t, this.j[r143], objU, caVar);
                        }
                        if (objU != null) {
                            caVar.n(t, objU);
                            return;
                        }
                        return;
                    }
                    Object objC = !this.f ? null : w6Var.c(u6Var, this.e, r2);
                    if (objC != null) {
                        if (objI == null) {
                            objI = w6Var.i(t);
                        }
                        x6<T> x6Var = objI;
                        objU = w6Var.d(l9Var, objC, u6Var, x6Var, objU, caVar);
                        objI = x6Var;
                    } else {
                        caVar.i(l9Var);
                        if (objU == null) {
                            objU = caVar.o(t);
                        }
                        if (!caVar.j(objU, l9Var)) {
                            for (int r144 = this.k; r144 < this.l; r144++) {
                                objU = u(t, this.j[r144], objU, caVar);
                            }
                            if (objU != null) {
                                caVar.n(t, objU);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int r15 = this.k; r15 < this.l; r15++) {
                    objU = u(t, this.j[r15], objU, caVar);
                }
                if (objU != null) {
                    caVar.n(t, objU);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // c.a.b.b.g.c.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(T r7, T r8) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.v8.j(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x04c0, code lost:
    
        if (r6 == 1048575) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04c2, code lost:
    
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04c8, code lost:
    
        r1 = null;
        r2 = r9.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04cd, code lost:
    
        if (r2 >= r9.l) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04cf, code lost:
    
        r1 = (c.a.b.b.g.c.fa) r9.u(r12, r9.j[r2], r1, r9.o);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04de, code lost:
    
        if (r1 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04e0, code lost:
    
        r9.o.n(r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04e7, code lost:
    
        if (r7 != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04e9, code lost:
    
        if (r0 != r31) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04f0, code lost:
    
        throw c.a.b.b.g.c.q7.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04f1, code lost:
    
        if (r0 > r31) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04f3, code lost:
    
        if (r3 != r7) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04f5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04fa, code lost:
    
        throw c.a.b.b.g.c.q7.g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int p(T r28, byte[] r29, int r30, int r31, int r32, c.a.b.b.g.c.t5 r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.v8.p(java.lang.Object, byte[], int, int, int, c.a.b.b.g.c.t5):int");
    }
}
