package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class q8 {

    /* renamed from: a, reason: collision with root package name */
    private static final o8 f1798a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final o8 f1799b = new n8();

    static o8 a() {
        return f1798a;
    }

    static o8 b() {
        return f1799b;
    }

    private static o8 c() {
        try {
            return (o8) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
