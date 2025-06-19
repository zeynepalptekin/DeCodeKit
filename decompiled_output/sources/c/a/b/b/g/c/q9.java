package c.a.b.b.g.c;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class q9 extends w9 {
    private final /* synthetic */ p9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private q9(p9 p9Var) {
        super(p9Var, null);
        this.e = p9Var;
    }

    /* synthetic */ q9(p9 p9Var, o9 o9Var) {
        this(p9Var);
    }

    @Override // c.a.b.b.g.c.w9, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new r9(this.e, null);
    }
}
