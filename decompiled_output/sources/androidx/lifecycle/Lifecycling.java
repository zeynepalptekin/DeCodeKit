package androidx.lifecycle;

import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.lifecycle.g;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class Lifecycling {

    /* renamed from: a, reason: collision with root package name */
    private static final int f488a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f489b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Class, Integer> f490c = new HashMap();
    private static Map<Class, List<Constructor<? extends e>>> d = new HashMap();

    private Lifecycling() {
    }

    private static e a(Constructor<? extends e> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @i0
    private static Constructor<? extends e> b(Class<?> cls) throws NoSuchMethodException, SecurityException {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String strC = c(canonicalName);
            if (!name.isEmpty()) {
                strC = name + "." + strC;
            }
            Constructor declaredConstructor = Class.forName(strC).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    @h0
    @Deprecated
    static f d(Object obj) {
        final h hVarG = g(obj);
        return new f() { // from class: androidx.lifecycle.Lifecycling.1
            @Override // androidx.lifecycle.h
            public void d(@h0 j jVar, @h0 g.a aVar) {
                hVarG.d(jVar, aVar);
            }
        };
    }

    private static int e(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Integer num = f490c.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int r0 = h(cls);
        f490c.put(cls, Integer.valueOf(r0));
        return r0;
    }

    private static boolean f(Class<?> cls) {
        return cls != null && i.class.isAssignableFrom(cls);
    }

    @h0
    static h g(Object obj) {
        boolean z = obj instanceof h;
        boolean z2 = obj instanceof d;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((d) obj, (h) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((d) obj, null);
        }
        if (z) {
            return (h) obj;
        }
        Class<?> cls = obj.getClass();
        if (e(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends e>> list = d.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
        }
        e[] eVarArr = new e[list.size()];
        for (int r2 = 0; r2 < list.size(); r2++) {
            eVarArr[r2] = a(list.get(r2), obj);
        }
        return new CompositeGeneratedAdaptersObserver(eVarArr);
    }

    private static int h(Class<?> cls) throws NoSuchMethodException, SecurityException {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends e> constructorB = b(cls);
        if (constructorB != null) {
            d.put(cls, Collections.singletonList(constructorB));
            return 2;
        }
        if (b.f502c.d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (f(superclass)) {
            if (e(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(d.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (f(cls2)) {
                if (e(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(d.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        d.put(cls, arrayList);
        return 2;
    }
}
