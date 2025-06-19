package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class mf2 implements zg0 {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f4403a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4404b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4405c;

    public mf2(FileChannel fileChannel, long j, long j2) {
        this.f4403a = fileChannel;
        this.f4404b = j;
        this.f4405c = j2;
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void a(MessageDigest[] messageDigestArr, long j, int r12) throws IOException {
        MappedByteBuffer map = this.f4403a.map(FileChannel.MapMode.READ_ONLY, this.f4404b + j, r12);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final long size() {
        return this.f4405c;
    }
}
