package c.a.b.b.g.c;

import java.io.IOException;

/* loaded from: classes.dex */
final class ea extends ca<fa, fa> {
    ea() {
    }

    private static void t(Object obj, fa faVar) {
        ((h7) obj).zzb = faVar;
    }

    @Override // c.a.b.b.g.c.ca
    final /* synthetic */ fa a() {
        return fa.g();
    }

    @Override // c.a.b.b.g.c.ca
    final /* synthetic */ fa b(fa faVar) {
        fa faVar2 = faVar;
        faVar2.i();
        return faVar2;
    }

    @Override // c.a.b.b.g.c.ca
    final /* synthetic */ void c(fa faVar, int r2, int r3) {
        faVar.c((r2 << 3) | 5, Integer.valueOf(r3));
    }

    @Override // c.a.b.b.g.c.ca
    final /* synthetic */ void d(fa faVar, int r2, long j) {
        faVar.c(r2 << 3, Long.valueOf(j));
    }

    @Override // c.a.b.b.g.c.ca
    final /* synthetic */ void e(fa faVar, int r2, y5 y5Var) {
        faVar.c((r2 << 3) | 2, y5Var);
    }

    @Override // c.a.b.b.g.c.ca
    final /* synthetic */ void f(fa faVar, int r2, fa faVar2) {
        faVar.c((r2 << 3) | 3, faVar2);
    }

    @Override // c.a.b.b.g.c.ca
    final /* synthetic */ void g(fa faVar, ab abVar) throws IOException {
        faVar.h(abVar);
    }

    @Override // c.a.b.b.g.c.ca
    final /* bridge */ /* synthetic */ void h(Object obj, fa faVar) {
        t(obj, faVar);
    }

    @Override // c.a.b.b.g.c.ca
    final boolean i(l9 l9Var) {
        return false;
    }

    @Override // c.a.b.b.g.c.ca
    final /* synthetic */ fa k(Object obj) {
        return ((h7) obj).zzb;
    }

    @Override // c.a.b.b.g.c.ca
    final /* synthetic */ void l(fa faVar, int r2, long j) {
        faVar.c((r2 << 3) | 1, Long.valueOf(j));
    }

    @Override // c.a.b.b.g.c.ca
    final /* synthetic */ void m(fa faVar, ab abVar) throws IOException {
        faVar.e(abVar);
    }

    @Override // c.a.b.b.g.c.ca
    final /* synthetic */ void n(Object obj, fa faVar) {
        t(obj, faVar);
    }

    @Override // c.a.b.b.g.c.ca
    final /* synthetic */ fa o(Object obj) {
        fa faVar = ((h7) obj).zzb;
        if (faVar != fa.a()) {
            return faVar;
        }
        fa faVarG = fa.g();
        t(obj, faVarG);
        return faVarG;
    }

    @Override // c.a.b.b.g.c.ca
    final /* synthetic */ fa p(fa faVar, fa faVar2) {
        fa faVar3 = faVar;
        fa faVar4 = faVar2;
        return faVar4.equals(fa.a()) ? faVar3 : fa.b(faVar3, faVar4);
    }

    @Override // c.a.b.b.g.c.ca
    final void q(Object obj) {
        ((h7) obj).zzb.i();
    }

    @Override // c.a.b.b.g.c.ca
    final /* synthetic */ int r(fa faVar) {
        return faVar.j();
    }

    @Override // c.a.b.b.g.c.ca
    final /* synthetic */ int s(fa faVar) {
        return faVar.k();
    }
}
