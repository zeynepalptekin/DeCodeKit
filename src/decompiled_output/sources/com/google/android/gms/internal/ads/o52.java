package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class o52 implements wy1 {
    private static final ThreadLocal<Cipher> e = new r52();
    private static final ThreadLocal<Cipher> f = new q52();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f4647a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f4648b;

    /* renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f4649c;
    private final int d;

    public o52(byte[] bArr, int r4) throws GeneralSecurityException {
        if (r4 != 12 && r4 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.d = r4;
        d72.a(bArr.length);
        this.f4649c = new SecretKeySpec(bArr, "AES");
        Cipher cipher = e.get();
        cipher.init(1, this.f4649c);
        byte[] bArrD = d(cipher.doFinal(new byte[16]));
        this.f4647a = bArrD;
        this.f4648b = d(bArrD);
    }

    private final byte[] b(Cipher cipher, int r8, byte[] bArr, int r10, int r11) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrC;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) r8;
        if (r11 == 0) {
            return cipher.doFinal(c(bArr2, this.f4647a));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int r2 = 0;
        while (r11 - r2 > 16) {
            for (int r3 = 0; r3 < 16; r3++) {
                bArrDoFinal[r3] = (byte) (bArrDoFinal[r3] ^ bArr[(r10 + r2) + r3]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            r2 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, r2 + r10, r10 + r11);
        if (bArrCopyOfRange.length == 16) {
            bArrC = c(bArrCopyOfRange, this.f4647a);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.f4648b, 16);
            for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
                bArrCopyOf[r1] = (byte) (bArrCopyOf[r1] ^ bArrCopyOfRange[r1]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
            bArrC = bArrCopyOf;
        }
        return cipher.doFinal(c(bArrDoFinal, bArrC));
    }

    private static byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int r2 = 0; r2 < length; r2++) {
            bArr3[r2] = (byte) (bArr[r2] ^ bArr2[r2]);
        }
        return bArr3;
    }

    private static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int r2 = 0;
        while (r2 < 15) {
            int r4 = r2 + 1;
            bArr2[r2] = (byte) ((bArr[r2] << 1) ^ ((bArr[r4] & 255) >>> 7));
            r2 = r4;
        }
        bArr2[15] = (byte) ((bArr[15] << 1) ^ ((bArr[0] & 128) != 0 ? 135 : 0));
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.wy1
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int r1 = this.d;
        if (length > (ActivityChooserView.f.j - r1) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + r1 + 16];
        byte[] bArrC = c72.c(r1);
        System.arraycopy(bArrC, 0, bArr3, 0, this.d);
        Cipher cipher = e.get();
        cipher.init(1, this.f4649c);
        byte[] bArrB = b(cipher, 0, bArrC, 0, bArrC.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrB2 = b(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = f.get();
        cipher2.init(1, this.f4649c, new IvParameterSpec(bArrB));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.d);
        byte[] bArrB3 = b(cipher, 2, bArr3, this.d, bArr.length);
        int length2 = bArr.length + this.d;
        for (int r10 = 0; r10 < 16; r10++) {
            bArr3[length2 + r10] = (byte) ((bArrB2[r10] ^ bArrB[r10]) ^ bArrB3[r10]);
        }
        return bArr3;
    }
}
