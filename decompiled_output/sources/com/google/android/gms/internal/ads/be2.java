package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface be2 extends Closeable {
    void c(long j) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    ByteBuffer d(long j, long j2) throws IOException;

    long position() throws IOException;

    int read(ByteBuffer byteBuffer) throws IOException;

    long size() throws IOException;
}
