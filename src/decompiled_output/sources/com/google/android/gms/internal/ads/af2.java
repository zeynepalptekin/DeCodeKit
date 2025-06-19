package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class af2<T> implements ze2<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f2676c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile ze2<T> f2677a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f2678b = f2676c;

    private af2(ze2<T> ze2Var) {
        this.f2677a = ze2Var;
    }

    public static <P extends ze2<T>, T> ze2<T> a(P p) {
        return ((p instanceof af2) || (p instanceof me2)) ? p : new af2((ze2) we2.a(p));
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final T get() {
        T t = (T) this.f2678b;
        if (t != f2676c) {
            return t;
        }
        ze2<T> ze2Var = this.f2677a;
        if (ze2Var == null) {
            return (T) this.f2678b;
        }
        T t2 = ze2Var.get();
        this.f2678b = t2;
        this.f2677a = null;
        return t2;
    }
}
