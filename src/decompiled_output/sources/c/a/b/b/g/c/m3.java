package c.a.b.b.g.c;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class m3<T> implements h3<T> {
    private volatile h3<T> d;
    private volatile boolean e;

    @NullableDecl
    private T f;

    m3(h3<T> h3Var) {
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
                    this.d = null;
                    return tA;
                }
            }
        }
        return this.f;
    }

    public final String toString() {
        Object string = this.d;
        if (string == null) {
            String strValueOf = String.valueOf(this.f);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
