package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class nv1<E> extends iv1<E> implements List<E>, RandomAccess {
    private static final iw1<Object> e = new pv1(xv1.h, 0);

    nv1() {
    }

    public static <E> nv1<E> r(E e2) {
        Object[] objArr = {e2};
        for (int r4 = 0; r4 <= 0; r4++) {
            uv1.a(objArr[0], 0);
        }
        return v(objArr, 1);
    }

    public static <E> nv1<E> s() {
        return (nv1<E>) xv1.h;
    }

    public static <E> nv1<E> t(Collection<? extends E> collection) {
        if (collection instanceof iv1) {
            nv1<E> nv1VarN = ((iv1) collection).n();
            if (!nv1VarN.o()) {
                return nv1VarN;
            }
            Object[] array = nv1VarN.toArray();
            return v(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int r1 = 0; r1 < length; r1++) {
            uv1.a(array2[r1], r1);
        }
        return v(array2, array2.length);
    }

    public static <E> nv1<E> u(E[] eArr) {
        if (eArr.length == 0) {
            return (nv1<E>) xv1.h;
        }
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        for (int r1 = 0; r1 < length; r1++) {
            uv1.a(objArr[r1], r1);
        }
        return v(objArr, objArr.length);
    }

    static <E> nv1<E> v(Object[] objArr, int r2) {
        return r2 == 0 ? (nv1<E>) xv1.h : new xv1(objArr, r2);
    }

    static <E> nv1<E> x(Object[] objArr) {
        return v(objArr, objArr.length);
    }

    public static <E> nv1<E> y(Iterable<? extends E> iterable) {
        bv1.b(iterable);
        if (iterable instanceof Collection) {
            return t((Collection) iterable);
        }
        Iterator<? extends E> it = iterable.iterator();
        if (!it.hasNext()) {
            return (nv1<E>) xv1.h;
        }
        E next = it.next();
        if (!it.hasNext()) {
            return r(next);
        }
        mv1 mv1Var = (mv1) ((mv1) new mv1().b(next)).a(it);
        mv1Var.f4313c = true;
        return v(mv1Var.f4311a, mv1Var.f4312b);
    }

    @Override // java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public nv1<E> subList(int r2, int r3) {
        bv1.f(r2, r3, size());
        int r32 = r3 - r2;
        return r32 == size() ? this : r32 == 0 ? (nv1<E>) xv1.h : new ov1(this, r2, r32);
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

    @Override // com.google.android.gms.internal.ads.iv1
    int c(Object[] objArr, int r6) {
        int size = size();
        for (int r1 = 0; r1 < size; r1++) {
            objArr[r6 + r1] = get(r1);
        }
        return r6 + size;
    }

    @Override // com.google.android.gms.internal.ads.iv1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
        if (obj == bv1.b(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int r3 = 0; r3 < size; r3++) {
                        if (uu1.a(get(r3), list.get(r3))) {
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
                        if (!uu1.a(e2, it.next())) {
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

    @Override // com.google.android.gms.internal.ads.iv1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h */
    public final fw1<E> iterator() {
        return (iw1) listIterator();
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
        return (iw1) listIterator(0);
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int r2) {
        bv1.h(r2, size());
        return isEmpty() ? e : new pv1(this, r2);
    }

    @Override // com.google.android.gms.internal.ads.iv1
    public final nv1<E> n() {
        return this;
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
