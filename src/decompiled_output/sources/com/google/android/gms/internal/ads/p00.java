package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class p00 implements c40 {

    /* renamed from: a, reason: collision with root package name */
    private qf0 f4764a;

    /* renamed from: b, reason: collision with root package name */
    private ia0 f4765b;

    /* renamed from: c, reason: collision with root package name */
    private wm1 f4766c;
    private rk1 d;
    private sj1 e;
    private final /* synthetic */ e00 f;

    private p00(e00 e00Var) {
        this.f = e00Var;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ d40 d() {
        we2.c(this.f4764a, qf0.class);
        we2.c(this.f4765b, ia0.class);
        return new o00(this.f, new i80(), new yn1(), new r90(), new wu0(), this.f4764a, this.f4765b, new go1(), this.f4766c, this.d, this.e);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<d40> g(sj1 sj1Var) {
        this.e = sj1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.c40
    public final /* synthetic */ c40 i(qf0 qf0Var) {
        this.f4764a = (qf0) we2.a(qf0Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<d40> j(wm1 wm1Var) {
        this.f4766c = wm1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.c40
    public final /* synthetic */ c40 l(ia0 ia0Var) {
        this.f4765b = (ia0) we2.a(ia0Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final /* synthetic */ ja0<d40> s(rk1 rk1Var) {
        this.d = rk1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.c40
    @Deprecated
    public final /* synthetic */ c40 v(z40 z40Var) {
        we2.a(z40Var);
        return this;
    }
}
