package c.a.b.b.g.c;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class a4<K, V> extends n3<K, V> {

    @NullableDecl
    private final K d;
    private int e;
    private final /* synthetic */ r3 f;

    a4(r3 r3Var, int r2) {
        this.f = r3Var;
        this.d = (K) r3Var.f[r2];
        this.e = r2;
    }

    private final void a() {
        int r0 = this.e;
        if (r0 == -1 || r0 >= this.f.size() || !d3.a(this.d, this.f.f[this.e])) {
            this.e = this.f.d(this.d);
        }
    }

    @Override // c.a.b.b.g.c.n3, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.d;
    }

    @Override // c.a.b.b.g.c.n3, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        Map<K, V> mapL = this.f.l();
        if (mapL != null) {
            return mapL.get(this.d);
        }
        a();
        int r0 = this.e;
        if (r0 == -1) {
            return null;
        }
        return (V) this.f.g[r0];
    }

    @Override // c.a.b.b.g.c.n3, java.util.Map.Entry
    public final V setValue(V v) {
        Map<K, V> mapL = this.f.l();
        if (mapL != null) {
            return mapL.put(this.d, v);
        }
        a();
        int r0 = this.e;
        if (r0 == -1) {
            this.f.put(this.d, v);
            return null;
        }
        Object[] objArr = this.f.g;
        V v2 = (V) objArr[r0];
        objArr[r0] = v;
        return v2;
    }
}
