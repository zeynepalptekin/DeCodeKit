package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class h10 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    private ia0 f3609a;

    /* renamed from: b, reason: collision with root package name */
    private g91 f3610b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ e00 f3611c;

    private h10(e00 e00Var) {
        this.f3611c = e00Var;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final q81 a() {
        we2.c(this.f3609a, ia0.class);
        we2.c(this.f3610b, g91.class);
        return new g10(this.f3611c, this.f3610b, new i80(), new wu0(), this.f3609a, new go1());
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ p81 b(ia0 ia0Var) {
        this.f3609a = (ia0) we2.a(ia0Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.p81
    @Deprecated
    public final /* synthetic */ p81 c(qf0 qf0Var) {
        we2.a(qf0Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ p81 d(g91 g91Var) {
        this.f3610b = (g91) we2.a(g91Var);
        return this;
    }
}
