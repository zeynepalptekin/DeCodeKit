package c.a.b.b.g.c;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class s5<E> extends AbstractList<E> implements r7<E> {
    private boolean d = true;

    s5() {
    }

    @Override // c.a.b.b.g.c.r7
    public boolean a() {
        return this.d;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r1, E e) {
        c();
        super.add(r1, e);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        c();
        return super.add(e);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r1, Collection<? extends E> collection) {
        c();
        return super.addAll(r1, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        c();
        return super.addAll(collection);
    }

    @Override // c.a.b.b.g.c.r7
    public final void b() {
        this.d = false;
    }

    protected final void c() {
        if (!this.d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int r3 = 0; r3 < size; r3++) {
            if (!get(r3).equals(list.get(r3))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int r1 = 1;
        for (int r2 = 0; r2 < size; r2++) {
            r1 = (r1 * 31) + get(r2).hashCode();
        }
        return r1;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int r1) {
        c();
        return (E) super.remove(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        c();
        int r2 = indexOf(obj);
        if (r2 == -1) {
            return false;
        }
        remove(r2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int r1, E e) {
        c();
        return (E) super.set(r1, e);
    }
}
