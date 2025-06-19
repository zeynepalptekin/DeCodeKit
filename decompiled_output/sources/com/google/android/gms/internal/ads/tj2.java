package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class tj2 implements ui2 {

    /* renamed from: b, reason: collision with root package name */
    private int f5411b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f5412c = -1;
    private int d = 0;
    private ByteBuffer e;
    private ByteBuffer f;
    private boolean g;

    public tj2() {
        ByteBuffer byteBuffer = ui2.f5525a;
        this.e = byteBuffer;
        this.f = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final void a() {
        flush();
        this.e = ui2.f5525a;
        this.f5411b = -1;
        this.f5412c = -1;
        this.d = 0;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final int b() {
        return this.f5412c;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final boolean c(int r3, int r4, int r5) throws xi2 {
        if (r5 != 3 && r5 != 2 && r5 != Integer.MIN_VALUE && r5 != 1073741824) {
            throw new xi2(r3, r4, r5);
        }
        if (this.f5411b == r3 && this.f5412c == r4 && this.d == r5) {
            return false;
        }
        this.f5411b = r3;
        this.f5412c = r4;
        this.d = r5;
        if (r5 != 2) {
            return true;
        }
        this.e = ui2.f5525a;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final boolean d() {
        int r0 = this.d;
        return (r0 == 0 || r0 == 2) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final int e() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final void f() {
        this.g = true;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final void flush() {
        this.f = ui2.f5525a;
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[ADDED_TO_REGION, LOOP:2: B:25:0x0081->B:26:0x0083, LOOP_START, PHI: r0
  0x0081: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0041, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.ui2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L20
            if (r3 == r6) goto L21
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L23
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 / r6
        L21:
            int r2 = r2 << 1
        L23:
            java.nio.ByteBuffer r3 = r7.e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L3a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.e = r2
            goto L3f
        L3a:
            java.nio.ByteBuffer r2 = r7.e
            r2.clear()
        L3f:
            int r2 = r7.d
            if (r2 == r5) goto L81
            if (r2 == r6) goto L68
            if (r2 != r4) goto L62
        L47:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L47
        L62:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L68:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L68
        L81:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L81
        L9c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.e
            r7.f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tj2.g(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final ByteBuffer h() {
        ByteBuffer byteBuffer = this.f;
        this.f = ui2.f5525a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.ui2
    public final boolean u0() {
        return this.g && this.f == ui2.f5525a;
    }
}
