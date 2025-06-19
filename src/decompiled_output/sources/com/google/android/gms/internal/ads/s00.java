package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class s00 implements a60 {

    /* renamed from: a, reason: collision with root package name */
    private qf0 f5208a;

    /* renamed from: b, reason: collision with root package name */
    private ia0 f5209b;

    /* renamed from: c, reason: collision with root package name */
    private m61 f5210c;
    private x60 d;
    private z40 e;
    private zj0 f;
    private wm1 g;
    private rk1 h;
    private sj1 i;
    private final /* synthetic */ e00 j;

    private s00(e00 e00Var) {
        this.j = e00Var;
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final /* synthetic */ a60 c(qf0 qf0Var) {
        this.f5208a = (qf0) we2.a(qf0Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final /* synthetic */ a60 e(zj0 zj0Var) {
        this.f = (zj0) we2.a(zj0Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final /* synthetic */ a60 f(ia0 ia0Var) {
        this.f5209b = (ia0) we2.a(ia0Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<b60> g(sj1 sj1Var) {
        this.i = sj1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final /* synthetic */ a60 h(m61 m61Var) {
        this.f5210c = (m61) we2.a(m61Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<b60> j(wm1 wm1Var) {
        this.g = wm1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final /* synthetic */ a60 m(z40 z40Var) {
        this.e = (z40) we2.a(z40Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final /* synthetic */ a60 q(x60 x60Var) {
        this.d = (x60) we2.a(x60Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<b60> s(rk1 rk1Var) {
        this.h = rk1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final b60 d() {
        we2.c(this.f5208a, qf0.class);
        we2.c(this.f5209b, ia0.class);
        we2.c(this.f5210c, m61.class);
        we2.c(this.d, x60.class);
        we2.c(this.e, z40.class);
        we2.c(this.f, zj0.class);
        return new v00(this.j, this.e, this.f, new i80(), new yn1(), new r90(), new wu0(), this.f5208a, this.f5209b, new go1(), this.f5210c, this.d, this.g, this.h, this.i);
    }
}
