package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class y6 {

    /* renamed from: a, reason: collision with root package name */
    private static final w6<?> f1869a = new v6();

    /* renamed from: b, reason: collision with root package name */
    private static final w6<?> f1870b = c();

    static w6<?> a() {
        return f1869a;
    }

    static w6<?> b() {
        w6<?> w6Var = f1870b;
        if (w6Var != null) {
            return w6Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static w6<?> c() {
        try {
            return (w6) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
