package c.a.b.b.g.c;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class f3<T> extends c3<T> {
    private final T d;

    f3(T t) {
        this.d = t;
    }

    @Override // c.a.b.b.g.c.c3
    public final boolean b() {
        return true;
    }

    @Override // c.a.b.b.g.c.c3
    public final T c() {
        return this.d;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof f3) {
            return this.d.equals(((f3) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
