package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class b80 implements pe2<y70> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cc0> f2796a;

    private b80(ze2<cc0> ze2Var) {
        this.f2796a = ze2Var;
    }

    public static b80 a(ze2<cc0> ze2Var) {
        return new b80(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new y70(this.f2796a.get());
    }
}
