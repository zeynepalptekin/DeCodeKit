package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pz implements pe2<j20> {

    /* renamed from: a, reason: collision with root package name */
    private final jz f4918a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<gz> f4919b;

    public pz(jz jzVar, ze2<gz> ze2Var) {
        this.f4918a = jzVar;
        this.f4919b = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (j20) we2.b(this.f4919b.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
