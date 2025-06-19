package c.a.b.b.g.c;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class v3<K, V> extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ r3 d;

    v3(r3 r3Var) {
        this.d = r3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        Map<K, V> mapL = this.d.l();
        if (mapL != null) {
            return mapL.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int r0 = this.d.d(entry.getKey());
            if (r0 != -1 && d3.a(this.d.g[r0], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return this.d.s();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@NullableDecl Object obj) {
        Map<K, V> mapL = this.d.l();
        if (mapL != null) {
            return mapL.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.d.g()) {
            return false;
        }
        int r0 = this.d.v();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = this.d.d;
        r3 r3Var = this.d;
        int r10 = c4.c(key, value, r0, obj2, r3Var.e, r3Var.f, r3Var.g);
        if (r10 == -1) {
            return false;
        }
        this.d.f(r10, r0);
        r3.q(this.d);
        this.d.o();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }
}
