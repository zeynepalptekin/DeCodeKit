package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class t implements c.a.d.o.d, c.a.d.o.c {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.u("this")
    private final Map<Class<?>, ConcurrentHashMap<c.a.d.o.b<Object>, Executor>> f6935a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.u("this")
    private Queue<c.a.d.o.a<?>> f6936b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f6937c;

    t(Executor executor) {
        this.f6937c = executor;
    }

    private synchronized Set<Map.Entry<c.a.d.o.b<Object>, Executor>> f(c.a.d.o.a<?> aVar) {
        ConcurrentHashMap<c.a.d.o.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f6935a.get(aVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    @Override // c.a.d.o.d
    public <T> void a(Class<T> cls, c.a.d.o.b<? super T> bVar) {
        b(cls, this.f6937c, bVar);
    }

    @Override // c.a.d.o.d
    public synchronized <T> void b(Class<T> cls, Executor executor, c.a.d.o.b<? super T> bVar) {
        w.b(cls);
        w.b(bVar);
        w.b(executor);
        if (!this.f6935a.containsKey(cls)) {
            this.f6935a.put(cls, new ConcurrentHashMap<>());
        }
        this.f6935a.get(cls).put(bVar, executor);
    }

    @Override // c.a.d.o.c
    public void c(c.a.d.o.a<?> aVar) {
        w.b(aVar);
        synchronized (this) {
            if (this.f6936b != null) {
                this.f6936b.add(aVar);
                return;
            }
            for (Map.Entry<c.a.d.o.b<Object>, Executor> entry : f(aVar)) {
                entry.getValue().execute(s.a(entry, aVar));
            }
        }
    }

    @Override // c.a.d.o.d
    public synchronized <T> void d(Class<T> cls, c.a.d.o.b<? super T> bVar) {
        w.b(cls);
        w.b(bVar);
        if (this.f6935a.containsKey(cls)) {
            ConcurrentHashMap<c.a.d.o.b<Object>, Executor> concurrentHashMap = this.f6935a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f6935a.remove(cls);
            }
        }
    }

    void e() {
        Queue<c.a.d.o.a<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.f6936b != null) {
                Queue<c.a.d.o.a<?>> queue2 = this.f6936b;
                this.f6936b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            Iterator<c.a.d.o.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }
    }
}
