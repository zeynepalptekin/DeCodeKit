package c.a.b.b.g.c;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class r3<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Object m = new Object();

    @NullableDecl
    private transient Object d;

    @NullableDecl
    transient int[] e;

    @NullableDecl
    transient Object[] f;

    @NullableDecl
    transient Object[] g;
    private transient int h;
    private transient int i;

    @NullableDecl
    private transient Set<K> j;

    @NullableDecl
    private transient Set<Map.Entry<K, V>> k;

    @NullableDecl
    private transient Collection<V> l;

    r3() {
        g3.f(true, "Expected size must be >= 0");
        this.h = f5.a(3, 1, 1073741823);
    }

    private final int b(int r9, int r10, int r11, int r12) {
        Object objD = c4.d(r10);
        int r102 = r10 - 1;
        if (r12 != 0) {
            c4.e(objD, r11 & r102, r12 + 1);
        }
        Object obj = this.d;
        int[] r122 = this.e;
        for (int r1 = 0; r1 <= r9; r1++) {
            int r2 = c4.b(obj, r1);
            while (r2 != 0) {
                int r3 = r2 - 1;
                int r4 = r122[r3];
                int r5 = ((~r9) & r4) | r1;
                int r6 = r5 & r102;
                int r7 = c4.b(objD, r6);
                c4.e(objD, r6, r2);
                r122[r3] = c4.a(r5, r7, r102);
                r2 = r4 & r9;
            }
        }
        this.d = objD;
        m(r102);
        return r102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d(@NullableDecl Object obj) {
        if (g()) {
            return -1;
        }
        int r0 = e4.b(obj);
        int r2 = v();
        int r3 = c4.b(this.d, r0 & r2);
        if (r3 == 0) {
            return -1;
        }
        int r4 = ~r2;
        int r02 = r0 & r4;
        do {
            int r32 = r3 - 1;
            int r5 = this.e[r32];
            if ((r5 & r4) == r02 && d3.a(obj, this.f[r32])) {
                return r32;
            }
            r3 = r5 & r2;
        } while (r3 != 0);
        return -1;
    }

    static int h(int r0, int r1) {
        return r0 - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    public final Object k(@NullableDecl Object obj) {
        if (g()) {
            return m;
        }
        int r7 = v();
        int r9 = c4.c(obj, null, r7, this.d, this.e, this.f, null);
        if (r9 == -1) {
            return m;
        }
        Object obj2 = this.g[r9];
        f(r9, r7);
        this.i--;
        o();
        return obj2;
    }

    private final void m(int r3) {
        this.h = c4.a(this.h, 32 - Integer.numberOfLeadingZeros(r3), 31);
    }

    static /* synthetic */ int q(r3 r3Var) {
        int r0 = r3Var.i;
        r3Var.i = r0 - 1;
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int v() {
        return (1 << (this.h & 31)) - 1;
    }

    final int a(int r2) {
        int r22 = r2 + 1;
        if (r22 < this.i) {
            return r22;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        o();
        Map<K, V> mapL = l();
        if (mapL != null) {
            this.h = f5.a(size(), 3, 1073741823);
            mapL.clear();
            this.d = null;
        } else {
            Arrays.fill(this.f, 0, this.i, (Object) null);
            Arrays.fill(this.g, 0, this.i, (Object) null);
            Object obj = this.d;
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(this.e, 0, this.i, 0);
        }
        this.i = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        Map<K, V> mapL = l();
        return mapL != null ? mapL.containsKey(obj) : d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        Map<K, V> mapL = l();
        if (mapL != null) {
            return mapL.containsValue(obj);
        }
        for (int r1 = 0; r1 < this.i; r1++) {
            if (d3.a(obj, this.g[r1])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.k;
        if (set != null) {
            return set;
        }
        v3 v3Var = new v3(this);
        this.k = v3Var;
        return v3Var;
    }

    final void f(int r8, int r9) {
        int size = size() - 1;
        if (r8 >= size) {
            this.f[r8] = null;
            this.g[r8] = null;
            this.e[r8] = 0;
            return;
        }
        Object[] objArr = this.f;
        Object obj = objArr[size];
        objArr[r8] = obj;
        Object[] objArr2 = this.g;
        objArr2[r8] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        int[] r2 = this.e;
        r2[r8] = r2[size];
        r2[size] = 0;
        int r1 = e4.b(obj) & r9;
        int r22 = c4.b(this.d, r1);
        int r0 = size + 1;
        if (r22 == r0) {
            c4.e(this.d, r1, r8 + 1);
            return;
        }
        while (true) {
            int r23 = r22 - 1;
            int[] r12 = this.e;
            int r3 = r12[r23];
            int r4 = r3 & r9;
            if (r4 == r0) {
                r12[r23] = c4.a(r3, r8 + 1, r9);
                return;
            }
            r22 = r4;
        }
    }

    final boolean g() {
        return this.d == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(@NullableDecl Object obj) {
        Map<K, V> mapL = l();
        if (mapL != null) {
            return mapL.get(obj);
        }
        int r2 = d(obj);
        if (r2 == -1) {
            return null;
        }
        return (V) this.g[r2];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.j;
        if (set != null) {
            return set;
        }
        x3 x3Var = new x3(this);
        this.j = x3Var;
        return x3Var;
    }

    @NullableDecl
    final Map<K, V> l() {
        Object obj = this.d;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void o() {
        this.h += 32;
    }

    final int p() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public final V put(@NullableDecl K k, @NullableDecl V v) {
        int r4;
        if (g()) {
            g3.h(g(), "Arrays already allocated");
            int r3 = this.h;
            int r6 = Math.max(r3 + 1, 2);
            int r7 = Integer.highestOneBit(r6);
            int r5 = Math.max(4, (r6 <= ((int) (((double) r7) * 1.0d)) || (r7 = r7 << 1) > 0) ? r7 : 1073741824);
            this.d = c4.d(r5);
            m(r5 - 1);
            this.e = new int[r3];
            this.f = new Object[r3];
            this.g = new Object[r3];
        }
        Map<K, V> mapL = l();
        if (mapL != null) {
            return mapL.put(k, v);
        }
        int[] r32 = this.e;
        Object[] objArr = this.f;
        Object[] objArr2 = this.g;
        int r72 = this.i;
        int r8 = r72 + 1;
        int r9 = e4.b(k);
        int r10 = v();
        int r11 = r9 & r10;
        int r12 = c4.b(this.d, r11);
        if (r12 != 0) {
            int r112 = ~r10;
            int r15 = r9 & r112;
            int r16 = 0;
            while (true) {
                int r122 = r12 - 1;
                int r13 = r32[r122];
                if ((r13 & r112) == r15 && d3.a(k, objArr[r122])) {
                    V v2 = (V) objArr2[r122];
                    objArr2[r122] = v;
                    return v2;
                }
                int r14 = r13 & r10;
                Object[] objArr3 = objArr;
                int r52 = r16 + 1;
                if (r14 != 0) {
                    r16 = r52;
                    r12 = r14;
                    objArr = objArr3;
                } else {
                    if (r52 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(v() + 1, 1.0f);
                        int r33 = p();
                        while (r33 >= 0) {
                            linkedHashMap.put(this.f[r33], this.g[r33]);
                            r33 = a(r33);
                        }
                        this.d = linkedHashMap;
                        this.e = null;
                        this.f = null;
                        this.g = null;
                        o();
                        return (V) linkedHashMap.put(k, v);
                    }
                    if (r8 <= r10) {
                        r32[r122] = c4.a(r13, r8, r10);
                    }
                }
            }
        } else if (r8 > r10) {
            r10 = b(r10, c4.f(r10), r9, r72);
        } else {
            c4.e(this.d, r11, r8);
        }
        int length = this.e.length;
        if (r8 > length && (r4 = Math.min(1073741823, 1 | (Math.max(1, length >>> 1) + length))) != length) {
            this.e = Arrays.copyOf(this.e, r4);
            this.f = Arrays.copyOf(this.f, r4);
            this.g = Arrays.copyOf(this.g, r4);
        }
        this.e[r72] = c4.a(r9, 0, r10);
        this.f[r72] = k;
        this.g[r72] = v;
        this.i = r8;
        o();
        return null;
    }

    final Iterator<K> r() {
        Map<K, V> mapL = l();
        return mapL != null ? mapL.keySet().iterator() : new u3(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map<K, V> mapL = l();
        if (mapL != null) {
            return mapL.remove(obj);
        }
        V v = (V) k(obj);
        if (v == m) {
            return null;
        }
        return v;
    }

    final Iterator<Map.Entry<K, V>> s() {
        Map<K, V> mapL = l();
        return mapL != null ? mapL.entrySet().iterator() : new t3(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> mapL = l();
        return mapL != null ? mapL.size() : this.i;
    }

    final Iterator<V> t() {
        Map<K, V> mapL = l();
        return mapL != null ? mapL.values().iterator() : new w3(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.l;
        if (collection != null) {
            return collection;
        }
        z3 z3Var = new z3(this);
        this.l = z3Var;
        return z3Var;
    }
}
