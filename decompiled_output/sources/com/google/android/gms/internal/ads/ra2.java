package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ra2<K, V> extends LinkedHashMap<K, V> {
    private static final ra2 e;
    private boolean d;

    static {
        ra2 ra2Var = new ra2();
        e = ra2Var;
        ra2Var.d = false;
    }

    private ra2() {
        this.d = true;
    }

    private ra2(Map<K, V> map) {
        super(map);
        this.d = true;
    }

    private static int d(Object obj) {
        if (obj instanceof byte[]) {
            return o92.b((byte[]) obj);
        }
        if (obj instanceof r92) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static <K, V> ra2<K, V> f() {
        return e;
    }

    private final void h() {
        if (!this.d) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean b() {
        return this.d;
    }

    public final void c(ra2<K, V> ra2Var) {
        h();
        if (ra2Var.isEmpty()) {
            return;
        }
        putAll(ra2Var);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        super.clear();
    }

    public final void e() {
        this.d = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L59
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L16
        L14:
            r7 = 0
            goto L5a
        L16:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L52
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L56
        L52:
            boolean r3 = r4.equals(r3)
        L56:
            if (r3 != 0) goto L1e
            goto L14
        L59:
            r7 = 1
        L5a:
            if (r7 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ra2.equals(java.lang.Object):boolean");
    }

    public final ra2<K, V> g() {
        return isEmpty() ? new ra2<>() : new ra2<>(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int r1 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            r1 += d(entry.getValue()) ^ d(entry.getKey());
        }
        return r1;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        h();
        o92.a(k);
        o92.a(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        h();
        for (K k : map.keySet()) {
            o92.a(k);
            o92.a(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        h();
        return (V) super.remove(obj);
    }
}
