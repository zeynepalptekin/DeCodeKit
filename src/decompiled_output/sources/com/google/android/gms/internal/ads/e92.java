package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.g92;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class e92<T extends g92<T>> {
    private static final e92 d = new e92(true);

    /* renamed from: a, reason: collision with root package name */
    final zb2<T, Object> f3239a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3240b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3241c;

    private e92() {
        this.f3239a = zb2.o(16);
    }

    private e92(zb2<T, Object> zb2Var) {
        this.f3239a = zb2Var;
        o();
    }

    private e92(boolean z) {
        this(zb2.o(0));
        o();
    }

    static int e(ed2 ed2Var, int r2, Object obj) {
        int r22 = v82.e0(r2);
        if (ed2Var == ed2.o) {
            o92.h((xa2) obj);
            r22 <<= 1;
        }
        return r22 + m(ed2Var, obj);
    }

    private final Object f(T t) {
        Object obj = this.f3239a.get(t);
        if (!(obj instanceof ba2)) {
            return obj;
        }
        return ba2.e();
    }

    static void g(v82 v82Var, ed2 ed2Var, int r3, Object obj) throws IOException {
        if (ed2Var == ed2.o) {
            xa2 xa2Var = (xa2) obj;
            o92.h(xa2Var);
            v82Var.b(r3, 3);
            xa2Var.d(v82Var);
            v82Var.b(r3, 4);
        }
        v82Var.b(r3, ed2Var.g());
        switch (d92.f3096b[ed2Var.ordinal()]) {
            case 1:
                v82Var.K(((Double) obj).doubleValue());
                break;
            case 2:
                v82Var.O(((Float) obj).floatValue());
                break;
            case 3:
                v82Var.P(((Long) obj).longValue());
                break;
            case 4:
                v82Var.P(((Long) obj).longValue());
                break;
            case 5:
                v82Var.a0(((Integer) obj).intValue());
                break;
            case 6:
                v82Var.R(((Long) obj).longValue());
                break;
            case 7:
                v82Var.d0(((Integer) obj).intValue());
                break;
            case 8:
                v82Var.F(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((xa2) obj).d(v82Var);
                break;
            case 10:
                v82Var.Z((xa2) obj);
                break;
            case 11:
                if (!(obj instanceof a82)) {
                    v82Var.q0((String) obj);
                    break;
                } else {
                    v82Var.r((a82) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof a82)) {
                    byte[] bArr = (byte[]) obj;
                    v82Var.z0(bArr, 0, bArr.length);
                    break;
                } else {
                    v82Var.r((a82) obj);
                    break;
                }
            case 13:
                v82Var.b0(((Integer) obj).intValue());
                break;
            case 14:
                v82Var.d0(((Integer) obj).intValue());
                break;
            case 15:
                v82Var.R(((Long) obj).longValue());
                break;
            case 16:
                v82Var.c0(((Integer) obj).intValue());
                break;
            case 17:
                v82Var.Q(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof r92)) {
                    v82Var.a0(((Integer) obj).intValue());
                    break;
                } else {
                    v82Var.a0(((r92) obj).h());
                    break;
                }
        }
    }

    private final void i(T t, Object obj) {
        if (!t.L()) {
            j(t.u(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int r1 = 0;
            while (r1 < size) {
                Object obj2 = arrayList.get(r1);
                r1++;
                j(t.u(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof ba2) {
            this.f3241c = true;
        }
        this.f3239a.put(t, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(com.google.android.gms.internal.ads.ed2 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.o92.a(r3)
            int[] r0 = com.google.android.gms.internal.ads.d92.f3095a
            com.google.android.gms.internal.ads.hd2 r2 = r2.e()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L28;
                case 8: goto L1f;
                case 9: goto L16;
                default: goto L14;
            }
        L14:
            r0 = 0
            goto L42
        L16:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.xa2
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.ba2
            if (r2 == 0) goto L14
            goto L42
        L1f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.r92
            if (r2 == 0) goto L14
            goto L42
        L28:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.a82
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L14
            goto L42
        L31:
            boolean r0 = r3 instanceof java.lang.String
            goto L42
        L34:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r0 = r3 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L42
        L40:
            boolean r0 = r3 instanceof java.lang.Integer
        L42:
            if (r0 == 0) goto L45
            return
        L45:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e92.j(com.google.android.gms.internal.ads.ed2, java.lang.Object):void");
    }

    private static Object k(Object obj) {
        if (obj instanceof gb2) {
            return ((gb2) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int l(g92<?> g92Var, Object obj) {
        ed2 ed2VarU = g92Var.u();
        int r1 = g92Var.h();
        if (!g92Var.L()) {
            return e(ed2VarU, r1, obj);
        }
        int r2 = 0;
        List list = (List) obj;
        if (g92Var.l()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r2 += m(ed2VarU, it.next());
            }
            return v82.e0(r1) + r2 + v82.m0(r2);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            r2 += e(ed2VarU, r1, it2.next());
        }
        return r2;
    }

    private static int m(ed2 ed2Var, Object obj) {
        switch (d92.f3096b[ed2Var.ordinal()]) {
            case 1:
                return v82.L(((Double) obj).doubleValue());
            case 2:
                return v82.Y(((Float) obj).floatValue());
            case 3:
                return v82.S(((Long) obj).longValue());
            case 4:
                return v82.T(((Long) obj).longValue());
            case 5:
                return v82.f0(((Integer) obj).intValue());
            case 6:
                return v82.V(((Long) obj).longValue());
            case 7:
                return v82.i0(((Integer) obj).intValue());
            case 8:
                return v82.G(((Boolean) obj).booleanValue());
            case 9:
                return v82.t0((xa2) obj);
            case 10:
                return obj instanceof ba2 ? v82.d((ba2) obj) : v82.n0((xa2) obj);
            case 11:
                return obj instanceof a82 ? v82.t((a82) obj) : v82.r0((String) obj);
            case 12:
                return obj instanceof a82 ? v82.t((a82) obj) : v82.F0((byte[]) obj);
            case 13:
                return v82.g0(((Integer) obj).intValue());
            case 14:
                return v82.j0(((Integer) obj).intValue());
            case 15:
                return v82.W(((Long) obj).longValue());
            case 16:
                return v82.h0(((Integer) obj).intValue());
            case 17:
                return v82.U(((Long) obj).longValue());
            case 18:
                return obj instanceof r92 ? v82.k0(((r92) obj).h()) : v82.k0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static <T extends g92<T>> boolean n(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.D() == hd2.MESSAGE) {
            boolean zL = key.L();
            Object value = entry.getValue();
            if (zL) {
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    if (!((xa2) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                if (!(value instanceof xa2)) {
                    if (value instanceof ba2) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((xa2) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static <T extends g92<T>> e92<T> p() {
        return d;
    }

    private final void r(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof ba2) {
            value = ba2.e();
        }
        if (key.L()) {
            Object objF = f(key);
            if (objF == null) {
                objF = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objF).add(k(it.next()));
            }
            this.f3239a.put(key, objF);
            return;
        }
        if (key.D() != hd2.MESSAGE) {
            this.f3239a.put(key, k(value));
            return;
        }
        Object objF2 = f(key);
        if (objF2 == null) {
            this.f3239a.put(key, k(value));
        } else {
            this.f3239a.put(key, objF2 instanceof gb2 ? key.F((gb2) objF2, (gb2) value) : key.K(((xa2) objF2).c(), (xa2) value).P());
        }
    }

    private static int s(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.D() != hd2.MESSAGE || key.L() || key.l()) {
            return l(key, value);
        }
        boolean z = value instanceof ba2;
        int r4 = entry.getKey().h();
        return z ? v82.x(r4, (ba2) value) : v82.y(r4, (xa2) value);
    }

    final Iterator<Map.Entry<T, Object>> a() {
        return this.f3241c ? new ca2(this.f3239a.j().iterator()) : this.f3239a.j().iterator();
    }

    public final boolean b() {
        return this.f3240b;
    }

    public final boolean c() {
        for (int r1 = 0; r1 < this.f3239a.h(); r1++) {
            if (!n(this.f3239a.p(r1))) {
                return false;
            }
        }
        Iterator it = this.f3239a.i().iterator();
        while (it.hasNext()) {
            if (!n((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        e92 e92Var = new e92();
        for (int r1 = 0; r1 < this.f3239a.h(); r1++) {
            Map.Entry<K, Object> entryP = this.f3239a.p(r1);
            e92Var.i((g92) entryP.getKey(), entryP.getValue());
        }
        Iterator it = this.f3239a.i().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            e92Var.i((g92) entry.getKey(), entry.getValue());
        }
        e92Var.f3241c = this.f3241c;
        return e92Var;
    }

    public final Iterator<Map.Entry<T, Object>> d() {
        return this.f3241c ? new ca2(this.f3239a.entrySet().iterator()) : this.f3239a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e92) {
            return this.f3239a.equals(((e92) obj).f3239a);
        }
        return false;
    }

    public final void h(e92<T> e92Var) {
        for (int r0 = 0; r0 < e92Var.f3239a.h(); r0++) {
            r(e92Var.f3239a.p(r0));
        }
        Iterator it = e92Var.f3239a.i().iterator();
        while (it.hasNext()) {
            r((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f3239a.hashCode();
    }

    public final void o() {
        if (this.f3240b) {
            return;
        }
        this.f3239a.g();
        this.f3240b = true;
    }

    public final int q() {
        int r1 = 0;
        for (int r0 = 0; r0 < this.f3239a.h(); r0++) {
            r1 += s(this.f3239a.p(r0));
        }
        Iterator it = this.f3239a.i().iterator();
        while (it.hasNext()) {
            r1 += s((Map.Entry) it.next());
        }
        return r1;
    }
}
