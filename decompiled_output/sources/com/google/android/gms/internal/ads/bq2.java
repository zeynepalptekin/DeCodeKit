package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class bq2 {

    /* renamed from: a, reason: collision with root package name */
    private int f2866a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f2867b;

    public bq2() {
        this(32);
    }

    private bq2(int r1) {
        this.f2867b = new long[32];
    }

    public final void a(long j) {
        int r0 = this.f2866a;
        long[] jArr = this.f2867b;
        if (r0 == jArr.length) {
            this.f2867b = Arrays.copyOf(jArr, r0 << 1);
        }
        long[] jArr2 = this.f2867b;
        int r1 = this.f2866a;
        this.f2866a = r1 + 1;
        jArr2[r1] = j;
    }

    public final long b(int r5) {
        if (r5 >= 0 && r5 < this.f2866a) {
            return this.f2867b[r5];
        }
        int r1 = this.f2866a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(r5);
        sb.append(", size is ");
        sb.append(r1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int c() {
        return this.f2866a;
    }
}
