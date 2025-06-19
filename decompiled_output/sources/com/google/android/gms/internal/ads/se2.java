package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class se2<K, V> extends ie2<K, V, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final ze2<Map<Object, Object>> f5252b = oe2.a(Collections.emptyMap());

    private se2(Map<K, ze2<V>> map) {
        super(map);
    }

    public static <K, V> ue2<K, V> b(int r2) {
        return new ue2<>(r2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        LinkedHashMap linkedHashMapC = ke2.c(a().size());
        for (Map.Entry<K, ze2<V>> entry : a().entrySet()) {
            linkedHashMapC.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(linkedHashMapC);
    }
}
