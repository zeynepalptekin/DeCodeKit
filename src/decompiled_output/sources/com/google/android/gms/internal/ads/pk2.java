package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public interface pk2 {
    void a(byte[] bArr, int r2, int r3) throws InterruptedException, IOException;

    int b(int r1) throws InterruptedException, IOException;

    void c();

    long d();

    void e(int r1) throws InterruptedException, IOException;

    boolean f(byte[] bArr, int r2, int r3, boolean z) throws InterruptedException, IOException;

    void g(int r1) throws InterruptedException, IOException;

    long getPosition();

    int read(byte[] bArr, int r2, int r3) throws InterruptedException, IOException;

    void readFully(byte[] bArr, int r2, int r3) throws InterruptedException, IOException;
}
