package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class hv implements be2 {
    private final ByteBuffer d;

    hv(ByteBuffer byteBuffer) {
        this.d = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.be2
    public final void c(long j) throws IOException {
        this.d.position((int) j);
    }

    @Override // com.google.android.gms.internal.ads.be2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.be2
    public final ByteBuffer d(long j, long j2) throws IOException {
        int r0 = this.d.position();
        this.d.position((int) j);
        ByteBuffer byteBufferSlice = this.d.slice();
        byteBufferSlice.limit((int) j2);
        this.d.position(r0);
        return byteBufferSlice;
    }

    @Override // com.google.android.gms.internal.ads.be2
    public final long position() throws IOException {
        return this.d.position();
    }

    @Override // com.google.android.gms.internal.ads.be2
    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.d.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int r0 = Math.min(byteBuffer.remaining(), this.d.remaining());
        byte[] bArr = new byte[r0];
        this.d.get(bArr);
        byteBuffer.put(bArr);
        return r0;
    }

    @Override // com.google.android.gms.internal.ads.be2
    public final long size() throws IOException {
        return this.d.limit();
    }
}
