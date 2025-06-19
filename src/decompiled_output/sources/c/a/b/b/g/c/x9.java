package c.a.b.b.g.c;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class x9<K, V> implements Iterator<Map.Entry<K, V>> {
    private int d;
    private boolean e;
    private Iterator<Map.Entry<K, V>> f;
    private final /* synthetic */ p9 g;

    private x9(p9 p9Var) {
        this.g = p9Var;
        this.d = -1;
    }

    /* synthetic */ x9(p9 p9Var, o9 o9Var) {
        this(p9Var);
    }

    private final Iterator<Map.Entry<K, V>> b() {
        if (this.f == null) {
            this.f = this.g.f.entrySet().iterator();
        }
        return this.f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d + 1 < this.g.e.size() || (!this.g.f.isEmpty() && b().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.e = true;
        int r1 = this.d + 1;
        this.d = r1;
        return r1 < this.g.e.size() ? (Map.Entry<K, V>) this.g.e.get(this.d) : b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.e) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.e = false;
        this.g.p();
        if (this.d >= this.g.e.size()) {
            b().remove();
            return;
        }
        p9 p9Var = this.g;
        int r1 = this.d;
        this.d = r1 - 1;
        p9Var.k(r1);
    }
}
