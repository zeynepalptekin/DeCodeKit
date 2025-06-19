package b.i.p;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.WindowInsets;
import androidx.annotation.p0;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public class o0 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f1231b = "WindowInsetsCompat";

    /* renamed from: c, reason: collision with root package name */
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static final o0 f1232c = new a().a().a().b().c();

    /* renamed from: a, reason: collision with root package name */
    private final i f1233a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final d f1234a;

        public a() {
            int r0 = Build.VERSION.SDK_INT;
            this.f1234a = r0 >= 29 ? new c() : r0 >= 20 ? new b() : new d();
        }

        public a(@androidx.annotation.h0 o0 o0Var) {
            int r0 = Build.VERSION.SDK_INT;
            this.f1234a = r0 >= 29 ? new c(o0Var) : r0 >= 20 ? new b(o0Var) : new d(o0Var);
        }

        @androidx.annotation.h0
        public o0 a() {
            return this.f1234a.a();
        }

        @androidx.annotation.h0
        public a b(@androidx.annotation.i0 b.i.p.d dVar) {
            this.f1234a.b(dVar);
            return this;
        }

        @androidx.annotation.h0
        public a c(@androidx.annotation.h0 b.i.e.f fVar) {
            this.f1234a.c(fVar);
            return this;
        }

        @androidx.annotation.h0
        public a d(@androidx.annotation.h0 b.i.e.f fVar) {
            this.f1234a.d(fVar);
            return this;
        }

        @androidx.annotation.h0
        public a e(@androidx.annotation.h0 b.i.e.f fVar) {
            this.f1234a.e(fVar);
            return this;
        }

        @androidx.annotation.h0
        public a f(@androidx.annotation.h0 b.i.e.f fVar) {
            this.f1234a.f(fVar);
            return this;
        }

        @androidx.annotation.h0
        public a g(@androidx.annotation.h0 b.i.e.f fVar) {
            this.f1234a.g(fVar);
            return this;
        }
    }

    @androidx.annotation.m0(api = 20)
    private static class b extends d {

        /* renamed from: c, reason: collision with root package name */
        private static Field f1235c = null;
        private static boolean d = false;
        private static Constructor<WindowInsets> e = null;
        private static boolean f = false;

        /* renamed from: b, reason: collision with root package name */
        private WindowInsets f1236b;

        b() {
            this.f1236b = h();
        }

        b(@androidx.annotation.h0 o0 o0Var) {
            this.f1236b = o0Var.B();
        }

        @androidx.annotation.i0
        private static WindowInsets h() {
            if (!d) {
                try {
                    f1235c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i(o0.f1231b, "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                d = true;
            }
            Field field = f1235c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i(o0.f1231b, "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f) {
                try {
                    e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i(o0.f1231b, "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f = true;
            }
            Constructor<WindowInsets> constructor = e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i(o0.f1231b, "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // b.i.p.o0.d
        @androidx.annotation.h0
        o0 a() {
            return o0.C(this.f1236b);
        }

        @Override // b.i.p.o0.d
        void f(@androidx.annotation.h0 b.i.e.f fVar) {
            WindowInsets windowInsets = this.f1236b;
            if (windowInsets != null) {
                this.f1236b = windowInsets.replaceSystemWindowInsets(fVar.f1014a, fVar.f1015b, fVar.f1016c, fVar.d);
            }
        }
    }

    @androidx.annotation.m0(api = 29)
    private static class c extends d {

        /* renamed from: b, reason: collision with root package name */
        final WindowInsets.Builder f1237b;

        c() {
            this.f1237b = new WindowInsets.Builder();
        }

        c(@androidx.annotation.h0 o0 o0Var) {
            WindowInsets windowInsetsB = o0Var.B();
            this.f1237b = windowInsetsB != null ? new WindowInsets.Builder(windowInsetsB) : new WindowInsets.Builder();
        }

        @Override // b.i.p.o0.d
        @androidx.annotation.h0
        o0 a() {
            return o0.C(this.f1237b.build());
        }

        @Override // b.i.p.o0.d
        void b(@androidx.annotation.i0 b.i.p.d dVar) {
            this.f1237b.setDisplayCutout(dVar != null ? dVar.f() : null);
        }

        @Override // b.i.p.o0.d
        void c(@androidx.annotation.h0 b.i.e.f fVar) {
            this.f1237b.setMandatorySystemGestureInsets(fVar.d());
        }

        @Override // b.i.p.o0.d
        void d(@androidx.annotation.h0 b.i.e.f fVar) {
            this.f1237b.setStableInsets(fVar.d());
        }

        @Override // b.i.p.o0.d
        void e(@androidx.annotation.h0 b.i.e.f fVar) {
            this.f1237b.setSystemGestureInsets(fVar.d());
        }

        @Override // b.i.p.o0.d
        void f(@androidx.annotation.h0 b.i.e.f fVar) {
            this.f1237b.setSystemWindowInsets(fVar.d());
        }

        @Override // b.i.p.o0.d
        void g(@androidx.annotation.h0 b.i.e.f fVar) {
            this.f1237b.setTappableElementInsets(fVar.d());
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private final o0 f1238a;

        d() {
            this(new o0((o0) null));
        }

        d(@androidx.annotation.h0 o0 o0Var) {
            this.f1238a = o0Var;
        }

        @androidx.annotation.h0
        o0 a() {
            return this.f1238a;
        }

        void b(@androidx.annotation.i0 b.i.p.d dVar) {
        }

        void c(@androidx.annotation.h0 b.i.e.f fVar) {
        }

        void d(@androidx.annotation.h0 b.i.e.f fVar) {
        }

        void e(@androidx.annotation.h0 b.i.e.f fVar) {
        }

        void f(@androidx.annotation.h0 b.i.e.f fVar) {
        }

        void g(@androidx.annotation.h0 b.i.e.f fVar) {
        }
    }

    @androidx.annotation.m0(20)
    private static class e extends i {

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.h0
        final WindowInsets f1239b;

        /* renamed from: c, reason: collision with root package name */
        private b.i.e.f f1240c;

        e(@androidx.annotation.h0 o0 o0Var, @androidx.annotation.h0 WindowInsets windowInsets) {
            super(o0Var);
            this.f1240c = null;
            this.f1239b = windowInsets;
        }

        e(@androidx.annotation.h0 o0 o0Var, @androidx.annotation.h0 e eVar) {
            this(o0Var, new WindowInsets(eVar.f1239b));
        }

        @Override // b.i.p.o0.i
        @androidx.annotation.h0
        final b.i.e.f h() {
            if (this.f1240c == null) {
                this.f1240c = b.i.e.f.a(this.f1239b.getSystemWindowInsetLeft(), this.f1239b.getSystemWindowInsetTop(), this.f1239b.getSystemWindowInsetRight(), this.f1239b.getSystemWindowInsetBottom());
            }
            return this.f1240c;
        }

        @Override // b.i.p.o0.i
        @androidx.annotation.h0
        o0 j(int r3, int r4, int r5, int r6) {
            a aVar = new a(o0.C(this.f1239b));
            aVar.f(o0.w(h(), r3, r4, r5, r6));
            aVar.d(o0.w(f(), r3, r4, r5, r6));
            return aVar.a();
        }

        @Override // b.i.p.o0.i
        boolean l() {
            return this.f1239b.isRound();
        }
    }

    @androidx.annotation.m0(21)
    private static class f extends e {
        private b.i.e.f d;

        f(@androidx.annotation.h0 o0 o0Var, @androidx.annotation.h0 WindowInsets windowInsets) {
            super(o0Var, windowInsets);
            this.d = null;
        }

        f(@androidx.annotation.h0 o0 o0Var, @androidx.annotation.h0 f fVar) {
            super(o0Var, fVar);
            this.d = null;
        }

        @Override // b.i.p.o0.i
        @androidx.annotation.h0
        o0 b() {
            return o0.C(this.f1239b.consumeStableInsets());
        }

        @Override // b.i.p.o0.i
        @androidx.annotation.h0
        o0 c() {
            return o0.C(this.f1239b.consumeSystemWindowInsets());
        }

        @Override // b.i.p.o0.i
        @androidx.annotation.h0
        final b.i.e.f f() {
            if (this.d == null) {
                this.d = b.i.e.f.a(this.f1239b.getStableInsetLeft(), this.f1239b.getStableInsetTop(), this.f1239b.getStableInsetRight(), this.f1239b.getStableInsetBottom());
            }
            return this.d;
        }

        @Override // b.i.p.o0.i
        boolean k() {
            return this.f1239b.isConsumed();
        }
    }

    @androidx.annotation.m0(28)
    private static class g extends f {
        g(@androidx.annotation.h0 o0 o0Var, @androidx.annotation.h0 WindowInsets windowInsets) {
            super(o0Var, windowInsets);
        }

        g(@androidx.annotation.h0 o0 o0Var, @androidx.annotation.h0 g gVar) {
            super(o0Var, gVar);
        }

        @Override // b.i.p.o0.i
        @androidx.annotation.h0
        o0 a() {
            return o0.C(this.f1239b.consumeDisplayCutout());
        }

        @Override // b.i.p.o0.i
        @androidx.annotation.i0
        b.i.p.d d() {
            return b.i.p.d.g(this.f1239b.getDisplayCutout());
        }

        @Override // b.i.p.o0.i
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                return Objects.equals(this.f1239b, ((g) obj).f1239b);
            }
            return false;
        }

        @Override // b.i.p.o0.i
        public int hashCode() {
            return this.f1239b.hashCode();
        }
    }

    @androidx.annotation.m0(29)
    private static class h extends g {
        private b.i.e.f e;
        private b.i.e.f f;
        private b.i.e.f g;

        h(@androidx.annotation.h0 o0 o0Var, @androidx.annotation.h0 WindowInsets windowInsets) {
            super(o0Var, windowInsets);
            this.e = null;
            this.f = null;
            this.g = null;
        }

        h(@androidx.annotation.h0 o0 o0Var, @androidx.annotation.h0 h hVar) {
            super(o0Var, hVar);
            this.e = null;
            this.f = null;
            this.g = null;
        }

        @Override // b.i.p.o0.i
        @androidx.annotation.h0
        b.i.e.f e() {
            if (this.f == null) {
                this.f = b.i.e.f.c(this.f1239b.getMandatorySystemGestureInsets());
            }
            return this.f;
        }

        @Override // b.i.p.o0.i
        @androidx.annotation.h0
        b.i.e.f g() {
            if (this.e == null) {
                this.e = b.i.e.f.c(this.f1239b.getSystemGestureInsets());
            }
            return this.e;
        }

        @Override // b.i.p.o0.i
        @androidx.annotation.h0
        b.i.e.f i() {
            if (this.g == null) {
                this.g = b.i.e.f.c(this.f1239b.getTappableElementInsets());
            }
            return this.g;
        }

        @Override // b.i.p.o0.e, b.i.p.o0.i
        @androidx.annotation.h0
        o0 j(int r2, int r3, int r4, int r5) {
            return o0.C(this.f1239b.inset(r2, r3, r4, r5));
        }
    }

    private static class i {

        /* renamed from: a, reason: collision with root package name */
        final o0 f1241a;

        i(@androidx.annotation.h0 o0 o0Var) {
            this.f1241a = o0Var;
        }

        @androidx.annotation.h0
        o0 a() {
            return this.f1241a;
        }

        @androidx.annotation.h0
        o0 b() {
            return this.f1241a;
        }

        @androidx.annotation.h0
        o0 c() {
            return this.f1241a;
        }

        @androidx.annotation.i0
        b.i.p.d d() {
            return null;
        }

        @androidx.annotation.h0
        b.i.e.f e() {
            return h();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return l() == iVar.l() && k() == iVar.k() && b.i.o.e.a(h(), iVar.h()) && b.i.o.e.a(f(), iVar.f()) && b.i.o.e.a(d(), iVar.d());
        }

        @androidx.annotation.h0
        b.i.e.f f() {
            return b.i.e.f.e;
        }

        @androidx.annotation.h0
        b.i.e.f g() {
            return h();
        }

        @androidx.annotation.h0
        b.i.e.f h() {
            return b.i.e.f.e;
        }

        public int hashCode() {
            return b.i.o.e.b(Boolean.valueOf(l()), Boolean.valueOf(k()), h(), f(), d());
        }

        @androidx.annotation.h0
        b.i.e.f i() {
            return h();
        }

        @androidx.annotation.h0
        o0 j(int r1, int r2, int r3, int r4) {
            return o0.f1232c;
        }

        boolean k() {
            return false;
        }

        boolean l() {
            return false;
        }
    }

    @androidx.annotation.m0(20)
    private o0(@androidx.annotation.h0 WindowInsets windowInsets) {
        i eVar;
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 29) {
            eVar = new h(this, windowInsets);
        } else if (r0 >= 28) {
            eVar = new g(this, windowInsets);
        } else if (r0 >= 21) {
            eVar = new f(this, windowInsets);
        } else {
            if (r0 < 20) {
                this.f1233a = new i(this);
                return;
            }
            eVar = new e(this, windowInsets);
        }
        this.f1233a = eVar;
    }

    public o0(@androidx.annotation.i0 o0 o0Var) {
        i iVar;
        i eVar;
        if (o0Var != null) {
            i iVar2 = o0Var.f1233a;
            if (Build.VERSION.SDK_INT >= 29 && (iVar2 instanceof h)) {
                eVar = new h(this, (h) iVar2);
            } else if (Build.VERSION.SDK_INT >= 28 && (iVar2 instanceof g)) {
                eVar = new g(this, (g) iVar2);
            } else if (Build.VERSION.SDK_INT >= 21 && (iVar2 instanceof f)) {
                eVar = new f(this, (f) iVar2);
            } else if (Build.VERSION.SDK_INT < 20 || !(iVar2 instanceof e)) {
                iVar = new i(this);
            } else {
                eVar = new e(this, (e) iVar2);
            }
            this.f1233a = eVar;
            return;
        }
        iVar = new i(this);
        this.f1233a = iVar;
    }

    @androidx.annotation.m0(20)
    @androidx.annotation.h0
    public static o0 C(@androidx.annotation.h0 WindowInsets windowInsets) {
        return new o0((WindowInsets) b.i.o.i.f(windowInsets));
    }

    static b.i.e.f w(b.i.e.f fVar, int r6, int r7, int r8, int r9) {
        int r0 = Math.max(0, fVar.f1014a - r6);
        int r2 = Math.max(0, fVar.f1015b - r7);
        int r3 = Math.max(0, fVar.f1016c - r8);
        int r1 = Math.max(0, fVar.d - r9);
        return (r0 == r6 && r2 == r7 && r3 == r8 && r1 == r9) ? fVar : b.i.e.f.a(r0, r2, r3, r1);
    }

    @androidx.annotation.h0
    @Deprecated
    public o0 A(@androidx.annotation.h0 Rect rect) {
        return new a(this).f(b.i.e.f.b(rect)).a();
    }

    @androidx.annotation.i0
    @androidx.annotation.m0(20)
    public WindowInsets B() {
        i iVar = this.f1233a;
        if (iVar instanceof e) {
            return ((e) iVar).f1239b;
        }
        return null;
    }

    @androidx.annotation.h0
    public o0 a() {
        return this.f1233a.a();
    }

    @androidx.annotation.h0
    public o0 b() {
        return this.f1233a.b();
    }

    @androidx.annotation.h0
    public o0 c() {
        return this.f1233a.c();
    }

    @androidx.annotation.i0
    public b.i.p.d d() {
        return this.f1233a.d();
    }

    @androidx.annotation.h0
    public b.i.e.f e() {
        return this.f1233a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            return b.i.o.e.a(this.f1233a, ((o0) obj).f1233a);
        }
        return false;
    }

    public int f() {
        return j().d;
    }

    public int g() {
        return j().f1014a;
    }

    public int h() {
        return j().f1016c;
    }

    public int hashCode() {
        i iVar = this.f1233a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public int i() {
        return j().f1015b;
    }

    @androidx.annotation.h0
    public b.i.e.f j() {
        return this.f1233a.f();
    }

    @androidx.annotation.h0
    public b.i.e.f k() {
        return this.f1233a.g();
    }

    public int l() {
        return p().d;
    }

    public int m() {
        return p().f1014a;
    }

    public int n() {
        return p().f1016c;
    }

    public int o() {
        return p().f1015b;
    }

    @androidx.annotation.h0
    public b.i.e.f p() {
        return this.f1233a.h();
    }

    @androidx.annotation.h0
    public b.i.e.f q() {
        return this.f1233a.i();
    }

    public boolean r() {
        return (!t() && !s() && d() == null && k().equals(b.i.e.f.e) && e().equals(b.i.e.f.e) && q().equals(b.i.e.f.e)) ? false : true;
    }

    public boolean s() {
        return !j().equals(b.i.e.f.e);
    }

    public boolean t() {
        return !p().equals(b.i.e.f.e);
    }

    @androidx.annotation.h0
    public o0 u(@androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r2, @androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r3, @androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r4, @androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r5) {
        return this.f1233a.j(r2, r3, r4, r5);
    }

    @androidx.annotation.h0
    public o0 v(@androidx.annotation.h0 b.i.e.f fVar) {
        return u(fVar.f1014a, fVar.f1015b, fVar.f1016c, fVar.d);
    }

    public boolean x() {
        return this.f1233a.k();
    }

    public boolean y() {
        return this.f1233a.l();
    }

    @androidx.annotation.h0
    @Deprecated
    public o0 z(int r2, int r3, int r4, int r5) {
        return new a(this).f(b.i.e.f.a(r2, r3, r4, r5)).a();
    }
}
