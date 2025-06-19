package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class y extends com.google.firebase.components.a {

    /* renamed from: a, reason: collision with root package name */
    private final Set<Class<?>> f6941a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Class<?>> f6942b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Class<?>> f6943c;
    private final Set<Class<?>> d;
    private final Set<Class<?>> e;
    private final g f;

    private static class a implements c.a.d.o.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f6944a;

        /* renamed from: b, reason: collision with root package name */
        private final c.a.d.o.c f6945b;

        public a(Set<Class<?>> set, c.a.d.o.c cVar) {
            this.f6944a = set;
            this.f6945b = cVar;
        }

        @Override // c.a.d.o.c
        public void c(c.a.d.o.a<?> aVar) {
            if (!this.f6944a.contains(aVar.b())) {
                throw new IllegalArgumentException(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f6945b.c(aVar);
        }
    }

    y(f<?> fVar, g gVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (p pVar : fVar.c()) {
            if (pVar.b()) {
                boolean zD = pVar.d();
                Class<?> clsA = pVar.a();
                if (zD) {
                    hashSet3.add(clsA);
                } else {
                    hashSet.add(clsA);
                }
            } else {
                boolean zD2 = pVar.d();
                Class<?> clsA2 = pVar.a();
                if (zD2) {
                    hashSet4.add(clsA2);
                } else {
                    hashSet2.add(clsA2);
                }
            }
        }
        if (!fVar.f().isEmpty()) {
            hashSet.add(c.a.d.o.c.class);
        }
        this.f6941a = Collections.unmodifiableSet(hashSet);
        this.f6942b = Collections.unmodifiableSet(hashSet2);
        this.f6943c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = fVar.f();
        this.f = gVar;
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.g
    public <T> T a(Class<T> cls) {
        if (!this.f6941a.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f.a(cls);
        return !cls.equals(c.a.d.o.c.class) ? t : (T) new a(this.e, (c.a.d.o.c) t);
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.g
    public <T> Set<T> b(Class<T> cls) {
        if (this.f6943c.contains(cls)) {
            return this.f.b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // com.google.firebase.components.g
    public <T> c.a.d.s.a<T> c(Class<T> cls) {
        if (this.f6942b.contains(cls)) {
            return this.f.c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.google.firebase.components.g
    public <T> c.a.d.s.a<Set<T>> d(Class<T> cls) {
        if (this.d.contains(cls)) {
            return this.f.d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }
}
