package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class me2<T> implements je2<T>, ze2<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f4398c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile ze2<T> f4399a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f4400b = f4398c;

    private me2(ze2<T> ze2Var) {
        this.f4399a = ze2Var;
    }

    public static <P extends ze2<T>, T> ze2<T> a(P p) {
        we2.a(p);
        return p instanceof me2 ? p : new me2(p);
    }

    public static <P extends ze2<T>, T> je2<T> b(P p) {
        return p instanceof je2 ? (je2) p : new me2((ze2) we2.a(p));
    }

    @Override // com.google.android.gms.internal.ads.je2, com.google.android.gms.internal.ads.ze2
    public final T get() {
        T t = (T) this.f4400b;
        if (t == f4398c) {
            synchronized (this) {
                t = (T) this.f4400b;
                if (t == f4398c) {
                    t = this.f4399a.get();
                    Object obj = this.f4400b;
                    if (((obj == f4398c || (obj instanceof te2)) ? false : true) && obj != t) {
                        String strValueOf = String.valueOf(obj);
                        String strValueOf2 = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 118 + String.valueOf(strValueOf2).length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(strValueOf);
                        sb.append(" & ");
                        sb.append(strValueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f4400b = t;
                    this.f4399a = null;
                }
            }
        }
        return t;
    }
}
