package c.a.b.b.g.c;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class h4<E> extends d4<E> implements List<E>, RandomAccess {
    private static final c5<Object> e = new g4(s4.h, 0);

    h4() {
    }

    public static <E> h4<E> s(E e2) {
        Object[] objArr = {e2};
        for (int r4 = 0; r4 <= 0; r4++) {
            t4.a(objArr[0], 0);
        }
        return u(objArr, 1);
    }

    static <E> h4<E> t(Object[] objArr) {
        return u(objArr, objArr.length);
    }

    static <E> h4<E> u(Object[] objArr, int r2) {
        return r2 == 0 ? (h4<E>) s4.h : new s4(objArr, r2);
    }

    public static <E> h4<E> v() {
        return (h4<E>) s4.h;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int r1, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int r1, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // c.a.b.b.g.c.d4
    int c(Object[] objArr, int r6) {
        int size = size();
        for (int r1 = 0; r1 < size; r1++) {
            objArr[r6 + r1] = get(r1);
        }
        return r6 + size;
    }

    @Override // c.a.b.b.g.c.d4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
        if (obj == g3.b(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int r3 = 0; r3 < size; r3++) {
                        if (d3.a(get(r3), list.get(r3))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int r32 = 0;
                while (true) {
                    if (r32 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e2 = get(r32);
                        r32++;
                        if (!d3.a(e2, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // c.a.b.b.g.c.d4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final d5<E> iterator() {
        return (c5) listIterator();
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int r1 = 1;
        for (int r2 = 0; r2 < size; r2++) {
            r1 = ~(~((r1 * 31) + get(r2).hashCode()));
        }
        return r1;
    }

    @Override // java.util.List
    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        int r2 = 0;
        if (obj == null) {
            while (r2 < size) {
                if (get(r2) == null) {
                    return r2;
                }
                r2++;
            }
        } else {
            while (r2 < size) {
                if (obj.equals(get(r2))) {
                    return r2;
                }
                r2++;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (c5) listIterator(0);
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int r2) {
        g3.g(r2, size());
        return isEmpty() ? e : new g4(this, r2);
    }

    @Override // c.a.b.b.g.c.d4
    public final h4<E> n() {
        return this;
    }

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public h4<E> subList(int r2, int r3) {
        g3.e(r2, r3, size());
        int r32 = r3 - r2;
        return r32 == size() ? this : r32 == 0 ? (h4<E>) s4.h : new j4(this, r2, r32);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int r1, E e2) {
        throw new UnsupportedOperationException();
    }
}
