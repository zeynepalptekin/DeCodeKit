package c.a.b.b.g.c;

import java.util.Map;

/* loaded from: classes.dex */
final class x7<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, v7> d;

    private x7(Map.Entry<K, v7> entry) {
        this.d = entry;
    }

    public final v7 a() {
        return this.d.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.d.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.d.getValue() == null) {
            return null;
        }
        return v7.e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof r8) {
            return this.d.getValue().a((r8) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
