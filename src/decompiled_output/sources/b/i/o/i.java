package b.i.o;

import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.z;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.Locale;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class i {
    private i() {
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, @h0 Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int c(int r5, int r6, int r7, @h0 String str) {
        if (r5 < r6) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(r6), Integer.valueOf(r7)));
        }
        if (r5 <= r7) {
            return r5;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(r6), Integer.valueOf(r7)));
    }

    @z(from = FabTransformationScrimBehavior.j)
    public static int d(int r0) {
        if (r0 >= 0) {
            return r0;
        }
        throw new IllegalArgumentException();
    }

    @z(from = FabTransformationScrimBehavior.j)
    public static int e(int r0, @i0 String str) {
        if (r0 >= 0) {
            return r0;
        }
        throw new IllegalArgumentException(str);
    }

    @h0
    public static <T> T f(@i0 T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    @h0
    public static <T> T g(@i0 T t, @h0 Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void h(boolean z) {
        i(z, null);
    }

    public static void i(boolean z, @i0 String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
