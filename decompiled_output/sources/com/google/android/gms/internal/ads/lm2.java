package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class lm2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4277a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f4278b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f4279c;
    public final int d;
    public final long[] e;
    public final int[] f;

    public lm2(long[] jArr, int[] r6, int r7, long[] jArr2, int[] r9) {
        vp2.a(r6.length == jArr2.length);
        vp2.a(jArr.length == jArr2.length);
        vp2.a(r9.length == jArr2.length);
        this.f4278b = jArr;
        this.f4279c = r6;
        this.d = r7;
        this.e = jArr2;
        this.f = r9;
        this.f4277a = jArr.length;
    }

    public final int a(long j) {
        for (int r4 = nq2.b(this.e, j, true, false); r4 >= 0; r4--) {
            if ((this.f[r4] & 1) != 0) {
                return r4;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int r4 = nq2.h(this.e, j, true, false); r4 < this.e.length; r4++) {
            if ((this.f[r4] & 1) != 0) {
                return r4;
            }
        }
        return -1;
    }
}
