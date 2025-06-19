package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes.dex */
final class x52 extends w52 {
    x52(byte[] bArr, int r2) throws InvalidKeyException {
        super(bArr, r2);
    }

    @Override // com.google.android.gms.internal.ads.w52
    final int[] f(int[] r4, int r5) {
        if (r4.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(r4.length << 5)));
        }
        int[] r0 = new int[16];
        w52.e(r0, this.f5793a);
        r0[12] = r5;
        System.arraycopy(r4, 0, r0, 13, r4.length);
        return r0;
    }

    @Override // com.google.android.gms.internal.ads.w52
    final int g() {
        return 12;
    }
}
