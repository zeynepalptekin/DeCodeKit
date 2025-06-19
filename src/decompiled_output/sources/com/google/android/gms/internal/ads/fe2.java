package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class fe2<E> extends AbstractList<E> {
    private static final he2 f = he2.b(fe2.class);
    List<E> d;
    Iterator<E> e;

    public fe2(List<E> list, Iterator<E> it) {
        this.d = list;
        this.e = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r3) {
        if (this.d.size() > r3) {
            return this.d.get(r3);
        }
        if (!this.e.hasNext()) {
            throw new NoSuchElementException();
        }
        this.d.add(this.e.next());
        return get(r3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new ee2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        f.a("potentially expensive size() call");
        f.a("blowup running");
        while (this.e.hasNext()) {
            this.d.add(this.e.next());
        }
        return this.d.size();
    }
}
