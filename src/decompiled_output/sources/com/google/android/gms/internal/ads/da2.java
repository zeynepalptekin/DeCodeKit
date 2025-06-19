package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class da2<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, ba2> d;

    private da2(Map.Entry<K, ba2> entry) {
        this.d = entry;
    }

    public final ba2 a() {
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
        return ba2.e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof xa2) {
            return this.d.getValue().d((xa2) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
