package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tz implements pe2<pn1<up0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<hq0> f5462a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<cy1> f5463b;

    public tz(ze2<hq0> ze2Var, ze2<cy1> ze2Var2) {
        this.f5462a = ze2Var;
        this.f5463b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (pn1) we2.b(new pn1(this.f5462a.get(), this.f5463b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
