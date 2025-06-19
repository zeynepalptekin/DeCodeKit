package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class bb2<T> implements ub2<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = tc2.o();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f2815a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f2816b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2817c;
    private final int d;
    private final xa2 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final fb2 m;
    private final ga2 n;
    private final mc2<?, ?> o;
    private final a92<?> p;
    private final ua2 q;

    private bb2(int[] r1, Object[] objArr, int r3, int r4, xa2 xa2Var, boolean z, boolean z2, int[] r8, int r9, int r10, fb2 fb2Var, ga2 ga2Var, mc2<?, ?> mc2Var, a92<?> a92Var, ua2 ua2Var) {
        this.f2815a = r1;
        this.f2816b = objArr;
        this.f2817c = r3;
        this.d = r4;
        this.g = xa2Var instanceof l92;
        this.h = z;
        this.f = a92Var != null && a92Var.j(xa2Var);
        this.i = false;
        this.j = r8;
        this.k = r9;
        this.l = r10;
        this.m = fb2Var;
        this.n = ga2Var;
        this.o = mc2Var;
        this.p = a92Var;
        this.e = xa2Var;
        this.q = ua2Var;
    }

    private final boolean A(T t, int r3, int r4, int r5, int r6) {
        return r4 == 1048575 ? K(t, r3) : (r5 & r6) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean B(Object obj, int r3, ub2 ub2Var) {
        return ub2Var.h(tc2.G(obj, r3 & 1048575));
    }

    private final int C(int r2, int r3) {
        if (r2 < this.f2817c || r2 > this.d) {
            return -1;
        }
        return D(r2, r3);
    }

    private final int D(int r5, int r6) {
        int length = (this.f2815a.length / 3) - 1;
        while (r6 <= length) {
            int r1 = (length + r6) >>> 1;
            int r2 = r1 * 3;
            int r3 = this.f2815a[r2];
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

    private static qc2 E(Object obj) {
        l92 l92Var = (l92) obj;
        qc2 qc2Var = l92Var.zzijc;
        if (qc2Var != qc2.h()) {
            return qc2Var;
        }
        qc2 qc2VarI = qc2.i();
        l92Var.zzijc = qc2VarI;
        return qc2VarI;
    }

    private final void F(T t, int r4, int r5) {
        tc2.k(t, T(r5) & 1048575, r4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void G(T r18, com.google.android.gms.internal.ads.kd2 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb2.G(java.lang.Object, com.google.android.gms.internal.ads.kd2):void");
    }

    private final void H(T t, T t2, int r7) {
        int r0 = S(r7);
        int r1 = this.f2815a[r7];
        long j = r0 & 1048575;
        if (z(t2, r1, r7)) {
            Object objG = tc2.G(t, j);
            Object objG2 = tc2.G(t2, j);
            if (objG != null && objG2 != null) {
                tc2.f(t, j, o92.f(objG, objG2));
                F(t, r1, r7);
            } else if (objG2 != null) {
                tc2.f(t, j, objG2);
                F(t, r1, r7);
            }
        }
    }

    private final boolean I(T t, T t2, int r3) {
        return K(t, r3) == K(t2, r3);
    }

    private static List<?> J(Object obj, long j) {
        return (List) tc2.G(obj, j);
    }

    private final boolean K(T t, int r11) {
        int r0 = T(r11);
        long j = r0 & 1048575;
        if (j != 1048575) {
            return (tc2.z(t, j) & (1 << (r0 >>> 20))) != 0;
        }
        int r112 = S(r11);
        long j2 = r112 & 1048575;
        switch ((r112 & 267386880) >>> 20) {
            case 0:
                return tc2.F(t, j2) != 0.0d;
            case 1:
                return tc2.E(t, j2) != 0.0f;
            case 2:
                return tc2.B(t, j2) != 0;
            case 3:
                return tc2.B(t, j2) != 0;
            case 4:
                return tc2.z(t, j2) != 0;
            case 5:
                return tc2.B(t, j2) != 0;
            case 6:
                return tc2.z(t, j2) != 0;
            case 7:
                return tc2.D(t, j2);
            case 8:
                Object objG = tc2.G(t, j2);
                if (objG instanceof String) {
                    return !((String) objG).isEmpty();
                }
                if (objG instanceof a82) {
                    return !a82.e.equals(objG);
                }
                throw new IllegalArgumentException();
            case 9:
                return tc2.G(t, j2) != null;
            case 10:
                return !a82.e.equals(tc2.G(t, j2));
            case 11:
                return tc2.z(t, j2) != 0;
            case 12:
                return tc2.z(t, j2) != 0;
            case 13:
                return tc2.z(t, j2) != 0;
            case 14:
                return tc2.B(t, j2) != 0;
            case 15:
                return tc2.z(t, j2) != 0;
            case 16:
                return tc2.B(t, j2) != 0;
            case 17:
                return tc2.G(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static <T> double L(T t, long j) {
        return ((Double) tc2.G(t, j)).doubleValue();
    }

    private final void M(T t, int r7) {
        int r72 = T(r7);
        long j = 1048575 & r72;
        if (j == 1048575) {
            return;
        }
        tc2.k(t, j, (1 << (r72 >>> 20)) | tc2.z(t, j));
    }

    private static <T> float N(T t, long j) {
        return ((Float) tc2.G(t, j)).floatValue();
    }

    private static <T> int O(T t, long j) {
        return ((Integer) tc2.G(t, j)).intValue();
    }

    private final ub2 P(int r4) {
        int r42 = (r4 / 3) << 1;
        ub2 ub2Var = (ub2) this.f2816b[r42];
        if (ub2Var != null) {
            return ub2Var;
        }
        ub2<T> ub2VarC = mb2.b().c((Class) this.f2816b[r42 + 1]);
        this.f2816b[r42] = ub2VarC;
        return ub2VarC;
    }

    private final Object Q(int r2) {
        return this.f2816b[(r2 / 3) << 1];
    }

    private final t92 R(int r2) {
        return (t92) this.f2816b[((r2 / 3) << 1) + 1];
    }

    private final int S(int r2) {
        return this.f2815a[r2 + 1];
    }

    private final int T(int r2) {
        return this.f2815a[r2 + 2];
    }

    private static boolean U(int r1) {
        return (r1 & 536870912) != 0;
    }

    private final int V(int r2) {
        if (r2 < this.f2817c || r2 > this.d) {
            return -1;
        }
        return D(r2, 0);
    }

    private static <T> long W(T t, long j) {
        return ((Long) tc2.G(t, j)).longValue();
    }

    private static <T> boolean X(T t, long j) {
        return ((Boolean) tc2.G(t, j)).booleanValue();
    }

    private static <UT, UB> int k(mc2<UT, UB> mc2Var, T t) {
        return mc2Var.i(mc2Var.j(t));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int l(T t, byte[] bArr, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long j, int r28, v72 v72Var) throws IOException {
        Object objValueOf;
        Object objValueOf2;
        int r2;
        long jW;
        int r3;
        Object objValueOf3;
        Unsafe unsafe = s;
        long j2 = this.f2815a[r28 + 2] & 1048575;
        switch (r25) {
            case 51:
                if (r23 == 1) {
                    objValueOf = Double.valueOf(w72.p(bArr, r19));
                    unsafe.putObject(t, j, objValueOf);
                    r2 = r19 + 8;
                    unsafe.putInt(t, j2, r22);
                    return r2;
                }
                return r19;
            case 52:
                if (r23 == 5) {
                    objValueOf2 = Float.valueOf(w72.q(bArr, r19));
                    unsafe.putObject(t, j, objValueOf2);
                    r2 = r19 + 4;
                    unsafe.putInt(t, j2, r22);
                    return r2;
                }
                return r19;
            case 53:
            case 54:
                if (r23 == 0) {
                    r2 = w72.j(bArr, r19, v72Var);
                    jW = v72Var.f5641b;
                    objValueOf3 = Long.valueOf(jW);
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return r2;
                }
                return r19;
            case 55:
            case 62:
                if (r23 == 0) {
                    r2 = w72.h(bArr, r19, v72Var);
                    r3 = v72Var.f5640a;
                    objValueOf3 = Integer.valueOf(r3);
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return r2;
                }
                return r19;
            case 56:
            case 65:
                if (r23 == 1) {
                    objValueOf = Long.valueOf(w72.o(bArr, r19));
                    unsafe.putObject(t, j, objValueOf);
                    r2 = r19 + 8;
                    unsafe.putInt(t, j2, r22);
                    return r2;
                }
                return r19;
            case 57:
            case 64:
                if (r23 == 5) {
                    objValueOf2 = Integer.valueOf(w72.n(bArr, r19));
                    unsafe.putObject(t, j, objValueOf2);
                    r2 = r19 + 4;
                    unsafe.putInt(t, j2, r22);
                    return r2;
                }
                return r19;
            case 58:
                if (r23 == 0) {
                    r2 = w72.j(bArr, r19, v72Var);
                    objValueOf3 = Boolean.valueOf(v72Var.f5641b != 0);
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return r2;
                }
                return r19;
            case 59:
                if (r23 == 2) {
                    r2 = w72.h(bArr, r19, v72Var);
                    int r4 = v72Var.f5640a;
                    if (r4 == 0) {
                        objValueOf3 = "";
                        unsafe.putObject(t, j, objValueOf3);
                        unsafe.putInt(t, j2, r22);
                        return r2;
                    }
                    if ((r24 & 536870912) != 0 && !wc2.j(bArr, r2, r2 + r4)) {
                        throw w92.i();
                    }
                    unsafe.putObject(t, j, new String(bArr, r2, r4, o92.f4659a));
                    r2 += r4;
                    unsafe.putInt(t, j2, r22);
                    return r2;
                }
                return r19;
            case 60:
                if (r23 == 2) {
                    r2 = w72.g(P(r28), bArr, r19, r20, v72Var);
                    Object object = unsafe.getInt(t, j2) == r22 ? unsafe.getObject(t, j) : null;
                    objValueOf3 = v72Var.f5642c;
                    if (object != null) {
                        objValueOf3 = o92.f(object, objValueOf3);
                    }
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return r2;
                }
                return r19;
            case 61:
                if (r23 == 2) {
                    r2 = w72.m(bArr, r19, v72Var);
                    objValueOf3 = v72Var.f5642c;
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return r2;
                }
                return r19;
            case 63:
                if (r23 == 0) {
                    int r32 = w72.h(bArr, r19, v72Var);
                    int r42 = v72Var.f5640a;
                    t92 t92VarR = R(r28);
                    if (t92VarR != null && !t92VarR.a(r42)) {
                        E(t).k(r21, Long.valueOf(r42));
                        return r32;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(r42));
                    r2 = r32;
                    unsafe.putInt(t, j2, r22);
                    return r2;
                }
                return r19;
            case 66:
                if (r23 == 0) {
                    r2 = w72.h(bArr, r19, v72Var);
                    r3 = m82.B(v72Var.f5640a);
                    objValueOf3 = Integer.valueOf(r3);
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return r2;
                }
                return r19;
            case 67:
                if (r23 == 0) {
                    r2 = w72.j(bArr, r19, v72Var);
                    jW = m82.w(v72Var.f5641b);
                    objValueOf3 = Long.valueOf(jW);
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return r2;
                }
                return r19;
            case 68:
                if (r23 == 3) {
                    r2 = w72.f(P(r28), bArr, r19, r20, (r21 & (-8)) | 4, v72Var);
                    Object object2 = unsafe.getInt(t, j2) == r22 ? unsafe.getObject(t, j) : null;
                    objValueOf3 = v72Var.f5642c;
                    if (object2 != null) {
                        objValueOf3 = o92.f(object2, objValueOf3);
                    }
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, r22);
                    return r2;
                }
                return r19;
            default:
                return r19;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x026e, code lost:
    
        if (r30.f5641b != 0) goto L151;
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
    
        r6 = com.google.android.gms.internal.ads.w72.h(r18, r4, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x027e, code lost:
    
        if (r21 != r30.f5640a) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0280, code lost:
    
        r4 = com.google.android.gms.internal.ads.w72.j(r18, r6, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0288, code lost:
    
        if (r30.f5641b == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0150, code lost:
    
        r11.add(com.google.android.gms.internal.ads.a82.P(r18, r1, r4));
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
    
        r11.add(com.google.android.gms.internal.ads.a82.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0148, code lost:
    
        r11.add(com.google.android.gms.internal.ads.a82.P(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0150, code lost:
    
        if (r1 >= r20) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0152, code lost:
    
        r4 = com.google.android.gms.internal.ads.w72.h(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0158, code lost:
    
        if (r21 != r30.f5640a) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015a, code lost:
    
        r1 = com.google.android.gms.internal.ads.w72.h(r18, r4, r30);
        r4 = r30.f5640a;
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
    
        throw com.google.android.gms.internal.ads.w92.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0172, code lost:
    
        throw com.google.android.gms.internal.ads.w92.b();
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
    private final int m(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.v72 r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb2.m(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.v72):int");
    }

    private final <K, V> int n(T t, byte[] bArr, int r10, int r11, int r12, long j, v72 v72Var) throws IOException {
        Unsafe unsafe = s;
        Object objQ = Q(r12);
        Object object = unsafe.getObject(t, j);
        if (this.q.e(object)) {
            Object objB = this.q.b(objQ);
            this.q.h(objB, object);
            unsafe.putObject(t, j, objB);
            object = objB;
        }
        sa2<?, ?> sa2VarA = this.q.a(objQ);
        Map<?, ?> mapF = this.q.f(object);
        int r102 = w72.h(bArr, r10, v72Var);
        int r13 = v72Var.f5640a;
        if (r13 < 0 || r13 > r11 - r102) {
            throw w92.a();
        }
        int r132 = r13 + r102;
        K k = sa2VarA.f5238b;
        V v = sa2VarA.d;
        while (r102 < r132) {
            int r1 = r102 + 1;
            int r103 = bArr[r102];
            if (r103 < 0) {
                r1 = w72.d(r103, bArr, r1, v72Var);
                r103 = v72Var.f5640a;
            }
            int r2 = r1;
            int r14 = r103 >>> 3;
            int r3 = r103 & 7;
            if (r14 != 1) {
                if (r14 == 2 && r3 == sa2VarA.f5239c.g()) {
                    r102 = p(bArr, r2, r11, sa2VarA.f5239c, sa2VarA.d.getClass(), v72Var);
                    v = v72Var.f5642c;
                } else {
                    r102 = w72.a(r103, bArr, r2, r11, v72Var);
                }
            } else if (r3 == sa2VarA.f5237a.g()) {
                r102 = p(bArr, r2, r11, sa2VarA.f5237a, null, v72Var);
                k = (K) v72Var.f5642c;
            } else {
                r102 = w72.a(r103, bArr, r2, r11, v72Var);
            }
        }
        if (r102 != r132) {
            throw w92.h();
        }
        mapF.put(k, v);
        return r132;
    }

    private static int p(byte[] bArr, int r2, int r3, ed2 ed2Var, Class<?> cls, v72 v72Var) throws IOException {
        int r1;
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        int r22;
        long jW;
        switch (eb2.f3248a[ed2Var.ordinal()]) {
            case 1:
                r1 = w72.j(bArr, r2, v72Var);
                objValueOf = Boolean.valueOf(v72Var.f5641b != 0);
                v72Var.f5642c = objValueOf;
                return r1;
            case 2:
                return w72.m(bArr, r2, v72Var);
            case 3:
                objValueOf2 = Double.valueOf(w72.p(bArr, r2));
                v72Var.f5642c = objValueOf2;
                return r2 + 8;
            case 4:
            case 5:
                objValueOf3 = Integer.valueOf(w72.n(bArr, r2));
                v72Var.f5642c = objValueOf3;
                return r2 + 4;
            case 6:
            case 7:
                objValueOf2 = Long.valueOf(w72.o(bArr, r2));
                v72Var.f5642c = objValueOf2;
                return r2 + 8;
            case 8:
                objValueOf3 = Float.valueOf(w72.q(bArr, r2));
                v72Var.f5642c = objValueOf3;
                return r2 + 4;
            case 9:
            case 10:
            case 11:
                r1 = w72.h(bArr, r2, v72Var);
                r22 = v72Var.f5640a;
                objValueOf = Integer.valueOf(r22);
                v72Var.f5642c = objValueOf;
                return r1;
            case 12:
            case 13:
                r1 = w72.j(bArr, r2, v72Var);
                jW = v72Var.f5641b;
                objValueOf = Long.valueOf(jW);
                v72Var.f5642c = objValueOf;
                return r1;
            case 14:
                return w72.g(mb2.b().c(cls), bArr, r2, r3, v72Var);
            case 15:
                r1 = w72.h(bArr, r2, v72Var);
                r22 = m82.B(v72Var.f5640a);
                objValueOf = Integer.valueOf(r22);
                v72Var.f5642c = objValueOf;
                return r1;
            case 16:
                r1 = w72.j(bArr, r2, v72Var);
                jW = m82.w(v72Var.f5641b);
                objValueOf = Long.valueOf(jW);
                v72Var.f5642c = objValueOf;
                return r1;
            case 17:
                return w72.l(bArr, r2, v72Var);
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
    static <T> com.google.android.gms.internal.ads.bb2<T> q(java.lang.Class<T> r33, com.google.android.gms.internal.ads.va2 r34, com.google.android.gms.internal.ads.fb2 r35, com.google.android.gms.internal.ads.ga2 r36, com.google.android.gms.internal.ads.mc2<?, ?> r37, com.google.android.gms.internal.ads.a92<?> r38, com.google.android.gms.internal.ads.ua2 r39) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb2.q(java.lang.Class, com.google.android.gms.internal.ads.va2, com.google.android.gms.internal.ads.fb2, com.google.android.gms.internal.ads.ga2, com.google.android.gms.internal.ads.mc2, com.google.android.gms.internal.ads.a92, com.google.android.gms.internal.ads.ua2):com.google.android.gms.internal.ads.bb2");
    }

    private final <K, V, UT, UB> UB r(int r5, int r6, Map<K, V> map, t92 t92Var, UB ub, mc2<UT, UB> mc2Var) {
        sa2<?, ?> sa2VarA = this.q.a(Q(r5));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!t92Var.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = mc2Var.n();
                }
                i82 i82VarF = a82.F(pa2.a(sa2VarA, next.getKey(), next.getValue()));
                try {
                    pa2.b(i82VarF.b(), sa2VarA, next.getKey(), next.getValue());
                    mc2Var.b(ub, r6, i82VarF.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final <UT, UB> UB s(Object obj, int r10, UB ub, mc2<UT, UB> mc2Var) {
        t92 t92VarR;
        int r3 = this.f2815a[r10];
        Object objG = tc2.G(obj, S(r10) & 1048575);
        return (objG == null || (t92VarR = R(r10)) == null) ? ub : (UB) r(r10, r3, this.q.f(objG), t92VarR, ub, mc2Var);
    }

    private static Field t(Class<?> cls, String str) {
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

    private static void u(int r1, Object obj, kd2 kd2Var) throws IOException {
        if (obj instanceof String) {
            kd2Var.G(r1, (String) obj);
        } else {
            kd2Var.O(r1, (a82) obj);
        }
    }

    private static <UT, UB> void v(mc2<UT, UB> mc2Var, T t, kd2 kd2Var) throws IOException {
        mc2Var.d(mc2Var.j(t), kd2Var);
    }

    private final <K, V> void w(kd2 kd2Var, int r3, Object obj, int r5) throws IOException {
        if (obj != null) {
            kd2Var.E(r3, this.q.a(Q(r5)), this.q.d(obj));
        }
    }

    private final void x(Object obj, int r4, nb2 nb2Var) throws IOException {
        long j;
        Object objC;
        if (U(r4)) {
            j = r4 & 1048575;
            objC = nb2Var.t();
        } else {
            int r42 = r4 & 1048575;
            if (this.g) {
                j = r42;
                objC = nb2Var.z();
            } else {
                j = r42;
                objC = nb2Var.C();
            }
        }
        tc2.f(obj, j, objC);
    }

    private final void y(T t, T t2, int r6) {
        long jS = S(r6) & 1048575;
        if (K(t2, r6)) {
            Object objG = tc2.G(t, jS);
            Object objG2 = tc2.G(t2, jS);
            if (objG != null && objG2 != null) {
                tc2.f(t, jS, o92.f(objG, objG2));
                M(t, r6);
            } else if (objG2 != null) {
                tc2.f(t, jS, objG2);
                M(t, r6);
            }
        }
    }

    private final boolean z(T t, int r4, int r5) {
        return tc2.z(t, (long) (T(r5) & 1048575)) == r4;
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
    @Override // com.google.android.gms.internal.ads.ub2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.v72 r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb2.a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.v72):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.ads.ub2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(T r7, T r8) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb2.b(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final void c(T t) {
        int r1;
        int r0 = this.k;
        while (true) {
            r1 = this.l;
            if (r0 >= r1) {
                break;
            }
            long jS = S(this.j[r0]) & 1048575;
            Object objG = tc2.G(t, jS);
            if (objG != null) {
                tc2.f(t, jS, this.q.g(objG));
            }
            r0++;
        }
        int length = this.j.length;
        while (r1 < length) {
            this.n.c(t, this.j[r1]);
            r1++;
        }
        this.o.g(t);
        if (this.f) {
            this.p.i(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0416, code lost:
    
        if (z(r20, r15, r3) != false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0436, code lost:
    
        if (z(r20, r15, r3) != false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x043e, code lost:
    
        if (z(r20, r15, r3) != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x045e, code lost:
    
        if (z(r20, r15, r3) != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0466, code lost:
    
        if (z(r20, r15, r3) != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x047e, code lost:
    
        if (z(r20, r15, r3) != false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x06b6, code lost:
    
        if ((r12 & r18) != 0) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x06b8, code lost:
    
        r4 = com.google.android.gms.internal.ads.v82.J(r15, (com.google.android.gms.internal.ads.xa2) r2.getObject(r20, r10), P(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x06e3, code lost:
    
        if ((r12 & r18) != 0) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x06e5, code lost:
    
        r4 = com.google.android.gms.internal.ads.v82.D0(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x06ee, code lost:
    
        if ((r12 & r18) != 0) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x06f0, code lost:
    
        r9 = com.google.android.gms.internal.ads.v82.u(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0713, code lost:
    
        if ((r12 & r18) != 0) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0715, code lost:
    
        r4 = r2.getObject(r20, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0722, code lost:
    
        if ((r12 & r18) != 0) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0724, code lost:
    
        r4 = com.google.android.gms.internal.ads.wb2.B(r15, r2.getObject(r20, r10), P(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0749, code lost:
    
        if ((r12 & r18) != 0) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x074b, code lost:
    
        r4 = com.google.android.gms.internal.ads.v82.s0(r15, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x020d A[PHI: r5
  0x020d: PHI (r5v83 int) = 
  (r5v46 int)
  (r5v49 int)
  (r5v52 int)
  (r5v55 int)
  (r5v58 int)
  (r5v61 int)
  (r5v64 int)
  (r5v67 int)
  (r5v70 int)
  (r5v73 int)
  (r5v76 int)
  (r5v79 int)
  (r5v82 int)
  (r5v87 int)
 binds: [B:141:0x020b, B:136:0x01fa, B:131:0x01e9, B:126:0x01d8, B:121:0x01c7, B:116:0x01b6, B:111:0x01a5, B:106:0x0193, B:101:0x0181, B:96:0x016f, B:91:0x015d, B:86:0x014b, B:81:0x0139, B:76:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x030a A[PHI: r5
  0x030a: PHI (r5v106 java.lang.Object) = (r5v24 java.lang.Object), (r5v104 java.lang.Object), (r5v108 java.lang.Object) binds: [B:193:0x0331, B:45:0x00ab, B:185:0x0306] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0334 A[PHI: r5
  0x0334: PHI (r5v102 java.lang.Object) = (r5v24 java.lang.Object), (r5v104 java.lang.Object) binds: [B:193:0x0331, B:45:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x05fc A[PHI: r4
  0x05fc: PHI (r4v110 int) = 
  (r4v73 int)
  (r4v76 int)
  (r4v79 int)
  (r4v82 int)
  (r4v85 int)
  (r4v88 int)
  (r4v91 int)
  (r4v94 int)
  (r4v97 int)
  (r4v100 int)
  (r4v103 int)
  (r4v106 int)
  (r4v109 int)
  (r4v114 int)
 binds: [B:373:0x05fa, B:368:0x05e9, B:363:0x05d8, B:358:0x05c7, B:353:0x05b6, B:348:0x05a5, B:343:0x0594, B:338:0x0582, B:333:0x0570, B:328:0x055e, B:323:0x054c, B:318:0x053a, B:313:0x0528, B:308:0x0516] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x06ac A[PHI: r5
  0x06ac: PHI (r5v4 int) = 
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
  (r5v1 int)
  (r5v13 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v14 int)
  (r5v1 int)
 binds: [B:245:0x040d, B:435:0x0753, B:432:0x0749, B:426:0x0734, B:423:0x0722, B:419:0x0713, B:415:0x0706, B:411:0x06f9, B:407:0x06ee, B:404:0x06e3, B:400:0x06d6, B:396:0x06c9, B:393:0x06b6, B:371:0x05f6, B:366:0x05e5, B:361:0x05d4, B:356:0x05c3, B:351:0x05b2, B:346:0x05a1, B:341:0x0590, B:336:0x057e, B:331:0x056c, B:326:0x055a, B:321:0x0548, B:316:0x0536, B:311:0x0524, B:306:0x0512, B:301:0x04de, B:298:0x04d1, B:295:0x04c1, B:292:0x04b1, B:289:0x04a1, B:286:0x0493, B:283:0x0486, B:280:0x047e, B:275:0x046e, B:272:0x0466, B:269:0x045e, B:266:0x0452, B:263:0x0446, B:409:0x06f5, B:260:0x043e, B:257:0x0436, B:254:0x042a, B:251:0x041e, B:389:0x06ab, B:248:0x0416] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0719 A[PHI: r4
  0x0719: PHI (r4v145 java.lang.Object) = (r4v19 java.lang.Object), (r4v141 java.lang.Object), (r4v148 java.lang.Object) binds: [B:428:0x073c, B:277:0x0476, B:420:0x0715] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x073f A[PHI: r4
  0x073f: PHI (r4v137 java.lang.Object) = (r4v19 java.lang.Object), (r4v141 java.lang.Object) binds: [B:428:0x073c, B:277:0x0476] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.ub2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(T r20) {
        /*
            Method dump skipped, instructions count: 2360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb2.d(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ub2
    public final void e(T t, nb2 nb2Var, y82 y82Var) throws IOException {
        long j;
        Object objF;
        int r5;
        List<Double> listA;
        List<Float> listA2;
        List<Long> listA3;
        List<Long> listA4;
        List<Integer> listA5;
        List<Long> listA6;
        List<Integer> listA7;
        List<Boolean> listA8;
        List<Integer> listA9;
        List<Integer> listA10;
        t92 t92VarR;
        List<Integer> listA11;
        List<Long> listA12;
        List<Integer> listA13;
        List<Long> listA14;
        if (y82Var == null) {
            throw null;
        }
        mc2 mc2Var = this.o;
        a92<?> a92Var = this.p;
        Object objH = null;
        Object objS = null;
        while (true) {
            try {
                int r2 = nb2Var.F();
                int r3 = V(r2);
                if (r3 >= 0) {
                    int r4 = S(r3);
                    switch ((267386880 & r4) >>> 20) {
                        case 0:
                            tc2.c(t, r4 & 1048575, nb2Var.readDouble());
                            M(t, r3);
                            break;
                        case 1:
                            tc2.d(t, r4 & 1048575, nb2Var.readFloat());
                            M(t, r3);
                            break;
                        case 2:
                            tc2.e(t, r4 & 1048575, nb2Var.Q());
                            M(t, r3);
                            break;
                        case 3:
                            tc2.e(t, r4 & 1048575, nb2Var.I());
                            M(t, r3);
                            break;
                        case 4:
                            tc2.k(t, r4 & 1048575, nb2Var.q());
                            M(t, r3);
                            break;
                        case 5:
                            tc2.e(t, r4 & 1048575, nb2Var.w());
                            M(t, r3);
                            break;
                        case 6:
                            tc2.k(t, r4 & 1048575, nb2Var.M());
                            M(t, r3);
                            break;
                        case 7:
                            tc2.g(t, r4 & 1048575, nb2Var.U());
                            M(t, r3);
                            break;
                        case 8:
                            x(t, r4, nb2Var);
                            M(t, r3);
                            break;
                        case 9:
                            if (K(t, r3)) {
                                j = r4 & 1048575;
                                objF = o92.f(tc2.G(t, j), nb2Var.H(P(r3), y82Var));
                                tc2.f(t, j, objF);
                                break;
                            } else {
                                tc2.f(t, r4 & 1048575, nb2Var.H(P(r3), y82Var));
                                M(t, r3);
                                break;
                            }
                        case 10:
                            tc2.f(t, r4 & 1048575, nb2Var.C());
                            M(t, r3);
                            break;
                        case 11:
                            tc2.k(t, r4 & 1048575, nb2Var.O());
                            M(t, r3);
                            break;
                        case 12:
                            r5 = nb2Var.V();
                            t92 t92VarR2 = R(r3);
                            if (t92VarR2 != null && !t92VarR2.a(r5)) {
                                objS = wb2.a(r2, r5, objS, mc2Var);
                                break;
                            } else {
                                tc2.k(t, r4 & 1048575, r5);
                                M(t, r3);
                                break;
                            }
                            break;
                        case 13:
                            tc2.k(t, r4 & 1048575, nb2Var.p());
                            M(t, r3);
                            break;
                        case 14:
                            tc2.e(t, r4 & 1048575, nb2Var.y());
                            M(t, r3);
                            break;
                        case 15:
                            tc2.k(t, r4 & 1048575, nb2Var.J());
                            M(t, r3);
                            break;
                        case 16:
                            tc2.e(t, r4 & 1048575, nb2Var.P());
                            M(t, r3);
                            break;
                        case 17:
                            if (K(t, r3)) {
                                j = r4 & 1048575;
                                objF = o92.f(tc2.G(t, j), nb2Var.S(P(r3), y82Var));
                                tc2.f(t, j, objF);
                                break;
                            } else {
                                tc2.f(t, r4 & 1048575, nb2Var.S(P(r3), y82Var));
                                M(t, r3);
                                break;
                            }
                        case 18:
                            listA = this.n.a(t, r4 & 1048575);
                            nb2Var.g(listA);
                            break;
                        case 19:
                            listA2 = this.n.a(t, r4 & 1048575);
                            nb2Var.m(listA2);
                            break;
                        case 20:
                            listA3 = this.n.a(t, r4 & 1048575);
                            nb2Var.i(listA3);
                            break;
                        case 21:
                            listA4 = this.n.a(t, r4 & 1048575);
                            nb2Var.k(listA4);
                            break;
                        case 22:
                            listA5 = this.n.a(t, r4 & 1048575);
                            nb2Var.h(listA5);
                            break;
                        case 23:
                            listA6 = this.n.a(t, r4 & 1048575);
                            nb2Var.n(listA6);
                            break;
                        case 24:
                            listA7 = this.n.a(t, r4 & 1048575);
                            nb2Var.N(listA7);
                            break;
                        case 25:
                            listA8 = this.n.a(t, r4 & 1048575);
                            nb2Var.E(listA8);
                            break;
                        case 26:
                            if (U(r4)) {
                                nb2Var.u(this.n.a(t, r4 & 1048575));
                                break;
                            } else {
                                nb2Var.G(this.n.a(t, r4 & 1048575));
                                break;
                            }
                        case 27:
                            nb2Var.L(this.n.a(t, r4 & 1048575), P(r3), y82Var);
                            break;
                        case 28:
                            nb2Var.T(this.n.a(t, r4 & 1048575));
                            break;
                        case 29:
                            listA9 = this.n.a(t, r4 & 1048575);
                            nb2Var.K(listA9);
                            break;
                        case 30:
                            listA10 = this.n.a(t, r4 & 1048575);
                            nb2Var.A(listA10);
                            t92VarR = R(r3);
                            objS = wb2.b(r2, listA10, t92VarR, objS, mc2Var);
                            break;
                        case 31:
                            listA11 = this.n.a(t, r4 & 1048575);
                            nb2Var.x(listA11);
                            break;
                        case 32:
                            listA12 = this.n.a(t, r4 & 1048575);
                            nb2Var.r(listA12);
                            break;
                        case 33:
                            listA13 = this.n.a(t, r4 & 1048575);
                            nb2Var.R(listA13);
                            break;
                        case 34:
                            listA14 = this.n.a(t, r4 & 1048575);
                            nb2Var.D(listA14);
                            break;
                        case 35:
                            listA = this.n.a(t, r4 & 1048575);
                            nb2Var.g(listA);
                            break;
                        case 36:
                            listA2 = this.n.a(t, r4 & 1048575);
                            nb2Var.m(listA2);
                            break;
                        case 37:
                            listA3 = this.n.a(t, r4 & 1048575);
                            nb2Var.i(listA3);
                            break;
                        case 38:
                            listA4 = this.n.a(t, r4 & 1048575);
                            nb2Var.k(listA4);
                            break;
                        case 39:
                            listA5 = this.n.a(t, r4 & 1048575);
                            nb2Var.h(listA5);
                            break;
                        case 40:
                            listA6 = this.n.a(t, r4 & 1048575);
                            nb2Var.n(listA6);
                            break;
                        case 41:
                            listA7 = this.n.a(t, r4 & 1048575);
                            nb2Var.N(listA7);
                            break;
                        case 42:
                            listA8 = this.n.a(t, r4 & 1048575);
                            nb2Var.E(listA8);
                            break;
                        case 43:
                            listA9 = this.n.a(t, r4 & 1048575);
                            nb2Var.K(listA9);
                            break;
                        case 44:
                            listA10 = this.n.a(t, r4 & 1048575);
                            nb2Var.A(listA10);
                            t92VarR = R(r3);
                            objS = wb2.b(r2, listA10, t92VarR, objS, mc2Var);
                            break;
                        case 45:
                            listA11 = this.n.a(t, r4 & 1048575);
                            nb2Var.x(listA11);
                            break;
                        case 46:
                            listA12 = this.n.a(t, r4 & 1048575);
                            nb2Var.r(listA12);
                            break;
                        case 47:
                            listA13 = this.n.a(t, r4 & 1048575);
                            nb2Var.R(listA13);
                            break;
                        case 48:
                            listA14 = this.n.a(t, r4 & 1048575);
                            nb2Var.D(listA14);
                            break;
                        case 49:
                            nb2Var.B(this.n.a(t, r4 & 1048575), P(r3), y82Var);
                            break;
                        case 50:
                            Object objQ = Q(r3);
                            long jS = S(r3) & 1048575;
                            Object objG = tc2.G(t, jS);
                            if (objG == null) {
                                objG = this.q.b(objQ);
                                tc2.f(t, jS, objG);
                            } else if (this.q.e(objG)) {
                                Object objB = this.q.b(objQ);
                                this.q.h(objB, objG);
                                tc2.f(t, jS, objB);
                                objG = objB;
                            }
                            nb2Var.o(this.q.f(objG), this.q.a(objQ), y82Var);
                            break;
                        case 51:
                            tc2.f(t, r4 & 1048575, Double.valueOf(nb2Var.readDouble()));
                            F(t, r2, r3);
                            break;
                        case 52:
                            tc2.f(t, r4 & 1048575, Float.valueOf(nb2Var.readFloat()));
                            F(t, r2, r3);
                            break;
                        case 53:
                            tc2.f(t, r4 & 1048575, Long.valueOf(nb2Var.Q()));
                            F(t, r2, r3);
                            break;
                        case 54:
                            tc2.f(t, r4 & 1048575, Long.valueOf(nb2Var.I()));
                            F(t, r2, r3);
                            break;
                        case 55:
                            tc2.f(t, r4 & 1048575, Integer.valueOf(nb2Var.q()));
                            F(t, r2, r3);
                            break;
                        case 56:
                            tc2.f(t, r4 & 1048575, Long.valueOf(nb2Var.w()));
                            F(t, r2, r3);
                            break;
                        case 57:
                            tc2.f(t, r4 & 1048575, Integer.valueOf(nb2Var.M()));
                            F(t, r2, r3);
                            break;
                        case 58:
                            tc2.f(t, r4 & 1048575, Boolean.valueOf(nb2Var.U()));
                            F(t, r2, r3);
                            break;
                        case 59:
                            x(t, r4, nb2Var);
                            F(t, r2, r3);
                            break;
                        case 60:
                            int r42 = r4 & 1048575;
                            if (z(t, r2, r3)) {
                                long j2 = r42;
                                tc2.f(t, j2, o92.f(tc2.G(t, j2), nb2Var.H(P(r3), y82Var)));
                            } else {
                                tc2.f(t, r42, nb2Var.H(P(r3), y82Var));
                                M(t, r3);
                            }
                            F(t, r2, r3);
                            break;
                        case 61:
                            tc2.f(t, r4 & 1048575, nb2Var.C());
                            F(t, r2, r3);
                            break;
                        case 62:
                            tc2.f(t, r4 & 1048575, Integer.valueOf(nb2Var.O()));
                            F(t, r2, r3);
                            break;
                        case 63:
                            r5 = nb2Var.V();
                            t92 t92VarR3 = R(r3);
                            if (t92VarR3 != null && !t92VarR3.a(r5)) {
                                objS = wb2.a(r2, r5, objS, mc2Var);
                                break;
                            }
                            tc2.f(t, r4 & 1048575, Integer.valueOf(r5));
                            F(t, r2, r3);
                            break;
                        case 64:
                            tc2.f(t, r4 & 1048575, Integer.valueOf(nb2Var.p()));
                            F(t, r2, r3);
                            break;
                        case 65:
                            tc2.f(t, r4 & 1048575, Long.valueOf(nb2Var.y()));
                            F(t, r2, r3);
                            break;
                        case 66:
                            tc2.f(t, r4 & 1048575, Integer.valueOf(nb2Var.J()));
                            F(t, r2, r3);
                            break;
                        case 67:
                            tc2.f(t, r4 & 1048575, Long.valueOf(nb2Var.P()));
                            F(t, r2, r3);
                            break;
                        case 68:
                            tc2.f(t, r4 & 1048575, nb2Var.S(P(r3), y82Var));
                            F(t, r2, r3);
                            break;
                        default:
                            if (objS == null) {
                                try {
                                    objS = mc2Var.n();
                                } catch (z92 unused) {
                                    mc2Var.e(nb2Var);
                                    if (objS == null) {
                                        objS = mc2Var.k(t);
                                    }
                                    if (!mc2Var.f(objS, nb2Var)) {
                                        for (int r14 = this.k; r14 < this.l; r14++) {
                                            objS = s(t, this.j[r14], objS, mc2Var);
                                        }
                                        if (objS != null) {
                                            mc2Var.r(t, objS);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!mc2Var.f(objS, nb2Var)) {
                                for (int r142 = this.k; r142 < this.l; r142++) {
                                    objS = s(t, this.j[r142], objS, mc2Var);
                                }
                                if (objS != null) {
                                    mc2Var.r(t, objS);
                                    return;
                                }
                                return;
                            }
                            break;
                    }
                } else {
                    if (r2 == Integer.MAX_VALUE) {
                        for (int r143 = this.k; r143 < this.l; r143++) {
                            objS = s(t, this.j[r143], objS, mc2Var);
                        }
                        if (objS != null) {
                            mc2Var.r(t, objS);
                            return;
                        }
                        return;
                    }
                    Object objB2 = !this.f ? null : a92Var.b(y82Var, this.e, r2);
                    if (objB2 != null) {
                        if (objH == null) {
                            objH = a92Var.h(t);
                        }
                        e92<T> e92Var = objH;
                        objS = a92Var.c(nb2Var, objB2, y82Var, e92Var, objS, mc2Var);
                        objH = e92Var;
                    } else {
                        mc2Var.e(nb2Var);
                        if (objS == null) {
                            objS = mc2Var.k(t);
                        }
                        if (!mc2Var.f(objS, nb2Var)) {
                            for (int r144 = this.k; r144 < this.l; r144++) {
                                objS = s(t, this.j[r144], objS, mc2Var);
                            }
                            if (objS != null) {
                                mc2Var.r(t, objS);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int r15 = this.k; r15 < this.l; r15++) {
                    objS = s(t, this.j[r15], objS, mc2Var);
                }
                if (objS != null) {
                    mc2Var.r(t, objS);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b2  */
    @Override // com.google.android.gms.internal.ads.ub2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb2.f(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.ub2
    public final T g() {
        return (T) this.m.a(this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.ads.ub2] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.ads.ub2] */
    @Override // com.google.android.gms.internal.ads.ub2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(T r19) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb2.h(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[PHI: r3
  0x00e2: PHI (r3v13 java.lang.Object) = (r3v11 java.lang.Object), (r3v14 java.lang.Object) binds: [B:67:0x00e0, B:62:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.ub2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(T r9) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb2.i(java.lang.Object):int");
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
    @Override // com.google.android.gms.internal.ads.ub2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(T r14, com.google.android.gms.internal.ads.kd2 r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb2.j(java.lang.Object, com.google.android.gms.internal.ads.kd2):void");
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
    
        r1 = (com.google.android.gms.internal.ads.qc2) r9.s(r12, r9.j[r2], r1, r9.o);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04de, code lost:
    
        if (r1 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04e0, code lost:
    
        r9.o.r(r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04e7, code lost:
    
        if (r7 != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04e9, code lost:
    
        if (r0 != r31) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04f0, code lost:
    
        throw com.google.android.gms.internal.ads.w92.h();
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
    
        throw com.google.android.gms.internal.ads.w92.h();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int o(T r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.ads.v72 r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bb2.o(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.v72):int");
    }
}
