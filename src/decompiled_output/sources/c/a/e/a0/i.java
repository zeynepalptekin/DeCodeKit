package c.a.e.a0;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class i<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> l = new a();
    static final /* synthetic */ boolean m = false;
    Comparator<? super K> d;
    g<K, V>[] e;
    final g<K, V> f;
    int g;
    int h;
    int i;
    private i<K, V>.d j;
    private i<K, V>.e k;

    static class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    static final class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private g<K, V> f2239a;

        /* renamed from: b, reason: collision with root package name */
        private int f2240b;

        /* renamed from: c, reason: collision with root package name */
        private int f2241c;
        private int d;

        b() {
        }

        void a(g<K, V> gVar) {
            gVar.f = null;
            gVar.d = null;
            gVar.e = null;
            gVar.l = 1;
            int r1 = this.f2240b;
            if (r1 > 0) {
                int r2 = this.d;
                if ((r2 & 1) == 0) {
                    this.d = r2 + 1;
                    this.f2240b = r1 - 1;
                    this.f2241c++;
                }
            }
            gVar.d = this.f2239a;
            this.f2239a = gVar;
            int r6 = this.d + 1;
            this.d = r6;
            int r12 = this.f2240b;
            if (r12 > 0 && (r6 & 1) == 0) {
                this.d = r6 + 1;
                this.f2240b = r12 - 1;
                this.f2241c++;
            }
            int r62 = 4;
            while (true) {
                int r22 = r62 - 1;
                if ((this.d & r22) != r22) {
                    return;
                }
                int r13 = this.f2241c;
                if (r13 == 0) {
                    g<K, V> gVar2 = this.f2239a;
                    g<K, V> gVar3 = gVar2.d;
                    g<K, V> gVar4 = gVar3.d;
                    gVar3.d = gVar4.d;
                    this.f2239a = gVar3;
                    gVar3.e = gVar4;
                    gVar3.f = gVar2;
                    gVar3.l = gVar2.l + 1;
                    gVar4.d = gVar3;
                    gVar2.d = gVar3;
                } else {
                    if (r13 == 1) {
                        g<K, V> gVar5 = this.f2239a;
                        g<K, V> gVar6 = gVar5.d;
                        this.f2239a = gVar6;
                        gVar6.f = gVar5;
                        gVar6.l = gVar5.l + 1;
                        gVar5.d = gVar6;
                    } else if (r13 == 2) {
                    }
                    this.f2241c = 0;
                }
                r62 *= 2;
            }
        }

        void b(int r2) {
            this.f2240b = ((Integer.highestOneBit(r2) * 2) - 1) - r2;
            this.d = 0;
            this.f2241c = 0;
            this.f2239a = null;
        }

        g<K, V> c() {
            g<K, V> gVar = this.f2239a;
            if (gVar.d == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    static class c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private g<K, V> f2242a;

        c() {
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f2242a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.d;
            gVar.d = null;
            g<K, V> gVar3 = gVar.f;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f2242a = gVar4;
                    return gVar;
                }
                gVar2.d = gVar4;
                gVar3 = gVar2.e;
            }
        }

        void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.d = gVar2;
                gVar2 = gVar;
                gVar = gVar.e;
            }
            this.f2242a = gVar2;
        }
    }

    final class d extends AbstractSet<Map.Entry<K, V>> {

        class a extends i<K, V>.f<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && i.this.e((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> gVarE;
            if (!(obj instanceof Map.Entry) || (gVarE = i.this.e((Map.Entry) obj)) == null) {
                return false;
            }
            i.this.h(gVarE, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i.this.g;
        }
    }

    final class e extends AbstractSet<K> {

        class a extends i<K, V>.f<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return b().i;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return i.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return i.this.i(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i.this.g;
        }
    }

    private abstract class f<T> implements Iterator<T> {
        g<K, V> d;
        g<K, V> e;
        int f;

        f() {
            i iVar = i.this;
            this.d = iVar.f.g;
            this.e = null;
            this.f = iVar.h;
        }

        final g<K, V> b() {
            g<K, V> gVar = this.d;
            i iVar = i.this;
            if (gVar == iVar.f) {
                throw new NoSuchElementException();
            }
            if (iVar.h != this.f) {
                throw new ConcurrentModificationException();
            }
            this.d = gVar.g;
            this.e = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d != i.this.f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.e;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            i.this.h(gVar, true);
            this.e = null;
            this.f = i.this.h;
        }
    }

    static final class g<K, V> implements Map.Entry<K, V> {
        g<K, V> d;
        g<K, V> e;
        g<K, V> f;
        g<K, V> g;
        g<K, V> h;
        final K i;
        final int j;
        V k;
        int l;

        g() {
            this.i = null;
            this.j = -1;
            this.h = this;
            this.g = this;
        }

        g(g<K, V> gVar, K k, int r3, g<K, V> gVar2, g<K, V> gVar3) {
            this.d = gVar;
            this.i = k;
            this.j = r3;
            this.l = 1;
            this.g = gVar2;
            this.h = gVar3;
            gVar3.g = this;
            gVar2.h = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.e; gVar2 != null; gVar2 = gVar2.e) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f; gVar2 != null; gVar2 = gVar2.f) {
                gVar = gVar2;
            }
            return gVar;
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
            V v = this.k;
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
            return this.k;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.i;
            int r0 = k == null ? 0 : k.hashCode();
            V v = this.k;
            return r0 ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.k;
            this.k = v;
            return v2;
        }

        public String toString() {
            return this.i + "=" + this.k;
        }
    }

    public i() {
        this(l);
    }

    public i(Comparator<? super K> comparator) {
        this.g = 0;
        this.h = 0;
        this.d = comparator == null ? l : comparator;
        this.f = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.e = gVarArr;
        this.i = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    private void a() {
        g<K, V>[] gVarArrB = b(this.e);
        this.e = gVarArrB;
        this.i = (gVarArrB.length / 2) + (gVarArrB.length / 4);
    }

    static <K, V> g<K, V>[] b(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int r6 = 0; r6 < length; r6++) {
            g<K, V> gVar = gVarArr[r6];
            if (gVar != null) {
                cVar.b(gVar);
                int r8 = 0;
                int r9 = 0;
                while (true) {
                    g<K, V> gVarA = cVar.a();
                    if (gVarA == null) {
                        break;
                    }
                    if ((gVarA.j & length) == 0) {
                        r8++;
                    } else {
                        r9++;
                    }
                }
                bVar.b(r8);
                bVar2.b(r9);
                cVar.b(gVar);
                while (true) {
                    g<K, V> gVarA2 = cVar.a();
                    if (gVarA2 == null) {
                        break;
                    }
                    if ((gVarA2.j & length) == 0) {
                        bVar.a(gVarA2);
                    } else {
                        bVar2.a(gVarA2);
                    }
                }
                gVarArr2[r6] = r8 > 0 ? bVar.c() : null;
                gVarArr2[r6 + length] = r9 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    private boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void g(g<K, V> gVar, boolean z) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.e;
            g<K, V> gVar3 = gVar.f;
            int r3 = gVar2 != null ? gVar2.l : 0;
            int r4 = gVar3 != null ? gVar3.l : 0;
            int r5 = r3 - r4;
            if (r5 == -2) {
                g<K, V> gVar4 = gVar3.e;
                g<K, V> gVar5 = gVar3.f;
                int r2 = (gVar4 != null ? gVar4.l : 0) - (gVar5 != null ? gVar5.l : 0);
                if (r2 != -1 && (r2 != 0 || z)) {
                    l(gVar3);
                }
                k(gVar);
                if (z) {
                    return;
                }
            } else if (r5 == 2) {
                g<K, V> gVar6 = gVar2.e;
                g<K, V> gVar7 = gVar2.f;
                int r22 = (gVar6 != null ? gVar6.l : 0) - (gVar7 != null ? gVar7.l : 0);
                if (r22 != 1 && (r22 != 0 || z)) {
                    k(gVar2);
                }
                l(gVar);
                if (z) {
                    return;
                }
            } else if (r5 == 0) {
                gVar.l = r3 + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.l = Math.max(r3, r4) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.d;
        }
    }

    private void j(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.d;
        gVar.d = null;
        if (gVar2 != null) {
            gVar2.d = gVar3;
        }
        if (gVar3 == null) {
            int r3 = gVar.j;
            this.e[r3 & (r0.length - 1)] = gVar2;
        } else if (gVar3.e == gVar) {
            gVar3.e = gVar2;
        } else {
            gVar3.f = gVar2;
        }
    }

    private void k(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.e;
        g<K, V> gVar3 = gVar.f;
        g<K, V> gVar4 = gVar3.e;
        g<K, V> gVar5 = gVar3.f;
        gVar.f = gVar4;
        if (gVar4 != null) {
            gVar4.d = gVar;
        }
        j(gVar, gVar3);
        gVar3.e = gVar;
        gVar.d = gVar3;
        int r0 = Math.max(gVar2 != null ? gVar2.l : 0, gVar4 != null ? gVar4.l : 0) + 1;
        gVar.l = r0;
        gVar3.l = Math.max(r0, gVar5 != null ? gVar5.l : 0) + 1;
    }

    private void l(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.e;
        g<K, V> gVar3 = gVar.f;
        g<K, V> gVar4 = gVar2.e;
        g<K, V> gVar5 = gVar2.f;
        gVar.e = gVar5;
        if (gVar5 != null) {
            gVar5.d = gVar;
        }
        j(gVar, gVar2);
        gVar2.f = gVar;
        gVar.d = gVar2;
        int r1 = Math.max(gVar3 != null ? gVar3.l : 0, gVar5 != null ? gVar5.l : 0) + 1;
        gVar.l = r1;
        gVar2.l = Math.max(r1, gVar4 != null ? gVar4.l : 0) + 1;
    }

    private static int m(int r2) {
        int r22 = r2 ^ ((r2 >>> 20) ^ (r2 >>> 12));
        return (r22 >>> 4) ^ ((r22 >>> 7) ^ r22);
    }

    private Object n() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.e, (Object) null);
        this.g = 0;
        this.h++;
        g<K, V> gVar = this.f;
        g<K, V> gVar2 = gVar.g;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.g;
            gVar2.h = null;
            gVar2.g = null;
            gVar2 = gVar3;
        }
        gVar.h = gVar;
        gVar.g = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    g<K, V> d(K k, boolean z) {
        g<K, V> gVar;
        int r11;
        g<K, V> gVar2;
        Comparator<? super K> comparator = this.d;
        g<K, V>[] gVarArr = this.e;
        int r6 = m(k.hashCode());
        int length = (gVarArr.length - 1) & r6;
        g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            Comparable comparable = comparator == l ? (Comparable) k : null;
            while (true) {
                K k2 = gVar3.i;
                int r7 = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (r7 == 0) {
                    return gVar3;
                }
                g<K, V> gVar4 = r7 < 0 ? gVar3.e : gVar3.f;
                if (gVar4 == null) {
                    gVar = gVar3;
                    r11 = r7;
                    break;
                }
                gVar3 = gVar4;
            }
        } else {
            gVar = gVar3;
            r11 = 0;
        }
        if (!z) {
            return null;
        }
        g<K, V> gVar5 = this.f;
        if (gVar != null) {
            gVar2 = new g<>(gVar, k, r6, gVar5, gVar5.h);
            if (r11 < 0) {
                gVar.e = gVar2;
            } else {
                gVar.f = gVar2;
            }
            g(gVar, true);
        } else {
            if (comparator == l && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            gVar2 = new g<>(gVar, k, r6, gVar5, gVar5.h);
            gVarArr[length] = gVar2;
        }
        int r13 = this.g;
        this.g = r13 + 1;
        if (r13 > this.i) {
            a();
        }
        this.h++;
        return gVar2;
    }

    g<K, V> e(Map.Entry<?, ?> entry) {
        g<K, V> gVarF = f(entry.getKey());
        if (gVarF != null && c(gVarF.k, entry.getValue())) {
            return gVarF;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        i<K, V>.d dVar = this.j;
        if (dVar != null) {
            return dVar;
        }
        i<K, V>.d dVar2 = new d();
        this.j = dVar2;
        return dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    g<K, V> f(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return d(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> gVarF = f(obj);
        if (gVarF != null) {
            return gVarF.k;
        }
        return null;
    }

    void h(g<K, V> gVar, boolean z) {
        int r2;
        if (z) {
            g<K, V> gVar2 = gVar.h;
            gVar2.g = gVar.g;
            gVar.g.h = gVar2;
            gVar.h = null;
            gVar.g = null;
        }
        g<K, V> gVar3 = gVar.e;
        g<K, V> gVar4 = gVar.f;
        g<K, V> gVar5 = gVar.d;
        int r3 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                j(gVar, gVar3);
                gVar.e = null;
            } else if (gVar4 != null) {
                j(gVar, gVar4);
                gVar.f = null;
            } else {
                j(gVar, null);
            }
            g(gVar5, false);
            this.g--;
            this.h++;
            return;
        }
        g<K, V> gVarB = gVar3.l > gVar4.l ? gVar3.b() : gVar4.a();
        h(gVarB, false);
        g<K, V> gVar6 = gVar.e;
        if (gVar6 != null) {
            r2 = gVar6.l;
            gVarB.e = gVar6;
            gVar6.d = gVarB;
            gVar.e = null;
        } else {
            r2 = 0;
        }
        g<K, V> gVar7 = gVar.f;
        if (gVar7 != null) {
            r3 = gVar7.l;
            gVarB.f = gVar7;
            gVar7.d = gVarB;
            gVar.f = null;
        }
        gVarB.l = Math.max(r2, r3) + 1;
        j(gVar, gVarB);
    }

    g<K, V> i(Object obj) {
        g<K, V> gVarF = f(obj);
        if (gVarF != null) {
            h(gVarF, true);
        }
        return gVarF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        i<K, V>.e eVar = this.k;
        if (eVar != null) {
            return eVar;
        }
        i<K, V>.e eVar2 = new e();
        this.k = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> gVarD = d(k, true);
        V v2 = gVarD.k;
        gVarD.k = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> gVarI = i(obj);
        if (gVarI != null) {
            return gVarI.k;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.g;
    }
}
