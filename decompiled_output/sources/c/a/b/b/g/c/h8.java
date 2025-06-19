package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class h8 implements n9 {

    /* renamed from: b, reason: collision with root package name */
    private static final s8 f1713b = new g8();

    /* renamed from: a, reason: collision with root package name */
    private final s8 f1714a;

    public h8() {
        this(new k8(f7.c(), b()));
    }

    private h8(s8 s8Var) {
        this.f1714a = (s8) l7.f(s8Var, "messageInfoFactory");
    }

    private static s8 b() {
        try {
            return (s8) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f1713b;
        }
    }

    private static boolean c(p8 p8Var) {
        return p8Var.a() == g9.f1697a;
    }

    @Override // c.a.b.b.g.c.n9
    public final <T> j9<T> a(Class<T> cls) {
        m9.p(cls);
        p8 p8VarB = this.f1714a.b(cls);
        if (p8VarB.b()) {
            return h7.class.isAssignableFrom(cls) ? x8.k(m9.B(), y6.a(), p8VarB.c()) : x8.k(m9.f(), y6.b(), p8VarB.c());
        }
        if (!h7.class.isAssignableFrom(cls)) {
            boolean zC = c(p8VarB);
            z8 z8VarA = b9.a();
            a8 a8VarA = a8.a();
            return zC ? v8.r(cls, p8VarB, z8VarA, a8VarA, m9.f(), y6.b(), q8.a()) : v8.r(cls, p8VarB, z8VarA, a8VarA, m9.v(), null, q8.a());
        }
        boolean zC2 = c(p8VarB);
        z8 z8VarB = b9.b();
        a8 a8VarD = a8.d();
        ca<?, ?> caVarB = m9.B();
        return zC2 ? v8.r(cls, p8VarB, z8VarB, a8VarD, caVarB, y6.a(), q8.b()) : v8.r(cls, p8VarB, z8VarB, a8VarD, caVarB, null, q8.b());
    }
}
