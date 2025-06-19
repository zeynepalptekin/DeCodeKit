package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class u52 {
    public static final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int r6) {
        if (r6 < 0 || byteBuffer2.remaining() < r6 || byteBuffer3.remaining() < r6 || byteBuffer.remaining() < r6) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int r0 = 0; r0 < r6; r0++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] b(byte[] bArr, int r5, byte[] bArr2, int r7, int r8) {
        if (r8 < 0 || bArr.length - r8 < r5 || bArr2.length - r8 < r7) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[r8];
        for (int r1 = 0; r1 < r8; r1++) {
            bArr3[r1] = (byte) (bArr[r1 + r5] ^ bArr2[r1 + r7]);
        }
        return bArr3;
    }

    public static byte[] c(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > ActivityChooserView.f.j - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static final byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return b(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }
}
