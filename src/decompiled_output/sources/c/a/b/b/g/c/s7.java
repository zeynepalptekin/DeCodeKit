package c.a.b.b.g.c;

/* loaded from: classes.dex */
public enum s7 {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(y5.class, y5.class, y5.e),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);

    private final Class<?> d;
    private final Class<?> e;
    private final Object f;

    s7(Class cls, Class cls2, Object obj) {
        this.d = cls;
        this.e = cls2;
        this.f = obj;
    }

    public final Class<?> e() {
        return this.e;
    }
}
