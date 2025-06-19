package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class kv1<E> {
    kv1() {
    }

    public kv1<E> a(Iterator<? extends E> it) {
        while (it.hasNext()) {
            b(it.next());
        }
        return this;
    }

    public abstract kv1<E> b(E e);

    public kv1<E> c(Iterable<? extends E> iterable) {
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        return this;
    }
}
