package androidx.lifecycle;

import androidx.lifecycle.g;

/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements h {

    /* renamed from: a, reason: collision with root package name */
    private final e[] f484a;

    CompositeGeneratedAdaptersObserver(e[] eVarArr) {
        this.f484a = eVarArr;
    }

    @Override // androidx.lifecycle.h
    public void d(j jVar, g.a aVar) {
        n nVar = new n();
        for (e eVar : this.f484a) {
            eVar.a(jVar, aVar, false, nVar);
        }
        for (e eVar2 : this.f484a) {
            eVar2.a(jVar, aVar, true, nVar);
        }
    }
}
