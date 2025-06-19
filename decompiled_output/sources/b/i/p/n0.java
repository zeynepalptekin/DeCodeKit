package b.i.p;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1224a = 8;

    /* renamed from: b, reason: collision with root package name */
    public static final int f1225b = 9;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1226c = 10;

    private n0() {
    }

    @androidx.annotation.h0
    public static <T extends View> T a(@androidx.annotation.h0 Window window, @androidx.annotation.w int r3) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) window.requireViewById(r3);
        }
        T t = (T) window.findViewById(r3);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }
}
