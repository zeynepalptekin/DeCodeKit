package c.a.b.b.g.c;

import java.util.Map;

/* loaded from: classes.dex */
final class u4<K, V> extends m4<Map.Entry<K, V>> {
    private final transient i4<K, V> f;
    private final transient Object[] g;
    private final transient int h = 0;
    private final transient int i;

    u4(i4<K, V> i4Var, Object[] objArr, int r3, int r4) {
        this.f = i4Var;
        this.g = objArr;
        this.i = r4;
    }

    @Override // c.a.b.b.g.c.d4
    final int c(Object[] objArr, int r3) {
        return n().c(objArr, r3);
    }

    @Override // c.a.b.b.g.c.d4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // c.a.b.b.g.c.m4, c.a.b.b.g.c.d4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h */
    public final d5<Map.Entry<K, V>> iterator() {
        return (d5) n().iterator();
    }

    @Override // c.a.b.b.g.c.d4
    final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i;
    }

    @Override // c.a.b.b.g.c.m4
    final h4<Map.Entry<K, V>> t() {
        return new x4(this);
    }
}
