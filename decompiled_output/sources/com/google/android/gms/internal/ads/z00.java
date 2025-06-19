package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class z00 implements gj0 {

    /* renamed from: a, reason: collision with root package name */
    private qf0 f6204a;

    /* renamed from: b, reason: collision with root package name */
    private ia0 f6205b;

    /* renamed from: c, reason: collision with root package name */
    private m61 f6206c;
    private wm1 d;
    private rk1 e;
    private sj1 f;
    private final /* synthetic */ e00 g;

    private z00(e00 e00Var) {
        this.g = e00Var;
    }

    @Override // com.google.android.gms.internal.ads.gj0
    public final /* synthetic */ gj0 B(qf0 qf0Var) {
        this.f6204a = (qf0) we2.a(qf0Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.gj0
    public final /* synthetic */ gj0 b(m61 m61Var) {
        this.f6206c = (m61) we2.a(m61Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<hj0> g(sj1 sj1Var) {
        this.f = sj1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<hj0> j(wm1 wm1Var) {
        this.d = wm1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final hj0 d() {
        we2.c(this.f6204a, qf0.class);
        we2.c(this.f6205b, ia0.class);
        we2.c(this.f6206c, m61.class);
        return new y00(this.g, new i80(), new yn1(), new r90(), new wu0(), this.f6204a, this.f6205b, new go1(), this.f6206c, this.d, this.e, this.f);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<hj0> s(rk1 rk1Var) {
        this.e = rk1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.gj0
    public final /* synthetic */ gj0 w(ia0 ia0Var) {
        this.f6205b = (ia0) we2.a(ia0Var);
        return this;
    }
}
