package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class g00 implements ck0 {

    /* renamed from: a, reason: collision with root package name */
    private qf0 f3480a;

    /* renamed from: b, reason: collision with root package name */
    private ia0 f3481b;

    /* renamed from: c, reason: collision with root package name */
    private zj0 f3482c;
    private wm1 d;
    private rk1 e;
    private sj1 f;
    private final /* synthetic */ e00 g;

    private g00(e00 e00Var) {
        this.g = e00Var;
    }

    @Override // com.google.android.gms.internal.ads.ck0
    public final /* synthetic */ ck0 A(ia0 ia0Var) {
        this.f3481b = (ia0) we2.a(ia0Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<ek0> g(sj1 sj1Var) {
        this.f = sj1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<ek0> j(wm1 wm1Var) {
        this.d = wm1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ck0
    public final /* synthetic */ ck0 k(zj0 zj0Var) {
        this.f3482c = (zj0) we2.a(zj0Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<ek0> s(rk1 rk1Var) {
        this.e = rk1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ck0
    public final /* synthetic */ ck0 y(qf0 qf0Var) {
        this.f3480a = (qf0) we2.a(qf0Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final ek0 d() {
        we2.c(this.f3480a, qf0.class);
        we2.c(this.f3481b, ia0.class);
        we2.c(this.f3482c, zj0.class);
        return new f00(this.g, this.f3482c, new i80(), new yn1(), new r90(), new wu0(), this.f3480a, this.f3481b, new go1(), this.d, this.e, this.f);
    }
}
