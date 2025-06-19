package c.a.e.b0;

import c.a.e.a0.b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    final Class<? super T> f2297a;

    /* renamed from: b, reason: collision with root package name */
    final Type f2298b;

    /* renamed from: c, reason: collision with root package name */
    final int f2299c;

    protected a() {
        Type typeG = g(getClass());
        this.f2298b = typeG;
        this.f2297a = (Class<? super T>) b.k(typeG);
        this.f2299c = this.f2298b.hashCode();
    }

    a(Type type) {
        Type typeB = b.b((Type) c.a.e.a0.a.b(type));
        this.f2298b = typeB;
        this.f2297a = (Class<? super T>) b.k(typeB);
        this.f2299c = this.f2298b.hashCode();
    }

    private static AssertionError a(Type type, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> cls : clsArr) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    public static <T> a<T> b(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> c(Type type) {
        return new a<>(type);
    }

    public static a<?> d(Type type) {
        return new a<>(b.a(type));
    }

    public static a<?> e(Type type, Type... typeArr) {
        return new a<>(b.o(null, type, typeArr));
    }

    static Type g(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static boolean l(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType) type).getGenericComponentType();
        } else if (type instanceof Class) {
            type = (Class) type;
            while (type.isArray()) {
                type = type.getComponentType();
            }
        }
        return m(type, (ParameterizedType) genericComponentType, new HashMap());
    }

    private static boolean m(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> clsK = b.k(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = clsK.getTypeParameters();
            for (int r5 = 0; r5 < actualTypeArguments.length; r5++) {
                Type type2 = actualTypeArguments[r5];
                TypeVariable<Class<?>> typeVariable = typeParameters[r5];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (o(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : clsK.getGenericInterfaces()) {
            if (m(type3, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return m(clsK.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    private static boolean n(Type type, Type type2, Map<String, Type> map) {
        return type2.equals(type) || ((type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName())));
    }

    private static boolean o(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int r0 = 0; r0 < actualTypeArguments.length; r0++) {
            if (!n(actualTypeArguments[r0], actualTypeArguments2[r0], map)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f2298b, ((a) obj).f2298b);
    }

    public final Class<? super T> f() {
        return this.f2297a;
    }

    public final Type h() {
        return this.f2298b;
    }

    public final int hashCode() {
        return this.f2299c;
    }

    @Deprecated
    public boolean i(a<?> aVar) {
        return k(aVar.h());
    }

    @Deprecated
    public boolean j(Class<?> cls) {
        return k(cls);
    }

    @Deprecated
    public boolean k(Type type) {
        if (type == null) {
            return false;
        }
        if (this.f2298b.equals(type)) {
            return true;
        }
        Type type2 = this.f2298b;
        if (type2 instanceof Class) {
            return this.f2297a.isAssignableFrom(b.k(type));
        }
        if (type2 instanceof ParameterizedType) {
            return m(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            return this.f2297a.isAssignableFrom(b.k(type)) && l(type, (GenericArrayType) this.f2298b);
        }
        throw a(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    public final String toString() {
        return b.u(this.f2298b);
    }
}
