package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class j60 implements pe2<u01<e50>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cr1> f3920a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<cy1> f3921b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<b21> f3922c;
    private final ze2<p51> d;

    public j60(ze2<cr1> ze2Var, ze2<cy1> ze2Var2, ze2<b21> ze2Var3, ze2<p51> ze2Var4) {
        this.f3920a = ze2Var;
        this.f3921b = ze2Var2;
        this.f3922c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (u01) we2.b(new t51(this.f3920a.get(), this.f3921b.get(), this.d.get(), this.f3922c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
