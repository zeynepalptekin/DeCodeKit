package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
abstract class w52 implements v62 {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f5792c = j(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a, reason: collision with root package name */
    int[] f5793a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5794b;

    w52(byte[] bArr, int r4) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f5793a = j(bArr);
        this.f5794b = r4;
    }

    private static int b(int r1, int r2) {
        return (r1 >>> (-r2)) | (r1 << r2);
    }

    private static void d(int[] r2, int r3, int r4, int r5, int r6) {
        r2[r3] = r2[r3] + r2[r4];
        r2[r6] = b(r2[r6] ^ r2[r3], 16);
        r2[r5] = r2[r5] + r2[r6];
        r2[r4] = b(r2[r4] ^ r2[r5], 12);
        r2[r3] = r2[r3] + r2[r4];
        r2[r6] = b(r2[r3] ^ r2[r6], 8);
        r2[r5] = r2[r5] + r2[r6];
        r2[r4] = b(r2[r4] ^ r2[r5], 7);
    }

    static void e(int[] r3, int[] r4) {
        int[] r0 = f5792c;
        System.arraycopy(r0, 0, r3, 0, r0.length);
        System.arraycopy(r4, 0, r3, f5792c.length, 8);
    }

    static void h(int[] r16) {
        for (int r2 = 0; r2 < 10; r2++) {
            d(r16, 0, 4, 8, 12);
            d(r16, 1, 5, 9, 13);
            d(r16, 2, 6, 10, 14);
            d(r16, 3, 7, 11, 15);
            d(r16, 0, 5, 10, 15);
            d(r16, 1, 6, 11, 12);
            d(r16, 2, 7, 8, 13);
            d(r16, 3, 4, 9, 14);
        }
    }

    private static int[] j(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] r0 = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(r0);
        return r0;
    }

    @Override // com.google.android.gms.internal.ads.v62
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > ActivityChooserView.f.j - g()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(g() + bArr.length);
        c(byteBufferAllocate, bArr);
        return byteBufferAllocate.array();
    }

    final void c(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - g() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] bArrC = c72.c(g());
        byteBuffer.put(bArrC);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int r1 = byteBufferWrap.remaining();
        int r2 = (r1 / 64) + 1;
        for (int r3 = 0; r3 < r2; r3++) {
            ByteBuffer byteBufferI = i(bArrC, this.f5794b + r3);
            if (r3 == r2 - 1) {
                u52.a(byteBuffer, byteBufferWrap, byteBufferI, r1 % 64);
            } else {
                u52.a(byteBuffer, byteBufferWrap, byteBufferI, 64);
            }
        }
    }

    abstract int[] f(int[] r1, int r2);

    abstract int g();

    final ByteBuffer i(byte[] bArr, int r6) {
        int[] r5 = f(j(bArr), r6);
        int[] r62 = (int[]) r5.clone();
        h(r62);
        for (int r1 = 0; r1 < r5.length; r1++) {
            r5[r1] = r5[r1] + r62[r1];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(r5, 0, 16);
        return byteBufferOrder;
    }
}
