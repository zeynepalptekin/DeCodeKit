package b.f;

import androidx.annotation.h0;
import androidx.annotation.i0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a<K, V> extends i<K, V> implements Map<K, V> {

    @i0
    h<K, V> p;

    /* renamed from: b.f.a$a, reason: collision with other inner class name */
    class C0052a extends h<K, V> {
        C0052a() {
        }

        @Override // b.f.h
        protected void a() {
            a.this.clear();
        }

        @Override // b.f.h
        protected Object b(int r2, int r3) {
            return a.this.e[(r2 << 1) + r3];
        }

        @Override // b.f.h
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // b.f.h
        protected int d() {
            return a.this.f;
        }

        @Override // b.f.h
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // b.f.h
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // b.f.h
        protected void g(K k, V v) {
            a.this.put(k, v);
        }

        @Override // b.f.h
        protected void h(int r2) {
            a.this.k(r2);
        }

        @Override // b.f.h
        protected V i(int r2, V v) {
            return a.this.l(r2, v);
        }
    }

    public a() {
    }

    public a(int r1) {
        super(r1);
    }

    public a(i iVar) {
        super(iVar);
    }

    private h<K, V> o() {
        if (this.p == null) {
            this.p = new C0052a();
        }
        return this.p;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return o().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return o().m();
    }

    public boolean n(@h0 Collection<?> collection) {
        return h.j(this, collection);
    }

    public boolean p(@h0 Collection<?> collection) {
        return h.o(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean q(@h0 Collection<?> collection) {
        return h.p(this, collection);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return o().n();
    }
}
