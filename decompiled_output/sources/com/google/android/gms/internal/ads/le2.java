package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class le2<K, V, V2> {

    /* renamed from: a, reason: collision with root package name */
    final LinkedHashMap<K, ze2<V>> f4249a;

    le2(int r1) {
        this.f4249a = ke2.c(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    le2<K, V, V2> a(K k, ze2<V> ze2Var) {
        this.f4249a.put(we2.b(k, "key"), we2.b(ze2Var, "provider"));
        return this;
    }
}
