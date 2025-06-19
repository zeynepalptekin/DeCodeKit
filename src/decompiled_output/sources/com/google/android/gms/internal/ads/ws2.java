package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ws2 extends ps2 {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f5885c;
    private final int d;
    private final int e;

    public ws2(int r3) {
        int r0 = r3 / 8;
        this.d = r3 % 8 > 0 ? r0 + 1 : r0;
        this.e = r3;
    }

    @Override // com.google.android.gms.internal.ads.ps2
    public final byte[] a(String str) {
        synchronized (this.f4886a) {
            MessageDigest messageDigestB = b();
            this.f5885c = messageDigestB;
            if (messageDigestB == null) {
                return new byte[0];
            }
            messageDigestB.reset();
            this.f5885c.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] bArrDigest = this.f5885c.digest();
            int length = bArrDigest.length > this.d ? this.d : bArrDigest.length;
            byte[] bArr = new byte[length];
            System.arraycopy(bArrDigest, 0, bArr, 0, length);
            if (this.e % 8 > 0) {
                long j = 0;
                for (int r2 = 0; r2 < length; r2++) {
                    if (r2 > 0) {
                        j <<= 8;
                    }
                    j += bArr[r2] & 255;
                }
                long j2 = j >>> (8 - (this.e % 8));
                for (int r10 = this.d - 1; r10 >= 0; r10--) {
                    bArr[r10] = (byte) (255 & j2);
                    j2 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
