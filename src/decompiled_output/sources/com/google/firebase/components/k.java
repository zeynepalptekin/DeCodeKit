package com.google.firebase.components;

/* loaded from: classes.dex */
final /* synthetic */ class k implements c.a.d.s.a {

    /* renamed from: a, reason: collision with root package name */
    private final n f6920a;

    /* renamed from: b, reason: collision with root package name */
    private final f f6921b;

    private k(n nVar, f fVar) {
        this.f6920a = nVar;
        this.f6921b = fVar;
    }

    public static c.a.d.s.a a(n nVar, f fVar) {
        return new k(nVar, fVar);
    }

    @Override // c.a.d.s.a
    public Object get() {
        n nVar = this.f6920a;
        f fVar = this.f6921b;
        return fVar.d().a(new y(fVar, nVar));
    }
}
