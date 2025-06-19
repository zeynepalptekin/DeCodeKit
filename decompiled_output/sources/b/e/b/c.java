package b.e.b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.i0;
import androidx.annotation.m0;

@m0(21)
/* loaded from: classes.dex */
class c implements f {
    c() {
    }

    private g p(e eVar) {
        return (g) eVar.h();
    }

    @Override // b.e.b.f
    public float a(e eVar) {
        return p(eVar).c();
    }

    @Override // b.e.b.f
    public ColorStateList b(e eVar) {
        return p(eVar).b();
    }

    @Override // b.e.b.f
    public void c(e eVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        eVar.e(new g(colorStateList, f));
        View viewC = eVar.c();
        viewC.setClipToOutline(true);
        viewC.setElevation(f2);
        o(eVar, f3);
    }

    @Override // b.e.b.f
    public void d(e eVar, float f) {
        p(eVar).h(f);
    }

    @Override // b.e.b.f
    public float e(e eVar) {
        return eVar.c().getElevation();
    }

    @Override // b.e.b.f
    public void f(e eVar) {
        if (!eVar.g()) {
            eVar.b(0, 0, 0, 0);
            return;
        }
        float fA = a(eVar);
        float fH = h(eVar);
        int r2 = (int) Math.ceil(h.c(fA, fH, eVar.f()));
        int r0 = (int) Math.ceil(h.d(fA, fH, eVar.f()));
        eVar.b(r2, r0, r2, r0);
    }

    @Override // b.e.b.f
    public void g() {
    }

    @Override // b.e.b.f
    public float h(e eVar) {
        return p(eVar).d();
    }

    @Override // b.e.b.f
    public float i(e eVar) {
        return h(eVar) * 2.0f;
    }

    @Override // b.e.b.f
    public float j(e eVar) {
        return h(eVar) * 2.0f;
    }

    @Override // b.e.b.f
    public void k(e eVar) {
        o(eVar, a(eVar));
    }

    @Override // b.e.b.f
    public void l(e eVar, float f) {
        eVar.c().setElevation(f);
    }

    @Override // b.e.b.f
    public void m(e eVar) {
        o(eVar, a(eVar));
    }

    @Override // b.e.b.f
    public void n(e eVar, @i0 ColorStateList colorStateList) {
        p(eVar).f(colorStateList);
    }

    @Override // b.e.b.f
    public void o(e eVar, float f) {
        p(eVar).g(f, eVar.g(), eVar.f());
        f(eVar);
    }
}
