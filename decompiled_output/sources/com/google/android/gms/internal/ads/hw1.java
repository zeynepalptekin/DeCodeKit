package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes.dex */
public final class hw1 {

    /* renamed from: a, reason: collision with root package name */
    private static final OutputStream f3727a = new kw1();

    public static byte[] a(InputStream inputStream) throws IOException {
        bv1.b(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int r2 = 8192;
        int r3 = 0;
        while (r3 < 2147483639) {
            int r5 = Math.min(r2, 2147483639 - r3);
            byte[] bArr = new byte[r5];
            arrayDeque.add(bArr);
            int r7 = 0;
            while (r7 < r5) {
                int r8 = inputStream.read(bArr, r7, r5 - r7);
                if (r8 == -1) {
                    return b(arrayDeque, r3);
                }
                r7 += r8;
                r3 += r8;
            }
            r2 = mw1.a(r2, 2);
        }
        if (inputStream.read() == -1) {
            return b(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] b(Deque<byte[]> deque, int r7) {
        byte[] bArr = new byte[r7];
        int r1 = r7;
        while (r1 > 0) {
            byte[] bArrRemoveFirst = deque.removeFirst();
            int r3 = Math.min(r1, bArrRemoveFirst.length);
            System.arraycopy(bArrRemoveFirst, 0, bArr, r7 - r1, r3);
            r1 -= r3;
        }
        return bArr;
    }
}
