package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
final class iv implements ip2 {

    /* renamed from: a, reason: collision with root package name */
    private final ip2 f3871a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3872b;

    /* renamed from: c, reason: collision with root package name */
    private final ip2 f3873c;
    private long d;
    private Uri e;

    iv(ip2 ip2Var, int r2, ip2 ip2Var2) {
        this.f3871a = ip2Var;
        this.f3872b = r2;
        this.f3873c = ip2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ip2
    public final long a(jp2 jp2Var) throws IOException {
        jp2 jp2Var2;
        this.e = jp2Var.f4007a;
        long j = jp2Var.d;
        long j2 = this.f3872b;
        jp2 jp2Var3 = null;
        if (j >= j2) {
            jp2Var2 = null;
        } else {
            long j3 = jp2Var.e;
            long jMin = j2 - j;
            if (j3 != -1) {
                jMin = Math.min(j3, jMin);
            }
            jp2Var2 = new jp2(jp2Var.f4007a, j, jMin, null);
        }
        long j4 = jp2Var.e;
        if (j4 == -1 || jp2Var.d + j4 > this.f3872b) {
            long jMax = Math.max(this.f3872b, jp2Var.d);
            long j5 = jp2Var.e;
            jp2Var3 = new jp2(jp2Var.f4007a, jMax, j5 != -1 ? Math.min(j5, (jp2Var.d + j5) - this.f3872b) : -1L, null);
        }
        long jA = jp2Var2 != null ? this.f3871a.a(jp2Var2) : 0L;
        long jA2 = jp2Var3 != null ? this.f3873c.a(jp2Var3) : 0L;
        this.d = jp2Var.d;
        if (jA == -1 || jA2 == -1) {
            return -1L;
        }
        return jA + jA2;
    }

    @Override // com.google.android.gms.internal.ads.ip2
    public final void close() throws IOException {
        this.f3871a.close();
        this.f3873c.close();
    }

    @Override // com.google.android.gms.internal.ads.ip2
    public final int read(byte[] bArr, int r8, int r9) throws IOException {
        int r0;
        long j = this.d;
        long j2 = this.f3872b;
        if (j < j2) {
            r0 = this.f3871a.read(bArr, r8, (int) Math.min(r9, j2 - j));
            this.d += r0;
        } else {
            r0 = 0;
        }
        if (this.d < this.f3872b) {
            return r0;
        }
        int r7 = this.f3873c.read(bArr, r8 + r0, r9 - r0);
        int r02 = r0 + r7;
        this.d += r7;
        return r02;
    }

    @Override // com.google.android.gms.internal.ads.ip2
    public final Uri s1() {
        return this.e;
    }
}
