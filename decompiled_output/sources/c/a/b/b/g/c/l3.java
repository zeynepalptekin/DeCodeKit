package c.a.b.b.g.c;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class l3<T> implements h3<T>, Serializable {

    @NullableDecl
    private final T d;

    l3(@NullableDecl T t) {
        this.d = t;
    }

    @Override // c.a.b.b.g.c.h3
    public final T a() {
        return this.d;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof l3) {
            return d3.a(this.d, ((l3) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
