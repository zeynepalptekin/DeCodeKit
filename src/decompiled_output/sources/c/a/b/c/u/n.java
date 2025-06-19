package c.a.b.c.u;

import androidx.annotation.h0;

/* loaded from: classes.dex */
public class n extends e {

    /* renamed from: a, reason: collision with root package name */
    float f2022a;

    public n() {
        this.f2022a = -1.0f;
    }

    @Deprecated
    public n(float f) {
        this.f2022a = -1.0f;
        this.f2022a = f;
    }

    @Override // c.a.b.c.u.e
    public void b(@h0 q qVar, float f, float f2, float f3) {
        qVar.q(0.0f, f3 * f2, 180.0f, 180.0f - f);
        float f4 = f3 * 2.0f * f2;
        qVar.a(0.0f, 0.0f, f4, f4, 180.0f, f);
    }
}
