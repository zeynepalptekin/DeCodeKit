package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ge2 {
    public static final ge2 j = new ge2(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final ge2 k = new ge2(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final ge2 l = new ge2(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final ge2 m = new ge2(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    private final double f3526a;

    /* renamed from: b, reason: collision with root package name */
    private final double f3527b;

    /* renamed from: c, reason: collision with root package name */
    private final double f3528c;
    private final double d;
    private final double e;
    private final double f;
    private final double g;
    private final double h;
    private final double i;

    private ge2(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f3526a = d5;
        this.f3527b = d6;
        this.f3528c = d7;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = d8;
        this.i = d9;
    }

    public static ge2 a(ByteBuffer byteBuffer) {
        double dE = p60.e(byteBuffer);
        double dE2 = p60.e(byteBuffer);
        double dF = p60.f(byteBuffer);
        return new ge2(dE, dE2, p60.e(byteBuffer), p60.e(byteBuffer), dF, p60.f(byteBuffer), p60.f(byteBuffer), p60.e(byteBuffer), p60.e(byteBuffer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ge2.class != obj.getClass()) {
            return false;
        }
        ge2 ge2Var = (ge2) obj;
        return Double.compare(ge2Var.d, this.d) == 0 && Double.compare(ge2Var.e, this.e) == 0 && Double.compare(ge2Var.f, this.f) == 0 && Double.compare(ge2Var.g, this.g) == 0 && Double.compare(ge2Var.h, this.h) == 0 && Double.compare(ge2Var.i, this.i) == 0 && Double.compare(ge2Var.f3526a, this.f3526a) == 0 && Double.compare(ge2Var.f3527b, this.f3527b) == 0 && Double.compare(ge2Var.f3528c, this.f3528c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f3526a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f3527b);
        int r1 = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f3528c);
        int r12 = (r1 * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.d);
        int r13 = (r12 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.e);
        int r14 = (r13 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f);
        int r15 = (r14 * 31) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.g);
        int r16 = (r15 * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.h);
        int r17 = (r16 * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)));
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (r17 * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(j)) {
            return "Rotate 0°";
        }
        if (equals(k)) {
            return "Rotate 90°";
        }
        if (equals(l)) {
            return "Rotate 180°";
        }
        if (equals(m)) {
            return "Rotate 270°";
        }
        double d = this.f3526a;
        double d2 = this.f3527b;
        double d3 = this.f3528c;
        double d4 = this.d;
        double d5 = this.e;
        double d6 = this.f;
        double d7 = this.g;
        double d8 = this.h;
        double d9 = this.i;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
