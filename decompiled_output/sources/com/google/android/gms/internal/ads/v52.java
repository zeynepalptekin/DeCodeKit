package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class v52 {
    static byte[] a(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int r3 = 0; r3 < 16; r3++) {
            bArr2[r3] = (byte) ((bArr[r3] << 1) & 254);
            if (r3 < 15) {
                bArr2[r3] = (byte) (bArr2[r3] | ((byte) ((bArr[r3 + 1] >> 7) & 1)));
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
