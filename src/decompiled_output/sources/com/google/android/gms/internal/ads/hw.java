package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
final class hw extends FilterInputStream {
    private final HttpURLConnection d;

    hw(HttpURLConnection httpURLConnection) {
        super(et.b(httpURLConnection));
        this.d = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.d.disconnect();
    }
}
