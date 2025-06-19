package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class a90 implements pe2<d70> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<wm1> f2653a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<km1> f2654b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<wb0> f2655c;
    private final ze2<mc0> d;
    private final ze2<fk1> e;
    private final ze2<ra0> f;
    private final ze2<rd0> g;

    private a90(ze2<wm1> ze2Var, ze2<km1> ze2Var2, ze2<wb0> ze2Var3, ze2<mc0> ze2Var4, ze2<fk1> ze2Var5, ze2<ra0> ze2Var6, ze2<rd0> ze2Var7) {
        this.f2653a = ze2Var;
        this.f2654b = ze2Var2;
        this.f2655c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
        this.g = ze2Var7;
    }

    public static a90 a(ze2<wm1> ze2Var, ze2<km1> ze2Var2, ze2<wb0> ze2Var3, ze2<mc0> ze2Var4, ze2<fk1> ze2Var5, ze2<ra0> ze2Var6, ze2<rd0> ze2Var7) {
        return new a90(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5, ze2Var6, ze2Var7);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new d70(this.f2653a.get(), this.f2654b.get(), this.f2655c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
