package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class vj2 implements ui2 {
    private wj2 d;
    private ByteBuffer g;
    private ShortBuffer h;
    private ByteBuffer i;
    private long j;
    private long k;
    private boolean l;
    private float e = 1.0f;
    private float f = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    private int f5690b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f5691c = -1;

    public vj2() {
        ByteBuffer byteBuffer = ui2.f5525a;
        this.g = byteBuffer;
        this.h = byteBuffer.asShortBuffer();
        this.i = ui2.f5525a;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final void a() {
        this.d = null;
        ByteBuffer byteBuffer = ui2.f5525a;
        this.g = byteBuffer;
        this.h = byteBuffer.asShortBuffer();
        this.i = ui2.f5525a;
        this.f5690b = -1;
        this.f5691c = -1;
        this.j = 0L;
        this.k = 0L;
        this.l = false;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final int b() {
        return this.f5690b;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final boolean c(int r2, int r3, int r4) throws xi2 {
        if (r4 != 2) {
            throw new xi2(r2, r3, r4);
        }
        if (this.f5691c == r2 && this.f5690b == r3) {
            return false;
        }
        this.f5691c = r2;
        this.f5690b = r3;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final boolean d() {
        return Math.abs(this.e - 1.0f) >= 0.01f || Math.abs(this.f - 1.0f) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final int e() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final void f() {
        this.d.k();
        this.l = true;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final void flush() {
        wj2 wj2Var = new wj2(this.f5691c, this.f5690b);
        this.d = wj2Var;
        wj2Var.a(this.e);
        this.d.j(this.f);
        this.i = ui2.f5525a;
        this.j = 0L;
        this.k = 0L;
        this.l = false;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final void g(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int r1 = byteBuffer.remaining();
            this.j += r1;
            this.d.d(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + r1);
        }
        int r7 = (this.d.l() * this.f5690b) << 1;
        if (r7 > 0) {
            if (this.g.capacity() < r7) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(r7).order(ByteOrder.nativeOrder());
                this.g = byteBufferOrder;
                this.h = byteBufferOrder.asShortBuffer();
            } else {
                this.g.clear();
                this.h.clear();
            }
            this.d.h(this.h);
            this.k += r7;
            this.g.limit(r7);
            this.i = this.g;
        }
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final ByteBuffer h() {
        ByteBuffer byteBuffer = this.i;
        this.i = ui2.f5525a;
        return byteBuffer;
    }

    public final float i(float f) {
        float fA = nq2.a(f, 0.1f, 8.0f);
        this.e = fA;
        return fA;
    }

    public final float j(float f) {
        this.f = nq2.a(f, 0.1f, 8.0f);
        return f;
    }

    public final long k() {
        return this.j;
    }

    public final long l() {
        return this.k;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final boolean u0() {
        if (!this.l) {
            return false;
        }
        wj2 wj2Var = this.d;
        return wj2Var == null || wj2Var.l() == 0;
    }
}
