package c.a.b.b.g.c;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class m4<E> extends d4<E> implements Set<E> {

    @NullableDecl
    private transient h4<E> e;

    m4() {
    }

    static int r(int r6) {
        int r62 = Math.max(r6, 2);
        if (r62 >= 751619276) {
            g3.f(r62 < 1073741824, "collection too large");
            return 1073741824;
        }
        int r0 = Integer.highestOneBit(r62 - 1) << 1;
        while (r0 * 0.7d < r62) {
            r0 <<= 1;
        }
        return r0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof m4) && s() && ((m4) obj).s() && hashCode() != obj.hashCode()) {
            return false;
        }
        return b5.b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return b5.a(this);
    }

    @Override // c.a.b.b.g.c.d4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // c.a.b.b.g.c.d4
    public h4<E> n() {
        h4<E> h4Var = this.e;
        if (h4Var != null) {
            return h4Var;
        }
        h4<E> h4VarT = t();
        this.e = h4VarT;
        return h4VarT;
    }

    boolean s() {
        return false;
    }

    h4<E> t() {
        return h4.t(toArray());
    }
}
