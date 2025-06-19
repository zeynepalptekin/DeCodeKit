package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class k00 implements s40 {

    /* renamed from: a, reason: collision with root package name */
    private qf0 f4035a;

    /* renamed from: b, reason: collision with root package name */
    private ia0 f4036b;

    /* renamed from: c, reason: collision with root package name */
    private wm1 f4037c;
    private rk1 d;
    private sj1 e;
    private final /* synthetic */ e00 f;

    private k00(e00 e00Var) {
        this.f = e00Var;
    }

    @Override // com.google.android.gms.internal.ads.s40
    @Deprecated
    public final /* synthetic */ s40 a(z40 z40Var) {
        we2.a(z40Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ p40 d() {
        we2.c(this.f4035a, qf0.class);
        we2.c(this.f4036b, ia0.class);
        return new n00(this.f, new i80(), new yn1(), new r90(), new wu0(), this.f4035a, this.f4036b, new go1(), this.f4037c, this.d, this.e);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<p40> g(sj1 sj1Var) {
        this.e = sj1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<p40> j(wm1 wm1Var) {
        this.f4037c = wm1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final /* synthetic */ s40 r(qf0 qf0Var) {
        this.f4035a = (qf0) we2.a(qf0Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<p40> s(rk1 rk1Var) {
        this.d = rk1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final /* synthetic */ s40 t(ia0 ia0Var) {
        this.f4036b = (ia0) we2.a(ia0Var);
        return this;
    }
}
