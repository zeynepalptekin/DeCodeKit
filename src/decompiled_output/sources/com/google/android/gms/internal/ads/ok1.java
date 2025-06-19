package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ok1 implements pe2<ik1<tq0, qq0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4706a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<no1> f4707b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<gp1> f4708c;

    public ok1(ze2<Context> ze2Var, ze2<no1> ze2Var2, ze2<gp1> ze2Var3) {
        this.f4706a = ze2Var;
        this.f4707b = ze2Var2;
        this.f4708c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        Object ak1Var;
        Context context = this.f4706a.get();
        no1 no1Var = this.f4707b.get();
        gp1 gp1Var = this.f4708c.get();
        if (((Integer) qx2.e().c(e0.z4)).intValue() > 0) {
            fp1 fp1VarA = gp1Var.a(xo1.Rewarded, context, no1Var, new qj1(new gj1()));
            ak1Var = new lj1(new zj1(new ak1()), new rj1(fp1VarA.f3431a, cs.f3023a), fp1VarA.f3432b, cs.f3023a);
        } else {
            ak1Var = new ak1();
        }
        return (ik1) we2.b(ak1Var, "Cannot return null from a non-@Nullable @Provides method");
    }
}
