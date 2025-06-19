package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class jy extends ByteArrayOutputStream {
    private final ti d;

    public jy(ti tiVar, int r3) {
        this.d = tiVar;
        ((ByteArrayOutputStream) this).buf = tiVar.b(Math.max(r3, 256));
    }

    private final void a(int r4) {
        int r0 = ((ByteArrayOutputStream) this).count;
        if (r0 + r4 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] bArrB = this.d.b((r0 + r4) << 1);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrB, 0, ((ByteArrayOutputStream) this).count);
        this.d.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrB;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.d.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int r2) {
        a(1);
        super.write(r2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int r2, int r3) {
        a(r3);
        super.write(bArr, r2, r3);
    }
}
