package c.a.e.a0;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static final Type[] f2208a = new Type[0];

    private static final class a implements GenericArrayType, Serializable {
        private static final long e = 0;
        private final Type d;

        public a(Type type) {
            this.d = b.b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && b.f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.d;
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            return b.u(this.d) + "[]";
        }
    }

    /* renamed from: c.a.e.a0.b$b, reason: collision with other inner class name */
    private static final class C0151b implements ParameterizedType, Serializable {
        private static final long g = 0;
        private final Type d;
        private final Type e;
        private final Type[] f;

        public C0151b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                c.a.e.a0.a.a(z);
            }
            this.d = type == null ? null : b.b(type);
            this.e = b.b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f = typeArr2;
            int length = typeArr2.length;
            for (int r1 = 0; r1 < length; r1++) {
                c.a.e.a0.a.b(this.f[r1]);
                b.c(this.f[r1]);
                Type[] typeArr3 = this.f;
                typeArr3[r1] = b.b(typeArr3[r1]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && b.f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.d;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.e;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f) ^ this.e.hashCode()) ^ b.m(this.d);
        }

        public String toString() {
            int length = this.f.length;
            if (length == 0) {
                return b.u(this.e);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(b.u(this.e));
            sb.append("<");
            sb.append(b.u(this.f[0]));
            for (int r2 = 1; r2 < length; r2++) {
                sb.append(", ");
                sb.append(b.u(this.f[r2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    private static final class c implements WildcardType, Serializable {
        private static final long f = 0;
        private final Type d;
        private final Type e;

        public c(Type[] typeArr, Type[] typeArr2) {
            c.a.e.a0.a.a(typeArr2.length <= 1);
            c.a.e.a0.a.a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                c.a.e.a0.a.b(typeArr[0]);
                b.c(typeArr[0]);
                this.e = null;
                this.d = b.b(typeArr[0]);
                return;
            }
            c.a.e.a0.a.b(typeArr2[0]);
            b.c(typeArr2[0]);
            c.a.e.a0.a.a(typeArr[0] == Object.class);
            this.e = b.b(typeArr2[0]);
            this.d = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && b.f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.e;
            return type != null ? new Type[]{type} : b.f2208a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.d};
        }

        public int hashCode() {
            Type type = this.e;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.d.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.e != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.e;
            } else {
                if (this.d == Object.class) {
                    return "?";
                }
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.d;
            }
            sb.append(b.u(type));
            return sb.toString();
        }
    }

    private b() {
        throw new UnsupportedOperationException();
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(b(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0151b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static void c(Type type) {
        c.a.e.a0.a.a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    private static Class<?> d(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type h(Type type, Class<?> cls) {
        Type typeL = l(type, cls, Collection.class);
        if (typeL instanceof WildcardType) {
            typeL = ((WildcardType) typeL).getUpperBounds()[0];
        }
        return typeL instanceof ParameterizedType ? ((ParameterizedType) typeL).getActualTypeArguments()[0] : Object.class;
    }

    static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int r0 = 0; r0 < length; r0++) {
                if (interfaces[r0] == cls2) {
                    return cls.getGenericInterfaces()[r0];
                }
                if (cls2.isAssignableFrom(interfaces[r0])) {
                    return i(cls.getGenericInterfaces()[r0], interfaces[r0], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type[] j(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeL = l(type, cls, Map.class);
        return typeL instanceof ParameterizedType ? ((ParameterizedType) typeL).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class<?> k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            c.a.e.a0.a.a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return k(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    static Type l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        c.a.e.a0.a.a(cls2.isAssignableFrom(cls));
        return p(type, cls, i(type, cls, cls2));
    }

    static int m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static int n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int r1 = 0; r1 < length; r1++) {
            if (obj.equals(objArr[r1])) {
                return r1;
            }
        }
        throw new NoSuchElementException();
    }

    public static ParameterizedType o(Type type, Type type2, Type... typeArr) {
        return new C0151b(type, type2, typeArr);
    }

    public static Type p(Type type, Class<?> cls, Type type2) {
        return q(type, cls, type2, new HashSet());
    }

    private static Type q(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = r(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeQ = q(type, cls, componentType, collection);
                return componentType == typeQ ? cls2 : a(typeQ);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeQ2 = q(type, cls, genericComponentType, collection);
            return genericComponentType == typeQ2 ? genericArrayType : a(typeQ2);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeQ3 = q(type, cls, ownerType, collection);
            boolean z = typeQ3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int r2 = 0; r2 < length; r2++) {
                Type typeQ4 = q(type, cls, actualTypeArguments[r2], collection);
                if (typeQ4 != actualTypeArguments[r2]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[r2] = typeQ4;
                }
            }
            return z ? o(typeQ3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type2 instanceof WildcardType;
        Type type3 = type2;
        if (z2) {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeQ5 = q(type, cls, lowerBounds[0], collection);
                type3 = wildcardType;
                if (typeQ5 != lowerBounds[0]) {
                    return t(typeQ5);
                }
            } else {
                type3 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeQ6 = q(type, cls, upperBounds[0], collection);
                    type3 = wildcardType;
                    if (typeQ6 != upperBounds[0]) {
                        return s(typeQ6);
                    }
                }
            }
        }
        return type3;
    }

    static Type r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsD = d(typeVariable);
        if (clsD == null) {
            return typeVariable;
        }
        Type typeI = i(type, cls, clsD);
        if (!(typeI instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeI).getActualTypeArguments()[n(clsD.getTypeParameters(), typeVariable)];
    }

    public static WildcardType s(Type type) {
        return new c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f2208a);
    }

    public static WildcardType t(Type type) {
        return new c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static String u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
