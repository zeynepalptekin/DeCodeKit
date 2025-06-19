package b.f;

import androidx.annotation.i0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
abstract class h<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @i0
    h<K, V>.b f897a;

    /* renamed from: b, reason: collision with root package name */
    @i0
    h<K, V>.c f898b;

    /* renamed from: c, reason: collision with root package name */
    @i0
    h<K, V>.e f899c;

    final class a<T> implements Iterator<T> {
        final int d;
        int e;
        int f;
        boolean g = false;

        a(int r3) {
            this.d = r3;
            this.e = h.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f < this.e;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) h.this.b(this.f, this.d);
            this.f++;
            this.g = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.g) {
                throw new IllegalStateException();
            }
            int r0 = this.f - 1;
            this.f = r0;
            this.e--;
            this.g = false;
            h.this.h(r0);
        }
    }

    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int r0 = h.this.d();
            for (Map.Entry<K, V> entry : collection) {
                h.this.g(entry.getKey(), entry.getValue());
            }
            return r0 != h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            h.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int r0 = h.this.e(entry.getKey());
            if (r0 < 0) {
                return false;
            }
            return b.f.e.c(h.this.b(r0, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return h.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int r3 = 0;
            for (int r0 = h.this.d() - 1; r0 >= 0; r0--) {
                Object objB = h.this.b(r0, 0);
                Object objB2 = h.this.b(r0, 1);
                r3 += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
            }
            return r3;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            h.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return h.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return h.j(h.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return h.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int r2 = 0;
            for (int r0 = h.this.d() - 1; r0 >= 0; r0--) {
                Object objB = h.this.b(r0, 0);
                r2 += objB == null ? 0 : objB.hashCode();
            }
            return r2;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int r2 = h.this.e(obj);
            if (r2 < 0) {
                return false;
            }
            h.this.h(r2);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return h.o(h.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return h.p(h.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return h.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) h.this.r(tArr, 0);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        int d;
        boolean f = false;
        int e = -1;

        d() {
            this.d = h.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.e++;
            this.f = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b.f.e.c(entry.getKey(), h.this.b(this.e, 0)) && b.f.e.c(entry.getValue(), h.this.b(this.e, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f) {
                return (K) h.this.b(this.e, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f) {
                return (V) h.this.b(this.e, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.e < this.d;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objB = h.this.b(this.e, 0);
            Object objB2 = h.this.b(this.e, 1);
            return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f) {
                throw new IllegalStateException();
            }
            h.this.h(this.e);
            this.e--;
            this.d--;
            this.f = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f) {
                return (V) h.this.i(this.e, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            h.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return h.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int r2 = h.this.f(obj);
            if (r2 < 0) {
                return false;
            }
            h.this.h(r2);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int r0 = h.this.d();
            int r1 = 0;
            boolean z = false;
            while (r1 < r0) {
                if (collection.contains(h.this.b(r1, 1))) {
                    h.this.h(r1);
                    r1--;
                    r0--;
                    z = true;
                }
                r1++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int r0 = h.this.d();
            int r1 = 0;
            boolean z = false;
            while (r1 < r0) {
                if (!collection.contains(h.this.b(r1, 1))) {
                    h.this.h(r1);
                    r1--;
                    r0--;
                    z = true;
                }
                r1++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return h.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return h.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) h.this.r(tArr, 1);
        }
    }

    h() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int r1, int r2);

    protected abstract Map<K, V> c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(K k, V v);

    protected abstract void h(int r1);

    protected abstract V i(int r1, V v);

    public Set<Map.Entry<K, V>> l() {
        if (this.f897a == null) {
            this.f897a = new b();
        }
        return this.f897a;
    }

    public Set<K> m() {
        if (this.f898b == null) {
            this.f898b = new c();
        }
        return this.f898b;
    }

    public Collection<V> n() {
        if (this.f899c == null) {
            this.f899c = new e();
        }
        return this.f899c;
    }

    public Object[] q(int r5) {
        int r0 = d();
        Object[] objArr = new Object[r0];
        for (int r2 = 0; r2 < r0; r2++) {
            objArr[r2] = b(r2, r5);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int r5) {
        int r0 = d();
        if (tArr.length < r0) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), r0));
        }
        for (int r1 = 0; r1 < r0; r1++) {
            tArr[r1] = b(r1, r5);
        }
        if (tArr.length > r0) {
            tArr[r0] = null;
        }
        return tArr;
    }
}
