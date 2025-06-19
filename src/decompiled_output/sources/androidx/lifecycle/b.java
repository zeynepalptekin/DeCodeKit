package androidx.lifecycle;

import androidx.annotation.i0;
import androidx.lifecycle.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class b {

    /* renamed from: c, reason: collision with root package name */
    static b f502c = new b();
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class, a> f503a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class, Boolean> f504b = new HashMap();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map<g.a, List<C0029b>> f505a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map<C0029b, g.a> f506b;

        a(Map<C0029b, g.a> map) {
            this.f506b = map;
            for (Map.Entry<C0029b, g.a> entry : map.entrySet()) {
                g.a value = entry.getValue();
                List<C0029b> arrayList = this.f505a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f505a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        private static void b(List<C0029b> list, j jVar, g.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(jVar, aVar, obj);
                }
            }
        }

        void a(j jVar, g.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            b(this.f505a.get(aVar), jVar, aVar, obj);
            b(this.f505a.get(g.a.ON_ANY), jVar, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    static class C0029b {

        /* renamed from: a, reason: collision with root package name */
        final int f507a;

        /* renamed from: b, reason: collision with root package name */
        final Method f508b;

        C0029b(int r1, Method method) {
            this.f507a = r1;
            this.f508b = method;
            method.setAccessible(true);
        }

        void a(j jVar, g.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                int r0 = this.f507a;
                if (r0 == 0) {
                    this.f508b.invoke(obj, new Object[0]);
                } else if (r0 == 1) {
                    this.f508b.invoke(obj, jVar);
                } else {
                    if (r0 != 2) {
                        return;
                    }
                    this.f508b.invoke(obj, jVar, aVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0029b.class != obj.getClass()) {
                return false;
            }
            C0029b c0029b = (C0029b) obj;
            return this.f507a == c0029b.f507a && this.f508b.getName().equals(c0029b.f508b.getName());
        }

        public int hashCode() {
            return (this.f507a * 31) + this.f508b.getName().hashCode();
        }
    }

    b() {
    }

    private a a(Class cls, @i0 Method[] methodArr) {
        int r8;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f506b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0029b, g.a> entry : c(cls2).f506b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            q qVar = (q) method.getAnnotation(q.class);
            if (qVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    r8 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(j.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    r8 = 1;
                }
                g.a aVarValue = qVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(g.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != g.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    r8 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new C0029b(r8, method), aVarValue, cls);
                z = true;
            }
        }
        a aVar = new a(map);
        this.f503a.put(cls, aVar);
        this.f504b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    private void e(Map<C0029b, g.a> map, C0029b c0029b, g.a aVar, Class cls) {
        g.a aVar2 = map.get(c0029b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0029b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0029b.f508b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class cls) {
        a aVar = this.f503a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = this.f504b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((q) method.getAnnotation(q.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f504b.put(cls, Boolean.FALSE);
        return false;
    }
}
