package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class a81 implements zg0 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f2650a;

    public a81(ByteBuffer byteBuffer) {
        this.f2650a = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void a(MessageDigest[] messageDigestArr, long j, int r6) throws IOException {
        ByteBuffer byteBufferSlice;
        synchronized (this.f2650a) {
            int r5 = (int) j;
            this.f2650a.position(r5);
            this.f2650a.limit(r5 + r6);
            byteBufferSlice = this.f2650a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final long size() {
        return this.f2650a.capacity();
    }
}
