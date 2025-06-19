package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
final class qu implements ip2 {
    private static final Pattern q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> r = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final int f5063b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5064c;
    private final String d;
    private final xp2<? super qu> f;
    private jp2 g;
    private HttpURLConnection h;
    private InputStream i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private long n;
    private int o;

    /* renamed from: a, reason: collision with root package name */
    private SSLSocketFactory f5062a = new tu(this);
    private Set<Socket> p = new HashSet();
    private final qp2 e = new qp2();

    qu(String str, xp2<? super qu> xp2Var, int r4, int r5, int r6) {
        this.d = vp2.c(str);
        this.f = xp2Var;
        this.f5063b = r4;
        this.f5064c = r5;
        this.o = r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Socket socket) {
        this.p.add(socket);
    }

    private static long f(HttpURLConnection httpURLConnection) throws NumberFormatException {
        long j;
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (TextUtils.isEmpty(headerField)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(headerField).length() + 28);
                sb.append("Unexpected Content-Length [");
                sb.append(headerField);
                sb.append("]");
                tr.g(sb.toString());
            }
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField2)) {
            return j;
        }
        Matcher matcher = q.matcher(headerField2);
        if (!matcher.find()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(headerField).length() + 26 + String.valueOf(headerField2).length());
            sb2.append("Inconsistent headers [");
            sb2.append(headerField);
            sb2.append("] [");
            sb2.append(headerField2);
            sb2.append("]");
            tr.i(sb2.toString());
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(headerField2).length() + 27);
            sb3.append("Unexpected Content-Range [");
            sb3.append(headerField2);
            sb3.append("]");
            tr.g(sb3.toString());
            return j;
        }
    }

    private final void g() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                tr.c("Unexpected error while disconnecting", e);
            }
            this.h = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:?, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012b, code lost:
    
        r23.h = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012d, code lost:
    
        r0 = r14.getResponseCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0133, code lost:
    
        if (r0 < 200) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0137, code lost:
    
        if (r0 <= 299) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
    
        if (r0 != 200) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013c, code lost:
    
        r3 = r24.d;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0142, code lost:
    
        if (r3 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0144, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0146, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0148, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0149, code lost:
    
        r23.k = r4;
        r0 = r24.a(1);
        r3 = r24.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0152, code lost:
    
        if (r0 != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0158, code lost:
    
        if (r3 == (-1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015b, code lost:
    
        r3 = f(r23.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0163, code lost:
    
        if (r3 == (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0165, code lost:
    
        r4 = r3 - r23.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016a, code lost:
    
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016b, code lost:
    
        r23.l = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016e, code lost:
    
        r23.l = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0170, code lost:
    
        r23.i = r23.h.getInputStream();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0178, code lost:
    
        r23.j = true;
        r0 = r23.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017d, code lost:
    
        if (r0 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017f, code lost:
    
        r0.k(r23, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0184, code lost:
    
        return r23.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0185, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0186, code lost:
    
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018f, code lost:
    
        throw new com.google.android.gms.internal.ads.op2(r0, r24, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0190, code lost:
    
        r3 = r23.h.getHeaderFields();
        g();
        r4 = new com.google.android.gms.internal.ads.np2(r0, r3, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a0, code lost:
    
        if (r0 != 416) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a2, code lost:
    
        r4.initCause(new com.google.android.gms.internal.ads.kp2(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ab, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ad, code lost:
    
        g();
        r5 = java.lang.String.valueOf(r24.f4007a.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c1, code lost:
    
        if (r5.length() != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c3, code lost:
    
        r3 = "Unable to connect to ".concat(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c8, code lost:
    
        r3 = new java.lang.String("Unable to connect to ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d2, code lost:
    
        throw new com.google.android.gms.internal.ads.op2(r3, r0, r24, 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108 A[Catch: IOException -> 0x0241, TryCatch #1 {IOException -> 0x0241, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:24:0x00d0, B:26:0x00d9, B:27:0x00e0, B:31:0x00e9, B:33:0x00ee, B:35:0x00f6, B:37:0x010b, B:51:0x012b, B:96:0x01d7, B:98:0x01e2, B:100:0x01f3, B:102:0x01fb, B:104:0x0209, B:106:0x0213, B:107:0x0216, B:105:0x020e, B:109:0x0220, B:110:0x0227, B:36:0x0108, B:19:0x0085, B:21:0x00a1, B:23:0x00cb, B:111:0x0228, B:112:0x0240), top: B:122:0x000f }] */
    @Override // com.google.android.gms.internal.ads.ip2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.google.android.gms.internal.ads.jp2 r24) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qu.a(com.google.android.gms.internal.ads.jp2):long");
    }

    final void b(int r3) throws SocketException {
        this.o = r3;
        for (Socket socket : this.p) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.o);
                } catch (SocketException e) {
                    tr.d("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[Catch: Exception -> 0x006b, all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x0010, B:9:0x0018, B:11:0x001e, B:26:0x006b, B:29:0x0072, B:30:0x007a, B:14:0x0024, B:16:0x002c, B:21:0x003a, B:23:0x004a, B:25:0x0052, B:8:0x0013), top: B:47:0x0002, inners: #2 }] */
    @Override // com.google.android.gms.internal.ads.ip2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws com.google.android.gms.internal.ads.op2 {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.i     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L7b
            java.net.HttpURLConnection r2 = r9.h     // Catch: java.lang.Throwable -> L93
            long r3 = r9.l     // Catch: java.lang.Throwable -> L93
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L13
            long r3 = r9.l     // Catch: java.lang.Throwable -> L93
            goto L18
        L13:
            long r3 = r9.l     // Catch: java.lang.Throwable -> L93
            long r7 = r9.n     // Catch: java.lang.Throwable -> L93
            long r3 = r3 - r7
        L18:
            int r7 = com.google.android.gms.internal.ads.nq2.f4592a     // Catch: java.lang.Throwable -> L93
            r8 = 19
            if (r7 == r8) goto L24
            int r7 = com.google.android.gms.internal.ads.nq2.f4592a     // Catch: java.lang.Throwable -> L93
            r8 = 20
            if (r7 != r8) goto L6b
        L24:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L34
            int r3 = r2.read()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            r4 = -1
            if (r3 != r4) goto L3a
            goto L6b
        L34:
            r5 = 2048(0x800, double:1.012E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L6b
        L3a:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            if (r4 != 0) goto L52
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            if (r3 == 0) goto L6b
        L52:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
        L6b:
            java.io.InputStream r2 = r9.i     // Catch: java.io.IOException -> L71 java.lang.Throwable -> L93
            r2.close()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> L93
            goto L7b
        L71:
            r2 = move-exception
            com.google.android.gms.internal.ads.op2 r3 = new com.google.android.gms.internal.ads.op2     // Catch: java.lang.Throwable -> L93
            com.google.android.gms.internal.ads.jp2 r4 = r9.g     // Catch: java.lang.Throwable -> L93
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L93
            throw r3     // Catch: java.lang.Throwable -> L93
        L7b:
            r9.i = r0
            r9.g()
            boolean r0 = r9.j
            if (r0 == 0) goto L8d
            r9.j = r1
            com.google.android.gms.internal.ads.xp2<? super com.google.android.gms.internal.ads.qu> r0 = r9.f
            if (r0 == 0) goto L8d
            r0.d(r9)
        L8d:
            java.util.Set<java.net.Socket> r0 = r9.p
            r0.clear()
            return
        L93:
            r2 = move-exception
            r9.i = r0
            r9.g()
            boolean r0 = r9.j
            if (r0 == 0) goto La6
            r9.j = r1
            com.google.android.gms.internal.ads.xp2<? super com.google.android.gms.internal.ads.qu> r0 = r9.f
            if (r0 == 0) goto La6
            r0.d(r9)
        La6:
            java.util.Set<java.net.Socket> r0 = r9.p
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qu.close():void");
    }

    @Override // com.google.android.gms.internal.ads.ip2
    public final int read(byte[] bArr, int r10, int r11) throws IOException {
        try {
            if (this.m != this.k) {
                byte[] andSet = r.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (this.m != this.k) {
                    int r1 = this.i.read(andSet, 0, (int) Math.min(this.k - this.m, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (r1 == -1) {
                        throw new EOFException();
                    }
                    this.m += r1;
                    if (this.f != null) {
                        this.f.f(this, r1);
                    }
                }
                r.set(andSet);
            }
            if (r11 == 0) {
                return 0;
            }
            if (this.l != -1) {
                long j = this.l - this.n;
                if (j == 0) {
                    return -1;
                }
                r11 = (int) Math.min(r11, j);
            }
            int r9 = this.i.read(bArr, r10, r11);
            if (r9 == -1) {
                if (this.l == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.n += r9;
            if (this.f != null) {
                this.f.f(this, r9);
            }
            return r9;
        } catch (IOException e) {
            throw new op2(e, this.g, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ip2
    public final Uri s1() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }
}
