package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class rv1<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] g = new Map.Entry[0];
    private transient qv1<Map.Entry<K, V>> d;
    private transient qv1<K> e;
    private transient iv1<V> f;

    rv1() {
    }

    public static <K, V> rv1<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        hv1.a(k, v);
        hv1.a(k2, v2);
        hv1.a(k3, v3);
        hv1.a(k4, v4);
        hv1.a(k5, v5);
        return wv1.g(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    public static <K, V> rv1<K, V> e(K k, V v) {
        hv1.a(k, v);
        return wv1.g(1, new Object[]{k, v});
    }

    abstract qv1<Map.Entry<K, V>> b();

    abstract qv1<K> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return ((iv1) values()).contains(obj);
    }

    abstract iv1<V> d();

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        qv1<Map.Entry<K, V>> qv1Var = this.d;
        if (qv1Var != null) {
            return qv1Var;
        }
        qv1<Map.Entry<K, V>> qv1VarB = b();
        this.d = qv1VarB;
        return qv1VarB;
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public int hashCode() {
        return dw1.b((qv1) entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        qv1<K> qv1Var = this.e;
        if (qv1Var != null) {
            return qv1Var;
        }
        qv1<K> qv1VarC = c();
        this.e = qv1VarC;
        return qv1VarC;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        hv1.b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        iv1<V> iv1Var = this.f;
        if (iv1Var != null) {
            return iv1Var;
        }
        iv1<V> iv1VarD = d();
        this.f = iv1VarD;
        return iv1VarD;
    }
}
