package c.a.b.b.g.c;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public class k4<K, V> extends p3<K, V> implements Serializable {
    private final transient i4<K, ? extends d4<V>> e;
    private final transient int f;

    k4(i4<K, ? extends d4<V>> i4Var, int r2) {
        this.e = i4Var;
        this.f = r2;
    }

    @Override // c.a.b.b.g.c.q3, c.a.b.b.g.c.q4
    public final /* synthetic */ Map a() {
        return this.e;
    }

    @Override // c.a.b.b.g.c.q3
    public final boolean b(@NullableDecl Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // c.a.b.b.g.c.q3
    final Map<K, Collection<V>> c() {
        throw new AssertionError("should never be called");
    }

    @Override // c.a.b.b.g.c.q3
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // c.a.b.b.g.c.q3
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // c.a.b.b.g.c.q3
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
