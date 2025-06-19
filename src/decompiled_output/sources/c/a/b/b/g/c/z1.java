package c.a.b.b.g.c;

import android.os.Binder;

/* loaded from: classes.dex */
public final /* synthetic */ class z1 {
    public static <V> V a(c2<V> c2Var) {
        try {
            return c2Var.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return c2Var.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
