package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ls<T> extends ks<T> {
    private final T e;

    private ls(T t) {
        this.e = t;
    }

    public static <T> ls<T> f(T t) {
        return new ls<>(t);
    }

    public final void g() {
        a(this.e);
    }
}
