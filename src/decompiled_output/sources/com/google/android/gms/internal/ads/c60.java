package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class c60 implements pe2<u01<e50>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Boolean> f2929a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<a41> f2930b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<t51<e50, rn1, p21>> f2931c;

    public c60(ze2<Boolean> ze2Var, ze2<a41> ze2Var2, ze2<t51<e50, rn1, p21>> ze2Var3) {
        this.f2929a = ze2Var;
        this.f2930b = ze2Var2;
        this.f2931c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        boolean zBooleanValue = this.f2929a.get().booleanValue();
        u01 u01Var = (a41) this.f2930b.get();
        u01 u01Var2 = (t51) this.f2931c.get();
        if (!zBooleanValue) {
            u01Var = u01Var2;
        }
        return (u01) we2.b(u01Var, "Cannot return null from a non-@Nullable @Provides method");
    }
}
