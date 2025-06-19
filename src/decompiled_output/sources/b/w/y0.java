package b.w;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class y0 {

    /* renamed from: a, reason: collision with root package name */
    private static final e1 f1521a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f1522b = "ViewUtils";

    /* renamed from: c, reason: collision with root package name */
    static final Property<View, Float> f1523c;
    static final Property<View, Rect> d;

    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(y0.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            y0.h(view, f.floatValue());
        }
    }

    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return b.i.p.f0.N(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            b.i.p.f0.F1(view, rect);
        }
    }

    static {
        int r0 = Build.VERSION.SDK_INT;
        f1521a = r0 >= 29 ? new d1() : r0 >= 23 ? new c1() : r0 >= 22 ? new b1() : r0 >= 21 ? new a1() : r0 >= 19 ? new z0() : new e1();
        f1523c = new a(Float.class, "translationAlpha");
        d = new b(Rect.class, "clipBounds");
    }

    private y0() {
    }

    static void a(@androidx.annotation.h0 View view) {
        f1521a.a(view);
    }

    static x0 b(@androidx.annotation.h0 View view) {
        return Build.VERSION.SDK_INT >= 18 ? new w0(view) : v0.e(view);
    }

    static float c(@androidx.annotation.h0 View view) {
        return f1521a.c(view);
    }

    static j1 d(@androidx.annotation.h0 View view) {
        return Build.VERSION.SDK_INT >= 18 ? new i1(view) : new h1(view.getWindowToken());
    }

    static void e(@androidx.annotation.h0 View view) {
        f1521a.d(view);
    }

    static void f(@androidx.annotation.h0 View view, @androidx.annotation.i0 Matrix matrix) {
        f1521a.e(view, matrix);
    }

    static void g(@androidx.annotation.h0 View view, int r7, int r8, int r9, int r10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f1521a.f(view, r7, r8, r9, r10);
    }

    static void h(@androidx.annotation.h0 View view, float f) {
        f1521a.g(view, f);
    }

    static void i(@androidx.annotation.h0 View view, int r2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        f1521a.h(view, r2);
    }

    static void j(@androidx.annotation.h0 View view, @androidx.annotation.h0 Matrix matrix) {
        f1521a.i(view, matrix);
    }

    static void k(@androidx.annotation.h0 View view, @androidx.annotation.h0 Matrix matrix) {
        f1521a.j(view, matrix);
    }
}
