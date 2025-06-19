package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yq0 implements pe2<u01<qq0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<t51<qq0, rn1, o21>> f6166a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<t51<qq0, rn1, p21>> f6167b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<an1> f6168c;

    public yq0(ze2<t51<qq0, rn1, o21>> ze2Var, ze2<t51<qq0, rn1, p21>> ze2Var2, ze2<an1> ze2Var3) {
        this.f6166a = ze2Var;
        this.f6167b = ze2Var2;
        this.f6168c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        ze2<t51<qq0, rn1, o21>> ze2Var = this.f6166a;
        return (u01) we2.b(vq0.f5720a[this.f6168c.get().n.f5161a - 1] != 1 ? this.f6167b.get() : ze2Var.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
