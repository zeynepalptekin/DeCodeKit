package c.a.b.b.g.c;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class j3<T> implements h3<T>, Serializable {
    private final h3<T> d;
    private volatile transient boolean e;

    @NullableDecl
    private transient T f;

    j3(h3<T> h3Var) {
        this.d = (h3) g3.b(h3Var);
    }

    @Override // c.a.b.b.g.c.h3
    public final T a() {
        if (!this.e) {
            synchronized (this) {
                if (!this.e) {
                    T tA = this.d.a();
                    this.f = tA;
                    this.e = true;
                    return tA;
                }
            }
        }
        return this.f;
    }

    public final String toString() {
        Object string;
        if (this.e) {
            String strValueOf = String.valueOf(this.f);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.d;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
