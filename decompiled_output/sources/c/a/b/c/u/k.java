package c.a.b.c.u;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.h0;
import com.google.android.material.internal.z;

/* loaded from: classes.dex */
public class k {
    private k() {
    }

    @h0
    static e a(int r1) {
        return r1 != 0 ? r1 != 1 ? b() : new f() : new n();
    }

    @h0
    static e b() {
        return new n();
    }

    @h0
    static g c() {
        return new g();
    }

    public static void d(@h0 View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof j) {
            ((j) background).m0(f);
        }
    }

    public static void e(@h0 View view) {
        Drawable background = view.getBackground();
        if (background instanceof j) {
            f(view, (j) background);
        }
    }

    public static void f(@h0 View view, @h0 j jVar) {
        if (jVar.a0()) {
            jVar.r0(z.h(view));
        }
    }
}
