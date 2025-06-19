package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class d82 extends k82 {
    private final int i;
    private final int j;

    d82(byte[] bArr, int r3, int r4) {
        super(bArr);
        a82.L(r3, r3 + r4, bArr.length);
        this.i = r3;
        this.j = r4;
    }

    @Override // com.google.android.gms.internal.ads.k82, com.google.android.gms.internal.ads.a82
    public final byte D(int r3) {
        a82.n(r3, size());
        return this.h[this.i + r3];
    }

    @Override // com.google.android.gms.internal.ads.k82, com.google.android.gms.internal.ads.a82
    final byte E(int r3) {
        return this.h[this.i + r3];
    }

    @Override // com.google.android.gms.internal.ads.k82
    protected final int X() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.k82, com.google.android.gms.internal.ads.a82
    protected final void r(byte[] bArr, int r4, int r5, int r6) {
        System.arraycopy(this.h, X() + r4, bArr, r5, r6);
    }

    @Override // com.google.android.gms.internal.ads.k82, com.google.android.gms.internal.ads.a82
    public final int size() {
        return this.j;
    }
}
