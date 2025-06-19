package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public final class fp2 implements ip2 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f3433a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f3434b;

    /* renamed from: c, reason: collision with root package name */
    private int f3435c;
    private int d;

    public fp2(byte[] bArr) {
        vp2.d(bArr);
        vp2.a(bArr.length > 0);
        this.f3433a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.ip2
    public final long a(jp2 jp2Var) throws IOException {
        this.f3434b = jp2Var.f4007a;
        long j = jp2Var.d;
        this.f3435c = (int) j;
        long length = jp2Var.e;
        if (length == -1) {
            length = this.f3433a.length - j;
        }
        int r0 = (int) length;
        this.d = r0;
        if (r0 > 0 && this.f3435c + r0 <= this.f3433a.length) {
            return r0;
        }
        int r1 = this.f3435c;
        long j2 = jp2Var.e;
        int length2 = this.f3433a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(r1);
        sb.append(", ");
        sb.append(j2);
        sb.append("], length: ");
        sb.append(length2);
        throw new IOException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.ip2
    public final void close() throws IOException {
        this.f3434b = null;
    }

    @Override // com.google.android.gms.internal.ads.ip2
    public final int read(byte[] bArr, int r4, int r5) throws IOException {
        if (r5 == 0) {
            return 0;
        }
        int r0 = this.d;
        if (r0 == 0) {
            return -1;
        }
        int r52 = Math.min(r5, r0);
        System.arraycopy(this.f3433a, this.f3435c, bArr, r4, r52);
        this.f3435c += r52;
        this.d -= r52;
        return r52;
    }

    @Override // com.google.android.gms.internal.ads.ip2
    public final Uri s1() {
        return this.f3434b;
    }
}
