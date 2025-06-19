package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mj0 implements pe2<u01<gi0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cr1> f4419a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<cy1> f4420b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<e31> f4421c;
    private final ze2<p51> d;

    public mj0(ze2<cr1> ze2Var, ze2<cy1> ze2Var2, ze2<e31> ze2Var3, ze2<p51> ze2Var4) {
        this.f4419a = ze2Var;
        this.f4420b = ze2Var2;
        this.f4421c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (u01) we2.b(new t51(this.f4419a.get(), this.f4420b.get(), this.d.get(), this.f4421c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
