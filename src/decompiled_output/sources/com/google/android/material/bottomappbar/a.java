package com.google.android.material.bottomappbar;

import androidx.annotation.h0;
import androidx.annotation.p0;
import androidx.annotation.r;
import c.a.b.c.u.g;
import c.a.b.c.u.q;

/* loaded from: classes.dex */
public class a extends g implements Cloneable {
    private static final int i = 90;
    private static final int j = 180;
    private static final int k = 270;
    private static final int l = 180;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;

    public a(float f, float f2, float f3) {
        this.e = f;
        this.d = f2;
        l(f3);
        this.h = 0.0f;
    }

    @Override // c.a.b.c.u.g
    public void c(float f, float f2, float f3, @h0 q qVar) {
        float f4 = this.f;
        if (f4 == 0.0f) {
            qVar.n(f, 0.0f);
            return;
        }
        float f5 = ((this.e * 2.0f) + f4) / 2.0f;
        float f6 = f3 * this.d;
        float f7 = f2 + this.h;
        float f8 = (this.g * f3) + ((1.0f - f3) * f5);
        if (f8 / f5 >= 1.0f) {
            qVar.n(f, 0.0f);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float fSqrt = (float) Math.sqrt((f9 * f9) - (f10 * f10));
        float f11 = f7 - fSqrt;
        float f12 = f7 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f10));
        float f13 = 90.0f - degrees;
        qVar.n(f11, 0.0f);
        float f14 = f6 * 2.0f;
        qVar.a(f11 - f6, 0.0f, f11 + f6, f14, 270.0f, degrees);
        qVar.a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        qVar.a(f12 - f6, 0.0f, f12 + f6, f14, 270.0f - degrees, degrees);
        qVar.n(f, 0.0f);
    }

    float e() {
        return this.g;
    }

    float f() {
        return this.e;
    }

    float g() {
        return this.d;
    }

    @p0({p0.a.LIBRARY_GROUP})
    public float h() {
        return this.f;
    }

    @p0({p0.a.LIBRARY_GROUP})
    public float k() {
        return this.h;
    }

    void l(@r(from = 0.0d) float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.g = f;
    }

    void m(float f) {
        this.e = f;
    }

    void n(float f) {
        this.d = f;
    }

    @p0({p0.a.LIBRARY_GROUP})
    public void o(float f) {
        this.f = f;
    }

    void p(float f) {
        this.h = f;
    }
}
