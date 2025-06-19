package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
abstract class y52 implements wy1 {

    /* renamed from: a, reason: collision with root package name */
    private final w52 f6094a;

    /* renamed from: b, reason: collision with root package name */
    private final w52 f6095b;

    public y52(byte[] bArr) throws InvalidKeyException {
        this.f6094a = b(bArr, 1);
        this.f6095b = b(bArr, 0);
    }

    @Override // com.google.android.gms.internal.ads.wy1
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > (ActivityChooserView.f.j - this.f6094a.g()) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + this.f6094a.g() + 16);
        if (byteBufferAllocate.remaining() < bArr.length + this.f6094a.g() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int r1 = byteBufferAllocate.position();
        this.f6094a.c(byteBufferAllocate, bArr);
        byteBufferAllocate.position(r1);
        byte[] bArr3 = new byte[this.f6094a.g()];
        byteBufferAllocate.get(bArr3);
        byteBufferAllocate.limit(byteBufferAllocate.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        this.f6095b.i(bArr3, 0).get(bArr4);
        int length = bArr2.length % 16 == 0 ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
        int r2 = byteBufferAllocate.remaining();
        int r3 = r2 % 16;
        int r4 = (r3 == 0 ? r2 : (r2 + 16) - r3) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(r4 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr2);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBufferAllocate);
        byteBufferOrder.position(r4);
        byteBufferOrder.putLong(bArr2.length);
        byteBufferOrder.putLong(r2);
        byte[] bArrB = y62.b(bArr4, byteBufferOrder.array());
        byteBufferAllocate.limit(byteBufferAllocate.limit() + 16);
        byteBufferAllocate.put(bArrB);
        return byteBufferAllocate.array();
    }

    abstract w52 b(byte[] bArr, int r2) throws InvalidKeyException;
}
