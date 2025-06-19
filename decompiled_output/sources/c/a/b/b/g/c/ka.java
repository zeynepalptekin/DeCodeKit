package c.a.b.b.g.c;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class ka implements PrivilegedExceptionAction<Unsafe> {
    ka() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Unsafe run() throws Exception {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}
