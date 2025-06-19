package c.a.b.c.u;

import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class l extends g {

    /* renamed from: a, reason: collision with root package name */
    private final g f2019a;

    /* renamed from: b, reason: collision with root package name */
    private final float f2020b;

    public l(@h0 g gVar, float f) {
        this.f2019a = gVar;
        this.f2020b = f;
    }

    @Override // c.a.b.c.u.g
    boolean b() {
        return this.f2019a.b();
    }

    @Override // c.a.b.c.u.g
    public void c(float f, float f2, float f3, @h0 q qVar) {
        this.f2019a.c(f, f2 - this.f2020b, f3, qVar);
    }
}
