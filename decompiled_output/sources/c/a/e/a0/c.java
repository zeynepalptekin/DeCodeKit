package c.a.e.a0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Type, c.a.e.h<?>> f2209a;

    /* renamed from: b, reason: collision with root package name */
    private final c.a.e.a0.q.b f2210b = c.a.e.a0.q.b.a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements c.a.e.a0.k<T> {
        a() {
        }

        @Override // c.a.e.a0.k
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> implements c.a.e.a0.k<T> {
        b() {
        }

        @Override // c.a.e.a0.k
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: c.a.e.a0.c$c, reason: collision with other inner class name */
    class C0152c<T> implements c.a.e.a0.k<T> {
        C0152c() {
        }

        @Override // c.a.e.a0.k
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class d<T> implements c.a.e.a0.k<T> {
        d() {
        }

        @Override // c.a.e.a0.k
        public T a() {
            return (T) new c.a.e.a0.j();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class e<T> implements c.a.e.a0.k<T> {

        /* renamed from: a, reason: collision with root package name */
        private final o f2215a = o.b();

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f2216b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Type f2217c;

        e(Class cls, Type type) {
            this.f2216b = cls;
            this.f2217c = type;
        }

        @Override // c.a.e.a0.k
        public T a() {
            try {
                return (T) this.f2215a.c(this.f2216b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f2217c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class f<T> implements c.a.e.a0.k<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a.e.h f2218a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type f2219b;

        f(c.a.e.h hVar, Type type) {
            this.f2218a = hVar;
            this.f2219b = type;
        }

        @Override // c.a.e.a0.k
        public T a() {
            return (T) this.f2218a.a(this.f2219b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class g<T> implements c.a.e.a0.k<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a.e.h f2221a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type f2222b;

        g(c.a.e.h hVar, Type type) {
            this.f2221a = hVar;
            this.f2222b = type;
        }

        @Override // c.a.e.a0.k
        public T a() {
            return (T) this.f2221a.a(this.f2222b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class h<T> implements c.a.e.a0.k<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f2224a;

        h(Constructor constructor) {
            this.f2224a = constructor;
        }

        @Override // c.a.e.a0.k
        public T a() {
            try {
                return (T) this.f2224a.newInstance(null);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke " + this.f2224a + " with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke " + this.f2224a + " with no args", e3.getTargetException());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class i<T> implements c.a.e.a0.k<T> {
        i() {
        }

        @Override // c.a.e.a0.k
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class j<T> implements c.a.e.a0.k<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f2227a;

        j(Type type) {
            this.f2227a = type;
        }

        @Override // c.a.e.a0.k
        public T a() {
            Type type = this.f2227a;
            if (!(type instanceof ParameterizedType)) {
                throw new c.a.e.m("Invalid EnumSet type: " + this.f2227a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new c.a.e.m("Invalid EnumSet type: " + this.f2227a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class k<T> implements c.a.e.a0.k<T> {
        k() {
        }

        @Override // c.a.e.a0.k
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class l<T> implements c.a.e.a0.k<T> {
        l() {
        }

        @Override // c.a.e.a0.k
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class m<T> implements c.a.e.a0.k<T> {
        m() {
        }

        @Override // c.a.e.a0.k
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class n<T> implements c.a.e.a0.k<T> {
        n() {
        }

        @Override // c.a.e.a0.k
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, c.a.e.h<?>> map) {
        this.f2209a = map;
    }

    private <T> c.a.e.a0.k<T> b(Class<? super T> cls) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f2210b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> c.a.e.a0.k<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i() : EnumSet.class.isAssignableFrom(cls) ? new j(type) : Set.class.isAssignableFrom(cls) ? new k() : Queue.class.isAssignableFrom(cls) ? new l() : new m();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n() : ConcurrentMap.class.isAssignableFrom(cls) ? new a() : SortedMap.class.isAssignableFrom(cls) ? new b() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(c.a.e.b0.a.c(((ParameterizedType) type).getActualTypeArguments()[0]).f())) ? new d() : new C0152c();
        }
        return null;
    }

    private <T> c.a.e.a0.k<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public <T> c.a.e.a0.k<T> a(c.a.e.b0.a<T> aVar) throws NoSuchMethodException, SecurityException {
        Type typeH = aVar.h();
        Class<? super T> clsF = aVar.f();
        c.a.e.h<?> hVar = this.f2209a.get(typeH);
        if (hVar != null) {
            return new f(hVar, typeH);
        }
        c.a.e.h<?> hVar2 = this.f2209a.get(clsF);
        if (hVar2 != null) {
            return new g(hVar2, typeH);
        }
        c.a.e.a0.k<T> kVarB = b(clsF);
        if (kVarB != null) {
            return kVarB;
        }
        c.a.e.a0.k<T> kVarC = c(typeH, clsF);
        return kVarC != null ? kVarC : d(typeH, clsF);
    }

    public String toString() {
        return this.f2209a.toString();
    }
}
