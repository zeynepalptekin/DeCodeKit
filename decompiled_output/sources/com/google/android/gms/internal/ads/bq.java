package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

@androidx.annotation.x0
/* loaded from: classes.dex */
final class bq extends FilterInputStream {
    private final long d;
    private long e;

    bq(InputStream inputStream, long j) {
        super(inputStream);
        this.d = j;
    }

    final long a() {
        return this.d - this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int r0 = super.read();
        if (r0 != -1) {
            this.e++;
        }
        return r0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int r4, int r5) throws IOException {
        int r3 = super.read(bArr, r4, r5);
        if (r3 != -1) {
            this.e += r3;
        }
        return r3;
    }
}
