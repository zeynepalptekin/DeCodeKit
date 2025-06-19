package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
abstract class ie2<K, V, V2> implements pe2<Map<K, V2>> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<K, ze2<V>> f3812a;

    ie2(Map<K, ze2<V>> map) {
        this.f3812a = Collections.unmodifiableMap(map);
    }

    final Map<K, ze2<V>> a() {
        return this.f3812a;
    }
}
