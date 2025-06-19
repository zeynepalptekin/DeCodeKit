package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ao0 implements pe2<zn0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f2725a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<do0> f2726b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<oo0> f2727c;

    public ao0(ze2<cy1> ze2Var, ze2<do0> ze2Var2, ze2<oo0> ze2Var3) {
        this.f2725a = ze2Var;
        this.f2726b = ze2Var2;
        this.f2727c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new zn0(this.f2725a.get(), this.f2726b.get(), this.f2727c.get());
    }
}
