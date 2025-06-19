package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class m52 implements v62 {
    private static final ThreadLocal<Cipher> d = new p52();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f4349a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4350b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4351c;

    public m52(byte[] bArr, int r4) throws GeneralSecurityException {
        d72.a(bArr.length);
        this.f4349a = new SecretKeySpec(bArr, "AES");
        int blockSize = d.get().getBlockSize();
        this.f4351c = blockSize;
        if (r4 < 12 || r4 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f4350b = r4;
    }

    @Override // com.google.android.gms.internal.ads.v62
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int r1 = this.f4350b;
        if (length > ActivityChooserView.f.j - r1) {
            int r2 = ActivityChooserView.f.j - this.f4350b;
            StringBuilder sb = new StringBuilder(43);
            sb.append("plaintext length can not exceed ");
            sb.append(r2);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] bArr2 = new byte[bArr.length + r1];
        byte[] bArrC = c72.c(r1);
        System.arraycopy(bArrC, 0, bArr2, 0, this.f4350b);
        int length2 = bArr.length;
        int r7 = this.f4350b;
        Cipher cipher = d.get();
        byte[] bArr3 = new byte[this.f4351c];
        System.arraycopy(bArrC, 0, bArr3, 0, this.f4350b);
        cipher.init(1, this.f4349a, new IvParameterSpec(bArr3));
        if (cipher.doFinal(bArr, 0, length2, bArr2, r7) == length2) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
