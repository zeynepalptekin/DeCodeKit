package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xb1 implements pe2<vb1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f5962a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<hs0> f5963b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<an1> f5964c;
    private final ze2<String> d;

    private xb1(ze2<cy1> ze2Var, ze2<hs0> ze2Var2, ze2<an1> ze2Var3, ze2<String> ze2Var4) {
        this.f5962a = ze2Var;
        this.f5963b = ze2Var2;
        this.f5964c = ze2Var3;
        this.d = ze2Var4;
    }

    public static xb1 a(ze2<cy1> ze2Var, ze2<hs0> ze2Var2, ze2<an1> ze2Var3, ze2<String> ze2Var4) {
        return new xb1(ze2Var, ze2Var2, ze2Var3, ze2Var4);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new vb1(this.f5962a.get(), this.f5963b.get(), this.f5964c.get(), this.d.get());
    }
}
