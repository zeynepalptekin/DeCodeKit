package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class hq2 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3710a;

    /* renamed from: b, reason: collision with root package name */
    private int f3711b;

    /* renamed from: c, reason: collision with root package name */
    private int f3712c;

    public hq2() {
    }

    public hq2(int r2) {
        this.f3710a = new byte[r2];
        this.f3712c = r2;
    }

    public hq2(byte[] bArr) {
        this.f3710a = bArr;
        this.f3712c = bArr.length;
    }

    public final int a() {
        byte[] bArr = this.f3710a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int b() {
        return this.f3711b;
    }

    public final int c() {
        return this.f3712c;
    }

    public final int d() {
        byte[] bArr = this.f3710a;
        int r1 = this.f3711b;
        int r2 = r1 + 1;
        this.f3711b = r2;
        int r12 = (bArr[r1] & 255) << 24;
        int r3 = r2 + 1;
        this.f3711b = r3;
        int r13 = r12 | ((bArr[r2] & 255) << 16);
        int r22 = r3 + 1;
        this.f3711b = r22;
        int r14 = r13 | ((bArr[r3] & 255) << 8);
        this.f3711b = r22 + 1;
        return (bArr[r22] & 255) | r14;
    }

    public final long e() {
        byte[] bArr = this.f3710a;
        int r2 = this.f3711b + 1;
        this.f3711b = r2;
        long j = (bArr[r1] & 255) << 56;
        int r1 = r2 + 1;
        this.f3711b = r1;
        int r4 = r1 + 1;
        this.f3711b = r4;
        long j2 = j | ((bArr[r2] & 255) << 48) | ((bArr[r1] & 255) << 40);
        int r3 = r4 + 1;
        this.f3711b = r3;
        long j3 = j2 | ((bArr[r4] & 255) << 32);
        int r42 = r3 + 1;
        this.f3711b = r42;
        long j4 = j3 | ((bArr[r3] & 255) << 24);
        int r32 = r42 + 1;
        this.f3711b = r32;
        long j5 = j4 | ((bArr[r42] & 255) << 16);
        int r43 = r32 + 1;
        this.f3711b = r43;
        long j6 = j5 | ((bArr[r32] & 255) << 8);
        this.f3711b = r43 + 1;
        return j6 | (bArr[r43] & 255);
    }

    public final short f() {
        byte[] bArr = this.f3710a;
        int r1 = this.f3711b;
        int r2 = r1 + 1;
        this.f3711b = r2;
        int r12 = (bArr[r1] & 255) << 8;
        this.f3711b = r2 + 1;
        return (short) ((bArr[r2] & 255) | r12);
    }

    public final int g() {
        byte[] bArr = this.f3710a;
        int r1 = this.f3711b;
        this.f3711b = r1 + 1;
        return bArr[r1] & 255;
    }

    public final int h() {
        byte[] bArr = this.f3710a;
        int r1 = this.f3711b;
        int r2 = r1 + 1;
        this.f3711b = r2;
        int r12 = (bArr[r1] & 255) << 8;
        this.f3711b = r2 + 1;
        return (bArr[r2] & 255) | r12;
    }

    public final void i() {
        this.f3711b = 0;
        this.f3712c = 0;
    }

    public final void j(int r2) {
        o(a() < r2 ? new byte[r2] : this.f3710a, r2);
    }

    public final void k(int r2) {
        vp2.a(r2 >= 0 && r2 <= this.f3710a.length);
        this.f3712c = r2;
    }

    public final void l(int r2) {
        vp2.a(r2 >= 0 && r2 <= this.f3712c);
        this.f3711b = r2;
    }

    public final void m(int r2) {
        l(this.f3711b + r2);
    }

    public final String n(int r5) {
        if (r5 == 0) {
            return "";
        }
        int r0 = (this.f3711b + r5) - 1;
        String str = new String(this.f3710a, this.f3711b, (r0 >= this.f3712c || this.f3710a[r0] != 0) ? r5 : r5 - 1);
        this.f3711b += r5;
        return str;
    }

    public final void o(byte[] bArr, int r2) {
        this.f3710a = bArr;
        this.f3712c = r2;
        this.f3711b = 0;
    }

    public final void p(byte[] bArr, int r4, int r5) {
        System.arraycopy(this.f3710a, this.f3711b, bArr, r4, r5);
        this.f3711b += r5;
    }

    public final int q() {
        return this.f3712c - this.f3711b;
    }

    public final int r() {
        byte[] bArr = this.f3710a;
        int r1 = this.f3711b;
        int r2 = r1 + 1;
        this.f3711b = r2;
        int r12 = bArr[r1] & 255;
        this.f3711b = r2 + 1;
        return ((bArr[r2] & 255) << 8) | r12;
    }

    public final long s() {
        byte[] bArr = this.f3710a;
        int r2 = this.f3711b + 1;
        this.f3711b = r2;
        long j = (bArr[r1] & 255) << 24;
        int r1 = r2 + 1;
        this.f3711b = r1;
        int r4 = r1 + 1;
        this.f3711b = r4;
        long j2 = j | ((bArr[r2] & 255) << 16) | ((bArr[r1] & 255) << 8);
        this.f3711b = r4 + 1;
        return j2 | (bArr[r4] & 255);
    }

    public final long t() {
        byte[] bArr = this.f3710a;
        int r2 = this.f3711b + 1;
        this.f3711b = r2;
        long j = bArr[r1] & 255;
        int r1 = r2 + 1;
        this.f3711b = r1;
        int r4 = r1 + 1;
        this.f3711b = r4;
        long j2 = j | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        this.f3711b = r4 + 1;
        return j2 | ((bArr[r4] & 255) << 24);
    }

    public final int u() {
        byte[] bArr = this.f3710a;
        int r1 = this.f3711b;
        int r2 = r1 + 1;
        this.f3711b = r2;
        int r12 = (bArr[r1] & 255) << 8;
        int r3 = r2 + 1;
        this.f3711b = r3;
        int r0 = (bArr[r2] & 255) | r12;
        this.f3711b = r3 + 2;
        return r0;
    }

    public final int v() {
        int r0 = d();
        if (r0 >= 0) {
            return r0;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(r0);
        throw new IllegalStateException(sb.toString());
    }

    public final long w() {
        long jE = e();
        if (jE >= 0) {
            return jE;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(jE);
        throw new IllegalStateException(sb.toString());
    }

    public final String x() {
        if (q() == 0) {
            return null;
        }
        int r0 = this.f3711b;
        while (r0 < this.f3712c && this.f3710a[r0] != 0) {
            r0++;
        }
        byte[] bArr = this.f3710a;
        int r3 = this.f3711b;
        String str = new String(bArr, r3, r0 - r3);
        this.f3711b = r0;
        if (r0 < this.f3712c) {
            this.f3711b = r0 + 1;
        }
        return str;
    }
}
