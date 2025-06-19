package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class bk2 extends yj2 {

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f2844c;
    public long d;

    /* renamed from: b, reason: collision with root package name */
    public final xj2 f2843b = new xj2();
    private final int e = 0;

    public bk2(int r1) {
    }

    private final ByteBuffer j(int r5) {
        ByteBuffer byteBuffer = this.f2844c;
        int r0 = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(r0);
        sb.append(" < ");
        sb.append(r5);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.yj2
    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f2844c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final boolean h() {
        return d(1073741824);
    }

    public final void i(int r4) throws IllegalStateException {
        ByteBuffer byteBuffer = this.f2844c;
        if (byteBuffer == null) {
            this.f2844c = j(r4);
            return;
        }
        int r0 = byteBuffer.capacity();
        int r1 = this.f2844c.position();
        int r42 = r4 + r1;
        if (r0 >= r42) {
            return;
        }
        ByteBuffer byteBufferJ = j(r42);
        if (r1 > 0) {
            this.f2844c.position(0);
            this.f2844c.limit(r1);
            byteBufferJ.put(this.f2844c);
        }
        this.f2844c = byteBufferJ;
    }
}
