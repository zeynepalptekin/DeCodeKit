package b.b.a.c;

import androidx.annotation.h0;
import androidx.annotation.p0;
import b.b.a.c.b;
import java.util.HashMap;
import java.util.Map;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {
    private HashMap<K, b.c<K, V>> h = new HashMap<>();

    public boolean contains(K k) {
        return this.h.containsKey(k);
    }

    @Override // b.b.a.c.b
    protected b.c<K, V> i(K k) {
        return this.h.get(k);
    }

    @Override // b.b.a.c.b
    public V o(@h0 K k, @h0 V v) {
        b.c<K, V> cVarI = i(k);
        if (cVarI != null) {
            return cVarI.e;
        }
        this.h.put(k, n(k, v));
        return null;
    }

    @Override // b.b.a.c.b
    public V r(@h0 K k) {
        V v = (V) super.r(k);
        this.h.remove(k);
        return v;
    }

    public Map.Entry<K, V> s(K k) {
        if (contains(k)) {
            return this.h.get(k).g;
        }
        return null;
    }
}
