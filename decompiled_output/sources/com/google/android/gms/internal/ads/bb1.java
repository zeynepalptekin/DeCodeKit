package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bb1 implements pe2<za1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<String> f2812a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<String> f2813b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<s80> f2814c;
    private final ze2<ao1> d;
    private final ze2<an1> e;

    private bb1(ze2<String> ze2Var, ze2<String> ze2Var2, ze2<s80> ze2Var3, ze2<ao1> ze2Var4, ze2<an1> ze2Var5) {
        this.f2812a = ze2Var;
        this.f2813b = ze2Var2;
        this.f2814c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
    }

    public static bb1 a(ze2<String> ze2Var, ze2<String> ze2Var2, ze2<s80> ze2Var3, ze2<ao1> ze2Var4, ze2<an1> ze2Var5) {
        return new bb1(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new za1(this.f2812a.get(), this.f2813b.get(), this.f2814c.get(), this.d.get(), this.e.get());
    }
}
