package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class t52 implements wy1 {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f5348b = new s52();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f5349a;

    public t52(byte[] bArr) throws GeneralSecurityException {
        d72.a(bArr.length);
        this.f5349a = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec b(byte[] bArr, int r3, int r4) throws GeneralSecurityException, ClassNotFoundException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, r4);
        } catch (ClassNotFoundException unused) {
            if (e72.a()) {
                return new IvParameterSpec(bArr, 0, r4);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // com.google.android.gms.internal.ads.wy1
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        byte[] bArrC = c72.c(12);
        System.arraycopy(bArrC, 0, bArr3, 0, 12);
        f5348b.get().init(1, this.f5349a, b(bArrC, 0, bArrC.length));
        if (bArr2 != null && bArr2.length != 0) {
            f5348b.get().updateAAD(bArr2);
        }
        int r13 = f5348b.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (r13 == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(r13 - bArr.length)));
    }
}
