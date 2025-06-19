package c.a.b.b.g.c;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class k3 {
    public static <T> h3<T> a(h3<T> h3Var) {
        return ((h3Var instanceof m3) || (h3Var instanceof j3)) ? h3Var : h3Var instanceof Serializable ? new j3(h3Var) : new m3(h3Var);
    }

    public static <T> h3<T> b(@NullableDecl T t) {
        return new l3(t);
    }
}
