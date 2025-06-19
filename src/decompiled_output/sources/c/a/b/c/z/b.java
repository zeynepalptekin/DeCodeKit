package c.a.b.c.z;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a.b.c.z.a f2062a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final c.a.b.c.z.a f2063b = new C0148b();

    /* renamed from: c, reason: collision with root package name */
    private static final c.a.b.c.z.a f2064c = new c();
    private static final c.a.b.c.z.a d = new d();

    static class a implements c.a.b.c.z.a {
        a() {
        }

        @Override // c.a.b.c.z.a
        public c.a.b.c.z.c a(float f, float f2, float f3) {
            return c.a.b.c.z.c.a(255, u.m(0, 255, f2, f3, f));
        }
    }

    /* renamed from: c.a.b.c.z.b$b, reason: collision with other inner class name */
    static class C0148b implements c.a.b.c.z.a {
        C0148b() {
        }

        @Override // c.a.b.c.z.a
        public c.a.b.c.z.c a(float f, float f2, float f3) {
            return c.a.b.c.z.c.b(u.m(255, 0, f2, f3, f), 255);
        }
    }

    static class c implements c.a.b.c.z.a {
        c() {
        }

        @Override // c.a.b.c.z.a
        public c.a.b.c.z.c a(float f, float f2, float f3) {
            return c.a.b.c.z.c.b(u.m(255, 0, f2, f3, f), u.m(0, 255, f2, f3, f));
        }
    }

    static class d implements c.a.b.c.z.a {
        d() {
        }

        @Override // c.a.b.c.z.a
        public c.a.b.c.z.c a(float f, float f2, float f3) {
            float f4 = ((f3 - f2) * 0.35f) + f2;
            return c.a.b.c.z.c.b(u.m(255, 0, f2, f4, f), u.m(0, 255, f4, f3, f));
        }
    }

    private b() {
    }

    static c.a.b.c.z.a a(int r2, boolean z) {
        if (r2 == 0) {
            return z ? f2062a : f2063b;
        }
        if (r2 == 1) {
            return z ? f2063b : f2062a;
        }
        if (r2 == 2) {
            return f2064c;
        }
        if (r2 == 3) {
            return d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + r2);
    }
}
