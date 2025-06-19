package c.a.b.c.u;

import androidx.annotation.h0;

/* loaded from: classes.dex */
public class t extends g {

    /* renamed from: a, reason: collision with root package name */
    private final float f2053a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2054b;

    public t(float f, boolean z) {
        this.f2053a = f;
        this.f2054b = z;
    }

    @Override // c.a.b.c.u.g
    public void c(float f, float f2, float f3, @h0 q qVar) {
        qVar.n(f2 - (this.f2053a * f3), 0.0f);
        qVar.n(f2, (this.f2054b ? this.f2053a : -this.f2053a) * f3);
        qVar.n(f2 + (this.f2053a * f3), 0.0f);
        qVar.n(f, 0.0f);
    }
}
