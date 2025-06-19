package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
final class vb2 extends InputStream {
    private sb2 d;
    private h82 e;
    private int f;
    private int g;
    private int h;
    private int i;
    private final /* synthetic */ rb2 j;

    public vb2(rb2 rb2Var) {
        this.j = rb2Var;
        a();
    }

    private final void a() {
        sb2 sb2Var = new sb2(this.j, null);
        this.d = sb2Var;
        h82 h82Var = (h82) sb2Var.next();
        this.e = h82Var;
        this.f = h82Var.size();
        this.g = 0;
        this.h = 0;
    }

    private final void b() {
        if (this.e != null) {
            int r0 = this.g;
            int r1 = this.f;
            if (r0 == r1) {
                this.h += r1;
                this.g = 0;
                if (!this.d.hasNext()) {
                    this.e = null;
                    this.f = 0;
                } else {
                    h82 h82Var = (h82) this.d.next();
                    this.e = h82Var;
                    this.f = h82Var.size();
                }
            }
        }
    }

    private final int e(byte[] bArr, int r6, int r7) {
        int r0 = r7;
        while (r0 > 0) {
            b();
            if (this.e == null) {
                break;
            }
            int r1 = Math.min(this.f - this.g, r0);
            if (bArr != null) {
                this.e.l(bArr, this.g, r6, r1);
                r6 += r1;
            }
            this.g += r1;
            r0 -= r1;
        }
        return r7 - r0;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.j.size() - (this.h + this.g);
    }

    @Override // java.io.InputStream
    public final void mark(int r2) {
        this.i = this.h + this.g;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        b();
        h82 h82Var = this.e;
        if (h82Var == null) {
            return -1;
        }
        int r1 = this.g;
        this.g = r1 + 1;
        return h82Var.D(r1) & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int r3, int r4) {
        if (bArr == null) {
            throw null;
        }
        if (r3 < 0 || r4 < 0 || r4 > bArr.length - r3) {
            throw new IndexOutOfBoundsException();
        }
        int r2 = e(bArr, r3, r4);
        if (r2 == 0) {
            return -1;
        }
        return r2;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        a();
        e(null, 0, this.i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return e(null, 0, (int) j);
    }
}
