package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class pi2 {
    static Pair<ByteBuffer, Long> a(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> pairB = b(randomAccessFile, 0);
        return pairB != null ? pairB : b(randomAccessFile, b.i.g.b.a.f1046a);
    }

    private static Pair<ByteBuffer, Long> b(RandomAccessFile randomAccessFile, int r11) throws IOException {
        int r7;
        if (r11 < 0 || r11 > 65535) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("maxCommentSize: ");
            sb.append(r11);
            throw new IllegalArgumentException(sb.toString());
        }
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(r11, length - 22)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        g(byteBufferAllocate);
        int r10 = byteBufferAllocate.capacity();
        if (r10 >= 22) {
            int r102 = r10 - 22;
            int r4 = Math.min(r102, b.i.g.b.a.f1046a);
            for (int r6 = 0; r6 < r4; r6++) {
                r7 = r102 - r6;
                if (byteBufferAllocate.getInt(r7) == 101010256 && (byteBufferAllocate.getShort(r7 + 20) & 65535) == r6) {
                    break;
                }
            }
            r7 = -1;
        } else {
            r7 = -1;
        }
        if (r7 == -1) {
            return null;
        }
        byteBufferAllocate.position(r7);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + r7));
    }

    public static void c(ByteBuffer byteBuffer, long j) {
        g(byteBuffer);
        int r0 = byteBuffer.position() + 16;
        if (j >= 0 && j <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + r0, (int) j);
            return;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("uint32 value of out range: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    private static long d(ByteBuffer byteBuffer, int r3) {
        return byteBuffer.getInt(r3) & 4294967295L;
    }

    public static long e(ByteBuffer byteBuffer) {
        g(byteBuffer);
        return d(byteBuffer, byteBuffer.position() + 16);
    }

    public static long f(ByteBuffer byteBuffer) {
        g(byteBuffer);
        return d(byteBuffer, byteBuffer.position() + 12);
    }

    private static void g(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
