package b.b.a.c;

import androidx.annotation.h0;
import androidx.annotation.p0;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {
    c<K, V> d;
    private c<K, V> e;
    private WeakHashMap<f<K, V>, Boolean> f = new WeakHashMap<>();
    private int g = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // b.b.a.c.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.g;
        }

        @Override // b.b.a.c.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f;
        }
    }

    /* renamed from: b.b.a.c.b$b, reason: collision with other inner class name */
    private static class C0043b<K, V> extends e<K, V> {
        C0043b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // b.b.a.c.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f;
        }

        @Override // b.b.a.c.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.g;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        @h0
        final K d;

        @h0
        final V e;
        c<K, V> f;
        c<K, V> g;

        c(@h0 K k, @h0 V v) {
            this.d = k;
            this.e = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.d.equals(cVar.d) && this.e.equals(cVar.e);
        }

        @Override // java.util.Map.Entry
        @h0
        public K getKey() {
            return this.d;
        }

        @Override // java.util.Map.Entry
        @h0
        public V getValue() {
            return this.e;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.d.hashCode() ^ this.e.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.d + "=" + this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
        private c<K, V> d;
        private boolean e = true;

        d() {
        }

        @Override // b.b.a.c.b.f
        public void b(@h0 c<K, V> cVar) {
            c<K, V> cVar2 = this.d;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.g;
                this.d = cVar3;
                this.e = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.e) {
                this.e = false;
                cVar = b.this.d;
            } else {
                c<K, V> cVar2 = this.d;
                cVar = cVar2 != null ? cVar2.f : null;
            }
            this.d = cVar;
            return this.d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.e) {
                return b.this.d != null;
            }
            c<K, V> cVar = this.d;
            return (cVar == null || cVar.f == null) ? false : true;
        }
    }

    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
        c<K, V> d;
        c<K, V> e;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.d = cVar2;
            this.e = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.e;
            c<K, V> cVar2 = this.d;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // b.b.a.c.b.f
        public void b(@h0 c<K, V> cVar) {
            if (this.d == cVar && cVar == this.e) {
                this.e = null;
                this.d = null;
            }
            c<K, V> cVar2 = this.d;
            if (cVar2 == cVar) {
                this.d = c(cVar2);
            }
            if (this.e == cVar) {
                this.e = f();
            }
        }

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.e;
            this.e = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.e != null;
        }
    }

    interface f<K, V> {
        void b(@h0 c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> c() {
        C0043b c0043b = new C0043b(this.e, this.d);
        this.f.put(c0043b, Boolean.FALSE);
        return c0043b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Map.Entry<K, V> h() {
        return this.d;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int r1 = 0;
        while (it.hasNext()) {
            r1 += it.next().hashCode();
        }
        return r1;
    }

    protected c<K, V> i(K k) {
        c<K, V> cVar = this.d;
        while (cVar != null && !cVar.d.equals(k)) {
            cVar = cVar.f;
        }
        return cVar;
    }

    @Override // java.lang.Iterable
    @h0
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.d, this.e);
        this.f.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public b<K, V>.d j() {
        b<K, V>.d dVar = new d();
        this.f.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> l() {
        return this.e;
    }

    protected c<K, V> n(@h0 K k, @h0 V v) {
        c<K, V> cVar = new c<>(k, v);
        this.g++;
        c<K, V> cVar2 = this.e;
        if (cVar2 == null) {
            this.d = cVar;
        } else {
            cVar2.f = cVar;
            cVar.g = cVar2;
        }
        this.e = cVar;
        return cVar;
    }

    public V o(@h0 K k, @h0 V v) {
        c<K, V> cVarI = i(k);
        if (cVarI != null) {
            return cVarI.e;
        }
        n(k, v);
        return null;
    }

    public V r(@h0 K k) {
        c<K, V> cVarI = i(k);
        if (cVarI == null) {
            return null;
        }
        this.g--;
        if (!this.f.isEmpty()) {
            Iterator<f<K, V>> it = this.f.keySet().iterator();
            while (it.hasNext()) {
                it.next().b(cVarI);
            }
        }
        c<K, V> cVar = cVarI.g;
        if (cVar != null) {
            cVar.f = cVarI.f;
        } else {
            this.d = cVarI.f;
        }
        c<K, V> cVar2 = cVarI.f;
        if (cVar2 != null) {
            cVar2.g = cVarI.g;
        } else {
            this.e = cVarI.g;
        }
        cVarI.f = null;
        cVarI.g = null;
        return cVarI.e;
    }

    public int size() {
        return this.g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
