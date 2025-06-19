package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zg2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, AtomicReference<T>> f6260a = new HashMap();

    public final AtomicReference<T> a(String str) {
        synchronized (this) {
            if (!this.f6260a.containsKey(str)) {
                this.f6260a.put(str, new AtomicReference<>());
            }
        }
        return this.f6260a.get(str);
    }
}
