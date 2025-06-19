package c.a.b.b.g.c;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class l7 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f1762a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f1763b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f1764c;
    private static final ByteBuffer d;
    private static final l6 e;

    static {
        byte[] bArr = new byte[0];
        f1764c = bArr;
        d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f1764c;
        e = l6.c(bArr2, 0, bArr2.length, false);
    }

    static int a(int r2, byte[] bArr, int r4, int r5) {
        for (int r0 = r4; r0 < r4 + r5; r0++) {
            r2 = (r2 * 31) + bArr[r0];
        }
        return r2;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    static <T> T d(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    static Object e(Object obj, Object obj2) {
        return ((r8) obj).c().y((r8) obj2).i();
    }

    static <T> T f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static boolean g(r8 r8Var) {
        if (!(r8Var instanceof q5)) {
            return false;
        }
        return false;
    }

    public static boolean h(byte[] bArr) {
        return ma.f(bArr);
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f1762a);
    }

    public static int j(byte[] bArr) {
        int length = bArr.length;
        int r2 = a(length, bArr, 0, length);
        if (r2 == 0) {
            return 1;
        }
        return r2;
    }
}
