package c.a.b.b.g.c;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class i4<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] g = new Map.Entry[0];
    private transient m4<Map.Entry<K, V>> d;
    private transient m4<K> e;
    private transient d4<V> f;

    i4() {
    }

    abstract m4<Map.Entry<K, V>> a();

    abstract m4<K> b();

    abstract d4<V> c();

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
        return ((d4) values()).contains(obj);
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        m4<Map.Entry<K, V>> m4Var = this.d;
        if (m4Var != null) {
            return m4Var;
        }
        m4<Map.Entry<K, V>> m4VarA = a();
        this.d = m4VarA;
        return m4VarA;
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
        return b5.a((m4) entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        m4<K> m4Var = this.e;
        if (m4Var != null) {
            return m4Var;
        }
        m4<K> m4VarB = b();
        this.e = m4VarB;
        return m4VarB;
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
        if (size < 0) {
            StringBuilder sb = new StringBuilder("size".length() + 40);
            sb.append("size");
            sb.append(" cannot be negative but was: ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb2.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb2.append(", ");
            }
            z = false;
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        d4<V> d4Var = this.f;
        if (d4Var != null) {
            return d4Var;
        }
        d4<V> d4VarC = c();
        this.f = d4VarC;
        return d4VarC;
    }
}
