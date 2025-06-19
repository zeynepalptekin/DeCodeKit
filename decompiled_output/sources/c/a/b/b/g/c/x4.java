package c.a.b.b.g.c;

import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class x4<K, V> extends h4<Map.Entry<K, V>> {
    private final /* synthetic */ u4 f;

    x4(u4 u4Var) {
        this.f = u4Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int r3) {
        g3.a(r3, this.f.i);
        int r32 = r3 * 2;
        return new AbstractMap.SimpleImmutableEntry(this.f.g[r32], this.f.g[r32 + 1]);
    }

    @Override // c.a.b.b.g.c.d4
    public final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f.i;
    }
}
