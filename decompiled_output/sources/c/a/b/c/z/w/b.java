package c.a.b.c.z.w;

import androidx.annotation.m0;

@m0(21)
/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a.b.c.z.w.a f2110a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final c.a.b.c.z.w.a f2111b = new C0149b();

    /* renamed from: c, reason: collision with root package name */
    private static final c.a.b.c.z.w.a f2112c = new c();
    private static final c.a.b.c.z.w.a d = new d();

    static class a implements c.a.b.c.z.w.a {
        a() {
        }

        @Override // c.a.b.c.z.w.a
        public c.a.b.c.z.w.c a(float f, float f2, float f3) {
            return c.a.b.c.z.w.c.a(255, v.m(0, 255, f2, f3, f));
        }
    }

    /* renamed from: c.a.b.c.z.w.b$b, reason: collision with other inner class name */
    static class C0149b implements c.a.b.c.z.w.a {
        C0149b() {
        }

        @Override // c.a.b.c.z.w.a
        public c.a.b.c.z.w.c a(float f, float f2, float f3) {
            return c.a.b.c.z.w.c.b(v.m(255, 0, f2, f3, f), 255);
        }
    }

    static class c implements c.a.b.c.z.w.a {
        c() {
        }

        @Override // c.a.b.c.z.w.a
        public c.a.b.c.z.w.c a(float f, float f2, float f3) {
            return c.a.b.c.z.w.c.b(v.m(255, 0, f2, f3, f), v.m(0, 255, f2, f3, f));
        }
    }

    static class d implements c.a.b.c.z.w.a {
        d() {
        }

        @Override // c.a.b.c.z.w.a
        public c.a.b.c.z.w.c a(float f, float f2, float f3) {
            float f4 = ((f3 - f2) * 0.35f) + f2;
            return c.a.b.c.z.w.c.b(v.m(255, 0, f2, f4, f), v.m(0, 255, f4, f3, f));
        }
    }

    private b() {
    }

    static c.a.b.c.z.w.a a(int r2, boolean z) {
        if (r2 == 0) {
            return z ? f2110a : f2111b;
        }
        if (r2 == 1) {
            return z ? f2111b : f2110a;
        }
        if (r2 == 2) {
            return f2112c;
        }
        if (r2 == 3) {
            return d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + r2);
    }
}
