package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class nk2 implements pk2 {
    private static final byte[] g = new byte[4096];

    /* renamed from: a, reason: collision with root package name */
    private final ip2 f4557a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4558b;

    /* renamed from: c, reason: collision with root package name */
    private long f4559c;
    private byte[] d = new byte[65536];
    private int e;
    private int f;

    public nk2(ip2 ip2Var, long j, long j2) {
        this.f4557a = ip2Var;
        this.f4559c = j;
        this.f4558b = j2;
    }

    private final int h(byte[] bArr, int r3, int r4, int r5, boolean z) throws InterruptedException, IOException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int r2 = this.f4557a.read(bArr, r3 + r5, r4 - r5);
        if (r2 != -1) {
            return r5 + r2;
        }
        if (r5 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private final int i(int r2) {
        int r22 = Math.min(this.f, r2);
        j(r22);
        return r22;
    }

    private final void j(int r6) {
        int r0 = this.f - r6;
        this.f = r0;
        this.e = 0;
        byte[] bArr = this.d;
        if (r0 < bArr.length - 524288) {
            bArr = new byte[r0 + 65536];
        }
        System.arraycopy(this.d, r6, bArr, 0, this.f);
        this.d = bArr;
    }

    private final void k(int r5) {
        if (r5 != -1) {
            this.f4559c += r5;
        }
    }

    private final int l(byte[] bArr, int r4, int r5) {
        int r0 = this.f;
        if (r0 == 0) {
            return 0;
        }
        int r52 = Math.min(r0, r5);
        System.arraycopy(this.d, 0, bArr, r4, r52);
        j(r52);
        return r52;
    }

    private final boolean m(int r10, boolean z) throws InterruptedException, IOException {
        int r11 = this.e + r10;
        byte[] bArr = this.d;
        if (r11 > bArr.length) {
            this.d = Arrays.copyOf(this.d, nq2.p(bArr.length << 1, 65536 + r11, r11 + 524288));
        }
        int r7 = Math.min(this.f - this.e, r10);
        while (r7 < r10) {
            r7 = h(this.d, this.e, r10, r7, false);
            if (r7 == -1) {
                return false;
            }
        }
        int r112 = this.e + r10;
        this.e = r112;
        this.f = Math.max(this.f, r112);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.pk2
    public final void a(byte[] bArr, int r4, int r5) throws InterruptedException, IOException {
        if (m(r5, false)) {
            System.arraycopy(this.d, this.e - r5, bArr, r4, r5);
        }
    }

    @Override // com.google.android.gms.internal.ads.pk2
    public final int b(int r8) throws InterruptedException, IOException {
        int i = i(r8);
        if (i == 0) {
            byte[] bArr = g;
            i = h(bArr, 0, Math.min(r8, bArr.length), 0, true);
        }
        k(i);
        return i;
    }

    @Override // com.google.android.gms.internal.ads.pk2
    public final void c() {
        this.e = 0;
    }

    @Override // com.google.android.gms.internal.ads.pk2
    public final long d() {
        return this.f4558b;
    }

    @Override // com.google.android.gms.internal.ads.pk2
    public final void e(int r8) throws InterruptedException, IOException {
        int i = i(r8);
        while (i < r8 && i != -1) {
            byte[] bArr = g;
            i = h(bArr, -i, Math.min(r8, bArr.length + i), i, false);
        }
        k(i);
    }

    @Override // com.google.android.gms.internal.ads.pk2
    public final boolean f(byte[] bArr, int r9, int r10, boolean z) throws InterruptedException, IOException {
        int r5 = l(bArr, r9, r10);
        while (r5 < r10 && r5 != -1) {
            r5 = h(bArr, r9, r10, r5, z);
        }
        k(r5);
        return r5 != -1;
    }

    @Override // com.google.android.gms.internal.ads.pk2
    public final void g(int r2) throws InterruptedException, IOException {
        m(r2, false);
    }

    @Override // com.google.android.gms.internal.ads.pk2
    public final long getPosition() {
        return this.f4559c;
    }

    @Override // com.google.android.gms.internal.ads.pk2
    public final int read(byte[] bArr, int r9, int r10) throws InterruptedException, IOException {
        int r0 = l(bArr, r9, r10);
        if (r0 == 0) {
            r0 = h(bArr, r9, r10, 0, true);
        }
        k(r0);
        return r0;
    }

    @Override // com.google.android.gms.internal.ads.pk2
    public final void readFully(byte[] bArr, int r3, int r4) throws InterruptedException, IOException {
        f(bArr, r3, r4, false);
    }
}
