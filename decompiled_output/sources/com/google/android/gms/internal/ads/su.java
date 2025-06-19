package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class su implements ip2 {

    /* renamed from: a, reason: collision with root package name */
    private InputStream f5305a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5306b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f5307c;
    private final ip2 d;

    @androidx.annotation.i0
    private final xp2<ip2> e;
    private final vu f;
    private Uri g;

    public su(Context context, ip2 ip2Var, xp2<ip2> xp2Var, vu vuVar) {
        this.f5307c = context;
        this.d = ip2Var;
        this.e = xp2Var;
        this.f = vuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    @Override // com.google.android.gms.internal.ads.ip2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.google.android.gms.internal.ads.jp2 r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.su.a(com.google.android.gms.internal.ads.jp2):long");
    }

    @Override // com.google.android.gms.internal.ads.ip2
    public final void close() throws IOException {
        if (!this.f5306b) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f5306b = false;
        this.g = null;
        InputStream inputStream = this.f5305a;
        if (inputStream != null) {
            com.google.android.gms.common.util.q.b(inputStream);
            this.f5305a = null;
        } else {
            this.d.close();
        }
        xp2<ip2> xp2Var = this.e;
        if (xp2Var != null) {
            xp2Var.d(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.ip2
    public final int read(byte[] bArr, int r3, int r4) throws IOException {
        if (!this.f5306b) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f5305a;
        int r2 = inputStream != null ? inputStream.read(bArr, r3, r4) : this.d.read(bArr, r3, r4);
        xp2<ip2> xp2Var = this.e;
        if (xp2Var != null) {
            xp2Var.f(this, r2);
        }
        return r2;
    }

    @Override // com.google.android.gms.internal.ads.ip2
    public final Uri s1() {
        return this.g;
    }
}
