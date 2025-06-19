package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j82 extends OutputStream {
    private static final byte[] i = new byte[0];
    private int f;
    private int h;
    private final int d = 128;
    private final ArrayList<a82> e = new ArrayList<>();
    private byte[] g = new byte[128];

    j82(int r2) {
    }

    private final synchronized int a() {
        return this.f + this.h;
    }

    private final void e(int r4) {
        this.e.add(new k82(this.g));
        int length = this.f + this.g.length;
        this.f = length;
        this.g = new byte[Math.max(this.d, Math.max(r4, length >>> 1))];
        this.h = 0;
    }

    public final synchronized a82 b() {
        if (this.h >= this.g.length) {
            this.e.add(new k82(this.g));
            this.g = i;
        } else if (this.h > 0) {
            byte[] bArr = this.g;
            int r1 = this.h;
            byte[] bArr2 = new byte[r1];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, r1));
            this.e.add(new k82(bArr2));
        }
        this.f += this.h;
        this.h = 0;
        return a82.Q(this.e);
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int r4) {
        if (this.h == this.g.length) {
            e(1);
        }
        byte[] bArr = this.g;
        int r1 = this.h;
        this.h = r1 + 1;
        bArr[r1] = (byte) r4;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int r5, int r6) {
        if (r6 <= this.g.length - this.h) {
            System.arraycopy(bArr, r5, this.g, this.h, r6);
            this.h += r6;
            return;
        }
        int length = this.g.length - this.h;
        System.arraycopy(bArr, r5, this.g, this.h, length);
        int r62 = r6 - length;
        e(r62);
        System.arraycopy(bArr, r5 + length, this.g, 0, r62);
        this.h = r62;
    }
}
