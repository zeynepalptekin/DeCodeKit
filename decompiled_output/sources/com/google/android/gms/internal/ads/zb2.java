package com.google.android.gms.internal.ads;

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
class zb2<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int d;
    private List<ec2> e;
    private Map<K, V> f;
    private boolean g;
    private volatile gc2 h;
    private Map<K, V> i;
    private volatile ac2 j;

    private zb2(int r1) {
        this.d = r1;
        this.e = Collections.emptyList();
        this.f = Collections.emptyMap();
        this.i = Collections.emptyMap();
    }

    /* synthetic */ zb2(int r1, yb2 yb2Var) {
        this(r1);
    }

    private final int b(K k) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        if (this.g) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> l() {
        k();
        if (this.f.isEmpty() && !(this.f instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f = treeMap;
            this.i = treeMap.descendingMap();
        }
        return (SortedMap) this.f;
    }

    static <FieldDescriptorType extends g92<FieldDescriptorType>> zb2<FieldDescriptorType, Object> o(int r1) {
        return new yb2(r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V q(int r5) {
        k();
        V v = (V) this.e.remove(r5).getValue();
        if (!this.f.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = l().entrySet().iterator();
            this.e.add(new ec2(this, it.next()));
            it.remove();
        }
        return v;
    }

    public final boolean a() {
        return this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        k();
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
        return b(comparable) >= 0 || this.f.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        k();
        int r0 = b(k);
        if (r0 >= 0) {
            return (V) this.e.get(r0).setValue(v);
        }
        k();
        if (this.e.isEmpty() && !(this.e instanceof ArrayList)) {
            this.e = new ArrayList(this.d);
        }
        int r02 = -(r0 + 1);
        if (r02 >= this.d) {
            return l().put(k, v);
        }
        int size = this.e.size();
        int r2 = this.d;
        if (size == r2) {
            ec2 ec2VarRemove = this.e.remove(r2 - 1);
            l().put((Comparable) ec2VarRemove.getKey(), ec2VarRemove.getValue());
        }
        this.e.add(r02, new ec2(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.h == null) {
            this.h = new gc2(this, null);
        }
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb2)) {
            return super.equals(obj);
        }
        zb2 zb2Var = (zb2) obj;
        int size = size();
        if (size != zb2Var.size()) {
            return false;
        }
        int r2 = h();
        if (r2 != zb2Var.h()) {
            return entrySet().equals(zb2Var.entrySet());
        }
        for (int r4 = 0; r4 < r2; r4++) {
            if (!p(r4).equals(zb2Var.p(r4))) {
                return false;
            }
        }
        if (r2 != size) {
            return this.f.equals(zb2Var.f);
        }
        return true;
    }

    public void g() {
        if (this.g) {
            return;
        }
        this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
        this.i = this.i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.i);
        this.g = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int r0 = b(comparable);
        return r0 >= 0 ? (V) this.e.get(r0).getValue() : this.f.get(comparable);
    }

    public final int h() {
        return this.e.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int r0 = h();
        int r2 = 0;
        for (int r1 = 0; r1 < r0; r1++) {
            r2 += this.e.get(r1).hashCode();
        }
        return this.f.size() > 0 ? r2 + this.f.hashCode() : r2;
    }

    public final Iterable<Map.Entry<K, V>> i() {
        return this.f.isEmpty() ? dc2.a() : this.f.entrySet();
    }

    final Set<Map.Entry<K, V>> j() {
        if (this.j == null) {
            this.j = new ac2(this, null);
        }
        return this.j;
    }

    public final Map.Entry<K, V> p(int r2) {
        return this.e.get(r2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        k();
        Comparable comparable = (Comparable) obj;
        int r0 = b(comparable);
        if (r0 >= 0) {
            return q(r0);
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
