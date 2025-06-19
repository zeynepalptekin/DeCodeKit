package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class er0 implements pe2<u01<qq0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cr1> f3316a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<cy1> f3317b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<t41> f3318c;
    private final ze2<p51> d;

    public er0(ze2<cr1> ze2Var, ze2<cy1> ze2Var2, ze2<t41> ze2Var3, ze2<p51> ze2Var4) {
        this.f3316a = ze2Var;
        this.f3317b = ze2Var2;
        this.f3318c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (u01) we2.b(new t51(this.f3316a.get(), this.f3317b.get(), this.d.get(), this.f3318c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
