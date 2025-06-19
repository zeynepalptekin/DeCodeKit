package c.a.e.a0;

/* loaded from: classes.dex */
public final class a {
    private a() {
        throw new UnsupportedOperationException();
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }
}
