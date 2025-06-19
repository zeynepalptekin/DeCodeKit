package c.a.b.b.g.c;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
class p9<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int d;
    private List<u9> e;
    private Map<K, V> f;
    private boolean g;
    private volatile w9 h;
    private Map<K, V> i;
    private volatile q9 j;

    private p9(int r1) {
        this.d = r1;
        this.e = Collections.emptyList();
        this.f = Collections.emptyMap();
        this.i = Collections.emptyMap();
    }

    /* synthetic */ p9(int r1, o9 o9Var) {
        this(r1);
    }

    private final int a(K k) {
        int size = this.e.size() - 1;
        if (size >= 0) {
            int r1 = k.compareTo((Comparable) this.e.get(size).getKey());
            if (r1 > 0) {
                return -(size + 2);
            }
            if (r1 == 0) {
                return size;
            }
        }
        int r12 = 0;
        while (r12 <= size) {
            int r2 = (r12 + size) / 2;
            int r3 = k.compareTo((Comparable) this.e.get(r2).getKey());
            if (r3 < 0) {
                size = r2 - 1;
            } else {
                if (r3 <= 0) {
                    return r2;
                }
                r12 = r2 + 1;
            }
        }
        return -(r12 + 1);
    }

    static <FieldDescriptorType extends z6<FieldDescriptorType>> p9<FieldDescriptorType, Object> b(int r1) {
        return new o9(r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V k(int r5) {
        p();
        V v = (V) this.e.remove(r5).getValue();
        if (!this.f.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = q().entrySet().iterator();
            this.e.add(new u9(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        if (this.g) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> q() {
        p();
        if (this.f.isEmpty() && !(this.f instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f = treeMap;
            this.i = treeMap.descendingMap();
        }
        return (SortedMap) this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        p();
        if (!this.e.isEmpty()) {
            this.e.clear();
        }
        if (this.f.isEmpty()) {
            return;
        }
        this.f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        p();
        int r0 = a(k);
        if (r0 >= 0) {
            return (V) this.e.get(r0).setValue(v);
        }
        p();
        if (this.e.isEmpty() && !(this.e instanceof ArrayList)) {
            this.e = new ArrayList(this.d);
        }
        int r02 = -(r0 + 1);
        if (r02 >= this.d) {
            return q().put(k, v);
        }
        int size = this.e.size();
        int r2 = this.d;
        if (size == r2) {
            u9 u9VarRemove = this.e.remove(r2 - 1);
            q().put((Comparable) u9VarRemove.getKey(), u9VarRemove.getValue());
        }
        this.e.add(r02, new u9(this, k, v));
        return null;
    }

    public void e() {
        if (this.g) {
            return;
        }
        this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
        this.i = this.i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.i);
        this.g = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.h == null) {
            this.h = new w9(this, null);
        }
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9)) {
            return super.equals(obj);
        }
        p9 p9Var = (p9) obj;
        int size = size();
        if (size != p9Var.size()) {
            return false;
        }
        int r2 = j();
        if (r2 != p9Var.j()) {
            return entrySet().equals(p9Var.entrySet());
        }
        for (int r4 = 0; r4 < r2; r4++) {
            if (!h(r4).equals(p9Var.h(r4))) {
                return false;
            }
        }
        if (r2 != size) {
            return this.f.equals(p9Var.f);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int r0 = a(comparable);
        return r0 >= 0 ? (V) this.e.get(r0).getValue() : this.f.get(comparable);
    }

    public final Map.Entry<K, V> h(int r2) {
        return this.e.get(r2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int r0 = j();
        int r2 = 0;
        for (int r1 = 0; r1 < r0; r1++) {
            r2 += this.e.get(r1).hashCode();
        }
        return this.f.size() > 0 ? r2 + this.f.hashCode() : r2;
    }

    public final boolean i() {
        return this.g;
    }

    public final int j() {
        return this.e.size();
    }

    public final Iterable<Map.Entry<K, V>> m() {
        return this.f.isEmpty() ? t9.a() : this.f.entrySet();
    }

    final Set<Map.Entry<K, V>> o() {
        if (this.j == null) {
            this.j = new q9(this, null);
        }
        return this.j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int r0 = a(comparable);
        if (r0 >= 0) {
            return k(r0);
        }
        if (this.f.isEmpty()) {
            return null;
        }
        return this.f.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.e.size() + this.f.size();
    }
}
