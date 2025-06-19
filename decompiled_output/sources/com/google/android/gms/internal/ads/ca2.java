package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class ca2<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> d;

    public ca2(Iterator<Map.Entry<K, Object>> it) {
        this.d = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.d.next();
        return next.getValue() instanceof ba2 ? new da2(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.d.remove();
    }
}
