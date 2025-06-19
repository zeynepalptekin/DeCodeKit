package b.f;

import androidx.annotation.h0;
import androidx.annotation.i0;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class i<K, V> {
    private static final boolean g = false;
    private static final String h = "ArrayMap";
    private static final boolean i = true;
    private static final int j = 4;
    private static final int k = 10;

    @i0
    static Object[] l;
    static int m;

    @i0
    static Object[] n;
    static int o;
    int[] d;
    Object[] e;
    int f;

    public i() {
        this.d = e.f891a;
        this.e = e.f893c;
        this.f = 0;
    }

    public i(int r1) {
        if (r1 == 0) {
            this.d = e.f891a;
            this.e = e.f893c;
        } else {
            a(r1);
        }
        this.f = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(i<K, V> iVar) {
        this();
        if (iVar != 0) {
            j(iVar);
        }
    }

    private void a(int r6) {
        if (r6 == 8) {
            synchronized (i.class) {
                if (n != null) {
                    Object[] objArr = n;
                    this.e = objArr;
                    n = (Object[]) objArr[0];
                    this.d = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    o--;
                    return;
                }
            }
        } else if (r6 == 4) {
            synchronized (i.class) {
                if (l != null) {
                    Object[] objArr2 = l;
                    this.e = objArr2;
                    l = (Object[]) objArr2[0];
                    this.d = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    m--;
                    return;
                }
            }
        }
        this.d = new int[r6];
        this.e = new Object[r6 << 1];
    }

    private static int b(int[] r0, int r1, int r2) {
        try {
            return e.a(r0, r1, r2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] r8, Object[] objArr, int r10) {
        if (r8.length == 8) {
            synchronized (i.class) {
                if (o < 10) {
                    objArr[0] = n;
                    objArr[1] = r8;
                    for (int r82 = (r10 << 1) - 1; r82 >= 2; r82--) {
                        objArr[r82] = null;
                    }
                    n = objArr;
                    o++;
                }
            }
            return;
        }
        if (r8.length == 4) {
            synchronized (i.class) {
                if (m < 10) {
                    objArr[0] = l;
                    objArr[1] = r8;
                    for (int r83 = (r10 << 1) - 1; r83 >= 2; r83--) {
                        objArr[r83] = null;
                    }
                    l = objArr;
                    m++;
                }
            }
        }
    }

    public void c(int r6) {
        int r0 = this.f;
        int[] r1 = this.d;
        if (r1.length < r6) {
            Object[] objArr = this.e;
            a(r6);
            if (this.f > 0) {
                System.arraycopy(r1, 0, this.d, 0, r0);
                System.arraycopy(objArr, 0, this.e, 0, r0 << 1);
            }
            d(r1, objArr, r0);
        }
        if (this.f != r0) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int r0 = this.f;
        if (r0 > 0) {
            int[] r1 = this.d;
            Object[] objArr = this.e;
            this.d = e.f891a;
            this.e = e.f893c;
            this.f = 0;
            d(r1, objArr, r0);
        }
        if (this.f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@i0 Object obj) {
        if (f(obj) >= 0) {
            return i;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (h(obj) >= 0) {
            return i;
        }
        return false;
    }

    int e(Object obj, int r7) {
        int r0 = this.f;
        if (r0 == 0) {
            return -1;
        }
        int r1 = b(this.d, r0, r7);
        if (r1 < 0 || obj.equals(this.e[r1 << 1])) {
            return r1;
        }
        int r2 = r1 + 1;
        while (r2 < r0 && this.d[r2] == r7) {
            if (obj.equals(this.e[r2 << 1])) {
                return r2;
            }
            r2++;
        }
        for (int r12 = r1 - 1; r12 >= 0 && this.d[r12] == r7; r12--) {
            if (obj.equals(this.e[r12 << 1])) {
                return r12;
            }
        }
        return ~r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return i;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (size() != iVar.size()) {
                return false;
            }
            for (int r1 = 0; r1 < this.f; r1++) {
                try {
                    K kI = i(r1);
                    V vM = m(r1);
                    Object obj2 = iVar.get(kI);
                    if (vM == null) {
                        if (obj2 != null || !iVar.containsKey(kI)) {
                            return false;
                        }
                    } else if (!vM.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return i;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int r12 = 0; r12 < this.f; r12++) {
                try {
                    K kI2 = i(r12);
                    V vM2 = m(r12);
                    Object obj3 = map.get(kI2);
                    if (vM2 == null) {
                        if (obj3 != null || !map.containsKey(kI2)) {
                            return false;
                        }
                    } else if (!vM2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return i;
        }
        return false;
    }

    public int f(@i0 Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    int g() {
        int r0 = this.f;
        if (r0 == 0) {
            return -1;
        }
        int r1 = b(this.d, r0, 0);
        if (r1 < 0 || this.e[r1 << 1] == null) {
            return r1;
        }
        int r2 = r1 + 1;
        while (r2 < r0 && this.d[r2] == 0) {
            if (this.e[r2 << 1] == null) {
                return r2;
            }
            r2++;
        }
        for (int r12 = r1 - 1; r12 >= 0 && this.d[r12] == 0; r12--) {
            if (this.e[r12 << 1] == null) {
                return r12;
            }
        }
        return ~r2;
    }

    @i0
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int r1 = f(obj);
        return r1 >= 0 ? (V) this.e[(r1 << 1) + 1] : v;
    }

    int h(Object obj) {
        int r0 = this.f * 2;
        Object[] objArr = this.e;
        if (obj == null) {
            for (int r6 = 1; r6 < r0; r6 += 2) {
                if (objArr[r6] == null) {
                    return r6 >> 1;
                }
            }
            return -1;
        }
        for (int r3 = 1; r3 < r0; r3 += 2) {
            if (obj.equals(objArr[r3])) {
                return r3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] r0 = this.d;
        Object[] objArr = this.e;
        int r2 = this.f;
        int r3 = 1;
        int r5 = 0;
        int r6 = 0;
        while (r5 < r2) {
            Object obj = objArr[r3];
            r6 += (obj == null ? 0 : obj.hashCode()) ^ r0[r5];
            r5++;
            r3 += 2;
        }
        return r6;
    }

    public K i(int r2) {
        return (K) this.e[r2 << 1];
    }

    public boolean isEmpty() {
        if (this.f <= 0) {
            return i;
        }
        return false;
    }

    public void j(@h0 i<? extends K, ? extends V> iVar) {
        int r0 = iVar.f;
        c(this.f + r0);
        if (this.f != 0) {
            for (int r2 = 0; r2 < r0; r2++) {
                put(iVar.i(r2), iVar.m(r2));
            }
        } else if (r0 > 0) {
            System.arraycopy(iVar.d, 0, this.d, 0, r0);
            System.arraycopy(iVar.e, 0, this.e, 0, r0 << 1);
            this.f = r0;
        }
    }

    public V k(int r11) {
        Object[] objArr = this.e;
        int r1 = r11 << 1;
        V v = (V) objArr[r1 + 1];
        int r3 = this.f;
        int r4 = 0;
        if (r3 <= 1) {
            d(this.d, objArr, r3);
            this.d = e.f891a;
            this.e = e.f893c;
        } else {
            int r0 = r3 - 1;
            int[] r6 = this.d;
            if (r6.length <= 8 || r3 >= r6.length / 3) {
                if (r11 < r0) {
                    int[] r42 = this.d;
                    int r62 = r11 + 1;
                    int r7 = r0 - r11;
                    System.arraycopy(r42, r62, r42, r11, r7);
                    Object[] objArr2 = this.e;
                    System.arraycopy(objArr2, r62 << 1, objArr2, r1, r7 << 1);
                }
                Object[] objArr3 = this.e;
                int r12 = r0 << 1;
                objArr3[r12] = null;
                objArr3[r12 + 1] = null;
            } else {
                int r8 = r3 > 8 ? r3 + (r3 >> 1) : 8;
                int[] r63 = this.d;
                Object[] objArr4 = this.e;
                a(r8);
                if (r3 != this.f) {
                    throw new ConcurrentModificationException();
                }
                if (r11 > 0) {
                    System.arraycopy(r63, 0, this.d, 0, r11);
                    System.arraycopy(objArr4, 0, this.e, 0, r1);
                }
                if (r11 < r0) {
                    int r43 = r11 + 1;
                    int r9 = r0 - r11;
                    System.arraycopy(r63, r43, this.d, r11, r9);
                    System.arraycopy(objArr4, r43 << 1, this.e, r1, r9 << 1);
                }
            }
            r4 = r0;
        }
        if (r3 != this.f) {
            throw new ConcurrentModificationException();
        }
        this.f = r4;
        return v;
    }

    public V l(int r3, V v) {
        int r32 = (r3 << 1) + 1;
        Object[] objArr = this.e;
        V v2 = (V) objArr[r32];
        objArr[r32] = v;
        return v2;
    }

    public V m(int r2) {
        return (V) this.e[(r2 << 1) + 1];
    }

    @i0
    public V put(K k2, V v) {
        int r3;
        int r2;
        int r0 = this.f;
        if (k2 == null) {
            r2 = g();
            r3 = 0;
        } else {
            int r22 = k2.hashCode();
            r3 = r22;
            r2 = e(k2, r22);
        }
        if (r2 >= 0) {
            int r10 = (r2 << 1) + 1;
            Object[] objArr = this.e;
            V v2 = (V) objArr[r10];
            objArr[r10] = v;
            return v2;
        }
        int r23 = ~r2;
        if (r0 >= this.d.length) {
            int r4 = 4;
            if (r0 >= 8) {
                r4 = (r0 >> 1) + r0;
            } else if (r0 >= 4) {
                r4 = 8;
            }
            int[] r5 = this.d;
            Object[] objArr2 = this.e;
            a(r4);
            if (r0 != this.f) {
                throw new ConcurrentModificationException();
            }
            int[] r42 = this.d;
            if (r42.length > 0) {
                System.arraycopy(r5, 0, r42, 0, r5.length);
                System.arraycopy(objArr2, 0, this.e, 0, objArr2.length);
            }
            d(r5, objArr2, r0);
        }
        if (r23 < r0) {
            int[] r1 = this.d;
            int r43 = r23 + 1;
            System.arraycopy(r1, r23, r1, r43, r0 - r23);
            Object[] objArr3 = this.e;
            System.arraycopy(objArr3, r23 << 1, objArr3, r43 << 1, (this.f - r23) << 1);
        }
        int r12 = this.f;
        if (r0 == r12) {
            int[] r02 = this.d;
            if (r23 < r02.length) {
                r02[r23] = r3;
                Object[] objArr4 = this.e;
                int r24 = r23 << 1;
                objArr4[r24] = k2;
                objArr4[r24 + 1] = v;
                this.f = r12 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @i0
    public V putIfAbsent(K k2, V v) {
        V v2 = get(k2);
        return v2 == null ? put(k2, v) : v2;
    }

    @i0
    public V remove(Object obj) {
        int r1 = f(obj);
        if (r1 >= 0) {
            return k(r1);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int r2 = f(obj);
        if (r2 < 0) {
            return false;
        }
        V vM = m(r2);
        if (obj2 != vM && (obj2 == null || !obj2.equals(vM))) {
            return false;
        }
        k(r2);
        return i;
    }

    @i0
    public V replace(K k2, V v) {
        int r1 = f(k2);
        if (r1 >= 0) {
            return l(r1, v);
        }
        return null;
    }

    public boolean replace(K k2, V v, V v2) {
        int r2 = f(k2);
        if (r2 < 0) {
            return false;
        }
        V vM = m(r2);
        if (vM != v && (v == null || !v.equals(vM))) {
            return false;
        }
        l(r2, v2);
        return i;
    }

    public int size() {
        return this.f;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 28);
        sb.append('{');
        for (int r1 = 0; r1 < this.f; r1++) {
            if (r1 > 0) {
                sb.append(", ");
            }
            K kI = i(r1);
            if (kI != this) {
                sb.append(kI);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vM = m(r1);
            if (vM != this) {
                sb.append(vM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
