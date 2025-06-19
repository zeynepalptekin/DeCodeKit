package b.i.o;

import android.os.Build;
import androidx.annotation.i0;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public class e {
    private e() {
    }

    public static boolean a(@i0 Object obj, @i0 Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.equals(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(@i0 Object... objArr) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.hash(objArr) : Arrays.hashCode(objArr);
    }

    public static int c(@i0 Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }
}
