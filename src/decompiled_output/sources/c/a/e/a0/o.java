package c.a.e.a0;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public abstract class o {

    static class a extends o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f2245a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f2246b;

        a(Method method, Object obj) {
            this.f2245a = method;
            this.f2246b = obj;
        }

        @Override // c.a.e.a0.o
        public <T> T c(Class<T> cls) throws Exception {
            o.a(cls);
            return (T) this.f2245a.invoke(this.f2246b, cls);
        }
    }

    static class b extends o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f2247a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2248b;

        b(Method method, int r2) {
            this.f2247a = method;
            this.f2248b = r2;
        }

        @Override // c.a.e.a0.o
        public <T> T c(Class<T> cls) throws Exception {
            o.a(cls);
            return (T) this.f2247a.invoke(null, cls, Integer.valueOf(this.f2248b));
        }
    }

    static class c extends o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f2249a;

        c(Method method) {
            this.f2249a = method;
        }

        @Override // c.a.e.a0.o
        public <T> T c(Class<T> cls) throws Exception {
            o.a(cls);
            return (T) this.f2249a.invoke(null, cls, Object.class);
        }
    }

    static class d extends o {
        d() {
        }

        @Override // c.a.e.a0.o
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public static o b() throws NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int r1 = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, r1);
                } catch (Exception unused2) {
                    return new d();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        }
    }

    public abstract <T> T c(Class<T> cls) throws Exception;
}
