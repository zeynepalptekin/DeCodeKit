package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class r5 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f1805a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f1806b;

    static {
        f1806b = a("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean b() {
        return (f1805a == null || f1806b) ? false : true;
    }

    static Class<?> c() {
        return f1805a;
    }
}
