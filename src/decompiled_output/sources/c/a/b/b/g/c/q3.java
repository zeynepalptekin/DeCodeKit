package c.a.b.b.g.c;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
abstract class q3<K, V> implements q4<K, V> {

    @NullableDecl
    private transient Map<K, Collection<V>> d;

    q3() {
    }

    @Override // c.a.b.b.g.c.q4
    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapC = c();
        this.d = mapC;
        return mapC;
    }

    public boolean b(@NullableDecl Object obj) {
        Iterator<Collection<V>> it = a().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map<K, Collection<V>> c();

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q4) {
            return a().equals(((q4) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
