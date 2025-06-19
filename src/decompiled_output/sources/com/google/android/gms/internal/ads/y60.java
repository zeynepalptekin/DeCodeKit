package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class y60 implements pe2<v60> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<km1> f6096a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ob0> f6097b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<rc0> f6098c;

    private y60(ze2<km1> ze2Var, ze2<ob0> ze2Var2, ze2<rc0> ze2Var3) {
        this.f6096a = ze2Var;
        this.f6097b = ze2Var2;
        this.f6098c = ze2Var3;
    }

    public static y60 a(ze2<km1> ze2Var, ze2<ob0> ze2Var2, ze2<rc0> ze2Var3) {
        return new y60(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new v60(this.f6096a.get(), this.f6097b.get(), this.f6098c.get());
    }
}
