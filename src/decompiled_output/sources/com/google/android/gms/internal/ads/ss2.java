package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class ss2 extends ps2 {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f5299c;

    @Override // com.google.android.gms.internal.ads.ps2
    public final byte[] a(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = 4;
        if (strArrSplit.length == 1) {
            int r9 = ts2.a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(r9);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (strArrSplit.length < 5) {
                bArr = new byte[strArrSplit.length << 1];
                for (int r4 = 0; r4 < strArrSplit.length; r4++) {
                    int r5 = ts2.a(strArrSplit[r4]);
                    int r52 = (r5 >> 16) ^ (65535 & r5);
                    byte[] bArr2 = {(byte) r52, (byte) (r52 >> 8)};
                    int r53 = r4 << 1;
                    bArr[r53] = bArr2[0];
                    bArr[r53 + 1] = bArr2[1];
                }
            } else {
                bArr = new byte[strArrSplit.length];
                for (int r3 = 0; r3 < strArrSplit.length; r3++) {
                    int r42 = ts2.a(strArrSplit[r3]);
                    bArr[r3] = (byte) ((r42 >> 24) ^ (((r42 & 255) ^ ((r42 >> 8) & 255)) ^ ((r42 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f5299c = b();
        synchronized (this.f4886a) {
            if (this.f5299c == null) {
                return new byte[0];
            }
            this.f5299c.reset();
            this.f5299c.update(bArrArray);
            byte[] bArrDigest = this.f5299c.digest();
            if (bArrDigest.length <= 4) {
                length = bArrDigest.length;
            }
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArrDigest, 0, bArr3, 0, length);
            return bArr3;
        }
    }
}
