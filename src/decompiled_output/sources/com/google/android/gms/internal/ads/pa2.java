package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class pa2<K, V> {
    static <K, V> int a(sa2<K, V> sa2Var, K k, V v) {
        return e92.e(sa2Var.f5237a, 1, k) + e92.e(sa2Var.f5239c, 2, v);
    }

    static <K, V> void b(v82 v82Var, sa2<K, V> sa2Var, K k, V v) throws IOException {
        e92.g(v82Var, sa2Var.f5237a, 1, k);
        e92.g(v82Var, sa2Var.f5239c, 2, v);
    }
}
