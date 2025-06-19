package c.a.b.c.u;

import androidx.annotation.h0;

/* loaded from: classes.dex */
public class f extends e {

    /* renamed from: a, reason: collision with root package name */
    float f2008a;

    public f() {
        this.f2008a = -1.0f;
    }

    @Deprecated
    public f(float f) {
        this.f2008a = -1.0f;
        this.f2008a = f;
    }

    @Override // c.a.b.c.u.e
    public void b(@h0 q qVar, float f, float f2, float f3) {
        qVar.q(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        qVar.n((float) (Math.sin(Math.toRadians(f)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d2));
    }
}
