package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kk2 implements wk2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f4101a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f4102b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f4103c;
    private final long[] d;
    private final long[] e;
    private final long f;

    public kk2(int[] r3, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f4102b = r3;
        this.f4103c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = r3.length;
        this.f4101a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final long b(long j) {
        return this.f4103c[nq2.b(this.e, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final long g() {
        return this.f;
    }
}
