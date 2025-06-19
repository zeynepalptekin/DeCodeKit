package c.a.b.b.g.c;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class w7<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> d;

    public w7(Iterator<Map.Entry<K, Object>> it) {
        this.d = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.d.next();
        return next.getValue() instanceof v7 ? new x7(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.d.remove();
    }
}
