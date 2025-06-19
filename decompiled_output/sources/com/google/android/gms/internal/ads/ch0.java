package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ch0<T> {

    /* renamed from: a, reason: collision with root package name */
    public T f2971a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f2972b;

    public ch0(T t, Executor executor) {
        this.f2971a = t;
        this.f2972b = executor;
    }

    public static <T> ch0<T> a(T t, Executor executor) {
        return new ch0<>(t, executor);
    }
}
