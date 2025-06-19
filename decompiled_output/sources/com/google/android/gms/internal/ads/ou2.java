package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes.dex */
final class ou2 extends PushbackInputStream {
    private final /* synthetic */ nu2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ou2(nu2 nu2Var, InputStream inputStream, int r3) {
        super(inputStream, 1);
        this.d = nu2Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.d.f.a();
        super.close();
    }
}
