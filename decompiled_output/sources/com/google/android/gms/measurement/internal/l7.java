package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

@androidx.annotation.y0
/* loaded from: classes.dex */
final class l7 implements Runnable {
    private final URL d;
    private final byte[] e;
    private final m7 f;
    private final String g;
    private final Map<String, String> h;
    private final /* synthetic */ j7 i;

    public l7(j7 j7Var, String str, URL url, byte[] bArr, Map<String, String> map, m7 m7Var) {
        this.i = j7Var;
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.k(url);
        com.google.android.gms.common.internal.r.k(m7Var);
        this.d = url;
        this.e = null;
        this.f = m7Var;
        this.g = str;
        this.h = null;
    }

    private final void b(final int r9, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) throws IllegalStateException {
        this.i.x().v(new Runnable(this, r9, exc, bArr, map) { // from class: com.google.android.gms.measurement.internal.o7
            private final l7 d;
            private final int e;
            private final Exception f;
            private final byte[] g;
            private final Map h;

            {
                this.d = this;
                this.e = r9;
                this.f = exc;
                this.g = bArr;
                this.h = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.a(this.e, this.f, this.g, this.h);
            }
        });
    }

    final /* synthetic */ void a(int r7, Exception exc, byte[] bArr, Map map) {
        this.f.a(this.g, r7, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnectionQ;
        Map<String, List<String>> headerFields;
        this.i.b();
        int responseCode = 0;
        try {
            httpURLConnectionQ = this.i.q(this.d);
            try {
                responseCode = httpURLConnectionQ.getResponseCode();
                headerFields = httpURLConnectionQ.getHeaderFields();
                try {
                    j7 j7Var = this.i;
                    byte[] bArrS = j7.s(httpURLConnectionQ);
                    if (httpURLConnectionQ != null) {
                        httpURLConnectionQ.disconnect();
                    }
                    b(responseCode, null, bArrS, headerFields);
                } catch (IOException e) {
                    e = e;
                    if (httpURLConnectionQ != null) {
                        httpURLConnectionQ.disconnect();
                    }
                    b(responseCode, e, null, headerFields);
                } catch (Throwable th) {
                    th = th;
                    if (httpURLConnectionQ != null) {
                        httpURLConnectionQ.disconnect();
                    }
                    b(responseCode, null, null, headerFields);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                headerFields = null;
            } catch (Throwable th2) {
                th = th2;
                headerFields = null;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnectionQ = null;
            headerFields = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnectionQ = null;
            headerFields = null;
        }
    }
}
