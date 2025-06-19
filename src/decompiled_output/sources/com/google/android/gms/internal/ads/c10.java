package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class c10 implements wq0 {

    /* renamed from: a, reason: collision with root package name */
    private qf0 f2908a;

    /* renamed from: b, reason: collision with root package name */
    private ia0 f2909b;

    /* renamed from: c, reason: collision with root package name */
    private wm1 f2910c;
    private rk1 d;
    private sj1 e;
    private final /* synthetic */ e00 f;

    private c10(e00 e00Var) {
        this.f = e00Var;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<tq0> g(sj1 sj1Var) {
        this.e = sj1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<tq0> j(wm1 wm1Var) {
        this.f2910c = wm1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.wq0
    public final /* synthetic */ wq0 n(ia0 ia0Var) {
        this.f2909b = (ia0) we2.a(ia0Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final tq0 d() {
        we2.c(this.f2908a, qf0.class);
        we2.c(this.f2909b, ia0.class);
        return new f10(this.f, new i80(), new yn1(), new r90(), new wu0(), this.f2908a, this.f2909b, new go1(), this.f2910c, this.d, this.e);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<tq0> s(rk1 rk1Var) {
        this.d = rk1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.wq0
    public final /* synthetic */ wq0 u(qf0 qf0Var) {
        this.f2908a = (qf0) we2.a(qf0Var);
        return this;
    }
}
