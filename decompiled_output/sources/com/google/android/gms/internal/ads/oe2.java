package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class oe2<T> implements je2<T>, pe2<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final oe2<Object> f4686b = new oe2<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final T f4687a;

    private oe2(T t) {
        this.f4687a = t;
    }

    public static <T> pe2<T> a(T t) {
        return new oe2(we2.b(t, "instance cannot be null"));
    }

    public static <T> pe2<T> b(T t) {
        return t == null ? f4686b : new oe2(t);
    }

    @Override // com.google.android.gms.internal.ads.je2, com.google.android.gms.internal.ads.ze2
    public final T get() {
        return this.f4687a;
    }
}
