package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class b9 {

    /* renamed from: a, reason: collision with root package name */
    private static final z8 f1662a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final z8 f1663b = new c9();

    static z8 a() {
        return f1662a;
    }

    static z8 b() {
        return f1663b;
    }

    private static z8 c() {
        try {
            return (z8) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
