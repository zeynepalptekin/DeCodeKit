package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class sa1 implements pe2<qa1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f5234a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<an1> f5235b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<as> f5236c;

    private sa1(ze2<cy1> ze2Var, ze2<an1> ze2Var2, ze2<as> ze2Var3) {
        this.f5234a = ze2Var;
        this.f5235b = ze2Var2;
        this.f5236c = ze2Var3;
    }

    public static sa1 a(ze2<cy1> ze2Var, ze2<an1> ze2Var2, ze2<as> ze2Var3) {
        return new sa1(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new qa1(this.f5234a.get(), this.f5235b.get(), this.f5236c.get());
    }
}
