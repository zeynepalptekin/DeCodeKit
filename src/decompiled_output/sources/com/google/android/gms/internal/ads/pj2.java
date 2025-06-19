package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
final class pj2 implements ui2 {

    /* renamed from: b, reason: collision with root package name */
    private int f4827b;

    /* renamed from: c, reason: collision with root package name */
    private int f4828c;
    private int[] d;
    private boolean e;
    private int[] f;
    private ByteBuffer g;
    private ByteBuffer h;
    private boolean i;

    public pj2() {
        ByteBuffer byteBuffer = ui2.f5525a;
        this.g = byteBuffer;
        this.h = byteBuffer;
        this.f4827b = -1;
        this.f4828c = -1;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final void a() {
        flush();
        this.g = ui2.f5525a;
        this.f4827b = -1;
        this.f4828c = -1;
        this.f = null;
        this.e = false;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final int b() {
        int[] r0 = this.f;
        return r0 == null ? this.f4827b : r0.length;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final boolean c(int r6, int r7, int r8) throws xi2 {
        boolean z = !Arrays.equals(this.d, this.f);
        int[] r2 = this.d;
        this.f = r2;
        if (r2 == null) {
            this.e = false;
            return z;
        }
        if (r8 != 2) {
            throw new xi2(r6, r7, r8);
        }
        if (!z && this.f4828c == r6 && this.f4827b == r7) {
            return false;
        }
        this.f4828c = r6;
        this.f4827b = r7;
        this.e = r7 != this.f.length;
        int r0 = 0;
        while (true) {
            int[] r22 = this.f;
            if (r0 >= r22.length) {
                return true;
            }
            int r23 = r22[r0];
            if (r23 >= r7) {
                throw new xi2(r6, r7, r8);
            }
            this.e = (r23 != r0) | this.e;
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final boolean d() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final int e() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final void f() {
        this.i = true;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final void flush() {
        this.h = ui2.f5525a;
        this.i = false;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final void g(ByteBuffer byteBuffer) {
        int r0 = byteBuffer.position();
        int r1 = byteBuffer.limit();
        int length = (((r1 - r0) / (this.f4827b * 2)) * this.f.length) << 1;
        if (this.g.capacity() < length) {
            this.g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        while (r0 < r1) {
            for (int r02 : this.f) {
                this.g.putShort(byteBuffer.getShort((r02 * 2) + r0));
            }
            r0 += this.f4827b << 1;
        }
        byteBuffer.position(r1);
        this.g.flip();
        this.h = this.g;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final ByteBuffer h() {
        ByteBuffer byteBuffer = this.h;
        this.h = ui2.f5525a;
        return byteBuffer;
    }

    public final void i(int[] r1) {
        this.d = r1;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final boolean u0() {
        return this.i && this.h == ui2.f5525a;
    }
}
