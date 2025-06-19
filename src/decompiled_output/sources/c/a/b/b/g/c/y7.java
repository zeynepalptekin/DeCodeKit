package c.a.b.b.g.c;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class y7 extends s5<String> implements b8, RandomAccess {
    private static final y7 f;
    private static final b8 g;
    private final List<Object> e;

    static {
        y7 y7Var = new y7();
        f = y7Var;
        y7Var.b();
        g = f;
    }

    public y7() {
        this(10);
    }

    public y7(int r2) {
        this((ArrayList<Object>) new ArrayList(r2));
    }

    private y7(ArrayList<Object> arrayList) {
        this.e = arrayList;
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof y5 ? ((y5) obj).y() : l7.i((byte[]) obj);
    }

    @Override // c.a.b.b.g.c.b8
    public final void O(y5 y5Var) {
        c();
        this.e.add(y5Var);
        ((AbstractList) this).modCount++;
    }

    @Override // c.a.b.b.g.c.s5, c.a.b.b.g.c.r7
    public final /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r2, Object obj) {
        c();
        this.e.add(r2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final boolean addAll(int r2, Collection<? extends String> collection) {
        c();
        if (collection instanceof b8) {
            collection = ((b8) collection).d();
        }
        boolean zAddAll = this.e.addAll(r2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.e.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // c.a.b.b.g.c.b8
    public final List<?> d() {
        return Collections.unmodifiableList(this.e);
    }

    @Override // c.a.b.b.g.c.r7
    public final /* synthetic */ r7 e(int r2) {
        if (r2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(r2);
        arrayList.addAll(this.e);
        return new y7((ArrayList<Object>) arrayList);
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // c.a.b.b.g.c.b8
    public final b8 f() {
        return a() ? new ha(this) : this;
    }

    @Override // c.a.b.b.g.c.b8
    public final Object g(int r2) {
        return this.e.get(r2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r3) {
        Object obj = this.e.get(r3);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof y5) {
            y5 y5Var = (y5) obj;
            String strY = y5Var.y();
            if (y5Var.B()) {
                this.e.set(r3, strY);
            }
            return strY;
        }
        byte[] bArr = (byte[]) obj;
        String strI = l7.i(bArr);
        if (l7.h(bArr)) {
            this.e.set(r3, strI);
        }
        return strI;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int r2) {
        c();
        Object objRemove = this.e.remove(r2);
        ((AbstractList) this).modCount++;
        return h(objRemove);
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int r2, Object obj) {
        c();
        return h(this.e.set(r2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e.size();
    }
}
