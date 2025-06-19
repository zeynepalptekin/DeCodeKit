package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ne2<T> implements pe2<T> {

    /* renamed from: a, reason: collision with root package name */
    private ze2<T> f4526a;

    public static <T> void a(ze2<T> ze2Var, ze2<T> ze2Var2) {
        we2.a(ze2Var2);
        ne2 ne2Var = (ne2) ze2Var;
        if (ne2Var.f4526a != null) {
            throw new IllegalStateException();
        }
        ne2Var.f4526a = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final T get() {
        ze2<T> ze2Var = this.f4526a;
        if (ze2Var != null) {
            return ze2Var.get();
        }
        throw new IllegalStateException();
    }
}
