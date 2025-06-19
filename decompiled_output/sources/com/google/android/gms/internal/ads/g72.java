package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class g72 extends w52 {
    g72(byte[] bArr, int r2) throws InvalidKeyException {
        super(bArr, r2);
    }

    @Override // com.google.android.gms.internal.ads.w52
    final int[] f(int[] r12, int r13) {
        if (r12.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(r12.length << 5)));
        }
        int[] r5 = new int[16];
        int[] r0 = new int[16];
        w52.e(r0, this.f5793a);
        r0[12] = r12[0];
        r0[13] = r12[1];
        r0[14] = r12[2];
        r0[15] = r12[3];
        w52.h(r0);
        r0[4] = r0[12];
        r0[5] = r0[13];
        r0[6] = r0[14];
        r0[7] = r0[15];
        w52.e(r5, Arrays.copyOf(r0, 8));
        r5[12] = r13;
        r5[13] = 0;
        r5[14] = r12[4];
        r5[15] = r12[5];
        return r5;
    }

    @Override // com.google.android.gms.internal.ads.w52
    final int g() {
        return 24;
    }
}
