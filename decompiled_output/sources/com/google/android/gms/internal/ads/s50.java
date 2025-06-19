package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class s50 implements pe2<ch0<tb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final h50 f5223a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<t60> f5224b;

    public s50(h50 h50Var, ze2<t60> ze2Var) {
        this.f5223a = h50Var;
        this.f5224b = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f5224b.get(), cs.e), "Cannot return null from a non-@Nullable @Provides method");
    }
}
