package com.google.firebase.installations;

/* loaded from: classes.dex */
class m implements q {

    /* renamed from: a, reason: collision with root package name */
    private final r f6967a;

    /* renamed from: b, reason: collision with root package name */
    private final c.a.b.b.k.n<n> f6968b;

    public m(r rVar, c.a.b.b.k.n<n> nVar) {
        this.f6967a = rVar;
        this.f6968b = nVar;
    }

    @Override // com.google.firebase.installations.q
    public boolean a(com.google.firebase.installations.t.d dVar, Exception exc) {
        if (!dVar.i() && !dVar.j() && !dVar.l()) {
            return false;
        }
        this.f6968b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.q
    public boolean b(com.google.firebase.installations.t.d dVar) {
        if (!dVar.k() || this.f6967a.b(dVar)) {
            return false;
        }
        this.f6968b.c(n.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
