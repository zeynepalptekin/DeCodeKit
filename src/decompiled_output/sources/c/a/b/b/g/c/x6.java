package c.a.b.b.g.c;

import c.a.b.b.g.c.z6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class x6<T extends z6<T>> {
    private static final x6 d = new x6(true);

    /* renamed from: a, reason: collision with root package name */
    final p9<T, Object> f1855a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1856b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1857c;

    private x6() {
        this.f1855a = p9.b(16);
    }

    private x6(p9<T, Object> p9Var) {
        this.f1855a = p9Var;
        k();
    }

    private x6(boolean z) {
        this(p9.b(0));
        k();
    }

    public static int a(z6<?> z6Var, Object obj) {
        ua uaVarB = z6Var.b();
        int r1 = z6Var.a();
        if (!z6Var.d()) {
            return b(uaVarB, r1, obj);
        }
        int r2 = 0;
        List list = (List) obj;
        if (z6Var.f()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r2 += j(uaVarB, it.next());
            }
            return o6.h0(r1) + r2 + o6.E0(r2);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            r2 += b(uaVarB, r1, it2.next());
        }
        return r2;
    }

    static int b(ua uaVar, int r2, Object obj) {
        int r22 = o6.h0(r2);
        if (uaVar == ua.o) {
            l7.g((r8) obj);
            r22 <<= 1;
        }
        return r22 + j(uaVar, obj);
    }

    public static <T extends z6<T>> x6<T> c() {
        return d;
    }

    private final Object d(T t) {
        Object obj = this.f1855a.get(t);
        if (!(obj instanceof v7)) {
            return obj;
        }
        return v7.e();
    }

    private static Object e(Object obj) {
        if (obj instanceof a9) {
            return ((a9) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static void f(o6 o6Var, ua uaVar, int r3, Object obj) throws IOException {
        if (uaVar == ua.o) {
            r8 r8Var = (r8) obj;
            l7.g(r8Var);
            o6Var.m(r3, 3);
            r8Var.d(o6Var);
            o6Var.m(r3, 4);
        }
        o6Var.m(r3, uaVar.g());
        switch (a7.f1652b[uaVar.ordinal()]) {
            case 1:
                o6Var.h(((Double) obj).doubleValue());
                break;
            case 2:
                o6Var.i(((Float) obj).floatValue());
                break;
            case 3:
                o6Var.t(((Long) obj).longValue());
                break;
            case 4:
                o6Var.t(((Long) obj).longValue());
                break;
            case 5:
                o6Var.j(((Integer) obj).intValue());
                break;
            case 6:
                o6Var.a0(((Long) obj).longValue());
                break;
            case 7:
                o6Var.f0(((Integer) obj).intValue());
                break;
            case 8:
                o6Var.y(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((r8) obj).d(o6Var);
                break;
            case 10:
                o6Var.v((r8) obj);
                break;
            case 11:
                if (!(obj instanceof y5)) {
                    o6Var.w((String) obj);
                    break;
                } else {
                    o6Var.u((y5) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof y5)) {
                    byte[] bArr = (byte[]) obj;
                    o6Var.T(bArr, 0, bArr.length);
                    break;
                } else {
                    o6Var.u((y5) obj);
                    break;
                }
            case 13:
                o6Var.O(((Integer) obj).intValue());
                break;
            case 14:
                o6Var.f0(((Integer) obj).intValue());
                break;
            case 15:
                o6Var.a0(((Long) obj).longValue());
                break;
            case 16:
                o6Var.X(((Integer) obj).intValue());
                break;
            case 17:
                o6Var.S(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof k7)) {
                    o6Var.j(((Integer) obj).intValue());
                    break;
                } else {
                    o6Var.j(((k7) obj).a());
                    break;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(c.a.b.b.g.c.ua r2, java.lang.Object r3) {
        /*
            c.a.b.b.g.c.l7.d(r3)
            int[] r0 = c.a.b.b.g.c.a7.f1651a
            c.a.b.b.g.c.xa r2 = r2.e()
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
            boolean r2 = r3 instanceof c.a.b.b.g.c.r8
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof c.a.b.b.g.c.v7
            if (r2 == 0) goto L14
            goto L42
        L1f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof c.a.b.b.g.c.k7
            if (r2 == 0) goto L14
            goto L42
        L28:
            boolean r2 = r3 instanceof c.a.b.b.g.c.y5
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
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.x6.h(c.a.b.b.g.c.ua, java.lang.Object):void");
    }

    private static <T extends z6<T>> boolean i(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.c() == xa.MESSAGE) {
            boolean zD = key.d();
            Object value = entry.getValue();
            if (zD) {
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    if (!((r8) it.next()).h()) {
                        return false;
                    }
                }
            } else {
                if (!(value instanceof r8)) {
                    if (value instanceof v7) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((r8) value).h()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int j(ua uaVar, Object obj) {
        switch (a7.f1652b[uaVar.ordinal()]) {
            case 1:
                return o6.z(((Double) obj).doubleValue());
            case 2:
                return o6.A(((Float) obj).floatValue());
            case 3:
                return o6.e0(((Long) obj).longValue());
            case 4:
                return o6.j0(((Long) obj).longValue());
            case 5:
                return o6.l0(((Integer) obj).intValue());
            case 6:
                return o6.s0(((Long) obj).longValue());
            case 7:
                return o6.x0(((Integer) obj).intValue());
            case 8:
                return o6.L(((Boolean) obj).booleanValue());
            case 9:
                return o6.W((r8) obj);
            case 10:
                return obj instanceof v7 ? o6.d((v7) obj) : o6.J((r8) obj);
            case 11:
                return obj instanceof y5 ? o6.I((y5) obj) : o6.K((String) obj);
            case 12:
                return obj instanceof y5 ? o6.I((y5) obj) : o6.M((byte[]) obj);
            case 13:
                return o6.p0(((Integer) obj).intValue());
            case 14:
                return o6.A0(((Integer) obj).intValue());
            case 15:
                return o6.w0(((Long) obj).longValue());
            case 16:
                return o6.t0(((Integer) obj).intValue());
            case 17:
                return o6.o0(((Long) obj).longValue());
            case 18:
                return obj instanceof k7 ? o6.C0(((k7) obj).a()) : o6.C0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private final void l(T t, Object obj) {
        if (!t.d()) {
            h(t.b(), obj);
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
                h(t.b(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof v7) {
            this.f1857c = true;
        }
        this.f1855a.put(t, obj);
    }

    private final void m(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof v7) {
            value = v7.e();
        }
        if (key.d()) {
            Object objD = d(key);
            if (objD == null) {
                objD = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objD).add(e(it.next()));
            }
            this.f1855a.put(key, objD);
            return;
        }
        if (key.c() != xa.MESSAGE) {
            this.f1855a.put(key, e(value));
            return;
        }
        Object objD2 = d(key);
        if (objD2 == null) {
            this.f1855a.put(key, e(value));
        } else {
            this.f1855a.put(key, objD2 instanceof a9 ? key.C((a9) objD2, (a9) value) : key.t(((r8) objD2).c(), (r8) value).j());
        }
    }

    private static int n(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.c() != xa.MESSAGE || key.d() || key.f()) {
            return a(key, value);
        }
        boolean z = value instanceof v7;
        int r4 = entry.getKey().a();
        return z ? o6.D(r4, (v7) value) : o6.E(r4, (r8) value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        x6 x6Var = new x6();
        for (int r1 = 0; r1 < this.f1855a.j(); r1++) {
            Map.Entry<K, Object> entryH = this.f1855a.h(r1);
            x6Var.l((z6) entryH.getKey(), entryH.getValue());
        }
        Iterator it = this.f1855a.m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            x6Var.l((z6) entry.getKey(), entry.getValue());
        }
        x6Var.f1857c = this.f1857c;
        return x6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x6) {
            return this.f1855a.equals(((x6) obj).f1855a);
        }
        return false;
    }

    public final void g(x6<T> x6Var) {
        for (int r0 = 0; r0 < x6Var.f1855a.j(); r0++) {
            m(x6Var.f1855a.h(r0));
        }
        Iterator it = x6Var.f1855a.m().iterator();
        while (it.hasNext()) {
            m((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f1855a.hashCode();
    }

    public final void k() {
        if (this.f1856b) {
            return;
        }
        this.f1855a.e();
        this.f1856b = true;
    }

    public final boolean o() {
        return this.f1856b;
    }

    public final Iterator<Map.Entry<T, Object>> p() {
        return this.f1857c ? new w7(this.f1855a.entrySet().iterator()) : this.f1855a.entrySet().iterator();
    }

    final Iterator<Map.Entry<T, Object>> q() {
        return this.f1857c ? new w7(this.f1855a.o().iterator()) : this.f1855a.o().iterator();
    }

    public final boolean r() {
        for (int r1 = 0; r1 < this.f1855a.j(); r1++) {
            if (!i(this.f1855a.h(r1))) {
                return false;
            }
        }
        Iterator it = this.f1855a.m().iterator();
        while (it.hasNext()) {
            if (!i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int s() {
        int r1 = 0;
        for (int r0 = 0; r0 < this.f1855a.j(); r0++) {
            r1 += n(this.f1855a.h(r0));
        }
        Iterator it = this.f1855a.m().iterator();
        while (it.hasNext()) {
            r1 += n((Map.Entry) it.next());
        }
        return r1;
    }
}
