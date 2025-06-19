package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class p60 {
    public static int a(byte b2) {
        return b2 < 0 ? b2 + 256 : b2;
    }

    public static long b(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static int c(ByteBuffer byteBuffer) {
        return (a(byteBuffer.get()) << 8) + 0 + a(byteBuffer.get());
    }

    public static long d(ByteBuffer byteBuffer) {
        long jB = (b(byteBuffer) << 32) + 0;
        if (jB >= 0) {
            return jB + b(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static double e(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return ((((0 | ((r0[0] << 24) & b.i.p.f0.t)) | ((r0[1] << 16) & 16711680)) | ((r0[2] << 8) & b.i.p.p.f)) | (r0[3] & 255)) / 65536.0d;
    }

    public static double f(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return ((((0 | ((r0[0] << 24) & b.i.p.f0.t)) | ((r0[1] << 16) & 16711680)) | ((r0[2] << 8) & b.i.p.p.f)) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static String g(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
