package c.a.e.a0;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class j<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> k = new a();
    static final /* synthetic */ boolean l = false;
    Comparator<? super K> d;
    e<K, V> e;
    int f;
    int g;
    final e<K, V> h;
    private j<K, V>.b i;
    private j<K, V>.c j;

    static class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet<Map.Entry<K, V>> {

        class a extends j<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && j.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = j.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            j.this.f(eVarC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j.this.f;
        }
    }

    final class c extends AbstractSet<K> {

        class a extends j<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return b().i;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return j.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return j.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j.this.f;
        }
    }

    private abstract class d<T> implements Iterator<T> {
        e<K, V> d;
        e<K, V> e;
        int f;

        d() {
            j jVar = j.this;
            this.d = jVar.h.g;
            this.e = null;
            this.f = jVar.g;
        }

        final e<K, V> b() {
            e<K, V> eVar = this.d;
            j jVar = j.this;
            if (eVar == jVar.h) {
                throw new NoSuchElementException();
            }
            if (jVar.g != this.f) {
                throw new ConcurrentModificationException();
            }
            this.d = eVar.g;
            this.e = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d != j.this.h;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.e;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            j.this.f(eVar, true);
            this.e = null;
            this.f = j.this.g;
        }
    }

    static final class e<K, V> implements Map.Entry<K, V> {
        e<K, V> d;
        e<K, V> e;
        e<K, V> f;
        e<K, V> g;
        e<K, V> h;
        final K i;
        V j;
        int k;

        e() {
            this.i = null;
            this.h = this;
            this.g = this;
        }

        e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.d = eVar;
            this.i = k;
            this.k = 1;
            this.g = eVar2;
            this.h = eVar3;
            eVar3.g = this;
            eVar2.h = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.e; eVar2 != null; eVar2 = eVar2.e) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f; eVar2 != null; eVar2 = eVar2.f) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.i;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.j;
            Object value = entry.getValue();
            if (v == null) {
                if (value != null) {
                    return false;
                }
            } else if (!v.equals(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.i;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.j;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.i;
            int r0 = k == null ? 0 : k.hashCode();
            V v = this.j;
            return r0 ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.j;
            this.j = v;
            return v2;
        }

        public String toString() {
            return this.i + "=" + this.j;
        }
    }

    public j() {
        this(k);
    }

    public j(Comparator<? super K> comparator) {
        this.f = 0;
        this.g = 0;
        this.h = new e<>();
        this.d = comparator == null ? k : comparator;
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void e(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.e;
            e<K, V> eVar3 = eVar.f;
            int r3 = eVar2 != null ? eVar2.k : 0;
            int r4 = eVar3 != null ? eVar3.k : 0;
            int r5 = r3 - r4;
            if (r5 == -2) {
                e<K, V> eVar4 = eVar3.e;
                e<K, V> eVar5 = eVar3.f;
                int r2 = (eVar4 != null ? eVar4.k : 0) - (eVar5 != null ? eVar5.k : 0);
                if (r2 != -1 && (r2 != 0 || z)) {
                    j(eVar3);
                }
                i(eVar);
                if (z) {
                    return;
                }
            } else if (r5 == 2) {
                e<K, V> eVar6 = eVar2.e;
                e<K, V> eVar7 = eVar2.f;
                int r22 = (eVar6 != null ? eVar6.k : 0) - (eVar7 != null ? eVar7.k : 0);
                if (r22 != 1 && (r22 != 0 || z)) {
                    i(eVar2);
                }
                j(eVar);
                if (z) {
                    return;
                }
            } else if (r5 == 0) {
                eVar.k = r3 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.k = Math.max(r3, r4) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.d;
        }
    }

    private void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.d;
        eVar.d = null;
        if (eVar2 != null) {
            eVar2.d = eVar3;
        }
        if (eVar3 == null) {
            this.e = eVar2;
        } else if (eVar3.e == eVar) {
            eVar3.e = eVar2;
        } else {
            eVar3.f = eVar2;
        }
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.e;
        e<K, V> eVar3 = eVar.f;
        e<K, V> eVar4 = eVar3.e;
        e<K, V> eVar5 = eVar3.f;
        eVar.f = eVar4;
        if (eVar4 != null) {
            eVar4.d = eVar;
        }
        h(eVar, eVar3);
        eVar3.e = eVar;
        eVar.d = eVar3;
        int r0 = Math.max(eVar2 != null ? eVar2.k : 0, eVar4 != null ? eVar4.k : 0) + 1;
        eVar.k = r0;
        eVar3.k = Math.max(r0, eVar5 != null ? eVar5.k : 0) + 1;
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.e;
        e<K, V> eVar3 = eVar.f;
        e<K, V> eVar4 = eVar2.e;
        e<K, V> eVar5 = eVar2.f;
        eVar.e = eVar5;
        if (eVar5 != null) {
            eVar5.d = eVar;
        }
        h(eVar, eVar2);
        eVar2.f = eVar;
        eVar.d = eVar2;
        int r1 = Math.max(eVar3 != null ? eVar3.k : 0, eVar5 != null ? eVar5.k : 0) + 1;
        eVar.k = r1;
        eVar2.k = Math.max(r1, eVar4 != null ? eVar4.k : 0) + 1;
    }

    private Object k() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    e<K, V> b(K k2, boolean z) {
        int r4;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.d;
        e<K, V> eVar2 = this.e;
        if (eVar2 != null) {
            Comparable comparable = comparator == k ? (Comparable) k2 : null;
            while (true) {
                K k3 = eVar2.i;
                r4 = comparable != null ? comparable.compareTo(k3) : comparator.compare(k2, k3);
                if (r4 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = r4 < 0 ? eVar2.e : eVar2.f;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            r4 = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.h;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.h);
            if (r4 < 0) {
                eVar2.e = eVar;
            } else {
                eVar2.f = eVar;
            }
            e(eVar2, true);
        } else {
            if (comparator == k && !(k2 instanceof Comparable)) {
                throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k2, eVar4, eVar4.h);
            this.e = eVar;
        }
        this.f++;
        this.g++;
        return eVar;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> eVarD = d(entry.getKey());
        if (eVarD != null && a(eVarD.j, entry.getValue())) {
            return eVarD;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.e = null;
        this.f = 0;
        this.g++;
        e<K, V> eVar = this.h;
        eVar.h = eVar;
        eVar.g = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> d(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        j<K, V>.b bVar = this.i;
        if (bVar != null) {
            return bVar;
        }
        j<K, V>.b bVar2 = new b();
        this.i = bVar2;
        return bVar2;
    }

    void f(e<K, V> eVar, boolean z) {
        int r1;
        if (z) {
            e<K, V> eVar2 = eVar.h;
            eVar2.g = eVar.g;
            eVar.g.h = eVar2;
        }
        e<K, V> eVar3 = eVar.e;
        e<K, V> eVar4 = eVar.f;
        e<K, V> eVar5 = eVar.d;
        int r2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.e = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f--;
            this.g++;
            return;
        }
        e<K, V> eVarB = eVar3.k > eVar4.k ? eVar3.b() : eVar4.a();
        f(eVarB, false);
        e<K, V> eVar6 = eVar.e;
        if (eVar6 != null) {
            r1 = eVar6.k;
            eVarB.e = eVar6;
            eVar6.d = eVarB;
            eVar.e = null;
        } else {
            r1 = 0;
        }
        e<K, V> eVar7 = eVar.f;
        if (eVar7 != null) {
            r2 = eVar7.k;
            eVarB.f = eVar7;
            eVar7.d = eVarB;
            eVar.f = null;
        }
        eVarB.k = Math.max(r1, r2) + 1;
        h(eVar, eVarB);
    }

    e<K, V> g(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            f(eVarD, true);
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            return eVarD.j;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        j<K, V>.c cVar = this.j;
        if (cVar != null) {
            return cVar;
        }
        j<K, V>.c cVar2 = new c();
        this.j = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        e<K, V> eVarB = b(k2, true);
        V v2 = eVarB.j;
        eVarB.j = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarG = g(obj);
        if (eVarG != null) {
            return eVarG.j;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f;
    }
}
