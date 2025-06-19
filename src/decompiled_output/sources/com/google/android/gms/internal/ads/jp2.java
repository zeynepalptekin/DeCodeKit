package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jp2 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f4007a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4008b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4009c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public jp2(Uri uri) {
        this(uri, 0);
    }

    private jp2(Uri uri, int r10) {
        this(uri, 0L, -1L, null, 0);
    }

    private jp2(Uri uri, long j, long j2, long j3, String str, int r20) {
        this(uri, null, j, j2, j3, str, r20);
    }

    public jp2(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    private jp2(Uri uri, long j, long j2, String str, int r17) {
        this(uri, 0L, 0L, -1L, null, 0);
    }

    public jp2(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int r15) {
        boolean z = true;
        vp2.a(j >= 0);
        vp2.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        vp2.a(z);
        this.f4007a = uri;
        this.f4008b = bArr;
        this.f4009c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.g = r15;
    }

    public final boolean a(int r2) {
        return (this.g & 1) == 1;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f4007a);
        String string = Arrays.toString(this.f4008b);
        long j = this.f4009c;
        long j2 = this.d;
        long j3 = this.e;
        String str = this.f;
        int r9 = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 93 + String.valueOf(string).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(string);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(r9);
        sb.append("]");
        return sb.toString();
    }
}
