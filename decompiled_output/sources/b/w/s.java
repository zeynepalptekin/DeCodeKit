package b.w;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class s {
    private s() {
    }

    @androidx.annotation.i0
    static o a(@androidx.annotation.h0 View view, @androidx.annotation.h0 ViewGroup viewGroup, @androidx.annotation.i0 Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? q.b(view, viewGroup, matrix) : r.b(view, viewGroup, matrix);
    }

    static void b(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT == 28) {
            q.f(view);
        } else {
            r.f(view);
        }
    }
}
