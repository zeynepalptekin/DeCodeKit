package c.a.b.b.g.c;

import c.a.b.b.g.c.h7;

/* loaded from: classes.dex */
final class f7 implements s8 {

    /* renamed from: a, reason: collision with root package name */
    private static final f7 f1685a = new f7();

    private f7() {
    }

    public static f7 c() {
        return f1685a;
    }

    @Override // c.a.b.b.g.c.s8
    public final boolean a(Class<?> cls) {
        return h7.class.isAssignableFrom(cls);
    }

    @Override // c.a.b.b.g.c.s8
    public final p8 b(Class<?> cls) {
        if (!h7.class.isAssignableFrom(cls)) {
            String strValueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported message type: ".concat(strValueOf) : new String("Unsupported message type: "));
        }
        try {
            return (p8) h7.o(cls.asSubclass(h7.class)).r(h7.f.f1712c, null, null);
        } catch (Exception e) {
            String strValueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(strValueOf2.length() != 0 ? "Unable to get message info for ".concat(strValueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
