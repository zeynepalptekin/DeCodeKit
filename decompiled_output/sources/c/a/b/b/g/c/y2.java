package c.a.b.b.g.c;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class y2<T> extends c3<T> {
    static final y2<Object> d = new y2<>();

    private y2() {
    }

    @Override // c.a.b.b.g.c.c3
    public final boolean b() {
        return false;
    }

    @Override // c.a.b.b.g.c.c3
    public final T c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
