package c.a.b.c.u;

import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class i extends g {

    /* renamed from: a, reason: collision with root package name */
    private final float f2012a;

    public i(float f) {
        this.f2012a = f - 0.001f;
    }

    @Override // c.a.b.c.u.g
    boolean b() {
        return true;
    }

    @Override // c.a.b.c.u.g
    public void c(float f, float f2, float f3, @h0 q qVar) {
        float fSqrt = (float) ((this.f2012a * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f2012a, 2.0d) - Math.pow(fSqrt, 2.0d));
        qVar.p(f2 - fSqrt, ((float) (-((this.f2012a * Math.sqrt(2.0d)) - this.f2012a))) + fSqrt2);
        qVar.n(f2, (float) (-((this.f2012a * Math.sqrt(2.0d)) - this.f2012a)));
        qVar.n(f2 + fSqrt, ((float) (-((this.f2012a * Math.sqrt(2.0d)) - this.f2012a))) + fSqrt2);
    }
}
