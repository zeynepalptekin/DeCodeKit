package c.a.b.b.g.c;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class e4 {
    static int a(int r4) {
        return (int) (Integer.rotateLeft((int) (r4 * (-862048943)), 15) * 461845907);
    }

    static int b(@NullableDecl Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
