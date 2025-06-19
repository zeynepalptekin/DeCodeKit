package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Set<Class<? super T>> f6910a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<p> f6911b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6912c;
    private final int d;
    private final i<T> e;
    private final Set<Class<?>> f;

    public static class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Class<? super T>> f6913a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<p> f6914b;

        /* renamed from: c, reason: collision with root package name */
        private int f6915c;
        private int d;
        private i<T> e;
        private Set<Class<?>> f;

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f6913a = new HashSet();
            this.f6914b = new HashSet();
            this.f6915c = 0;
            this.d = 0;
            this.f = new HashSet();
            w.c(cls, "Null interface");
            this.f6913a.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                w.c(cls2, "Null interface");
            }
            Collections.addAll(this.f6913a, clsArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> g() {
            this.d = 1;
            return this;
        }

        private b<T> i(int r3) {
            w.d(this.f6915c == 0, "Instantiation type has already been set.");
            this.f6915c = r3;
            return this;
        }

        private void j(Class<?> cls) {
            w.a(!this.f6913a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(p pVar) {
            w.c(pVar, "Null dependency");
            j(pVar.a());
            this.f6914b.add(pVar);
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public f<T> d() {
            w.d(this.e != null, "Missing required property: factory.");
            return new f<>(new HashSet(this.f6913a), new HashSet(this.f6914b), this.f6915c, this.d, this.e, this.f);
        }

        public b<T> e() {
            return i(2);
        }

        public b<T> f(i<T> iVar) {
            this.e = (i) w.c(iVar, "Null factory");
            return this;
        }

        public b<T> h(Class<?> cls) {
            this.f.add(cls);
            return this;
        }
    }

    private f(Set<Class<? super T>> set, Set<p> set2, int r3, int r4, i<T> iVar, Set<Class<?>> set3) {
        this.f6910a = Collections.unmodifiableSet(set);
        this.f6911b = Collections.unmodifiableSet(set2);
        this.f6912c = r3;
        this.d = r4;
        this.e = iVar;
        this.f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> f<T> g(T t, Class<T> cls) {
        return h(cls).f(e.b(t)).d();
    }

    public static <T> b<T> h(Class<T> cls) {
        return a(cls).g();
    }

    static /* synthetic */ Object m(Object obj, g gVar) {
        return obj;
    }

    static /* synthetic */ Object n(Object obj, g gVar) {
        return obj;
    }

    static /* synthetic */ Object o(Object obj, g gVar) {
        return obj;
    }

    @Deprecated
    public static <T> f<T> p(Class<T> cls, T t) {
        return a(cls).f(c.b(t)).d();
    }

    @SafeVarargs
    public static <T> f<T> q(T t, Class<T> cls, Class<? super T>... clsArr) {
        return b(cls, clsArr).f(d.b(t)).d();
    }

    public Set<p> c() {
        return this.f6911b;
    }

    public i<T> d() {
        return this.e;
    }

    public Set<Class<? super T>> e() {
        return this.f6910a;
    }

    public Set<Class<?>> f() {
        return this.f;
    }

    public boolean i() {
        return this.f6912c == 1;
    }

    public boolean j() {
        return this.f6912c == 2;
    }

    public boolean k() {
        return this.f6912c == 0;
    }

    public boolean l() {
        return this.d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f6910a.toArray()) + ">{" + this.f6912c + ", type=" + this.d + ", deps=" + Arrays.toString(this.f6911b.toArray()) + "}";
    }
}
