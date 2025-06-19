package c.a.b.b.g.c;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class r9<K, V> implements Iterator<Map.Entry<K, V>> {
    private int d;
    private Iterator<Map.Entry<K, V>> e;
    private final /* synthetic */ p9 f;

    private r9(p9 p9Var) {
        this.f = p9Var;
        this.d = this.f.e.size();
    }

    /* synthetic */ r9(p9 p9Var, o9 o9Var) {
        this(p9Var);
    }

    private final Iterator<Map.Entry<K, V>> b() {
        if (this.e == null) {
            this.e = this.f.i.entrySet().iterator();
        }
        return this.e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r0 = this.d;
        return (r0 > 0 && r0 <= this.f.e.size()) || b().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, V> next;
        if (b().hasNext()) {
            next = b().next();
        } else {
            List list = this.f.e;
            int r1 = this.d - 1;
            this.d = r1;
            next = (Map.Entry<K, V>) list.get(r1);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
