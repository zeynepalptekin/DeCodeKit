package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class m1<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f4326a;

    /* renamed from: b, reason: collision with root package name */
    private final T f4327b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4328c;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Ljava/lang/Integer;)V */
    /* JADX WARN: Multi-variable type inference failed */
    protected m1(String str, Object obj, int r3) {
        this.f4326a = str;
        this.f4327b = obj;
        this.f4328c = r3;
    }

    public static m1<Double> b(String str, double d) {
        return new m1<>(str, Double.valueOf(d), o1.f4629c);
    }

    public static m1<Long> c(String str, long j) {
        return new m1<>(str, Long.valueOf(j), o1.f4628b);
    }

    public static m1<Boolean> d(String str, boolean z) {
        return new m1<>(str, Boolean.valueOf(z), o1.f4627a);
    }

    public static m1<String> e(String str, String str2) {
        return new m1<>(str, str2, o1.d);
    }

    public T a() {
        p2 p2VarB = o2.b();
        if (p2VarB == null) {
            throw new IllegalStateException("Flag is not initialized.");
        }
        int r1 = l1.f4176a[this.f4328c - 1];
        if (r1 == 1) {
            return (T) p2VarB.c(this.f4326a, ((Boolean) this.f4327b).booleanValue());
        }
        if (r1 == 2) {
            return (T) p2VarB.a(this.f4326a, ((Long) this.f4327b).longValue());
        }
        if (r1 == 3) {
            return (T) p2VarB.d(this.f4326a, ((Double) this.f4327b).doubleValue());
        }
        if (r1 == 4) {
            return (T) p2VarB.b(this.f4326a, (String) this.f4327b);
        }
        throw new IllegalStateException();
    }
}
