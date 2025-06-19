package c.a.e.a0;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f2243a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f2244b;

    static {
        HashMap map = new HashMap(16);
        HashMap map2 = new HashMap(16);
        a(map, map2, Boolean.TYPE, Boolean.class);
        a(map, map2, Byte.TYPE, Byte.class);
        a(map, map2, Character.TYPE, Character.class);
        a(map, map2, Double.TYPE, Double.class);
        a(map, map2, Float.TYPE, Float.class);
        a(map, map2, Integer.TYPE, Integer.class);
        a(map, map2, Long.TYPE, Long.class);
        a(map, map2, Short.TYPE, Short.class);
        a(map, map2, Void.TYPE, Void.class);
        f2243a = Collections.unmodifiableMap(map);
        f2244b = Collections.unmodifiableMap(map2);
    }

    private m() {
        throw new UnsupportedOperationException();
    }

    private static void a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    public static boolean b(Type type) {
        return f2243a.containsKey(type);
    }

    public static boolean c(Type type) {
        return f2244b.containsKey(a.b(type));
    }

    public static <T> Class<T> d(Class<T> cls) {
        Class<T> cls2 = (Class) f2244b.get(a.b(cls));
        return cls2 == null ? cls : cls2;
    }

    public static <T> Class<T> e(Class<T> cls) {
        Class<T> cls2 = (Class) f2243a.get(a.b(cls));
        return cls2 == null ? cls : cls2;
    }
}
