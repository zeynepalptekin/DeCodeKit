package c.a.b.b.g.c;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class d3 extends b3 {
    public static boolean a(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
