package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zd1 implements pe2<ae1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<String> f6251a;

    private zd1(ze2<String> ze2Var) {
        this.f6251a = ze2Var;
    }

    public static zd1 a(ze2<String> ze2Var) {
        return new zd1(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ae1(this.f6251a.get());
    }
}
