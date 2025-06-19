package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* loaded from: classes.dex */
final class kw1 extends OutputStream {
    kw1() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int r1) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bv1.b(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int r2, int r3) {
        bv1.b(bArr);
    }
}
