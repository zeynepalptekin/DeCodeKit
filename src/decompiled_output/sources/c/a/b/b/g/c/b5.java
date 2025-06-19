package c.a.b.b.g.c;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class b5 {
    static int a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int r1 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            r1 = ~(~(r1 + (next != null ? next.hashCode() : 0)));
        }
        return r1;
    }

    static boolean b(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
