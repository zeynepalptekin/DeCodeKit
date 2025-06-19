package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class k8<T> {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    public final T f4062a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    public final un2 f4063b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    public final pd f4064c;
    public boolean d;

    private k8(pd pdVar) {
        this.d = false;
        this.f4062a = null;
        this.f4063b = null;
        this.f4064c = pdVar;
    }

    private k8(@androidx.annotation.i0 T t, @androidx.annotation.i0 un2 un2Var) {
        this.d = false;
        this.f4062a = t;
        this.f4063b = un2Var;
        this.f4064c = null;
    }

    public static <T> k8<T> b(@androidx.annotation.i0 T t, @androidx.annotation.i0 un2 un2Var) {
        return new k8<>(t, un2Var);
    }

    public static <T> k8<T> c(pd pdVar) {
        return new k8<>(pdVar);
    }

    public final boolean a() {
        return this.f4064c == null;
    }
}
