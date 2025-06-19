package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n1<T> extends m1<T> {
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Ljava/lang/Integer;)V */
    protected n1(String str, Object obj, int r3) {
        super(str, obj, r3);
    }

    public static m1<Boolean> d(String str, boolean z) {
        return new n1(str, Boolean.TRUE, o1.f4627a);
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final T a() {
        if (o2.f4634b.get()) {
            return (T) super.a();
        }
        throw new IllegalStateException("Striped code is accessed: 54c42518-856a-44fb-aae0-cd6676d514e5");
    }
}
