package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class o92 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f4659a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f4660b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f4661c;
    private static final ByteBuffer d;
    private static final m82 e;

    static {
        byte[] bArr = new byte[0];
        f4661c = bArr;
        d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f4661c;
        e = m82.d(bArr2, 0, bArr2.length, false);
    }

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int r2 = c(length, bArr, 0, length);
        if (r2 == 0) {
            return 1;
        }
        return r2;
    }

    static int c(int r2, byte[] bArr, int r4, int r5) {
        for (int r0 = r4; r0 < r4 + r5; r0++) {
            r2 = (r2 * 31) + bArr[r0];
        }
        return r2;
    }

    static <T> T d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int e(boolean z) {
        return z ? 1231 : 1237;
    }

    static Object f(Object obj, Object obj2) {
        return ((xa2) obj).c().V((xa2) obj2).E();
    }

    public static int g(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static boolean h(xa2 xa2Var) {
        if (!(xa2Var instanceof s72)) {
            return false;
        }
        return false;
    }

    public static boolean i(byte[] bArr) {
        return wc2.n(bArr);
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f4659a);
    }
}
