package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ia0;

/* loaded from: classes.dex */
public final class jk0 implements pe2<f70<e50>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<gz> f3980a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ia0.a> f3981b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<qf0> f3982c;
    private final ze2<zj0> d;
    private final ze2<gd0> e;

    public jk0(ze2<gz> ze2Var, ze2<ia0.a> ze2Var2, ze2<qf0> ze2Var3, ze2<zj0> ze2Var4, ze2<gd0> ze2Var5) {
        this.f3980a = ze2Var;
        this.f3981b = ze2Var2;
        this.f3982c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        gz gzVar = this.f3980a.get();
        ia0.a aVar = this.f3981b.get();
        qf0 qf0Var = this.f3982c.get();
        return (f70) we2.b(gzVar.l().f(aVar.d()).c(qf0Var).e(this.d.get()).h(new m61(null)).q(new x60(this.e.get())).m(new z40(null)).x().e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
