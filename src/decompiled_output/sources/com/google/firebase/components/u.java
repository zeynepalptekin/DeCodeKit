package com.google.firebase.components;

import androidx.annotation.x0;

/* loaded from: classes.dex */
public class u<T> implements c.a.d.s.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f6938c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f6939a;

    /* renamed from: b, reason: collision with root package name */
    private volatile c.a.d.s.a<T> f6940b;

    public u(c.a.d.s.a<T> aVar) {
        this.f6939a = f6938c;
        this.f6940b = aVar;
    }

    u(T t) {
        this.f6939a = f6938c;
        this.f6939a = t;
    }

    @x0
    boolean a() {
        return this.f6939a != f6938c;
    }

    @Override // c.a.d.s.a
    public T get() {
        T t = (T) this.f6939a;
        if (t == f6938c) {
            synchronized (this) {
                t = (T) this.f6939a;
                if (t == f6938c) {
                    t = this.f6940b.get();
                    this.f6939a = t;
                    this.f6940b = null;
                }
            }
        }
        return t;
    }
}
