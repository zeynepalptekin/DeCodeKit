package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class iv1<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] d = new Object[0];

    iv1() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    int c(Object[] objArr, int r5) {
        fw1 fw1Var = (fw1) iterator();
        while (fw1Var.hasNext()) {
            objArr[r5] = fw1Var.next();
            r5++;
        }
        return r5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@NullableDecl Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public abstract fw1<E> iterator();

    @NullableDecl
    Object[] i() {
        return null;
    }

    int j() {
        throw new UnsupportedOperationException();
    }

    int l() {
        throw new UnsupportedOperationException();
    }

    public nv1<E> n() {
        return isEmpty() ? nv1.s() : nv1.x(toArray());
    }

    abstract boolean o();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        bv1.b(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrI = i();
            if (objArrI != null) {
                return (T[]) Arrays.copyOfRange(objArrI, j(), l(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        c(tArr, 0);
        return tArr;
    }
}
